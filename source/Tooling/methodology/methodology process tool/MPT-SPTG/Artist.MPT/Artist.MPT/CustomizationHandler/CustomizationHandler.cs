/*
 * The MIT License (MIT)
 * Copyright (c) 2014 Spikes N.V.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 * */

using System;
using System.Security.Permissions;
using Microsoft.SharePoint;
using Microsoft.SharePoint.Utilities;
using Microsoft.SharePoint.Workflow;
using System.Net;
using System.Net.Http;
using System.IO;
using System.Text;
using System.Xml;

namespace Artist.MPT.CustomizationHandler
{
    /// <summary>
    /// List Item Events
    /// </summary>
    public class CustomizationHandler : SPItemEventReceiver
    {
        /// <summary>
        /// An item is being updated.
        /// </summary>
        public override void ItemUpdating(SPItemEventProperties properties)
        {
            base.ItemUpdating(properties);

            var item = properties.ListItem;

            String beforeMigrationType = item.Fields["Migration Type"].GetFieldValueAsText(item["MigrationType"]);

            if (beforeMigrationType == "None")
            {
                String afterMigrationType = (String)properties.AfterProperties["MigrationType"];

                if (afterMigrationType == "Custom")
                {
                    string customMigration = RetrieveCustomizedWorkflowLocal(item);
                    SPWorkflowAssociation wfAssoc = item.ParentList.WorkflowAssociations.GetAssociationByName(customMigration, System.Globalization.CultureInfo.CurrentCulture);
                    //var WF = item.Workflows.Cast<SPWorkflow>().Where(X => X.ParentAssociation.Name == "Artist Default"); //My wf name
                    //if (WF.Any()) //if there is remove
                    //{
                    //    listItem.Web.Site.WorkflowManager.RemoveWorkflowFromListItem(WF.First());
                    //} //start
                    item.Web.Site.WorkflowManager.StartWorkflow(item, wfAssoc, wfAssoc.AssociationData, true);
                }
                else if (afterMigrationType == "Default")
                {
                    SPWorkflowAssociation wfAssoc = item.ParentList.WorkflowAssociations.GetAssociationByName("DefaultMigrationWorkflow", System.Globalization.CultureInfo.CurrentCulture);
                    if (wfAssoc != null)
                    {
                        item.Web.Site.WorkflowManager.StartWorkflow(item, wfAssoc, wfAssoc.AssociationData, true);
                    }
                }
                else
                {

                }
            }
        }

        private static string RetrieveCustomizedWorkflowFromService(SPListItem item)
        {
            string customizedMigration = string.Empty;

            SPFolder folder = item.Web.Folders["Lists"].SubFolders[item.ParentList.Title].SubFolders["Attachments"].SubFolders[item.ID.ToString()];
            SPFile spFile = folder.Files[item.Attachments[0]];
            Stream streamFile = spFile.OpenBinaryStream();
            StreamReader reader = new StreamReader(streamFile);
            string data = reader.ReadToEnd();

            var content = new StringContent(data, Encoding.UTF8, "text/xml");
            var client = new HttpClient();

            string serviceUri = "http://spdev:8080/router/api/router";
            var routingResponse = client.PostAsync(serviceUri, content).Result;

            string routingResult = routingResponse.Content.ReadAsStringAsync().Result;

            XmlDocument doc = new XmlDocument();
            doc.LoadXml(routingResult);
            customizedMigration = doc.DocumentElement.InnerText;

            return customizedMigration;
        }

        private static string RetrieveCustomizedWorkflowLocal(SPListItem item)
        {
            string customizedMigration = string.Empty;

            SPFolder folder = item.Web.Folders["Lists"].SubFolders[item.ParentList.Title].SubFolders["Attachments"].SubFolders[item.ID.ToString()];
            SPFile spFile = folder.Files[item.Attachments[0]];
            Stream streamFile = spFile.OpenBinaryStream();
            StreamReader reader = new StreamReader(streamFile);
            string data = reader.ReadToEnd();

            XmlDocument doc = new XmlDocument();
            doc.LoadXml(data);
            customizedMigration = doc.SelectSingleNode("ArtistMethodology/Template").InnerText;
            return customizedMigration;
        }

        /// <summary>
        /// An item was updated.
        /// </summary>
        public override void ItemUpdated(SPItemEventProperties properties)
        {
            base.ItemUpdated(properties);
        }
    }
}
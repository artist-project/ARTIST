// Copyright (C) 2014 Spikes NV. All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, is not permitted without specific prior written permission.

// Neither the name of Spikes NV nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//

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
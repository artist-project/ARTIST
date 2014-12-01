using System;
using LL.EAAddin.IntegrationArchitect.Foundation;
using LL.EAAddin.IntegrationArchitect.Foundation.Menu;
using LL.UserInfo;
using LL.EAAddin.IntegrationArchitect.Host.Artist;
using LL.EAAddin.IntegrationArchitect.Host.Artist.Properties;

namespace LL.EAAddin.IntegrationArchitect.Plugin.Artist
{
    /// <summary>
    /// AboutBox for the IntegrationArchitect Host
    /// </summary>
    class AboutPluginHost : IntegrationArchitectPluginBase, IIntegrationArchitectPlugin
    {

        /// <summary>
        /// Initializes a new instance of the <see cref="AboutPluginHost"/> class.
        /// </summary>
        public AboutPluginHost()
        {
        }

        #region IIntegrationArchitectPlugin Members

        /// <summary>
        /// Initializes the plugin.
        /// (to hook some events from the pluginhost)
        /// </summary>
        public void PluginInit()
        {
            this.MenuItem = new EAMenuItem(this.IAHost, "About", MenuLocation.Everywhere);
            this.MenuItem.Click += MenuItem_Click;
        }


        void MenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                (new AboutBox(this.Host.AvailablePlugins)).ShowDialog();
            }
            catch (Exception ex)
            {
                Messages.ErrorMemo(ex);
            }
            LL.UserInfo.ProgressInfo.Close();
        }

        #endregion



        #region IPlugin Member

        ///<summary>
        ///Gets the function group description.
        ///</summary>
        ///<value>The function group description.</value>
        public String FunctionGroupDescription
        {
            get { return Resources.PlugFNCGroupDescription; }
        }

        /// <summary>
        /// Gets the function group GUID.
        /// </summary>
        /// <value>The function group GUID.</value>
        public String FunctionGroupGUID
        {
            get { return Resources.PluginFunctionGroupID; }
        }


        /// <summary>
        /// Gets the GUID.
        /// </summary>
        /// <value>The GUID.</value>
        public string GUID
        {
            get { return Resources.PlugGuid; }
        }

        /// <summary>
        /// Gets the plugin license key.
        /// </summary>
        /// <value>The plugin license key.</value>
        public string PluginLicenseKey
        {
            get { return Resources.PlugHostLicense; }
        }

        /// <summary>
        /// Gets the needed host GUID.
        /// </summary>
        /// <value>The needed host GUID.</value>
        public string NeededHostGUID
        {
            get { return Resources.PlugHostGuid; }
        }


        #endregion
    }
}

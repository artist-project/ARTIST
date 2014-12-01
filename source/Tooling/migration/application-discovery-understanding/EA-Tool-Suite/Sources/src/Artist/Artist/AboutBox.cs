using System;
using System.Runtime.CompilerServices;
using System.Windows.Forms;
using System.Reflection;

using LL.EAAddin.IntegrationArchitect.Host.Artist.Properties;
using LL.Plugin.PluginInterface;

namespace LL.EAAddin.IntegrationArchitect.Host.Artist
{
    /// <summary>
    /// Shows the information for the plugin host and can be used as Menuitem
    /// </summary>
    partial class AboutBox : Form
    {
        AvailableBasePlugins baseplugins;
        static LL.Sys.AssemblyInfo assInfo = new LL.Sys.AssemblyInfo(Assembly.GetExecutingAssembly());

        /// <summary>
        /// Gets or sets the assembly info.
        /// </summary>
        /// <value>The assembly info.</value>
        public static LL.Sys.AssemblyInfo AssemblyInfo
        {
            get { return assInfo; }
            set { assInfo = value; }
        }

        public AboutBox(AvailableBasePlugins baseplugins)
        {
            this.baseplugins = baseplugins;
            InitializeComponent();

            //  Initialize the AboutBox to display the product information from the assembly information.
            //  Change assembly information settings for your application through either:
            //  - Project->Properties->Application->Assembly Information
            //  - AssemblyInfo.cs

            this.Text = String.Format("About {0}", assInfo.Title);
            this.labelProductName.Text = Resources.AboutBox_ProductName;
            this.labelVersion.Text = String.Format("Version {0}", assInfo.Version);
            this.labelCopyright.Text = "";
            this.labelCompanyName.Text = Resources.AboutBox_CompanyName;
            this.textBoxDescription.Text = Resources.AboutBox_Description;
        }

        #region Private Functions

        /// <summary>
        /// Handles the Load event of the AboutRizoSuite control.
        /// Lists all loaded plugins.
        /// </summary>
        /// <param name="sender">The source of the event.</param>
        /// <param name="e">The <see cref="System.EventArgs"/> instance containing the event data.</param>
        private void AboutBox_Load(object sender, EventArgs e)
        {
            lbFunctions.Items.Clear();
            LL.Sys.AssemblyInfo ai;
            foreach (AvailableBasePlugin baseplug in baseplugins)
            {
                ai = new LL.Sys.AssemblyInfo(baseplug.AssemblyInfo);
                if ((!lbFunctions.Items.Contains(ai.Title)) && (!ai.Title.Equals(assInfo.Title)))
                    lbFunctions.Items.Add(ai.Title);
            }
        }

        #endregion
    }
}

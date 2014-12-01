namespace Validation
{
    using System;

    using EA;

    using LL.EAAddin.IntegrationArchitect.Foundation;
    using LL.MDE.Components.ModelValidation.Plugin;

    using Validation.Properties;

    public class ValidationPlugin : IntegrationArchitectPluginBase, IIntegrationArchitectPlugin
    {
        public void PluginInit()
        {
            ModelValidationIntegrator integrator = new ModelValidationIntegrator(this);
            ModelValidationIntegrator.ResultViewImage = Resources.artist_logo;
            ModelValidationIntegrator.OutputWindowName = "Artist Validierung";
            Repository = this.IAHost.Repository;
            integrator.Initialize();
        }

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
            get { return Resources.PlugLicense; }
        }

        /// <summary>
        /// Gets the needed host GUID.
        /// </summary>
        /// <value>The needed host GUID.</value>
        public string NeededHostGUID
        {
            get { return Resources.PlugHostGuid; }
        }

        public static Repository Repository { get; private set; }

        #endregion
    }
}

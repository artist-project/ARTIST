using System.Reflection;
using LL.EAAddin.IntegratorInterface;
using LL.EAAddin.IntegrationArchitect.Foundation;
using LL.EAAddin.IntegrationArchitect.Plugin.Artist;
using LL.EAAddin.IntegrationArchitect.Host.Artist.Properties;

namespace LL.EAAddin.IntegrationArchitect.Host.Artist
{
    // TODO: 1. - add a lib folder to the solution root which contains the following dll's 
    //				1. EAFoundation.dll
    //				2. IntegrationAchitect.dll
    //				3. IntegrationARchitectFoundation.dll
    //				4. IntegratorInterface.dll
    //				5. Interop.EA.dll	
    //				6. LL.Plugin.dll
    //				7. LL.System.dll
    //				8. LL.UserInfo.dll
    //				solution root = (in the folder where you find the solutionfile)

    // TODO: 2. - set Project Properties --> Debug --> Start Action --> Start external Programm: to the EA.EXE 
    //(defaultpath: C:\program files\Sparx Systems\EA\EA.exe)

    // TODO: 3. - set registry entry for the EA Addin by executing Project Item --> Registry/RegisterHost.reg


    /// <summary>
    /// The Addin to connect the IntegrationArchitectHost to the EA Repository.
    /// </summary>
    public class Addin : EAIntegrator
    {

        private IIntegrationArchitectPluginHost pluginHost;

        /// <summary>
        /// Initializes a new instance of the <see cref="Addin"/> class.
        /// </summary>
        public Addin()
        {

            pluginHost = new IntegrationArchitectPluginHost(Resources.PluginFunctionGroupID, Resources.MenuName);
            this.EventProvider = pluginHost; // <-- Needet to register the plugin to receive the Enterprise Architect Events
            pluginHost.Connect += PluginHost_Connect;
            pluginHost.FileOpen += pluginHost_FileOpen;
        }

        void pluginHost_FileOpen(object sender, RepositoryEventArgs e)
        {
            EaLogAppender.InitializeEaLogging(e.Repository);
        }

        /// <summary>
        /// Handles the Addin Connect event of the PluginHost control.
        /// </summary>
        /// <param name="sender">The source of the event.</param>
        /// <param name="e">The instance containing the event data.</param>
        /// <returns>an optional xml containing a MDG Technology via e.ReturnString</returns>
        void PluginHost_Connect(object sender, RepositoryEventArgs e)
        {
            pluginHost.LoadPlugins();
            pluginHost.AddPlugin(new AboutPluginHost(), Assembly.GetExecutingAssembly());

        }
    }
}

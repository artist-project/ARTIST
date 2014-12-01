using System;
using System.ComponentModel;
using EA;
using Eneter.Messaging.EndPoints.TypedMessages;
using Eneter.Messaging.MessagingSystems.MessagingSystemBase;
using LL.EAAddin.IntegrationArchitect.Foundation;
using LL.EAAddin.IntegrationArchitect.Foundation.Menu;
using LL.EAAddin.IntegrationArchitect.Plugin.Uml2EmfExporter.Properties;
using System.Threading;
using LL.MDE.DataAccess.AnyModel2Uml.EnAr;
using LL.MDE.DataAccess.AnyModel2Uml.EnAr.Com2Uml.Factory;
using LL.MDE.Services.DataProvider.AnyModel2Uml;


namespace LL.EAAddin.IntegrationArchitect.Plugin.Uml2EmfExporter
{
  /// <summary>
	/// IntegrationArchitect Plugin Uml2EmfExporter 
	/// !!Warning!! IAHost and Repository are filled when PluginInit is called (not bevore)
	/// </summary>
	public class Uml2EmfExporterPlugin : IntegrationArchitectPluginBase, IIntegrationArchitectPlugin
	{
		private Loading loadingForm = new Loading();
		private AnyModel2UmlService aService;
		private bool cancel = false;

		/// <summary>
		/// Initializes a new instance of the <see cref="Uml2EmfExporterPlugin"/> class.
		///	!!Warning!! IAHost and Repository are filled when PluginInit is called (not bevore)
		/// </summary>
		public Uml2EmfExporterPlugin()
		{

		}


		#region IIntegrationArchitectPlugin Members

		// TODO: SUBMenu entry
		//private EAMenuItem subItem;

		/// <summary>
		/// Initializes the plugin.
		/// (to hook some events from the pluginhost)
		/// </summary>
		public void PluginInit()
		{
			loadingForm.Closing += loadingForm_Closing;
			
			// TODO: To get a Menu entry for this Addin uncomment the code below 
			this.MenuItem = new EAMenuItem(this.IAHost, Resources.MenuName, MenuLocation.Treeview);
			this.MenuItem.GetMenuState += MenuItemOnGetMenuState;
			this.MenuItem.Click += MenuItemOnClick;

			// TODO: To get a SUBMenu entry for this Addin uncomment the code below 
			//EAMenuItem subItem = new EAMenuItem(this.MenuItem, "SubItem", MenuLocation.Everywhere);
			//this.MenuItem.SubItems.Add(subItem);

			 // in Click-Event always use
			try
			{
				//... your Code here
			} catch (Exception ex)
			{
				LL.UserInfo.Messages.ErrorMemo(ex);
			}			
			
		}

		void loadingForm_Closing(object sender, EventArgs e)
		{
			cancel = true;
		}



		private void MenuItemOnClick(object sender, EventArgs eventArgs)
		{
			try
			{
				cancel = false;
				//this.selectedPackage = this.IAHost.Repository.GetTreeSelectedPackage();
				loadingForm.Show();
				Thread t = new Thread(new ThreadStart(Bridge));
				t.Start();
			}
			catch (Exception ex)
			{
				LL.UserInfo.Messages.ErrorMemo(ex);
			}

		}


		private void Bridge()
		{
			try
			{

				aService = new AnyModel2UmlService()
				{
					UmlFactory = new ComUmlFactory(this.IAHost.Repository, "Uml2EMF")					
				};
				//aService.UmlFactory.CacheClear();
				aService.UmlFactory.ClearCachedUmlElements();
		

				loadingForm.UpdateInfo(Actions.Connecting, "Ready for bridge connection");
				aService.StartListening("tcp://127.0.0.1:8932/");				
				aService.MyReceiver.ResponseReceiverConnected += AServiceOnReceiverConnected;
				aService.MyReceiver.ResponseReceiverDisconnected += AServiceOnReceiverDisconnected;
				aService.MyReceiver.MessageReceived += AServiceOnMessageReceived;
				while (!cancel)
				{
					Thread.Sleep(500);
				}


				aService.StopListening();

			}
			catch (Exception ex)
			{
				LL.UserInfo.Messages.ErrorMemo(ex);
			}
		}

		private void AServiceOnMessageReceived(object sender, TypedRequestReceivedEventArgs<ElementQueryMessage> typedRequestReceivedEventArgs)
		{
			loadingForm.UpdateInfo(Actions.XMIExport, "Exporting Data for: "+ typedRequestReceivedEventArgs.RequestMessage.Guid);
		}

		private void AServiceOnReceiverDisconnected(object sender, ResponseReceiverEventArgs responseReceiverEventArgs)
		{
			cancel = true;
			loadingForm.Disconnected();
		}

		private void AServiceOnReceiverConnected(object sender, ResponseReceiverEventArgs responseReceiverEventArgs)
		{
			//aService.UmlFactory.ClearCachedUmlElements();
			loadingForm.UpdateInfo(Actions.DataTransfer, "Loading Data");
		}

		//private static void GetFactory(string path)
		//{
		//	AnyModel2UmlService aService1 = new AnyModel2UmlService()
		//	{
		//		UmlFactory = new XmiUmlFactory(path, null)
		//	};
		//	aService1.StartListening("tcp://127.0.0.1:8932/");
		//}

		/// <summary>
		/// Menus the state of the item on get menu.
		/// </summary>
		/// <param name="sender">The sender.</param>
		/// <param name="pluginMenuStateEventArgs">The <see cref="PluginMenuStateEventArgs"/> instance containing the event data.</param>
		private void MenuItemOnGetMenuState(object sender, PluginMenuStateEventArgs pluginMenuStateEventArgs)
		{
			pluginMenuStateEventArgs.State = MenuStates.None;
			var type = this.IAHost.Repository.GetTreeSelectedItemType();
			if (EA.ObjectType.otPackage.Equals(type))
			{
				pluginMenuStateEventArgs.State = MenuStates.Enabled;
			}
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


		#endregion

	}
}

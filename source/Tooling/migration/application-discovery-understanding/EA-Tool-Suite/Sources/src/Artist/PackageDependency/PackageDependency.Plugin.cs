using System;
using LL.EAAddin.IntegrationArchitect.Foundation;
using LL.EAAddin.IntegrationArchitect.Foundation.Menu;
using LL.UserInfo;
using LL.EAAddin.IntegrationArchitect.Plugin.PackageDependency.Properties;


namespace LL.EAAddin.IntegrationArchitect.Plugin.PackageDependency
{
	/// <summary>
	/// IntegrationArchitect Plugin PackageDependency 
	/// !!Warning!! IAHost and Repository are filled when PluginInit is called (not bevore)
	/// </summary>
	public class PackageDependencyPlugin : IntegrationArchitectPluginBase, IIntegrationArchitectPlugin
	{
		#region IIntegrationArchitectPlugin Members

		/// <summary>
		/// Initializes the plugin.
		/// (to hook some events from the pluginhost)
		/// </summary>
		public void PluginInit()
		{

			MenuItem = new EAMenuItem(IAHost, Resources.MenuName, MenuLocation.Treeview);
			MenuItem.ItemIndex = "0033";
			MenuItem.Click += MenuItemClick;

			EAMenuItem deleteItem = new EAMenuItem(IAHost, Resources.DeleteName, MenuLocation.Treeview);
			deleteItem.ItemIndex = "0044";
			deleteItem.Click += DeleteClick;

		}

		private void DeleteClick(object sender, EventArgs eventArgs)
		{
			CheckHostAndRepository();
			EA.Package package = IAHost.Repository.GetTreeSelectedPackage();
			DependencyChecker.DeleteDependenciesFromModel(IAHost.Repository, package);
		}

		private void MenuItemClick(object sender, EventArgs e)
		{
			try
			{
				CheckHostAndRepository();
				EA.Package package = IAHost.Repository.GetTreeSelectedPackage();
				if (!Equals(package, null))
				{
					//RSManipulation.Manipulation.GetAllElements(repository);
					ProgressInfo.Show(Resources.captionProgress, Resources.stateCheckStType);
					DependencyChecker.CheckPackageDependencies(IAHost.Repository, package);
					DependencyChecker.GenerateDiagram(IAHost.Repository, package);
					ProgressInfo.Close();
				}
				else
				{
					Messages.Message(Resources.msgNoPackageSelected, Resources.msgNoPackageSelectedCaption,
					                 System.Windows.Forms.MessageBoxButtons.OK, System.Windows.Forms.MessageBoxIcon.Information);
				}
			}
			catch (Exception ex)
			{
				ProgressInfo.Close();
				Messages.ErrorMemo(Resources.msgUnknownError, ex.Message);
			}
			ProgressInfo.Close();
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

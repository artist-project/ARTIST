using System;
using EA;
using LL.EAAddin.Foundation.Data.Sql;
using LL.EAAddin.Foundation.Types;
using LL.EAAddin.IntegrationArchitect.Foundation;
using LL.EAAddin.IntegrationArchitect.Foundation.Menu;
using System.Linq;
using System.Linq.Expressions;
using LL.EAAddin.IntegrationArchitect.Plugin.ResolveParents.Properties;
using System.Text.RegularExpressions;
using LL.EAAddin.Foundation.Data;


namespace LL.EAAddin.IntegrationArchitect.Plugin.ResolveParents
{

	/// <summary>
	/// IntegrationArchitect Plugin ResolveParents 
	/// !!Warning!! IAHost and Repository are filled when PluginInit is called (not bevore)
	/// </summary>
	public class ResolveParentsPlugin : IntegrationArchitectPluginBase, IIntegrationArchitectPlugin
	{
		private SqlUtility sqlUtility = null;
		private Regex parentRegex = new Regex(@"(?<=Parent=)[^;]*(?=;)");
		private Package root;
		/// <summary>
		/// Initializes a new instance of the <see cref="ResolveParentsPlugin"/> class.
		///	!!Warning!! IAHost and Repository are filled when PluginInit is called (not bevore)
		/// </summary>
		public ResolveParentsPlugin()
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
			// TODO: To get a Menu entry for this Addin uncomment the code below 
			this.MenuItem = new EAMenuItem(this.IAHost, Resources.MenuName, MenuLocation.Treeview);		
			this.MenuItem.GetMenuState += MenuItemOnGetMenuState;
			this.MenuItem.Click += MenuItemOnClick;

			// TODO: To get a SUBMenu entry for this Addin uncomment the code below 
			//EAMenuItem subItem = new EAMenuItem(this.MenuItem, "SubItem", MenuLocation.Everywhere);
			//this.MenuItem.SubItems.Add(subItem);

			/* // in Click-Event always use
			try
			{
				//... your Code here
			} catch (Exeption ex)
			{
				LL.UserInfo.Messages.ErrorMemo(ex);
			}			
			*/
		}

		/// <summary>
		/// Menus the state of the item on get menu.
		/// </summary>
		/// <param name="sender">The sender.</param>
		/// <param name="pluginMenuStateEventArgs">The <see cref="PluginMenuStateEventArgs"/> instance containing the event data.</param>
		private void MenuItemOnGetMenuState(object sender, PluginMenuStateEventArgs pluginMenuStateEventArgs)
		{
			pluginMenuStateEventArgs.State = MenuStates.None;

			var selectedType = this.IAHost.Repository.GetTreeSelectedItemType();
			if ((EA.ObjectType.otElement.Equals(selectedType)) || ((EA.ObjectType.otPackage.Equals(selectedType))))
			{
				pluginMenuStateEventArgs.State = MenuStates.Enabled;
			}
		}


		/// <summary>
		/// Checks the element parent.
		/// </summary>
		/// <param name="element">The element.</param>
		private void CheckElementParent(Element element)
		{
			Match match = parentRegex.Match(element.Genlinks);
			if (!string.IsNullOrEmpty(match.Value))
			{
				if (!object.Equals(element, null))
				{
					Element parentElement;
					string guid = sqlUtility.GetFieldValue(EATables.t_Object.ea_guid, EATables.t_Object.Name, match.Value);
					if (!string.IsNullOrEmpty(guid))
					{
						parentElement = this.IAHost.Repository.GetElementByGuid(guid);
					}
					else
					{
						parentElement = Manipulation.AddElement(root, match.Value, ElementTypes.Class);
					}
					CheckConnectors(element, parentElement);
				}
			}
		}

		/// <summary>
		/// Checks the connectors.
		/// </summary>
		/// <param name="element">The element.</param>
		/// <param name="parent">The parent.</param>
		private void CheckConnectors(Element element, Element parent)
		{
			if (!element.Connectors.Cast<Connector>()
			            .Any(
				            item =>
				            (item.SupplierID.Equals(parent.ElementID) &&
				            EnumTypeConverter.EqualsType(ConnectorTypes.Generalization, item.Type))))			
			{
				Connector connector = Manipulation.AddConnector(parent, element, ConnectorTypes.Generalization);
				if (!object.Equals(connector, null))
				{
					connector.Stereotype = "parent";
					connector.Update();
				}
			}
		}

		/// <summary>
		/// Checks the package.
		/// </summary>
		/// <param name="package">The package.</param>
		private void CheckPackage(Package package)
		{
			foreach (Package subPackage in package.Packages)
			{
				CheckPackage(subPackage);
			}
			foreach (Element element in package.Elements)
			{
				CheckElementParent(element);
			}
		}

		/// <summary>
		/// Menus the item on click.
		/// </summary>
		/// <param name="sender">The sender.</param>
		/// <param name="eventArgs">The <see cref="EventArgs"/> instance containing the event data.</param>
		private void MenuItemOnClick(object sender, EventArgs eventArgs)
		{
			root = this.IAHost.Repository.GetTreeSelectedPackage();
			if (object.Equals(sqlUtility, null))
			{
				sqlUtility = new SqlUtility(this.IAHost.Repository);
			}

			var selectedType = this.IAHost.Repository.GetTreeSelectedItemType();
			if (EA.ObjectType.otElement.Equals(selectedType))
			{
				CheckElementParent(this.IAHost.Repository.GetTreeSelectedObject() as Element);
			} else if (EA.ObjectType.otPackage.Equals(selectedType))
			{
				CheckPackage(root);
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

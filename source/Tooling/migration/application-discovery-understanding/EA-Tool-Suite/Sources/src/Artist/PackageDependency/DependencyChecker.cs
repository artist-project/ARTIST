using System;
using System.Collections;
using System.Linq;

using EA;

using LL.UserInfo;
using LL.EAAddin.IntegrationArchitect.Plugin.PackageDependency.Properties;
using LL.EAAddin.Foundation.Data;
using System.Collections.Generic;

namespace LL.EAAddin.IntegrationArchitect.Plugin.PackageDependency
{
	/// <summary>
	/// checks the Packagedependencies and add or deletes them
	/// </summary>
	public class DependencyChecker
	{
		#region Variables

		private static Settings appSettings = new Settings();
		private static Repository pRepository;
		private static Package chkPackage;

		#endregion

		#region Private Functions

		/// <summary>
		/// Updates the open diagrams.
		/// </summary>
		private static void UpdateDiagrams()
		{
			IEnumerator enumModels = pRepository.Models.GetEnumerator();
			enumModels.Reset();
			while (enumModels.MoveNext())
			{
				Package model = (Package)enumModels.Current;
				UpdateDiagrams(model);
			}
		}

		/// <summary>
		/// Updates the diagrams of a package.
		/// </summary>
		/// <param name="package">The package.</param>
		private static void UpdateDiagrams(Package package)
		{
			IEnumerator enumDiagrams = package.Diagrams.GetEnumerator();
			enumDiagrams.Reset();
			while (enumDiagrams.MoveNext())
			{
				Diagram diagram = (Diagram)enumDiagrams.Current;
				if (diagram != null)
				{
					pRepository.SaveDiagram(diagram.DiagramID);
					pRepository.ReloadDiagram(diagram.DiagramID);
				}
			}

			IEnumerator enumPackage = package.Packages.GetEnumerator();
			enumPackage.Reset();
			while (enumPackage.MoveNext())
			{
				Package subPackage = (Package)enumPackage.Current;
				UpdateDiagrams(subPackage);
			}

		}

		/// <summary>
		/// Delets the package dependency between two elements.
		/// </summary>
		/// <param name="element1">The element1.</param>
		/// <param name="element2">The element2.</param>
		private static void DelPackageDependency(Element element1, Element element2)
		{
			IEnumerator enumConnectors = element1.Connectors.GetEnumerator();
			enumConnectors.Reset();
			short index = -1;
			while (enumConnectors.MoveNext())
			{
				index++;
				Connector connector = (Connector)enumConnectors.Current;
				if (connector != null && connector.Stereotype.Equals(appSettings.Stereotype))
				{
					if (((connector.ClientID == element1.ElementID) && (connector.SupplierID == element2.ElementID))
					    || ((connector.ClientID == element2.ElementID) && (connector.SupplierID == element1.ElementID)))
					{
						element1.Connectors.Delete(index);
					}
				}
			}
		}

		/// <summary>
		/// Gets the current dependencies of the package.
		/// </summary>
		/// <param name="package">The package.</param>
		/// <returns>a list of the current package dependencies</returns>
		private static DependingPackageList CurrentDependencies(Package package)
		{
			ProgressInfo.Info = Resources.stateListConnectors;
			DependingPackageList dpList = new DependingPackageList();
			List<Connector> connectors = Manipulation.GetAllPackageConnectors(package);
			ProgressInfo.Reset(Resources.stateSearchCurDep, 0, connectors.Count);
			
			foreach (Connector connector in connectors)
			{
				ProgressInfo.Next();
				if (connector.Stereotype.Equals(appSettings.Stereotype))
				{
					Element clientPackage = pRepository.GetElementByID(connector.ClientID);
					Element supplierPackage = pRepository.GetElementByID(connector.SupplierID);

					//string client = connector.ClientID.ToString();
					//string supplier = connector.SupplierID.ToString();

					if ((supplierPackage != null) && (clientPackage != null))
					{
						if (clientPackage.ElementID != supplierPackage.ElementID)
						{
							if (!dpList.IsInList(supplierPackage.ElementID, clientPackage.ElementID))
								dpList.AddNew(supplierPackage, clientPackage, connector.Direction, connector);
						}
					}
				}
			}
			ProgressInfo.Reset();
			return dpList;
		}

		/// <summary>
		/// Gets the neededed dependencies of the package.
		/// </summary>
		/// <param name="package">The package.</param>
		/// <returns>a list of needed package dependencies</returns>
		private static DependingPackageList NeededDependencies(Package package)
		{
			ProgressInfo.Info = Resources.stateListElem;
			DependingPackageList dpList = new DependingPackageList();
			List<Connector> connectors = Manipulation.GetAllElementConnectors(package);

			List<Element> elements = Manipulation.GetAllElements(package);

			ProgressInfo.Reset(Resources.stateSearchNewDep, 0, elements.Count);

			foreach (Element element in elements)
			{
				ProgressInfo.Next();


				foreach (Method method in element.Methods)
				{
					if (method.ClassifierID != "0")
					{
						Package clientPackage = Manipulation.GetElementPackage(pRepository, element.ElementID);
						Package supplierPackage = Manipulation.GetElementPackage(
						                                                            pRepository,
						                                                            pRepository.GetElementByID(Convert.ToInt32(method.ClassifierID))
						                                                            	.ElementID);

						if ((supplierPackage != null) && (clientPackage != null))
						{
							if (clientPackage.Element.ElementID != supplierPackage.Element.ElementID)
							{
								if (!dpList.IsInList(supplierPackage.Element.ElementID, clientPackage.Element.ElementID))
								{
									dpList.AddNew(supplierPackage.Element, clientPackage.Element, "Source -> Destination");
								}

							}
						}


					}
					foreach (Parameter theParameter in method.Parameters)
					{
						if (theParameter.ClassifierID != "0")
						{
							Package clientPackage = Manipulation.GetElementPackage(pRepository, element.ElementID);
							Package supplierPackage = Manipulation.GetElementPackage(
																											pRepository,
																											pRepository.GetElementByID(Convert.ToInt32(theParameter.ClassifierID))
																												.ElementID);
							if ((supplierPackage != null) && (clientPackage != null))
							{
								if (clientPackage.Element.ElementID != supplierPackage.Element.ElementID)
								{
									if (!dpList.IsInList(supplierPackage.Element.ElementID, clientPackage.Element.ElementID))
									{
										dpList.AddNew(supplierPackage.Element, clientPackage.Element, "Source -> Destination");
									}

								}
							}

						}
					}
				}

				foreach (EA.Attribute attribute in element.Attributes)
				{
					if (attribute.ClassifierID != 0)
					{
						Package clientPackage = Manipulation.GetElementPackage(pRepository, element.ElementID);
						Package supplierPackage = Manipulation.GetElementPackage(
						                                                            pRepository,
						                                                            pRepository.GetElementByID(attribute.ClassifierID).ElementID);


						if ((supplierPackage != null) && (clientPackage != null))
						{
							if (clientPackage.Element.ElementID != supplierPackage.Element.ElementID)
							{
								if (!dpList.IsInList(supplierPackage.Element.ElementID, clientPackage.Element.ElementID))
								{
									dpList.AddNew(supplierPackage.Element, clientPackage.Element, "Source -> Destination");
								}

							}
						}
					}
				}

			}

			ProgressInfo.Reset(Resources.stateSearchNewDep, 0, connectors.Count);

			foreach (Connector connector in connectors)
			{
				ProgressInfo.Next();
				Package clientPackage = Manipulation.GetElementPackage(pRepository, connector.ClientID);
				Package supplierPackage = Manipulation.GetElementPackage(pRepository, connector.SupplierID);

				if ((supplierPackage != null) && (clientPackage != null))
				{
					if (clientPackage.Element.ElementID != supplierPackage.Element.ElementID)
					{
						if (!dpList.IsInList(supplierPackage.Element.ElementID, clientPackage.Element.ElementID))
							dpList.AddNew(supplierPackage.Element, clientPackage.Element, connector.Direction);
					}
				}
			}



			ProgressInfo.Reset();
			return dpList;
		}

		/// <summary>
		/// Adds the element to diagram.
		/// </summary>
		/// <param name="pdDiagram">The pd diagram.</param>
		/// <param name="element">The element.</param>
		/// <returns>a diagramobject</returns>
		private static DiagramObject AddElementToDiagram(Diagram pdDiagram, Element element)
		{
			object objDObj = pdDiagram.DiagramObjects.AddNew("", "");
			if (!Equals(objDObj, null))
			{
				DiagramObject diaObj = (DiagramObject)objDObj;
				diaObj.ElementID = element.ElementID;
				diaObj.Update();
				pdDiagram.Update();
				return diaObj;
			}
			return null;
		}

		#endregion

		#region Public Functions

		/// <summary>
		/// Checks the package dependencies.
		/// (adding / deleting)
		/// </summary>
		/// <param name="repository">The repository.</param>
		/// <param name="package">The package.</param>
		public static void CheckPackageDependencies(Repository repository, Package package)
		{
			chkPackage = package;
			pRepository = repository;
			//ProgressInfo.Info = Resources.stateCheckStType;
			Manipulation.AddorGetStereotype(pRepository, appSettings.Stereotype, appSettings.Type);

			DependingPackageList neededDependency = NeededDependencies(chkPackage);
			DependingPackageList currentDependency = CurrentDependencies(chkPackage);

			ProgressInfo.Info = Resources.stateUpdCurDep;
			IEnumerator enumCurrent = currentDependency.GetEnumerator();
			enumCurrent.Reset();
			ProgressInfo.Maximum = currentDependency.Count;

			while (enumCurrent.MoveNext())
			{
				ProgressInfo.Next();
				DependingPackages dp = (DependingPackages)enumCurrent.Current;
				if (dp != null)
				{
					if (!neededDependency.IsInList(dp.Element1.ElementID, dp.Element2.ElementID))
					{
						DelPackageDependency(dp.Element1, dp.Element2);
					}
					DependingPackages needDp = neededDependency.GetItemByElements(dp.Element1.ElementID, dp.Element2.ElementID);
					if (needDp != null)
					{
						if (dp.Connector != null)
						{
							dp.Connector.Direction = needDp.Direction;
							dp.Connector.Update();
						}
					}
				}
			}
			ProgressInfo.Reset();
			ProgressInfo.Info = Resources.stateAddNewDep;
			IEnumerator enumNedded = neededDependency.GetEnumerator();
			enumNedded.Reset();
			ProgressInfo.Maximum = currentDependency.Count;
			while (enumNedded.MoveNext())
			{
				ProgressInfo.Next();
				DependingPackages dp = (DependingPackages)enumNedded.Current;
				if (dp != null && !currentDependency.IsInList(dp.Element1.ElementID, dp.Element2.ElementID))
				{
	#pragma warning disable 618
					Manipulation.AddConnector(dp.Element1, dp.Element2, string.Empty, dp.Direction, appSettings.Type, appSettings.Stereotype);
	#pragma warning restore 618
				}
			}

			ProgressInfo.Info = Resources.stateUpdRep;
			UpdateDiagrams();

			ProgressInfo.Reset();
			ProgressInfo.Info = Resources.stateFinished;
		}

		/// <summary>
		/// Generates the diagram.
		/// </summary>
		/// <param name="repository">The repository.</param>
		/// <param name="package">The package.</param>
		public static void GenerateDiagram(Repository repository, Package package)
		{
			chkPackage = package;
			pRepository = repository;
			ProgressInfo.Info = Resources.stateGenDiagram;
			DiagramObjects dobjs = new DiagramObjects();

			Package newPackage = Manipulation.AddPackage(chkPackage, "Package Dependencies");

			object objDiagram = newPackage.Diagrams.AddNew(chkPackage.Name + " - " + appSettings.Stereotype, appSettings.Type);
			
			if (!Equals(objDiagram, null))
			{
				Diagram pdDiagram = (Diagram)objDiagram;
				pdDiagram.Stereotype = "generated";
				
				if (pdDiagram.Update())
				{
					ProgressInfo.Info = Resources.stateSearchCurDep;

					DependingPackageList currentDependency = CurrentDependencies(chkPackage);
					IEnumerator enumCurrent = currentDependency.GetEnumerator();
					enumCurrent.Reset();

					ProgressInfo.Reset(Resources.stateCreateDiagram, 0, currentDependency.Count);
					while (enumCurrent.MoveNext())
					{
						ProgressInfo.Next();
						DependingPackages dp = (DependingPackages)enumCurrent.Current;

						if (dp != null && !dobjs.IsInList(dp.Element1.ElementID))
						{
							object objDObj = pdDiagram.DiagramObjects.AddNew("", "");
							if (!Equals(objDObj, null))
							{
								dobjs.Add(AddElementToDiagram(pdDiagram, dp.Element1));
							}
						}

						if (dp != null && !dobjs.IsInList(dp.Element2.ElementID))
						{
							object objDObj = pdDiagram.DiagramObjects.AddNew("", "");
							if (!Equals(objDObj, null))
							{
								dobjs.Add(AddElementToDiagram(pdDiagram, dp.Element2));
							}
						}
					}

					pRepository.OpenDiagram(pdDiagram.DiagramID);
					pRepository.App.Project.LayoutDiagram(pdDiagram.DiagramGUID, 0);
					pRepository.SaveDiagram(pdDiagram.DiagramID);

					ProgressInfo.Info = Resources.stateFinished;
				}
			}

		}

		#endregion

		/// <summary>
		/// Deletes all Package Dependencies from the Repository
		/// </summary>
		/// <param name="repository"></param>
		/// <param name="package"></param>
		/// <exception cref="NotImplementedException"></exception>
		public static void DeleteDependenciesFromModel(Repository repository, Package package)
		{
			List<Package> allPackages = Manipulation.GetAllPackages(repository);
			List<Connector> allPackageConnectors = new List<Connector>();

			foreach (var thePackage in allPackages)
			{
				allPackageConnectors.AddRange(Manipulation.GetAllPackageConnectors(thePackage));
				
			}
			
			IEnumerable<Connector> affectedConnectors = allPackageConnectors.Where(con => con.Stereotype.Equals(appSettings.Stereotype));
                 
			foreach (Connector packageConnector in affectedConnectors)
			{
				repository.Execute("DELETE FROM t_connector WHERE Connector_ID =" + packageConnector.ConnectorID + ";");
				repository.Execute("DELETE FROM t_diagramlinks WHERE ConnectorID =" + packageConnector.ConnectorID + ";");
			}

			List<Diagram> allDiagrams = Manipulation.GetAllDiagrams(package);
			foreach (Diagram theDiagram in allDiagrams)
			{
				if (theDiagram.Stereotype=="generated")
				{
					theDiagram.Update();
					foreach (DiagramObject diagramObj in theDiagram.DiagramObjects)
					{
						diagramObj.Update();
					}
					theDiagram.Update();

					//If diagram open than close and open
					if (repository.IsTabOpen(theDiagram.Name)!=0)
					{
						repository.CloseDiagram(theDiagram.DiagramID);
						repository.OpenDiagram(theDiagram.DiagramID);
					}


				}
			}
                 
			
			
		}
	}
}

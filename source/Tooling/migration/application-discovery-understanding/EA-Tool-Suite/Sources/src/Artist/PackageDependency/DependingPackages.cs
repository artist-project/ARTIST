namespace LL.EAAddin.IntegrationArchitect.Plugin.PackageDependency
{
	/// <summary>
	/// Represents a Package dependency with package A and package B and the direction of the connector
	/// </summary>
	public class DependingPackages
	{
		#region Variables

		private EA.Element _pElement1;
		private EA.Element _pElement2;
		private string _pDirection;
		private EA.Connector _pConnector;

		#endregion


		#region Properties

		/// <summary>
		/// Gets or sets the connector.
		/// </summary>
		/// <value>The connector.</value>
		public EA.Connector Connector
		{
			get { return _pConnector; }
			set { _pConnector = value; }
		}

		/// <summary>
		/// Gets or sets the direction.
		/// </summary>
		/// <value>The direction.</value>
		public string Direction
		{
			get { return _pDirection; }
			set { _pDirection = value; }
		}

		/// <summary>
		/// Gets or sets the element1.
		/// </summary>
		/// <value>The element1.</value>
		public EA.Element Element1
		{
			get { return _pElement1; }
			set { _pElement1 = value; }
		}


		/// <summary>
		/// Gets or sets the element2.
		/// </summary>
		/// <value>The element2.</value>
		public EA.Element Element2
		{
			get { return _pElement2; }
			set { _pElement2 = value; }
		}

		#endregion

		#region Constructor/Destructor

		/// <summary>
		/// Initializes a new instance of the <see cref="DependingPackages"/> class.
		/// </summary>
		/// <param name="eaElement1">The ea element1.</param>
		/// <param name="eaElement2">The ea element2.</param>
		/// <param name="eaDirection">The ea direction.</param>
		public DependingPackages(EA.Element eaElement1, EA.Element eaElement2, string eaDirection)
		{
			Element1 = eaElement1;
			Element2 = eaElement2;
			Direction = eaDirection;
		}

		#endregion
	}

}

using System.Collections;

namespace LL.EAAddin.IntegrationArchitect.Plugin.PackageDependency
{
	/// <summary>
	/// represents an list of package dependencies
	/// </summary>
	public class DependingPackageList : IEnumerable, IEnumerator
	{
		#region Variables

		private DependingPackages[] _dpList;
		//current position in array set to initial position
		private int _position = -1;

		#endregion

		#region Public Functions

		/// <summary>
		/// Gets the count.
		/// </summary>
		/// <value>The number of elements.</value>
		public int Count
		{
			get { return _dpList.Length; }
		}

		/// <summary>
		/// Initializes a new instance of the <see cref="DependingPackageList"/> class.
		/// </summary>
		public DependingPackageList()
		{
			_dpList = new DependingPackages[0];
		}

		/// <summary>
		/// Returns an enumerator that iterates through a collection.
		/// </summary>
		/// <returns>
		/// An <see cref="T:System.Collections.IEnumerator"></see> object that can be used to iterate through the collection.
		/// </returns>
		public IEnumerator GetEnumerator()
		{
			return this;
		}

		/// <summary>
		/// Advances the enumerator to the next element of the collection.
		/// </summary>
		/// <returns/>
		/// true if the enumerator was successfully advanced to the next element; false if the enumerator has passed the end of the collection.
		/// <returns>if it was possible to move to the next element</returns>
		/// <exception cref="T:System.InvalidOperationException">The collection was modified after the enumerator was created. </exception>
		public bool MoveNext()
		{
			// moves on to the next item
			_position++;
			if (_position < _dpList.Length)
			{
				return true;
			}
			return false;
		}

		/// <summary>
		/// Sets the enumerator to its initial position, which is before the first element in the collection.
		/// </summary>
		/// <exception cref="T:System.InvalidOperationException">The collection was modified after the enumerator was created. </exception>
		public void Reset()
		{
			// resets the position befor the first item
			_position = -1;
		}

		/// <summary>
		/// Gets the current element in the collection.
		/// </summary>
		/// <value></value>
		/// <returns>The current element in the collection.</returns>
		/// <exception cref="T:System.InvalidOperationException">The enumerator is positioned before the first element of the collection or after the last element. </exception>
		public object Current
		{
			// returns the first item
			get { return _dpList[_position]; }
		}

		/// <summary>
		/// Determines whether [is in list] [the specified element I d1].
		/// </summary>
		/// <param name="elementID1">The element I d1.</param>
		/// <param name="elementID2">The element I d2.</param>
		/// <returns>
		/// 	<c>true</c> if [is in list] [the specified element I d1]; otherwise, <c>false</c>.
		/// </returns>
		public bool IsInList(int elementID1, int elementID2)
		{
			// checks if a item with the two elementids is in the list
			bool bFound = false;
			foreach (DependingPackages dp in _dpList)
			{
				if ((dp.Element1.ElementID == elementID1) && (dp.Element2.ElementID == elementID2))
					bFound = true;
				if ((dp.Element2.ElementID == elementID2) && (dp.Element1.ElementID == elementID1))
					bFound = true;
			}

			return bFound;
		}

		/// <summary>
		/// Gets the item by elements.
		/// </summary>
		/// <param name="elementID1">The element I d1.</param>
		/// <param name="elementID2">The element I d2.</param>
		/// <returns>the Packagedependency</returns>
		public DependingPackages GetItemByElements(int elementID1, int elementID2)
		{
			// gets the element by the id's
			foreach (DependingPackages dp in _dpList)
			{
				if (((dp.Element1.ElementID == elementID1) && (dp.Element2.ElementID == elementID2)) ||
				    ((dp.Element2.ElementID == elementID2) && (dp.Element1.ElementID == elementID1)))
					return dp;
			}

			return null;
		}

		/// <summary>
		/// Adds a new dependency.
		/// </summary>
		/// <param name="eaElement1">The ea element1.</param>
		/// <param name="eaElement2">The ea element2.</param>
		/// <param name="sDirection">The direction of the connector.</param>
		/// <param name="eaConnector">The ea connector.</param>
		/// <returns>the added object</returns>
		public object AddNew(EA.Element eaElement1, EA.Element eaElement2, string sDirection, EA.Connector eaConnector)
		{
			// adds a new item to the list
			DependingPackages dPackages = new DependingPackages(eaElement1, eaElement2, sDirection);
			dPackages.Connector = eaConnector;

			// copies the old list to a tmp-list, generates a new list with one more item
			// and adds the new item at the end of the list
			DependingPackages[] spTmp = _dpList;
			_dpList = new DependingPackages[_dpList.Length + 1];
			for (int i = 0; i < _dpList.Length; i++)
			{
				if (i < spTmp.Length)
				{
					_dpList[i] = spTmp[i];
				}
				else
				{
					_dpList[i] = dPackages;
				}
			}
			return dPackages;
		}

		/// <summary>
		/// Adds the new.
		/// </summary>
		/// <param name="eaElement1">The ea element1.</param>
		/// <param name="eaElement2">The ea element2.</param>
		/// <param name="sDirection">The s direction.</param>
		/// <returns>the added object</returns>
		public object AddNew(EA.Element eaElement1, EA.Element eaElement2, string sDirection)
		{
			// adds a new element to the list
			return AddNew(eaElement1, eaElement2, sDirection, null);
		}

		/// <summary>
		/// Adds the elements.
		/// </summary>
		/// <param name="dpList">The dp list.</param>
		public void AddElements(DependingPackageList dpList)
		{
			// adds a list of elements 
			IEnumerator enumDPL = dpList.GetEnumerator();
			enumDPL.Reset();
			while (enumDPL.MoveNext())
			{
				DependingPackages dp = (DependingPackages) enumDPL.Current;
				// checks if the element is allready added
				if (!IsInList(dp.Element1.ElementID, dp.Element2.ElementID))
					AddNew(dp.Element1, dp.Element2, dp.Direction);
			}
		}

		#endregion
	}


}

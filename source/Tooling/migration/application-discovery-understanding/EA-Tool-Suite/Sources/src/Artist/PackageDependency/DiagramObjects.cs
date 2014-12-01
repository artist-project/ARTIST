using System.Collections;

namespace LL.EAAddin.IntegrationArchitect.Plugin.PackageDependency
{
	/// <summary>
	/// Holds a list of objects in the diagram
	/// </summary>
	internal class DiagramObjects : ArrayList
	{
		#region Public Functions

		/// <summary>
		/// Adds the specified obj.
		/// </summary>
		/// <param name="obj">The obj.</param>
		public void Add(EA.DiagramObject obj)
		{
			base.Add(obj);
		}


		/// <summary>
		/// Determines whether [is in list] [the specified ID].
		/// </summary>
		/// <param name="id">The ID.</param>
		/// <returns>
		/// 	<c>true</c> if [is in list] [the specified ID]; otherwise, <c>false</c>.
		/// </returns>
		public bool IsInList(int id)
		{
			foreach (EA.DiagramObject dobj in this)
			{
				if (dobj.ElementID.Equals(id))
				{
					return true;
				}
			}
			return false;
		}

		#endregion
	}
}

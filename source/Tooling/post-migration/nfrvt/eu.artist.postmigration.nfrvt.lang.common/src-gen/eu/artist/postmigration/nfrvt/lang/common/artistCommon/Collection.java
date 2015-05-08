/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getCollection_Values()
   * @model containment="true"
   * @generated
   */
  EList<ValueSpecification> getValues();

} // Collection

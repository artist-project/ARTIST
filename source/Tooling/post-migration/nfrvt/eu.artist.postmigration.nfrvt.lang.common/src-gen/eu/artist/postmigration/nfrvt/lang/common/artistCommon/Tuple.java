/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple#getTuples <em>Tuples</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getTuple()
 * @model
 * @generated
 */
public interface Tuple extends EObject
{
  /**
   * Returns the value of the '<em><b>Tuples</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuples</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuples</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getTuple_Tuples()
   * @model containment="true"
   * @generated
   */
  EList<PropertyValuePair> getTuples();

} // Tuple

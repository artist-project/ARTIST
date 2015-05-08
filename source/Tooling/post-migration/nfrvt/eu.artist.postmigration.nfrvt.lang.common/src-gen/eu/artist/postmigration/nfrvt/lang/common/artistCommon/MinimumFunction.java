/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimum Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getMinimumFunction()
 * @model
 * @generated
 */
public interface MinimumFunction extends NumberFunction
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getMinimumFunction_Values()
   * @model containment="true"
   * @generated
   */
  EList<NumberExpression> getValues();

} // MinimumFunction

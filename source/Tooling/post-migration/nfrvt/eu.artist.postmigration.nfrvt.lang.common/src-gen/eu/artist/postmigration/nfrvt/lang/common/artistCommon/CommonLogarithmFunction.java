/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Logarithm Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getCommonLogarithmFunction()
 * @model
 * @generated
 */
public interface CommonLogarithmFunction extends NumberFunction
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(NumberExpression)
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getCommonLogarithmFunction_Value()
   * @model containment="true"
   * @generated
   */
  NumberExpression getValue();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(NumberExpression value);

} // CommonLogarithmFunction

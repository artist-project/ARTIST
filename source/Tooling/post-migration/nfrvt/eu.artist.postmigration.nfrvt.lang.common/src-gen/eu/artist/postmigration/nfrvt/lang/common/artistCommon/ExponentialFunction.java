/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction#getBase <em>Base</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getExponentialFunction()
 * @model
 * @generated
 */
public interface ExponentialFunction extends NumberFunction
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' containment reference.
   * @see #setBase(NumberExpression)
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getExponentialFunction_Base()
   * @model containment="true"
   * @generated
   */
  NumberExpression getBase();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction#getBase <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' containment reference.
   * @see #getBase()
   * @generated
   */
  void setBase(NumberExpression value);

  /**
   * Returns the value of the '<em><b>Exponent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exponent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exponent</em>' containment reference.
   * @see #setExponent(NumberExpression)
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getExponentialFunction_Exponent()
   * @model containment="true"
   * @generated
   */
  NumberExpression getExponent();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction#getExponent <em>Exponent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exponent</em>' containment reference.
   * @see #getExponent()
   * @generated
   */
  void setExponent(NumberExpression value);

} // ExponentialFunction

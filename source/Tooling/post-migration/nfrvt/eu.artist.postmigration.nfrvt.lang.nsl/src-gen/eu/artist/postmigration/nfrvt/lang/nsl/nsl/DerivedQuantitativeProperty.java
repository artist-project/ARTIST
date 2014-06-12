/**
 */
package eu.artist.postmigration.nfrvt.lang.nsl.nsl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Quantitative Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getDerivedQuantitativeProperty()
 * @model
 * @generated
 */
public interface DerivedQuantitativeProperty extends QuantitativeProperty
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ArithmeticExpression)
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getDerivedQuantitativeProperty_Expression()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpression getExpression();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ArithmeticExpression value);

} // DerivedQuantitativeProperty

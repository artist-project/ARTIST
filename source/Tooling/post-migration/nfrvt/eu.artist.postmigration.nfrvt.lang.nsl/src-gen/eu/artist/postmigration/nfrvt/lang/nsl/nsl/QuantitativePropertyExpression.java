/**
 */
package eu.artist.postmigration.nfrvt.lang.nsl.nsl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative Property Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getQuantitativePropertyExpression()
 * @model
 * @generated
 */
public interface QuantitativePropertyExpression extends NumberExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(QuantitativeProperty)
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getQuantitativePropertyExpression_Value()
   * @model
   * @generated
   */
  QuantitativeProperty getValue();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(QuantitativeProperty value);

} // QuantitativePropertyExpression

/**
 */
package eu.artist.postmigration.nfrvt.lang.nsl.nsl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesized Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getParenthesizedArithmeticExpression()
 * @model
 * @generated
 */
public interface ParenthesizedArithmeticExpression extends NumberExpression
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
   * @see #setValue(ArithmeticExpression)
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getParenthesizedArithmeticExpression_Value()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpression getValue();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ArithmeticExpression value);

} // ParenthesizedArithmeticExpression

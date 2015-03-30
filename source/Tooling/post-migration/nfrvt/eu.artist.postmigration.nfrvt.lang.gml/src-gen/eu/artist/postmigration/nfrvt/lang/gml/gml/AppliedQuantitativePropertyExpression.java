/**
 */
package eu.artist.postmigration.nfrvt.lang.gml.gml;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applied Quantitative Property Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getAppliedQuantitativePropertyExpression()
 * @model
 * @generated
 */
public interface AppliedQuantitativePropertyExpression extends NumberExpression
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
   * @see #setValue(AppliedQuantitativeProperty)
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getAppliedQuantitativePropertyExpression_Value()
   * @model
   * @generated
   */
  AppliedQuantitativeProperty getValue();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AppliedQuantitativeProperty value);

} // AppliedQuantitativePropertyExpression

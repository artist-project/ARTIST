/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon;

import org.eclipse.uml2.uml.InstanceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Specification Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getInstanceSpecificationExpression()
 * @model
 * @generated
 */
public interface InstanceSpecificationExpression extends ComparableExpression, ValueSpecification
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
   * @see #setValue(InstanceSpecification)
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getInstanceSpecificationExpression_Value()
   * @model
   * @generated
   */
  InstanceSpecification getValue();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(InstanceSpecification value);

} // InstanceSpecificationExpression

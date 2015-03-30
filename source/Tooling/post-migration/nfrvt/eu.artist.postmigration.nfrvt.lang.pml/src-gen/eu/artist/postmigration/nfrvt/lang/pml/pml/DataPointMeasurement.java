/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Point Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getDataPointMeasurement()
 * @model
 * @generated
 */
public interface DataPointMeasurement extends ApplicationMeasurement
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
   * @see #setValue(ValueSpecification)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getDataPointMeasurement_Value()
   * @model containment="true"
   * @generated
   */
  ValueSpecification getValue();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueSpecification value);

} // DataPointMeasurement

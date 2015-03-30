/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Series Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getTimeSeriesMeasurement()
 * @model
 * @generated
 */
public interface TimeSeriesMeasurement extends ApplicationMeasurement
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getTimeSeriesMeasurement_Values()
   * @model containment="true"
   * @generated
   */
  EList<TimeValuePair> getValues();

} // TimeSeriesMeasurement

/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel#getObservations <em>Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getMeasurementModel()
 * @model
 * @generated
 */
public interface MeasurementModel extends ARTISTModel
{
  /**
   * Returns the value of the '<em><b>Observations</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observations</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getMeasurementModel_Observations()
   * @model containment="true"
   * @generated
   */
  EList<Observation> getObservations();

} // MeasurementModel

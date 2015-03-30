/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getToolName <em>Tool Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getLevel <em>Level</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getMeasurementType <em>Measurement Type</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends EObject
{
  /**
   * Returns the value of the '<em><b>Tool Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tool Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tool Name</em>' attribute.
   * @see #setToolName(String)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getObservation_ToolName()
   * @model
   * @generated
   */
  String getToolName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getToolName <em>Tool Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tool Name</em>' attribute.
   * @see #getToolName()
   * @generated
   */
  void setToolName(String value);

  /**
   * Returns the value of the '<em><b>Date Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Time</em>' attribute.
   * @see #setDateTime(Date)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getObservation_DateTime()
   * @model
   * @generated
   */
  Date getDateTime();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getDateTime <em>Date Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Time</em>' attribute.
   * @see #getDateTime()
   * @generated
   */
  void setDateTime(Date value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(String)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getObservation_Level()
   * @model
   * @generated
   */
  String getLevel();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(String value);

  /**
   * Returns the value of the '<em><b>Measurement Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measurement Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurement Type</em>' attribute.
   * @see #setMeasurementType(String)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getObservation_MeasurementType()
   * @model
   * @generated
   */
  String getMeasurementType();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getMeasurementType <em>Measurement Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measurement Type</em>' attribute.
   * @see #getMeasurementType()
   * @generated
   */
  void setMeasurementType(String value);

  /**
   * Returns the value of the '<em><b>Measurements</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurements</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getObservation_Measurements()
   * @model containment="true"
   * @generated
   */
  EList<Measurement> getMeasurements();

} // Observation

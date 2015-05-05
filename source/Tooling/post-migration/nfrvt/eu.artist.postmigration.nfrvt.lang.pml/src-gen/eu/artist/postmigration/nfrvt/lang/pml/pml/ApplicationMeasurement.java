/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement#getContext <em>Context</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement#getWorkload <em>Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getApplicationMeasurement()
 * @model
 * @generated
 */
public interface ApplicationMeasurement extends Measurement
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference.
   * @see #setContext(NamedElement)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getApplicationMeasurement_Context()
   * @model
   * @generated
   */
  NamedElement getContext();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement#getContext <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' reference.
   * @see #getContext()
   * @generated
   */
  void setContext(NamedElement value);

  /**
   * Returns the value of the '<em><b>Workload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workload</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workload</em>' containment reference.
   * @see #setWorkload(Workload)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getApplicationMeasurement_Workload()
   * @model containment="true"
   * @generated
   */
  Workload getWorkload();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement#getWorkload <em>Workload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workload</em>' containment reference.
   * @see #getWorkload()
   * @generated
   */
  void setWorkload(Workload value);

} // ApplicationMeasurement

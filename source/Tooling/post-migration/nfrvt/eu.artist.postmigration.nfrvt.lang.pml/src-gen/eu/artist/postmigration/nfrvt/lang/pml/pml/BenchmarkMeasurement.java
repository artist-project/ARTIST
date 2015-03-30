/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Benchmark Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getProvider <em>Provider</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getService <em>Service</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getTest <em>Test</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getWorkload <em>Workload</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getBenchmarkMeasurement()
 * @model
 * @generated
 */
public interface BenchmarkMeasurement extends Measurement
{
  /**
   * Returns the value of the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' reference.
   * @see #setProvider(EnumerationLiteral)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getBenchmarkMeasurement_Provider()
   * @model
   * @generated
   */
  EnumerationLiteral getProvider();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getProvider <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider</em>' reference.
   * @see #getProvider()
   * @generated
   */
  void setProvider(EnumerationLiteral value);

  /**
   * Returns the value of the '<em><b>Service</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' attribute.
   * @see #setService(String)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getBenchmarkMeasurement_Service()
   * @model
   * @generated
   */
  String getService();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getService <em>Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' attribute.
   * @see #getService()
   * @generated
   */
  void setService(String value);

  /**
   * Returns the value of the '<em><b>Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' attribute.
   * @see #setTest(String)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getBenchmarkMeasurement_Test()
   * @model
   * @generated
   */
  String getTest();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getTest <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' attribute.
   * @see #getTest()
   * @generated
   */
  void setTest(String value);

  /**
   * Returns the value of the '<em><b>Workload</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workload</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workload</em>' attribute.
   * @see #setWorkload(String)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getBenchmarkMeasurement_Workload()
   * @model
   * @generated
   */
  String getWorkload();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getWorkload <em>Workload</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workload</em>' attribute.
   * @see #getWorkload()
   * @generated
   */
  void setWorkload(String value);

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
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getBenchmarkMeasurement_Value()
   * @model containment="true"
   * @generated
   */
  ValueSpecification getValue();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueSpecification value);

} // BenchmarkMeasurement

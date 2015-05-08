/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getMeasurement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(QuantitativeProperty)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getMeasurement_Property()
   * @model
   * @generated
   */
  QuantitativeProperty getProperty();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(QuantitativeProperty value);

  /**
   * Returns the value of the '<em><b>Confidence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Confidence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Confidence</em>' attribute.
   * @see #setConfidence(BigDecimal)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getMeasurement_Confidence()
   * @model
   * @generated
   */
  BigDecimal getConfidence();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getConfidence <em>Confidence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Confidence</em>' attribute.
   * @see #getConfidence()
   * @generated
   */
  void setConfidence(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Info</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Info</em>' attribute.
   * @see #setInfo(String)
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getMeasurement_Info()
   * @model
   * @generated
   */
  String getInfo();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getInfo <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info</em>' attribute.
   * @see #getInfo()
   * @generated
   */
  void setInfo(String value);

} // Measurement

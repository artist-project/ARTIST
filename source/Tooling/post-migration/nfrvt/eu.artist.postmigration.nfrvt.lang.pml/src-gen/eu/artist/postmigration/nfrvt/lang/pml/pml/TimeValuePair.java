/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getTimeValuePair()
 * @model
 * @generated
 */
public interface TimeValuePair extends EObject
{
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
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getTimeValuePair_DateTime()
   * @model
   * @generated
   */
  Date getDateTime();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair#getDateTime <em>Date Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Time</em>' attribute.
   * @see #getDateTime()
   * @generated
   */
  void setDateTime(Date value);

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
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#getTimeValuePair_Value()
   * @model containment="true"
   * @generated
   */
  ValueSpecification getValue();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueSpecification value);

} // TimeValuePair

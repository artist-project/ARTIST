/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applied Quantitative Property Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation#getRealizations <em>Realizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getAppliedQuantitativePropertyEvaluation()
 * @model
 * @generated
 */
public interface AppliedQuantitativePropertyEvaluation extends AppliedPropertyEvaluation
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(AppliedQuantitativeProperty)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getAppliedQuantitativePropertyEvaluation_Property()
   * @model
   * @generated
   */
  AppliedQuantitativeProperty getProperty();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(AppliedQuantitativeProperty value);

  /**
   * Returns the value of the '<em><b>Realizations</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Realizations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizations</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getAppliedQuantitativePropertyEvaluation_Realizations()
   * @model containment="true"
   * @generated
   */
  EList<QuantitativePropertyRealization> getRealizations();

} // AppliedQuantitativePropertyEvaluation

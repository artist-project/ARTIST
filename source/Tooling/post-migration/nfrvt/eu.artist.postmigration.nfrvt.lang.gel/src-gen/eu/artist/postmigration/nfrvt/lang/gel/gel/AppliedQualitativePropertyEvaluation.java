/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applied Qualitative Property Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getAppliedQualitativePropertyEvaluation()
 * @model
 * @generated
 */
public interface AppliedQualitativePropertyEvaluation extends AppliedPropertyEvaluation
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
   * @see #setProperty(AppliedQualitativeProperty)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getAppliedQualitativePropertyEvaluation_Property()
   * @model
   * @generated
   */
  AppliedQualitativeProperty getProperty();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(AppliedQualitativeProperty value);

} // AppliedQualitativePropertyEvaluation

/**
 */
package eu.artist.postmigration.nfrvt.lang.gml.gml;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applied Qualitative Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getAppliedQualitativeProperty()
 * @model
 * @generated
 */
public interface AppliedQualitativeProperty extends AppliedProperty
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
   * @see #setProperty(QualitativeProperty)
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getAppliedQualitativeProperty_Property()
   * @model
   * @generated
   */
  QualitativeProperty getProperty();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(QualitativeProperty value);

} // AppliedQualitativeProperty

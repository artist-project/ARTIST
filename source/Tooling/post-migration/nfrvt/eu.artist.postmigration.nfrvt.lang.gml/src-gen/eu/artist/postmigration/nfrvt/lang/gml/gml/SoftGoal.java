/**
 */
package eu.artist.postmigration.nfrvt.lang.gml.gml;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getImpacts <em>Impacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getSoftGoal()
 * @model
 * @generated
 */
public interface SoftGoal extends Goal
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
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getSoftGoal_Property()
   * @model
   * @generated
   */
  AppliedQualitativeProperty getProperty();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(AppliedQualitativeProperty value);

  /**
   * Returns the value of the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' attribute.
   * @see #setThreshold(BigDecimal)
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getSoftGoal_Threshold()
   * @model
   * @generated
   */
  BigDecimal getThreshold();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
  void setThreshold(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Impacts</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impacts</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getSoftGoal_Impacts()
   * @model containment="true"
   * @generated
   */
  EList<SoftGoalImpact> getImpacts();

} // SoftGoal

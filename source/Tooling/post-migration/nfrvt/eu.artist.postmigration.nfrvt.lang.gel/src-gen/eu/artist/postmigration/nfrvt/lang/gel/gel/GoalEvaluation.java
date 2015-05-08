/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getGoalEvaluation()
 * @model
 * @generated
 */
public interface GoalEvaluation extends EObject
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
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getGoalEvaluation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Verdict</b></em>' attribute.
   * The literals are from the enumeration {@link eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verdict</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verdict</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict
   * @see #setVerdict(Verdict)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getGoalEvaluation_Verdict()
   * @model
   * @generated
   */
  Verdict getVerdict();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getVerdict <em>Verdict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verdict</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict
   * @see #getVerdict()
   * @generated
   */
  void setVerdict(Verdict value);

  /**
   * Returns the value of the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reason</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reason</em>' attribute.
   * @see #setReason(String)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getGoalEvaluation_Reason()
   * @model
   * @generated
   */
  String getReason();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getReason <em>Reason</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reason</em>' attribute.
   * @see #getReason()
   * @generated
   */
  void setReason(String value);

} // GoalEvaluation

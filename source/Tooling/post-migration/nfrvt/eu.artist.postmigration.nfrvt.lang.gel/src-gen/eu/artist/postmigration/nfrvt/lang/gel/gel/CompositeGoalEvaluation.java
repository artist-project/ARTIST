/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel;

import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Goal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation#getGoal <em>Goal</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation#getConditionEvaluation <em>Condition Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getCompositeGoalEvaluation()
 * @model
 * @generated
 */
public interface CompositeGoalEvaluation extends GoalEvaluation
{
  /**
   * Returns the value of the '<em><b>Goal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' reference.
   * @see #setGoal(CompositeGoal)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getCompositeGoalEvaluation_Goal()
   * @model
   * @generated
   */
  CompositeGoal getGoal();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation#getGoal <em>Goal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal</em>' reference.
   * @see #getGoal()
   * @generated
   */
  void setGoal(CompositeGoal value);

  /**
   * Returns the value of the '<em><b>Condition Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Evaluation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Evaluation</em>' containment reference.
   * @see #setConditionEvaluation(BooleanExpressionEvaluation)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getCompositeGoalEvaluation_ConditionEvaluation()
   * @model containment="true"
   * @generated
   */
  BooleanExpressionEvaluation getConditionEvaluation();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation#getConditionEvaluation <em>Condition Evaluation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Evaluation</em>' containment reference.
   * @see #getConditionEvaluation()
   * @generated
   */
  void setConditionEvaluation(BooleanExpressionEvaluation value);

} // CompositeGoalEvaluation

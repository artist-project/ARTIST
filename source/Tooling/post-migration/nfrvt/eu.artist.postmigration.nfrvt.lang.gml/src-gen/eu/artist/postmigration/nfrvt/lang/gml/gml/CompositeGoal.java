/**
 */
package eu.artist.postmigration.nfrvt.lang.gml.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getCompositeGoal()
 * @model
 * @generated
 */
public interface CompositeGoal extends Goal
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(GoalExpression)
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getCompositeGoal_Condition()
   * @model containment="true"
   * @generated
   */
  GoalExpression getCondition();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(GoalExpression value);

} // CompositeGoal

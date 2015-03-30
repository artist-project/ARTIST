/**
 */
package eu.artist.postmigration.nfrvt.lang.gml.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getGoalReference()
 * @model
 * @generated
 */
public interface GoalReference extends GoalBooleanUnit
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Goal)
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getGoalReference_Value()
   * @model
   * @generated
   */
  Goal getValue();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Goal value);

} // GoalReference

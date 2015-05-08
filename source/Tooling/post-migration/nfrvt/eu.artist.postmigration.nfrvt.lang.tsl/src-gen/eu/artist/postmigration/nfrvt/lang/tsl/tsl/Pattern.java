/**
 */
package eu.artist.postmigration.nfrvt.lang.tsl.tsl;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getContext <em>Context</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getProblem <em>Problem</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getSolution <em>Solution</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getPropertyImpacts <em>Property Impacts</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getPatternImpacts <em>Pattern Impacts</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getRelatedPatterns <em>Related Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject
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
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPattern_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' attribute.
   * @see #setContext(String)
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPattern_Context()
   * @model
   * @generated
   */
  String getContext();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getContext <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' attribute.
   * @see #getContext()
   * @generated
   */
  void setContext(String value);

  /**
   * Returns the value of the '<em><b>Problem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Problem</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Problem</em>' attribute.
   * @see #setProblem(String)
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPattern_Problem()
   * @model
   * @generated
   */
  String getProblem();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getProblem <em>Problem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Problem</em>' attribute.
   * @see #getProblem()
   * @generated
   */
  void setProblem(String value);

  /**
   * Returns the value of the '<em><b>Solution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Solution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Solution</em>' attribute.
   * @see #setSolution(String)
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPattern_Solution()
   * @model
   * @generated
   */
  String getSolution();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern#getSolution <em>Solution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Solution</em>' attribute.
   * @see #getSolution()
   * @generated
   */
  void setSolution(String value);

  /**
   * Returns the value of the '<em><b>Property Impacts</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Impacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Impacts</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPattern_PropertyImpacts()
   * @model containment="true"
   * @generated
   */
  EList<PropertyImpact> getPropertyImpacts();

  /**
   * Returns the value of the '<em><b>Pattern Impacts</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Impacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Impacts</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPattern_PatternImpacts()
   * @model containment="true"
   * @generated
   */
  EList<PatternImpact> getPatternImpacts();

  /**
   * Returns the value of the '<em><b>Related Patterns</b></em>' reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Related Patterns</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Related Patterns</em>' reference list.
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPattern_RelatedPatterns()
   * @model
   * @generated
   */
  EList<Pattern> getRelatedPatterns();

} // Pattern

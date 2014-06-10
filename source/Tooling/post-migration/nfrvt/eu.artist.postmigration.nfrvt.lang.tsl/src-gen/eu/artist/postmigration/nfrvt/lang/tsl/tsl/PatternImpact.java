/**
 */
package eu.artist.postmigration.nfrvt.lang.tsl.tsl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact#getImpact <em>Impact</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPatternImpact()
 * @model
 * @generated
 */
public interface PatternImpact extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Pattern)
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPatternImpact_Target()
   * @model
   * @generated
   */
  Pattern getTarget();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Pattern value);

  /**
   * Returns the value of the '<em><b>Impact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impact</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impact</em>' attribute.
   * @see #setImpact(BigDecimal)
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#getPatternImpact_Impact()
   * @model
   * @generated
   */
  BigDecimal getImpact();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact#getImpact <em>Impact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impact</em>' attribute.
   * @see #getImpact()
   * @generated
   */
  void setImpact(BigDecimal value);

} // PatternImpact

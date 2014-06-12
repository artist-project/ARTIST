/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel.impl;

import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalEvaluationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalEvaluationImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalEvaluationImpl#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalEvaluationImpl extends MinimalEObjectImpl.Container implements GoalEvaluation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerdict()
   * @generated
   * @ordered
   */
  protected static final Verdict VERDICT_EDEFAULT = Verdict.PASS;

  /**
   * The cached value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerdict()
   * @generated
   * @ordered
   */
  protected Verdict verdict = VERDICT_EDEFAULT;

  /**
   * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReason()
   * @generated
   * @ordered
   */
  protected static final String REASON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReason()
   * @generated
   * @ordered
   */
  protected String reason = REASON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoalEvaluationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GelPackage.Literals.GOAL_EVALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.GOAL_EVALUATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verdict getVerdict()
  {
    return verdict;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerdict(Verdict newVerdict)
  {
    Verdict oldVerdict = verdict;
    verdict = newVerdict == null ? VERDICT_EDEFAULT : newVerdict;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.GOAL_EVALUATION__VERDICT, oldVerdict, verdict));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReason()
  {
    return reason;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReason(String newReason)
  {
    String oldReason = reason;
    reason = newReason;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.GOAL_EVALUATION__REASON, oldReason, reason));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GelPackage.GOAL_EVALUATION__NAME:
        return getName();
      case GelPackage.GOAL_EVALUATION__VERDICT:
        return getVerdict();
      case GelPackage.GOAL_EVALUATION__REASON:
        return getReason();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GelPackage.GOAL_EVALUATION__NAME:
        setName((String)newValue);
        return;
      case GelPackage.GOAL_EVALUATION__VERDICT:
        setVerdict((Verdict)newValue);
        return;
      case GelPackage.GOAL_EVALUATION__REASON:
        setReason((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GelPackage.GOAL_EVALUATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GelPackage.GOAL_EVALUATION__VERDICT:
        setVerdict(VERDICT_EDEFAULT);
        return;
      case GelPackage.GOAL_EVALUATION__REASON:
        setReason(REASON_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GelPackage.GOAL_EVALUATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GelPackage.GOAL_EVALUATION__VERDICT:
        return verdict != VERDICT_EDEFAULT;
      case GelPackage.GOAL_EVALUATION__REASON:
        return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", verdict: ");
    result.append(verdict);
    result.append(", reason: ");
    result.append(reason);
    result.append(')');
    return result.toString();
  }

} //GoalEvaluationImpl

/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel.impl;

import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;

import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Model Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalModelEvaluationImpl#getGoalModel <em>Goal Model</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalModelEvaluationImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalModelEvaluationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalModelEvaluationImpl#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalModelEvaluationImpl extends MinimalEObjectImpl.Container implements GoalModelEvaluation
{
  /**
   * The cached value of the '{@link #getGoalModel() <em>Goal Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoalModel()
   * @generated
   * @ordered
   */
  protected GoalModel goalModel;

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
   * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluations()
   * @generated
   * @ordered
   */
  protected EList<GoalEvaluation> evaluations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoalModelEvaluationImpl()
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
    return GelPackage.Literals.GOAL_MODEL_EVALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalModel getGoalModel()
  {
    if (goalModel != null && goalModel.eIsProxy())
    {
      InternalEObject oldGoalModel = (InternalEObject)goalModel;
      goalModel = (GoalModel)eResolveProxy(oldGoalModel);
      if (goalModel != oldGoalModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GelPackage.GOAL_MODEL_EVALUATION__GOAL_MODEL, oldGoalModel, goalModel));
      }
    }
    return goalModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalModel basicGetGoalModel()
  {
    return goalModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoalModel(GoalModel newGoalModel)
  {
    GoalModel oldGoalModel = goalModel;
    goalModel = newGoalModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.GOAL_MODEL_EVALUATION__GOAL_MODEL, oldGoalModel, goalModel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.GOAL_MODEL_EVALUATION__VERDICT, oldVerdict, verdict));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.GOAL_MODEL_EVALUATION__REASON, oldReason, reason));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GoalEvaluation> getEvaluations()
  {
    if (evaluations == null)
    {
      evaluations = new EObjectContainmentEList<GoalEvaluation>(GoalEvaluation.class, this, GelPackage.GOAL_MODEL_EVALUATION__EVALUATIONS);
    }
    return evaluations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GelPackage.GOAL_MODEL_EVALUATION__EVALUATIONS:
        return ((InternalEList<?>)getEvaluations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GelPackage.GOAL_MODEL_EVALUATION__GOAL_MODEL:
        if (resolve) return getGoalModel();
        return basicGetGoalModel();
      case GelPackage.GOAL_MODEL_EVALUATION__VERDICT:
        return getVerdict();
      case GelPackage.GOAL_MODEL_EVALUATION__REASON:
        return getReason();
      case GelPackage.GOAL_MODEL_EVALUATION__EVALUATIONS:
        return getEvaluations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GelPackage.GOAL_MODEL_EVALUATION__GOAL_MODEL:
        setGoalModel((GoalModel)newValue);
        return;
      case GelPackage.GOAL_MODEL_EVALUATION__VERDICT:
        setVerdict((Verdict)newValue);
        return;
      case GelPackage.GOAL_MODEL_EVALUATION__REASON:
        setReason((String)newValue);
        return;
      case GelPackage.GOAL_MODEL_EVALUATION__EVALUATIONS:
        getEvaluations().clear();
        getEvaluations().addAll((Collection<? extends GoalEvaluation>)newValue);
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
      case GelPackage.GOAL_MODEL_EVALUATION__GOAL_MODEL:
        setGoalModel((GoalModel)null);
        return;
      case GelPackage.GOAL_MODEL_EVALUATION__VERDICT:
        setVerdict(VERDICT_EDEFAULT);
        return;
      case GelPackage.GOAL_MODEL_EVALUATION__REASON:
        setReason(REASON_EDEFAULT);
        return;
      case GelPackage.GOAL_MODEL_EVALUATION__EVALUATIONS:
        getEvaluations().clear();
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
      case GelPackage.GOAL_MODEL_EVALUATION__GOAL_MODEL:
        return goalModel != null;
      case GelPackage.GOAL_MODEL_EVALUATION__VERDICT:
        return verdict != VERDICT_EDEFAULT;
      case GelPackage.GOAL_MODEL_EVALUATION__REASON:
        return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
      case GelPackage.GOAL_MODEL_EVALUATION__EVALUATIONS:
        return evaluations != null && !evaluations.isEmpty();
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
    result.append(" (verdict: ");
    result.append(verdict);
    result.append(", reason: ");
    result.append(reason);
    result.append(')');
    return result.toString();
  }

} //GoalModelEvaluationImpl

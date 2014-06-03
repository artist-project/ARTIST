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

import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;

import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Goal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.CompositeGoalEvaluationImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.CompositeGoalEvaluationImpl#getConditionEvaluation <em>Condition Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeGoalEvaluationImpl extends GoalEvaluationImpl implements CompositeGoalEvaluation
{
  /**
   * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoal()
   * @generated
   * @ordered
   */
  protected CompositeGoal goal;

  /**
   * The cached value of the '{@link #getConditionEvaluation() <em>Condition Evaluation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionEvaluation()
   * @generated
   * @ordered
   */
  protected BooleanExpressionEvaluation conditionEvaluation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeGoalEvaluationImpl()
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
    return GelPackage.Literals.COMPOSITE_GOAL_EVALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeGoal getGoal()
  {
    if (goal != null && goal.eIsProxy())
    {
      InternalEObject oldGoal = (InternalEObject)goal;
      goal = (CompositeGoal)eResolveProxy(oldGoal);
      if (goal != oldGoal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GelPackage.COMPOSITE_GOAL_EVALUATION__GOAL, oldGoal, goal));
      }
    }
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeGoal basicGetGoal()
  {
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoal(CompositeGoal newGoal)
  {
    CompositeGoal oldGoal = goal;
    goal = newGoal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.COMPOSITE_GOAL_EVALUATION__GOAL, oldGoal, goal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpressionEvaluation getConditionEvaluation()
  {
    return conditionEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionEvaluation(BooleanExpressionEvaluation newConditionEvaluation, NotificationChain msgs)
  {
    BooleanExpressionEvaluation oldConditionEvaluation = conditionEvaluation;
    conditionEvaluation = newConditionEvaluation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION, oldConditionEvaluation, newConditionEvaluation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionEvaluation(BooleanExpressionEvaluation newConditionEvaluation)
  {
    if (newConditionEvaluation != conditionEvaluation)
    {
      NotificationChain msgs = null;
      if (conditionEvaluation != null)
        msgs = ((InternalEObject)conditionEvaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION, null, msgs);
      if (newConditionEvaluation != null)
        msgs = ((InternalEObject)newConditionEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION, null, msgs);
      msgs = basicSetConditionEvaluation(newConditionEvaluation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION, newConditionEvaluation, newConditionEvaluation));
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
      case GelPackage.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION:
        return basicSetConditionEvaluation(null, msgs);
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
      case GelPackage.COMPOSITE_GOAL_EVALUATION__GOAL:
        if (resolve) return getGoal();
        return basicGetGoal();
      case GelPackage.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION:
        return getConditionEvaluation();
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
      case GelPackage.COMPOSITE_GOAL_EVALUATION__GOAL:
        setGoal((CompositeGoal)newValue);
        return;
      case GelPackage.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION:
        setConditionEvaluation((BooleanExpressionEvaluation)newValue);
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
      case GelPackage.COMPOSITE_GOAL_EVALUATION__GOAL:
        setGoal((CompositeGoal)null);
        return;
      case GelPackage.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION:
        setConditionEvaluation((BooleanExpressionEvaluation)null);
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
      case GelPackage.COMPOSITE_GOAL_EVALUATION__GOAL:
        return goal != null;
      case GelPackage.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION:
        return conditionEvaluation != null;
    }
    return super.eIsSet(featureID);
  }

} //CompositeGoalEvaluationImpl

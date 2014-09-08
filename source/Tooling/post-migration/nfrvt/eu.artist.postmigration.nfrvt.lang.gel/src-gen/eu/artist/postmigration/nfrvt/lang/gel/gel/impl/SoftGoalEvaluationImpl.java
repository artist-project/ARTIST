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
import eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation;

import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soft Goal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.SoftGoalEvaluationImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.SoftGoalEvaluationImpl#getDifference <em>Difference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftGoalEvaluationImpl extends GoalEvaluationImpl implements SoftGoalEvaluation
{
  /**
   * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoal()
   * @generated
   * @ordered
   */
  protected SoftGoal goal;

  /**
   * The default value of the '{@link #getDifference() <em>Difference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifference()
   * @generated
   * @ordered
   */
  protected static final BigDecimal DIFFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDifference() <em>Difference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifference()
   * @generated
   * @ordered
   */
  protected BigDecimal difference = DIFFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SoftGoalEvaluationImpl()
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
    return GelPackage.Literals.SOFT_GOAL_EVALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoftGoal getGoal()
  {
    if (goal != null && goal.eIsProxy())
    {
      InternalEObject oldGoal = (InternalEObject)goal;
      goal = (SoftGoal)eResolveProxy(oldGoal);
      if (goal != oldGoal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GelPackage.SOFT_GOAL_EVALUATION__GOAL, oldGoal, goal));
      }
    }
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoftGoal basicGetGoal()
  {
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoal(SoftGoal newGoal)
  {
    SoftGoal oldGoal = goal;
    goal = newGoal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.SOFT_GOAL_EVALUATION__GOAL, oldGoal, goal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getDifference()
  {
    return difference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDifference(BigDecimal newDifference)
  {
    BigDecimal oldDifference = difference;
    difference = newDifference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.SOFT_GOAL_EVALUATION__DIFFERENCE, oldDifference, difference));
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
      case GelPackage.SOFT_GOAL_EVALUATION__GOAL:
        if (resolve) return getGoal();
        return basicGetGoal();
      case GelPackage.SOFT_GOAL_EVALUATION__DIFFERENCE:
        return getDifference();
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
      case GelPackage.SOFT_GOAL_EVALUATION__GOAL:
        setGoal((SoftGoal)newValue);
        return;
      case GelPackage.SOFT_GOAL_EVALUATION__DIFFERENCE:
        setDifference((BigDecimal)newValue);
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
      case GelPackage.SOFT_GOAL_EVALUATION__GOAL:
        setGoal((SoftGoal)null);
        return;
      case GelPackage.SOFT_GOAL_EVALUATION__DIFFERENCE:
        setDifference(DIFFERENCE_EDEFAULT);
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
      case GelPackage.SOFT_GOAL_EVALUATION__GOAL:
        return goal != null;
      case GelPackage.SOFT_GOAL_EVALUATION__DIFFERENCE:
        return DIFFERENCE_EDEFAULT == null ? difference != null : !DIFFERENCE_EDEFAULT.equals(difference);
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
    result.append(" (difference: ");
    result.append(difference);
    result.append(')');
    return result.toString();
  }

} //SoftGoalEvaluationImpl

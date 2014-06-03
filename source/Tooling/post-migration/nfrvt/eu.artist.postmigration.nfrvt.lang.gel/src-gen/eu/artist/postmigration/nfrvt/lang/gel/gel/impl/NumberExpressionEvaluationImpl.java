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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;

import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Expression Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.NumberExpressionEvaluationImpl#getResult <em>Result</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.NumberExpressionEvaluationImpl#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberExpressionEvaluationImpl extends ValueExpressionEvaluationImpl implements NumberExpressionEvaluation
{
  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected NumberLiteral result;

  /**
   * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluations()
   * @generated
   * @ordered
   */
  protected EList<NumberExpressionEvaluation> evaluations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberExpressionEvaluationImpl()
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
    return GelPackage.Literals.NUMBER_EXPRESSION_EVALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResult(NumberLiteral newResult, NotificationChain msgs)
  {
    NumberLiteral oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.NUMBER_EXPRESSION_EVALUATION__RESULT, oldResult, newResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(NumberLiteral newResult)
  {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.NUMBER_EXPRESSION_EVALUATION__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.NUMBER_EXPRESSION_EVALUATION__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.NUMBER_EXPRESSION_EVALUATION__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NumberExpressionEvaluation> getEvaluations()
  {
    if (evaluations == null)
    {
      evaluations = new EObjectContainmentEList<NumberExpressionEvaluation>(NumberExpressionEvaluation.class, this, GelPackage.NUMBER_EXPRESSION_EVALUATION__EVALUATIONS);
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
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__RESULT:
        return basicSetResult(null, msgs);
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__EVALUATIONS:
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
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__RESULT:
        return getResult();
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__EVALUATIONS:
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
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__RESULT:
        setResult((NumberLiteral)newValue);
        return;
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__EVALUATIONS:
        getEvaluations().clear();
        getEvaluations().addAll((Collection<? extends NumberExpressionEvaluation>)newValue);
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
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__RESULT:
        setResult((NumberLiteral)null);
        return;
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__EVALUATIONS:
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
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__RESULT:
        return result != null;
      case GelPackage.NUMBER_EXPRESSION_EVALUATION__EVALUATIONS:
        return evaluations != null && !evaluations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NumberExpressionEvaluationImpl

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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;

import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;

import java.math.BigDecimal;

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
 * An implementation of the model object '<em><b>Boolean Expression Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.BooleanExpressionEvaluationImpl#getResult <em>Result</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.BooleanExpressionEvaluationImpl#getDifference <em>Difference</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.BooleanExpressionEvaluationImpl#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanExpressionEvaluationImpl extends ValueExpressionEvaluationImpl implements BooleanExpressionEvaluation
{
  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected BooleanLiteral result;

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
   * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluations()
   * @generated
   * @ordered
   */
  protected EList<ValueExpressionEvaluation> evaluations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanExpressionEvaluationImpl()
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
    return GelPackage.Literals.BOOLEAN_EXPRESSION_EVALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResult(BooleanLiteral newResult, NotificationChain msgs)
  {
    BooleanLiteral oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.BOOLEAN_EXPRESSION_EVALUATION__RESULT, oldResult, newResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(BooleanLiteral newResult)
  {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.BOOLEAN_EXPRESSION_EVALUATION__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.BOOLEAN_EXPRESSION_EVALUATION__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.BOOLEAN_EXPRESSION_EVALUATION__RESULT, newResult, newResult));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.BOOLEAN_EXPRESSION_EVALUATION__DIFFERENCE, oldDifference, difference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ValueExpressionEvaluation> getEvaluations()
  {
    if (evaluations == null)
    {
      evaluations = new EObjectContainmentEList<ValueExpressionEvaluation>(ValueExpressionEvaluation.class, this, GelPackage.BOOLEAN_EXPRESSION_EVALUATION__EVALUATIONS);
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
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__RESULT:
        return basicSetResult(null, msgs);
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__EVALUATIONS:
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
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__RESULT:
        return getResult();
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__DIFFERENCE:
        return getDifference();
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__EVALUATIONS:
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
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__RESULT:
        setResult((BooleanLiteral)newValue);
        return;
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__DIFFERENCE:
        setDifference((BigDecimal)newValue);
        return;
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__EVALUATIONS:
        getEvaluations().clear();
        getEvaluations().addAll((Collection<? extends ValueExpressionEvaluation>)newValue);
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
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__RESULT:
        setResult((BooleanLiteral)null);
        return;
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__DIFFERENCE:
        setDifference(DIFFERENCE_EDEFAULT);
        return;
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__EVALUATIONS:
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
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__RESULT:
        return result != null;
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__DIFFERENCE:
        return DIFFERENCE_EDEFAULT == null ? difference != null : !DIFFERENCE_EDEFAULT.equals(difference);
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION__EVALUATIONS:
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
    result.append(" (difference: ");
    result.append(difference);
    result.append(')');
    return result.toString();
  }

} //BooleanExpressionEvaluationImpl

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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applied Property Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedPropertyEvaluationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedPropertyEvaluationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedPropertyEvaluationImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AppliedPropertyEvaluationImpl extends MinimalEObjectImpl.Container implements AppliedPropertyEvaluation
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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ValueSpecification value;

  /**
   * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluation()
   * @generated
   * @ordered
   */
  protected ValueExpressionEvaluation evaluation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AppliedPropertyEvaluationImpl()
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
    return GelPackage.Literals.APPLIED_PROPERTY_EVALUATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.APPLIED_PROPERTY_EVALUATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueSpecification getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ValueSpecification newValue, NotificationChain msgs)
  {
    ValueSpecification oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.APPLIED_PROPERTY_EVALUATION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ValueSpecification newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.APPLIED_PROPERTY_EVALUATION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.APPLIED_PROPERTY_EVALUATION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.APPLIED_PROPERTY_EVALUATION__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpressionEvaluation getEvaluation()
  {
    return evaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvaluation(ValueExpressionEvaluation newEvaluation, NotificationChain msgs)
  {
    ValueExpressionEvaluation oldEvaluation = evaluation;
    evaluation = newEvaluation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.APPLIED_PROPERTY_EVALUATION__EVALUATION, oldEvaluation, newEvaluation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluation(ValueExpressionEvaluation newEvaluation)
  {
    if (newEvaluation != evaluation)
    {
      NotificationChain msgs = null;
      if (evaluation != null)
        msgs = ((InternalEObject)evaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.APPLIED_PROPERTY_EVALUATION__EVALUATION, null, msgs);
      if (newEvaluation != null)
        msgs = ((InternalEObject)newEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.APPLIED_PROPERTY_EVALUATION__EVALUATION, null, msgs);
      msgs = basicSetEvaluation(newEvaluation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.APPLIED_PROPERTY_EVALUATION__EVALUATION, newEvaluation, newEvaluation));
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
      case GelPackage.APPLIED_PROPERTY_EVALUATION__VALUE:
        return basicSetValue(null, msgs);
      case GelPackage.APPLIED_PROPERTY_EVALUATION__EVALUATION:
        return basicSetEvaluation(null, msgs);
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
      case GelPackage.APPLIED_PROPERTY_EVALUATION__NAME:
        return getName();
      case GelPackage.APPLIED_PROPERTY_EVALUATION__VALUE:
        return getValue();
      case GelPackage.APPLIED_PROPERTY_EVALUATION__EVALUATION:
        return getEvaluation();
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
      case GelPackage.APPLIED_PROPERTY_EVALUATION__NAME:
        setName((String)newValue);
        return;
      case GelPackage.APPLIED_PROPERTY_EVALUATION__VALUE:
        setValue((ValueSpecification)newValue);
        return;
      case GelPackage.APPLIED_PROPERTY_EVALUATION__EVALUATION:
        setEvaluation((ValueExpressionEvaluation)newValue);
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
      case GelPackage.APPLIED_PROPERTY_EVALUATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GelPackage.APPLIED_PROPERTY_EVALUATION__VALUE:
        setValue((ValueSpecification)null);
        return;
      case GelPackage.APPLIED_PROPERTY_EVALUATION__EVALUATION:
        setEvaluation((ValueExpressionEvaluation)null);
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
      case GelPackage.APPLIED_PROPERTY_EVALUATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GelPackage.APPLIED_PROPERTY_EVALUATION__VALUE:
        return value != null;
      case GelPackage.APPLIED_PROPERTY_EVALUATION__EVALUATION:
        return evaluation != null;
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
    result.append(')');
    return result.toString();
  }

} //AppliedPropertyEvaluationImpl

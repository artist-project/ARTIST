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
package eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponential Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialFunctionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialFunctionImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExponentialFunctionImpl extends NumberFunctionImpl implements ExponentialFunction
{
  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected NumberExpression base;

  /**
   * The cached value of the '{@link #getExponent() <em>Exponent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExponent()
   * @generated
   * @ordered
   */
  protected NumberExpression exponent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExponentialFunctionImpl()
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
    return ArtistCommonPackage.Literals.EXPONENTIAL_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBase(NumberExpression newBase, NotificationChain msgs)
  {
    NumberExpression oldBase = base;
    base = newBase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArtistCommonPackage.EXPONENTIAL_FUNCTION__BASE, oldBase, newBase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(NumberExpression newBase)
  {
    if (newBase != base)
    {
      NotificationChain msgs = null;
      if (base != null)
        msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArtistCommonPackage.EXPONENTIAL_FUNCTION__BASE, null, msgs);
      if (newBase != null)
        msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArtistCommonPackage.EXPONENTIAL_FUNCTION__BASE, null, msgs);
      msgs = basicSetBase(newBase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArtistCommonPackage.EXPONENTIAL_FUNCTION__BASE, newBase, newBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression getExponent()
  {
    return exponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExponent(NumberExpression newExponent, NotificationChain msgs)
  {
    NumberExpression oldExponent = exponent;
    exponent = newExponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArtistCommonPackage.EXPONENTIAL_FUNCTION__EXPONENT, oldExponent, newExponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExponent(NumberExpression newExponent)
  {
    if (newExponent != exponent)
    {
      NotificationChain msgs = null;
      if (exponent != null)
        msgs = ((InternalEObject)exponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArtistCommonPackage.EXPONENTIAL_FUNCTION__EXPONENT, null, msgs);
      if (newExponent != null)
        msgs = ((InternalEObject)newExponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArtistCommonPackage.EXPONENTIAL_FUNCTION__EXPONENT, null, msgs);
      msgs = basicSetExponent(newExponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArtistCommonPackage.EXPONENTIAL_FUNCTION__EXPONENT, newExponent, newExponent));
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
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__BASE:
        return basicSetBase(null, msgs);
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__EXPONENT:
        return basicSetExponent(null, msgs);
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
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__BASE:
        return getBase();
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__EXPONENT:
        return getExponent();
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
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__BASE:
        setBase((NumberExpression)newValue);
        return;
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__EXPONENT:
        setExponent((NumberExpression)newValue);
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
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__BASE:
        setBase((NumberExpression)null);
        return;
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__EXPONENT:
        setExponent((NumberExpression)null);
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
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__BASE:
        return base != null;
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION__EXPONENT:
        return exponent != null;
    }
    return super.eIsSet(featureID);
  }

} //ExponentialFunctionImpl

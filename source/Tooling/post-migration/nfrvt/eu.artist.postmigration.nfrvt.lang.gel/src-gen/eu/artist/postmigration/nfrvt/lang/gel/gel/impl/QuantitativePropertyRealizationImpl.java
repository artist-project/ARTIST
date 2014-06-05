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

import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy;

import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind;

import java.math.BigDecimal;

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
 * An implementation of the model object '<em><b>Quantitative Property Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl#getValues <em>Values</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantitativePropertyRealizationImpl extends MinimalEObjectImpl.Container implements QuantitativePropertyRealization
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
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected EvaluationStrategy strategy;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final RealizationLevelKind LEVEL_EDEFAULT = RealizationLevelKind.MODEL;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected RealizationLevelKind level = LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final RealizationTypeKind TYPE_EDEFAULT = RealizationTypeKind.CALCULATED;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RealizationTypeKind type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<ValueSpecification> values;

  /**
   * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected static final BigDecimal PRECISION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected BigDecimal precision = PRECISION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantitativePropertyRealizationImpl()
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
    return GelPackage.Literals.QUANTITATIVE_PROPERTY_REALIZATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationStrategy getStrategy()
  {
    if (strategy != null && strategy.eIsProxy())
    {
      InternalEObject oldStrategy = (InternalEObject)strategy;
      strategy = (EvaluationStrategy)eResolveProxy(oldStrategy);
      if (strategy != oldStrategy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__STRATEGY, oldStrategy, strategy));
      }
    }
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationStrategy basicGetStrategy()
  {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrategy(EvaluationStrategy newStrategy)
  {
    EvaluationStrategy oldStrategy = strategy;
    strategy = newStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__STRATEGY, oldStrategy, strategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealizationLevelKind getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(RealizationLevelKind newLevel)
  {
    RealizationLevelKind oldLevel = level;
    level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealizationTypeKind getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RealizationTypeKind newType)
  {
    RealizationTypeKind oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ValueSpecification> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this, GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getPrecision()
  {
    return precision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecision(BigDecimal newPrecision)
  {
    BigDecimal oldPrecision = precision;
    precision = newPrecision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__PRECISION, oldPrecision, precision));
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
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__NAME:
        return getName();
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__STRATEGY:
        if (resolve) return getStrategy();
        return basicGetStrategy();
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__LEVEL:
        return getLevel();
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__TYPE:
        return getType();
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__VALUES:
        return getValues();
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__PRECISION:
        return getPrecision();
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
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__NAME:
        setName((String)newValue);
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__STRATEGY:
        setStrategy((EvaluationStrategy)newValue);
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__LEVEL:
        setLevel((RealizationLevelKind)newValue);
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__TYPE:
        setType((RealizationTypeKind)newValue);
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends ValueSpecification>)newValue);
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__PRECISION:
        setPrecision((BigDecimal)newValue);
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
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__STRATEGY:
        setStrategy((EvaluationStrategy)null);
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__VALUES:
        getValues().clear();
        return;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__PRECISION:
        setPrecision(PRECISION_EDEFAULT);
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
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__STRATEGY:
        return strategy != null;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__LEVEL:
        return level != LEVEL_EDEFAULT;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__TYPE:
        return type != TYPE_EDEFAULT;
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__VALUES:
        return values != null && !values.isEmpty();
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION__PRECISION:
        return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
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
    result.append(", level: ");
    result.append(level);
    result.append(", type: ");
    result.append(type);
    result.append(", precision: ");
    result.append(precision);
    result.append(')');
    return result.toString();
  }

} //QuantitativePropertyRealizationImpl

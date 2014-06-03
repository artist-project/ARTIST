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
package eu.artist.postmigration.nfrvt.lang.gml.gml.impl;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soft Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpl#getContext <em>Context</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpl#getImpacts <em>Impacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftGoalImpl extends GoalImpl implements SoftGoal
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected AppliedQualitativeProperty property;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> context;

  /**
   * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected static final BigDecimal THRESHOLD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected BigDecimal threshold = THRESHOLD_EDEFAULT;

  /**
   * The cached value of the '{@link #getImpacts() <em>Impacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpacts()
   * @generated
   * @ordered
   */
  protected EList<SoftGoalImpact> impacts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SoftGoalImpl()
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
    return GmlPackage.Literals.SOFT_GOAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedQualitativeProperty getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (AppliedQualitativeProperty)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GmlPackage.SOFT_GOAL__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedQualitativeProperty basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(AppliedQualitativeProperty newProperty)
  {
    AppliedQualitativeProperty oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.SOFT_GOAL__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getContext()
  {
    if (context == null)
    {
      context = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, GmlPackage.SOFT_GOAL__CONTEXT);
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getThreshold()
  {
    return threshold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThreshold(BigDecimal newThreshold)
  {
    BigDecimal oldThreshold = threshold;
    threshold = newThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.SOFT_GOAL__THRESHOLD, oldThreshold, threshold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SoftGoalImpact> getImpacts()
  {
    if (impacts == null)
    {
      impacts = new EObjectContainmentEList<SoftGoalImpact>(SoftGoalImpact.class, this, GmlPackage.SOFT_GOAL__IMPACTS);
    }
    return impacts;
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
      case GmlPackage.SOFT_GOAL__IMPACTS:
        return ((InternalEList<?>)getImpacts()).basicRemove(otherEnd, msgs);
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
      case GmlPackage.SOFT_GOAL__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case GmlPackage.SOFT_GOAL__CONTEXT:
        return getContext();
      case GmlPackage.SOFT_GOAL__THRESHOLD:
        return getThreshold();
      case GmlPackage.SOFT_GOAL__IMPACTS:
        return getImpacts();
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
      case GmlPackage.SOFT_GOAL__PROPERTY:
        setProperty((AppliedQualitativeProperty)newValue);
        return;
      case GmlPackage.SOFT_GOAL__CONTEXT:
        getContext().clear();
        getContext().addAll((Collection<? extends NamedElement>)newValue);
        return;
      case GmlPackage.SOFT_GOAL__THRESHOLD:
        setThreshold((BigDecimal)newValue);
        return;
      case GmlPackage.SOFT_GOAL__IMPACTS:
        getImpacts().clear();
        getImpacts().addAll((Collection<? extends SoftGoalImpact>)newValue);
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
      case GmlPackage.SOFT_GOAL__PROPERTY:
        setProperty((AppliedQualitativeProperty)null);
        return;
      case GmlPackage.SOFT_GOAL__CONTEXT:
        getContext().clear();
        return;
      case GmlPackage.SOFT_GOAL__THRESHOLD:
        setThreshold(THRESHOLD_EDEFAULT);
        return;
      case GmlPackage.SOFT_GOAL__IMPACTS:
        getImpacts().clear();
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
      case GmlPackage.SOFT_GOAL__PROPERTY:
        return property != null;
      case GmlPackage.SOFT_GOAL__CONTEXT:
        return context != null && !context.isEmpty();
      case GmlPackage.SOFT_GOAL__THRESHOLD:
        return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
      case GmlPackage.SOFT_GOAL__IMPACTS:
        return impacts != null && !impacts.isEmpty();
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
    result.append(" (threshold: ");
    result.append(threshold);
    result.append(')');
    return result.toString();
  }

} //SoftGoalImpl

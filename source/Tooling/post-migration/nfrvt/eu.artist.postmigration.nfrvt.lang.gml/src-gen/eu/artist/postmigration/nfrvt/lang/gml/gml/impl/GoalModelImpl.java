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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Workload;

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
 * An implementation of the model object '<em><b>Goal Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalModelImpl#getWorkloads <em>Workloads</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalModelImpl#getAppliedProperties <em>Applied Properties</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalModelImpl#getGoals <em>Goals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalModelImpl extends MinimalEObjectImpl.Container implements GoalModel
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportNamespace> imports;

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
   * The cached value of the '{@link #getWorkloads() <em>Workloads</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkloads()
   * @generated
   * @ordered
   */
  protected EList<Workload> workloads;

  /**
   * The cached value of the '{@link #getAppliedProperties() <em>Applied Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppliedProperties()
   * @generated
   * @ordered
   */
  protected EList<AppliedProperty> appliedProperties;

  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected EList<Goal> goals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoalModelImpl()
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
    return GmlPackage.Literals.GOAL_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportNamespace> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportNamespace>(ImportNamespace.class, this, GmlPackage.GOAL_MODEL__IMPORTS);
    }
    return imports;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GOAL_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Workload> getWorkloads()
  {
    if (workloads == null)
    {
      workloads = new EObjectContainmentEList<Workload>(Workload.class, this, GmlPackage.GOAL_MODEL__WORKLOADS);
    }
    return workloads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AppliedProperty> getAppliedProperties()
  {
    if (appliedProperties == null)
    {
      appliedProperties = new EObjectContainmentEList<AppliedProperty>(AppliedProperty.class, this, GmlPackage.GOAL_MODEL__APPLIED_PROPERTIES);
    }
    return appliedProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getGoals()
  {
    if (goals == null)
    {
      goals = new EObjectContainmentEList<Goal>(Goal.class, this, GmlPackage.GOAL_MODEL__GOALS);
    }
    return goals;
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
      case GmlPackage.GOAL_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case GmlPackage.GOAL_MODEL__WORKLOADS:
        return ((InternalEList<?>)getWorkloads()).basicRemove(otherEnd, msgs);
      case GmlPackage.GOAL_MODEL__APPLIED_PROPERTIES:
        return ((InternalEList<?>)getAppliedProperties()).basicRemove(otherEnd, msgs);
      case GmlPackage.GOAL_MODEL__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
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
      case GmlPackage.GOAL_MODEL__IMPORTS:
        return getImports();
      case GmlPackage.GOAL_MODEL__NAME:
        return getName();
      case GmlPackage.GOAL_MODEL__WORKLOADS:
        return getWorkloads();
      case GmlPackage.GOAL_MODEL__APPLIED_PROPERTIES:
        return getAppliedProperties();
      case GmlPackage.GOAL_MODEL__GOALS:
        return getGoals();
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
      case GmlPackage.GOAL_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportNamespace>)newValue);
        return;
      case GmlPackage.GOAL_MODEL__NAME:
        setName((String)newValue);
        return;
      case GmlPackage.GOAL_MODEL__WORKLOADS:
        getWorkloads().clear();
        getWorkloads().addAll((Collection<? extends Workload>)newValue);
        return;
      case GmlPackage.GOAL_MODEL__APPLIED_PROPERTIES:
        getAppliedProperties().clear();
        getAppliedProperties().addAll((Collection<? extends AppliedProperty>)newValue);
        return;
      case GmlPackage.GOAL_MODEL__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends Goal>)newValue);
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
      case GmlPackage.GOAL_MODEL__IMPORTS:
        getImports().clear();
        return;
      case GmlPackage.GOAL_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GmlPackage.GOAL_MODEL__WORKLOADS:
        getWorkloads().clear();
        return;
      case GmlPackage.GOAL_MODEL__APPLIED_PROPERTIES:
        getAppliedProperties().clear();
        return;
      case GmlPackage.GOAL_MODEL__GOALS:
        getGoals().clear();
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
      case GmlPackage.GOAL_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case GmlPackage.GOAL_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GmlPackage.GOAL_MODEL__WORKLOADS:
        return workloads != null && !workloads.isEmpty();
      case GmlPackage.GOAL_MODEL__APPLIED_PROPERTIES:
        return appliedProperties != null && !appliedProperties.isEmpty();
      case GmlPackage.GOAL_MODEL__GOALS:
        return goals != null && !goals.isEmpty();
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

} //GoalModelImpl

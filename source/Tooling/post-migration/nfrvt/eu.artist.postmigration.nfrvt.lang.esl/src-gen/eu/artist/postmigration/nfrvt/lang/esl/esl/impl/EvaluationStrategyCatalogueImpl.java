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
package eu.artist.postmigration.nfrvt.lang.esl.esl.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace;

import eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue;

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
 * An implementation of the model object '<em><b>Evaluation Strategy Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyCatalogueImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyCatalogueImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyCatalogueImpl#getStrategies <em>Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationStrategyCatalogueImpl extends MinimalEObjectImpl.Container implements EvaluationStrategyCatalogue
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
   * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategies()
   * @generated
   * @ordered
   */
  protected EList<EvaluationStrategy> strategies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvaluationStrategyCatalogueImpl()
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
    return EslPackage.Literals.EVALUATION_STRATEGY_CATALOGUE;
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
      imports = new EObjectContainmentEList<ImportNamespace>(ImportNamespace.class, this, EslPackage.EVALUATION_STRATEGY_CATALOGUE__IMPORTS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, EslPackage.EVALUATION_STRATEGY_CATALOGUE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EvaluationStrategy> getStrategies()
  {
    if (strategies == null)
    {
      strategies = new EObjectContainmentEList<EvaluationStrategy>(EvaluationStrategy.class, this, EslPackage.EVALUATION_STRATEGY_CATALOGUE__STRATEGIES);
    }
    return strategies;
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
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__STRATEGIES:
        return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
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
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__IMPORTS:
        return getImports();
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__NAME:
        return getName();
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__STRATEGIES:
        return getStrategies();
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
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportNamespace>)newValue);
        return;
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__NAME:
        setName((String)newValue);
        return;
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__STRATEGIES:
        getStrategies().clear();
        getStrategies().addAll((Collection<? extends EvaluationStrategy>)newValue);
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
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__IMPORTS:
        getImports().clear();
        return;
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__STRATEGIES:
        getStrategies().clear();
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
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE__STRATEGIES:
        return strategies != null && !strategies.isEmpty();
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

} //EvaluationStrategyCatalogueImpl

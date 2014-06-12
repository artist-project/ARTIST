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

import eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyImpl#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EvaluationStrategyImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationStrategyImpl extends MinimalEObjectImpl.Container implements EvaluationStrategy
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
   * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaClass()
   * @generated
   * @ordered
   */
  protected JvmDeclaredType javaClass;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final EvaluationStrategyLevelKind LEVEL_EDEFAULT = EvaluationStrategyLevelKind.MODEL;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected EvaluationStrategyLevelKind level = LEVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<QuantitativeProperty> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvaluationStrategyImpl()
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
    return EslPackage.Literals.EVALUATION_STRATEGY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EslPackage.EVALUATION_STRATEGY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmDeclaredType getJavaClass()
  {
    if (javaClass != null && javaClass.eIsProxy())
    {
      InternalEObject oldJavaClass = (InternalEObject)javaClass;
      javaClass = (JvmDeclaredType)eResolveProxy(oldJavaClass);
      if (javaClass != oldJavaClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EslPackage.EVALUATION_STRATEGY__JAVA_CLASS, oldJavaClass, javaClass));
      }
    }
    return javaClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmDeclaredType basicGetJavaClass()
  {
    return javaClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaClass(JvmDeclaredType newJavaClass)
  {
    JvmDeclaredType oldJavaClass = javaClass;
    javaClass = newJavaClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EslPackage.EVALUATION_STRATEGY__JAVA_CLASS, oldJavaClass, javaClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EslPackage.EVALUATION_STRATEGY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationStrategyLevelKind getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(EvaluationStrategyLevelKind newLevel)
  {
    EvaluationStrategyLevelKind oldLevel = level;
    level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EslPackage.EVALUATION_STRATEGY__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QuantitativeProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectResolvingEList<QuantitativeProperty>(QuantitativeProperty.class, this, EslPackage.EVALUATION_STRATEGY__PROPERTIES);
    }
    return properties;
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
      case EslPackage.EVALUATION_STRATEGY__NAME:
        return getName();
      case EslPackage.EVALUATION_STRATEGY__JAVA_CLASS:
        if (resolve) return getJavaClass();
        return basicGetJavaClass();
      case EslPackage.EVALUATION_STRATEGY__DESCRIPTION:
        return getDescription();
      case EslPackage.EVALUATION_STRATEGY__LEVEL:
        return getLevel();
      case EslPackage.EVALUATION_STRATEGY__PROPERTIES:
        return getProperties();
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
      case EslPackage.EVALUATION_STRATEGY__NAME:
        setName((String)newValue);
        return;
      case EslPackage.EVALUATION_STRATEGY__JAVA_CLASS:
        setJavaClass((JvmDeclaredType)newValue);
        return;
      case EslPackage.EVALUATION_STRATEGY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case EslPackage.EVALUATION_STRATEGY__LEVEL:
        setLevel((EvaluationStrategyLevelKind)newValue);
        return;
      case EslPackage.EVALUATION_STRATEGY__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends QuantitativeProperty>)newValue);
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
      case EslPackage.EVALUATION_STRATEGY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EslPackage.EVALUATION_STRATEGY__JAVA_CLASS:
        setJavaClass((JvmDeclaredType)null);
        return;
      case EslPackage.EVALUATION_STRATEGY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case EslPackage.EVALUATION_STRATEGY__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case EslPackage.EVALUATION_STRATEGY__PROPERTIES:
        getProperties().clear();
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
      case EslPackage.EVALUATION_STRATEGY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EslPackage.EVALUATION_STRATEGY__JAVA_CLASS:
        return javaClass != null;
      case EslPackage.EVALUATION_STRATEGY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case EslPackage.EVALUATION_STRATEGY__LEVEL:
        return level != LEVEL_EDEFAULT;
      case EslPackage.EVALUATION_STRATEGY__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    result.append(", description: ");
    result.append(description);
    result.append(", level: ");
    result.append(level);
    result.append(')');
    return result.toString();
  }

} //EvaluationStrategyImpl

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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace;

import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;

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
 * An implementation of the model object '<em><b>Migration Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl#getPropertyEvaluations <em>Property Evaluations</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MigrationEvaluationImpl extends MinimalEObjectImpl.Container implements MigrationEvaluation
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
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransformations()
   * @generated
   * @ordered
   */
  protected EList<Transformation> transformations;

  /**
   * The cached value of the '{@link #getPropertyEvaluations() <em>Property Evaluations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyEvaluations()
   * @generated
   * @ordered
   */
  protected EList<AppliedPropertyEvaluation> propertyEvaluations;

  /**
   * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluation()
   * @generated
   * @ordered
   */
  protected GoalModelEvaluation evaluation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MigrationEvaluationImpl()
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
    return GelPackage.Literals.MIGRATION_EVALUATION;
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
      imports = new EObjectContainmentEList<ImportNamespace>(ImportNamespace.class, this, GelPackage.MIGRATION_EVALUATION__IMPORTS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.MIGRATION_EVALUATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.MIGRATION_EVALUATION__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transformation> getTransformations()
  {
    if (transformations == null)
    {
      transformations = new EObjectContainmentEList<Transformation>(Transformation.class, this, GelPackage.MIGRATION_EVALUATION__TRANSFORMATIONS);
    }
    return transformations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AppliedPropertyEvaluation> getPropertyEvaluations()
  {
    if (propertyEvaluations == null)
    {
      propertyEvaluations = new EObjectContainmentEList<AppliedPropertyEvaluation>(AppliedPropertyEvaluation.class, this, GelPackage.MIGRATION_EVALUATION__PROPERTY_EVALUATIONS);
    }
    return propertyEvaluations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalModelEvaluation getEvaluation()
  {
    return evaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvaluation(GoalModelEvaluation newEvaluation, NotificationChain msgs)
  {
    GoalModelEvaluation oldEvaluation = evaluation;
    evaluation = newEvaluation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.MIGRATION_EVALUATION__EVALUATION, oldEvaluation, newEvaluation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluation(GoalModelEvaluation newEvaluation)
  {
    if (newEvaluation != evaluation)
    {
      NotificationChain msgs = null;
      if (evaluation != null)
        msgs = ((InternalEObject)evaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.MIGRATION_EVALUATION__EVALUATION, null, msgs);
      if (newEvaluation != null)
        msgs = ((InternalEObject)newEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.MIGRATION_EVALUATION__EVALUATION, null, msgs);
      msgs = basicSetEvaluation(newEvaluation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.MIGRATION_EVALUATION__EVALUATION, newEvaluation, newEvaluation));
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
      case GelPackage.MIGRATION_EVALUATION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case GelPackage.MIGRATION_EVALUATION__TRANSFORMATIONS:
        return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
      case GelPackage.MIGRATION_EVALUATION__PROPERTY_EVALUATIONS:
        return ((InternalEList<?>)getPropertyEvaluations()).basicRemove(otherEnd, msgs);
      case GelPackage.MIGRATION_EVALUATION__EVALUATION:
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
      case GelPackage.MIGRATION_EVALUATION__IMPORTS:
        return getImports();
      case GelPackage.MIGRATION_EVALUATION__NAME:
        return getName();
      case GelPackage.MIGRATION_EVALUATION__DATE:
        return getDate();
      case GelPackage.MIGRATION_EVALUATION__TRANSFORMATIONS:
        return getTransformations();
      case GelPackage.MIGRATION_EVALUATION__PROPERTY_EVALUATIONS:
        return getPropertyEvaluations();
      case GelPackage.MIGRATION_EVALUATION__EVALUATION:
        return getEvaluation();
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
      case GelPackage.MIGRATION_EVALUATION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportNamespace>)newValue);
        return;
      case GelPackage.MIGRATION_EVALUATION__NAME:
        setName((String)newValue);
        return;
      case GelPackage.MIGRATION_EVALUATION__DATE:
        setDate((String)newValue);
        return;
      case GelPackage.MIGRATION_EVALUATION__TRANSFORMATIONS:
        getTransformations().clear();
        getTransformations().addAll((Collection<? extends Transformation>)newValue);
        return;
      case GelPackage.MIGRATION_EVALUATION__PROPERTY_EVALUATIONS:
        getPropertyEvaluations().clear();
        getPropertyEvaluations().addAll((Collection<? extends AppliedPropertyEvaluation>)newValue);
        return;
      case GelPackage.MIGRATION_EVALUATION__EVALUATION:
        setEvaluation((GoalModelEvaluation)newValue);
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
      case GelPackage.MIGRATION_EVALUATION__IMPORTS:
        getImports().clear();
        return;
      case GelPackage.MIGRATION_EVALUATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GelPackage.MIGRATION_EVALUATION__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case GelPackage.MIGRATION_EVALUATION__TRANSFORMATIONS:
        getTransformations().clear();
        return;
      case GelPackage.MIGRATION_EVALUATION__PROPERTY_EVALUATIONS:
        getPropertyEvaluations().clear();
        return;
      case GelPackage.MIGRATION_EVALUATION__EVALUATION:
        setEvaluation((GoalModelEvaluation)null);
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
      case GelPackage.MIGRATION_EVALUATION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case GelPackage.MIGRATION_EVALUATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GelPackage.MIGRATION_EVALUATION__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case GelPackage.MIGRATION_EVALUATION__TRANSFORMATIONS:
        return transformations != null && !transformations.isEmpty();
      case GelPackage.MIGRATION_EVALUATION__PROPERTY_EVALUATIONS:
        return propertyEvaluations != null && !propertyEvaluations.isEmpty();
      case GelPackage.MIGRATION_EVALUATION__EVALUATION:
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
    result.append(", date: ");
    result.append(date);
    result.append(')');
    return result.toString();
  }

} //MigrationEvaluationImpl

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
package eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl#getContext <em>Context</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl#getPropertyImpacts <em>Property Impacts</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl#getPatternImpacts <em>Pattern Impacts</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpl#getRelatedPatterns <em>Related Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternImpl extends MinimalEObjectImpl.Container implements Pattern
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
   * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected static final String CONTEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected String context = CONTEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getProblem() <em>Problem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProblem()
   * @generated
   * @ordered
   */
  protected static final String PROBLEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProblem() <em>Problem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProblem()
   * @generated
   * @ordered
   */
  protected String problem = PROBLEM_EDEFAULT;

  /**
   * The default value of the '{@link #getSolution() <em>Solution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSolution()
   * @generated
   * @ordered
   */
  protected static final String SOLUTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSolution() <em>Solution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSolution()
   * @generated
   * @ordered
   */
  protected String solution = SOLUTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPropertyImpacts() <em>Property Impacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyImpacts()
   * @generated
   * @ordered
   */
  protected EList<PropertyImpact> propertyImpacts;

  /**
   * The cached value of the '{@link #getPatternImpacts() <em>Pattern Impacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternImpacts()
   * @generated
   * @ordered
   */
  protected EList<PatternImpact> patternImpacts;

  /**
   * The cached value of the '{@link #getRelatedPatterns() <em>Related Patterns</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelatedPatterns()
   * @generated
   * @ordered
   */
  protected EList<Pattern> relatedPatterns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternImpl()
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
    return TslPackage.Literals.PATTERN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PATTERN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(String newContext)
  {
    String oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PATTERN__CONTEXT, oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProblem()
  {
    return problem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProblem(String newProblem)
  {
    String oldProblem = problem;
    problem = newProblem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PATTERN__PROBLEM, oldProblem, problem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSolution()
  {
    return solution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSolution(String newSolution)
  {
    String oldSolution = solution;
    solution = newSolution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PATTERN__SOLUTION, oldSolution, solution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyImpact> getPropertyImpacts()
  {
    if (propertyImpacts == null)
    {
      propertyImpacts = new EObjectContainmentEList<PropertyImpact>(PropertyImpact.class, this, TslPackage.PATTERN__PROPERTY_IMPACTS);
    }
    return propertyImpacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PatternImpact> getPatternImpacts()
  {
    if (patternImpacts == null)
    {
      patternImpacts = new EObjectContainmentEList<PatternImpact>(PatternImpact.class, this, TslPackage.PATTERN__PATTERN_IMPACTS);
    }
    return patternImpacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pattern> getRelatedPatterns()
  {
    if (relatedPatterns == null)
    {
      relatedPatterns = new EObjectResolvingEList<Pattern>(Pattern.class, this, TslPackage.PATTERN__RELATED_PATTERNS);
    }
    return relatedPatterns;
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
      case TslPackage.PATTERN__PROPERTY_IMPACTS:
        return ((InternalEList<?>)getPropertyImpacts()).basicRemove(otherEnd, msgs);
      case TslPackage.PATTERN__PATTERN_IMPACTS:
        return ((InternalEList<?>)getPatternImpacts()).basicRemove(otherEnd, msgs);
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
      case TslPackage.PATTERN__NAME:
        return getName();
      case TslPackage.PATTERN__CONTEXT:
        return getContext();
      case TslPackage.PATTERN__PROBLEM:
        return getProblem();
      case TslPackage.PATTERN__SOLUTION:
        return getSolution();
      case TslPackage.PATTERN__PROPERTY_IMPACTS:
        return getPropertyImpacts();
      case TslPackage.PATTERN__PATTERN_IMPACTS:
        return getPatternImpacts();
      case TslPackage.PATTERN__RELATED_PATTERNS:
        return getRelatedPatterns();
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
      case TslPackage.PATTERN__NAME:
        setName((String)newValue);
        return;
      case TslPackage.PATTERN__CONTEXT:
        setContext((String)newValue);
        return;
      case TslPackage.PATTERN__PROBLEM:
        setProblem((String)newValue);
        return;
      case TslPackage.PATTERN__SOLUTION:
        setSolution((String)newValue);
        return;
      case TslPackage.PATTERN__PROPERTY_IMPACTS:
        getPropertyImpacts().clear();
        getPropertyImpacts().addAll((Collection<? extends PropertyImpact>)newValue);
        return;
      case TslPackage.PATTERN__PATTERN_IMPACTS:
        getPatternImpacts().clear();
        getPatternImpacts().addAll((Collection<? extends PatternImpact>)newValue);
        return;
      case TslPackage.PATTERN__RELATED_PATTERNS:
        getRelatedPatterns().clear();
        getRelatedPatterns().addAll((Collection<? extends Pattern>)newValue);
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
      case TslPackage.PATTERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TslPackage.PATTERN__CONTEXT:
        setContext(CONTEXT_EDEFAULT);
        return;
      case TslPackage.PATTERN__PROBLEM:
        setProblem(PROBLEM_EDEFAULT);
        return;
      case TslPackage.PATTERN__SOLUTION:
        setSolution(SOLUTION_EDEFAULT);
        return;
      case TslPackage.PATTERN__PROPERTY_IMPACTS:
        getPropertyImpacts().clear();
        return;
      case TslPackage.PATTERN__PATTERN_IMPACTS:
        getPatternImpacts().clear();
        return;
      case TslPackage.PATTERN__RELATED_PATTERNS:
        getRelatedPatterns().clear();
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
      case TslPackage.PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TslPackage.PATTERN__CONTEXT:
        return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
      case TslPackage.PATTERN__PROBLEM:
        return PROBLEM_EDEFAULT == null ? problem != null : !PROBLEM_EDEFAULT.equals(problem);
      case TslPackage.PATTERN__SOLUTION:
        return SOLUTION_EDEFAULT == null ? solution != null : !SOLUTION_EDEFAULT.equals(solution);
      case TslPackage.PATTERN__PROPERTY_IMPACTS:
        return propertyImpacts != null && !propertyImpacts.isEmpty();
      case TslPackage.PATTERN__PATTERN_IMPACTS:
        return patternImpacts != null && !patternImpacts.isEmpty();
      case TslPackage.PATTERN__RELATED_PATTERNS:
        return relatedPatterns != null && !relatedPatterns.isEmpty();
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
    result.append(", context: ");
    result.append(context);
    result.append(", problem: ");
    result.append(problem);
    result.append(", solution: ");
    result.append(solution);
    result.append(')');
    return result.toString();
  }

} //PatternImpl

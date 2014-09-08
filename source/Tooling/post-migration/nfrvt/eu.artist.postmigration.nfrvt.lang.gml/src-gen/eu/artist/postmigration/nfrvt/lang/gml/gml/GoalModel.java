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
package eu.artist.postmigration.nfrvt.lang.gml.gml;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getImports <em>Imports</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getWorkloads <em>Workloads</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getAppliedProperties <em>Applied Properties</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getGoals <em>Goals</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getGoalModel()
 * @model
 * @generated
 */
public interface GoalModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getGoalModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportNamespace> getImports();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getGoalModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Workloads</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.gml.gml.Workload}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workloads</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workloads</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getGoalModel_Workloads()
   * @model containment="true"
   * @generated
   */
  EList<Workload> getWorkloads();

  /**
   * Returns the value of the '<em><b>Applied Properties</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Applied Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applied Properties</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getGoalModel_AppliedProperties()
   * @model containment="true"
   * @generated
   */
  EList<AppliedProperty> getAppliedProperties();

  /**
   * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.gml.gml.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getGoalModel_Goals()
   * @model containment="true"
   * @generated
   */
  EList<Goal> getGoals();

} // GoalModel

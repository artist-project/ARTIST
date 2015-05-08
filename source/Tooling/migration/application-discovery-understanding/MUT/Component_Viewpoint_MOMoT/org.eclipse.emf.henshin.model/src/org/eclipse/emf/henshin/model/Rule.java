/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.Rule#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Rule#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Rule#getAttributeConditions <em>Attribute Conditions</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Rule#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Rule#isCheckDangling <em>Check Dangling</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Rule#isInjectiveMatching <em>Injective Matching</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Rule#getMultiRules <em>Multi Rules</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Rule#getMultiMappings <em>Multi Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Rule#getJavaImports <em>Java Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mappingsFromLeft2Right createdNodesNotAbstract createdEdgesNotDerived deletedEdgesNotDerived'"
 * @generated
 */
public interface Rule extends Unit {
	
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Graph)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Graph getLhs();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Rule#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Graph value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Graph)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Graph getRhs();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Rule#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Graph value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule_Mappings()
	 * @model containment="true"
	 * @generated NOT
	 */
	MappingList getMappings();

	/**
	 * Returns the value of the '<em><b>Attribute Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.AttributeCondition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.model.AttributeCondition#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Conditions</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule_AttributeConditions()
	 * @see org.eclipse.emf.henshin.model.AttributeCondition#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	EList<AttributeCondition> getAttributeConditions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Rule getKernelRule();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Rule getRootRule();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Rule getMultiRule(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Get the path to multi-rule. The path starts with a direct multi-rule
	 * of this rule and ends with the argument multi-rule. If the argument
	 * rule is not a direct or indirect multi-rule of this rule, an empty
	 * list is returned.
	 * 
	 * @param multiRule a direct or indirect multi-rule of this rule.
	 * @return The path to the argument multi-rule.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Rule> getMultiRulePath(Rule multiRule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean removeEdge(Edge edge, boolean removeMapped);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean removeNode(Node node, boolean removeMapped);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean removeAttribute(Attribute attribute, boolean removeMapped);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Rule> getAllMultiRules();

	/**
	 * <!-- begin-user-doc -->
	 * Get all mappings recursively contained in this rule.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	MappingList getAllMappings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model actionDataType="org.eclipse.emf.henshin.model.Action"
	 * @generated
	 */
	EList<Node> getActionNodes(Action action);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model actionDataType="org.eclipse.emf.henshin.model.Action"
	 * @generated
	 */
	EList<Edge> getActionEdges(Action action);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Node> getParameterNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMultiRule();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Node createNode(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Edge createEdge(Node source, Node target, EReference type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canCreateEdge(Node source, Node target, EReference type);

	/**
	 * Returns the value of the '<em><b>Check Dangling</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Dangling</em>' attribute.
	 * @see #setCheckDangling(boolean)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule_CheckDangling()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheckDangling();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Rule#isCheckDangling <em>Check Dangling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Dangling</em>' attribute.
	 * @see #isCheckDangling()
	 * @generated
	 */
	void setCheckDangling(boolean value);

	/**
	 * Returns the value of the '<em><b>Injective Matching</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injective Matching</em>' attribute.
	 * @see #setInjectiveMatching(boolean)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule_InjectiveMatching()
	 * @model default="true"
	 * @generated
	 */
	boolean isInjectiveMatching();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Rule#isInjectiveMatching <em>Injective Matching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injective Matching</em>' attribute.
	 * @see #isInjectiveMatching()
	 * @generated
	 */
	void setInjectiveMatching(boolean value);

	/**
	 * Returns the value of the '<em><b>Multi Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Rules</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule_MultiRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getMultiRules();

	/**
	 * Returns the value of the '<em><b>Multi Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Mappings</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule_MultiMappings()
	 * @model containment="true"
	 * @generated NOT
	 */
	MappingList getMultiMappings();

	/**
	 * Returns the value of the '<em><b>Java Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Imports</em>' attribute list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getRule_JavaImports()
	 * @model default=""
	 * @generated
	 */
	EList<String> getJavaImports();

} // Rule

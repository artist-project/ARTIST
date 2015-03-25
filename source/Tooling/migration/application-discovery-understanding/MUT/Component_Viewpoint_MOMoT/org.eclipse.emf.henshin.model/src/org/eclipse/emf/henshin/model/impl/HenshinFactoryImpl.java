/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.impl;

import java.text.ParseException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.henshin.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HenshinFactoryImpl extends EFactoryImpl implements HenshinFactory {
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HenshinFactory init() {
		try {
			HenshinFactory theHenshinFactory = (HenshinFactory)EPackage.Registry.INSTANCE.getEFactory(HenshinPackage.eNS_URI);
			if (theHenshinFactory != null) {
				return theHenshinFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HenshinFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HenshinFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HenshinPackage.ANNOTATION: return createAnnotation();
			case HenshinPackage.MODULE: return createModule();
			case HenshinPackage.RULE: return createRule();
			case HenshinPackage.PARAMETER: return createParameter();
			case HenshinPackage.PARAMETER_MAPPING: return createParameterMapping();
			case HenshinPackage.GRAPH: return createGraph();
			case HenshinPackage.NODE: return createNode();
			case HenshinPackage.EDGE: return createEdge();
			case HenshinPackage.ATTRIBUTE: return createAttribute();
			case HenshinPackage.ATTRIBUTE_CONDITION: return createAttributeCondition();
			case HenshinPackage.MAPPING: return createMapping();
			case HenshinPackage.INDEPENDENT_UNIT: return createIndependentUnit();
			case HenshinPackage.SEQUENTIAL_UNIT: return createSequentialUnit();
			case HenshinPackage.CONDITIONAL_UNIT: return createConditionalUnit();
			case HenshinPackage.PRIORITY_UNIT: return createPriorityUnit();
			case HenshinPackage.ITERATED_UNIT: return createIteratedUnit();
			case HenshinPackage.LOOP_UNIT: return createLoopUnit();
			case HenshinPackage.NESTED_CONDITION: return createNestedCondition();
			case HenshinPackage.AND: return createAnd();
			case HenshinPackage.OR: return createOr();
			case HenshinPackage.XOR: return createXor();
			case HenshinPackage.NOT: return createNot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HenshinPackage.ACTION:
				return createActionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HenshinPackage.ACTION:
				return convertActionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Rule createRule(String name) {
		Rule rule = createRule();
		rule.setName(name);
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCondition createAttributeCondition() {
		AttributeConditionImpl attributeCondition = new AttributeConditionImpl();
		return attributeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Parameter createParameter(String name) {
		ParameterImpl parameter = new ParameterImpl();
		parameter.setName(name);
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Graph createGraph(String name) {
		GraphImpl graph = new GraphImpl();
		graph.setName(name);
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Mapping createMapping(Node origin, Node image) {
		Mapping mapping = createMapping();
		mapping.setOrigin(origin);
		mapping.setImage(image);
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Node createNode(Graph graph, EClass type, String name) {
		Node node = createNode();
		node.setType(type);
		graph.getNodes().add(node);
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Attribute createAttribute(Node node, EAttribute type, String value) {
		Attribute attribute = createAttribute();
		attribute.setNode(node);
		attribute.setType(type);
		attribute.setValue(value);
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Edge createEdge(Node source, Node target, EReference type) {
		Edge edge = createEdge();
		edge.setSource(source);
		edge.setTarget(target);
		edge.setType(type);
		edge.setGraph(source.getGraph());
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndependentUnit createIndependentUnit() {
		IndependentUnitImpl independentUnit = new IndependentUnitImpl();
		return independentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialUnit createSequentialUnit() {
		SequentialUnitImpl sequentialUnit = new SequentialUnitImpl();
		return sequentialUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalUnit createConditionalUnit() {
		ConditionalUnitImpl conditionalUnit = new ConditionalUnitImpl();
		return conditionalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityUnit createPriorityUnit() {
		PriorityUnitImpl priorityUnit = new PriorityUnitImpl();
		return priorityUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratedUnit createIteratedUnit() {
		IteratedUnitImpl iteratedUnit = new IteratedUnitImpl();
		return iteratedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopUnit createLoopUnit() {
		LoopUnitImpl loopUnit = new LoopUnitImpl();
		return loopUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedCondition createNestedCondition() {
		NestedConditionImpl nestedCondition = new NestedConditionImpl();
		return nestedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Action createActionFromString(EDataType eDataType, String value) {
		try {
			return Action.parse(value);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertActionToString(EDataType eDataType, Object value) {
		if (value==null) return null;
		return value.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMapping createParameterMapping() {
		ParameterMappingImpl parameterMapping = new ParameterMappingImpl();
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HenshinPackage getHenshinPackage() {
		return (HenshinPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HenshinPackage getPackage() {
		return HenshinPackage.eINSTANCE;
	}

} //HenshinFactoryImpl

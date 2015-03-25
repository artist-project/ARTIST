/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.henshin.HenshinModelPlugin;
import org.eclipse.emf.henshin.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the Henshin model. 
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.henshin.model.HenshinPackage
 * @generated
 */
public class HenshinValidator extends EObjectValidator {
	
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HenshinValidator INSTANCE = new HenshinValidator();
	
	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.henshin.model";
	
	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;
	
	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;
	
	/**
	 * Maps to translate OCL severity additions ("info", "warning" and "error")
	 * to corresponding enumeration values of Diagnostic, i.e. Diagnostic.INFO,
	 * Diagnostic.WARNING and Diagnostic.ERROR.
	 */
	private static final Map<String, String> HENSHIN_SEVERITY_2_DIAGNOSTIC_MAP = new HashMap<String, String>();
	static {
		HENSHIN_SEVERITY_2_DIAGNOSTIC_MAP.put("info", Integer.toString(Diagnostic.INFO));
		HENSHIN_SEVERITY_2_DIAGNOSTIC_MAP.put("warning", Integer.toString(Diagnostic.WARNING));
		HENSHIN_SEVERITY_2_DIAGNOSTIC_MAP.put("error", Integer.toString(Diagnostic.ERROR));
	}
	
	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public HenshinValidator() {
		super();
	}
	
	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return HenshinPackage.eINSTANCE;
	}
	
	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
			case HenshinPackage.MODEL_ELEMENT:
				return validateModelElement((ModelElement)value, diagnostics, context);
			case HenshinPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case HenshinPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case HenshinPackage.GRAPH_ELEMENT:
				return validateGraphElement((GraphElement)value, diagnostics, context);
			case HenshinPackage.MODULE:
				return validateModule((Module)value, diagnostics, context);
			case HenshinPackage.UNIT:
				return validateUnit((Unit)value, diagnostics, context);
			case HenshinPackage.RULE:
				return validateRule((Rule)value, diagnostics, context);
			case HenshinPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case HenshinPackage.PARAMETER_MAPPING:
				return validateParameterMapping((ParameterMapping)value, diagnostics, context);
			case HenshinPackage.GRAPH:
				return validateGraph((Graph)value, diagnostics, context);
			case HenshinPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case HenshinPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case HenshinPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case HenshinPackage.ATTRIBUTE_CONDITION:
				return validateAttributeCondition((AttributeCondition)value, diagnostics, context);
			case HenshinPackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case HenshinPackage.UNARY_UNIT:
				return validateUnaryUnit((UnaryUnit)value, diagnostics, context);
			case HenshinPackage.MULTI_UNIT:
				return validateMultiUnit((MultiUnit)value, diagnostics, context);
			case HenshinPackage.INDEPENDENT_UNIT:
				return validateIndependentUnit((IndependentUnit)value, diagnostics, context);
			case HenshinPackage.SEQUENTIAL_UNIT:
				return validateSequentialUnit((SequentialUnit)value, diagnostics, context);
			case HenshinPackage.CONDITIONAL_UNIT:
				return validateConditionalUnit((ConditionalUnit)value, diagnostics, context);
			case HenshinPackage.PRIORITY_UNIT:
				return validatePriorityUnit((PriorityUnit)value, diagnostics, context);
			case HenshinPackage.ITERATED_UNIT:
				return validateIteratedUnit((IteratedUnit)value, diagnostics, context);
			case HenshinPackage.LOOP_UNIT:
				return validateLoopUnit((LoopUnit)value, diagnostics, context);
			case HenshinPackage.FORMULA:
				return validateFormula((Formula)value, diagnostics, context);
			case HenshinPackage.NESTED_CONDITION:
				return validateNestedCondition((NestedCondition)value, diagnostics, context);
			case HenshinPackage.UNARY_FORMULA:
				return validateUnaryFormula((UnaryFormula)value, diagnostics, context);
			case HenshinPackage.BINARY_FORMULA:
				return validateBinaryFormula((BinaryFormula)value, diagnostics, context);
			case HenshinPackage.AND:
				return validateAnd((And)value, diagnostics, context);
			case HenshinPackage.OR:
				return validateOr((Or)value, diagnostics, context);
			case HenshinPackage.XOR:
				return validateXor((Xor)value, diagnostics, context);
			case HenshinPackage.NOT:
				return validateNot((Not)value, diagnostics, context);
			case HenshinPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			default:
				return true;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validateRule_mappingsFromLeft2Right(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validateRule_createdNodesNotAbstract(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validateRule_createdEdgesNotDerived(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validateRule_deletedEdgesNotDerived(rule, diagnostics, context);
		return result;
	}
	
	/**
	 * Validates the mappingsFromLeft2Right constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRule_mappingsFromLeft2Right(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Mapping m : rule.getMappings()) {
			if (m.getOrigin()!=null && m.getImage()!=null && (!m.getOrigin().getGraph().isLhs() || !m.getImage().getGraph().isRhs())) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, m, Rule.class, "mappingsFromLeft2Right", context));
				result = false;
			}
		}
		return result;
	}
	
	/**
	 * Validates the createdNodesNotAbstract constraint of '<em>Rule</em>'. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRule_createdNodesNotAbstract(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Node node : rule.getRhs().getNodes()) {
			if (node.getType()!=null && node.getType().isAbstract()) {
				if (rule.getMappings().getOrigin(node)==null) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, node, Rule.class, "createdNodesNotAbstract", context));
					result = false;
				}
			}
		}
		return result;
	}
	
	/**
	 * Validates the createdEdgesNotDerived constraint of '<em>Rule</em>'. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRule_createdEdgesNotDerived(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Edge edge : rule.getRhs().getEdges()) {
			if (edge.getType()!=null && edge.getType().isDerived()) {
				if (rule.getMappings().getOrigin(edge)==null) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, edge, Rule.class, "createdEdgesNotDerived", context));
					result = false;
				}
			}
		}
		return result;
	}
	
	/**
	 * Validates the deletedEdgesNotDerived constraint of '<em>Rule</em>'. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRule_deletedEdgesNotDerived(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Edge edge : rule.getLhs().getEdges()) {
			if (edge.getType()!=null && edge.getType().isDerived()) {
				if (rule.getMappings().getImage(edge, rule.getRhs())==null) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, edge, Rule.class, "deletedEdgesNotDerived", context));
					result = false;
				}
			}
		}
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeCondition(AttributeCondition attributeCondition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeCondition, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_nameNotEmpty(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_nameNotTypeName(parameter, diagnostics, context);
		return result;
	}
	
	/**
	 * Validates the nameNotEmpty constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateParameter_nameNotEmpty(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (parameter.getName()==null || parameter.getName().trim().length()==0) {
			diagnostics.add(createDiagnostic(Diagnostic.ERROR, parameter, Parameter.class, "nameNotEmpty", context));
			return false;
		}
		return true;
	}
	
	/**
	 * Validates the nameNotTypeName constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateParameter_nameNotTypeName(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (parameter.getName()==null) return true;
		Unit unit = parameter.getUnit();
		if (unit==null) return true;
		Module module = unit.getModule();
		if (module==null) return true;
		for (EPackage epackage : module.getImports()) {
			if (validateParameter_nameNotTypeName(parameter, diagnostics, context, epackage)) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Helper method for validateParameter_nameNotTypeName.
	 */
	private boolean validateParameter_nameNotTypeName(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context, EPackage epackage) {
		for (EClassifier classifier : epackage.getEClassifiers()) {
			if (parameter.getName().equals(classifier.getName())) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, parameter, Parameter.class, "nameNotTypeName", context));
				return false;
			}
		}
		for (EPackage sub : epackage.getESubpackages()) {
			if (!validateParameter_nameNotTypeName(parameter, diagnostics, context, sub)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraph(Graph graph, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(graph, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraph_uniqueNodeNames(graph, diagnostics, context);
		return result;
	}
	
	/**
	 * Validates the uniqueNodeNames constraint of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGraph_uniqueNodeNames(Graph graph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Node n1 : graph.getNodes()) {
			if (n1.getName()!=null && n1.getName().trim().length()!=0) {
				for (Node n2 : graph.getNodes()) {
					if (n1==n2) break;
					if (n2.getName()!=null && n1.getName().trim().equals(n2.getName().trim())) {
						diagnostics.add(createDiagnostic(Diagnostic.ERROR, n2, Graph.class, "uniqueNodeNames", context));
						result = false;
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphElement(GraphElement graphElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphElement, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule(Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(module, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(unit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(unit, diagnostics, context);
		return result;
	}

	/**
	 * Validates the parameterNamesUnique constraint of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUnit_parameterNamesUnique(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Parameter p1 : unit.getParameters()) {
			if (p1.getName()!=null && p1.getName().trim().length()!=0) {
				for (Parameter p2 : unit.getParameters()) {
					if (p1==p2) break;
					if (p2.getName()!=null && p1.getName().trim().equals(p2.getName().trim())) {
						diagnostics.add(createDiagnostic(Diagnostic.ERROR, p2, Unit.class, "parameterNamesUnique", context));
						result = false;
					}
				}
			}
		}
		return result;
	}

	/**
	 * Validates the parameterMappingsPointToDirectSubUnit constraint of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUnit_parameterMappingsPointToDirectSubUnit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		for (ParameterMapping pm : unit.getParameterMappings()) {
			if (unit.getParameters().contains(pm.getSource())) {
				if (pm.getTarget() != null && !unit.getSubUnits(false).contains(pm.getTarget().getUnit())) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, unit, Unit.class, "parameterMappingsPointToDirectSubUnit", context));
					return false;
				}
			}
			if (unit.getParameters().contains(pm.getTarget())) {
				if (pm.getSource() != null && !unit.getSubUnits(false).contains(pm.getSource().getUnit())) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, unit, Unit.class, "parameterMappingsPointToDirectSubUnit", context));
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_uniqueAttributeTypes(node, diagnostics, context);
		return result;
	}
	
	/**
	 * Validates the uniqueAttributeTypes constraint of '<em>Node</em>'. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateNode_uniqueAttributeTypes(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Attribute a1 : node.getAttributes()) {
			if (a1.getType()!=null) {
				for (Attribute a2 : node.getAttributes()) {
					if (a1==a2) break;
					if (a1.getType()==a2.getType()) {
						diagnostics.add(createDiagnostic(Diagnostic.ERROR, a2, Node.class, "uniqueAttributeTypes", context));
						result = false;
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(edge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validateEdge_equalParentGraphs(edge, diagnostics, context);
		return result;
	}
	
	/**
	 * Validates the equalParentGraphs constraint of '<em>Edge</em>'. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEdge_equalParentGraphs(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (edge.getSource()!=null && edge.getTarget()!=null) {
			if (edge.getSource().getGraph()!=edge.getGraph() || edge.getTarget().getGraph()!=edge.getGraph()) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, edge, Edge.class, "equalParentGraphs", context));
				return false;
			}
		}
		return true;
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryUnit(UnaryUnit unaryUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unaryUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(unaryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(unaryUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiUnit(MultiUnit multiUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(multiUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(multiUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndependentUnit(IndependentUnit independentUnit,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(independentUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(independentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(independentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(independentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(independentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(independentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(independentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(independentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(independentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(independentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(independentUnit, diagnostics, context);
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequentialUnit(SequentialUnit sequentialUnit,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequentialUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequentialUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequentialUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequentialUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequentialUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequentialUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequentialUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequentialUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequentialUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(sequentialUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(sequentialUnit, diagnostics, context);
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalUnit(ConditionalUnit conditionalUnit,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionalUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conditionalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conditionalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditionalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(conditionalUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(conditionalUnit, diagnostics, context);
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityUnit(PriorityUnit priorityUnit, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(priorityUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(priorityUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(priorityUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(priorityUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(priorityUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(priorityUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(priorityUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(priorityUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(priorityUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(priorityUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(priorityUnit, diagnostics, context);
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratedUnit(IteratedUnit iteratedUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(iteratedUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(iteratedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratedUnit_iterationsNotEmpty(iteratedUnit, diagnostics, context);
		return result;
	}

	/**
	 * Validates the iterationsNotEmpty constraint of '<em>Iterated Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateIteratedUnit_iterationsNotEmpty(IteratedUnit iteratedUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (iteratedUnit.getIterations()==null || iteratedUnit.getIterations().trim().length()==0) {
			diagnostics.add(createDiagnostic(Diagnostic.ERROR, iteratedUnit, Edge.class, "iterationsNotEmpty", context));
			return false;			
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopUnit(LoopUnit loopUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loopUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loopUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loopUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loopUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loopUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loopUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loopUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loopUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loopUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterNamesUnique(loopUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnit_parameterMappingsPointToDirectSubUnit(loopUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNestedCondition(NestedCondition nestedCondition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nestedCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nestedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nestedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nestedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nestedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nestedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nestedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nestedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nestedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNestedCondition_mappingOriginContainedInParentCondition(nestedCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNestedCondition_mappingImageContainedInCurrent(nestedCondition, diagnostics, context);
		return result;
	}
	
	/**
	 * Validates the mappingOriginContainedInParentCondition constraint of '<em>Nested Condition</em>'. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateNestedCondition_mappingOriginContainedInParentCondition(
			NestedCondition nestedCondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Graph graph = nestedCondition.getHost();
		if (graph != null && graph.eContainer() instanceof NestedCondition) {
			for (Mapping mapping : nestedCondition.getMappings()) {
				if (mapping.getOrigin() != null && mapping.getOrigin().getGraph() != graph) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, mapping, NestedCondition.class, "mappingOriginContainedInParentCondition", context));
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Validates the mappingImageContainedInCurrent constraint of '<em>Nested Condition</em>'. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateNestedCondition_mappingImageContainedInCurrent(
			NestedCondition nestedCondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		for (Mapping mapping : nestedCondition.getMappings()) {
			if (!nestedCondition.getConclusion().getNodes().contains(mapping.getImage())) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, mapping, NestedCondition.class, "mappingImageContainedInCurrent", context));
				return false;
			}
		}
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormula(Formula formula, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formula, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryFormula(UnaryFormula unaryFormula, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryFormula, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryFormula(BinaryFormula binaryFormula, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryFormula, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(and, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(or, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNot(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(not, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXor(Xor xor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xor, diagnostics, context);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterMapping(ParameterMapping parameterMapping,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterMapping, diagnostics, context);
	}
	
	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HenshinModelPlugin.INSTANCE;
	}

	/*
	 * Private helper for creating diagnostics.
	 */
	private Diagnostic createDiagnostic(int severity, EObject object, Class<?> targetType, String constraint, Map<Object, Object> context) {
		String typeName = targetType.getSimpleName();
		return createDiagnostic(severity, DIAGNOSTIC_SOURCE, 0,
				"_UI_GenericConstraint_diagnostic", 
				new Object[] { typeName.toLowerCase() + "_" + constraint, getObjectLabel(object, context) },
				new Object[] { object }, context, "_Constraint_Msg_" + typeName + "_" + constraint);
	}
	
	/*
	 * Private helper for creating diagnostics.
	 */
	protected BasicDiagnostic createDiagnostic(int severity, String source, int code,
			String messageKey, Object[] messageSubstitutions, Object[] data,
			Map<Object, Object> context, String additionalMessage) {

		String henshinMessage = "";

		if ((additionalMessage != null) && (additionalMessage.length() > 0))
			henshinMessage = " -- " + (additionalMessage.startsWith("_") ? getString(additionalMessage,
					messageSubstitutions) : additionalMessage);

		String message = getString(messageKey, messageSubstitutions);
		return new BasicDiagnostic(severity, source, code, message + henshinMessage, data);
	}
	
}

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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.henshin.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.henshin.model.HenshinPackage
 * @generated
 */
public class HenshinSwitch<T> {
	
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HenshinPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HenshinSwitch() {
		if (modelPackage == null) {
			modelPackage = HenshinPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HenshinPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseModelElement(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseModelElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.GRAPH_ELEMENT: {
				GraphElement graphElement = (GraphElement)theEObject;
				T result = caseGraphElement(graphElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseNamedElement(unit);
				if (result == null) result = caseModelElement(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseUnit(rule);
				if (result == null) result = caseNamedElement(rule);
				if (result == null) result = caseModelElement(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseModelElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.PARAMETER_MAPPING: {
				ParameterMapping parameterMapping = (ParameterMapping)theEObject;
				T result = caseParameterMapping(parameterMapping);
				if (result == null) result = caseModelElement(parameterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.GRAPH: {
				Graph graph = (Graph)theEObject;
				T result = caseGraph(graph);
				if (result == null) result = caseNamedElement(graph);
				if (result == null) result = caseModelElement(graph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseGraphElement(node);
				if (result == null) result = caseModelElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseModelElement(edge);
				if (result == null) result = caseGraphElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseModelElement(attribute);
				if (result == null) result = caseGraphElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.ATTRIBUTE_CONDITION: {
				AttributeCondition attributeCondition = (AttributeCondition)theEObject;
				T result = caseAttributeCondition(attributeCondition);
				if (result == null) result = caseNamedElement(attributeCondition);
				if (result == null) result = caseModelElement(attributeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = caseModelElement(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.UNARY_UNIT: {
				UnaryUnit unaryUnit = (UnaryUnit)theEObject;
				T result = caseUnaryUnit(unaryUnit);
				if (result == null) result = caseUnit(unaryUnit);
				if (result == null) result = caseNamedElement(unaryUnit);
				if (result == null) result = caseModelElement(unaryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.MULTI_UNIT: {
				MultiUnit multiUnit = (MultiUnit)theEObject;
				T result = caseMultiUnit(multiUnit);
				if (result == null) result = caseUnit(multiUnit);
				if (result == null) result = caseNamedElement(multiUnit);
				if (result == null) result = caseModelElement(multiUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.INDEPENDENT_UNIT: {
				IndependentUnit independentUnit = (IndependentUnit)theEObject;
				T result = caseIndependentUnit(independentUnit);
				if (result == null) result = caseMultiUnit(independentUnit);
				if (result == null) result = caseUnit(independentUnit);
				if (result == null) result = caseNamedElement(independentUnit);
				if (result == null) result = caseModelElement(independentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.SEQUENTIAL_UNIT: {
				SequentialUnit sequentialUnit = (SequentialUnit)theEObject;
				T result = caseSequentialUnit(sequentialUnit);
				if (result == null) result = caseMultiUnit(sequentialUnit);
				if (result == null) result = caseUnit(sequentialUnit);
				if (result == null) result = caseNamedElement(sequentialUnit);
				if (result == null) result = caseModelElement(sequentialUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.CONDITIONAL_UNIT: {
				ConditionalUnit conditionalUnit = (ConditionalUnit)theEObject;
				T result = caseConditionalUnit(conditionalUnit);
				if (result == null) result = caseUnit(conditionalUnit);
				if (result == null) result = caseNamedElement(conditionalUnit);
				if (result == null) result = caseModelElement(conditionalUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.PRIORITY_UNIT: {
				PriorityUnit priorityUnit = (PriorityUnit)theEObject;
				T result = casePriorityUnit(priorityUnit);
				if (result == null) result = caseMultiUnit(priorityUnit);
				if (result == null) result = caseUnit(priorityUnit);
				if (result == null) result = caseNamedElement(priorityUnit);
				if (result == null) result = caseModelElement(priorityUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.ITERATED_UNIT: {
				IteratedUnit iteratedUnit = (IteratedUnit)theEObject;
				T result = caseIteratedUnit(iteratedUnit);
				if (result == null) result = caseUnaryUnit(iteratedUnit);
				if (result == null) result = caseUnit(iteratedUnit);
				if (result == null) result = caseNamedElement(iteratedUnit);
				if (result == null) result = caseModelElement(iteratedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.LOOP_UNIT: {
				LoopUnit loopUnit = (LoopUnit)theEObject;
				T result = caseLoopUnit(loopUnit);
				if (result == null) result = caseUnaryUnit(loopUnit);
				if (result == null) result = caseUnit(loopUnit);
				if (result == null) result = caseNamedElement(loopUnit);
				if (result == null) result = caseModelElement(loopUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.FORMULA: {
				Formula formula = (Formula)theEObject;
				T result = caseFormula(formula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.NESTED_CONDITION: {
				NestedCondition nestedCondition = (NestedCondition)theEObject;
				T result = caseNestedCondition(nestedCondition);
				if (result == null) result = caseModelElement(nestedCondition);
				if (result == null) result = caseFormula(nestedCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.UNARY_FORMULA: {
				UnaryFormula unaryFormula = (UnaryFormula)theEObject;
				T result = caseUnaryFormula(unaryFormula);
				if (result == null) result = caseModelElement(unaryFormula);
				if (result == null) result = caseFormula(unaryFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.BINARY_FORMULA: {
				BinaryFormula binaryFormula = (BinaryFormula)theEObject;
				T result = caseBinaryFormula(binaryFormula);
				if (result == null) result = caseModelElement(binaryFormula);
				if (result == null) result = caseFormula(binaryFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBinaryFormula(and);
				if (result == null) result = caseModelElement(and);
				if (result == null) result = caseFormula(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBinaryFormula(or);
				if (result == null) result = caseModelElement(or);
				if (result == null) result = caseFormula(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.XOR: {
				Xor xor = (Xor)theEObject;
				T result = caseXor(xor);
				if (result == null) result = caseBinaryFormula(xor);
				if (result == null) result = caseModelElement(xor);
				if (result == null) result = caseFormula(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HenshinPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseUnaryFormula(not);
				if (result == null) result = caseModelElement(not);
				if (result == null) result = caseFormula(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeCondition(AttributeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphElement(GraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryUnit(UnaryUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiUnit(MultiUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Independent Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Independent Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndependentUnit(IndependentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialUnit(SequentialUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalUnit(ConditionalUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityUnit(PriorityUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterated Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterated Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratedUnit(IteratedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopUnit(LoopUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedCondition(NestedCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormula(Formula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryFormula(UnaryFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryFormula(BinaryFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXor(Xor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterMapping(ParameterMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //HenshinSwitch

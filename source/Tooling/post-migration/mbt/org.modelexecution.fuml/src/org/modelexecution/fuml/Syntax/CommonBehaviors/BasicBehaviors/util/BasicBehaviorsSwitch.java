/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Element;
import org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace;
import org.modelexecution.fuml.Syntax.Classes.Kernel.PackageableElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Type;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BehavioredClassifier;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

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
 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage
 * @generated
 */
public class BasicBehaviorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicBehaviorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorsSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicBehaviorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BasicBehaviorsPackage.OPAQUE_BEHAVIOR: {
				OpaqueBehavior opaqueBehavior = (OpaqueBehavior)theEObject;
				T result = caseOpaqueBehavior(opaqueBehavior);
				if (result == null) result = caseBehavior(opaqueBehavior);
				if (result == null) result = caseClass(opaqueBehavior);
				if (result == null) result = caseBehavioredClassifier(opaqueBehavior);
				if (result == null) result = caseClassifier(opaqueBehavior);
				if (result == null) result = caseNamespace(opaqueBehavior);
				if (result == null) result = caseType(opaqueBehavior);
				if (result == null) result = casePackageableElement(opaqueBehavior);
				if (result == null) result = caseNamedElement(opaqueBehavior);
				if (result == null) result = caseElement(opaqueBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicBehaviorsPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseClass(behavior);
				if (result == null) result = caseBehavioredClassifier(behavior);
				if (result == null) result = caseClassifier(behavior);
				if (result == null) result = caseNamespace(behavior);
				if (result == null) result = caseType(behavior);
				if (result == null) result = casePackageableElement(behavior);
				if (result == null) result = caseNamedElement(behavior);
				if (result == null) result = caseElement(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER: {
				BehavioredClassifier behavioredClassifier = (BehavioredClassifier)theEObject;
				T result = caseBehavioredClassifier(behavioredClassifier);
				if (result == null) result = caseClassifier(behavioredClassifier);
				if (result == null) result = caseNamespace(behavioredClassifier);
				if (result == null) result = caseType(behavioredClassifier);
				if (result == null) result = casePackageableElement(behavioredClassifier);
				if (result == null) result = caseNamedElement(behavioredClassifier);
				if (result == null) result = caseElement(behavioredClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicBehaviorsPackage.FUNCTION_BEHAVIOR: {
				FunctionBehavior functionBehavior = (FunctionBehavior)theEObject;
				T result = caseFunctionBehavior(functionBehavior);
				if (result == null) result = caseOpaqueBehavior(functionBehavior);
				if (result == null) result = caseBehavior(functionBehavior);
				if (result == null) result = caseClass(functionBehavior);
				if (result == null) result = caseBehavioredClassifier(functionBehavior);
				if (result == null) result = caseClassifier(functionBehavior);
				if (result == null) result = caseNamespace(functionBehavior);
				if (result == null) result = caseType(functionBehavior);
				if (result == null) result = casePackageableElement(functionBehavior);
				if (result == null) result = caseNamedElement(functionBehavior);
				if (result == null) result = caseElement(functionBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueBehavior(OpaqueBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBehavior(FunctionBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.modelexecution.fuml.Syntax.Classes.Kernel.Class object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BasicBehaviorsSwitch

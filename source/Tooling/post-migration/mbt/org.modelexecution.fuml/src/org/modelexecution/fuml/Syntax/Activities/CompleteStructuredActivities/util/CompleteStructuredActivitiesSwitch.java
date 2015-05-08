/**
 */
package org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.Action;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Element;
import org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement;

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
 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage
 * @generated
 */
public class CompleteStructuredActivitiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompleteStructuredActivitiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteStructuredActivitiesSwitch() {
		if (modelPackage == null) {
			modelPackage = CompleteStructuredActivitiesPackage.eINSTANCE;
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
			case CompleteStructuredActivitiesPackage.LOOP_NODE: {
				LoopNode loopNode = (LoopNode)theEObject;
				T result = caseLoopNode(loopNode);
				if (result == null) result = caseStructuredActivityNode(loopNode);
				if (result == null) result = caseAction(loopNode);
				if (result == null) result = caseExecutableNode(loopNode);
				if (result == null) result = caseActivityNode(loopNode);
				if (result == null) result = caseRedefinableElement(loopNode);
				if (result == null) result = caseNamedElement(loopNode);
				if (result == null) result = caseElement(loopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteStructuredActivitiesPackage.EXECUTABLE_NODE: {
				ExecutableNode executableNode = (ExecutableNode)theEObject;
				T result = caseExecutableNode(executableNode);
				if (result == null) result = caseActivityNode(executableNode);
				if (result == null) result = caseRedefinableElement(executableNode);
				if (result == null) result = caseNamedElement(executableNode);
				if (result == null) result = caseElement(executableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteStructuredActivitiesPackage.CLAUSE: {
				Clause clause = (Clause)theEObject;
				T result = caseClause(clause);
				if (result == null) result = caseElement(clause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE: {
				ConditionalNode conditionalNode = (ConditionalNode)theEObject;
				T result = caseConditionalNode(conditionalNode);
				if (result == null) result = caseStructuredActivityNode(conditionalNode);
				if (result == null) result = caseAction(conditionalNode);
				if (result == null) result = caseExecutableNode(conditionalNode);
				if (result == null) result = caseActivityNode(conditionalNode);
				if (result == null) result = caseRedefinableElement(conditionalNode);
				if (result == null) result = caseNamedElement(conditionalNode);
				if (result == null) result = caseElement(conditionalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE: {
				StructuredActivityNode structuredActivityNode = (StructuredActivityNode)theEObject;
				T result = caseStructuredActivityNode(structuredActivityNode);
				if (result == null) result = caseAction(structuredActivityNode);
				if (result == null) result = caseExecutableNode(structuredActivityNode);
				if (result == null) result = caseActivityNode(structuredActivityNode);
				if (result == null) result = caseRedefinableElement(structuredActivityNode);
				if (result == null) result = caseNamedElement(structuredActivityNode);
				if (result == null) result = caseElement(structuredActivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopNode(LoopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClause(Clause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalNode(ConditionalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredActivityNode(StructuredActivityNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
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

} //CompleteStructuredActivitiesSwitch

/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.modelexecution.fuml.Semantics.Classes.Kernel.BooleanValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.CompoundValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.DataValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Link;
import org.modelexecution.fuml.Semantics.Classes.Kernel.PrimitiveValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Reference;
import org.modelexecution.fuml.Semantics.Classes.Kernel.StringValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.StructuredValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.UnlimitedNaturalValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Value;
import org.modelexecution.fuml.Semantics.Loci.LociL1.SemanticVisitor;

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
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage
 * @generated
 */
public class KernelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KernelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelSwitch() {
		if (modelPackage == null) {
			modelPackage = KernelPackage.eINSTANCE;
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
			case KernelPackage.STRUCTURED_VALUE: {
				StructuredValue structuredValue = (StructuredValue)theEObject;
				T result = caseStructuredValue(structuredValue);
				if (result == null) result = caseValue(structuredValue);
				if (result == null) result = caseSemanticVisitor(structuredValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.FEATURE_VALUE: {
				FeatureValue featureValue = (FeatureValue)theEObject;
				T result = caseFeatureValue(featureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.UNLIMITED_NATURAL_VALUE: {
				UnlimitedNaturalValue unlimitedNaturalValue = (UnlimitedNaturalValue)theEObject;
				T result = caseUnlimitedNaturalValue(unlimitedNaturalValue);
				if (result == null) result = casePrimitiveValue(unlimitedNaturalValue);
				if (result == null) result = caseValue(unlimitedNaturalValue);
				if (result == null) result = caseSemanticVisitor(unlimitedNaturalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.PRIMITIVE_VALUE: {
				PrimitiveValue primitiveValue = (PrimitiveValue)theEObject;
				T result = casePrimitiveValue(primitiveValue);
				if (result == null) result = caseValue(primitiveValue);
				if (result == null) result = caseSemanticVisitor(primitiveValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = casePrimitiveValue(stringValue);
				if (result == null) result = caseValue(stringValue);
				if (result == null) result = caseSemanticVisitor(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseStructuredValue(reference);
				if (result == null) result = caseValue(reference);
				if (result == null) result = caseSemanticVisitor(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.OBJECT: {
				org.modelexecution.fuml.Semantics.Classes.Kernel.Object object = (org.modelexecution.fuml.Semantics.Classes.Kernel.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseExtensionalValue(object);
				if (result == null) result = caseCompoundValue(object);
				if (result == null) result = caseStructuredValue(object);
				if (result == null) result = caseValue(object);
				if (result == null) result = caseSemanticVisitor(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.EXTENSIONAL_VALUE: {
				ExtensionalValue extensionalValue = (ExtensionalValue)theEObject;
				T result = caseExtensionalValue(extensionalValue);
				if (result == null) result = caseCompoundValue(extensionalValue);
				if (result == null) result = caseStructuredValue(extensionalValue);
				if (result == null) result = caseValue(extensionalValue);
				if (result == null) result = caseSemanticVisitor(extensionalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.COMPOUND_VALUE: {
				CompoundValue compoundValue = (CompoundValue)theEObject;
				T result = caseCompoundValue(compoundValue);
				if (result == null) result = caseStructuredValue(compoundValue);
				if (result == null) result = caseValue(compoundValue);
				if (result == null) result = caseSemanticVisitor(compoundValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseExtensionalValue(link);
				if (result == null) result = caseCompoundValue(link);
				if (result == null) result = caseStructuredValue(link);
				if (result == null) result = caseValue(link);
				if (result == null) result = caseSemanticVisitor(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = casePrimitiveValue(integerValue);
				if (result == null) result = caseValue(integerValue);
				if (result == null) result = caseSemanticVisitor(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.ENUMERATION_VALUE: {
				EnumerationValue enumerationValue = (EnumerationValue)theEObject;
				T result = caseEnumerationValue(enumerationValue);
				if (result == null) result = caseValue(enumerationValue);
				if (result == null) result = caseSemanticVisitor(enumerationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.DATA_VALUE: {
				DataValue dataValue = (DataValue)theEObject;
				T result = caseDataValue(dataValue);
				if (result == null) result = caseCompoundValue(dataValue);
				if (result == null) result = caseStructuredValue(dataValue);
				if (result == null) result = caseValue(dataValue);
				if (result == null) result = caseSemanticVisitor(dataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = casePrimitiveValue(booleanValue);
				if (result == null) result = caseValue(booleanValue);
				if (result == null) result = caseSemanticVisitor(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseSemanticVisitor(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredValue(StructuredValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValue(FeatureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unlimited Natural Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unlimited Natural Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnlimitedNaturalValue(UnlimitedNaturalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveValue(PrimitiveValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(org.modelexecution.fuml.Semantics.Classes.Kernel.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensional Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensional Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionalValue(ExtensionalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundValue(CompoundValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationValue(EnumerationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValue(DataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticVisitor(SemanticVisitor object) {
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

} //KernelSwitch

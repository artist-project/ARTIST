/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsFactory;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.CallConcurrencyKind;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicBehaviorsFactoryImpl extends EFactoryImpl implements BasicBehaviorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicBehaviorsFactory init() {
		try {
			BasicBehaviorsFactory theBasicBehaviorsFactory = (BasicBehaviorsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelexecution.org/fuml/syntax/commonbehaviors/basicbehaviors"); 
			if (theBasicBehaviorsFactory != null) {
				return theBasicBehaviorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicBehaviorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorsFactoryImpl() {
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
			case BasicBehaviorsPackage.OPAQUE_BEHAVIOR: return createOpaqueBehavior();
			case BasicBehaviorsPackage.FUNCTION_BEHAVIOR: return createFunctionBehavior();
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
			case BasicBehaviorsPackage.CALL_CONCURRENCY_KIND:
				return createCallConcurrencyKindFromString(eDataType, initialValue);
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
			case BasicBehaviorsPackage.CALL_CONCURRENCY_KIND:
				return convertCallConcurrencyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBehavior createOpaqueBehavior() {
		OpaqueBehaviorImpl opaqueBehavior = new OpaqueBehaviorImpl();
		return opaqueBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior createFunctionBehavior() {
		FunctionBehaviorImpl functionBehavior = new FunctionBehaviorImpl();
		return functionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind createCallConcurrencyKindFromString(EDataType eDataType, String initialValue) {
		CallConcurrencyKind result = CallConcurrencyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallConcurrencyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorsPackage getBasicBehaviorsPackage() {
		return (BasicBehaviorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicBehaviorsPackage getPackage() {
		return BasicBehaviorsPackage.eINSTANCE;
	}

} //BasicBehaviorsFactoryImpl

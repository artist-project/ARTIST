/**
 */
package org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.BasicBehaviorsFactory
 * @model kind="package"
 * @generated
 */
public interface BasicBehaviorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasicBehaviors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/fuml/semantics/commonbehaviors/basicbehaviors";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fUML.Semantics.CommonBehaviors.BasicBehaviors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicBehaviorsPackage eINSTANCE = org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.ParameterValueImpl
	 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue#getParameter()
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue#getValues()
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_Values();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicBehaviorsFactory getBasicBehaviorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.ParameterValueImpl
		 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__PARAMETER = eINSTANCE.getParameterValue_Parameter();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__VALUES = eINSTANCE.getParameterValue_Values();

	}

} //BasicBehaviorsPackage

/**
 * <copyright>
 * Copyright (c) 2010-2013 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.wrap;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.eclipse.emf.henshin.wrap.WrapFactory
 * @model kind="package"
 * @generated
 */
public interface WrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wrap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/2013/Henshin/Wrap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WrapPackage eINSTANCE = org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.henshin.wrap.impl.WSynchronizerImpl <em>WSynchronizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.henshin.wrap.impl.WSynchronizerImpl
	 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWSynchronizer()
	 * @generated
	 */
	int WSYNCHRONIZER = 0;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSYNCHRONIZER__SYNCHRONIZE = 0;

	/**
	 * The number of structural features of the '<em>WSynchronizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSYNCHRONIZER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.henshin.wrap.impl.WObjectImpl <em>WObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.henshin.wrap.impl.WObjectImpl
	 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWObject()
	 * @generated
	 */
	int WOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT__SYNCHRONIZE = WSYNCHRONIZER__SYNCHRONIZE;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT__EOBJECT = WSYNCHRONIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT__ECLASS = WSYNCHRONIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>WMembers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT__WMEMBERS = WSYNCHRONIZER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>WObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOBJECT_FEATURE_COUNT = WSYNCHRONIZER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.henshin.wrap.impl.WMemberImpl <em>WMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.henshin.wrap.impl.WMemberImpl
	 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWMember()
	 * @generated
	 */
	int WMEMBER = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER__SYNCHRONIZE = WSYNCHRONIZER__SYNCHRONIZE;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER__ESTRUCTURAL_FEATURE = WSYNCHRONIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMEMBER_FEATURE_COUNT = WSYNCHRONIZER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.henshin.wrap.impl.WLinkImpl <em>WLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.henshin.wrap.impl.WLinkImpl
	 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWLink()
	 * @generated
	 */
	int WLINK = 3;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLINK__SYNCHRONIZE = WMEMBER__SYNCHRONIZE;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLINK__ESTRUCTURAL_FEATURE = WMEMBER__ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>WTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLINK__WTARGET = WMEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WLINK_FEATURE_COUNT = WMEMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.henshin.wrap.impl.WValueImpl <em>WValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.henshin.wrap.impl.WValueImpl
	 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWValue()
	 * @generated
	 */
	int WVALUE = 4;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVALUE__SYNCHRONIZE = WMEMBER__SYNCHRONIZE;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVALUE__ESTRUCTURAL_FEATURE = WMEMBER__ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>EValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVALUE__EVALUE = WMEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WVALUE_FEATURE_COUNT = WMEMBER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.henshin.wrap.WSynchronizer <em>WSynchronizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSynchronizer</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WSynchronizer
	 * @generated
	 */
	EClass getWSynchronizer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.henshin.wrap.WSynchronizer#isSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WSynchronizer#isSynchronize()
	 * @see #getWSynchronizer()
	 * @generated
	 */
	EAttribute getWSynchronizer_Synchronize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.henshin.wrap.WObject <em>WObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WObject</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WObject
	 * @generated
	 */
	EClass getWObject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.henshin.wrap.WObject#getEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EObject</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WObject#getEObject()
	 * @see #getWObject()
	 * @generated
	 */
	EReference getWObject_EObject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.henshin.wrap.WObject#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WObject#getEClass()
	 * @see #getWObject()
	 * @generated
	 */
	EReference getWObject_EClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.henshin.wrap.WObject#getWMembers <em>WMembers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>WMembers</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WObject#getWMembers()
	 * @see #getWObject()
	 * @generated
	 */
	EReference getWObject_WMembers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.henshin.wrap.WMember <em>WMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WMember</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WMember
	 * @generated
	 */
	EClass getWMember();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.henshin.wrap.WMember#getEStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EStructural Feature</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WMember#getEStructuralFeature()
	 * @see #getWMember()
	 * @generated
	 */
	EReference getWMember_EStructuralFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.henshin.wrap.WLink <em>WLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WLink</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WLink
	 * @generated
	 */
	EClass getWLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.henshin.wrap.WLink#getWTarget <em>WTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>WTarget</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WLink#getWTarget()
	 * @see #getWLink()
	 * @generated
	 */
	EReference getWLink_WTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.henshin.wrap.WValue <em>WValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WValue</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WValue
	 * @generated
	 */
	EClass getWValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.henshin.wrap.WValue#getEValue <em>EValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EValue</em>'.
	 * @see org.eclipse.emf.henshin.wrap.WValue#getEValue()
	 * @see #getWValue()
	 * @generated
	 */
	EAttribute getWValue_EValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WrapFactory getWrapFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.henshin.wrap.impl.WSynchronizerImpl <em>WSynchronizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.henshin.wrap.impl.WSynchronizerImpl
		 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWSynchronizer()
		 * @generated
		 */
		EClass WSYNCHRONIZER = eINSTANCE.getWSynchronizer();

		/**
		 * The meta object literal for the '<em><b>Synchronize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSYNCHRONIZER__SYNCHRONIZE = eINSTANCE.getWSynchronizer_Synchronize();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.henshin.wrap.impl.WObjectImpl <em>WObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.henshin.wrap.impl.WObjectImpl
		 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWObject()
		 * @generated
		 */
		EClass WOBJECT = eINSTANCE.getWObject();

		/**
		 * The meta object literal for the '<em><b>EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WOBJECT__EOBJECT = eINSTANCE.getWObject_EObject();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WOBJECT__ECLASS = eINSTANCE.getWObject_EClass();

		/**
		 * The meta object literal for the '<em><b>WMembers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WOBJECT__WMEMBERS = eINSTANCE.getWObject_WMembers();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.henshin.wrap.impl.WMemberImpl <em>WMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.henshin.wrap.impl.WMemberImpl
		 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWMember()
		 * @generated
		 */
		EClass WMEMBER = eINSTANCE.getWMember();

		/**
		 * The meta object literal for the '<em><b>EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WMEMBER__ESTRUCTURAL_FEATURE = eINSTANCE.getWMember_EStructuralFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.henshin.wrap.impl.WLinkImpl <em>WLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.henshin.wrap.impl.WLinkImpl
		 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWLink()
		 * @generated
		 */
		EClass WLINK = eINSTANCE.getWLink();

		/**
		 * The meta object literal for the '<em><b>WTarget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WLINK__WTARGET = eINSTANCE.getWLink_WTarget();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.henshin.wrap.impl.WValueImpl <em>WValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.henshin.wrap.impl.WValueImpl
		 * @see org.eclipse.emf.henshin.wrap.impl.WrapPackageImpl#getWValue()
		 * @generated
		 */
		EClass WVALUE = eINSTANCE.getWValue();

		/**
		 * The meta object literal for the '<em><b>EValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WVALUE__EVALUE = eINSTANCE.getWValue_EValue();

	}

} //WrapPackage

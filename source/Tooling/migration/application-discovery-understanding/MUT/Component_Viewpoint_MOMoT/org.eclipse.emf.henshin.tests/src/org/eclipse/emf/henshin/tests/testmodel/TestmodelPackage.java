/**
 */
package org.eclipse.emf.henshin.tests.testmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelFactory
 * @model kind="package"
 * @generated
 */
public class TestmodelPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "testmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/2010/Henshin/Tests";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "testmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestmodelPackage eINSTANCE = org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.henshin.tests.testmodel.cont <em>cont</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.henshin.tests.testmodel.cont
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getcont()
	 * @generated
	 */
	public static final int CONT = 0;

	/**
	 * The feature id for the '<em><b>Contains Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONT__CONTAINS_NODE = 0;

	/**
	 * The feature id for the '<em><b>Contains Val</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONT__CONTAINS_VAL = 1;

	/**
	 * The number of structural features of the '<em>cont</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.henshin.tests.testmodel.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.henshin.tests.testmodel.Node
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 1;

	/**
	 * The feature id for the '<em><b>Has Vals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__HAS_VALS = 0;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__PARENT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__CHILD_NODES = 2;

	/**
	 * The feature id for the '<em><b>Nodename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NODENAME = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.henshin.tests.testmodel.Val <em>Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.henshin.tests.testmodel.Val
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getVal()
	 * @generated
	 */
	public static final int VAL = 2;

	/**
	 * The feature id for the '<em><b>Intvl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VAL__INTVL = 0;

	/**
	 * The feature id for the '<em><b>Valname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VAL__VALNAME = 1;

	/**
	 * The feature id for the '<em><b>Intlist</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VAL__INTLIST = 2;

	/**
	 * The number of structural features of the '<em>Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VAL_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestmodelPackage() {
		super(eNS_URI, TestmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TestmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestmodelPackage init() {
		if (isInited) return (TestmodelPackage)EPackage.Registry.INSTANCE.getEPackage(TestmodelPackage.eNS_URI);

		// Obtain or create and register package
		TestmodelPackage theTestmodelPackage = (TestmodelPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestmodelPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestmodelPackage());

		isInited = true;

		// Create package meta-data objects
		theTestmodelPackage.createPackageContents();

		// Initialize created meta-data
		theTestmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestmodelPackage.eNS_URI, theTestmodelPackage);
		return theTestmodelPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.henshin.tests.testmodel.cont <em>cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cont</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.cont
	 * @generated
	 */
	public EClass getcont() {
		return contEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.henshin.tests.testmodel.cont#getContainsNode <em>Contains Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Node</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.cont#getContainsNode()
	 * @see #getcont()
	 * @generated
	 */
	public EReference getcont_ContainsNode() {
		return (EReference)contEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.henshin.tests.testmodel.cont#getContainsVal <em>Contains Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Val</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.cont#getContainsVal()
	 * @see #getcont()
	 * @generated
	 */
	public EReference getcont_ContainsVal() {
		return (EReference)contEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.henshin.tests.testmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.Node
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.henshin.tests.testmodel.Node#getHasVals <em>Has Vals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Vals</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.Node#getHasVals()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_HasVals() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.henshin.tests.testmodel.Node#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Node</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.Node#getParentNode()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_ParentNode() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.henshin.tests.testmodel.Node#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Nodes</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.Node#getChildNodes()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_ChildNodes() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.henshin.tests.testmodel.Node#getNodename <em>Nodename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nodename</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.Node#getNodename()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Nodename() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.henshin.tests.testmodel.Val <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Val</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.Val
	 * @generated
	 */
	public EClass getVal() {
		return valEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.henshin.tests.testmodel.Val#getIntvl <em>Intvl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intvl</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.Val#getIntvl()
	 * @see #getVal()
	 * @generated
	 */
	public EAttribute getVal_Intvl() {
		return (EAttribute)valEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.henshin.tests.testmodel.Val#getValname <em>Valname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valname</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.Val#getValname()
	 * @see #getVal()
	 * @generated
	 */
	public EAttribute getVal_Valname() {
		return (EAttribute)valEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.henshin.tests.testmodel.Val#getIntlist <em>Intlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Intlist</em>'.
	 * @see org.eclipse.emf.henshin.tests.testmodel.Val#getIntlist()
	 * @see #getVal()
	 * @generated
	 */
	public EAttribute getVal_Intlist() {
		return (EAttribute)valEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestmodelFactory getTestmodelFactory() {
		return (TestmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contEClass = createEClass(CONT);
		createEReference(contEClass, CONT__CONTAINS_NODE);
		createEReference(contEClass, CONT__CONTAINS_VAL);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__HAS_VALS);
		createEReference(nodeEClass, NODE__PARENT_NODE);
		createEReference(nodeEClass, NODE__CHILD_NODES);
		createEAttribute(nodeEClass, NODE__NODENAME);

		valEClass = createEClass(VAL);
		createEAttribute(valEClass, VAL__INTVL);
		createEAttribute(valEClass, VAL__VALNAME);
		createEAttribute(valEClass, VAL__INTLIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(contEClass, cont.class, "cont", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcont_ContainsNode(), this.getNode(), null, "containsNode", null, 0, -1, cont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcont_ContainsVal(), this.getVal(), null, "containsVal", null, 0, -1, cont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_HasVals(), this.getVal(), null, "hasVals", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ParentNode(), this.getNode(), this.getNode_ChildNodes(), "parentNode", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ChildNodes(), this.getNode(), this.getNode_ParentNode(), "childNodes", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Nodename(), ecorePackage.getEString(), "nodename", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valEClass, Val.class, "Val", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVal_Intvl(), ecorePackage.getEInt(), "intvl", null, 0, 1, Val.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVal_Valname(), ecorePackage.getEString(), "valname", null, 0, 1, Val.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVal_Intlist(), ecorePackage.getEInt(), "intlist", null, 0, -1, Val.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.henshin.tests.testmodel.cont <em>cont</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.henshin.tests.testmodel.cont
		 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getcont()
		 * @generated
		 */
		public static final EClass CONT = eINSTANCE.getcont();

		/**
		 * The meta object literal for the '<em><b>Contains Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONT__CONTAINS_NODE = eINSTANCE.getcont_ContainsNode();

		/**
		 * The meta object literal for the '<em><b>Contains Val</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONT__CONTAINS_VAL = eINSTANCE.getcont_ContainsVal();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.henshin.tests.testmodel.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.henshin.tests.testmodel.Node
		 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Has Vals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__HAS_VALS = eINSTANCE.getNode_HasVals();

		/**
		 * The meta object literal for the '<em><b>Parent Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__PARENT_NODE = eINSTANCE.getNode_ParentNode();

		/**
		 * The meta object literal for the '<em><b>Child Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__CHILD_NODES = eINSTANCE.getNode_ChildNodes();

		/**
		 * The meta object literal for the '<em><b>Nodename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NODENAME = eINSTANCE.getNode_Nodename();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.henshin.tests.testmodel.Val <em>Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.henshin.tests.testmodel.Val
		 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getVal()
		 * @generated
		 */
		public static final EClass VAL = eINSTANCE.getVal();

		/**
		 * The meta object literal for the '<em><b>Intvl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VAL__INTVL = eINSTANCE.getVal_Intvl();

		/**
		 * The meta object literal for the '<em><b>Valname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VAL__VALNAME = eINSTANCE.getVal_Valname();

		/**
		 * The meta object literal for the '<em><b>Intlist</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VAL__INTLIST = eINSTANCE.getVal_Intlist();

	}

} //TestmodelPackage

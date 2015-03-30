/**
 */
package org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package;
import org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LociL1PackageImpl;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.impl.BasicActionsPackageImpl;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsFactory;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadExtentAction;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartObjectBehaviorAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl;
import org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;
import org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.CommunicationsPackage;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompleteActionsPackageImpl extends EPackageImpl implements CompleteActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startClassifierBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startObjectBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readExtentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readIsClassifiedObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reclassifyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEClass = null;

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
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompleteActionsPackageImpl() {
		super(eNS_URI, CompleteActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CompleteActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompleteActionsPackage init() {
		if (isInited) return (CompleteActionsPackage)EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI);

		// Obtain or create and register package
		CompleteActionsPackageImpl theCompleteActionsPackage = (CompleteActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CompleteActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CompleteActionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		CommunicationsPackageImpl theCommunicationsPackage = (CommunicationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) instanceof CommunicationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) : CommunicationsPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		CompleteStructuredActivitiesPackageImpl theCompleteStructuredActivitiesPackage = (CompleteStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompleteStructuredActivitiesPackage.eNS_URI) instanceof CompleteStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompleteStructuredActivitiesPackage.eNS_URI) : CompleteStructuredActivitiesPackage.eINSTANCE);
		ExtraStructuredActivitiesPackageImpl theExtraStructuredActivitiesPackage = (ExtraStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtraStructuredActivitiesPackage.eNS_URI) instanceof ExtraStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtraStructuredActivitiesPackage.eNS_URI) : ExtraStructuredActivitiesPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl theKernelPackage_1 = (org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage.eNS_URI) instanceof org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage.eNS_URI) : org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage.eINSTANCE);
		LociL1PackageImpl theLociL1Package = (LociL1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociL1Package.eNS_URI) instanceof LociL1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociL1Package.eNS_URI) : LociL1Package.eINSTANCE);

		// Create package meta-data objects
		theCompleteActionsPackage.createPackageContents();
		theBasicBehaviorsPackage.createPackageContents();
		theCommunicationsPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theCompleteStructuredActivitiesPackage.createPackageContents();
		theExtraStructuredActivitiesPackage.createPackageContents();
		theIntermediateActionsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theKernelPackage_1.createPackageContents();
		theLociL1Package.createPackageContents();

		// Initialize created meta-data
		theCompleteActionsPackage.initializePackageContents();
		theBasicBehaviorsPackage.initializePackageContents();
		theCommunicationsPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theCompleteStructuredActivitiesPackage.initializePackageContents();
		theExtraStructuredActivitiesPackage.initializePackageContents();
		theIntermediateActionsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theKernelPackage_1.initializePackageContents();
		theLociL1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompleteActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompleteActionsPackage.eNS_URI, theCompleteActionsPackage);
		return theCompleteActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartClassifierBehaviorAction() {
		return startClassifierBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartClassifierBehaviorAction_Object() {
		return (EReference)startClassifierBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartObjectBehaviorAction() {
		return startObjectBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartObjectBehaviorAction_Object() {
		return (EReference)startObjectBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduceAction() {
		return reduceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Reducer() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Result() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Collection() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReduceAction_Ordered() {
		return (EAttribute)reduceActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadExtentAction() {
		return readExtentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Result() {
		return (EReference)readExtentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Classifier() {
		return (EReference)readExtentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadIsClassifiedObjectAction() {
		return readIsClassifiedObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadIsClassifiedObjectAction_Direct() {
		return (EAttribute)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Classifier() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Result() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Object() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReclassifyObjectAction() {
		return reclassifyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReclassifyObjectAction_ReplaceAll() {
		return (EAttribute)reclassifyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_OldClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_Object() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_NewClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventAction() {
		return acceptEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptEventAction_Unmarshall() {
		return (EAttribute)acceptEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Result() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Trigger() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteActionsFactory getCompleteActionsFactory() {
		return (CompleteActionsFactory)getEFactoryInstance();
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
		startClassifierBehaviorActionEClass = createEClass(START_CLASSIFIER_BEHAVIOR_ACTION);
		createEReference(startClassifierBehaviorActionEClass, START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT);

		startObjectBehaviorActionEClass = createEClass(START_OBJECT_BEHAVIOR_ACTION);
		createEReference(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION__OBJECT);

		reduceActionEClass = createEClass(REDUCE_ACTION);
		createEReference(reduceActionEClass, REDUCE_ACTION__REDUCER);
		createEReference(reduceActionEClass, REDUCE_ACTION__RESULT);
		createEReference(reduceActionEClass, REDUCE_ACTION__COLLECTION);
		createEAttribute(reduceActionEClass, REDUCE_ACTION__ORDERED);

		readExtentActionEClass = createEClass(READ_EXTENT_ACTION);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__RESULT);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__CLASSIFIER);

		readIsClassifiedObjectActionEClass = createEClass(READ_IS_CLASSIFIED_OBJECT_ACTION);
		createEAttribute(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__DIRECT);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT);

		reclassifyObjectActionEClass = createEClass(RECLASSIFY_OBJECT_ACTION);
		createEAttribute(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__REPLACE_ALL);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OBJECT);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER);

		acceptEventActionEClass = createEClass(ACCEPT_EVENT_ACTION);
		createEAttribute(acceptEventActionEClass, ACCEPT_EVENT_ACTION__UNMARSHALL);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__RESULT);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__TRIGGER);
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

		// Obtain other dependent packages
		BasicActionsPackage theBasicActionsPackage = (BasicActionsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI);
		BasicBehaviorsPackage theBasicBehaviorsPackage = (BasicBehaviorsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI);
		KernelPackage theKernelPackage = (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		CommunicationsPackage theCommunicationsPackage = (CommunicationsPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		startClassifierBehaviorActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		startObjectBehaviorActionEClass.getESuperTypes().add(theBasicActionsPackage.getCallAction());
		reduceActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		readExtentActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		readIsClassifiedObjectActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		reclassifyObjectActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		acceptEventActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());

		// Initialize classes and features; add operations and parameters
		initEClass(startClassifierBehaviorActionEClass, StartClassifierBehaviorAction.class, "StartClassifierBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartClassifierBehaviorAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, StartClassifierBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startObjectBehaviorActionEClass, StartObjectBehaviorAction.class, "StartObjectBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartObjectBehaviorAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, StartObjectBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reduceActionEClass, ReduceAction.class, "ReduceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReduceAction_Reducer(), theBasicBehaviorsPackage.getBehavior(), null, "reducer", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReduceAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReduceAction_Collection(), theBasicActionsPackage.getInputPin(), null, "collection", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReduceAction_Ordered(), ecorePackage.getEBoolean(), "ordered", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readExtentActionEClass, ReadExtentAction.class, "ReadExtentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadExtentAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadExtentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadExtentAction_Classifier(), theKernelPackage.getClassifier(), null, "classifier", null, 1, 1, ReadExtentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readIsClassifiedObjectActionEClass, ReadIsClassifiedObjectAction.class, "ReadIsClassifiedObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadIsClassifiedObjectAction_Direct(), ecorePackage.getEBoolean(), "direct", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadIsClassifiedObjectAction_Classifier(), theKernelPackage.getClassifier(), null, "classifier", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadIsClassifiedObjectAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadIsClassifiedObjectAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reclassifyObjectActionEClass, ReclassifyObjectAction.class, "ReclassifyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReclassifyObjectAction_ReplaceAll(), ecorePackage.getEBoolean(), "replaceAll", null, 1, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_OldClassifier(), theKernelPackage.getClassifier(), null, "oldClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_NewClassifier(), theKernelPackage.getClassifier(), null, "newClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(acceptEventActionEClass, AcceptEventAction.class, "AcceptEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptEventAction_Unmarshall(), ecorePackage.getEBoolean(), "unmarshall", null, 1, 1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAcceptEventAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 0, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAcceptEventAction_Trigger(), theCommunicationsPackage.getTrigger(), null, "trigger", null, 1, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CompleteActionsPackageImpl

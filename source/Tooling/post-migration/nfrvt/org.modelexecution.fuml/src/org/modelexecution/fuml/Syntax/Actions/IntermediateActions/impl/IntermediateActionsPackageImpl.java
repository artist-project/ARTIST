/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package;
import org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LociL1PackageImpl;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.impl.BasicActionsPackageImpl;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateLinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyLinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsFactory;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteLinkAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction;
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
public class IntermediateActionsPackageImpl extends EPackageImpl implements IntermediateActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIdentityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSelfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndCreationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDestructionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearAssociationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStructuralFeatureValueActionEClass = null;

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
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediateActionsPackageImpl() {
		super(eNS_URI, IntermediateActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntermediateActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntermediateActionsPackage init() {
		if (isInited) return (IntermediateActionsPackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI);

		// Obtain or create and register package
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediateActionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		CommunicationsPackageImpl theCommunicationsPackage = (CommunicationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) instanceof CommunicationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) : CommunicationsPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		CompleteStructuredActivitiesPackageImpl theCompleteStructuredActivitiesPackage = (CompleteStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompleteStructuredActivitiesPackage.eNS_URI) instanceof CompleteStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompleteStructuredActivitiesPackage.eNS_URI) : CompleteStructuredActivitiesPackage.eINSTANCE);
		ExtraStructuredActivitiesPackageImpl theExtraStructuredActivitiesPackage = (ExtraStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtraStructuredActivitiesPackage.eNS_URI) instanceof ExtraStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtraStructuredActivitiesPackage.eNS_URI) : ExtraStructuredActivitiesPackage.eINSTANCE);
		CompleteActionsPackageImpl theCompleteActionsPackage = (CompleteActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI) instanceof CompleteActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI) : CompleteActionsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl theKernelPackage_1 = (org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage.eNS_URI) instanceof org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage.eNS_URI) : org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage.eINSTANCE);
		LociL1PackageImpl theLociL1Package = (LociL1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociL1Package.eNS_URI) instanceof LociL1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociL1Package.eNS_URI) : LociL1Package.eINSTANCE);

		// Create package meta-data objects
		theIntermediateActionsPackage.createPackageContents();
		theBasicBehaviorsPackage.createPackageContents();
		theCommunicationsPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theCompleteStructuredActivitiesPackage.createPackageContents();
		theExtraStructuredActivitiesPackage.createPackageContents();
		theCompleteActionsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theKernelPackage_1.createPackageContents();
		theLociL1Package.createPackageContents();

		// Initialize created meta-data
		theIntermediateActionsPackage.initializePackageContents();
		theBasicBehaviorsPackage.initializePackageContents();
		theCommunicationsPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theCompleteStructuredActivitiesPackage.initializePackageContents();
		theExtraStructuredActivitiesPackage.initializePackageContents();
		theCompleteActionsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theKernelPackage_1.initializePackageContents();
		theLociL1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediateActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediateActionsPackage.eNS_URI, theIntermediateActionsPackage);
		return theIntermediateActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureAction() {
		return structuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_StructuralFeature() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_Object() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIdentityAction() {
		return testIdentityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Second() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Result() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_First() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationAction() {
		return valueSpecificationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Value() {
		return (EReference)valueSpecificationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Result() {
		return (EReference)valueSpecificationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLinkAction() {
		return writeLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkAction() {
		return linkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_EndData() {
		return (EReference)linkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_InputValue() {
		return (EReference)linkActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndData() {
		return linkEndDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Value() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_End() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteStructuralFeatureAction() {
		return writeStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Value() {
		return (EReference)writeStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Result() {
		return (EReference)writeStructuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveStructuralFeatureValueAction() {
		return removeStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveStructuralFeatureValueAction_RemoveDuplicates() {
		return (EAttribute)removeStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveStructuralFeatureValueAction_RemoveAt() {
		return (EReference)removeStructuralFeatureValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkAction() {
		return readLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkAction_Result() {
		return (EReference)readLinkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSelfAction() {
		return readSelfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadSelfAction_Result() {
		return (EReference)readSelfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadStructuralFeatureAction() {
		return readStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadStructuralFeatureAction_Result() {
		return (EReference)readStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndCreationData() {
		return linkEndCreationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndCreationData_ReplaceAll() {
		return (EAttribute)linkEndCreationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndCreationData_InsertAt() {
		return (EReference)linkEndCreationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndDestructionData() {
		return linkEndDestructionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndDestructionData_DestroyDuplicates() {
		return (EAttribute)linkEndDestructionDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndDestructionData_DestroyAt() {
		return (EReference)linkEndDestructionDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearAssociationAction() {
		return clearAssociationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Association() {
		return (EReference)clearAssociationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Object() {
		return (EReference)clearAssociationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStructuralFeatureAction() {
		return clearStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearStructuralFeatureAction_Result() {
		return (EReference)clearStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkAction() {
		return createLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectAction() {
		return createObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Result() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Classifier() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyLinkAction() {
		return destroyLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyObjectAction() {
		return destroyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_DestroyLinks() {
		return (EAttribute)destroyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_DestroyOwnedObjects() {
		return (EAttribute)destroyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestroyObjectAction_Target() {
		return (EReference)destroyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStructuralFeatureValueAction() {
		return addStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddStructuralFeatureValueAction_ReplaceAll() {
		return (EAttribute)addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddStructuralFeatureValueAction_InsertAt() {
		return (EReference)addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateActionsFactory getIntermediateActionsFactory() {
		return (IntermediateActionsFactory)getEFactoryInstance();
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
		structuralFeatureActionEClass = createEClass(STRUCTURAL_FEATURE_ACTION);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__OBJECT);

		testIdentityActionEClass = createEClass(TEST_IDENTITY_ACTION);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__SECOND);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__RESULT);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__FIRST);

		valueSpecificationActionEClass = createEClass(VALUE_SPECIFICATION_ACTION);
		createEReference(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION__VALUE);
		createEReference(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION__RESULT);

		writeLinkActionEClass = createEClass(WRITE_LINK_ACTION);

		linkActionEClass = createEClass(LINK_ACTION);
		createEReference(linkActionEClass, LINK_ACTION__END_DATA);
		createEReference(linkActionEClass, LINK_ACTION__INPUT_VALUE);

		linkEndDataEClass = createEClass(LINK_END_DATA);
		createEReference(linkEndDataEClass, LINK_END_DATA__VALUE);
		createEReference(linkEndDataEClass, LINK_END_DATA__END);

		writeStructuralFeatureActionEClass = createEClass(WRITE_STRUCTURAL_FEATURE_ACTION);
		createEReference(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION__VALUE);
		createEReference(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION__RESULT);

		removeStructuralFeatureValueActionEClass = createEClass(REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEAttribute(removeStructuralFeatureValueActionEClass, REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_DUPLICATES);
		createEReference(removeStructuralFeatureValueActionEClass, REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT);

		readLinkActionEClass = createEClass(READ_LINK_ACTION);
		createEReference(readLinkActionEClass, READ_LINK_ACTION__RESULT);

		readSelfActionEClass = createEClass(READ_SELF_ACTION);
		createEReference(readSelfActionEClass, READ_SELF_ACTION__RESULT);

		readStructuralFeatureActionEClass = createEClass(READ_STRUCTURAL_FEATURE_ACTION);
		createEReference(readStructuralFeatureActionEClass, READ_STRUCTURAL_FEATURE_ACTION__RESULT);

		linkEndCreationDataEClass = createEClass(LINK_END_CREATION_DATA);
		createEAttribute(linkEndCreationDataEClass, LINK_END_CREATION_DATA__REPLACE_ALL);
		createEReference(linkEndCreationDataEClass, LINK_END_CREATION_DATA__INSERT_AT);

		linkEndDestructionDataEClass = createEClass(LINK_END_DESTRUCTION_DATA);
		createEAttribute(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA__DESTROY_DUPLICATES);
		createEReference(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA__DESTROY_AT);

		clearAssociationActionEClass = createEClass(CLEAR_ASSOCIATION_ACTION);
		createEReference(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION__ASSOCIATION);
		createEReference(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION__OBJECT);

		clearStructuralFeatureActionEClass = createEClass(CLEAR_STRUCTURAL_FEATURE_ACTION);
		createEReference(clearStructuralFeatureActionEClass, CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT);

		createLinkActionEClass = createEClass(CREATE_LINK_ACTION);

		createObjectActionEClass = createEClass(CREATE_OBJECT_ACTION);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__RESULT);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__CLASSIFIER);

		destroyLinkActionEClass = createEClass(DESTROY_LINK_ACTION);

		destroyObjectActionEClass = createEClass(DESTROY_OBJECT_ACTION);
		createEAttribute(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__DESTROY_LINKS);
		createEAttribute(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__DESTROY_OWNED_OBJECTS);
		createEReference(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__TARGET);

		addStructuralFeatureValueActionEClass = createEClass(ADD_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEAttribute(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REPLACE_ALL);
		createEReference(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT);
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
		KernelPackage theKernelPackage = (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		structuralFeatureActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		testIdentityActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		valueSpecificationActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		writeLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		linkActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		linkEndDataEClass.getESuperTypes().add(theKernelPackage.getElement());
		writeStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		removeStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		readLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		readSelfActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		readStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		linkEndCreationDataEClass.getESuperTypes().add(this.getLinkEndData());
		linkEndDestructionDataEClass.getESuperTypes().add(this.getLinkEndData());
		clearAssociationActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		clearStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		createLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		createObjectActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		destroyLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		destroyObjectActionEClass.getESuperTypes().add(theBasicActionsPackage.getAction());
		addStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());

		// Initialize classes and features; add operations and parameters
		initEClass(structuralFeatureActionEClass, StructuralFeatureAction.class, "StructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralFeatureAction_StructuralFeature(), theKernelPackage.getStructuralFeature(), null, "structuralFeature", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuralFeatureAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testIdentityActionEClass, TestIdentityAction.class, "TestIdentityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestIdentityAction_Second(), theBasicActionsPackage.getInputPin(), null, "second", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestIdentityAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestIdentityAction_First(), theBasicActionsPackage.getInputPin(), null, "first", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSpecificationActionEClass, ValueSpecificationAction.class, "ValueSpecificationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSpecificationAction_Value(), theKernelPackage.getValueSpecification(), null, "value", null, 1, 1, ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSpecificationAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(writeLinkActionEClass, WriteLinkAction.class, "WriteLinkAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkActionEClass, LinkAction.class, "LinkAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkAction_EndData(), this.getLinkEndData(), null, "endData", null, 2, -1, LinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkAction_InputValue(), theBasicActionsPackage.getInputPin(), null, "inputValue", null, 1, -1, LinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkEndDataEClass, LinkEndData.class, "LinkEndData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndData_Value(), theBasicActionsPackage.getInputPin(), null, "value", null, 0, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkEndData_End(), theKernelPackage.getProperty(), null, "end", null, 1, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(writeStructuralFeatureActionEClass, WriteStructuralFeatureAction.class, "WriteStructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteStructuralFeatureAction_Value(), theBasicActionsPackage.getInputPin(), null, "value", null, 0, 1, WriteStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWriteStructuralFeatureAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 0, 1, WriteStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(removeStructuralFeatureValueActionEClass, RemoveStructuralFeatureValueAction.class, "RemoveStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveStructuralFeatureValueAction_RemoveDuplicates(), ecorePackage.getEBoolean(), "removeDuplicates", null, 1, 1, RemoveStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRemoveStructuralFeatureValueAction_RemoveAt(), theBasicActionsPackage.getInputPin(), null, "removeAt", null, 0, 1, RemoveStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readLinkActionEClass, ReadLinkAction.class, "ReadLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadLinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readSelfActionEClass, ReadSelfAction.class, "ReadSelfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadSelfAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, ReadSelfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readStructuralFeatureActionEClass, ReadStructuralFeatureAction.class, "ReadStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadStructuralFeatureAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 0, 1, ReadStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkEndCreationDataEClass, LinkEndCreationData.class, "LinkEndCreationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkEndCreationData_ReplaceAll(), ecorePackage.getEBoolean(), "replaceAll", null, 1, 1, LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkEndCreationData_InsertAt(), theBasicActionsPackage.getInputPin(), null, "insertAt", null, 0, 1, LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkEndDestructionDataEClass, LinkEndDestructionData.class, "LinkEndDestructionData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkEndDestructionData_DestroyDuplicates(), ecorePackage.getEBoolean(), "destroyDuplicates", null, 1, 1, LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkEndDestructionData_DestroyAt(), theBasicActionsPackage.getInputPin(), null, "destroyAt", null, 0, 1, LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clearAssociationActionEClass, ClearAssociationAction.class, "ClearAssociationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearAssociationAction_Association(), theKernelPackage.getAssociation(), null, "association", null, 1, 1, ClearAssociationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClearAssociationAction_Object(), theBasicActionsPackage.getInputPin(), null, "object", null, 1, 1, ClearAssociationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clearStructuralFeatureActionEClass, ClearStructuralFeatureAction.class, "ClearStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearStructuralFeatureAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 0, 1, ClearStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(createLinkActionEClass, CreateLinkAction.class, "CreateLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createObjectActionEClass, CreateObjectAction.class, "CreateObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateObjectAction_Result(), theBasicActionsPackage.getOutputPin(), null, "result", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCreateObjectAction_Classifier(), theKernelPackage.getClassifier(), null, "classifier", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(destroyLinkActionEClass, DestroyLinkAction.class, "DestroyLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(destroyObjectActionEClass, DestroyObjectAction.class, "DestroyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDestroyObjectAction_DestroyLinks(), ecorePackage.getEBoolean(), "destroyLinks", null, 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDestroyObjectAction_DestroyOwnedObjects(), ecorePackage.getEBoolean(), "destroyOwnedObjects", null, 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDestroyObjectAction_Target(), theBasicActionsPackage.getInputPin(), null, "target", null, 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(addStructuralFeatureValueActionEClass, AddStructuralFeatureValueAction.class, "AddStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddStructuralFeatureValueAction_ReplaceAll(), ecorePackage.getEBoolean(), "replaceAll", null, 1, 1, AddStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAddStructuralFeatureValueAction_InsertAt(), theBasicActionsPackage.getInputPin(), null, "insertAt", null, 0, 1, AddStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IntermediateActionsPackageImpl

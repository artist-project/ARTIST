/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.modelexecution.fuml.Semantics.Classes.Kernel.BooleanValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.CompoundValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.DataValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.KernelFactory;
import org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Link;
import org.modelexecution.fuml.Semantics.Classes.Kernel.PrimitiveValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Reference;
import org.modelexecution.fuml.Semantics.Classes.Kernel.StringValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.StructuredValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.UnlimitedNaturalValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Value;
import org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package;
import org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LociL1PackageImpl;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.impl.BasicActionsPackageImpl;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl;
import org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;
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
public class KernelPackageImpl extends EPackageImpl implements KernelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlimitedNaturalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

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
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KernelPackageImpl() {
		super(eNS_URI, KernelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KernelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KernelPackage init() {
		if (isInited) return (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);

		// Obtain or create and register package
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KernelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		CommunicationsPackageImpl theCommunicationsPackage = (CommunicationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) instanceof CommunicationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationsPackage.eNS_URI) : CommunicationsPackage.eINSTANCE);
		org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl theKernelPackage_1 = (org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage.eNS_URI) instanceof org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage.eNS_URI) : org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		CompleteStructuredActivitiesPackageImpl theCompleteStructuredActivitiesPackage = (CompleteStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompleteStructuredActivitiesPackage.eNS_URI) instanceof CompleteStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompleteStructuredActivitiesPackage.eNS_URI) : CompleteStructuredActivitiesPackage.eINSTANCE);
		ExtraStructuredActivitiesPackageImpl theExtraStructuredActivitiesPackage = (ExtraStructuredActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtraStructuredActivitiesPackage.eNS_URI) instanceof ExtraStructuredActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtraStructuredActivitiesPackage.eNS_URI) : ExtraStructuredActivitiesPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		CompleteActionsPackageImpl theCompleteActionsPackage = (CompleteActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI) instanceof CompleteActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompleteActionsPackage.eNS_URI) : CompleteActionsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		LociL1PackageImpl theLociL1Package = (LociL1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociL1Package.eNS_URI) instanceof LociL1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociL1Package.eNS_URI) : LociL1Package.eINSTANCE);
		org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl theBasicBehaviorsPackage_1 = (org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eNS_URI) instanceof org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eNS_URI) : org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE);

		// Create package meta-data objects
		theKernelPackage.createPackageContents();
		theBasicBehaviorsPackage.createPackageContents();
		theCommunicationsPackage.createPackageContents();
		theKernelPackage_1.createPackageContents();
		theIntermediateActivitiesPackage.createPackageContents();
		theCompleteStructuredActivitiesPackage.createPackageContents();
		theExtraStructuredActivitiesPackage.createPackageContents();
		theIntermediateActionsPackage.createPackageContents();
		theCompleteActionsPackage.createPackageContents();
		theBasicActionsPackage.createPackageContents();
		theLociL1Package.createPackageContents();
		theBasicBehaviorsPackage_1.createPackageContents();

		// Initialize created meta-data
		theKernelPackage.initializePackageContents();
		theBasicBehaviorsPackage.initializePackageContents();
		theCommunicationsPackage.initializePackageContents();
		theKernelPackage_1.initializePackageContents();
		theIntermediateActivitiesPackage.initializePackageContents();
		theCompleteStructuredActivitiesPackage.initializePackageContents();
		theExtraStructuredActivitiesPackage.initializePackageContents();
		theIntermediateActionsPackage.initializePackageContents();
		theCompleteActionsPackage.initializePackageContents();
		theBasicActionsPackage.initializePackageContents();
		theLociL1Package.initializePackageContents();
		theBasicBehaviorsPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKernelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KernelPackage.eNS_URI, theKernelPackage);
		return theKernelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredValue() {
		return structuredValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValue() {
		return featureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_Feature() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_Values() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureValue_Position() {
		return (EAttribute)featureValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnlimitedNaturalValue() {
		return unlimitedNaturalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnlimitedNaturalValue_Value() {
		return (EAttribute)unlimitedNaturalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveValue() {
		return primitiveValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveValue_Type() {
		return (EReference)primitiveValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Referent() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Types() {
		return (EReference)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionalValue() {
		return extensionalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionalValue_Locus() {
		return (EReference)extensionalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundValue() {
		return compoundValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundValue_FeatureValues() {
		return (EReference)compoundValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Type() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationValue() {
		return enumerationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationValue_Literal() {
		return (EReference)enumerationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationValue_Type() {
		return (EReference)enumerationValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValue_Type() {
		return (EReference)dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelFactory getKernelFactory() {
		return (KernelFactory)getEFactoryInstance();
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
		structuredValueEClass = createEClass(STRUCTURED_VALUE);

		featureValueEClass = createEClass(FEATURE_VALUE);
		createEReference(featureValueEClass, FEATURE_VALUE__FEATURE);
		createEReference(featureValueEClass, FEATURE_VALUE__VALUES);
		createEAttribute(featureValueEClass, FEATURE_VALUE__POSITION);

		unlimitedNaturalValueEClass = createEClass(UNLIMITED_NATURAL_VALUE);
		createEAttribute(unlimitedNaturalValueEClass, UNLIMITED_NATURAL_VALUE__VALUE);

		primitiveValueEClass = createEClass(PRIMITIVE_VALUE);
		createEReference(primitiveValueEClass, PRIMITIVE_VALUE__TYPE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__REFERENT);

		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__TYPES);

		extensionalValueEClass = createEClass(EXTENSIONAL_VALUE);
		createEReference(extensionalValueEClass, EXTENSIONAL_VALUE__LOCUS);

		compoundValueEClass = createEClass(COMPOUND_VALUE);
		createEReference(compoundValueEClass, COMPOUND_VALUE__FEATURE_VALUES);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__TYPE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		enumerationValueEClass = createEClass(ENUMERATION_VALUE);
		createEReference(enumerationValueEClass, ENUMERATION_VALUE__LITERAL);
		createEReference(enumerationValueEClass, ENUMERATION_VALUE__TYPE);

		dataValueEClass = createEClass(DATA_VALUE);
		createEReference(dataValueEClass, DATA_VALUE__TYPE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		valueEClass = createEClass(VALUE);
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
		org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage theKernelPackage_1 = (org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage)EPackage.Registry.INSTANCE.getEPackage(org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage.eNS_URI);
		LociL1Package theLociL1Package = (LociL1Package)EPackage.Registry.INSTANCE.getEPackage(LociL1Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		structuredValueEClass.getESuperTypes().add(this.getValue());
		unlimitedNaturalValueEClass.getESuperTypes().add(this.getPrimitiveValue());
		primitiveValueEClass.getESuperTypes().add(this.getValue());
		stringValueEClass.getESuperTypes().add(this.getPrimitiveValue());
		referenceEClass.getESuperTypes().add(this.getStructuredValue());
		objectEClass.getESuperTypes().add(this.getExtensionalValue());
		extensionalValueEClass.getESuperTypes().add(this.getCompoundValue());
		compoundValueEClass.getESuperTypes().add(this.getStructuredValue());
		linkEClass.getESuperTypes().add(this.getExtensionalValue());
		integerValueEClass.getESuperTypes().add(this.getPrimitiveValue());
		enumerationValueEClass.getESuperTypes().add(this.getValue());
		dataValueEClass.getESuperTypes().add(this.getCompoundValue());
		booleanValueEClass.getESuperTypes().add(this.getPrimitiveValue());
		valueEClass.getESuperTypes().add(theLociL1Package.getSemanticVisitor());

		// Initialize classes and features; add operations and parameters
		initEClass(structuredValueEClass, StructuredValue.class, "StructuredValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureValueEClass, FeatureValue.class, "FeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValue_Feature(), theKernelPackage_1.getStructuralFeature(), null, "feature", null, 1, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureValue_Values(), this.getValue(), null, "values", null, 0, -1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureValue_Position(), ecorePackage.getEInt(), "position", null, 0, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unlimitedNaturalValueEClass, UnlimitedNaturalValue.class, "UnlimitedNaturalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnlimitedNaturalValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, UnlimitedNaturalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveValueEClass, PrimitiveValue.class, "PrimitiveValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveValue_Type(), theKernelPackage_1.getPrimitiveType(), null, "type", null, 1, 1, PrimitiveValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Referent(), this.getObject(), null, "referent", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectEClass, org.modelexecution.fuml.Semantics.Classes.Kernel.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObject_Types(), theKernelPackage_1.getClass_(), null, "types", null, 0, -1, org.modelexecution.fuml.Semantics.Classes.Kernel.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extensionalValueEClass, ExtensionalValue.class, "ExtensionalValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionalValue_Locus(), theLociL1Package.getLocus(), theLociL1Package.getLocus_ExtensionalValues(), "locus", null, 0, 1, ExtensionalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(compoundValueEClass, CompoundValue.class, "CompoundValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundValue_FeatureValues(), this.getFeatureValue(), null, "featureValues", null, 0, -1, CompoundValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Type(), theKernelPackage_1.getAssociation(), null, "type", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumerationValueEClass, EnumerationValue.class, "EnumerationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationValue_Literal(), theKernelPackage_1.getEnumerationLiteral(), null, "literal", null, 1, 1, EnumerationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnumerationValue_Type(), theKernelPackage_1.getEnumeration(), null, "type", null, 1, 1, EnumerationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataValueEClass, DataValue.class, "DataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataValue_Type(), theKernelPackage_1.getDataType(), null, "type", null, 1, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KernelPackageImpl

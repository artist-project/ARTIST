/**
 */
package eu.artist.migration.mut.slicing.sim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.artist.migration.mut.slicing.sim.SimFactory
 * @model kind="package"
 * @generated
 */
public interface SimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eu.artist.migration.mut.slicing/sim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimPackage eINSTANCE = eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl <em>Slicing Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl
	 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getSlicingIntent()
	 * @generated
	 */
	int SLICING_INTENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_INTENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_INTENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Inject</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_INTENT__INJECT = 2;

	/**
	 * The feature id for the '<em><b>Extract</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_INTENT__EXTRACT = 3;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_INTENT__CRITERIA = 4;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_INTENT__CONFIGURATION = 5;

	/**
	 * The number of structural features of the '<em>Slicing Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_INTENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Slicing Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_INTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl <em>Slicing Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl
	 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getSlicingCriterion()
	 * @generated
	 */
	int SLICING_CRITERION = 1;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CRITERION__INTENT = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CRITERION__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CRITERION__VALUES = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CRITERION__ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Slicing Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CRITERION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Slicing Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CRITERION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.mut.slicing.sim.impl.FeatureValueImpl <em>Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.mut.slicing.sim.impl.FeatureValueImpl
	 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getFeatureValue()
	 * @generated
	 */
	int FEATURE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__CRITERION = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl <em>Slicing Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl
	 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getSlicingConfiguration()
	 * @generated
	 */
	int SLICING_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CONFIGURATION__INTENT = 0;

	/**
	 * The feature id for the '<em><b>Containment Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CONFIGURATION__CONTAINMENT_HIERARCHY = 1;

	/**
	 * The feature id for the '<em><b>Contained Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CONFIGURATION__CONTAINED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Generalization Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CONFIGURATION__GENERALIZATION_HIERARCHY = 3;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CONFIGURATION__REFERENCED_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Slicing Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Slicing Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICING_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.mut.slicing.sim.ContainmentHierarchy <em>Containment Hierarchy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.mut.slicing.sim.ContainmentHierarchy
	 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getContainmentHierarchy()
	 * @generated
	 */
	int CONTAINMENT_HIERARCHY = 4;

	/**
	 * The meta object id for the '{@link eu.artist.migration.mut.slicing.sim.ContainedElement <em>Contained Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.mut.slicing.sim.ContainedElement
	 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getContainedElement()
	 * @generated
	 */
	int CONTAINED_ELEMENT = 5;

	/**
	 * The meta object id for the '{@link eu.artist.migration.mut.slicing.sim.ReferencedElement <em>Referenced Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.mut.slicing.sim.ReferencedElement
	 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getReferencedElement()
	 * @generated
	 */
	int REFERENCED_ELEMENT = 6;

	/**
	 * The meta object id for the '{@link eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy <em>Generalization Hierarchy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy
	 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getGeneralizationHierarchy()
	 * @generated
	 */
	int GENERALIZATION_HIERARCHY = 7;

	/**
	 * The meta object id for the '{@link eu.artist.migration.mut.slicing.sim.ModelType <em>Model Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.mut.slicing.sim.ModelType
	 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent <em>Slicing Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slicing Intent</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingIntent
	 * @generated
	 */
	EClass getSlicingIntent();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingIntent#getName()
	 * @see #getSlicingIntent()
	 * @generated
	 */
	EAttribute getSlicingIntent_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingIntent#getDescription()
	 * @see #getSlicingIntent()
	 * @generated
	 */
	EAttribute getSlicingIntent_Description();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getInject <em>Inject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inject</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingIntent#getInject()
	 * @see #getSlicingIntent()
	 * @generated
	 */
	EAttribute getSlicingIntent_Inject();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getExtract <em>Extract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extract</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingIntent#getExtract()
	 * @see #getSlicingIntent()
	 * @generated
	 */
	EAttribute getSlicingIntent_Extract();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingIntent#getCriteria()
	 * @see #getSlicingIntent()
	 * @generated
	 */
	EReference getSlicingIntent_Criteria();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingIntent#getConfiguration()
	 * @see #getSlicingIntent()
	 * @generated
	 */
	EReference getSlicingIntent_Configuration();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion <em>Slicing Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slicing Criterion</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingCriterion
	 * @generated
	 */
	EClass getSlicingCriterion();

	/**
	 * Returns the meta object for the container reference '{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Intent</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingCriterion#getIntent()
	 * @see #getSlicingCriterion()
	 * @generated
	 */
	EReference getSlicingCriterion_Intent();

	/**
	 * Returns the meta object for the reference list '{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingCriterion#getFeatures()
	 * @see #getSlicingCriterion()
	 * @generated
	 */
	EReference getSlicingCriterion_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingCriterion#getValues()
	 * @see #getSlicingCriterion()
	 * @generated
	 */
	EReference getSlicingCriterion_Values();

	/**
	 * Returns the meta object for the reference list '{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingCriterion#getElement()
	 * @see #getSlicingCriterion()
	 * @generated
	 */
	EReference getSlicingCriterion_Element();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.mut.slicing.sim.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.FeatureValue
	 * @generated
	 */
	EClass getFeatureValue();

	/**
	 * Returns the meta object for the container reference '{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Criterion</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.FeatureValue#getCriterion()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Criterion();

	/**
	 * Returns the meta object for the reference '{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.FeatureValue#getFeature()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Feature();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.FeatureValue#getValue()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EAttribute getFeatureValue_Value();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration <em>Slicing Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slicing Configuration</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingConfiguration
	 * @generated
	 */
	EClass getSlicingConfiguration();

	/**
	 * Returns the meta object for the container reference '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Intent</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getIntent()
	 * @see #getSlicingConfiguration()
	 * @generated
	 */
	EReference getSlicingConfiguration_Intent();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getContainmentHierarchy <em>Containment Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment Hierarchy</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getContainmentHierarchy()
	 * @see #getSlicingConfiguration()
	 * @generated
	 */
	EAttribute getSlicingConfiguration_ContainmentHierarchy();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getContainedElement <em>Contained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contained Element</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getContainedElement()
	 * @see #getSlicingConfiguration()
	 * @generated
	 */
	EAttribute getSlicingConfiguration_ContainedElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getGeneralizationHierarchy <em>Generalization Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generalization Hierarchy</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getGeneralizationHierarchy()
	 * @see #getSlicingConfiguration()
	 * @generated
	 */
	EAttribute getSlicingConfiguration_GeneralizationHierarchy();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Element</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getReferencedElement()
	 * @see #getSlicingConfiguration()
	 * @generated
	 */
	EAttribute getSlicingConfiguration_ReferencedElement();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.mut.slicing.sim.ContainmentHierarchy <em>Containment Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Containment Hierarchy</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.ContainmentHierarchy
	 * @generated
	 */
	EEnum getContainmentHierarchy();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.mut.slicing.sim.ContainedElement <em>Contained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contained Element</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.ContainedElement
	 * @generated
	 */
	EEnum getContainedElement();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.mut.slicing.sim.ReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referenced Element</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.ReferencedElement
	 * @generated
	 */
	EEnum getReferencedElement();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy <em>Generalization Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generalization Hierarchy</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy
	 * @generated
	 */
	EEnum getGeneralizationHierarchy();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.mut.slicing.sim.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Type</em>'.
	 * @see eu.artist.migration.mut.slicing.sim.ModelType
	 * @generated
	 */
	EEnum getModelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimFactory getSimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl <em>Slicing Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl
		 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getSlicingIntent()
		 * @generated
		 */
		EClass SLICING_INTENT = eINSTANCE.getSlicingIntent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICING_INTENT__NAME = eINSTANCE.getSlicingIntent_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICING_INTENT__DESCRIPTION = eINSTANCE.getSlicingIntent_Description();

		/**
		 * The meta object literal for the '<em><b>Inject</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICING_INTENT__INJECT = eINSTANCE.getSlicingIntent_Inject();

		/**
		 * The meta object literal for the '<em><b>Extract</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICING_INTENT__EXTRACT = eINSTANCE.getSlicingIntent_Extract();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICING_INTENT__CRITERIA = eINSTANCE.getSlicingIntent_Criteria();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICING_INTENT__CONFIGURATION = eINSTANCE.getSlicingIntent_Configuration();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl <em>Slicing Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl
		 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getSlicingCriterion()
		 * @generated
		 */
		EClass SLICING_CRITERION = eINSTANCE.getSlicingCriterion();

		/**
		 * The meta object literal for the '<em><b>Intent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICING_CRITERION__INTENT = eINSTANCE.getSlicingCriterion_Intent();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICING_CRITERION__FEATURES = eINSTANCE.getSlicingCriterion_Features();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICING_CRITERION__VALUES = eINSTANCE.getSlicingCriterion_Values();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICING_CRITERION__ELEMENT = eINSTANCE.getSlicingCriterion_Element();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.mut.slicing.sim.impl.FeatureValueImpl <em>Feature Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.mut.slicing.sim.impl.FeatureValueImpl
		 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getFeatureValue()
		 * @generated
		 */
		EClass FEATURE_VALUE = eINSTANCE.getFeatureValue();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE__CRITERION = eINSTANCE.getFeatureValue_Criterion();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE__FEATURE = eINSTANCE.getFeatureValue_Feature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_VALUE__VALUE = eINSTANCE.getFeatureValue_Value();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl <em>Slicing Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl
		 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getSlicingConfiguration()
		 * @generated
		 */
		EClass SLICING_CONFIGURATION = eINSTANCE.getSlicingConfiguration();

		/**
		 * The meta object literal for the '<em><b>Intent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICING_CONFIGURATION__INTENT = eINSTANCE.getSlicingConfiguration_Intent();

		/**
		 * The meta object literal for the '<em><b>Containment Hierarchy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICING_CONFIGURATION__CONTAINMENT_HIERARCHY = eINSTANCE.getSlicingConfiguration_ContainmentHierarchy();

		/**
		 * The meta object literal for the '<em><b>Contained Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICING_CONFIGURATION__CONTAINED_ELEMENT = eINSTANCE.getSlicingConfiguration_ContainedElement();

		/**
		 * The meta object literal for the '<em><b>Generalization Hierarchy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICING_CONFIGURATION__GENERALIZATION_HIERARCHY = eINSTANCE.getSlicingConfiguration_GeneralizationHierarchy();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICING_CONFIGURATION__REFERENCED_ELEMENT = eINSTANCE.getSlicingConfiguration_ReferencedElement();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.mut.slicing.sim.ContainmentHierarchy <em>Containment Hierarchy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.mut.slicing.sim.ContainmentHierarchy
		 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getContainmentHierarchy()
		 * @generated
		 */
		EEnum CONTAINMENT_HIERARCHY = eINSTANCE.getContainmentHierarchy();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.mut.slicing.sim.ContainedElement <em>Contained Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.mut.slicing.sim.ContainedElement
		 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getContainedElement()
		 * @generated
		 */
		EEnum CONTAINED_ELEMENT = eINSTANCE.getContainedElement();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.mut.slicing.sim.ReferencedElement <em>Referenced Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.mut.slicing.sim.ReferencedElement
		 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getReferencedElement()
		 * @generated
		 */
		EEnum REFERENCED_ELEMENT = eINSTANCE.getReferencedElement();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy <em>Generalization Hierarchy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy
		 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getGeneralizationHierarchy()
		 * @generated
		 */
		EEnum GENERALIZATION_HIERARCHY = eINSTANCE.getGeneralizationHierarchy();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.mut.slicing.sim.ModelType <em>Model Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.mut.slicing.sim.ModelType
		 * @see eu.artist.migration.mut.slicing.sim.impl.SimPackageImpl#getModelType()
		 * @generated
		 */
		EEnum MODEL_TYPE = eINSTANCE.getModelType();

	}

} //SimPackage

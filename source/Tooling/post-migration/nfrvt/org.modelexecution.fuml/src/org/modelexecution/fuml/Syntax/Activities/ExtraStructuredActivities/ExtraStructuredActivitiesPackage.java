/**
 */
package org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage;

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
 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesFactory
 * @model kind="package"
 * @generated
 */
public interface ExtraStructuredActivitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ExtraStructuredActivities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/fuml/syntax/activities/extrastructuredactivities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fUML.Syntax.Activities.ExtraStructuredActivities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtraStructuredActivitiesPackage eINSTANCE = org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExpansionNodeImpl <em>Expansion Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExpansionNodeImpl
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionNode()
	 * @generated
	 */
	int EXPANSION_NODE = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__OWNED_ELEMENT = IntermediateActivitiesPackage.OBJECT_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__OWNER = IntermediateActivitiesPackage.OBJECT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__OWNED_COMMENT = IntermediateActivitiesPackage.OBJECT_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__NAME = IntermediateActivitiesPackage.OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__VISIBILITY = IntermediateActivitiesPackage.OBJECT_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__QUALIFIED_NAME = IntermediateActivitiesPackage.OBJECT_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__NAMESPACE = IntermediateActivitiesPackage.OBJECT_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__LEAF = IntermediateActivitiesPackage.OBJECT_NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REDEFINED_ELEMENT = IntermediateActivitiesPackage.OBJECT_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REDEFINITION_CONTEXT = IntermediateActivitiesPackage.OBJECT_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_STRUCTURED_NODE = IntermediateActivitiesPackage.OBJECT_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__ACTIVITY = IntermediateActivitiesPackage.OBJECT_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__OUTGOING = IntermediateActivitiesPackage.OBJECT_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__INCOMING = IntermediateActivitiesPackage.OBJECT_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__TYPE = IntermediateActivitiesPackage.OBJECT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Region As Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REGION_AS_OUTPUT = IntermediateActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region As Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REGION_AS_INPUT = IntermediateActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expansion Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE_FEATURE_COUNT = IntermediateActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExpansionRegionImpl <em>Expansion Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExpansionRegionImpl
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionRegion()
	 * @generated
	 */
	int EXPANSION_REGION = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OWNED_ELEMENT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OWNER = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OWNED_COMMENT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__NAME = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__VISIBILITY = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__QUALIFIED_NAME = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__NAMESPACE = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__LEAF = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__REDEFINED_ELEMENT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__REDEFINITION_CONTEXT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_STRUCTURED_NODE = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__ACTIVITY = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OUTGOING = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__INCOMING = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OUTPUT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__CONTEXT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__INPUT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__LOCALLY_REENTRANT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__NODE = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__MUST_ISOLATE = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__EDGE = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__STRUCTURED_NODE_OUTPUT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__STRUCTURED_NODE_INPUT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__MODE = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__INPUT_ELEMENT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OUTPUT_ELEMENT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expansion Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION_FEATURE_COUNT = CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind <em>Expansion Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionKind()
	 * @generated
	 */
	int EXPANSION_KIND = 2;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode <em>Expansion Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expansion Node</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode
	 * @generated
	 */
	EClass getExpansionNode();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region As Output</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput()
	 * @see #getExpansionNode()
	 * @generated
	 */
	EReference getExpansionNode_RegionAsOutput();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region As Input</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput()
	 * @see #getExpansionNode()
	 * @generated
	 */
	EReference getExpansionNode_RegionAsInput();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion <em>Expansion Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expansion Region</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion
	 * @generated
	 */
	EClass getExpansionRegion();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getMode()
	 * @see #getExpansionRegion()
	 * @generated
	 */
	EAttribute getExpansionRegion_Mode();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement()
	 * @see #getExpansionRegion()
	 * @generated
	 */
	EReference getExpansionRegion_InputElement();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement()
	 * @see #getExpansionRegion()
	 * @generated
	 */
	EReference getExpansionRegion_OutputElement();

	/**
	 * Returns the meta object for enum '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind <em>Expansion Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expansion Kind</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind
	 * @generated
	 */
	EEnum getExpansionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtraStructuredActivitiesFactory getExtraStructuredActivitiesFactory();

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
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExpansionNodeImpl <em>Expansion Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExpansionNodeImpl
		 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionNode()
		 * @generated
		 */
		EClass EXPANSION_NODE = eINSTANCE.getExpansionNode();

		/**
		 * The meta object literal for the '<em><b>Region As Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_NODE__REGION_AS_OUTPUT = eINSTANCE.getExpansionNode_RegionAsOutput();

		/**
		 * The meta object literal for the '<em><b>Region As Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_NODE__REGION_AS_INPUT = eINSTANCE.getExpansionNode_RegionAsInput();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExpansionRegionImpl <em>Expansion Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExpansionRegionImpl
		 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionRegion()
		 * @generated
		 */
		EClass EXPANSION_REGION = eINSTANCE.getExpansionRegion();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPANSION_REGION__MODE = eINSTANCE.getExpansionRegion_Mode();

		/**
		 * The meta object literal for the '<em><b>Input Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_REGION__INPUT_ELEMENT = eINSTANCE.getExpansionRegion_InputElement();

		/**
		 * The meta object literal for the '<em><b>Output Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_REGION__OUTPUT_ELEMENT = eINSTANCE.getExpansionRegion_OutputElement();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind <em>Expansion Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind
		 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.impl.ExtraStructuredActivitiesPackageImpl#getExpansionKind()
		 * @generated
		 */
		EEnum EXPANSION_KIND = eINSTANCE.getExpansionKind();

	}

} //ExtraStructuredActivitiesPackage

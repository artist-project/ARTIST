/**
 */
package org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage;

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
 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesFactory
 * @model kind="package"
 * @generated
 */
public interface CompleteStructuredActivitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CompleteStructuredActivities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/fuml/syntax/activities/completestructuredactivities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fUML.Syntax.Activities.CompleteStructuredActivities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompleteStructuredActivitiesPackage eINSTANCE = org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ExecutableNodeImpl
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OWNED_ELEMENT = IntermediateActivitiesPackage.ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OWNER = IntermediateActivitiesPackage.ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OWNED_COMMENT = IntermediateActivitiesPackage.ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME = IntermediateActivitiesPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__VISIBILITY = IntermediateActivitiesPackage.ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__QUALIFIED_NAME = IntermediateActivitiesPackage.ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAMESPACE = IntermediateActivitiesPackage.ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__LEAF = IntermediateActivitiesPackage.ACTIVITY_NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__REDEFINED_ELEMENT = IntermediateActivitiesPackage.ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__REDEFINITION_CONTEXT = IntermediateActivitiesPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_STRUCTURED_NODE = IntermediateActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__ACTIVITY = IntermediateActivitiesPackage.ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTGOING = IntermediateActivitiesPackage.ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMING = IntermediateActivitiesPackage.ACTIVITY_NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = IntermediateActivitiesPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.StructuredActivityNodeImpl
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getStructuredActivityNode()
	 * @generated
	 */
	int STRUCTURED_ACTIVITY_NODE = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NODE = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__EDGE = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT = BasicActionsPackage.ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Structured Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl <em>Loop Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getLoopNode()
	 * @generated
	 */
	int LOOP_NODE = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OWNED_ELEMENT = STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OWNER = STRUCTURED_ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OWNED_COMMENT = STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NAME = STRUCTURED_ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__VISIBILITY = STRUCTURED_ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NAMESPACE = STRUCTURED_ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LEAF = STRUCTURED_ACTIVITY_NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__REDEFINED_ELEMENT = STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__REDEFINITION_CONTEXT = STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_STRUCTURED_NODE = STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__ACTIVITY = STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OUTGOING = STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__INCOMING = STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OUTPUT = STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__CONTEXT = STRUCTURED_ACTIVITY_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__INPUT = STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOCALLY_REENTRANT = STRUCTURED_ACTIVITY_NODE__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NODE = STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__MUST_ISOLATE = STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__EDGE = STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__STRUCTURED_NODE_OUTPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__STRUCTURED_NODE_INPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Tested First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__TESTED_FIRST = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__DECIDER = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__TEST = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__BODY_OUTPUT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOOP_VARIABLE_INPUT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__BODY_PART = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__RESULT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Loop Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOOP_VARIABLE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Setup Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SETUP_PART = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Loop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__OWNED_ELEMENT = KernelPackage.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__OWNER = KernelPackage.ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__OWNED_COMMENT = KernelPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__TEST = KernelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__BODY = KernelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predecessor Clause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__PREDECESSOR_CLAUSE = KernelPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Successor Clause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__SUCCESSOR_CLAUSE = KernelPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__DECIDER = KernelPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__BODY_OUTPUT = KernelPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = KernelPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ConditionalNodeImpl
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getConditionalNode()
	 * @generated
	 */
	int CONDITIONAL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OWNED_ELEMENT = STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OWNER = STRUCTURED_ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OWNED_COMMENT = STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NAME = STRUCTURED_ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__VISIBILITY = STRUCTURED_ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NAMESPACE = STRUCTURED_ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__LEAF = STRUCTURED_ACTIVITY_NODE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__REDEFINED_ELEMENT = STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__REDEFINITION_CONTEXT = STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_STRUCTURED_NODE = STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__ACTIVITY = STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OUTGOING = STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__INCOMING = STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OUTPUT = STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CONTEXT = STRUCTURED_ACTIVITY_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__INPUT = STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__LOCALLY_REENTRANT = STRUCTURED_ACTIVITY_NODE__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NODE = STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__MUST_ISOLATE = STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__EDGE = STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__STRUCTURED_NODE_OUTPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__STRUCTURED_NODE_INPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Determinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__DETERMINATE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__ASSURED = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CLAUSE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__RESULT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Node</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode
	 * @generated
	 */
	EClass getLoopNode();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#isTestedFirst <em>Tested First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tested First</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#isTestedFirst()
	 * @see #getLoopNode()
	 * @generated
	 */
	EAttribute getLoopNode_TestedFirst();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getDecider <em>Decider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decider</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getDecider()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Decider();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getTest()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Test();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getBodyOutput <em>Body Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Output</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getBodyOutput()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_BodyOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getLoopVariableInput <em>Loop Variable Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Variable Input</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getLoopVariableInput()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_LoopVariableInput();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getBodyPart <em>Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Part</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getBodyPart()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_BodyPart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getResult()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Result();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getLoopVariable <em>Loop Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loop Variable</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getLoopVariable()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_LoopVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getSetupPart <em>Setup Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setup Part</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode#getSetupPart()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_SetupPart();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getTest()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Test();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getBody()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Body();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getPredecessorClause <em>Predecessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessor Clause</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getPredecessorClause()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_PredecessorClause();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getSuccessorClause <em>Successor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successor Clause</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getSuccessorClause()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_SuccessorClause();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getDecider <em>Decider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decider</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getDecider()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Decider();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getBodyOutput <em>Body Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Output</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getBodyOutput()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_BodyOutput();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Node</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode
	 * @generated
	 */
	EClass getConditionalNode();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#isDeterminate <em>Determinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Determinate</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#isDeterminate()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EAttribute getConditionalNode_Determinate();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#isAssured <em>Assured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assured</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#isAssured()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EAttribute getConditionalNode_Assured();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clause</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#getClause()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_Clause();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#getResult()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_Result();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Activity Node</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode
	 * @generated
	 */
	EClass getStructuredActivityNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getNode()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Isolate</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#isMustIsolate()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EAttribute getStructuredActivityNode_MustIsolate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getEdge()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Edge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getStructuredNodeOutput <em>Structured Node Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structured Node Output</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getStructuredNodeOutput()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_StructuredNodeOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getStructuredNodeInput <em>Structured Node Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structured Node Input</em>'.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getStructuredNodeInput()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_StructuredNodeInput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompleteStructuredActivitiesFactory getCompleteStructuredActivitiesFactory();

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
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl <em>Loop Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getLoopNode()
		 * @generated
		 */
		EClass LOOP_NODE = eINSTANCE.getLoopNode();

		/**
		 * The meta object literal for the '<em><b>Tested First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_NODE__TESTED_FIRST = eINSTANCE.getLoopNode_TestedFirst();

		/**
		 * The meta object literal for the '<em><b>Decider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__DECIDER = eINSTANCE.getLoopNode_Decider();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__TEST = eINSTANCE.getLoopNode_Test();

		/**
		 * The meta object literal for the '<em><b>Body Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__BODY_OUTPUT = eINSTANCE.getLoopNode_BodyOutput();

		/**
		 * The meta object literal for the '<em><b>Loop Variable Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__LOOP_VARIABLE_INPUT = eINSTANCE.getLoopNode_LoopVariableInput();

		/**
		 * The meta object literal for the '<em><b>Body Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__BODY_PART = eINSTANCE.getLoopNode_BodyPart();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__RESULT = eINSTANCE.getLoopNode_Result();

		/**
		 * The meta object literal for the '<em><b>Loop Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__LOOP_VARIABLE = eINSTANCE.getLoopNode_LoopVariable();

		/**
		 * The meta object literal for the '<em><b>Setup Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__SETUP_PART = eINSTANCE.getLoopNode_SetupPart();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ExecutableNodeImpl
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__TEST = eINSTANCE.getClause_Test();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__BODY = eINSTANCE.getClause_Body();

		/**
		 * The meta object literal for the '<em><b>Predecessor Clause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__PREDECESSOR_CLAUSE = eINSTANCE.getClause_PredecessorClause();

		/**
		 * The meta object literal for the '<em><b>Successor Clause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__SUCCESSOR_CLAUSE = eINSTANCE.getClause_SuccessorClause();

		/**
		 * The meta object literal for the '<em><b>Decider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__DECIDER = eINSTANCE.getClause_Decider();

		/**
		 * The meta object literal for the '<em><b>Body Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__BODY_OUTPUT = eINSTANCE.getClause_BodyOutput();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ConditionalNodeImpl
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getConditionalNode()
		 * @generated
		 */
		EClass CONDITIONAL_NODE = eINSTANCE.getConditionalNode();

		/**
		 * The meta object literal for the '<em><b>Determinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_NODE__DETERMINATE = eINSTANCE.getConditionalNode_Determinate();

		/**
		 * The meta object literal for the '<em><b>Assured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_NODE__ASSURED = eINSTANCE.getConditionalNode_Assured();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__CLAUSE = eINSTANCE.getConditionalNode_Clause();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__RESULT = eINSTANCE.getConditionalNode_Result();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.StructuredActivityNodeImpl
		 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.CompleteStructuredActivitiesPackageImpl#getStructuredActivityNode()
		 * @generated
		 */
		EClass STRUCTURED_ACTIVITY_NODE = eINSTANCE.getStructuredActivityNode();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__NODE = eINSTANCE.getStructuredActivityNode_Node();

		/**
		 * The meta object literal for the '<em><b>Must Isolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE = eINSTANCE.getStructuredActivityNode_MustIsolate();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__EDGE = eINSTANCE.getStructuredActivityNode_Edge();

		/**
		 * The meta object literal for the '<em><b>Structured Node Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT = eINSTANCE.getStructuredActivityNode_StructuredNodeOutput();

		/**
		 * The meta object literal for the '<em><b>Structured Node Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT = eINSTANCE.getStructuredActivityNode_StructuredNodeInput();

	}

} //CompleteStructuredActivitiesPackage

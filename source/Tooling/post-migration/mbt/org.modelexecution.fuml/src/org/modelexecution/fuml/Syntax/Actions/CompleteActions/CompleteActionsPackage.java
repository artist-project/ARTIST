/**
 */
package org.modelexecution.fuml.Syntax.Actions.CompleteActions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage;

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
 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsFactory
 * @model kind="package"
 * @generated
 */
public interface CompleteActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CompleteActions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/fuml/syntax/actions/completeactions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fUML.Syntax.Actions.CompleteActions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompleteActionsPackage eINSTANCE = org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.StartClassifierBehaviorActionImpl <em>Start Classifier Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.StartClassifierBehaviorActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getStartClassifierBehaviorAction()
	 * @generated
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Classifier Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.StartObjectBehaviorActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getStartObjectBehaviorAction()
	 * @generated
	 */
	int START_OBJECT_BEHAVIOR_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OWNED_ELEMENT = BasicActionsPackage.CALL_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OWNER = BasicActionsPackage.CALL_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OWNED_COMMENT = BasicActionsPackage.CALL_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__NAME = BasicActionsPackage.CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__VISIBILITY = BasicActionsPackage.CALL_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__QUALIFIED_NAME = BasicActionsPackage.CALL_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__NAMESPACE = BasicActionsPackage.CALL_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__LEAF = BasicActionsPackage.CALL_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.CALL_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.CALL_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.CALL_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__ACTIVITY = BasicActionsPackage.CALL_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OUTGOING = BasicActionsPackage.CALL_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__INCOMING = BasicActionsPackage.CALL_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OUTPUT = BasicActionsPackage.CALL_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__CONTEXT = BasicActionsPackage.CALL_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__INPUT = BasicActionsPackage.CALL_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.CALL_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__ARGUMENT = BasicActionsPackage.CALL_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__SYNCHRONOUS = BasicActionsPackage.CALL_ACTION__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__RESULT = BasicActionsPackage.CALL_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OBJECT = BasicActionsPackage.CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Object Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION_FEATURE_COUNT = BasicActionsPackage.CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReduceActionImpl <em>Reduce Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReduceActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReduceAction()
	 * @generated
	 */
	int REDUCE_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Reducer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__REDUCER = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__COLLECTION = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__ORDERED = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reduce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadExtentActionImpl <em>Read Extent Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadExtentActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadExtentAction()
	 * @generated
	 */
	int READ_EXTENT_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__CLASSIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Read Extent Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadIsClassifiedObjectActionImpl <em>Read Is Classified Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadIsClassifiedObjectActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadIsClassifiedObjectAction()
	 * @generated
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__DIRECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Read Is Classified Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReclassifyObjectActionImpl <em>Reclassify Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReclassifyObjectActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReclassifyObjectAction()
	 * @generated
	 */
	int RECLASSIFY_OBJECT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__REPLACE_ALL = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reclassify Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.AcceptEventActionImpl <em>Accept Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.AcceptEventActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getAcceptEventAction()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Unmarshall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__UNMARSHALL = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__TRIGGER = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accept Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction <em>Start Classifier Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Classifier Behavior Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction
	 * @generated
	 */
	EClass getStartClassifierBehaviorAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction#getObject()
	 * @see #getStartClassifierBehaviorAction()
	 * @generated
	 */
	EReference getStartClassifierBehaviorAction_Object();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartObjectBehaviorAction <em>Start Object Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Object Behavior Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartObjectBehaviorAction
	 * @generated
	 */
	EClass getStartObjectBehaviorAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartObjectBehaviorAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartObjectBehaviorAction#getObject()
	 * @see #getStartObjectBehaviorAction()
	 * @generated
	 */
	EReference getStartObjectBehaviorAction_Object();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction <em>Reduce Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduce Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction
	 * @generated
	 */
	EClass getReduceAction();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getReducer <em>Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reducer</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getReducer()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Reducer();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getResult()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getCollection()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Collection();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#isOrdered()
	 * @see #getReduceAction()
	 * @generated
	 */
	EAttribute getReduceAction_Ordered();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadExtentAction <em>Read Extent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Extent Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadExtentAction
	 * @generated
	 */
	EClass getReadExtentAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadExtentAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadExtentAction#getResult()
	 * @see #getReadExtentAction()
	 * @generated
	 */
	EReference getReadExtentAction_Result();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadExtentAction#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadExtentAction#getClassifier()
	 * @see #getReadExtentAction()
	 * @generated
	 */
	EReference getReadExtentAction_Classifier();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction <em>Read Is Classified Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Is Classified Object Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction
	 * @generated
	 */
	EClass getReadIsClassifiedObjectAction();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction#isDirect <em>Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction#isDirect()
	 * @see #getReadIsClassifiedObjectAction()
	 * @generated
	 */
	EAttribute getReadIsClassifiedObjectAction_Direct();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction#getClassifier()
	 * @see #getReadIsClassifiedObjectAction()
	 * @generated
	 */
	EReference getReadIsClassifiedObjectAction_Classifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction#getResult()
	 * @see #getReadIsClassifiedObjectAction()
	 * @generated
	 */
	EReference getReadIsClassifiedObjectAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction#getObject()
	 * @see #getReadIsClassifiedObjectAction()
	 * @generated
	 */
	EReference getReadIsClassifiedObjectAction_Object();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction <em>Reclassify Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reclassify Object Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction
	 * @generated
	 */
	EClass getReclassifyObjectAction();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction#isReplaceAll <em>Replace All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace All</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction#isReplaceAll()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EAttribute getReclassifyObjectAction_ReplaceAll();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction#getOldClassifier <em>Old Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Classifier</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction#getOldClassifier()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EReference getReclassifyObjectAction_OldClassifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction#getObject()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EReference getReclassifyObjectAction_Object();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction#getNewClassifier <em>New Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Classifier</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction#getNewClassifier()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EReference getReclassifyObjectAction_NewClassifier();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction <em>Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction
	 * @generated
	 */
	EClass getAcceptEventAction();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction#isUnmarshall <em>Unmarshall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unmarshall</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction#isUnmarshall()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EAttribute getAcceptEventAction_Unmarshall();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction#getResult()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EReference getAcceptEventAction_Result();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction#getTrigger()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EReference getAcceptEventAction_Trigger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompleteActionsFactory getCompleteActionsFactory();

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
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.StartClassifierBehaviorActionImpl <em>Start Classifier Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.StartClassifierBehaviorActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getStartClassifierBehaviorAction()
		 * @generated
		 */
		EClass START_CLASSIFIER_BEHAVIOR_ACTION = eINSTANCE.getStartClassifierBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT = eINSTANCE.getStartClassifierBehaviorAction_Object();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.StartObjectBehaviorActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getStartObjectBehaviorAction()
		 * @generated
		 */
		EClass START_OBJECT_BEHAVIOR_ACTION = eINSTANCE.getStartObjectBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_OBJECT_BEHAVIOR_ACTION__OBJECT = eINSTANCE.getStartObjectBehaviorAction_Object();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReduceActionImpl <em>Reduce Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReduceActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReduceAction()
		 * @generated
		 */
		EClass REDUCE_ACTION = eINSTANCE.getReduceAction();

		/**
		 * The meta object literal for the '<em><b>Reducer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__REDUCER = eINSTANCE.getReduceAction_Reducer();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__RESULT = eINSTANCE.getReduceAction_Result();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__COLLECTION = eINSTANCE.getReduceAction_Collection();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCE_ACTION__ORDERED = eINSTANCE.getReduceAction_Ordered();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadExtentActionImpl <em>Read Extent Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadExtentActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadExtentAction()
		 * @generated
		 */
		EClass READ_EXTENT_ACTION = eINSTANCE.getReadExtentAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_EXTENT_ACTION__RESULT = eINSTANCE.getReadExtentAction_Result();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_EXTENT_ACTION__CLASSIFIER = eINSTANCE.getReadExtentAction_Classifier();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadIsClassifiedObjectActionImpl <em>Read Is Classified Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadIsClassifiedObjectActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReadIsClassifiedObjectAction()
		 * @generated
		 */
		EClass READ_IS_CLASSIFIED_OBJECT_ACTION = eINSTANCE.getReadIsClassifiedObjectAction();

		/**
		 * The meta object literal for the '<em><b>Direct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_IS_CLASSIFIED_OBJECT_ACTION__DIRECT = eINSTANCE.getReadIsClassifiedObjectAction_Direct();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER = eINSTANCE.getReadIsClassifiedObjectAction_Classifier();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT = eINSTANCE.getReadIsClassifiedObjectAction_Result();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT = eINSTANCE.getReadIsClassifiedObjectAction_Object();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReclassifyObjectActionImpl <em>Reclassify Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReclassifyObjectActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getReclassifyObjectAction()
		 * @generated
		 */
		EClass RECLASSIFY_OBJECT_ACTION = eINSTANCE.getReclassifyObjectAction();

		/**
		 * The meta object literal for the '<em><b>Replace All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECLASSIFY_OBJECT_ACTION__REPLACE_ALL = eINSTANCE.getReclassifyObjectAction_ReplaceAll();

		/**
		 * The meta object literal for the '<em><b>Old Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER = eINSTANCE.getReclassifyObjectAction_OldClassifier();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLASSIFY_OBJECT_ACTION__OBJECT = eINSTANCE.getReclassifyObjectAction_Object();

		/**
		 * The meta object literal for the '<em><b>New Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER = eINSTANCE.getReclassifyObjectAction_NewClassifier();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.AcceptEventActionImpl <em>Accept Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.AcceptEventActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsPackageImpl#getAcceptEventAction()
		 * @generated
		 */
		EClass ACCEPT_EVENT_ACTION = eINSTANCE.getAcceptEventAction();

		/**
		 * The meta object literal for the '<em><b>Unmarshall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_EVENT_ACTION__UNMARSHALL = eINSTANCE.getAcceptEventAction_Unmarshall();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_EVENT_ACTION__RESULT = eINSTANCE.getAcceptEventAction_Result();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_EVENT_ACTION__TRIGGER = eINSTANCE.getAcceptEventAction_Trigger();

	}

} //CompleteActionsPackage

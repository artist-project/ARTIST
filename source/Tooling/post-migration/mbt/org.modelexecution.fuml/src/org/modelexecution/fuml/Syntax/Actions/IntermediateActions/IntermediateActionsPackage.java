/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage;
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
 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediateActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IntermediateActions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/fuml/syntax/actions/intermediateactions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fUML.Syntax.Actions.IntermediateActions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateActionsPackage eINSTANCE = org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.StructuralFeatureActionImpl <em>Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.StructuralFeatureActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getStructuralFeatureAction()
	 * @generated
	 */
	int STRUCTURAL_FEATURE_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.TestIdentityActionImpl <em>Test Identity Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.TestIdentityActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getTestIdentityAction()
	 * @generated
	 */
	int TEST_IDENTITY_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__SECOND = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__FIRST = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test Identity Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ValueSpecificationActionImpl <em>Value Specification Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ValueSpecificationActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getValueSpecificationAction()
	 * @generated
	 */
	int VALUE_SPECIFICATION_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__VALUE = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Specification Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkActionImpl <em>Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkAction()
	 * @generated
	 */
	int LINK_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__END_DATA = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__INPUT_VALUE = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.WriteLinkActionImpl <em>Write Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.WriteLinkActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getWriteLinkAction()
	 * @generated
	 */
	int WRITE_LINK_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OWNED_ELEMENT = LINK_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OWNER = LINK_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OWNED_COMMENT = LINK_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__NAME = LINK_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__VISIBILITY = LINK_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__QUALIFIED_NAME = LINK_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__NAMESPACE = LINK_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__LEAF = LINK_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__REDEFINED_ELEMENT = LINK_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__REDEFINITION_CONTEXT = LINK_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__IN_STRUCTURED_NODE = LINK_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__ACTIVITY = LINK_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OUTGOING = LINK_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__INCOMING = LINK_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OUTPUT = LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__CONTEXT = LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__INPUT = LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__LOCALLY_REENTRANT = LINK_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__END_DATA = LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__INPUT_VALUE = LINK_ACTION__INPUT_VALUE;

	/**
	 * The number of structural features of the '<em>Write Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION_FEATURE_COUNT = LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDataImpl <em>Link End Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDataImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndData()
	 * @generated
	 */
	int LINK_END_DATA = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__OWNED_ELEMENT = KernelPackage.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__OWNER = KernelPackage.ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__OWNED_COMMENT = KernelPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__VALUE = KernelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__END = KernelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link End Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA_FEATURE_COUNT = KernelPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.WriteStructuralFeatureActionImpl <em>Write Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.WriteStructuralFeatureActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getWriteStructuralFeatureAction()
	 * @generated
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT = STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OWNER = STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT = STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__NAME = STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY = STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME = STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__NAMESPACE = STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__LEAF = STRUCTURAL_FEATURE_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT = STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT = STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE = STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY = STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING = STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING = STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT = STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT = STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__INPUT = STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__LOCALLY_REENTRANT = STRUCTURAL_FEATURE_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT = STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__VALUE = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__RESULT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Write Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.RemoveStructuralFeatureValueActionImpl <em>Remove Structural Feature Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.RemoveStructuralFeatureValueActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getRemoveStructuralFeatureValueAction()
	 * @generated
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER = WRITE_STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT = WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME = WRITE_STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY = WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME = WRITE_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE = WRITE_STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LEAF = WRITE_STRUCTURAL_FEATURE_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE = WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY = WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING = WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING = WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT = WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT = WRITE_STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCALLY_REENTRANT = WRITE_STRUCTURAL_FEATURE_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE = WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT = WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE = WRITE_STRUCTURAL_FEATURE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__RESULT = WRITE_STRUCTURAL_FEATURE_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Remove Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_DUPLICATES = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_FEATURE_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadLinkActionImpl <em>Read Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadLinkActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadLinkAction()
	 * @generated
	 */
	int READ_LINK_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OWNED_ELEMENT = LINK_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OWNER = LINK_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OWNED_COMMENT = LINK_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__NAME = LINK_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__VISIBILITY = LINK_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__QUALIFIED_NAME = LINK_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__NAMESPACE = LINK_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__LEAF = LINK_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__REDEFINED_ELEMENT = LINK_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__REDEFINITION_CONTEXT = LINK_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__IN_STRUCTURED_NODE = LINK_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__ACTIVITY = LINK_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OUTGOING = LINK_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__INCOMING = LINK_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OUTPUT = LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__CONTEXT = LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__INPUT = LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__LOCALLY_REENTRANT = LINK_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__END_DATA = LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__INPUT_VALUE = LINK_ACTION__INPUT_VALUE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__RESULT = LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION_FEATURE_COUNT = LINK_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadSelfActionImpl <em>Read Self Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadSelfActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadSelfAction()
	 * @generated
	 */
	int READ_SELF_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Self Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadStructuralFeatureActionImpl <em>Read Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadStructuralFeatureActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadStructuralFeatureAction()
	 * @generated
	 */
	int READ_STRUCTURAL_FEATURE_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT = STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OWNER = STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT = STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__NAME = STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__VISIBILITY = STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME = STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__NAMESPACE = STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__LEAF = STRUCTURAL_FEATURE_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT = STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT = STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE = STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__ACTIVITY = STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OUTGOING = STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__INCOMING = STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OUTPUT = STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__CONTEXT = STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__INPUT = STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__LOCALLY_REENTRANT = STRUCTURAL_FEATURE_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OBJECT = STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__RESULT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndCreationDataImpl <em>Link End Creation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndCreationDataImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndCreationData()
	 * @generated
	 */
	int LINK_END_CREATION_DATA = 11;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__OWNED_ELEMENT = LINK_END_DATA__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__OWNER = LINK_END_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__OWNED_COMMENT = LINK_END_DATA__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__VALUE = LINK_END_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__END = LINK_END_DATA__END;

	/**
	 * The feature id for the '<em><b>Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__REPLACE_ALL = LINK_END_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insert At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__INSERT_AT = LINK_END_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link End Creation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA_FEATURE_COUNT = LINK_END_DATA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDestructionDataImpl <em>Link End Destruction Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDestructionDataImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndDestructionData()
	 * @generated
	 */
	int LINK_END_DESTRUCTION_DATA = 12;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__OWNED_ELEMENT = LINK_END_DATA__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__OWNER = LINK_END_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__OWNED_COMMENT = LINK_END_DATA__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__VALUE = LINK_END_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__END = LINK_END_DATA__END;

	/**
	 * The feature id for the '<em><b>Destroy Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__DESTROY_DUPLICATES = LINK_END_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destroy At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__DESTROY_AT = LINK_END_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link End Destruction Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA_FEATURE_COUNT = LINK_END_DATA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ClearAssociationActionImpl <em>Clear Association Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ClearAssociationActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getClearAssociationAction()
	 * @generated
	 */
	int CLEAR_ASSOCIATION_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__ASSOCIATION = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OBJECT = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clear Association Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ClearStructuralFeatureActionImpl <em>Clear Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ClearStructuralFeatureActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getClearStructuralFeatureAction()
	 * @generated
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT = STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OWNER = STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT = STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__NAME = STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__VISIBILITY = STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME = STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__NAMESPACE = STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__LEAF = STRUCTURAL_FEATURE_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT = STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT = STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE = STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__ACTIVITY = STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OUTGOING = STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__INCOMING = STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OUTPUT = STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__CONTEXT = STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__INPUT = STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__LOCALLY_REENTRANT = STRUCTURAL_FEATURE_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OBJECT = STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clear Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.CreateLinkActionImpl <em>Create Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.CreateLinkActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getCreateLinkAction()
	 * @generated
	 */
	int CREATE_LINK_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OWNED_ELEMENT = WRITE_LINK_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OWNER = WRITE_LINK_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OWNED_COMMENT = WRITE_LINK_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__NAME = WRITE_LINK_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__VISIBILITY = WRITE_LINK_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__QUALIFIED_NAME = WRITE_LINK_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__NAMESPACE = WRITE_LINK_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__LEAF = WRITE_LINK_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__REDEFINED_ELEMENT = WRITE_LINK_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__REDEFINITION_CONTEXT = WRITE_LINK_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__IN_STRUCTURED_NODE = WRITE_LINK_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__ACTIVITY = WRITE_LINK_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OUTGOING = WRITE_LINK_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__INCOMING = WRITE_LINK_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OUTPUT = WRITE_LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__CONTEXT = WRITE_LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__INPUT = WRITE_LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__LOCALLY_REENTRANT = WRITE_LINK_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__END_DATA = WRITE_LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__INPUT_VALUE = WRITE_LINK_ACTION__INPUT_VALUE;

	/**
	 * The number of structural features of the '<em>Create Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION_FEATURE_COUNT = WRITE_LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.CreateObjectActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getCreateObjectAction()
	 * @generated
	 */
	int CREATE_OBJECT_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__RESULT = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__CLASSIFIER = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.DestroyLinkActionImpl <em>Destroy Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.DestroyLinkActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getDestroyLinkAction()
	 * @generated
	 */
	int DESTROY_LINK_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OWNED_ELEMENT = WRITE_LINK_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OWNER = WRITE_LINK_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OWNED_COMMENT = WRITE_LINK_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__NAME = WRITE_LINK_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__VISIBILITY = WRITE_LINK_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__QUALIFIED_NAME = WRITE_LINK_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__NAMESPACE = WRITE_LINK_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__LEAF = WRITE_LINK_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__REDEFINED_ELEMENT = WRITE_LINK_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__REDEFINITION_CONTEXT = WRITE_LINK_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__IN_STRUCTURED_NODE = WRITE_LINK_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__ACTIVITY = WRITE_LINK_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OUTGOING = WRITE_LINK_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__INCOMING = WRITE_LINK_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OUTPUT = WRITE_LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__CONTEXT = WRITE_LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__INPUT = WRITE_LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__LOCALLY_REENTRANT = WRITE_LINK_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__END_DATA = WRITE_LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__INPUT_VALUE = WRITE_LINK_ACTION__INPUT_VALUE;

	/**
	 * The number of structural features of the '<em>Destroy Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION_FEATURE_COUNT = WRITE_LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.DestroyObjectActionImpl <em>Destroy Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.DestroyObjectActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getDestroyObjectAction()
	 * @generated
	 */
	int DESTROY_OBJECT_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OWNED_ELEMENT = BasicActionsPackage.ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OWNER = BasicActionsPackage.ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OWNED_COMMENT = BasicActionsPackage.ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__NAME = BasicActionsPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__VISIBILITY = BasicActionsPackage.ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__QUALIFIED_NAME = BasicActionsPackage.ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__NAMESPACE = BasicActionsPackage.ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__LEAF = BasicActionsPackage.ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__REDEFINED_ELEMENT = BasicActionsPackage.ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__REDEFINITION_CONTEXT = BasicActionsPackage.ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE = BasicActionsPackage.ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__ACTIVITY = BasicActionsPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OUTGOING = BasicActionsPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__INCOMING = BasicActionsPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OUTPUT = BasicActionsPackage.ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__CONTEXT = BasicActionsPackage.ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__INPUT = BasicActionsPackage.ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__LOCALLY_REENTRANT = BasicActionsPackage.ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Destroy Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__DESTROY_LINKS = BasicActionsPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destroy Owned Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__DESTROY_OWNED_OBJECTS = BasicActionsPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__TARGET = BasicActionsPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Destroy Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION_FEATURE_COUNT = BasicActionsPackage.ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl <em>Add Structural Feature Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getAddStructuralFeatureValueAction()
	 * @generated
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION = 19;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER = WRITE_STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT = WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME = WRITE_STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY = WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME = WRITE_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE = WRITE_STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LEAF = WRITE_STRUCTURAL_FEATURE_ACTION__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE = WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY = WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING = WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING = WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT = WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT = WRITE_STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCALLY_REENTRANT = WRITE_STRUCTURAL_FEATURE_ACTION__LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE = WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT = WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE = WRITE_STRUCTURAL_FEATURE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__RESULT = WRITE_STRUCTURAL_FEATURE_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REPLACE_ALL = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insert At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_FEATURE_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction <em>Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction
	 * @generated
	 */
	EClass getStructuralFeatureAction();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction#getStructuralFeature()
	 * @see #getStructuralFeatureAction()
	 * @generated
	 */
	EReference getStructuralFeatureAction_StructuralFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.StructuralFeatureAction#getObject()
	 * @see #getStructuralFeatureAction()
	 * @generated
	 */
	EReference getStructuralFeatureAction_Object();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction <em>Test Identity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Identity Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction
	 * @generated
	 */
	EClass getTestIdentityAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction#getSecond()
	 * @see #getTestIdentityAction()
	 * @generated
	 */
	EReference getTestIdentityAction_Second();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction#getResult()
	 * @see #getTestIdentityAction()
	 * @generated
	 */
	EReference getTestIdentityAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction#getFirst()
	 * @see #getTestIdentityAction()
	 * @generated
	 */
	EReference getTestIdentityAction_First();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction <em>Value Specification Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction
	 * @generated
	 */
	EClass getValueSpecificationAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction#getValue()
	 * @see #getValueSpecificationAction()
	 * @generated
	 */
	EReference getValueSpecificationAction_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction#getResult()
	 * @see #getValueSpecificationAction()
	 * @generated
	 */
	EReference getValueSpecificationAction_Result();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteLinkAction <em>Write Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Link Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteLinkAction
	 * @generated
	 */
	EClass getWriteLinkAction();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction <em>Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction
	 * @generated
	 */
	EClass getLinkAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction#getEndData <em>End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Data</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction#getEndData()
	 * @see #getLinkAction()
	 * @generated
	 */
	EReference getLinkAction_EndData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction#getInputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction#getInputValue()
	 * @see #getLinkAction()
	 * @generated
	 */
	EReference getLinkAction_InputValue();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData <em>Link End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link End Data</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData
	 * @generated
	 */
	EClass getLinkEndData();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData#getValue()
	 * @see #getLinkEndData()
	 * @generated
	 */
	EReference getLinkEndData_Value();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData#getEnd()
	 * @see #getLinkEndData()
	 * @generated
	 */
	EReference getLinkEndData_End();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction <em>Write Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Structural Feature Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction
	 * @generated
	 */
	EClass getWriteStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction#getValue()
	 * @see #getWriteStructuralFeatureAction()
	 * @generated
	 */
	EReference getWriteStructuralFeatureAction_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.WriteStructuralFeatureAction#getResult()
	 * @see #getWriteStructuralFeatureAction()
	 * @generated
	 */
	EReference getWriteStructuralFeatureAction_Result();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Structural Feature Value Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction
	 * @generated
	 */
	EClass getRemoveStructuralFeatureValueAction();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction#isRemoveDuplicates <em>Remove Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Duplicates</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction#isRemoveDuplicates()
	 * @see #getRemoveStructuralFeatureValueAction()
	 * @generated
	 */
	EAttribute getRemoveStructuralFeatureValueAction_RemoveDuplicates();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction#getRemoveAt <em>Remove At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove At</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction#getRemoveAt()
	 * @see #getRemoveStructuralFeatureValueAction()
	 * @generated
	 */
	EReference getRemoveStructuralFeatureValueAction_RemoveAt();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction <em>Read Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Link Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction
	 * @generated
	 */
	EClass getReadLinkAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction#getResult()
	 * @see #getReadLinkAction()
	 * @generated
	 */
	EReference getReadLinkAction_Result();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Self Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction
	 * @generated
	 */
	EClass getReadSelfAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction#getResult()
	 * @see #getReadSelfAction()
	 * @generated
	 */
	EReference getReadSelfAction_Result();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction <em>Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Structural Feature Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction
	 * @generated
	 */
	EClass getReadStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction#getResult()
	 * @see #getReadStructuralFeatureAction()
	 * @generated
	 */
	EReference getReadStructuralFeatureAction_Result();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData <em>Link End Creation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link End Creation Data</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData
	 * @generated
	 */
	EClass getLinkEndCreationData();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData#isReplaceAll <em>Replace All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace All</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData#isReplaceAll()
	 * @see #getLinkEndCreationData()
	 * @generated
	 */
	EAttribute getLinkEndCreationData_ReplaceAll();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData#getInsertAt <em>Insert At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insert At</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData#getInsertAt()
	 * @see #getLinkEndCreationData()
	 * @generated
	 */
	EReference getLinkEndCreationData_InsertAt();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData <em>Link End Destruction Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link End Destruction Data</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData
	 * @generated
	 */
	EClass getLinkEndDestructionData();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData#isDestroyDuplicates <em>Destroy Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destroy Duplicates</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData#isDestroyDuplicates()
	 * @see #getLinkEndDestructionData()
	 * @generated
	 */
	EAttribute getLinkEndDestructionData_DestroyDuplicates();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destroy At</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData#getDestroyAt()
	 * @see #getLinkEndDestructionData()
	 * @generated
	 */
	EReference getLinkEndDestructionData_DestroyAt();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction <em>Clear Association Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Association Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction
	 * @generated
	 */
	EClass getClearAssociationAction();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction#getAssociation()
	 * @see #getClearAssociationAction()
	 * @generated
	 */
	EReference getClearAssociationAction_Association();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction#getObject()
	 * @see #getClearAssociationAction()
	 * @generated
	 */
	EReference getClearAssociationAction_Object();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Structural Feature Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction
	 * @generated
	 */
	EClass getClearStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction#getResult()
	 * @see #getClearStructuralFeatureAction()
	 * @generated
	 */
	EReference getClearStructuralFeatureAction_Result();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateLinkAction <em>Create Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Link Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateLinkAction
	 * @generated
	 */
	EClass getCreateLinkAction();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Object Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction
	 * @generated
	 */
	EClass getCreateObjectAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction#getResult()
	 * @see #getCreateObjectAction()
	 * @generated
	 */
	EReference getCreateObjectAction_Result();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction#getClassifier()
	 * @see #getCreateObjectAction()
	 * @generated
	 */
	EReference getCreateObjectAction_Classifier();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyLinkAction <em>Destroy Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy Link Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyLinkAction
	 * @generated
	 */
	EClass getDestroyLinkAction();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy Object Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction
	 * @generated
	 */
	EClass getDestroyObjectAction();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#isDestroyLinks <em>Destroy Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destroy Links</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#isDestroyLinks()
	 * @see #getDestroyObjectAction()
	 * @generated
	 */
	EAttribute getDestroyObjectAction_DestroyLinks();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#isDestroyOwnedObjects <em>Destroy Owned Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destroy Owned Objects</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#isDestroyOwnedObjects()
	 * @see #getDestroyObjectAction()
	 * @generated
	 */
	EAttribute getDestroyObjectAction_DestroyOwnedObjects();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#getTarget()
	 * @see #getDestroyObjectAction()
	 * @generated
	 */
	EReference getDestroyObjectAction_Target();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Structural Feature Value Action</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction
	 * @generated
	 */
	EClass getAddStructuralFeatureValueAction();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction#isReplaceAll <em>Replace All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace All</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction#isReplaceAll()
	 * @see #getAddStructuralFeatureValueAction()
	 * @generated
	 */
	EAttribute getAddStructuralFeatureValueAction_ReplaceAll();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction#getInsertAt <em>Insert At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert At</em>'.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction#getInsertAt()
	 * @see #getAddStructuralFeatureValueAction()
	 * @generated
	 */
	EReference getAddStructuralFeatureValueAction_InsertAt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateActionsFactory getIntermediateActionsFactory();

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
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.StructuralFeatureActionImpl <em>Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.StructuralFeatureActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getStructuralFeatureAction()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE_ACTION = eINSTANCE.getStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeatureAction_StructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_FEATURE_ACTION__OBJECT = eINSTANCE.getStructuralFeatureAction_Object();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.TestIdentityActionImpl <em>Test Identity Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.TestIdentityActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getTestIdentityAction()
		 * @generated
		 */
		EClass TEST_IDENTITY_ACTION = eINSTANCE.getTestIdentityAction();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IDENTITY_ACTION__SECOND = eINSTANCE.getTestIdentityAction_Second();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IDENTITY_ACTION__RESULT = eINSTANCE.getTestIdentityAction_Result();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IDENTITY_ACTION__FIRST = eINSTANCE.getTestIdentityAction_First();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ValueSpecificationActionImpl <em>Value Specification Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ValueSpecificationActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getValueSpecificationAction()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION_ACTION = eINSTANCE.getValueSpecificationAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SPECIFICATION_ACTION__VALUE = eINSTANCE.getValueSpecificationAction_Value();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SPECIFICATION_ACTION__RESULT = eINSTANCE.getValueSpecificationAction_Result();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.WriteLinkActionImpl <em>Write Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.WriteLinkActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getWriteLinkAction()
		 * @generated
		 */
		EClass WRITE_LINK_ACTION = eINSTANCE.getWriteLinkAction();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkActionImpl <em>Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkAction()
		 * @generated
		 */
		EClass LINK_ACTION = eINSTANCE.getLinkAction();

		/**
		 * The meta object literal for the '<em><b>End Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ACTION__END_DATA = eINSTANCE.getLinkAction_EndData();

		/**
		 * The meta object literal for the '<em><b>Input Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ACTION__INPUT_VALUE = eINSTANCE.getLinkAction_InputValue();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDataImpl <em>Link End Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDataImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndData()
		 * @generated
		 */
		EClass LINK_END_DATA = eINSTANCE.getLinkEndData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DATA__VALUE = eINSTANCE.getLinkEndData_Value();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DATA__END = eINSTANCE.getLinkEndData_End();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.WriteStructuralFeatureActionImpl <em>Write Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.WriteStructuralFeatureActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getWriteStructuralFeatureAction()
		 * @generated
		 */
		EClass WRITE_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getWriteStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_STRUCTURAL_FEATURE_ACTION__VALUE = eINSTANCE.getWriteStructuralFeatureAction_Value();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_STRUCTURAL_FEATURE_ACTION__RESULT = eINSTANCE.getWriteStructuralFeatureAction_Result();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.RemoveStructuralFeatureValueActionImpl <em>Remove Structural Feature Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.RemoveStructuralFeatureValueActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getRemoveStructuralFeatureValueAction()
		 * @generated
		 */
		EClass REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION = eINSTANCE.getRemoveStructuralFeatureValueAction();

		/**
		 * The meta object literal for the '<em><b>Remove Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_DUPLICATES = eINSTANCE.getRemoveStructuralFeatureValueAction_RemoveDuplicates();

		/**
		 * The meta object literal for the '<em><b>Remove At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT = eINSTANCE.getRemoveStructuralFeatureValueAction_RemoveAt();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadLinkActionImpl <em>Read Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadLinkActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadLinkAction()
		 * @generated
		 */
		EClass READ_LINK_ACTION = eINSTANCE.getReadLinkAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_ACTION__RESULT = eINSTANCE.getReadLinkAction_Result();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadSelfActionImpl <em>Read Self Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadSelfActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadSelfAction()
		 * @generated
		 */
		EClass READ_SELF_ACTION = eINSTANCE.getReadSelfAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_SELF_ACTION__RESULT = eINSTANCE.getReadSelfAction_Result();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadStructuralFeatureActionImpl <em>Read Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ReadStructuralFeatureActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getReadStructuralFeatureAction()
		 * @generated
		 */
		EClass READ_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getReadStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_STRUCTURAL_FEATURE_ACTION__RESULT = eINSTANCE.getReadStructuralFeatureAction_Result();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndCreationDataImpl <em>Link End Creation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndCreationDataImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndCreationData()
		 * @generated
		 */
		EClass LINK_END_CREATION_DATA = eINSTANCE.getLinkEndCreationData();

		/**
		 * The meta object literal for the '<em><b>Replace All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_END_CREATION_DATA__REPLACE_ALL = eINSTANCE.getLinkEndCreationData_ReplaceAll();

		/**
		 * The meta object literal for the '<em><b>Insert At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_CREATION_DATA__INSERT_AT = eINSTANCE.getLinkEndCreationData_InsertAt();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDestructionDataImpl <em>Link End Destruction Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDestructionDataImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getLinkEndDestructionData()
		 * @generated
		 */
		EClass LINK_END_DESTRUCTION_DATA = eINSTANCE.getLinkEndDestructionData();

		/**
		 * The meta object literal for the '<em><b>Destroy Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_END_DESTRUCTION_DATA__DESTROY_DUPLICATES = eINSTANCE.getLinkEndDestructionData_DestroyDuplicates();

		/**
		 * The meta object literal for the '<em><b>Destroy At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DESTRUCTION_DATA__DESTROY_AT = eINSTANCE.getLinkEndDestructionData_DestroyAt();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ClearAssociationActionImpl <em>Clear Association Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ClearAssociationActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getClearAssociationAction()
		 * @generated
		 */
		EClass CLEAR_ASSOCIATION_ACTION = eINSTANCE.getClearAssociationAction();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEAR_ASSOCIATION_ACTION__ASSOCIATION = eINSTANCE.getClearAssociationAction_Association();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEAR_ASSOCIATION_ACTION__OBJECT = eINSTANCE.getClearAssociationAction_Object();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ClearStructuralFeatureActionImpl <em>Clear Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.ClearStructuralFeatureActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getClearStructuralFeatureAction()
		 * @generated
		 */
		EClass CLEAR_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getClearStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT = eINSTANCE.getClearStructuralFeatureAction_Result();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.CreateLinkActionImpl <em>Create Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.CreateLinkActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getCreateLinkAction()
		 * @generated
		 */
		EClass CREATE_LINK_ACTION = eINSTANCE.getCreateLinkAction();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.CreateObjectActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getCreateObjectAction()
		 * @generated
		 */
		EClass CREATE_OBJECT_ACTION = eINSTANCE.getCreateObjectAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_OBJECT_ACTION__RESULT = eINSTANCE.getCreateObjectAction_Result();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_OBJECT_ACTION__CLASSIFIER = eINSTANCE.getCreateObjectAction_Classifier();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.DestroyLinkActionImpl <em>Destroy Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.DestroyLinkActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getDestroyLinkAction()
		 * @generated
		 */
		EClass DESTROY_LINK_ACTION = eINSTANCE.getDestroyLinkAction();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.DestroyObjectActionImpl <em>Destroy Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.DestroyObjectActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getDestroyObjectAction()
		 * @generated
		 */
		EClass DESTROY_OBJECT_ACTION = eINSTANCE.getDestroyObjectAction();

		/**
		 * The meta object literal for the '<em><b>Destroy Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTROY_OBJECT_ACTION__DESTROY_LINKS = eINSTANCE.getDestroyObjectAction_DestroyLinks();

		/**
		 * The meta object literal for the '<em><b>Destroy Owned Objects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTROY_OBJECT_ACTION__DESTROY_OWNED_OBJECTS = eINSTANCE.getDestroyObjectAction_DestroyOwnedObjects();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTROY_OBJECT_ACTION__TARGET = eINSTANCE.getDestroyObjectAction_Target();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl <em>Add Structural Feature Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl
		 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl#getAddStructuralFeatureValueAction()
		 * @generated
		 */
		EClass ADD_STRUCTURAL_FEATURE_VALUE_ACTION = eINSTANCE.getAddStructuralFeatureValueAction();

		/**
		 * The meta object literal for the '<em><b>Replace All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REPLACE_ALL = eINSTANCE.getAddStructuralFeatureValueAction_ReplaceAll();

		/**
		 * The meta object literal for the '<em><b>Insert At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT = eINSTANCE.getAddStructuralFeatureValueAction_InsertAt();

	}

} //IntermediateActionsPackage

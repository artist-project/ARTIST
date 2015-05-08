/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.Communications;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.CommunicationsFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Communications";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/fuml/syntax/commonbehaviors/communications";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fUML.Syntax.CommonBehaviors.Communications";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationsPackage eINSTANCE = org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.TriggerImpl
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OWNED_ELEMENT = KernelPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OWNER = KernelPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OWNED_COMMENT = KernelPackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = KernelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__VISIBILITY = KernelPackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__QUALIFIED_NAME = KernelPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAMESPACE = KernelPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EVENT = KernelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = KernelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.EventImpl
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNED_ELEMENT = KernelPackage.PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNER = KernelPackage.PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNED_COMMENT = KernelPackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = KernelPackage.PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VISIBILITY = KernelPackage.PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__QUALIFIED_NAME = KernelPackage.PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAMESPACE = KernelPackage.PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = KernelPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.SignalImpl
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OWNED_ELEMENT = KernelPackage.CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OWNER = KernelPackage.CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OWNED_COMMENT = KernelPackage.CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = KernelPackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__VISIBILITY = KernelPackage.CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__QUALIFIED_NAME = KernelPackage.CLASSIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAMESPACE = KernelPackage.CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__MEMBER = KernelPackage.CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ELEMENT_IMPORT = KernelPackage.CLASSIFIER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PACKAGE_IMPORT = KernelPackage.CLASSIFIER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__IMPORTED_MEMBER = KernelPackage.CLASSIFIER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OWNED_MEMBER = KernelPackage.CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PACKAGE = KernelPackage.CLASSIFIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ABSTRACT = KernelPackage.CLASSIFIER__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__GENERALIZATION = KernelPackage.CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__FEATURE = KernelPackage.CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__INHERITED_MEMBER = KernelPackage.CLASSIFIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ATTRIBUTE = KernelPackage.CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__GENERAL = KernelPackage.CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__FINAL_SPECIALIZATION = KernelPackage.CLASSIFIER__FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OWNED_ATTRIBUTE = KernelPackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = KernelPackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.MessageEventImpl <em>Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.MessageEventImpl
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__OWNED_ELEMENT = EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__OWNER = EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__OWNED_COMMENT = EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__QUALIFIED_NAME = EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__NAMESPACE = EVENT__NAMESPACE;

	/**
	 * The number of structural features of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.SignalEventImpl <em>Signal Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.SignalEventImpl
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getSignalEvent()
	 * @generated
	 */
	int SIGNAL_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__OWNED_ELEMENT = MESSAGE_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__OWNER = MESSAGE_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__OWNED_COMMENT = MESSAGE_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__NAME = MESSAGE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__VISIBILITY = MESSAGE_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__QUALIFIED_NAME = MESSAGE_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__NAMESPACE = MESSAGE_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__SIGNAL = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.ReceptionImpl <em>Reception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.ReceptionImpl
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getReception()
	 * @generated
	 */
	int RECEPTION = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__OWNED_ELEMENT = KernelPackage.BEHAVIORAL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__OWNER = KernelPackage.BEHAVIORAL_FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__OWNED_COMMENT = KernelPackage.BEHAVIORAL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__NAME = KernelPackage.BEHAVIORAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__VISIBILITY = KernelPackage.BEHAVIORAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__QUALIFIED_NAME = KernelPackage.BEHAVIORAL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__NAMESPACE = KernelPackage.BEHAVIORAL_FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__LEAF = KernelPackage.BEHAVIORAL_FEATURE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__REDEFINED_ELEMENT = KernelPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__REDEFINITION_CONTEXT = KernelPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__FEATURING_CLASSIFIER = KernelPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__STATIC = KernelPackage.BEHAVIORAL_FEATURE__STATIC;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__OWNED_PARAMETER = KernelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__ABSTRACT = KernelPackage.BEHAVIORAL_FEATURE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__METHOD = KernelPackage.BEHAVIORAL_FEATURE__METHOD;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__CONCURRENCY = KernelPackage.BEHAVIORAL_FEATURE__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__SIGNAL = KernelPackage.BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_FEATURE_COUNT = KernelPackage.BEHAVIORAL_FEATURE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger#getEvent()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Event();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal#getOwnedAttribute()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_OwnedAttribute();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent <em>Signal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Event</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent
	 * @generated
	 */
	EClass getSignalEvent();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent#getSignal()
	 * @see #getSignalEvent()
	 * @generated
	 */
	EReference getSignalEvent_Signal();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.MessageEvent
	 * @generated
	 */
	EClass getMessageEvent();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reception</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception
	 * @generated
	 */
	EClass getReception();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception#getSignal()
	 * @see #getReception()
	 * @generated
	 */
	EReference getReception_Signal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationsFactory getCommunicationsFactory();

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
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.TriggerImpl
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__EVENT = eINSTANCE.getTrigger_Event();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.EventImpl
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.SignalImpl
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__OWNED_ATTRIBUTE = eINSTANCE.getSignal_OwnedAttribute();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.SignalEventImpl <em>Signal Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.SignalEventImpl
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getSignalEvent()
		 * @generated
		 */
		EClass SIGNAL_EVENT = eINSTANCE.getSignalEvent();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_EVENT__SIGNAL = eINSTANCE.getSignalEvent_Signal();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.MessageEventImpl <em>Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.MessageEventImpl
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getMessageEvent()
		 * @generated
		 */
		EClass MESSAGE_EVENT = eINSTANCE.getMessageEvent();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.ReceptionImpl <em>Reception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.ReceptionImpl
		 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsPackageImpl#getReception()
		 * @generated
		 */
		EClass RECEPTION = eINSTANCE.getReception();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEPTION__SIGNAL = eINSTANCE.getReception_Signal();

	}

} //CommunicationsPackage

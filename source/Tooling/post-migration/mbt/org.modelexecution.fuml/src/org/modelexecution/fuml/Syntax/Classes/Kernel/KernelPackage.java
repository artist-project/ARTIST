/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

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
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelFactory
 * @model kind="package"
 * @generated
 */
public interface KernelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Kernel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/fuml/syntax/classes/kernel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fUML.Syntax.Classes.Kernel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelPackage eINSTANCE = org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ElementImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.NamedElementImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__VISIBILITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__QUALIFIED_NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAMESPACE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.TypedElementImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ValueSpecificationImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__OWNED_ELEMENT = TYPED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__OWNER = TYPED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__OWNED_COMMENT = TYPED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__VISIBILITY = TYPED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__QUALIFIED_NAME = TYPED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__NAMESPACE = TYPED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.CommentImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ANNOTATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.NamespaceImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ELEMENT_IMPORT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PACKAGE_IMPORT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__IMPORTED_MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ElementImportImpl <em>Element Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ElementImportImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getElementImport()
	 * @generated
	 */
	int ELEMENT_IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__VISIBILITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__ALIAS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__IMPORTED_ELEMENT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Importing Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__IMPORTING_NAMESPACE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageableElementImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getPackageableElement()
	 * @generated
	 */
	int PACKAGEABLE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The number of structural features of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImportImpl <em>Package Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImportImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getPackageImport()
	 * @generated
	 */
	int PACKAGE_IMPORT = 8;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__VISIBILITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__IMPORTED_PACKAGE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Importing Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__IMPORTING_NAMESPACE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_ELEMENT = NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_COMMENT = NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VISIBILITY = NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__QUALIFIED_NAME = NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAMESPACE = NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MEMBER = NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENT_IMPORT = NAMESPACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_IMPORT = NAMESPACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IMPORTED_MEMBER = NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_MEMBER = NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGED_ELEMENT = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_TYPE = NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NESTED_PACKAGE = NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NESTING_PACKAGE = NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.TypeImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 10;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_ELEMENT = PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNER = PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_COMMENT = PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__VISIBILITY = PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__QUALIFIED_NAME = PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAMESPACE = PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PACKAGE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.RedefinableElementImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getRedefinableElement()
	 * @generated
	 */
	int REDEFINABLE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__LEAF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__REDEFINED_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Redefinable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.FeatureImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 12;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_ELEMENT = REDEFINABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNER = REDEFINABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_COMMENT = REDEFINABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = REDEFINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VISIBILITY = REDEFINABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__QUALIFIED_NAME = REDEFINABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAMESPACE = REDEFINABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LEAF = REDEFINABLE_ELEMENT__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REDEFINED_ELEMENT = REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REDEFINITION_CONTEXT = REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURING_CLASSIFIER = REDEFINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__STATIC = REDEFINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = REDEFINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.StructuralFeatureImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__OWNED_COMMENT = FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__VISIBILITY = FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__QUALIFIED_NAME = FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAMESPACE = FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__LEAF = FEATURE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__REDEFINED_ELEMENT = FEATURE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__REDEFINITION_CONTEXT = FEATURE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__FEATURING_CLASSIFIER = FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__STATIC = FEATURE__STATIC;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__ORDERED = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__UNIQUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__UPPER = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__LOWER = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__UPPER_VALUE = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__LOWER_VALUE = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__TYPE = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__READ_ONLY = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 14;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_ELEMENT = NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNER = NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_COMMENT = NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__VISIBILITY = NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__QUALIFIED_NAME = NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAMESPACE = NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__MEMBER = NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ELEMENT_IMPORT = NAMESPACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__PACKAGE_IMPORT = NAMESPACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IMPORTED_MEMBER = NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_MEMBER = NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__PACKAGE = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ABSTRACT = NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__GENERALIZATION = NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FEATURE = NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__INHERITED_MEMBER = NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ATTRIBUTE = NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__GENERAL = NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FINAL_SPECIALIZATION = NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.GeneralizationImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 15;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Substitutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SUBSTITUTABLE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PropertyImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNED_ELEMENT = STRUCTURAL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNER = STRUCTURAL_FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNED_COMMENT = STRUCTURAL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = STRUCTURAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__QUALIFIED_NAME = STRUCTURAL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAMESPACE = STRUCTURAL_FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LEAF = STRUCTURAL_FEATURE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINED_ELEMENT = STRUCTURAL_FEATURE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINITION_CONTEXT = STRUCTURAL_FEATURE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FEATURING_CLASSIFIER = STRUCTURAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STATIC = STRUCTURAL_FEATURE__STATIC;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ORDERED = STRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UNIQUE = STRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER = STRUCTURAL_FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER = STRUCTURAL_FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_VALUE = STRUCTURAL_FEATURE__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_VALUE = STRUCTURAL_FEATURE__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = STRUCTURAL_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__READ_ONLY = STRUCTURAL_FEATURE__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DERIVED = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DERIVED_UNION = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__AGGREGATION = STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMPOSITE = STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning Association</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNING_ASSOCIATION = STRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATION = STRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATATYPE = STRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLASS = STRUCTURAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPPOSITE = STRUCTURAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.AssociationImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 17;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_ELEMENT = CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNER = CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_COMMENT = CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__QUALIFIED_NAME = CLASSIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAMESPACE = CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBER = CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ELEMENT_IMPORT = CLASSIFIER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PACKAGE_IMPORT = CLASSIFIER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IMPORTED_MEMBER = CLASSIFIER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_MEMBER = CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PACKAGE = CLASSIFIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ABSTRACT = CLASSIFIER__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__GENERALIZATION = CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FEATURE = CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INHERITED_MEMBER = CLASSIFIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ATTRIBUTE = CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__GENERAL = CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FINAL_SPECIALIZATION = CLASSIFIER__FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DERIVED = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__END_TYPE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBER_END = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Navigable Owned End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAVIGABLE_OWNED_END = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_END = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.DataTypeImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_ELEMENT = CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNER = CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_COMMENT = CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__QUALIFIED_NAME = CLASSIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAMESPACE = CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MEMBER = CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ELEMENT_IMPORT = CLASSIFIER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PACKAGE_IMPORT = CLASSIFIER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IMPORTED_MEMBER = CLASSIFIER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_MEMBER = CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PACKAGE = CLASSIFIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ABSTRACT = CLASSIFIER__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__GENERALIZATION = CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FEATURE = CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INHERITED_MEMBER = CLASSIFIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ATTRIBUTE = CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__GENERAL = CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FINAL_SPECIALIZATION = CLASSIFIER__FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_ATTRIBUTE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.MultiplicityElementImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__ORDERED = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UNIQUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER_VALUE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER_VALUE = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.BehavioralFeatureImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getBehavioralFeature()
	 * @generated
	 */
	int BEHAVIORAL_FEATURE = 20;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_COMMENT = FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__VISIBILITY = FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__QUALIFIED_NAME = FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__NAMESPACE = FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__LEAF = FEATURE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__REDEFINED_ELEMENT = FEATURE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT = FEATURE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER = FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__STATIC = FEATURE__STATIC;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_PARAMETER = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__ABSTRACT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__METHOD = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__CONCURRENCY = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ParameterImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_ELEMENT = MULTIPLICITY_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNER = MULTIPLICITY_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_COMMENT = MULTIPLICITY_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ORDERED = MULTIPLICITY_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIQUE = MULTIPLICITY_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UPPER = MULTIPLICITY_ELEMENT__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOWER = MULTIPLICITY_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UPPER_VALUE = MULTIPLICITY_ELEMENT__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOWER_VALUE = MULTIPLICITY_ELEMENT__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VISIBILITY = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__QUALIFIED_NAME = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAMESPACE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIRECTION = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.OperationImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 22;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_ELEMENT = BEHAVIORAL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNER = BEHAVIORAL_FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_COMMENT = BEHAVIORAL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = BEHAVIORAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = BEHAVIORAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__QUALIFIED_NAME = BEHAVIORAL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAMESPACE = BEHAVIORAL_FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LEAF = BEHAVIORAL_FEATURE__LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINED_ELEMENT = BEHAVIORAL_FEATURE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINITION_CONTEXT = BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FEATURING_CLASSIFIER = BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__STATIC = BEHAVIORAL_FEATURE__STATIC;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMETER = BEHAVIORAL_FEATURE__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ABSTRACT = BEHAVIORAL_FEATURE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__METHOD = BEHAVIORAL_FEATURE__METHOD;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONCURRENCY = BEHAVIORAL_FEATURE__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__QUERY = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ORDERED = BEHAVIORAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UNIQUE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LOWER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UPPER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CLASS = BEHAVIORAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINED_OPERATION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.InstanceSpecificationImpl <em>Instance Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.InstanceSpecificationImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getInstanceSpecification()
	 * @generated
	 */
	int INSTANCE_SPECIFICATION = 23;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__CLASSIFIER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__SLOT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.SlotImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 24;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Defining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DEFINING_FEATURE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__OWNING_INSTANCE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.InstanceValueImpl <em>Instance Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.InstanceValueImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getInstanceValue()
	 * @generated
	 */
	int INSTANCE_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__OWNED_ELEMENT = VALUE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__OWNER = VALUE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__OWNED_COMMENT = VALUE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__VISIBILITY = VALUE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__QUALIFIED_NAME = VALUE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__NAMESPACE = VALUE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__INSTANCE = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralSpecificationImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralSpecification()
	 * @generated
	 */
	int LITERAL_SPECIFICATION = 27;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__OWNED_ELEMENT = VALUE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__OWNER = VALUE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__OWNED_COMMENT = VALUE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__VISIBILITY = VALUE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__QUALIFIED_NAME = VALUE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__NAMESPACE = VALUE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The number of structural features of the '<em>Literal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralBooleanImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralBoolean()
	 * @generated
	 */
	int LITERAL_BOOLEAN = 26;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralIntegerImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 28;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralNullImpl <em>Literal Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralNullImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralNull()
	 * @generated
	 */
	int LITERAL_NULL = 29;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The number of structural features of the '<em>Literal Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralStringImpl <em>Literal String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralStringImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralString()
	 * @generated
	 */
	int LITERAL_STRING = 30;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralUnlimitedNaturalImpl <em>Literal Unlimited Natural</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralUnlimitedNaturalImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralUnlimitedNatural()
	 * @generated
	 */
	int LITERAL_UNLIMITED_NATURAL = 31;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Unlimited Natural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PrimitiveTypeImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OWNED_ELEMENT = DATA_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OWNER = DATA_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OWNED_COMMENT = DATA_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__VISIBILITY = DATA_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__QUALIFIED_NAME = DATA_TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAMESPACE = DATA_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__MEMBER = DATA_TYPE__MEMBER;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ELEMENT_IMPORT = DATA_TYPE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PACKAGE_IMPORT = DATA_TYPE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IMPORTED_MEMBER = DATA_TYPE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OWNED_MEMBER = DATA_TYPE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PACKAGE = DATA_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ABSTRACT = DATA_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__GENERALIZATION = DATA_TYPE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__FEATURE = DATA_TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__INHERITED_MEMBER = DATA_TYPE__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ATTRIBUTE = DATA_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__GENERAL = DATA_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__FINAL_SPECIALIZATION = DATA_TYPE__FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__OWNED_ATTRIBUTE = DATA_TYPE__OWNED_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.EnumerationImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 33;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_ELEMENT = DATA_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNER = DATA_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_COMMENT = DATA_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VISIBILITY = DATA_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__QUALIFIED_NAME = DATA_TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAMESPACE = DATA_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__MEMBER = DATA_TYPE__MEMBER;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ELEMENT_IMPORT = DATA_TYPE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PACKAGE_IMPORT = DATA_TYPE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IMPORTED_MEMBER = DATA_TYPE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_MEMBER = DATA_TYPE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PACKAGE = DATA_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ABSTRACT = DATA_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GENERALIZATION = DATA_TYPE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__FEATURE = DATA_TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__INHERITED_MEMBER = DATA_TYPE__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ATTRIBUTE = DATA_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GENERAL = DATA_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__FINAL_SPECIALIZATION = DATA_TYPE__FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_ATTRIBUTE = DATA_TYPE__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_LITERAL = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.EnumerationLiteralImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 34;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__OWNED_ELEMENT = INSTANCE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__OWNER = INSTANCE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__OWNED_COMMENT = INSTANCE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = INSTANCE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__VISIBILITY = INSTANCE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__QUALIFIED_NAME = INSTANCE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAMESPACE = INSTANCE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__CLASSIFIER = INSTANCE_SPECIFICATION__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__SLOT = INSTANCE_SPECIFICATION__SLOT;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__ENUMERATION = INSTANCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = INSTANCE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 35;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ELEMENT = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNER = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_COMMENT = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VISIBILITY = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__QUALIFIED_NAME = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAMESPACE = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBER = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ELEMENT_IMPORT = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE_IMPORT = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPORTED_MEMBER = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_MEMBER = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ABSTRACT = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERALIZATION = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FEATURE = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INHERITED_MEMBER = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTE = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERAL = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FINAL_SPECIALIZATION = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_BEHAVIOR = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASSIFIER_BEHAVIOR = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ATTRIBUTE = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_OPERATION = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ACTIVE = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_RECEPTION = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NESTED_CLASSIFIER = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = BasicBehaviorsPackage.BEHAVIORED_CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 36;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.AggregationKind <em>Aggregation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.AggregationKind
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getAggregationKind()
	 * @generated
	 */
	int AGGREGATION_KIND = 37;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ParameterDirectionKind
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getParameterDirectionKind()
	 * @generated
	 */
	int PARAMETER_DIRECTION_KIND = 38;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getVisibility()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getQualifiedName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getNamespace()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Namespace();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Element#getOwnedElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Element#getOwner()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Element#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Comment</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Element#getOwnedComment()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedComment();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Comment#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Comment#getAnnotatedElement()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_AnnotatedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getMember()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Member();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Import</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getElementImport()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_ElementImport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getPackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Import</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getPackageImport()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_PackageImport();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getImportedMember <em>Imported Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Member</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getImportedMember()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_ImportedMember();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Member</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getOwnedMember()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_OwnedMember();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Import</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport
	 * @generated
	 */
	EClass getElementImport();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getVisibility()
	 * @see #getElementImport()
	 * @generated
	 */
	EAttribute getElementImport_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getAlias()
	 * @see #getElementImport()
	 * @generated
	 */
	EAttribute getElementImport_Alias();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getImportedElement()
	 * @see #getElementImport()
	 * @generated
	 */
	EReference getElementImport_ImportedElement();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importing Namespace</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getImportingNamespace()
	 * @see #getElementImport()
	 * @generated
	 */
	EReference getElementImport_ImportingNamespace();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageable Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.PackageableElement
	 * @generated
	 */
	EClass getPackageableElement();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Import</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport
	 * @generated
	 */
	EClass getPackageImport();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport#getVisibility()
	 * @see #getPackageImport()
	 * @generated
	 */
	EAttribute getPackageImport_Visibility();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport#getImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Package</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport#getImportedPackage()
	 * @see #getPackageImport()
	 * @generated
	 */
	EReference getPackageImport_ImportedPackage();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importing Namespace</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport#getImportingNamespace()
	 * @see #getPackageImport()
	 * @generated
	 */
	EReference getPackageImport_ImportingNamespace();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Package#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Package#getPackagedElement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackagedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Package#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Type</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Package#getOwnedType()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedType();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nested Package</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Package#getNestedPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_NestedPackage();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nesting Package</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Package#getNestingPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_NestingPackage();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Type#getPackage()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Package();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.StructuralFeature#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.StructuralFeature#isReadOnly()
	 * @see #getStructuralFeature()
	 * @generated
	 */
	EAttribute getStructuralFeature_ReadOnly();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Featuring Classifier</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Feature#getFeaturingClassifier()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeaturingClassifier();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Feature#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Feature#isStatic()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Static();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefinable Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement
	 * @generated
	 */
	EClass getRedefinableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement#isLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement#isLeaf()
	 * @see #getRedefinableElement()
	 * @generated
	 */
	EAttribute getRedefinableElement_Leaf();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement#getRedefinedElement <em>Redefined Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement#getRedefinedElement()
	 * @see #getRedefinableElement()
	 * @generated
	 */
	EReference getRedefinableElement_RedefinedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement#getRedefinitionContext <em>Redefinition Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefinition Context</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement#getRedefinitionContext()
	 * @see #getRedefinableElement()
	 * @generated
	 */
	EReference getRedefinableElement_RedefinitionContext();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#isAbstract()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalization</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getGeneralization()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Generalization();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getFeature()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Feature();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getInheritedMember <em>Inherited Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Member</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getInheritedMember()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_InheritedMember();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getAttribute()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getGeneral()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_General();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#isFinalSpecialization <em>Final Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Specialization</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#isFinalSpecialization()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_FinalSpecialization();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization#isSubstitutable <em>Substitutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substitutable</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization#isSubstitutable()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Substitutable();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specific</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#isDerived()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Derived();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#isDerivedUnion <em>Derived Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Union</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#isDerivedUnion()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DerivedUnion();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getAggregation()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Aggregation();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#isComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#isComposite()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Composite();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Association</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getOwningAssociation()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OwningAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getAssociation()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Association();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Datatype</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getDatatype()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Datatype();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getClass_()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Class();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getOpposite()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Opposite();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Association#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Association#isDerived()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Derived();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getEndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Type</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getEndType()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_EndType();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member End</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getMemberEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_MemberEnd();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getNavigableOwnedEnd <em>Navigable Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Navigable Owned End</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getNavigableOwnedEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_NavigableOwnedEnd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned End</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getOwnedEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_OwnedEnd();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.DataType#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.DataType#getOwnedAttribute()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_OwnedAttribute();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#isOrdered()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#isUnique()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#getUpper()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Upper();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#getLower()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#getUpperValue <em>Upper Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#getUpperValue()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EReference getMultiplicityElement_UpperValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement#getLowerValue()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EReference getMultiplicityElement_LowerValue();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Feature</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature
	 * @generated
	 */
	EClass getBehavioralFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getOwnedParameter()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_OwnedParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#isAbstract()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EAttribute getBehavioralFeature_Abstract();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Method</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getMethod()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getConcurrency()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EAttribute getBehavioralFeature_Concurrency();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter#getDirection()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Direction();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#isQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#isQuery()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#isOrdered()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#isUnique()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getLower()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Lower();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getUpper()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Upper();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getClass_()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Class();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getRedefinedOperation <em>Redefined Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Operation</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getRedefinedOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RedefinedOperation();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Type();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification <em>Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Specification</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification
	 * @generated
	 */
	EClass getInstanceSpecification();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifier</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification#getClassifier()
	 * @see #getInstanceSpecification()
	 * @generated
	 */
	EReference getInstanceSpecification_Classifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification#getSlot()
	 * @see #getInstanceSpecification()
	 * @generated
	 */
	EReference getInstanceSpecification_Slot();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Slot#getDefiningFeature <em>Defining Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defining Feature</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Slot#getDefiningFeature()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_DefiningFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Slot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Slot#getValue()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Value();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Slot#getOwningInstance <em>Owning Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Instance</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Slot#getOwningInstance()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_OwningInstance();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceValue <em>Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceValue
	 * @generated
	 */
	EClass getInstanceValue();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceValue#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceValue#getInstance()
	 * @see #getInstanceValue()
	 * @generated
	 */
	EReference getInstanceValue_Instance();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralBoolean
	 * @generated
	 */
	EClass getLiteralBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralBoolean#isValue()
	 * @see #getLiteralBoolean()
	 * @generated
	 */
	EAttribute getLiteralBoolean_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Specification</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralSpecification
	 * @generated
	 */
	EClass getLiteralSpecification();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralInteger#getValue()
	 * @see #getLiteralInteger()
	 * @generated
	 */
	EAttribute getLiteralInteger_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Null</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralNull
	 * @generated
	 */
	EClass getLiteralNull();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal String</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralString
	 * @generated
	 */
	EClass getLiteralString();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralString#getValue()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralUnlimitedNatural <em>Literal Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Unlimited Natural</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralUnlimitedNatural
	 * @generated
	 */
	EClass getLiteralUnlimitedNatural();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralUnlimitedNatural#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralUnlimitedNatural#getValue()
	 * @see #getLiteralUnlimitedNatural()
	 * @generated
	 */
	EAttribute getLiteralUnlimitedNatural_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Enumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Literal</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Enumeration#getOwnedLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_OwnedLiteral();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enumeration</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.EnumerationLiteral#getEnumeration()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EReference getEnumerationLiteral_Enumeration();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedAttribute()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedOperation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedOperation();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getSuperClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SuperClass();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Class#isActive()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Active();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedReception <em>Owned Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Reception</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedReception()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedReception();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getNestedClassifier <em>Nested Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Classifier</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getNestedClassifier()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_NestedClassifier();

	/**
	 * Returns the meta object for enum '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.AggregationKind <em>Aggregation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Kind</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.AggregationKind
	 * @generated
	 */
	EEnum getAggregationKind();

	/**
	 * Returns the meta object for enum '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ParameterDirectionKind <em>Parameter Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Direction Kind</em>'.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ParameterDirectionKind
	 * @generated
	 */
	EEnum getParameterDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KernelFactory getKernelFactory();

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
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ValueSpecificationImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.TypedElementImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.NamedElementImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__VISIBILITY = eINSTANCE.getNamedElement_Visibility();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__QUALIFIED_NAME = eINSTANCE.getNamedElement_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__NAMESPACE = eINSTANCE.getNamedElement_Namespace();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ElementImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNED_ELEMENT = eINSTANCE.getElement_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNER = eINSTANCE.getElement_Owner();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNED_COMMENT = eINSTANCE.getElement_OwnedComment();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.CommentImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Annotated Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__ANNOTATED_ELEMENT = eINSTANCE.getComment_AnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.NamespaceImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__MEMBER = eINSTANCE.getNamespace_Member();

		/**
		 * The meta object literal for the '<em><b>Element Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__ELEMENT_IMPORT = eINSTANCE.getNamespace_ElementImport();

		/**
		 * The meta object literal for the '<em><b>Package Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__PACKAGE_IMPORT = eINSTANCE.getNamespace_PackageImport();

		/**
		 * The meta object literal for the '<em><b>Imported Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__IMPORTED_MEMBER = eINSTANCE.getNamespace_ImportedMember();

		/**
		 * The meta object literal for the '<em><b>Owned Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__OWNED_MEMBER = eINSTANCE.getNamespace_OwnedMember();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ElementImportImpl <em>Element Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ElementImportImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getElementImport()
		 * @generated
		 */
		EClass ELEMENT_IMPORT = eINSTANCE.getElementImport();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IMPORT__VISIBILITY = eINSTANCE.getElementImport_Visibility();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IMPORT__ALIAS = eINSTANCE.getElementImport_Alias();

		/**
		 * The meta object literal for the '<em><b>Imported Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_IMPORT__IMPORTED_ELEMENT = eINSTANCE.getElementImport_ImportedElement();

		/**
		 * The meta object literal for the '<em><b>Importing Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getElementImport_ImportingNamespace();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageableElementImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getPackageableElement()
		 * @generated
		 */
		EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImportImpl <em>Package Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImportImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getPackageImport()
		 * @generated
		 */
		EClass PACKAGE_IMPORT = eINSTANCE.getPackageImport();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_IMPORT__VISIBILITY = eINSTANCE.getPackageImport_Visibility();

		/**
		 * The meta object literal for the '<em><b>Imported Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_IMPORT__IMPORTED_PACKAGE = eINSTANCE.getPackageImport_ImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Importing Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getPackageImport_ImportingNamespace();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGED_ELEMENT = eINSTANCE.getPackage_PackagedElement();

		/**
		 * The meta object literal for the '<em><b>Owned Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNED_TYPE = eINSTANCE.getPackage_OwnedType();

		/**
		 * The meta object literal for the '<em><b>Nested Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NESTED_PACKAGE = eINSTANCE.getPackage_NestedPackage();

		/**
		 * The meta object literal for the '<em><b>Nesting Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NESTING_PACKAGE = eINSTANCE.getPackage_NestingPackage();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.TypeImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PACKAGE = eINSTANCE.getType_Package();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.StructuralFeatureImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE__READ_ONLY = eINSTANCE.getStructuralFeature_ReadOnly();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.FeatureImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Featuring Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURING_CLASSIFIER = eINSTANCE.getFeature_FeaturingClassifier();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__STATIC = eINSTANCE.getFeature_Static();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.RedefinableElementImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getRedefinableElement()
		 * @generated
		 */
		EClass REDEFINABLE_ELEMENT = eINSTANCE.getRedefinableElement();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDEFINABLE_ELEMENT__LEAF = eINSTANCE.getRedefinableElement_Leaf();

		/**
		 * The meta object literal for the '<em><b>Redefined Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINABLE_ELEMENT__REDEFINED_ELEMENT = eINSTANCE.getRedefinableElement_RedefinedElement();

		/**
		 * The meta object literal for the '<em><b>Redefinition Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT = eINSTANCE.getRedefinableElement_RedefinitionContext();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__ABSTRACT = eINSTANCE.getClassifier_Abstract();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__GENERALIZATION = eINSTANCE.getClassifier_Generalization();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__FEATURE = eINSTANCE.getClassifier_Feature();

		/**
		 * The meta object literal for the '<em><b>Inherited Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__INHERITED_MEMBER = eINSTANCE.getClassifier_InheritedMember();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__ATTRIBUTE = eINSTANCE.getClassifier_Attribute();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__GENERAL = eINSTANCE.getClassifier_General();

		/**
		 * The meta object literal for the '<em><b>Final Specialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__FINAL_SPECIALIZATION = eINSTANCE.getClassifier_FinalSpecialization();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.GeneralizationImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Substitutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__SUBSTITUTABLE = eINSTANCE.getGeneralization_Substitutable();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PropertyImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DERIVED = eINSTANCE.getProperty_Derived();

		/**
		 * The meta object literal for the '<em><b>Derived Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DERIVED_UNION = eINSTANCE.getProperty_DerivedUnion();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__AGGREGATION = eINSTANCE.getProperty_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__COMPOSITE = eINSTANCE.getProperty_Composite();

		/**
		 * The meta object literal for the '<em><b>Owning Association</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OWNING_ASSOCIATION = eINSTANCE.getProperty_OwningAssociation();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ASSOCIATION = eINSTANCE.getProperty_Association();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DATATYPE = eINSTANCE.getProperty_Datatype();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CLASS = eINSTANCE.getProperty_Class();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OPPOSITE = eINSTANCE.getProperty_Opposite();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.AssociationImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__DERIVED = eINSTANCE.getAssociation_Derived();

		/**
		 * The meta object literal for the '<em><b>End Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__END_TYPE = eINSTANCE.getAssociation_EndType();

		/**
		 * The meta object literal for the '<em><b>Member End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__MEMBER_END = eINSTANCE.getAssociation_MemberEnd();

		/**
		 * The meta object literal for the '<em><b>Navigable Owned End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__NAVIGABLE_OWNED_END = eINSTANCE.getAssociation_NavigableOwnedEnd();

		/**
		 * The meta object literal for the '<em><b>Owned End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__OWNED_END = eINSTANCE.getAssociation_OwnedEnd();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.DataTypeImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__OWNED_ATTRIBUTE = eINSTANCE.getDataType_OwnedAttribute();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.MultiplicityElementImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__ORDERED = eINSTANCE.getMultiplicityElement_Ordered();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__UNIQUE = eINSTANCE.getMultiplicityElement_Unique();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__UPPER = eINSTANCE.getMultiplicityElement_Upper();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__LOWER = eINSTANCE.getMultiplicityElement_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_ELEMENT__UPPER_VALUE = eINSTANCE.getMultiplicityElement_UpperValue();

		/**
		 * The meta object literal for the '<em><b>Lower Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_ELEMENT__LOWER_VALUE = eINSTANCE.getMultiplicityElement_LowerValue();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.BehavioralFeatureImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getBehavioralFeature()
		 * @generated
		 */
		EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__OWNED_PARAMETER = eINSTANCE.getBehavioralFeature_OwnedParameter();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIORAL_FEATURE__ABSTRACT = eINSTANCE.getBehavioralFeature_Abstract();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__METHOD = eINSTANCE.getBehavioralFeature_Method();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIORAL_FEATURE__CONCURRENCY = eINSTANCE.getBehavioralFeature_Concurrency();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ParameterImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DIRECTION = eINSTANCE.getParameter_Direction();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.OperationImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__QUERY = eINSTANCE.getOperation_Query();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ORDERED = eINSTANCE.getOperation_Ordered();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__UNIQUE = eINSTANCE.getOperation_Unique();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__LOWER = eINSTANCE.getOperation_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__UPPER = eINSTANCE.getOperation_Upper();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CLASS = eINSTANCE.getOperation_Class();

		/**
		 * The meta object literal for the '<em><b>Redefined Operation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__REDEFINED_OPERATION = eINSTANCE.getOperation_RedefinedOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__TYPE = eINSTANCE.getOperation_Type();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.InstanceSpecificationImpl <em>Instance Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.InstanceSpecificationImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getInstanceSpecification()
		 * @generated
		 */
		EClass INSTANCE_SPECIFICATION = eINSTANCE.getInstanceSpecification();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFICATION__CLASSIFIER = eINSTANCE.getInstanceSpecification_Classifier();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFICATION__SLOT = eINSTANCE.getInstanceSpecification_Slot();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.SlotImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '<em><b>Defining Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__DEFINING_FEATURE = eINSTANCE.getSlot_DefiningFeature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__VALUE = eINSTANCE.getSlot_Value();

		/**
		 * The meta object literal for the '<em><b>Owning Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__OWNING_INSTANCE = eINSTANCE.getSlot_OwningInstance();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.InstanceValueImpl <em>Instance Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.InstanceValueImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getInstanceValue()
		 * @generated
		 */
		EClass INSTANCE_VALUE = eINSTANCE.getInstanceValue();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_VALUE__INSTANCE = eINSTANCE.getInstanceValue_Instance();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralBooleanImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralBoolean()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN = eINSTANCE.getLiteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_BOOLEAN__VALUE = eINSTANCE.getLiteralBoolean_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralSpecificationImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralSpecification()
		 * @generated
		 */
		EClass LITERAL_SPECIFICATION = eINSTANCE.getLiteralSpecification();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralIntegerImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralInteger()
		 * @generated
		 */
		EClass LITERAL_INTEGER = eINSTANCE.getLiteralInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_INTEGER__VALUE = eINSTANCE.getLiteralInteger_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralNullImpl <em>Literal Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralNullImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralNull()
		 * @generated
		 */
		EClass LITERAL_NULL = eINSTANCE.getLiteralNull();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralStringImpl <em>Literal String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralStringImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralString()
		 * @generated
		 */
		EClass LITERAL_STRING = eINSTANCE.getLiteralString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_STRING__VALUE = eINSTANCE.getLiteralString_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralUnlimitedNaturalImpl <em>Literal Unlimited Natural</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.LiteralUnlimitedNaturalImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getLiteralUnlimitedNatural()
		 * @generated
		 */
		EClass LITERAL_UNLIMITED_NATURAL = eINSTANCE.getLiteralUnlimitedNatural();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_UNLIMITED_NATURAL__VALUE = eINSTANCE.getLiteralUnlimitedNatural_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PrimitiveTypeImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.EnumerationImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Owned Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__OWNED_LITERAL = eINSTANCE.getEnumeration_OwnedLiteral();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.EnumerationLiteralImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL__ENUMERATION = eINSTANCE.getEnumerationLiteral_Enumeration();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_ATTRIBUTE = eINSTANCE.getClass_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_OPERATION = eINSTANCE.getClass_OwnedOperation();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPER_CLASS = eINSTANCE.getClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ACTIVE = eINSTANCE.getClass_Active();

		/**
		 * The meta object literal for the '<em><b>Owned Reception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_RECEPTION = eINSTANCE.getClass_OwnedReception();

		/**
		 * The meta object literal for the '<em><b>Nested Classifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__NESTED_CLASSIFIER = eINSTANCE.getClass_NestedClassifier();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.AggregationKind <em>Aggregation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.AggregationKind
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getAggregationKind()
		 * @generated
		 */
		EEnum AGGREGATION_KIND = eINSTANCE.getAggregationKind();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ParameterDirectionKind
		 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.impl.KernelPackageImpl#getParameterDirectionKind()
		 * @generated
		 */
		EEnum PARAMETER_DIRECTION_KIND = eINSTANCE.getParameterDirectionKind();

	}

} //KernelPackage

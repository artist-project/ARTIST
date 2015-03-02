/**
 */
package org.modelexecution.fuml.Semantics.Loci.LociL1;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Factory
 * @model kind="package"
 * @generated
 */
public interface LociL1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LociL1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/fuml/semantics/loci/locil1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fUML.Semantics.Loci.LociL1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LociL1Package eINSTANCE = org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LociL1PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Loci.LociL1.impl.SemanticVisitorImpl <em>Semantic Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.impl.SemanticVisitorImpl
	 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LociL1PackageImpl#getSemanticVisitor()
	 * @generated
	 */
	int SEMANTIC_VISITOR = 0;

	/**
	 * The number of structural features of the '<em>Semantic Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VISITOR_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LocusImpl <em>Locus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LocusImpl
	 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LociL1PackageImpl#getLocus()
	 * @generated
	 */
	int LOCUS = 1;

	/**
	 * The feature id for the '<em><b>Extensional Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS__EXTENSIONAL_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Locus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCUS_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Loci.LociL1.SemanticVisitor <em>Semantic Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Visitor</em>'.
	 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.SemanticVisitor
	 * @generated
	 */
	EClass getSemanticVisitor();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Loci.LociL1.Locus <em>Locus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locus</em>'.
	 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.Locus
	 * @generated
	 */
	EClass getLocus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Semantics.Loci.LociL1.Locus#getExtensionalValues <em>Extensional Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensional Values</em>'.
	 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.Locus#getExtensionalValues()
	 * @see #getLocus()
	 * @generated
	 */
	EReference getLocus_ExtensionalValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LociL1Factory getLociL1Factory();

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
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Loci.LociL1.impl.SemanticVisitorImpl <em>Semantic Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.impl.SemanticVisitorImpl
		 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LociL1PackageImpl#getSemanticVisitor()
		 * @generated
		 */
		EClass SEMANTIC_VISITOR = eINSTANCE.getSemanticVisitor();
		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LocusImpl <em>Locus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LocusImpl
		 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LociL1PackageImpl#getLocus()
		 * @generated
		 */
		EClass LOCUS = eINSTANCE.getLocus();
		/**
		 * The meta object literal for the '<em><b>Extensional Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCUS__EXTENSIONAL_VALUES = eINSTANCE.getLocus_ExtensionalValues();

	}

} //LociL1Package

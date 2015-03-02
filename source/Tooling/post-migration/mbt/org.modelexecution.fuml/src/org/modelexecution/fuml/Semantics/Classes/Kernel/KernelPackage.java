/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package;

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
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelFactory
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
	String eNS_URI = "http://www.modelexecution.org/fuml/semantics/classes/kernel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fUML.Semantics.Classes.Kernel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelPackage eINSTANCE = org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 14;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = LociL1Package.SEMANTIC_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.StructuredValueImpl <em>Structured Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.StructuredValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getStructuredValue()
	 * @generated
	 */
	int STRUCTURED_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Structured Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.FeatureValueImpl <em>Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.FeatureValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getFeatureValue()
	 * @generated
	 */
	int FEATURE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__POSITION = 2;

	/**
	 * The number of structural features of the '<em>Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.PrimitiveValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getPrimitiveValue()
	 * @generated
	 */
	int PRIMITIVE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__TYPE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.UnlimitedNaturalValueImpl <em>Unlimited Natural Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.UnlimitedNaturalValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getUnlimitedNaturalValue()
	 * @generated
	 */
	int UNLIMITED_NATURAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_NATURAL_VALUE__TYPE = PRIMITIVE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_NATURAL_VALUE__VALUE = PRIMITIVE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unlimited Natural Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_NATURAL_VALUE_FEATURE_COUNT = PRIMITIVE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.StringValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__TYPE = PRIMITIVE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = PRIMITIVE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = PRIMITIVE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ReferenceImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENT = STRUCTURED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = STRUCTURED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.CompoundValueImpl <em>Compound Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.CompoundValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getCompoundValue()
	 * @generated
	 */
	int COMPOUND_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE__FEATURE_VALUES = STRUCTURED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_VALUE_FEATURE_COUNT = STRUCTURED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ExtensionalValueImpl <em>Extensional Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ExtensionalValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getExtensionalValue()
	 * @generated
	 */
	int EXTENSIONAL_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE__FEATURE_VALUES = COMPOUND_VALUE__FEATURE_VALUES;

	/**
	 * The feature id for the '<em><b>Locus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE__LOCUS = COMPOUND_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extensional Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONAL_VALUE_FEATURE_COUNT = COMPOUND_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ObjectImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__FEATURE_VALUES = EXTENSIONAL_VALUE__FEATURE_VALUES;

	/**
	 * The feature id for the '<em><b>Locus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__LOCUS = EXTENSIONAL_VALUE__LOCUS;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TYPES = EXTENSIONAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = EXTENSIONAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.LinkImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 9;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FEATURE_VALUES = EXTENSIONAL_VALUE__FEATURE_VALUES;

	/**
	 * The feature id for the '<em><b>Locus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LOCUS = EXTENSIONAL_VALUE__LOCUS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = EXTENSIONAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = EXTENSIONAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.IntegerValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__TYPE = PRIMITIVE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = PRIMITIVE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = PRIMITIVE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.EnumerationValueImpl <em>Enumeration Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.EnumerationValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getEnumerationValue()
	 * @generated
	 */
	int ENUMERATION_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE__LITERAL = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE__TYPE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.DataValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Feature Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__FEATURE_VALUES = COMPOUND_VALUE__FEATURE_VALUES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__TYPE = COMPOUND_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = COMPOUND_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.BooleanValueImpl
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__TYPE = PRIMITIVE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = PRIMITIVE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = PRIMITIVE_VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.StructuredValue <em>Structured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.StructuredValue
	 * @generated
	 */
	EClass getStructuredValue();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue
	 * @generated
	 */
	EClass getFeatureValue();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getFeature()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getValues()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Values();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getPosition()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EAttribute getFeatureValue_Position();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.UnlimitedNaturalValue <em>Unlimited Natural Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlimited Natural Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.UnlimitedNaturalValue
	 * @generated
	 */
	EClass getUnlimitedNaturalValue();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.UnlimitedNaturalValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.UnlimitedNaturalValue#getValue()
	 * @see #getUnlimitedNaturalValue()
	 * @generated
	 */
	EAttribute getUnlimitedNaturalValue_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.PrimitiveValue <em>Primitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.PrimitiveValue
	 * @generated
	 */
	EClass getPrimitiveValue();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.PrimitiveValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.PrimitiveValue#getType()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EReference getPrimitiveValue_Type();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Reference#getReferent <em>Referent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referent</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.Reference#getReferent()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Referent();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Object#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.Object#getTypes()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Types();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue <em>Extensional Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensional Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue
	 * @generated
	 */
	EClass getExtensionalValue();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue#getLocus <em>Locus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Locus</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue#getLocus()
	 * @see #getExtensionalValue()
	 * @generated
	 */
	EReference getExtensionalValue_Locus();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.CompoundValue <em>Compound Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.CompoundValue
	 * @generated
	 */
	EClass getCompoundValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.CompoundValue#getFeatureValues <em>Feature Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Values</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.CompoundValue#getFeatureValues()
	 * @see #getCompoundValue()
	 * @generated
	 */
	EReference getCompoundValue_FeatureValues();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Type();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue <em>Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue
	 * @generated
	 */
	EClass getEnumerationValue();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue#getLiteral()
	 * @see #getEnumerationValue()
	 * @generated
	 */
	EReference getEnumerationValue_Literal();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue#getType()
	 * @see #getEnumerationValue()
	 * @generated
	 */
	EReference getEnumerationValue_Type();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.DataValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.DataValue#getType()
	 * @see #getDataValue()
	 * @generated
	 */
	EReference getDataValue_Type();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.Value
	 * @generated
	 */
	EClass getValue();

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
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.StructuredValueImpl <em>Structured Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.StructuredValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getStructuredValue()
		 * @generated
		 */
		EClass STRUCTURED_VALUE = eINSTANCE.getStructuredValue();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.FeatureValueImpl <em>Feature Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.FeatureValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getFeatureValue()
		 * @generated
		 */
		EClass FEATURE_VALUE = eINSTANCE.getFeatureValue();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE__FEATURE = eINSTANCE.getFeatureValue_Feature();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE__VALUES = eINSTANCE.getFeatureValue_Values();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_VALUE__POSITION = eINSTANCE.getFeatureValue_Position();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.UnlimitedNaturalValueImpl <em>Unlimited Natural Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.UnlimitedNaturalValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getUnlimitedNaturalValue()
		 * @generated
		 */
		EClass UNLIMITED_NATURAL_VALUE = eINSTANCE.getUnlimitedNaturalValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLIMITED_NATURAL_VALUE__VALUE = eINSTANCE.getUnlimitedNaturalValue_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.PrimitiveValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getPrimitiveValue()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE = eINSTANCE.getPrimitiveValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VALUE__TYPE = eINSTANCE.getPrimitiveValue_Type();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.StringValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ReferenceImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Referent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENT = eINSTANCE.getReference_Referent();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ObjectImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__TYPES = eINSTANCE.getObject_Types();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ExtensionalValueImpl <em>Extensional Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ExtensionalValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getExtensionalValue()
		 * @generated
		 */
		EClass EXTENSIONAL_VALUE = eINSTANCE.getExtensionalValue();

		/**
		 * The meta object literal for the '<em><b>Locus</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONAL_VALUE__LOCUS = eINSTANCE.getExtensionalValue_Locus();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.CompoundValueImpl <em>Compound Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.CompoundValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getCompoundValue()
		 * @generated
		 */
		EClass COMPOUND_VALUE = eINSTANCE.getCompoundValue();

		/**
		 * The meta object literal for the '<em><b>Feature Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_VALUE__FEATURE_VALUES = eINSTANCE.getCompoundValue_FeatureValues();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.LinkImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.IntegerValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.EnumerationValueImpl <em>Enumeration Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.EnumerationValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getEnumerationValue()
		 * @generated
		 */
		EClass ENUMERATION_VALUE = eINSTANCE.getEnumerationValue();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_VALUE__LITERAL = eINSTANCE.getEnumerationValue_Literal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_VALUE__TYPE = eINSTANCE.getEnumerationValue_Type();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.DataValueImpl <em>Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.DataValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getDataValue()
		 * @generated
		 */
		EClass DATA_VALUE = eINSTANCE.getDataValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VALUE__TYPE = eINSTANCE.getDataValue_Type();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.BooleanValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ValueImpl
		 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.impl.KernelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

	}

} //KernelPackage

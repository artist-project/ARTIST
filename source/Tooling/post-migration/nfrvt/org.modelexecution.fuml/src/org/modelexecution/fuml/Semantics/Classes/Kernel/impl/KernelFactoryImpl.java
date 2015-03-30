/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.modelexecution.fuml.Semantics.Classes.Kernel.BooleanValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.DataValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.KernelFactory;
import org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Link;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Reference;
import org.modelexecution.fuml.Semantics.Classes.Kernel.StringValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.UnlimitedNaturalValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KernelFactoryImpl extends EFactoryImpl implements KernelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KernelFactory init() {
		try {
			KernelFactory theKernelFactory = (KernelFactory)EPackage.Registry.INSTANCE.getEFactory(KernelPackage.eNS_URI);
			if (theKernelFactory != null) {
				return theKernelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KernelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KernelPackage.FEATURE_VALUE: return createFeatureValue();
			case KernelPackage.UNLIMITED_NATURAL_VALUE: return createUnlimitedNaturalValue();
			case KernelPackage.STRING_VALUE: return createStringValue();
			case KernelPackage.REFERENCE: return createReference();
			case KernelPackage.OBJECT: return createObject();
			case KernelPackage.LINK: return createLink();
			case KernelPackage.INTEGER_VALUE: return createIntegerValue();
			case KernelPackage.ENUMERATION_VALUE: return createEnumerationValue();
			case KernelPackage.DATA_VALUE: return createDataValue();
			case KernelPackage.BOOLEAN_VALUE: return createBooleanValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValue createFeatureValue() {
		FeatureValueImpl featureValue = new FeatureValueImpl();
		return featureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlimitedNaturalValue createUnlimitedNaturalValue() {
		UnlimitedNaturalValueImpl unlimitedNaturalValue = new UnlimitedNaturalValueImpl();
		return unlimitedNaturalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.modelexecution.fuml.Semantics.Classes.Kernel.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValue createEnumerationValue() {
		EnumerationValueImpl enumerationValue = new EnumerationValueImpl();
		return enumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelPackage getKernelPackage() {
		return (KernelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KernelPackage getPackage() {
		return KernelPackage.eINSTANCE;
	}

} //KernelFactoryImpl

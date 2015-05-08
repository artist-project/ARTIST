/**
 */
package eu.artist.migration.deployment.azure.csdes.impl;

import eu.artist.migration.deployment.azure.csdes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AzureCSDesFactoryImpl extends EFactoryImpl implements AzureCSDesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AzureCSDesFactory init() {
		try {
			AzureCSDesFactory theAzureCSDesFactory = (AzureCSDesFactory)EPackage.Registry.INSTANCE.getEFactory(AzureCSDesPackage.eNS_URI);
			if (theAzureCSDesFactory != null) {
				return theAzureCSDesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AzureCSDesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSDesFactoryImpl() {
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
			case AzureCSDesPackage.PROJECT: return createProject();
			case AzureCSDesPackage.PROPERTY_GROUP: return createPropertyGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyGroup createPropertyGroup() {
		PropertyGroupImpl propertyGroup = new PropertyGroupImpl();
		return propertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSDesPackage getAzureCSDesPackage() {
		return (AzureCSDesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AzureCSDesPackage getPackage() {
		return AzureCSDesPackage.eINSTANCE;
	}

} //AzureCSDesFactoryImpl

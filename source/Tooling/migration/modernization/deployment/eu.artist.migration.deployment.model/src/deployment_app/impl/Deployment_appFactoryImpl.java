/**
 */
package deployment_app.impl;

import deployment_app.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Deployment_appFactoryImpl extends EFactoryImpl implements Deployment_appFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Deployment_appFactory init() {
		try {
			Deployment_appFactory theDeployment_appFactory = (Deployment_appFactory)EPackage.Registry.INSTANCE.getEFactory(Deployment_appPackage.eNS_URI);
			if (theDeployment_appFactory != null) {
				return theDeployment_appFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Deployment_appFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_appFactoryImpl() {
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
			case Deployment_appPackage.CLOUD_APPLICATION: return createCloudApplication();
			case Deployment_appPackage.APPLICATION_COMPONENT: return createApplicationComponent();
			case Deployment_appPackage.CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT: return createCloudApplicationPlatformDeploymentUnit();
			case Deployment_appPackage.CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT: return createCloudApplicationInfrastructureDeploymentUnit();
			case Deployment_appPackage.APPLICATION_DESCRIPTOR: return createApplicationDescriptor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Deployment_appPackage.PLATFORM_DEPLOYMENT_UNIT_TYPE:
				return createPlatformDeploymentUnitTypeFromString(eDataType, initialValue);
			case Deployment_appPackage.PROGRAMMING_LANGUAGE:
				return createProgrammingLanguageFromString(eDataType, initialValue);
			case Deployment_appPackage.INFRASTRUCTURE_DEPLOYMENT_UNIT_TYPE:
				return createInfrastructureDeploymentUnitTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Deployment_appPackage.PLATFORM_DEPLOYMENT_UNIT_TYPE:
				return convertPlatformDeploymentUnitTypeToString(eDataType, instanceValue);
			case Deployment_appPackage.PROGRAMMING_LANGUAGE:
				return convertProgrammingLanguageToString(eDataType, instanceValue);
			case Deployment_appPackage.INFRASTRUCTURE_DEPLOYMENT_UNIT_TYPE:
				return convertInfrastructureDeploymentUnitTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudApplication createCloudApplication() {
		CloudApplicationImpl cloudApplication = new CloudApplicationImpl();
		return cloudApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationComponent createApplicationComponent() {
		ApplicationComponentImpl applicationComponent = new ApplicationComponentImpl();
		return applicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudApplicationPlatformDeploymentUnit createCloudApplicationPlatformDeploymentUnit() {
		CloudApplicationPlatformDeploymentUnitImpl cloudApplicationPlatformDeploymentUnit = new CloudApplicationPlatformDeploymentUnitImpl();
		return cloudApplicationPlatformDeploymentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudApplicationInfrastructureDeploymentUnit createCloudApplicationInfrastructureDeploymentUnit() {
		CloudApplicationInfrastructureDeploymentUnitImpl cloudApplicationInfrastructureDeploymentUnit = new CloudApplicationInfrastructureDeploymentUnitImpl();
		return cloudApplicationInfrastructureDeploymentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDescriptor createApplicationDescriptor() {
		ApplicationDescriptorImpl applicationDescriptor = new ApplicationDescriptorImpl();
		return applicationDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformDeploymentUnitType createPlatformDeploymentUnitTypeFromString(EDataType eDataType, String initialValue) {
		PlatformDeploymentUnitType result = PlatformDeploymentUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlatformDeploymentUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguageFromString(EDataType eDataType, String initialValue) {
		ProgrammingLanguage result = ProgrammingLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureDeploymentUnitType createInfrastructureDeploymentUnitTypeFromString(EDataType eDataType, String initialValue) {
		InfrastructureDeploymentUnitType result = InfrastructureDeploymentUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInfrastructureDeploymentUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_appPackage getDeployment_appPackage() {
		return (Deployment_appPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Deployment_appPackage getPackage() {
		return Deployment_appPackage.eINSTANCE;
	}

} //Deployment_appFactoryImpl

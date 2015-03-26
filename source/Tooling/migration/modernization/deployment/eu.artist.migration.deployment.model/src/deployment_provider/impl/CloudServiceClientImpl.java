/**
 */
package deployment_provider.impl;

import deployment_app.ProgrammingLanguage;

import deployment_provider.CloudServiceClient;
import deployment_provider.Deployment_providerPackage;
import deployment_provider.ServiceInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Service Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.CloudServiceClientImpl#getSupportedInterfaces <em>Supported Interfaces</em>}</li>
 *   <li>{@link deployment_provider.impl.CloudServiceClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link deployment_provider.impl.CloudServiceClientImpl#getSupportedLanguages <em>Supported Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudServiceClientImpl extends MinimalEObjectImpl.Container implements CloudServiceClient {
	/**
	 * The cached value of the '{@link #getSupportedInterfaces() <em>Supported Interfaces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterface> supportedInterfaces;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedLanguages() <em>Supported Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammingLanguage> supportedLanguages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudServiceClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.CLOUD_SERVICE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInterface> getSupportedInterfaces() {
		if (supportedInterfaces == null) {
			supportedInterfaces = new EDataTypeUniqueEList<ServiceInterface>(ServiceInterface.class, this, Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_INTERFACES);
		}
		return supportedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Deployment_providerPackage.CLOUD_SERVICE_CLIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgrammingLanguage> getSupportedLanguages() {
		if (supportedLanguages == null) {
			supportedLanguages = new EDataTypeUniqueEList<ProgrammingLanguage>(ProgrammingLanguage.class, this, Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_LANGUAGES);
		}
		return supportedLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_INTERFACES:
				return getSupportedInterfaces();
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__NAME:
				return getName();
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_LANGUAGES:
				return getSupportedLanguages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_INTERFACES:
				getSupportedInterfaces().clear();
				getSupportedInterfaces().addAll((Collection<? extends ServiceInterface>)newValue);
				return;
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__NAME:
				setName((String)newValue);
				return;
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
				getSupportedLanguages().addAll((Collection<? extends ProgrammingLanguage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_INTERFACES:
				getSupportedInterfaces().clear();
				return;
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_INTERFACES:
				return supportedInterfaces != null && !supportedInterfaces.isEmpty();
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT__SUPPORTED_LANGUAGES:
				return supportedLanguages != null && !supportedLanguages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (supportedInterfaces: ");
		result.append(supportedInterfaces);
		result.append(", name: ");
		result.append(name);
		result.append(", supportedLanguages: ");
		result.append(supportedLanguages);
		result.append(')');
		return result.toString();
	}

} //CloudServiceClientImpl

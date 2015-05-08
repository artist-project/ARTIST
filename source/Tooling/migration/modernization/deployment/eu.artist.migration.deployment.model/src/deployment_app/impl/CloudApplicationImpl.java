/**
 */
package deployment_app.impl;

import deployment_app.ApplicationComponent;
import deployment_app.ApplicationDescriptor;
import deployment_app.CloudApplication;
import deployment_app.CloudApplicationDeploymentUnit;
import deployment_app.Deployment_appPackage;
import deployment_app.ProgrammingLanguage;

import deployment_provider.ApplicationFramework;
import deployment_provider.CloudOffering;
import deployment_provider.CloudService;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_app.impl.CloudApplicationImpl#getDeploymentUnits <em>Deployment Units</em>}</li>
 *   <li>{@link deployment_app.impl.CloudApplicationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link deployment_app.impl.CloudApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link deployment_app.impl.CloudApplicationImpl#getRequiredFrameworks <em>Required Frameworks</em>}</li>
 *   <li>{@link deployment_app.impl.CloudApplicationImpl#getHostedOnOffering <em>Hosted On Offering</em>}</li>
 *   <li>{@link deployment_app.impl.CloudApplicationImpl#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link deployment_app.impl.CloudApplicationImpl#getComprisedComponents <em>Comprised Components</em>}</li>
 *   <li>{@link deployment_app.impl.CloudApplicationImpl#getIsConfiguredBy <em>Is Configured By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudApplicationImpl extends MinimalEObjectImpl.Container implements CloudApplication {
	/**
	 * The cached value of the '{@link #getDeploymentUnits() <em>Deployment Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudApplicationDeploymentUnit> deploymentUnits;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammingLanguage LANGUAGE_EDEFAULT = ProgrammingLanguage.C;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected ProgrammingLanguage language = LANGUAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getRequiredFrameworks() <em>Required Frameworks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFrameworks()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationFramework> requiredFrameworks;

	/**
	 * The cached value of the '{@link #getHostedOnOffering() <em>Hosted On Offering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedOnOffering()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudOffering> hostedOnOffering;

	/**
	 * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudService> requiredServices;

	/**
	 * The cached value of the '{@link #getComprisedComponents() <em>Comprised Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComprisedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationComponent> comprisedComponents;

	/**
	 * The cached value of the '{@link #getIsConfiguredBy() <em>Is Configured By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConfiguredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationDescriptor> isConfiguredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_appPackage.Literals.CLOUD_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudApplicationDeploymentUnit> getDeploymentUnits() {
		if (deploymentUnits == null) {
			deploymentUnits = new EObjectContainmentEList<CloudApplicationDeploymentUnit>(CloudApplicationDeploymentUnit.class, this, Deployment_appPackage.CLOUD_APPLICATION__DEPLOYMENT_UNITS);
		}
		return deploymentUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(ProgrammingLanguage newLanguage) {
		ProgrammingLanguage oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Deployment_appPackage.CLOUD_APPLICATION__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Deployment_appPackage.CLOUD_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationFramework> getRequiredFrameworks() {
		if (requiredFrameworks == null) {
			requiredFrameworks = new EObjectContainmentEList<ApplicationFramework>(ApplicationFramework.class, this, Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_FRAMEWORKS);
		}
		return requiredFrameworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudOffering> getHostedOnOffering() {
		if (hostedOnOffering == null) {
			hostedOnOffering = new EObjectContainmentEList<CloudOffering>(CloudOffering.class, this, Deployment_appPackage.CLOUD_APPLICATION__HOSTED_ON_OFFERING);
		}
		return hostedOnOffering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudService> getRequiredServices() {
		if (requiredServices == null) {
			requiredServices = new EObjectContainmentEList<CloudService>(CloudService.class, this, Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_SERVICES);
		}
		return requiredServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationComponent> getComprisedComponents() {
		if (comprisedComponents == null) {
			comprisedComponents = new EObjectContainmentEList<ApplicationComponent>(ApplicationComponent.class, this, Deployment_appPackage.CLOUD_APPLICATION__COMPRISED_COMPONENTS);
		}
		return comprisedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationDescriptor> getIsConfiguredBy() {
		if (isConfiguredBy == null) {
			isConfiguredBy = new EObjectResolvingEList<ApplicationDescriptor>(ApplicationDescriptor.class, this, Deployment_appPackage.CLOUD_APPLICATION__IS_CONFIGURED_BY);
		}
		return isConfiguredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_appPackage.CLOUD_APPLICATION__DEPLOYMENT_UNITS:
				return ((InternalEList<?>)getDeploymentUnits()).basicRemove(otherEnd, msgs);
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_FRAMEWORKS:
				return ((InternalEList<?>)getRequiredFrameworks()).basicRemove(otherEnd, msgs);
			case Deployment_appPackage.CLOUD_APPLICATION__HOSTED_ON_OFFERING:
				return ((InternalEList<?>)getHostedOnOffering()).basicRemove(otherEnd, msgs);
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_SERVICES:
				return ((InternalEList<?>)getRequiredServices()).basicRemove(otherEnd, msgs);
			case Deployment_appPackage.CLOUD_APPLICATION__COMPRISED_COMPONENTS:
				return ((InternalEList<?>)getComprisedComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Deployment_appPackage.CLOUD_APPLICATION__DEPLOYMENT_UNITS:
				return getDeploymentUnits();
			case Deployment_appPackage.CLOUD_APPLICATION__LANGUAGE:
				return getLanguage();
			case Deployment_appPackage.CLOUD_APPLICATION__NAME:
				return getName();
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_FRAMEWORKS:
				return getRequiredFrameworks();
			case Deployment_appPackage.CLOUD_APPLICATION__HOSTED_ON_OFFERING:
				return getHostedOnOffering();
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_SERVICES:
				return getRequiredServices();
			case Deployment_appPackage.CLOUD_APPLICATION__COMPRISED_COMPONENTS:
				return getComprisedComponents();
			case Deployment_appPackage.CLOUD_APPLICATION__IS_CONFIGURED_BY:
				return getIsConfiguredBy();
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
			case Deployment_appPackage.CLOUD_APPLICATION__DEPLOYMENT_UNITS:
				getDeploymentUnits().clear();
				getDeploymentUnits().addAll((Collection<? extends CloudApplicationDeploymentUnit>)newValue);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__LANGUAGE:
				setLanguage((ProgrammingLanguage)newValue);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__NAME:
				setName((String)newValue);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_FRAMEWORKS:
				getRequiredFrameworks().clear();
				getRequiredFrameworks().addAll((Collection<? extends ApplicationFramework>)newValue);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__HOSTED_ON_OFFERING:
				getHostedOnOffering().clear();
				getHostedOnOffering().addAll((Collection<? extends CloudOffering>)newValue);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_SERVICES:
				getRequiredServices().clear();
				getRequiredServices().addAll((Collection<? extends CloudService>)newValue);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__COMPRISED_COMPONENTS:
				getComprisedComponents().clear();
				getComprisedComponents().addAll((Collection<? extends ApplicationComponent>)newValue);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__IS_CONFIGURED_BY:
				getIsConfiguredBy().clear();
				getIsConfiguredBy().addAll((Collection<? extends ApplicationDescriptor>)newValue);
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
			case Deployment_appPackage.CLOUD_APPLICATION__DEPLOYMENT_UNITS:
				getDeploymentUnits().clear();
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_FRAMEWORKS:
				getRequiredFrameworks().clear();
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__HOSTED_ON_OFFERING:
				getHostedOnOffering().clear();
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_SERVICES:
				getRequiredServices().clear();
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__COMPRISED_COMPONENTS:
				getComprisedComponents().clear();
				return;
			case Deployment_appPackage.CLOUD_APPLICATION__IS_CONFIGURED_BY:
				getIsConfiguredBy().clear();
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
			case Deployment_appPackage.CLOUD_APPLICATION__DEPLOYMENT_UNITS:
				return deploymentUnits != null && !deploymentUnits.isEmpty();
			case Deployment_appPackage.CLOUD_APPLICATION__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case Deployment_appPackage.CLOUD_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_FRAMEWORKS:
				return requiredFrameworks != null && !requiredFrameworks.isEmpty();
			case Deployment_appPackage.CLOUD_APPLICATION__HOSTED_ON_OFFERING:
				return hostedOnOffering != null && !hostedOnOffering.isEmpty();
			case Deployment_appPackage.CLOUD_APPLICATION__REQUIRED_SERVICES:
				return requiredServices != null && !requiredServices.isEmpty();
			case Deployment_appPackage.CLOUD_APPLICATION__COMPRISED_COMPONENTS:
				return comprisedComponents != null && !comprisedComponents.isEmpty();
			case Deployment_appPackage.CLOUD_APPLICATION__IS_CONFIGURED_BY:
				return isConfiguredBy != null && !isConfiguredBy.isEmpty();
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
		result.append(" (language: ");
		result.append(language);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CloudApplicationImpl

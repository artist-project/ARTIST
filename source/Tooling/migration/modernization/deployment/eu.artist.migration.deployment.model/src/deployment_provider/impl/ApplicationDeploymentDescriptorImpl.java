/**
 */
package deployment_provider.impl;

import deployment_provider.ApplicationDeploymentDescriptor;
import deployment_provider.ApplicationTopology;
import deployment_provider.Deployment_providerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Deployment Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.ApplicationDeploymentDescriptorImpl#getTopology <em>Topology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationDeploymentDescriptorImpl extends DeploymentDescriptorImpl implements ApplicationDeploymentDescriptor {
	/**
	 * The default value of the '{@link #getTopology() <em>Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationTopology TOPOLOGY_EDEFAULT = ApplicationTopology.SINGLE_INSTANCE;

	/**
	 * The cached value of the '{@link #getTopology() <em>Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected ApplicationTopology topology = TOPOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationDeploymentDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.APPLICATION_DEPLOYMENT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTopology getTopology() {
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopology(ApplicationTopology newTopology) {
		ApplicationTopology oldTopology = topology;
		topology = newTopology == null ? TOPOLOGY_EDEFAULT : newTopology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Deployment_providerPackage.APPLICATION_DEPLOYMENT_DESCRIPTOR__TOPOLOGY, oldTopology, topology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Deployment_providerPackage.APPLICATION_DEPLOYMENT_DESCRIPTOR__TOPOLOGY:
				return getTopology();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Deployment_providerPackage.APPLICATION_DEPLOYMENT_DESCRIPTOR__TOPOLOGY:
				setTopology((ApplicationTopology)newValue);
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
			case Deployment_providerPackage.APPLICATION_DEPLOYMENT_DESCRIPTOR__TOPOLOGY:
				setTopology(TOPOLOGY_EDEFAULT);
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
			case Deployment_providerPackage.APPLICATION_DEPLOYMENT_DESCRIPTOR__TOPOLOGY:
				return topology != TOPOLOGY_EDEFAULT;
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
		result.append(" (topology: ");
		result.append(topology);
		result.append(')');
		return result.toString();
	}

} //ApplicationDeploymentDescriptorImpl

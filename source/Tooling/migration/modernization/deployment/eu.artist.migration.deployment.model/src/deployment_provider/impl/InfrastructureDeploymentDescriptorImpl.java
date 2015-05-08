/**
 */
package deployment_provider.impl;

import deployment_provider.CloudInfrastructureVirtualCluster;
import deployment_provider.Deployment_providerPackage;
import deployment_provider.InfrastructureDeploymentDescriptor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Deployment Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.InfrastructureDeploymentDescriptorImpl#getClusters <em>Clusters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureDeploymentDescriptorImpl extends DeploymentDescriptorImpl implements InfrastructureDeploymentDescriptor {
	/**
	 * The cached value of the '{@link #getClusters() <em>Clusters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusters()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudInfrastructureVirtualCluster> clusters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureDeploymentDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudInfrastructureVirtualCluster> getClusters() {
		if (clusters == null) {
			clusters = new EObjectContainmentEList<CloudInfrastructureVirtualCluster>(CloudInfrastructureVirtualCluster.class, this, Deployment_providerPackage.INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__CLUSTERS);
		}
		return clusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_providerPackage.INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__CLUSTERS:
				return ((InternalEList<?>)getClusters()).basicRemove(otherEnd, msgs);
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
			case Deployment_providerPackage.INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__CLUSTERS:
				return getClusters();
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
			case Deployment_providerPackage.INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__CLUSTERS:
				getClusters().clear();
				getClusters().addAll((Collection<? extends CloudInfrastructureVirtualCluster>)newValue);
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
			case Deployment_providerPackage.INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__CLUSTERS:
				getClusters().clear();
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
			case Deployment_providerPackage.INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__CLUSTERS:
				return clusters != null && !clusters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureDeploymentDescriptorImpl

/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Endpoints;
import eu.artist.migration.deployment.azure.csdef.InputEndpoint;
import eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement;
import eu.artist.migration.deployment.azure.csdef.InternalEndpoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.EndpointsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.EndpointsImpl#getInputEndpoint <em>Input Endpoint</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.EndpointsImpl#getInternalEndpoint <em>Internal Endpoint</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.EndpointsImpl#getInstanceInputEndpoint <em>Instance Input Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndpointsImpl extends MinimalEObjectImpl.Container implements Endpoints {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.ENDPOINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AzureCSDefPackage.ENDPOINTS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputEndpoint> getInputEndpoint() {
		return getGroup().list(AzureCSDefPackage.Literals.ENDPOINTS__INPUT_ENDPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalEndpoint> getInternalEndpoint() {
		return getGroup().list(AzureCSDefPackage.Literals.ENDPOINTS__INTERNAL_ENDPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceInputEndpointElement> getInstanceInputEndpoint() {
		return getGroup().list(AzureCSDefPackage.Literals.ENDPOINTS__INSTANCE_INPUT_ENDPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.ENDPOINTS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.ENDPOINTS__INPUT_ENDPOINT:
				return ((InternalEList<?>)getInputEndpoint()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.ENDPOINTS__INTERNAL_ENDPOINT:
				return ((InternalEList<?>)getInternalEndpoint()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.ENDPOINTS__INSTANCE_INPUT_ENDPOINT:
				return ((InternalEList<?>)getInstanceInputEndpoint()).basicRemove(otherEnd, msgs);
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
			case AzureCSDefPackage.ENDPOINTS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AzureCSDefPackage.ENDPOINTS__INPUT_ENDPOINT:
				return getInputEndpoint();
			case AzureCSDefPackage.ENDPOINTS__INTERNAL_ENDPOINT:
				return getInternalEndpoint();
			case AzureCSDefPackage.ENDPOINTS__INSTANCE_INPUT_ENDPOINT:
				return getInstanceInputEndpoint();
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
			case AzureCSDefPackage.ENDPOINTS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AzureCSDefPackage.ENDPOINTS__INPUT_ENDPOINT:
				getInputEndpoint().clear();
				getInputEndpoint().addAll((Collection<? extends InputEndpoint>)newValue);
				return;
			case AzureCSDefPackage.ENDPOINTS__INTERNAL_ENDPOINT:
				getInternalEndpoint().clear();
				getInternalEndpoint().addAll((Collection<? extends InternalEndpoint>)newValue);
				return;
			case AzureCSDefPackage.ENDPOINTS__INSTANCE_INPUT_ENDPOINT:
				getInstanceInputEndpoint().clear();
				getInstanceInputEndpoint().addAll((Collection<? extends InstanceInputEndpointElement>)newValue);
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
			case AzureCSDefPackage.ENDPOINTS__GROUP:
				getGroup().clear();
				return;
			case AzureCSDefPackage.ENDPOINTS__INPUT_ENDPOINT:
				getInputEndpoint().clear();
				return;
			case AzureCSDefPackage.ENDPOINTS__INTERNAL_ENDPOINT:
				getInternalEndpoint().clear();
				return;
			case AzureCSDefPackage.ENDPOINTS__INSTANCE_INPUT_ENDPOINT:
				getInstanceInputEndpoint().clear();
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
			case AzureCSDefPackage.ENDPOINTS__GROUP:
				return group != null && !group.isEmpty();
			case AzureCSDefPackage.ENDPOINTS__INPUT_ENDPOINT:
				return !getInputEndpoint().isEmpty();
			case AzureCSDefPackage.ENDPOINTS__INTERNAL_ENDPOINT:
				return !getInternalEndpoint().isEmpty();
			case AzureCSDefPackage.ENDPOINTS__INSTANCE_INPUT_ENDPOINT:
				return !getInstanceInputEndpoint().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //EndpointsImpl

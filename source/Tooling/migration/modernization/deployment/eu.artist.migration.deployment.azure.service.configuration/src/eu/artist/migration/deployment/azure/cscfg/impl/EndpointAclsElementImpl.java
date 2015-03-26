/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.EndpointAclType;
import eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Acls Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.EndpointAclsElementImpl#getEndpointAcl <em>Endpoint Acl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndpointAclsElementImpl extends MinimalEObjectImpl.Container implements EndpointAclsElement {
	/**
	 * The cached value of the '{@link #getEndpointAcl() <em>Endpoint Acl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointAcl()
	 * @generated
	 * @ordered
	 */
	protected EList<EndpointAclType> endpointAcl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointAclsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.ENDPOINT_ACLS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndpointAclType> getEndpointAcl() {
		if (endpointAcl == null) {
			endpointAcl = new EObjectContainmentEList<EndpointAclType>(EndpointAclType.class, this, AzureCSCfgPackage.ENDPOINT_ACLS_ELEMENT__ENDPOINT_ACL);
		}
		return endpointAcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.ENDPOINT_ACLS_ELEMENT__ENDPOINT_ACL:
				return ((InternalEList<?>)getEndpointAcl()).basicRemove(otherEnd, msgs);
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
			case AzureCSCfgPackage.ENDPOINT_ACLS_ELEMENT__ENDPOINT_ACL:
				return getEndpointAcl();
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
			case AzureCSCfgPackage.ENDPOINT_ACLS_ELEMENT__ENDPOINT_ACL:
				getEndpointAcl().clear();
				getEndpointAcl().addAll((Collection<? extends EndpointAclType>)newValue);
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
			case AzureCSCfgPackage.ENDPOINT_ACLS_ELEMENT__ENDPOINT_ACL:
				getEndpointAcl().clear();
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
			case AzureCSCfgPackage.ENDPOINT_ACLS_ELEMENT__ENDPOINT_ACL:
				return endpointAcl != null && !endpointAcl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndpointAclsElementImpl

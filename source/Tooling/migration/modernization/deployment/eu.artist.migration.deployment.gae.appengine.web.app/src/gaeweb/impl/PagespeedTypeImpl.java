/**
 */
package gaeweb.impl;

import gaeweb.GaewebPackage;
import gaeweb.PagespeedType;

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
 * An implementation of the model object '<em><b>Pagespeed Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.PagespeedTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gaeweb.impl.PagespeedTypeImpl#getUrlBlacklist <em>Url Blacklist</em>}</li>
 *   <li>{@link gaeweb.impl.PagespeedTypeImpl#getDomainToRewrite <em>Domain To Rewrite</em>}</li>
 *   <li>{@link gaeweb.impl.PagespeedTypeImpl#getEnabledRewriter <em>Enabled Rewriter</em>}</li>
 *   <li>{@link gaeweb.impl.PagespeedTypeImpl#getDisabledRewriter <em>Disabled Rewriter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PagespeedTypeImpl extends MinimalEObjectImpl.Container implements PagespeedType {
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
	protected PagespeedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.PAGESPEED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GaewebPackage.PAGESPEED_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUrlBlacklist() {
		return getGroup().list(GaewebPackage.Literals.PAGESPEED_TYPE__URL_BLACKLIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDomainToRewrite() {
		return getGroup().list(GaewebPackage.Literals.PAGESPEED_TYPE__DOMAIN_TO_REWRITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnabledRewriter() {
		return getGroup().list(GaewebPackage.Literals.PAGESPEED_TYPE__ENABLED_REWRITER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDisabledRewriter() {
		return getGroup().list(GaewebPackage.Literals.PAGESPEED_TYPE__DISABLED_REWRITER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaewebPackage.PAGESPEED_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case GaewebPackage.PAGESPEED_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GaewebPackage.PAGESPEED_TYPE__URL_BLACKLIST:
				return getUrlBlacklist();
			case GaewebPackage.PAGESPEED_TYPE__DOMAIN_TO_REWRITE:
				return getDomainToRewrite();
			case GaewebPackage.PAGESPEED_TYPE__ENABLED_REWRITER:
				return getEnabledRewriter();
			case GaewebPackage.PAGESPEED_TYPE__DISABLED_REWRITER:
				return getDisabledRewriter();
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
			case GaewebPackage.PAGESPEED_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GaewebPackage.PAGESPEED_TYPE__URL_BLACKLIST:
				getUrlBlacklist().clear();
				getUrlBlacklist().addAll((Collection<? extends String>)newValue);
				return;
			case GaewebPackage.PAGESPEED_TYPE__DOMAIN_TO_REWRITE:
				getDomainToRewrite().clear();
				getDomainToRewrite().addAll((Collection<? extends String>)newValue);
				return;
			case GaewebPackage.PAGESPEED_TYPE__ENABLED_REWRITER:
				getEnabledRewriter().clear();
				getEnabledRewriter().addAll((Collection<? extends String>)newValue);
				return;
			case GaewebPackage.PAGESPEED_TYPE__DISABLED_REWRITER:
				getDisabledRewriter().clear();
				getDisabledRewriter().addAll((Collection<? extends String>)newValue);
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
			case GaewebPackage.PAGESPEED_TYPE__GROUP:
				getGroup().clear();
				return;
			case GaewebPackage.PAGESPEED_TYPE__URL_BLACKLIST:
				getUrlBlacklist().clear();
				return;
			case GaewebPackage.PAGESPEED_TYPE__DOMAIN_TO_REWRITE:
				getDomainToRewrite().clear();
				return;
			case GaewebPackage.PAGESPEED_TYPE__ENABLED_REWRITER:
				getEnabledRewriter().clear();
				return;
			case GaewebPackage.PAGESPEED_TYPE__DISABLED_REWRITER:
				getDisabledRewriter().clear();
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
			case GaewebPackage.PAGESPEED_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GaewebPackage.PAGESPEED_TYPE__URL_BLACKLIST:
				return !getUrlBlacklist().isEmpty();
			case GaewebPackage.PAGESPEED_TYPE__DOMAIN_TO_REWRITE:
				return !getDomainToRewrite().isEmpty();
			case GaewebPackage.PAGESPEED_TYPE__ENABLED_REWRITER:
				return !getEnabledRewriter().isEmpty();
			case GaewebPackage.PAGESPEED_TYPE__DISABLED_REWRITER:
				return !getDisabledRewriter().isEmpty();
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

} //PagespeedTypeImpl

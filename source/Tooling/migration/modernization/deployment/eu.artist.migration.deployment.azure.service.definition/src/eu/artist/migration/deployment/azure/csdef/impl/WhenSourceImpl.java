/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.FromRole;
import eu.artist.migration.deployment.azure.csdef.MatchMode;
import eu.artist.migration.deployment.azure.csdef.WhenSource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WhenSourceImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WhenSourceImpl#getFromRole <em>From Role</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WhenSourceImpl#getMatches <em>Matches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenSourceImpl extends MinimalEObjectImpl.Container implements WhenSource {
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
	 * The default value of the '{@link #getMatches() <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected static final MatchMode MATCHES_EDEFAULT = MatchMode.ANY_RULE;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected MatchMode matches = MATCHES_EDEFAULT;

	/**
	 * This is true if the Matches attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean matchesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.WHEN_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AzureCSDefPackage.WHEN_SOURCE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FromRole> getFromRole() {
		return getGroup().list(AzureCSDefPackage.Literals.WHEN_SOURCE__FROM_ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchMode getMatches() {
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatches(MatchMode newMatches) {
		MatchMode oldMatches = matches;
		matches = newMatches == null ? MATCHES_EDEFAULT : newMatches;
		boolean oldMatchesESet = matchesESet;
		matchesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WHEN_SOURCE__MATCHES, oldMatches, matches, !oldMatchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMatches() {
		MatchMode oldMatches = matches;
		boolean oldMatchesESet = matchesESet;
		matches = MATCHES_EDEFAULT;
		matchesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.WHEN_SOURCE__MATCHES, oldMatches, MATCHES_EDEFAULT, oldMatchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMatches() {
		return matchesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.WHEN_SOURCE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.WHEN_SOURCE__FROM_ROLE:
				return ((InternalEList<?>)getFromRole()).basicRemove(otherEnd, msgs);
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
			case AzureCSDefPackage.WHEN_SOURCE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AzureCSDefPackage.WHEN_SOURCE__FROM_ROLE:
				return getFromRole();
			case AzureCSDefPackage.WHEN_SOURCE__MATCHES:
				return getMatches();
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
			case AzureCSDefPackage.WHEN_SOURCE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AzureCSDefPackage.WHEN_SOURCE__FROM_ROLE:
				getFromRole().clear();
				getFromRole().addAll((Collection<? extends FromRole>)newValue);
				return;
			case AzureCSDefPackage.WHEN_SOURCE__MATCHES:
				setMatches((MatchMode)newValue);
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
			case AzureCSDefPackage.WHEN_SOURCE__GROUP:
				getGroup().clear();
				return;
			case AzureCSDefPackage.WHEN_SOURCE__FROM_ROLE:
				getFromRole().clear();
				return;
			case AzureCSDefPackage.WHEN_SOURCE__MATCHES:
				unsetMatches();
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
			case AzureCSDefPackage.WHEN_SOURCE__GROUP:
				return group != null && !group.isEmpty();
			case AzureCSDefPackage.WHEN_SOURCE__FROM_ROLE:
				return !getFromRole().isEmpty();
			case AzureCSDefPackage.WHEN_SOURCE__MATCHES:
				return isSetMatches();
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
		result.append(", matches: ");
		if (matchesESet) result.append(matches); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WhenSourceImpl

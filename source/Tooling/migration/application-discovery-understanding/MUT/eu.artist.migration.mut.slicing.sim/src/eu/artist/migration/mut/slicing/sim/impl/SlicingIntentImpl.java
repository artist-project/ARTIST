/**
 */
package eu.artist.migration.mut.slicing.sim.impl;

import eu.artist.migration.mut.slicing.sim.ModelType;
import eu.artist.migration.mut.slicing.sim.SimPackage;
import eu.artist.migration.mut.slicing.sim.SlicingConfiguration;
import eu.artist.migration.mut.slicing.sim.SlicingCriterion;
import eu.artist.migration.mut.slicing.sim.SlicingIntent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slicing Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl#getInject <em>Inject</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl#getExtract <em>Extract</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingIntentImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlicingIntentImpl extends MinimalEObjectImpl.Container implements SlicingIntent {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInject() <em>Inject</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInject()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelType> inject;

	/**
	 * The cached value of the '{@link #getExtract() <em>Extract</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtract()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelType> extract;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<SlicingCriterion> criteria;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected SlicingConfiguration configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlicingIntentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimPackage.Literals.SLICING_INTENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_INTENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_INTENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getInject() {
		if (inject == null) {
			inject = new EDataTypeUniqueEList<ModelType>(ModelType.class, this, SimPackage.SLICING_INTENT__INJECT);
		}
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getExtract() {
		if (extract == null) {
			extract = new EDataTypeUniqueEList<ModelType>(ModelType.class, this, SimPackage.SLICING_INTENT__EXTRACT);
		}
		return extract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SlicingCriterion> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectContainmentWithInverseEList<SlicingCriterion>(SlicingCriterion.class, this, SimPackage.SLICING_INTENT__CRITERIA, SimPackage.SLICING_CRITERION__INTENT);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(SlicingConfiguration newConfiguration, NotificationChain msgs) {
		SlicingConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_INTENT__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(SlicingConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, SimPackage.SLICING_CONFIGURATION__INTENT, SlicingConfiguration.class, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, SimPackage.SLICING_CONFIGURATION__INTENT, SlicingConfiguration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_INTENT__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimPackage.SLICING_INTENT__CRITERIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCriteria()).basicAdd(otherEnd, msgs);
			case SimPackage.SLICING_INTENT__CONFIGURATION:
				if (configuration != null)
					msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimPackage.SLICING_INTENT__CONFIGURATION, null, msgs);
				return basicSetConfiguration((SlicingConfiguration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimPackage.SLICING_INTENT__CRITERIA:
				return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
			case SimPackage.SLICING_INTENT__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
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
			case SimPackage.SLICING_INTENT__NAME:
				return getName();
			case SimPackage.SLICING_INTENT__DESCRIPTION:
				return getDescription();
			case SimPackage.SLICING_INTENT__INJECT:
				return getInject();
			case SimPackage.SLICING_INTENT__EXTRACT:
				return getExtract();
			case SimPackage.SLICING_INTENT__CRITERIA:
				return getCriteria();
			case SimPackage.SLICING_INTENT__CONFIGURATION:
				return getConfiguration();
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
			case SimPackage.SLICING_INTENT__NAME:
				setName((String)newValue);
				return;
			case SimPackage.SLICING_INTENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SimPackage.SLICING_INTENT__INJECT:
				getInject().clear();
				getInject().addAll((Collection<? extends ModelType>)newValue);
				return;
			case SimPackage.SLICING_INTENT__EXTRACT:
				getExtract().clear();
				getExtract().addAll((Collection<? extends ModelType>)newValue);
				return;
			case SimPackage.SLICING_INTENT__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends SlicingCriterion>)newValue);
				return;
			case SimPackage.SLICING_INTENT__CONFIGURATION:
				setConfiguration((SlicingConfiguration)newValue);
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
			case SimPackage.SLICING_INTENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimPackage.SLICING_INTENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SimPackage.SLICING_INTENT__INJECT:
				getInject().clear();
				return;
			case SimPackage.SLICING_INTENT__EXTRACT:
				getExtract().clear();
				return;
			case SimPackage.SLICING_INTENT__CRITERIA:
				getCriteria().clear();
				return;
			case SimPackage.SLICING_INTENT__CONFIGURATION:
				setConfiguration((SlicingConfiguration)null);
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
			case SimPackage.SLICING_INTENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimPackage.SLICING_INTENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SimPackage.SLICING_INTENT__INJECT:
				return inject != null && !inject.isEmpty();
			case SimPackage.SLICING_INTENT__EXTRACT:
				return extract != null && !extract.isEmpty();
			case SimPackage.SLICING_INTENT__CRITERIA:
				return criteria != null && !criteria.isEmpty();
			case SimPackage.SLICING_INTENT__CONFIGURATION:
				return configuration != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", inject: ");
		result.append(inject);
		result.append(", extract: ");
		result.append(extract);
		result.append(')');
		return result.toString();
	}

} //SlicingIntentImpl

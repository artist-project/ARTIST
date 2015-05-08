/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.henshin.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.ModuleImpl#getSubModules <em>Sub Modules</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.ModuleImpl#getSuperModule <em>Super Module</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.ModuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.ModuleImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.ModuleImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends NamedElementImpl implements Module {
	
	/**
	 * The cached value of the '{@link #getSubModules() <em>Sub Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> subModules;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> imports;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> units;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @deprecated Will be removed in the future.
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Graph> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HenshinPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getSubModules() {
		if (subModules == null) {
			subModules = new EObjectContainmentWithInverseEList<Module>(Module.class, this, HenshinPackage.MODULE__SUB_MODULES, HenshinPackage.MODULE__SUPER_MODULE);
		}
		return subModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getSuperModule() {
		if (eContainerFeatureID() != HenshinPackage.MODULE__SUPER_MODULE) return null;
		return (Module)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperModule(Module newSuperModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperModule, HenshinPackage.MODULE__SUPER_MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperModule(Module newSuperModule) {
		if (newSuperModule != eInternalContainer() || (eContainerFeatureID() != HenshinPackage.MODULE__SUPER_MODULE && newSuperModule != null)) {
			if (EcoreUtil.isAncestor(this, newSuperModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperModule != null)
				msgs = ((InternalEObject)newSuperModule).eInverseAdd(this, HenshinPackage.MODULE__SUB_MODULES, Module.class, msgs);
			msgs = basicSetSuperModule(newSuperModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HenshinPackage.MODULE__SUPER_MODULE, newSuperModule, newSuperModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<EPackage>(EPackage.class, this, HenshinPackage.MODULE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<Unit>(Unit.class, this, HenshinPackage.MODULE__UNITS);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @deprecated Will be removed in the future.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Graph> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<Graph>(Graph.class, this, HenshinPackage.MODULE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Unit getUnit(String name) {
		if (name==null) name = "";
		for (Unit unit : getUnits()) {
			String n = unit.getName();
			if (n==null) n = "";
			if (name.equals(n)) {
				return unit;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Module getSubModule(String name) {
		if (name==null) name = "";
		for (Module subModule : getSubModules()) {
			String n = subModule.getName();
			if (n==null) n = "";
			if (name.equals(n)) {
				return subModule;
			}
		}
		return null;
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
			case HenshinPackage.MODULE__SUB_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubModules()).basicAdd(otherEnd, msgs);
			case HenshinPackage.MODULE__SUPER_MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperModule((Module)otherEnd, msgs);
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
			case HenshinPackage.MODULE__SUB_MODULES:
				return ((InternalEList<?>)getSubModules()).basicRemove(otherEnd, msgs);
			case HenshinPackage.MODULE__SUPER_MODULE:
				return basicSetSuperModule(null, msgs);
			case HenshinPackage.MODULE__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case HenshinPackage.MODULE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HenshinPackage.MODULE__SUPER_MODULE:
				return eInternalContainer().eInverseRemove(this, HenshinPackage.MODULE__SUB_MODULES, Module.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HenshinPackage.MODULE__SUB_MODULES:
				return getSubModules();
			case HenshinPackage.MODULE__SUPER_MODULE:
				return getSuperModule();
			case HenshinPackage.MODULE__IMPORTS:
				return getImports();
			case HenshinPackage.MODULE__UNITS:
				return getUnits();
			case HenshinPackage.MODULE__INSTANCES:
				return getInstances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(EStructuralFeature eFeature, boolean resolve, boolean coreType) {
		/*
		 * For backward compatibility to old models:
		 */
		if (eFeature==((HenshinPackageImpl) HenshinPackage.eINSTANCE).getFakeRulesFeature()) {
			return getUnits();
		}
		return super.eGet(eFeature, resolve, coreType);
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
			case HenshinPackage.MODULE__SUB_MODULES:
				getSubModules().clear();
				getSubModules().addAll((Collection<? extends Module>)newValue);
				return;
			case HenshinPackage.MODULE__SUPER_MODULE:
				setSuperModule((Module)newValue);
				return;
			case HenshinPackage.MODULE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends EPackage>)newValue);
				return;
			case HenshinPackage.MODULE__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case HenshinPackage.MODULE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Graph>)newValue);
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
			case HenshinPackage.MODULE__SUB_MODULES:
				getSubModules().clear();
				return;
			case HenshinPackage.MODULE__SUPER_MODULE:
				setSuperModule((Module)null);
				return;
			case HenshinPackage.MODULE__IMPORTS:
				getImports().clear();
				return;
			case HenshinPackage.MODULE__UNITS:
				getUnits().clear();
				return;
			case HenshinPackage.MODULE__INSTANCES:
				getInstances().clear();
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
			case HenshinPackage.MODULE__SUB_MODULES:
				return subModules != null && !subModules.isEmpty();
			case HenshinPackage.MODULE__SUPER_MODULE:
				return getSuperModule() != null;
			case HenshinPackage.MODULE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case HenshinPackage.MODULE__UNITS:
				return units != null && !units.isEmpty();
			case HenshinPackage.MODULE__INSTANCES:
				return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl

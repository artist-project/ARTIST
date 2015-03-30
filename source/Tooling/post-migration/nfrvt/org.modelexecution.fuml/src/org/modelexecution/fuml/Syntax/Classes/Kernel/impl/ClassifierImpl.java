/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Feature;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization;
import org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.PackageableElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Property;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassifierImpl#isFinalSpecialization <em>Final Specialization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected org.modelexecution.fuml.Syntax.Classes.Kernel.Package package_;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The cached value of the '{@link #getInheritedMember() <em>Inherited Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> inheritedMember;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> attribute;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> general;

	/**
	 * The default value of the '{@link #isFinalSpecialization() <em>Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_SPECIALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinalSpecialization() <em>Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected boolean finalSpecialization = FINAL_SPECIALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.modelexecution.fuml.Syntax.Classes.Kernel.Package getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (org.modelexecution.fuml.Syntax.Classes.Kernel.Package)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KernelPackage.CLASSIFIER__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.modelexecution.fuml.Syntax.Classes.Kernel.Package basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(org.modelexecution.fuml.Syntax.Classes.Kernel.Package newPackage, NotificationChain msgs) {
		org.modelexecution.fuml.Syntax.Classes.Kernel.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KernelPackage.CLASSIFIER__PACKAGE, oldPackage, newPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.modelexecution.fuml.Syntax.Classes.Kernel.Package newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, KernelPackage.PACKAGE__OWNED_TYPE, org.modelexecution.fuml.Syntax.Classes.Kernel.Package.class, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, KernelPackage.PACKAGE__OWNED_TYPE, org.modelexecution.fuml.Syntax.Classes.Kernel.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.CLASSIFIER__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.CLASSIFIER__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, KernelPackage.CLASSIFIER__GENERALIZATION, KernelPackage.GENERALIZATION__SPECIFIC);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, KernelPackage.CLASSIFIER__FEATURE, KernelPackage.FEATURE__FEATURING_CLASSIFIER);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMember() {
		if (inheritedMember == null) {
			inheritedMember = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, KernelPackage.CLASSIFIER__INHERITED_MEMBER);
		}
		return inheritedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectResolvingEList<Property>(Property.class, this, KernelPackage.CLASSIFIER__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGeneral() {
		if (general == null) {
			general = new EObjectResolvingEList<Classifier>(Classifier.class, this, KernelPackage.CLASSIFIER__GENERAL);
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinalSpecialization() {
		return finalSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalSpecialization(boolean newFinalSpecialization) {
		boolean oldFinalSpecialization = finalSpecialization;
		finalSpecialization = newFinalSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.CLASSIFIER__FINAL_SPECIALIZATION, oldFinalSpecialization, finalSpecialization));
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
			case KernelPackage.CLASSIFIER__PACKAGE:
				if (package_ != null)
					msgs = ((InternalEObject)package_).eInverseRemove(this, KernelPackage.PACKAGE__OWNED_TYPE, org.modelexecution.fuml.Syntax.Classes.Kernel.Package.class, msgs);
				return basicSetPackage((org.modelexecution.fuml.Syntax.Classes.Kernel.Package)otherEnd, msgs);
			case KernelPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case KernelPackage.CLASSIFIER__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.CLASSIFIER__PACKAGE:
				return basicSetPackage(null, msgs);
			case KernelPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case KernelPackage.CLASSIFIER__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.CLASSIFIER__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case KernelPackage.CLASSIFIER__ABSTRACT:
				return isAbstract();
			case KernelPackage.CLASSIFIER__GENERALIZATION:
				return getGeneralization();
			case KernelPackage.CLASSIFIER__FEATURE:
				return getFeature();
			case KernelPackage.CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMember();
			case KernelPackage.CLASSIFIER__ATTRIBUTE:
				return getAttribute();
			case KernelPackage.CLASSIFIER__GENERAL:
				return getGeneral();
			case KernelPackage.CLASSIFIER__FINAL_SPECIALIZATION:
				return isFinalSpecialization();
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
			case KernelPackage.CLASSIFIER__PACKAGE:
				setPackage((org.modelexecution.fuml.Syntax.Classes.Kernel.Package)newValue);
				return;
			case KernelPackage.CLASSIFIER__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case KernelPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case KernelPackage.CLASSIFIER__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case KernelPackage.CLASSIFIER__INHERITED_MEMBER:
				getInheritedMember().clear();
				getInheritedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case KernelPackage.CLASSIFIER__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case KernelPackage.CLASSIFIER__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case KernelPackage.CLASSIFIER__FINAL_SPECIALIZATION:
				setFinalSpecialization((Boolean)newValue);
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
			case KernelPackage.CLASSIFIER__PACKAGE:
				setPackage((org.modelexecution.fuml.Syntax.Classes.Kernel.Package)null);
				return;
			case KernelPackage.CLASSIFIER__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case KernelPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				return;
			case KernelPackage.CLASSIFIER__FEATURE:
				getFeature().clear();
				return;
			case KernelPackage.CLASSIFIER__INHERITED_MEMBER:
				getInheritedMember().clear();
				return;
			case KernelPackage.CLASSIFIER__ATTRIBUTE:
				getAttribute().clear();
				return;
			case KernelPackage.CLASSIFIER__GENERAL:
				getGeneral().clear();
				return;
			case KernelPackage.CLASSIFIER__FINAL_SPECIALIZATION:
				setFinalSpecialization(FINAL_SPECIALIZATION_EDEFAULT);
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
			case KernelPackage.CLASSIFIER__PACKAGE:
				return package_ != null;
			case KernelPackage.CLASSIFIER__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case KernelPackage.CLASSIFIER__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case KernelPackage.CLASSIFIER__FEATURE:
				return feature != null && !feature.isEmpty();
			case KernelPackage.CLASSIFIER__INHERITED_MEMBER:
				return inheritedMember != null && !inheritedMember.isEmpty();
			case KernelPackage.CLASSIFIER__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case KernelPackage.CLASSIFIER__GENERAL:
				return general != null && !general.isEmpty();
			case KernelPackage.CLASSIFIER__FINAL_SPECIALIZATION:
				return finalSpecialization != FINAL_SPECIALIZATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case KernelPackage.CLASSIFIER__PACKAGE: return KernelPackage.TYPE__PACKAGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case KernelPackage.TYPE__PACKAGE: return KernelPackage.CLASSIFIER__PACKAGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", finalSpecialization: ");
		result.append(finalSpecialization);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl

/**
 */
package org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.impl.ActionImpl;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Is Classified Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadIsClassifiedObjectActionImpl#isDirect <em>Direct</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadIsClassifiedObjectActionImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadIsClassifiedObjectActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.ReadIsClassifiedObjectActionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadIsClassifiedObjectActionImpl extends ActionImpl implements ReadIsClassifiedObjectAction {
	/**
	 * The default value of the '{@link #isDirect() <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirect() <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected boolean direct = DIRECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier classifier;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected OutputPin result;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected InputPin object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadIsClassifiedObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteActionsPackage.Literals.READ_IS_CLASSIFIED_OBJECT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirect() {
		return direct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirect(boolean newDirect) {
		boolean oldDirect = direct;
		direct = newDirect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__DIRECT, oldDirect, direct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (Classifier)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Classifier newClassifier) {
		Classifier oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(OutputPin newResult, NotificationChain msgs) {
		OutputPin oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(OutputPin newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject, NotificationChain msgs) {
		InputPin oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(InputPin newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				return basicSetResult(null, msgs);
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				return basicSetObject(null, msgs);
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
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__DIRECT:
				return isDirect();
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				return getResult();
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				return getObject();
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
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__DIRECT:
				setDirect((Boolean)newValue);
				return;
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				setClassifier((Classifier)newValue);
				return;
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				setResult((OutputPin)newValue);
				return;
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				setObject((InputPin)newValue);
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
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__DIRECT:
				setDirect(DIRECT_EDEFAULT);
				return;
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				setClassifier((Classifier)null);
				return;
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				setResult((OutputPin)null);
				return;
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				setObject((InputPin)null);
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
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__DIRECT:
				return direct != DIRECT_EDEFAULT;
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				return classifier != null;
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				return result != null;
			case CompleteActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				return object != null;
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
		result.append(" (direct: ");
		result.append(direct);
		result.append(')');
		return result.toString();
	}

} //ReadIsClassifiedObjectActionImpl

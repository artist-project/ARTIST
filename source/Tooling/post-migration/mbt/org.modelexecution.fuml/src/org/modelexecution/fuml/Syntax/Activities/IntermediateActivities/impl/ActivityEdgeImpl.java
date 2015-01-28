/**
 */
package org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.ValueSpecification;
import org.modelexecution.fuml.Syntax.Classes.Kernel.impl.RedefinableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.impl.ActivityEdgeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.impl.ActivityEdgeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityEdgeImpl extends RedefinableElementImpl implements ActivityEdge {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.ACTIVITY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (eContainerFeatureID() != IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivity, IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer() || (eContainerFeatureID() != IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, IntermediateActivitiesPackage.ACTIVITY__EDGE, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesPackage.ACTIVITY_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ActivityNode newSource, NotificationChain msgs) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ActivityNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, IntermediateActivitiesPackage.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActivitiesPackage.ACTIVITY_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ActivityNode newTarget, NotificationChain msgs) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ActivityNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, IntermediateActivitiesPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID() != IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE) return null;
		return (StructuredActivityNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInStructuredNode(StructuredActivityNode newInStructuredNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInStructuredNode, IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eInternalContainer() || (eContainerFeatureID() != IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, newInStructuredNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject)newInStructuredNode).eInverseAdd(this, CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE, StructuredActivityNode.class, msgs);
			msgs = basicSetInStructuredNode(newInStructuredNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE, newInStructuredNode, newInStructuredNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(ValueSpecification newGuard, NotificationChain msgs) {
		ValueSpecification oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(ValueSpecification newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediateActivitiesPackage.ACTIVITY_EDGE__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediateActivitiesPackage.ACTIVITY_EDGE__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.ACTIVITY_EDGE__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
				return basicSetSource((ActivityNode)otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
				return basicSetTarget((ActivityNode)otherEnd, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode((StructuredActivityNode)otherEnd, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY:
				return basicSetActivity(null, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				return basicSetSource(null, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__TARGET:
				return basicSetTarget(null, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__GUARD:
				return basicSetGuard(null, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY:
				return eInternalContainer().eInverseRemove(this, IntermediateActivitiesPackage.ACTIVITY__EDGE, Activity.class, msgs);
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return eInternalContainer().eInverseRemove(this, CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE, StructuredActivityNode.class, msgs);
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY:
				return getActivity();
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__GUARD:
				return getGuard();
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__GUARD:
				setGuard((ValueSpecification)newValue);
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__GUARD:
				setGuard((ValueSpecification)null);
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
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__ACTIVITY:
				return getActivity() != null;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				return source != null;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__TARGET:
				return target != null;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case IntermediateActivitiesPackage.ACTIVITY_EDGE__GUARD:
				return guard != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityEdgeImpl

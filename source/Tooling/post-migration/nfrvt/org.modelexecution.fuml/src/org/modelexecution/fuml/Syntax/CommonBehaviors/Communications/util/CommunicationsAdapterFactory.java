/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Element;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Feature;
import org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace;
import org.modelexecution.fuml.Syntax.Classes.Kernel.PackageableElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Type;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.CommunicationsPackage;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Event;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.MessageEvent;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.CommunicationsPackage
 * @generated
 */
public class CommunicationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommunicationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationsSwitch<Adapter> modelSwitch =
		new CommunicationsSwitch<Adapter>() {
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter caseSignalEvent(SignalEvent object) {
				return createSignalEventAdapter();
			}
			@Override
			public Adapter caseMessageEvent(MessageEvent object) {
				return createMessageEventAdapter();
			}
			@Override
			public Adapter caseReception(Reception object) {
				return createReceptionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object) {
				return createPackageableElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseRedefinableElement(RedefinableElement object) {
				return createRedefinableElementAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseBehavioralFeature(BehavioralFeature object) {
				return createBehavioralFeatureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent <em>Signal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent
	 * @generated
	 */
	public Adapter createSignalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.MessageEvent
	 * @generated
	 */
	public Adapter createMessageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception
	 * @generated
	 */
	public Adapter createReceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature
	 * @generated
	 */
	public Adapter createBehavioralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CommunicationsAdapterFactory

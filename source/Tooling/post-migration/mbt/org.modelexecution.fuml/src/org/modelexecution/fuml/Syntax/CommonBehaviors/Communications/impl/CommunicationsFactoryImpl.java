/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.CommunicationsFactory;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.CommunicationsPackage;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationsFactoryImpl extends EFactoryImpl implements CommunicationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationsFactory init() {
		try {
			CommunicationsFactory theCommunicationsFactory = (CommunicationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelexecution.org/fuml/syntax/commonbehaviors/communications"); 
			if (theCommunicationsFactory != null) {
				return theCommunicationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommunicationsPackage.TRIGGER: return createTrigger();
			case CommunicationsPackage.SIGNAL: return createSignal();
			case CommunicationsPackage.SIGNAL_EVENT: return createSignalEvent();
			case CommunicationsPackage.RECEPTION: return createReception();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEvent createSignalEvent() {
		SignalEventImpl signalEvent = new SignalEventImpl();
		return signalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createReception() {
		ReceptionImpl reception = new ReceptionImpl();
		return reception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationsPackage getCommunicationsPackage() {
		return (CommunicationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationsPackage getPackage() {
		return CommunicationsPackage.eINSTANCE;
	}

} //CommunicationsFactoryImpl

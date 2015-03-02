/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.Communications;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.CommunicationsPackage#getSignalEvent()
 * @model
 * @generated
 */
public interface SignalEvent extends MessageEvent {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific signal that is associated with this event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.CommunicationsPackage#getSignalEvent_Signal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // SignalEvent

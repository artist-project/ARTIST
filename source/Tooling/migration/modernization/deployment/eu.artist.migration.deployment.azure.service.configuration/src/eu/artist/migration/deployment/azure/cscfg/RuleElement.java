/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         order value must be unique in an EndpointAcl
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getAction <em>Action</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getOrder <em>Order</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getRemoteSubnet <em>Remote Subnet</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRuleElement()
 * @model extendedMetaData="name='RuleElement' kind='empty'"
 * @generated
 */
public interface RuleElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.cscfg.RuleAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleAction
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #setAction(RuleAction)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRuleElement_Action()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='action'"
	 * @generated
	 */
	RuleAction getAction();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleAction
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #getAction()
	 * @generated
	 */
	void setAction(RuleAction value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(RuleAction)
	 * @generated
	 */
	void unsetAction();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getAction <em>Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action</em>' attribute is set.
	 * @see #unsetAction()
	 * @see #getAction()
	 * @see #setAction(RuleAction)
	 * @generated
	 */
	boolean isSetAction();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRuleElement_Description()
	 * @model dataType="eu.artist.migration.deployment.azure.cscfg.BoundedLengthString"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #setOrder(int)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRuleElement_Order()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort" required="true"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(int)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getOrder <em>Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order</em>' attribute is set.
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @see #setOrder(int)
	 * @generated
	 */
	boolean isSetOrder();

	/**
	 * Returns the value of the '<em><b>Remote Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Subnet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Subnet</em>' attribute.
	 * @see #setRemoteSubnet(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRuleElement_RemoteSubnet()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='remoteSubnet'"
	 * @generated
	 */
	String getRemoteSubnet();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getRemoteSubnet <em>Remote Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Subnet</em>' attribute.
	 * @see #getRemoteSubnet()
	 * @generated
	 */
	void setRemoteSubnet(String value);

} // RuleElement

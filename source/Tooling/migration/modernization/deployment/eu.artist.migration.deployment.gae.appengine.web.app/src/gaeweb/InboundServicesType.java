/**
 */
package gaeweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inbound Services Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.InboundServicesType#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getInboundServicesType()
 * @model extendedMetaData="name='inboundServicesType' kind='elementOnly'"
 * @generated
 */
public interface InboundServicesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute list.
	 * @see gaeweb.GaewebPackage#getInboundServicesType_Service()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getService();

} // InboundServicesType

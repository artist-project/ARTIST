/**
 */
package gaeweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Include Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.StaticIncludeType#getHttpHeader <em>Http Header</em>}</li>
 *   <li>{@link gaeweb.StaticIncludeType#getExpiration <em>Expiration</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getStaticIncludeType()
 * @model extendedMetaData="name='staticIncludeType' kind='elementOnly'"
 * @generated
 */
public interface StaticIncludeType extends IncludeType {
	/**
	 * Returns the value of the '<em><b>Http Header</b></em>' containment reference list.
	 * The list contents are of type {@link gaeweb.HttpHeaderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Header</em>' containment reference list.
	 * @see gaeweb.GaewebPackage#getStaticIncludeType_HttpHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='http-header' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HttpHeaderType> getHttpHeader();

	/**
	 * Returns the value of the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration</em>' attribute.
	 * @see #setExpiration(String)
	 * @see gaeweb.GaewebPackage#getStaticIncludeType_Expiration()
	 * @model dataType="gaeweb.ExpirationType"
	 *        extendedMetaData="kind='attribute' name='expiration'"
	 * @generated
	 */
	String getExpiration();

	/**
	 * Sets the value of the '{@link gaeweb.StaticIncludeType#getExpiration <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration</em>' attribute.
	 * @see #getExpiration()
	 * @generated
	 */
	void setExpiration(String value);

} // StaticIncludeType

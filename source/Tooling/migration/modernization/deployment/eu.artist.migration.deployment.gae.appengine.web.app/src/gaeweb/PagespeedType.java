/**
 */
package gaeweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagespeed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.PagespeedType#getGroup <em>Group</em>}</li>
 *   <li>{@link gaeweb.PagespeedType#getUrlBlacklist <em>Url Blacklist</em>}</li>
 *   <li>{@link gaeweb.PagespeedType#getDomainToRewrite <em>Domain To Rewrite</em>}</li>
 *   <li>{@link gaeweb.PagespeedType#getEnabledRewriter <em>Enabled Rewriter</em>}</li>
 *   <li>{@link gaeweb.PagespeedType#getDisabledRewriter <em>Disabled Rewriter</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getPagespeedType()
 * @model extendedMetaData="name='pagespeedType' kind='elementOnly'"
 * @generated
 */
public interface PagespeedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see gaeweb.GaewebPackage#getPagespeedType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Url Blacklist</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Blacklist</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Blacklist</em>' attribute list.
	 * @see gaeweb.GaewebPackage#getPagespeedType_UrlBlacklist()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='url-blacklist' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getUrlBlacklist();

	/**
	 * Returns the value of the '<em><b>Domain To Rewrite</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain To Rewrite</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain To Rewrite</em>' attribute list.
	 * @see gaeweb.GaewebPackage#getPagespeedType_DomainToRewrite()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domain-to-rewrite' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDomainToRewrite();

	/**
	 * Returns the value of the '<em><b>Enabled Rewriter</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Rewriter</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Rewriter</em>' attribute list.
	 * @see gaeweb.GaewebPackage#getPagespeedType_EnabledRewriter()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enabled-rewriter' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getEnabledRewriter();

	/**
	 * Returns the value of the '<em><b>Disabled Rewriter</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled Rewriter</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled Rewriter</em>' attribute list.
	 * @see gaeweb.GaewebPackage#getPagespeedType_DisabledRewriter()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disabled-rewriter' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDisabledRewriter();

} // PagespeedType

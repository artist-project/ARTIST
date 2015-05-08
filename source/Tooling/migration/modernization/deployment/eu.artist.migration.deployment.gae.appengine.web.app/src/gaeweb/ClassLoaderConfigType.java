/**
 */
package gaeweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Loader Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.ClassLoaderConfigType#getPrioritySpecifier <em>Priority Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getClassLoaderConfigType()
 * @model extendedMetaData="name='classLoaderConfigType' kind='elementOnly'"
 * @generated
 */
public interface ClassLoaderConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Priority Specifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Specifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Specifier</em>' attribute list.
	 * @see gaeweb.GaewebPackage#getClassLoaderConfigType_PrioritySpecifier()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='priority-specifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Object> getPrioritySpecifier();

} // ClassLoaderConfigType

/**
 */
package gaeweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vm Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.VmSettingsType#getSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getVmSettingsType()
 * @model extendedMetaData="name='vm-settingsType' kind='elementOnly'"
 * @generated
 */
public interface VmSettingsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Setting</b></em>' containment reference list.
	 * The list contents are of type {@link gaeweb.SettingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting</em>' containment reference list.
	 * @see gaeweb.GaewebPackage#getVmSettingsType_Setting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='setting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SettingType> getSetting();

} // VmSettingsType

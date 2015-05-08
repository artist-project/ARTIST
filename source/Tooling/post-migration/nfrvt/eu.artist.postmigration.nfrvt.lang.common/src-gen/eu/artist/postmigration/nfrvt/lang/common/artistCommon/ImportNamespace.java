/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getImportNamespace()
 * @model
 * @generated
 */
public interface ImportNamespace extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#getImportNamespace_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

} // ImportNamespace

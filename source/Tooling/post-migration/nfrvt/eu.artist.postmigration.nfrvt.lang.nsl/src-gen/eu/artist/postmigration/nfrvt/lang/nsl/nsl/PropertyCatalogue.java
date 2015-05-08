/**
 */
package eu.artist.postmigration.nfrvt.lang.nsl.nsl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getPropertyCatalogue()
 * @model
 * @generated
 */
public interface PropertyCatalogue extends ARTISTModel
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getPropertyCatalogue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getPropertyCatalogue_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // PropertyCatalogue

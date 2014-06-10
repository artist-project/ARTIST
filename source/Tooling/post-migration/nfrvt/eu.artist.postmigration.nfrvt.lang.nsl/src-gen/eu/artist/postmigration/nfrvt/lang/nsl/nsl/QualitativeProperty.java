/**
 */
package eu.artist.postmigration.nfrvt.lang.nsl.nsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getQualitativeProperty()
 * @model
 * @generated
 */
public interface QualitativeProperty extends Property
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' reference list.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getQualitativeProperty_Properties()
   * @model
   * @generated
   */
  EList<Property> getProperties();

} // QualitativeProperty

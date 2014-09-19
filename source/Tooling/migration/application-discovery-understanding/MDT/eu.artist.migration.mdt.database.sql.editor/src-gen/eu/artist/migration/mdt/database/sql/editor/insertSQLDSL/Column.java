/**
 */
package eu.artist.migration.mdt.database.sql.editor.insertSQLDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Column#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage#getColumn_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Column#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Column

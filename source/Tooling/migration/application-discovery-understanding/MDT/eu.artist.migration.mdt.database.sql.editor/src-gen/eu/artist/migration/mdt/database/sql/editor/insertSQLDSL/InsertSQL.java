/**
 */
package eu.artist.migration.mdt.database.sql.editor.insertSQLDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert SQL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getDatabase <em>Database</em>}</li>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getTab <em>Tab</em>}</li>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getColumns <em>Columns</em>}</li>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage#getInsertSQL()
 * @model
 * @generated
 */
public interface InsertSQL extends EObject
{
  /**
   * Returns the value of the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database</em>' containment reference.
   * @see #setDatabase(Database)
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage#getInsertSQL_Database()
   * @model containment="true"
   * @generated
   */
  Database getDatabase();

  /**
   * Sets the value of the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getDatabase <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database</em>' containment reference.
   * @see #getDatabase()
   * @generated
   */
  void setDatabase(Database value);

  /**
   * Returns the value of the '<em><b>Tab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tab</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tab</em>' containment reference.
   * @see #setTab(Tab)
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage#getInsertSQL_Tab()
   * @model containment="true"
   * @generated
   */
  Tab getTab();

  /**
   * Sets the value of the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getTab <em>Tab</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tab</em>' containment reference.
   * @see #getTab()
   * @generated
   */
  void setTab(Tab value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage#getInsertSQL_Columns()
   * @model containment="true"
   * @generated
   */
  EList<Column> getColumns();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage#getInsertSQL_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // InsertSQL

/**
 */
package eu.artist.migration.mdt.database.sql.editor.insertSQLDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Model#getInsertSQL <em>Insert SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Insert SQL</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insert SQL</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insert SQL</em>' containment reference list.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage#getModel_InsertSQL()
   * @model containment="true"
   * @generated
   */
  EList<InsertSQL> getInsertSQL();

} // Model

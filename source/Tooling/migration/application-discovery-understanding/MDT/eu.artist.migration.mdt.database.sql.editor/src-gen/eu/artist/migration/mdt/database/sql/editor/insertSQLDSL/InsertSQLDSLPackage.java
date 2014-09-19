/**
 */
package eu.artist.migration.mdt.database.sql.editor.insertSQLDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLFactory
 * @model kind="package"
 * @generated
 */
public interface InsertSQLDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "insertSQLDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.artist.eu/migration/mdt/database/sql/editor/SQLDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "insertSQLDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InsertSQLDSLPackage eINSTANCE = eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.ModelImpl
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Insert SQL</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INSERT_SQL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLImpl <em>Insert SQL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLImpl
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getInsertSQL()
   * @generated
   */
  int INSERT_SQL = 1;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_SQL__DATABASE = 0;

  /**
   * The feature id for the '<em><b>Tab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_SQL__TAB = 1;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_SQL__COLUMNS = 2;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_SQL__FIELDS = 3;

  /**
   * The number of structural features of the '<em>Insert SQL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_SQL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.DatabaseImpl <em>Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.DatabaseImpl
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getDatabase()
   * @generated
   */
  int DATABASE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.TabImpl <em>Tab</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.TabImpl
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getTab()
   * @generated
   */
  int TAB = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__VALUE = 0;

  /**
   * The number of structural features of the '<em>Tab</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.ColumnImpl
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__VALUE = 0;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.FieldImpl
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getField()
   * @generated
   */
  int FIELD = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Model#getInsertSQL <em>Insert SQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Insert SQL</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Model#getInsertSQL()
   * @see #getModel()
   * @generated
   */
  EReference getModel_InsertSQL();

  /**
   * Returns the meta object for class '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL <em>Insert SQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert SQL</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL
   * @generated
   */
  EClass getInsertSQL();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getDatabase <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getDatabase()
   * @see #getInsertSQL()
   * @generated
   */
  EReference getInsertSQL_Database();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getTab <em>Tab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tab</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getTab()
   * @see #getInsertSQL()
   * @generated
   */
  EReference getInsertSQL_Tab();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getColumns()
   * @see #getInsertSQL()
   * @generated
   */
  EReference getInsertSQL_Columns();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL#getFields()
   * @see #getInsertSQL()
   * @generated
   */
  EReference getInsertSQL_Fields();

  /**
   * Returns the meta object for class '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Database
   * @generated
   */
  EClass getDatabase();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Database#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Database#getValue()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Tab <em>Tab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Tab
   * @generated
   */
  EClass getTab();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Tab#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Tab#getValue()
   * @see #getTab()
   * @generated
   */
  EAttribute getTab_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Column#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Column#getValue()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Field#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Field#getValue()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InsertSQLDSLFactory getInsertSQLDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.ModelImpl
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Insert SQL</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INSERT_SQL = eINSTANCE.getModel_InsertSQL();

    /**
     * The meta object literal for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLImpl <em>Insert SQL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLImpl
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getInsertSQL()
     * @generated
     */
    EClass INSERT_SQL = eINSTANCE.getInsertSQL();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_SQL__DATABASE = eINSTANCE.getInsertSQL_Database();

    /**
     * The meta object literal for the '<em><b>Tab</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_SQL__TAB = eINSTANCE.getInsertSQL_Tab();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_SQL__COLUMNS = eINSTANCE.getInsertSQL_Columns();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_SQL__FIELDS = eINSTANCE.getInsertSQL_Fields();

    /**
     * The meta object literal for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.DatabaseImpl
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getDatabase()
     * @generated
     */
    EClass DATABASE = eINSTANCE.getDatabase();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__VALUE = eINSTANCE.getDatabase_Value();

    /**
     * The meta object literal for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.TabImpl <em>Tab</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.TabImpl
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getTab()
     * @generated
     */
    EClass TAB = eINSTANCE.getTab();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAB__VALUE = eINSTANCE.getTab_Value();

    /**
     * The meta object literal for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.ColumnImpl
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__VALUE = eINSTANCE.getColumn_Value();

    /**
     * The meta object literal for the '{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.FieldImpl
     * @see eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLDSLPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__VALUE = eINSTANCE.getField_Value();

  }

} //InsertSQLDSLPackage

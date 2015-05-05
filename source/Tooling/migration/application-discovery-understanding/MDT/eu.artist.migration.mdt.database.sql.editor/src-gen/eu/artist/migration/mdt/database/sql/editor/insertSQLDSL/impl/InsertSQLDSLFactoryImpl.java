/**
 */
package eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl;

import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InsertSQLDSLFactoryImpl extends EFactoryImpl implements InsertSQLDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InsertSQLDSLFactory init()
  {
    try
    {
      InsertSQLDSLFactory theInsertSQLDSLFactory = (InsertSQLDSLFactory)EPackage.Registry.INSTANCE.getEFactory(InsertSQLDSLPackage.eNS_URI);
      if (theInsertSQLDSLFactory != null)
      {
        return theInsertSQLDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InsertSQLDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertSQLDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case InsertSQLDSLPackage.MODEL: return createModel();
      case InsertSQLDSLPackage.INSERT_SQL: return createInsertSQL();
      case InsertSQLDSLPackage.DATABASE: return createDatabase();
      case InsertSQLDSLPackage.TAB: return createTab();
      case InsertSQLDSLPackage.COLUMN: return createColumn();
      case InsertSQLDSLPackage.FIELD: return createField();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertSQL createInsertSQL()
  {
    InsertSQLImpl insertSQL = new InsertSQLImpl();
    return insertSQL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Database createDatabase()
  {
    DatabaseImpl database = new DatabaseImpl();
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tab createTab()
  {
    TabImpl tab = new TabImpl();
    return tab;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertSQLDSLPackage getInsertSQLDSLPackage()
  {
    return (InsertSQLDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InsertSQLDSLPackage getPackage()
  {
    return InsertSQLDSLPackage.eINSTANCE;
  }

} //InsertSQLDSLFactoryImpl

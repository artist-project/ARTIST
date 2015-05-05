/**
 */
package eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl;

import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Column;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Database;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Field;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Tab;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert SQL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.InsertSQLImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertSQLImpl extends MinimalEObjectImpl.Container implements InsertSQL
{
  /**
   * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabase()
   * @generated
   * @ordered
   */
  protected Database database;

  /**
   * The cached value of the '{@link #getTab() <em>Tab</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTab()
   * @generated
   * @ordered
   */
  protected Tab tab;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<Column> columns;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsertSQLImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return InsertSQLDSLPackage.Literals.INSERT_SQL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Database getDatabase()
  {
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs)
  {
    Database oldDatabase = database;
    database = newDatabase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InsertSQLDSLPackage.INSERT_SQL__DATABASE, oldDatabase, newDatabase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatabase(Database newDatabase)
  {
    if (newDatabase != database)
    {
      NotificationChain msgs = null;
      if (database != null)
        msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InsertSQLDSLPackage.INSERT_SQL__DATABASE, null, msgs);
      if (newDatabase != null)
        msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InsertSQLDSLPackage.INSERT_SQL__DATABASE, null, msgs);
      msgs = basicSetDatabase(newDatabase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InsertSQLDSLPackage.INSERT_SQL__DATABASE, newDatabase, newDatabase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tab getTab()
  {
    return tab;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTab(Tab newTab, NotificationChain msgs)
  {
    Tab oldTab = tab;
    tab = newTab;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InsertSQLDSLPackage.INSERT_SQL__TAB, oldTab, newTab);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTab(Tab newTab)
  {
    if (newTab != tab)
    {
      NotificationChain msgs = null;
      if (tab != null)
        msgs = ((InternalEObject)tab).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InsertSQLDSLPackage.INSERT_SQL__TAB, null, msgs);
      if (newTab != null)
        msgs = ((InternalEObject)newTab).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InsertSQLDSLPackage.INSERT_SQL__TAB, null, msgs);
      msgs = basicSetTab(newTab, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InsertSQLDSLPackage.INSERT_SQL__TAB, newTab, newTab));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<Column>(Column.class, this, InsertSQLDSLPackage.INSERT_SQL__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, InsertSQLDSLPackage.INSERT_SQL__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case InsertSQLDSLPackage.INSERT_SQL__DATABASE:
        return basicSetDatabase(null, msgs);
      case InsertSQLDSLPackage.INSERT_SQL__TAB:
        return basicSetTab(null, msgs);
      case InsertSQLDSLPackage.INSERT_SQL__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case InsertSQLDSLPackage.INSERT_SQL__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case InsertSQLDSLPackage.INSERT_SQL__DATABASE:
        return getDatabase();
      case InsertSQLDSLPackage.INSERT_SQL__TAB:
        return getTab();
      case InsertSQLDSLPackage.INSERT_SQL__COLUMNS:
        return getColumns();
      case InsertSQLDSLPackage.INSERT_SQL__FIELDS:
        return getFields();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InsertSQLDSLPackage.INSERT_SQL__DATABASE:
        setDatabase((Database)newValue);
        return;
      case InsertSQLDSLPackage.INSERT_SQL__TAB:
        setTab((Tab)newValue);
        return;
      case InsertSQLDSLPackage.INSERT_SQL__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
        return;
      case InsertSQLDSLPackage.INSERT_SQL__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case InsertSQLDSLPackage.INSERT_SQL__DATABASE:
        setDatabase((Database)null);
        return;
      case InsertSQLDSLPackage.INSERT_SQL__TAB:
        setTab((Tab)null);
        return;
      case InsertSQLDSLPackage.INSERT_SQL__COLUMNS:
        getColumns().clear();
        return;
      case InsertSQLDSLPackage.INSERT_SQL__FIELDS:
        getFields().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case InsertSQLDSLPackage.INSERT_SQL__DATABASE:
        return database != null;
      case InsertSQLDSLPackage.INSERT_SQL__TAB:
        return tab != null;
      case InsertSQLDSLPackage.INSERT_SQL__COLUMNS:
        return columns != null && !columns.isEmpty();
      case InsertSQLDSLPackage.INSERT_SQL__FIELDS:
        return fields != null && !fields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InsertSQLImpl

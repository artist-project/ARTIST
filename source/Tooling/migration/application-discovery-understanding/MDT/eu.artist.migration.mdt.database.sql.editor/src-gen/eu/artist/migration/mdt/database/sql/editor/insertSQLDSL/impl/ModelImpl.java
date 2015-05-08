/**
 */
package eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl;

import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQL;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.impl.ModelImpl#getInsertSQL <em>Insert SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getInsertSQL() <em>Insert SQL</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertSQL()
   * @generated
   * @ordered
   */
  protected EList<InsertSQL> insertSQL;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return InsertSQLDSLPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InsertSQL> getInsertSQL()
  {
    if (insertSQL == null)
    {
      insertSQL = new EObjectContainmentEList<InsertSQL>(InsertSQL.class, this, InsertSQLDSLPackage.MODEL__INSERT_SQL);
    }
    return insertSQL;
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
      case InsertSQLDSLPackage.MODEL__INSERT_SQL:
        return ((InternalEList<?>)getInsertSQL()).basicRemove(otherEnd, msgs);
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
      case InsertSQLDSLPackage.MODEL__INSERT_SQL:
        return getInsertSQL();
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
      case InsertSQLDSLPackage.MODEL__INSERT_SQL:
        getInsertSQL().clear();
        getInsertSQL().addAll((Collection<? extends InsertSQL>)newValue);
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
      case InsertSQLDSLPackage.MODEL__INSERT_SQL:
        getInsertSQL().clear();
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
      case InsertSQLDSLPackage.MODEL__INSERT_SQL:
        return insertSQL != null && !insertSQL.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl

/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel.impl;

import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected Pattern pattern;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> target;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> context;

  /**
   * The default value of the '{@link #getInfo() <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfo()
   * @generated
   * @ordered
   */
  protected static final String INFO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInfo() <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfo()
   * @generated
   * @ordered
   */
  protected String info = INFO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransformationImpl()
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
    return GelPackage.Literals.TRANSFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.TRANSFORMATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern getPattern()
  {
    if (pattern != null && pattern.eIsProxy())
    {
      InternalEObject oldPattern = (InternalEObject)pattern;
      pattern = (Pattern)eResolveProxy(oldPattern);
      if (pattern != oldPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GelPackage.TRANSFORMATION__PATTERN, oldPattern, pattern));
      }
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern basicGetPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(Pattern newPattern)
  {
    Pattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.TRANSFORMATION__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getSource()
  {
    if (source == null)
    {
      source = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, GelPackage.TRANSFORMATION__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getTarget()
  {
    if (target == null)
    {
      target = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, GelPackage.TRANSFORMATION__TARGET);
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getContext()
  {
    if (context == null)
    {
      context = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, GelPackage.TRANSFORMATION__CONTEXT);
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInfo()
  {
    return info;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfo(String newInfo)
  {
    String oldInfo = info;
    info = newInfo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.TRANSFORMATION__INFO, oldInfo, info));
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
      case GelPackage.TRANSFORMATION__NAME:
        return getName();
      case GelPackage.TRANSFORMATION__PATTERN:
        if (resolve) return getPattern();
        return basicGetPattern();
      case GelPackage.TRANSFORMATION__SOURCE:
        return getSource();
      case GelPackage.TRANSFORMATION__TARGET:
        return getTarget();
      case GelPackage.TRANSFORMATION__CONTEXT:
        return getContext();
      case GelPackage.TRANSFORMATION__INFO:
        return getInfo();
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
      case GelPackage.TRANSFORMATION__NAME:
        setName((String)newValue);
        return;
      case GelPackage.TRANSFORMATION__PATTERN:
        setPattern((Pattern)newValue);
        return;
      case GelPackage.TRANSFORMATION__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends NamedElement>)newValue);
        return;
      case GelPackage.TRANSFORMATION__TARGET:
        getTarget().clear();
        getTarget().addAll((Collection<? extends NamedElement>)newValue);
        return;
      case GelPackage.TRANSFORMATION__CONTEXT:
        getContext().clear();
        getContext().addAll((Collection<? extends NamedElement>)newValue);
        return;
      case GelPackage.TRANSFORMATION__INFO:
        setInfo((String)newValue);
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
      case GelPackage.TRANSFORMATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GelPackage.TRANSFORMATION__PATTERN:
        setPattern((Pattern)null);
        return;
      case GelPackage.TRANSFORMATION__SOURCE:
        getSource().clear();
        return;
      case GelPackage.TRANSFORMATION__TARGET:
        getTarget().clear();
        return;
      case GelPackage.TRANSFORMATION__CONTEXT:
        getContext().clear();
        return;
      case GelPackage.TRANSFORMATION__INFO:
        setInfo(INFO_EDEFAULT);
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
      case GelPackage.TRANSFORMATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GelPackage.TRANSFORMATION__PATTERN:
        return pattern != null;
      case GelPackage.TRANSFORMATION__SOURCE:
        return source != null && !source.isEmpty();
      case GelPackage.TRANSFORMATION__TARGET:
        return target != null && !target.isEmpty();
      case GelPackage.TRANSFORMATION__CONTEXT:
        return context != null && !context.isEmpty();
      case GelPackage.TRANSFORMATION__INFO:
        return INFO_EDEFAULT == null ? info != null : !INFO_EDEFAULT.equals(info);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", info: ");
    result.append(info);
    result.append(')');
    return result.toString();
  }

} //TransformationImpl

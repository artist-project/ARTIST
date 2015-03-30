/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

import eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Benchmark Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.BenchmarkMeasurementImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.BenchmarkMeasurementImpl#getService <em>Service</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.BenchmarkMeasurementImpl#getTest <em>Test</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.BenchmarkMeasurementImpl#getWorkload <em>Workload</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.BenchmarkMeasurementImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BenchmarkMeasurementImpl extends MeasurementImpl implements BenchmarkMeasurement
{
  /**
   * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvider()
   * @generated
   * @ordered
   */
  protected EnumerationLiteral provider;

  /**
   * The default value of the '{@link #getService() <em>Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected static final String SERVICE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected String service = SERVICE_EDEFAULT;

  /**
   * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected static final String TEST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected String test = TEST_EDEFAULT;

  /**
   * The default value of the '{@link #getWorkload() <em>Workload</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkload()
   * @generated
   * @ordered
   */
  protected static final String WORKLOAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWorkload() <em>Workload</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkload()
   * @generated
   * @ordered
   */
  protected String workload = WORKLOAD_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ValueSpecification value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BenchmarkMeasurementImpl()
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
    return PmlPackage.Literals.BENCHMARK_MEASUREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral getProvider()
  {
    if (provider != null && provider.eIsProxy())
    {
      InternalEObject oldProvider = (InternalEObject)provider;
      provider = (EnumerationLiteral)eResolveProxy(oldProvider);
      if (provider != oldProvider)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PmlPackage.BENCHMARK_MEASUREMENT__PROVIDER, oldProvider, provider));
      }
    }
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral basicGetProvider()
  {
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvider(EnumerationLiteral newProvider)
  {
    EnumerationLiteral oldProvider = provider;
    provider = newProvider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.BENCHMARK_MEASUREMENT__PROVIDER, oldProvider, provider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getService()
  {
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setService(String newService)
  {
    String oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.BENCHMARK_MEASUREMENT__SERVICE, oldService, service));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest(String newTest)
  {
    String oldTest = test;
    test = newTest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.BENCHMARK_MEASUREMENT__TEST, oldTest, test));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWorkload()
  {
    return workload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkload(String newWorkload)
  {
    String oldWorkload = workload;
    workload = newWorkload;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.BENCHMARK_MEASUREMENT__WORKLOAD, oldWorkload, workload));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueSpecification getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ValueSpecification newValue, NotificationChain msgs)
  {
    ValueSpecification oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmlPackage.BENCHMARK_MEASUREMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ValueSpecification newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PmlPackage.BENCHMARK_MEASUREMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PmlPackage.BENCHMARK_MEASUREMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.BENCHMARK_MEASUREMENT__VALUE, newValue, newValue));
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
      case PmlPackage.BENCHMARK_MEASUREMENT__VALUE:
        return basicSetValue(null, msgs);
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
      case PmlPackage.BENCHMARK_MEASUREMENT__PROVIDER:
        if (resolve) return getProvider();
        return basicGetProvider();
      case PmlPackage.BENCHMARK_MEASUREMENT__SERVICE:
        return getService();
      case PmlPackage.BENCHMARK_MEASUREMENT__TEST:
        return getTest();
      case PmlPackage.BENCHMARK_MEASUREMENT__WORKLOAD:
        return getWorkload();
      case PmlPackage.BENCHMARK_MEASUREMENT__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PmlPackage.BENCHMARK_MEASUREMENT__PROVIDER:
        setProvider((EnumerationLiteral)newValue);
        return;
      case PmlPackage.BENCHMARK_MEASUREMENT__SERVICE:
        setService((String)newValue);
        return;
      case PmlPackage.BENCHMARK_MEASUREMENT__TEST:
        setTest((String)newValue);
        return;
      case PmlPackage.BENCHMARK_MEASUREMENT__WORKLOAD:
        setWorkload((String)newValue);
        return;
      case PmlPackage.BENCHMARK_MEASUREMENT__VALUE:
        setValue((ValueSpecification)newValue);
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
      case PmlPackage.BENCHMARK_MEASUREMENT__PROVIDER:
        setProvider((EnumerationLiteral)null);
        return;
      case PmlPackage.BENCHMARK_MEASUREMENT__SERVICE:
        setService(SERVICE_EDEFAULT);
        return;
      case PmlPackage.BENCHMARK_MEASUREMENT__TEST:
        setTest(TEST_EDEFAULT);
        return;
      case PmlPackage.BENCHMARK_MEASUREMENT__WORKLOAD:
        setWorkload(WORKLOAD_EDEFAULT);
        return;
      case PmlPackage.BENCHMARK_MEASUREMENT__VALUE:
        setValue((ValueSpecification)null);
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
      case PmlPackage.BENCHMARK_MEASUREMENT__PROVIDER:
        return provider != null;
      case PmlPackage.BENCHMARK_MEASUREMENT__SERVICE:
        return SERVICE_EDEFAULT == null ? service != null : !SERVICE_EDEFAULT.equals(service);
      case PmlPackage.BENCHMARK_MEASUREMENT__TEST:
        return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
      case PmlPackage.BENCHMARK_MEASUREMENT__WORKLOAD:
        return WORKLOAD_EDEFAULT == null ? workload != null : !WORKLOAD_EDEFAULT.equals(workload);
      case PmlPackage.BENCHMARK_MEASUREMENT__VALUE:
        return value != null;
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
    result.append(" (service: ");
    result.append(service);
    result.append(", test: ");
    result.append(test);
    result.append(", workload: ");
    result.append(workload);
    result.append(')');
    return result.toString();
  }

} //BenchmarkMeasurementImpl

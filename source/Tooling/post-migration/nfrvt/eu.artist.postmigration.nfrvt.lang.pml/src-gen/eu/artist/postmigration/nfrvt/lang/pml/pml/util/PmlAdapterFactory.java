/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.util;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel;

import eu.artist.postmigration.nfrvt.lang.pml.pml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage
 * @generated
 */
public class PmlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PmlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PmlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PmlSwitch<Adapter> modelSwitch =
    new PmlSwitch<Adapter>()
    {
      @Override
      public Adapter caseMeasurementModel(MeasurementModel object)
      {
        return createMeasurementModelAdapter();
      }
      @Override
      public Adapter caseObservation(Observation object)
      {
        return createObservationAdapter();
      }
      @Override
      public Adapter caseMeasurement(Measurement object)
      {
        return createMeasurementAdapter();
      }
      @Override
      public Adapter caseApplicationMeasurement(ApplicationMeasurement object)
      {
        return createApplicationMeasurementAdapter();
      }
      @Override
      public Adapter caseDataPointMeasurement(DataPointMeasurement object)
      {
        return createDataPointMeasurementAdapter();
      }
      @Override
      public Adapter caseTimeSeriesMeasurement(TimeSeriesMeasurement object)
      {
        return createTimeSeriesMeasurementAdapter();
      }
      @Override
      public Adapter caseBenchmarkMeasurement(BenchmarkMeasurement object)
      {
        return createBenchmarkMeasurementAdapter();
      }
      @Override
      public Adapter caseTimeValuePair(TimeValuePair object)
      {
        return createTimeValuePairAdapter();
      }
      @Override
      public Adapter caseARTISTModel(ARTISTModel object)
      {
        return createARTISTModelAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel <em>Measurement Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel
   * @generated
   */
  public Adapter createMeasurementModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Observation
   * @generated
   */
  public Adapter createObservationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement
   * @generated
   */
  public Adapter createMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement <em>Application Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement
   * @generated
   */
  public Adapter createApplicationMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement <em>Data Point Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement
   * @generated
   */
  public Adapter createDataPointMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement <em>Time Series Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement
   * @generated
   */
  public Adapter createTimeSeriesMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement <em>Benchmark Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement
   * @generated
   */
  public Adapter createBenchmarkMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair <em>Time Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair
   * @generated
   */
  public Adapter createTimeValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel <em>ARTIST Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel
   * @generated
   */
  public Adapter createARTISTModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PmlAdapterFactory

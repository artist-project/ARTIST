/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.util.builder;

import java.util.Date;
import java.util.Locale;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.Grammar;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.common.ARTISTDateTimeValueConverter;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.pml.parser.antlr.PMLParser;
import eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.ObjectUtil;
import eu.artist.postmigration.nfrvt.lang.util.selector.MeasurementModelSelector;

/**
 * This builder class helps to create or adapt one measurement model instance.
 * 
 * @author Martin Fleck
 * @see MeasurementModelSelector
 * @see MeasurementModel
 */
public class MeasurementModelBuilder extends MigrationModelBuilder<MeasurementModel> {
	private MeasurementModel measurementModel;

	/**
	 * Pre-defined observation levels for measurement models.
	 * 
	 * @author Martin Fleck
	 *
	 */
	public enum ObservationLevel {
		OriginalCode,
		OriginalPSM,
		PIM,
		CloudifiedPSM,
		CloudifiedCode,
		Model,
		Code;
		
		public String toString() {
			switch(this) {
				case OriginalCode:
					return "Original Code";
				case OriginalPSM:
					return "Original PSM";
				case PIM:
					return "PIM";
				case CloudifiedPSM:
					return "Cloudified PSM";
				case CloudifiedCode:
					return "Cloudified Code";
				case Model:
					return "Model";
				case Code:
					return "Code";
				default:
					break;
			}
			return "";
		};
	}
	
	/**
	 * Pre-defined measurement types for measurement models.
	 * 
	 * @author Martin Fleck
	 *
	 */
	public enum MeasurementType {
		Measured,
		Calculated,
		Estimated,
		Simulated,
		Random;
		
		public String toString() {
			switch(this) {
				case Measured:
					return "measured";
				case Calculated:
					return "calculated";
				case Estimated:
					return "estimated";
				case Simulated:
					return "simulated";
				case Random:
					return "random";
				default:
					break;
			}
			return "";
		};
	}
	
	/**
	 * Creates an instance of {@link MeasurementModelBuilder} with an empty
	 * {@link MigrationResourceSet} and creates an empty measurement model,
	 * which is only stored in-memory.
	 */
	public MeasurementModelBuilder() {
		this(new MigrationResourceSet());
	}

	/**
	 * Creates an instance of {@link MeasurementModelBuilder} with the given
	 * {@link MigrationResourceSet} and creates an empty measurement model,
	 * which is only stored in-memory.
	 * @param resourceSet resource set to be used
	 */
	public MeasurementModelBuilder(MigrationResourceSet resourceSet) {
		this(resourceSet, MigrationFactory.createMeasurementModel());
	}
	
	/**
	 * Creates an instance of {@link MeasurementModelBuilder} with the given
	 * {@link MigrationResourceSet} and the given measurement model. It is not
	 * checked whether the given model is actually contained in the resource
	 * set or whether it is stored only in-memory.
	 * @param resourceSet resource set to be used
	 * @param measurementModel measurement model to be used
	 */
	public MeasurementModelBuilder(MigrationResourceSet resourceSet, MeasurementModel measurementModel) {
		super(resourceSet, measurementModel);
		this.measurementModel = measurementModel;
	}
	
	/**
	 * Creates a new measurement model builder with the given migration 
	 * resource set for the given uri. If override is set to true, the 
	 * measurement model that is previously stored at the given uri will 
	 * be replaced. Make sure that the given measurement model fulfills 
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param measurementModelUri model uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see MeasurementModel
	 */
	public MeasurementModelBuilder(MigrationResourceSet resourceSet, String measurementModelUri, boolean override) {
		this(resourceSet, URI.createURI(adaptUri(measurementModelUri)), override);
	}
	
	/**
	 * Creates a new measurement model builder with the given migration 
	 * resource set for the given uri. If override is set to true, the 
	 * measurement model that is previously stored at the given uri will 
	 * be replaced. Make sure that the given measurement model fulfills 
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param measurementModelUri model uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see MeasurementModel
	 */
	public MeasurementModelBuilder(MigrationResourceSet resourceSet, URI measurementModelUri, boolean override) {
		super(resourceSet, null);
		if(override) 
			this.measurementModel = getResourceSet().createMeasurementModel(measurementModelUri, override);
		else
			this.measurementModel = getResourceSet().loadMeasurementModel(measurementModelUri, true);
		if(this.measurementModel == null)
			throw new IllegalArgumentException("No measurement model could be obtained for uri '" + measurementModelUri + "'.");
		this.model = measurementModel;
	}
	
	@Override
	protected PMLParser getParser() {
		return (PMLParser) super.getParser();
	}

	@Override
	protected Grammar getGrammar() {
		return getParser().getGrammarAccess().getGrammar();
	}
	
	@Override
	protected MeasurementModelSelector createSelector() {
		return new MeasurementModelSelector(getMeasurementModel());
	}
	
	@Override
	public MeasurementModelSelector getSelector() {
		return ObjectUtil.asClass(super.getSelector(), MeasurementModelSelector.class);
	}
	
	/**
	 * Returns the measurement model managed by this builder.
	 * @return measurement model
	 */
	public MeasurementModel getMeasurementModel() {
		return measurementModel;
	}
	
	/**
	 * Adds the given observation to the model managed by this builder.
	 * If the observation was previously stored in another model,
	 * it will be removed from that model.
	 * 
	 * @param observation observation to be added
	 * @return added observation
	 */
	public Observation addObservation(Observation observation) {
		getMeasurementModel().getObservations().add(observation);
		return observation;
	}
	
	/**
	 * Adds the given observation to the model managed by this builder.
	 * 
	 * @param toolName name of the tool
	 * @param dateTime date and time of the observation
	 * @param level level of observation
	 * @param type type of observation
	 * @return created and added observation
	 */
	public Observation addObservation(String toolName, Date dateTime, String level, String type) {
		return addObservation(MigrationFactory.createObservation(toolName, dateTime, level, type, null));
	}

	/**
	 * Adds the given observation to the model managed by this builder.
	 * 
	 * @param toolName name of the tool
	 * @param dateTime date and time of the observation
	 * @param level level of observation
	 * @param type type of observation
	 * @return created and added observation
	 */
	public Observation addObservation(String toolName, Date dateTime, String level, MeasurementType type) {
		return addObservation(MigrationFactory.createObservation(toolName, dateTime, level, type.toString(), null));
	}
	
	/**
	 * Adds the given observation to the model managed by this builder.
	 * 
	 * @param toolName name of the tool
	 * @param dateTime date and time of the observation
	 * @param level level of observation
	 * @return created and added observation
	 */
	public Observation addObservation(String toolName, Date dateTime, String level) {
		return addObservation(MigrationFactory.createObservation(toolName, dateTime, level, null, null));
	}
	
	/**
	 * Adds the given observation to the model managed by this builder.
	 * 
	 * @param toolName name of the tool
	 * @param dateTime date and time of the observation
	 * @return created and added observation
	 */
	public Observation addObservation(String toolName, Date dateTime) {
		return addObservation(toolName, dateTime, (String)null);
	}
	
	/**
	 * Adds the given observation to the model managed by this builder.
	 * The observations date will be set to the current date/time.
	 * 
	 * @param toolName name of the tool
	 * @return created and added observation
	 */
	public Observation addObservation(String toolName) {
		return addObservation(toolName, new Date(), (String)null);
	}

	/**
	 * Adds the given observation to the model managed by this builder.
	 * 
	 * @param toolName name of the tool
	 * @param dateTime date and time of the observation
	 * @param level level of observation
	 * @return created and added observation
	 */
	public Observation addObservation(String toolName, Date dateTime, ObservationLevel level) {
		return addObservation(toolName, dateTime, level.toString());
	}
	
	/**
	 * Adds the given observation to the model managed by this builder.
	 * The observations date will be set to the current date/time.
	 * 
	 * @param toolName name of the tool
	 * @param level level of observation
	 * @return created and added observation
	 */
	public Observation addObservation(String toolName, ObservationLevel level) {
		return addObservation(toolName, new Date(), level.toString());
	}
	
	/**
	 * Adds the given observation to the model managed by this builder.
	 * The observations date will be set to the current date/time.
	 * 
	 * @param toolName name of the tool
	 * @param level level of observation
	 * @param type type of observation
	 * @return created and added observation
	 */
	public Observation addObservation(String toolName, ObservationLevel level, MeasurementType type) {
		return addObservation(toolName, new Date(), level.toString(), type.toString());
	}
	
	/**
	 * Adds the given data point measurements to the given observation.
	 * 
	 * @param observation existing observation
	 * @param measurement data point measurement to be added
	 * @return added data point measurement
	 */
	public DataPointMeasurement addDataPoint(Observation observation, DataPointMeasurement measurement) {
		observation.getMeasurements().add(measurement);
		return measurement;
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workloadActivity workload activity in which the property has been
	 * measured
	 * @param workloadPattern workload pattern in which the property has been
	 * measurement
	 * @param confidence confidence with which the property has been measured 
	 * [0,1]
	 * @param value measured value
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */
	public DataPointMeasurement addDataPoint(Observation observation, String name, QuantitativeProperty property, NamedElement context, Activity workloadActivity, String workloadPattern, double confidence, ValueSpecification value, String info) {
		return addDataPoint(observation, MigrationFactory.createDataPointMeasurement(
				name, property, context, 
				MigrationFactory.createWorkload(workloadActivity, workloadPattern), 
				confidence, value, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workloadActivity workload activity in which the property has been
	 * measured
	 * @param workloadPattern workload pattern in which the property has been
	 * measurement
	 * @param value measured value
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */
	public DataPointMeasurement addDataPoint(Observation observation, String name, QuantitativeProperty property, NamedElement context, Activity workloadActivity, String workloadPattern, ValueSpecification value, String info) {
		return addDataPoint(observation, MigrationFactory.createDataPointMeasurement(
				name, property, context, 
				MigrationFactory.createWorkload(workloadActivity, workloadPattern), 
				null, value, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workload workload for which the property has been measured
	 * @param confidence confidence with which the property has been measured 
	 * [0,1]
	 * @param value measured value
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */
	public DataPointMeasurement addDataPoint(Observation observation, String name, QuantitativeProperty property, NamedElement context, Workload workload, double confidence, ValueSpecification value, String info) {
		return addDataPoint(observation, MigrationFactory.createDataPointMeasurement(
				name, property, context, 
				workload,
				confidence, value, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workload workload for which the property has been measured
	 * @param value measured value
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */
	public DataPointMeasurement addDataPoint(Observation observation, String name, QuantitativeProperty property, NamedElement context, Workload workload, String measureType, ValueSpecification value, String info) {
		return addDataPoint(observation, MigrationFactory.createDataPointMeasurement(
				name, property, context, 
				workload,
				null, value, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workload workload for which the property has been measured
	 * @param value measured value
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */
	public DataPointMeasurement addDataPoint(Observation observation, String name, QuantitativeProperty property, NamedElement context, Workload workload, ValueSpecification value, String info) {
		return addDataPoint(observation, MigrationFactory.createDataPointMeasurement(
				name, property, context, workload, 
				null, value, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workload workload for which the property has been measured
	 * @param value measured value
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */
	public DataPointMeasurement addDataPoint(Observation observation, String name, QuantitativeProperty property, NamedElement context, double confidence, ValueSpecification value, String info) {
		return addDataPoint(observation, MigrationFactory.createDataPointMeasurement(
				name, property, context, 
				null, confidence, value, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param value measured value
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */
	public DataPointMeasurement addDataPoint(Observation observation, String name, QuantitativeProperty property, NamedElement context, ValueSpecification value, String info) {
		return addDataPoint(observation, MigrationFactory.createDataPointMeasurement(
				name, property, context, 
				null, null, value, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param value measured value
	 * @return newly created and added measurement
	 */
	public DataPointMeasurement addDataPoint(Observation observation, String name, QuantitativeProperty property, NamedElement context, ValueSpecification value) {
		return addDataPoint(observation, MigrationFactory.createDataPointMeasurement(
				name, property, context, 
				null, null, value, null));
	}
	
	public BenchmarkMeasurement addBenchmark(Observation observation, BenchmarkMeasurement measurement) {
		observation.getMeasurements().add(measurement);
		return measurement;
	}
	
	public BenchmarkMeasurement addBenchmark(Observation observation, String name, QuantitativeProperty property, EnumerationLiteral provider, String service, String test, String workload, Double confidence, ValueSpecification value, String info) {
		return addBenchmark(observation, MigrationFactory.createBenchmarkMeasurement(name, property, provider, service, test, workload, confidence, value, info));
	}
	
	public BenchmarkMeasurement addBenchmark(Observation observation, String name, QuantitativeProperty property, EnumerationLiteral provider, String service, String test, String workload, ValueSpecification value, String info) {
		return addBenchmark(observation, MigrationFactory.createBenchmarkMeasurement(name, property, provider, service, test, workload, null, value, info));
	}
	
	public BenchmarkMeasurement addBenchmark(Observation observation, String name, QuantitativeProperty property, EnumerationLiteral provider, String service, String test, String workload, ValueSpecification value) {
		return addBenchmark(observation, MigrationFactory.createBenchmarkMeasurement(name, property, provider, service, test, workload, null, value, null));
	}
	
	public BenchmarkMeasurement addBenchmark(Observation observation, String name, QuantitativeProperty property, EnumerationLiteral provider, String test, String workload, ValueSpecification value) {
		return addBenchmark(observation, MigrationFactory.createBenchmarkMeasurement(name, property, provider, null, test, workload, null, value, null));
	}
	
	public BenchmarkMeasurement addBenchmark(Observation observation, String name, QuantitativeProperty property, EnumerationLiteral provider, ValueSpecification value) {
		return addBenchmark(observation, MigrationFactory.createBenchmarkMeasurement(name, property, provider, null, null, null, null, value, null));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param timeSeries time series measurement
	 * @return added time series measurement
	 */
	public TimeSeriesMeasurement addTimeSeries(Observation observation, TimeSeriesMeasurement timeSeries) {
		observation.getMeasurements().add(timeSeries);
		return timeSeries;
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @return newly created and added measurement
	 */
	public TimeSeriesMeasurement addTimeSeries(Observation observation, String name, QuantitativeProperty property, NamedElement context) {
		return addTimeSeries(observation, 
				MigrationFactory.createTimeSeriesMeasurement(
						name, property, context, null, null, null, null));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workload workload for which the property has been measured
	 * @return newly created and added measurement
	 */
	public TimeSeriesMeasurement addTimeSeries(Observation observation, String name, QuantitativeProperty property, NamedElement context, Workload workload) {
		return addTimeSeries(observation, 
				MigrationFactory.createTimeSeriesMeasurement(
						name, property, context, workload, null, null, null));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workload workload for which the property has been measured
	 * @param confidence confidence with which the property has been measured 
	 * [0,1]
	 * @return newly created and added measurement
	 */
	public TimeSeriesMeasurement addTimeSeries(Observation observation, String name, QuantitativeProperty property, NamedElement context, Workload workload, double confidence) {
		return addTimeSeries(observation, 
				MigrationFactory.createTimeSeriesMeasurement(
						name, property, context, workload, confidence, null, null));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workload workload for which the property has been measured
	 * @param confidence confidence with which the property has been measured 
	 * [0,1]
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */
	public TimeSeriesMeasurement addTimeSeries(Observation observation, String name, QuantitativeProperty property, NamedElement context, Workload workload, double confidence, String info) {
		return addTimeSeries(observation, 
				MigrationFactory.createTimeSeriesMeasurement(
						name, property, context, workload, confidence, null, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workload workload for which the property has been measured
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */	
	public TimeSeriesMeasurement addTimeSeries(Observation observation, String name, QuantitativeProperty property, NamedElement context, Workload workload, String info) {
		return addTimeSeries(observation, 
				MigrationFactory.createTimeSeriesMeasurement(
						name, property, context, workload, null, null, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workloadActivity workload activity in which the property has been
	 * measured
	 * @param workloadPattern workload pattern in which the property has been
	 * measurement
	 * @return newly created and added measurement
	 */
	public TimeSeriesMeasurement addTimeSeries(Observation observation, String name, QuantitativeProperty property, NamedElement context, Activity workloadActivity, String workloadPattern) {
		return addTimeSeries(observation, 
				MigrationFactory.createTimeSeriesMeasurement(
						name, property, context, MigrationFactory.createWorkload(workloadActivity, workloadPattern), null, null, null));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workloadActivity workload activity in which the property has been
	 * measured
	 * @param workloadPattern workload pattern in which the property has been
	 * measurement
	 * @param confidence confidence with which the property has been measured 
	 * [0,1]
	 * @return newly created and added measurement
	 */
	public TimeSeriesMeasurement addTimeSeries(Observation observation, String name, QuantitativeProperty property, NamedElement context, Activity workloadActivity, String workloadPattern, double confidence) {
		return addTimeSeries(observation, 
				MigrationFactory.createTimeSeriesMeasurement(
						name, property, context, MigrationFactory.createWorkload(workloadActivity, workloadPattern), confidence, null, null));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workloadActivity workload activity in which the property has been
	 * measured
	 * @param workloadPattern workload pattern in which the property has been
	 * measurement
	 * @param confidence confidence with which the property has been measured 
	 * [0,1]
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */
	public TimeSeriesMeasurement addTimeSeries(Observation observation, String name, QuantitativeProperty property, NamedElement context, Activity workloadActivity, String workloadPattern, double confidence, String info) {
		return addTimeSeries(observation, 
				MigrationFactory.createTimeSeriesMeasurement(
						name, property, context, MigrationFactory.createWorkload(workloadActivity, workloadPattern), confidence, null, info));
	}
	
	/**
	 * Adds the measurement defined by the given data to the given observation.
	 * 
	 * @param observation existing observation
	 * @param name name of the measurement, should be unique. A name can also
	 * be produced by a {@link MeasurementNameFactory} or 
	 * {@link #createMeasurementName(Observation)}.
	 * @param property measured property
	 * @param context context in which the property has been measured
	 * @param workloadActivity workload activity in which the property has been
	 * measured
	 * @param workloadPattern workload pattern in which the property has been
	 * measurement
	 * @param info additional information about the measurement
	 * @return newly created and added measurement
	 */	
	public TimeSeriesMeasurement addTimeSeries(Observation observation, String name, QuantitativeProperty property, NamedElement context, Activity workloadActivity, String workloadPattern, String info) {
		return addTimeSeries(observation, 
				MigrationFactory.createTimeSeriesMeasurement(
						name, property, context, MigrationFactory.createWorkload(workloadActivity, workloadPattern), null, null, info));
	}
	
	/**
	 * Add the given time-value pair to the given measurement.
	 * 
	 * @param measurement existing measurement
	 * @param value time-value pair to add
	 * @return added time-value pair
	 */
	public TimeValuePair addTimeValuePair(TimeSeriesMeasurement measurement, TimeValuePair value) {
		measurement.getValues().add(value);
		return value;
	}
	
	/**
	 * Add the given time-value pair to the given measurement.
	 * 
	 * @param measurement existing measurement
	 * @param dateTime time of the measurement
	 * @param value value of the measurement
	 * @return created and added time-value pair
	 */
	public TimeValuePair addTimeValuePair(TimeSeriesMeasurement measurement, Date dateTime, ValueSpecification value) {
		return addTimeValuePair(measurement, MigrationFactory.createTimeValuePair(dateTime, value));
	}
	
	/**
	 * Add the given time-value pair to the given measurement.
	 * 
	 * @param measurement existing measurement
	 * @param value value of the measurement
	 * @return created and added time-value pair
	 */
	public TimeValuePair addTimeValuePair(TimeSeriesMeasurement measurement, ValueSpecification value) {
		return addTimeValuePair(measurement, MigrationFactory.createTimeValuePair(new Date(), value));
	}
	
	/**
	 * Creates a new measurement name for the given observation using
	 * {@link MeasurementNameFactory#newName(Observation)}.
	 * 
	 * @param observation observation for which a name should be created
	 * @return new measurement name
	 */
	public String createMeasurementName(Observation observation) { 
		return MeasurementNameFactory.newName(observation);
	}
	
	/**
	 * Creates a new measurement name factory that creates unique measurement 
	 * names for observations based on the current time.
	 * 
	 * @author Martin Fleck
	 *
	 */
	public static class MeasurementNameFactory {
		/**
		 * Creates unique measurement names for observations based on the 
		 * current time.
		 * @param observation observation for which a name should be created
		 * @return new measurement name
		 */
		public static String newName(Observation observation) {
			return observation.getToolName() + "_" + 
					ARTISTDateTimeValueConverter.MILLISECONS_ID.format(new Date()) + "_" +
					String.format(Locale.ENGLISH, "%02d", observation.getMeasurements().size() + 1);
		}
	}
	
	/**
	 * Makes sure that the given uriString corresponds to a measurement model 
	 * uri.
	 * 
	 * @param uriString uri string
	 * @return uri string conforming to measurement models
	 */
	protected static String adaptUri(String uriString) {
		if(!FileExtensions.isMeasurementModel(uriString))
			return uriString + "." + FileExtensions.getMeasurementModelExtension();
		return uriString;
	}
}

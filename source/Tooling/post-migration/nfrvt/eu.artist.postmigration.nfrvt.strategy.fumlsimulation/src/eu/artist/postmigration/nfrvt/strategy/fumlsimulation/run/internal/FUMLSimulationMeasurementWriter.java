package eu.artist.postmigration.nfrvt.strategy.fumlsimulation.run.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Model;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.workload.ServiceCenter;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenario;

import scala.collection.immutable.Range;
import scala.collection.immutable.Range.Inclusive;
import at.ac.tuwien.big.simpleqn.Service;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet.SaveResult;
import eu.artist.postmigration.nfrvt.lang.util.builder.DateTimeHelper;
import eu.artist.postmigration.nfrvt.lang.util.builder.MeasurementModelBuilder;
import eu.artist.postmigration.nfrvt.lang.util.builder.MeasurementModelBuilder.MeasurementType;
import eu.artist.postmigration.nfrvt.lang.util.builder.MeasurementModelBuilder.ObservationLevel;
import eu.artist.postmigration.nfrvt.resources.MigrationLibraryResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.constants.ARTIST_NFPCatalogue;
import eu.artist.postmigration.nfrvt.resources.constants.MARTE_BasicNFPTypes;
import eu.artist.postmigration.nfrvt.resources.constants.MARTE_MeasurementUnits;

public class FUMLSimulationMeasurementWriter {
	private int timeStep;
	private WorkloadSimulation simulation;
	
	public FUMLSimulationMeasurementWriter(WorkloadSimulation simulation, int timeStep) {
		this.simulation = simulation;
		this.timeStep = timeStep;		
	}
	
	public int getTimeStep() {
		return timeStep;
	}
	
	public WorkloadSimulation getSimulation() {
		return simulation;
	}
	
	public SaveResult write(IPath modelURI) {
		return write(modelURI.toString());
	}
	
	protected void generateDatapoints(MeasurementModelBuilder builder, Observation observation) {
		Model model = getSimulation().getWorkload().getModelElement();
		
		String scenarioNames = "";
		String activityNames = "";
		String patternNames = "";
		String delimiter = "";
		for(WorkloadScenario scenario : getSimulation().getWorkload().getScenarios()) {
			scenarioNames += delimiter + scenario.getName();
			activityNames += delimiter + scenario.getScenarioUmlElement().getName();
			patternNames  += delimiter + scenario.getArrivalTimePattern(); 
			delimiter = " and ";
		}
		
		WorkloadScenario firstScenario = getSimulation().getWorkload().getScenarios().get(0);
		
		builder.addDataPoint(observation, 
				builder.createMeasurementName(observation), 
				ARTIST_NFPCatalogue.Element.THROUGHPUT,
				model, 
				(Activity)firstScenario.getScenarioUmlElement(),
				patternNames,
				builder.createValue(getSimulation().getQueuingNet().throughput()),
				"Combined for " + scenarioNames + " with activities " + activityNames + ".");
		
		builder.addDataPoint(observation, 
				builder.createMeasurementName(observation), 
				ARTIST_NFPCatalogue.Element.UTILIZATION,
				model, 
				(Activity)firstScenario.getScenarioUmlElement(),
				patternNames,
				builder.createValue(getSimulation().getQueuingNet().utilization()),
				"Combined for " + scenarioNames + " with activities " + activityNames + ".");
		
		for(WorkloadScenario scenario : getSimulation().getWorkload().getScenarios()) {
			String scenarioName = scenario.getName();
			
			ObjectSpecificationExpression avgResponseTimeValue = builder.createValue(MARTE_BasicNFPTypes.Element.NFP_DURATION);
			builder.addObjectPropertyValue(avgResponseTimeValue, "value", builder.createValue(getSimulation().getQueuingNet().averageResidenceTimeOfJobCategory(scenarioName)));
			builder.addObjectPropertyValue(avgResponseTimeValue, "unit", builder.createValue(MARTE_MeasurementUnits.Element.TIME_UNIT_KIND_LITERALS.MS));
			builder.addDataPoint(observation, 
					builder.createMeasurementName(observation), 
					ARTIST_NFPCatalogue.Element.AVERAGE_RESPONSE_TIME,
					(Activity)scenario.getScenarioUmlElement(), 
					(Activity)scenario.getScenarioUmlElement(),
					scenario.getArrivalTimePattern(),
					avgResponseTimeValue,
					"For " + scenarioName + " requests.");
			
			ObjectSpecificationExpression requestServiceTimeValue = builder.createValue(MARTE_BasicNFPTypes.Element.NFP_DURATION);
			builder.addObjectPropertyValue(requestServiceTimeValue, "value", builder.createValue(getSimulation().getQueuingNet().averageServiceTimeOfJobCategory(scenarioName)));
			builder.addObjectPropertyValue(requestServiceTimeValue, "unit", builder.createValue(MARTE_MeasurementUnits.Element.TIME_UNIT_KIND_LITERALS.MS));
			builder.addDataPoint(observation, 
					builder.createMeasurementName(observation), 
					ARTIST_NFPCatalogue.Element.REQUEST_SERVICE_TIME,
					(Activity)scenario.getScenarioUmlElement(), 
					(Activity)scenario.getScenarioUmlElement(),
					scenario.getArrivalTimePattern(),
					requestServiceTimeValue,
					"For " + scenarioName + " requests.");
			
			ObjectSpecificationExpression requestWaitingTimeValue = builder.createValue(MARTE_BasicNFPTypes.Element.NFP_DURATION);
			builder.addObjectPropertyValue(requestWaitingTimeValue, "value", builder.createValue(getSimulation().getQueuingNet().averageWaitingTimeOfJobCategory(scenarioName)));
			builder.addObjectPropertyValue(requestWaitingTimeValue, "unit", builder.createValue(MARTE_MeasurementUnits.Element.TIME_UNIT_KIND_LITERALS.MS));
			builder.addDataPoint(observation, 
					builder.createMeasurementName(observation), 
					ARTIST_NFPCatalogue.Element.REQUEST_WAITING_TIME,
					(Activity)scenario.getScenarioUmlElement(), 
					(Activity)scenario.getScenarioUmlElement(),
					scenario.getArrivalTimePattern(),
					requestWaitingTimeValue,
					"For " + scenarioName + " requests.");
		}
	}
	
	protected void generateTimeSeries(MeasurementModelBuilder builder, Observation observation) {		
		generateTimeSeriesNet(builder, observation);
		generateTimeSeriesServices(builder, observation);
	}
	
	protected void generateTimeSeriesServices(MeasurementModelBuilder builder, Observation observation) {
		WorkloadScenario scenario = getSimulation().getWorkload().getScenarios().get(0);
		Activity activity = (Activity) scenario.getScenarioUmlElement();
		
		Map<Service, TimeSeriesMeasurement> utilizationSeries = new HashMap<>();
		Map<Service, TimeSeriesMeasurement> throughputSeries = new HashMap<>();
		Map<Service, TimeSeriesMeasurement> avgQueueLengthSeries = new HashMap<>();

		for(ServiceCenter serviceCenter : getSimulation().getMarteToQNServices().keySet()) {
			Service service = getSimulation().getService(serviceCenter);
			utilizationSeries.put(service,
					builder.addTimeSeries(
							observation, 
							builder.createMeasurementName(observation), 
							ARTIST_NFPCatalogue.Element.UTILIZATION,
							serviceCenter.getUmlElement(),
							activity,
							scenario.getArrivalTimePattern()));
			throughputSeries.put(service,
					builder.addTimeSeries(
							observation, 
							builder.createMeasurementName(observation), 
							ARTIST_NFPCatalogue.Element.THROUGHPUT,
							serviceCenter.getUmlElement(),
							activity,
							scenario.getArrivalTimePattern()));
			avgQueueLengthSeries.put(service,
					builder.addTimeSeries(
							observation, 
							builder.createMeasurementName(observation), 
							ARTIST_NFPCatalogue.Element.AVERAGE_QUEUE_LENGTH,
							serviceCenter.getUmlElement(),
							activity,
							scenario.getArrivalTimePattern()));
			for(Service child : getSimulation().getServiceChildren(service)) {
				utilizationSeries.put(child,
						builder.addTimeSeries(
								observation, 
								builder.createMeasurementName(observation), 
								ARTIST_NFPCatalogue.Element.UTILIZATION,
								serviceCenter.getUmlElement(),
								activity,
								scenario.getArrivalTimePattern()));
				throughputSeries.put(child,
						builder.addTimeSeries(
								observation, 
								builder.createMeasurementName(observation), 
								ARTIST_NFPCatalogue.Element.THROUGHPUT,
								serviceCenter.getUmlElement(),
								activity,
								scenario.getArrivalTimePattern()));
				avgQueueLengthSeries.put(child,
						builder.addTimeSeries(
								observation, 
								builder.createMeasurementName(observation), 
								ARTIST_NFPCatalogue.Element.AVERAGE_QUEUE_LENGTH,
								serviceCenter.getUmlElement(),
								activity,
								scenario.getArrivalTimePattern()));
			}
		}
		
		DateTimeHelper dateHelper = builder.createDateTimeHelper(observation.getDateTime());
		
		for(int i = 0; i < getSimulation().getQueuingNet().completionTime(); i += getTimeStep()) {
			Range range = new Inclusive(0, i, getTimeStep());
			dateHelper.addMilliseconds(getTimeStep());
			
			for(Service service : getSimulation().getAllServices()) {
				ObjectSpecificationExpression utilizationValue = builder.createValue(MARTE_BasicNFPTypes.Element.NFP_PERCENTAGE);
				builder.addObjectPropertyValue(utilizationValue, "value", builder.createValue(service.utilization(range)));
				builder.addTimeValuePair(
						utilizationSeries.get(service),
						dateHelper.toDate(),
						utilizationValue);
				
				ObjectSpecificationExpression throughputValue = builder.createValue(MARTE_BasicNFPTypes.Element.NFP_DATA_TX_RATE);
				builder.addObjectPropertyValue(throughputValue, "value", builder.createValue(service.throughput(range)));
				builder.addObjectPropertyValue(throughputValue, "unit", builder.createValue(MARTE_MeasurementUnits.Element.DATA_TX_RATE_UNIT_KIND_LITERALS.KB_PER_S));
				builder.addTimeValuePair(
						throughputSeries.get(service),
						dateHelper.toDate(),
						throughputValue);
				
				builder.addTimeValuePair(
						avgQueueLengthSeries.get(service),
						dateHelper.toDate(),
						builder.createValue(service.avgQueueLength(range)));
			}
		}
		
	}
	
	protected void generateTimeSeriesNet(MeasurementModelBuilder builder, Observation observation) {
		Model model = getSimulation().getWorkload().getModelElement();
		WorkloadScenario scenario = getSimulation().getWorkload().getScenarios().get(0);
		Activity activity = (Activity) scenario.getScenarioUmlElement();
		
		TimeSeriesMeasurement throughputSeries = builder.addTimeSeries(observation, 
				builder.createMeasurementName(observation), 
				ARTIST_NFPCatalogue.Element.THROUGHPUT,
				model,
				activity,
				scenario.getArrivalTimePattern());
		
		TimeSeriesMeasurement utilizationSeries = builder.addTimeSeries(observation, 
				builder.createMeasurementName(observation), 
				ARTIST_NFPCatalogue.Element.UTILIZATION,
				model,
				activity,
				scenario.getArrivalTimePattern());
		
		TimeSeriesMeasurement busyTimeSeries = builder.addTimeSeries(observation, 
				builder.createMeasurementName(observation), 
				ARTIST_NFPCatalogue.Element.BUSY_TIME,
				model,
				activity,
				scenario.getArrivalTimePattern());
		
		DateTimeHelper dateHelper = builder.createDateTimeHelper(observation.getDateTime());
		
		for(int i = 0; i < getSimulation().getQueuingNet().completionTime(); i += getTimeStep()) {
			Range range = new Inclusive(0, i, getTimeStep());
			
			ObjectSpecificationExpression throughputValue = builder.createValue(MARTE_BasicNFPTypes.Element.NFP_DATA_TX_RATE);
			builder.addObjectPropertyValue(throughputValue, "value", builder.createValue(getSimulation().getQueuingNet().throughput(range)));
			builder.addObjectPropertyValue(throughputValue, "unit", builder.createValue(MARTE_MeasurementUnits.Element.DATA_TX_RATE_UNIT_KIND_LITERALS.KB_PER_S));
			builder.addTimeValuePair(
					throughputSeries, 
					dateHelper.addMilliseconds(getTimeStep()).toDate(), 
					throughputValue);
			
			ObjectSpecificationExpression utilizationValue = builder.createValue(MARTE_BasicNFPTypes.Element.NFP_PERCENTAGE);
			builder.addObjectPropertyValue(utilizationValue, "value", builder.createValue(getSimulation().getQueuingNet().utilization(range)));
			builder.addTimeValuePair(
					utilizationSeries, 
					dateHelper.toDate(), 
					utilizationValue);
			
			builder.addTimeValuePair(
					busyTimeSeries, 
					dateHelper.toDate(), 
					builder.createValue(getSimulation().getQueuingNet().busyTime(range)));
		}
	}
	
	public SaveResult write(String modelURI) {
		return write(modelURI, false);
	}
	
	public SaveResult write(String modelURI, boolean override) {
		MigrationResourceSet set = new MigrationResourceSet();
		MigrationLibraryResourcesUtil.init(set);
		
		MeasurementModelBuilder builder = new MeasurementModelBuilder(set, modelURI, override);
		Observation observation = builder.addObservation("fUML Simulation", ObservationLevel.Model, MeasurementType.Simulated);
		
		builder.addImportNamespace(MARTE_BasicNFPTypes.Element.PACKAGE);
		builder.addImportNamespace(MARTE_MeasurementUnits.Element.PACKAGE);
		builder.addImportNamespace(ARTIST_NFPCatalogue.Element.CATALOGUE);
		
		generateDatapoints(builder, observation);
		generateTimeSeries(builder, observation);
			
		return builder.save(modelURI);		
	}
}

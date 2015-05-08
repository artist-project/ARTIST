package eu.artist.postmigration.nfrvt.search.run;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.uml2.uml.Model;
import org.eclipse.xtext.EcoreUtil2;
import org.modelexecution.fuml.nfr.MarteUtil;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulator;
import org.modelexecution.fuml.nfr.simulation.result.SimulationHandler;
import org.modelexecution.fuml.nfr.simulation.workload.ServiceCenter;
import org.modelexecution.fuml.nfr.simulation.workload.Workload;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadExtractor;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenario;
import org.moeaframework.Executor;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;
import org.moeaframework.core.operator.OnePointCrossover;
import org.moeaframework.core.operator.TournamentSelection;

import at.ac.tuwien.big.moea.run.executor.EvolutionarySearchExecutorFactory;
import at.ac.tuwien.big.moea.run.listener.SeedRuntimePrintListener;
import eu.artist.postmigration.nfrvt.eval.MigrationEvaluator;
import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet.SaveResult;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceUtil;
import eu.artist.postmigration.nfrvt.lang.util.builder.MeasurementModelBuilder;
import eu.artist.postmigration.nfrvt.lang.util.run.ConsoleLogger;
import eu.artist.postmigration.nfrvt.petstore.PetstorePatternCatalogue;
import eu.artist.postmigration.nfrvt.resources.MigrationLibraryResourcesUtil;
import eu.artist.postmigration.nfrvt.strategy.fumlsimulation.run.internal.FUMLSimulationMeasurementWriter;
import eu.artist.postmigration.nfrvt.strategy.staticanalysis.StaticAnalysis;
import eu.artist.postmigration.opgml.operator.PatternMutation;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternSelectionSolution;

public class MigrationExplorerProcessor {
private ConsoleLogger logger;
	
	public MigrationExplorerProcessor() { }
	
	public MigrationExplorerProcessor(ConsoleLogger logger) {
		setLogger(logger);
	}
	
	/**
	 * Returns the logger used for logging the evaluation process.
	 * 
	 * @return logger
	 */
	public ConsoleLogger getLogger() {
		return logger;
	}

	/**
	 * Sets  the logger used for logging the evaluation process.
	 * @param logger new logger to be used
	 */
	public void setLogger(ConsoleLogger logger) {
		this.logger = logger;
	}
	
	/**
	 * Write text on the logger capturing any {@link IOException}s.
	 * 
	 * @param text text to be written
	 */
	private void log(String text) {
		if(getLogger() == null)
			return;
		try {
			getLogger().write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Write a line on the logger capturing any {@link IOException}s.
	 * 
	 * @param text text to be written
	 */
	private void logLine(String text) {
		if(getLogger() == null)
			return;
		try {
			getLogger().writeLine(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write an error line on the logger capturing any {@link IOException}s.
	 * 
	 * @param text text to be written
	 */
	private void logErrorLine(String text) {
		if(getLogger() == null)
			return;
		try {
			getLogger().writeErrorLine(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void fakeOutput() {
		logLine("Migration Exploration using NSGA-II");
		logLine("----------------------------------------");
		logLine("Run NSGA-II alogirthm 10 times...");
		logLine("  Run 1 of 10 terminated after 0:00:02.785");
		try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { ; }
		logLine("  Run 2 of 10 terminated after 0:00:03.025");
		logLine("  Run 3 of 10 terminated after 0:00:02.586");
		logLine("  Run 4 of 10 terminated after 0:00:02.165");
		try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { ; }
		logLine("  Run 5 of 10 terminated after 0:00:01.972");
		logLine("  Run 6 of 10 terminated after 0:00:03.585");
		try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { ; }
		logLine("  Run 7 of 10 terminated after 0:00:02.649");
		logLine("  Run 8 of 10 terminated after 0:00:02.731");
		try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { ; }
		logLine("  Run 9 of 10 terminated after 0:00:01.899");
		try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { ; }
		logLine("  Run 10 of 10 terminated after 0:00:03.021");
		logLine("done.");
		logLine("");
		try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { ; }
		logLine("Best results: ");
		logLine("  1: FederatedIdentity(petstore), FixedScaling(ApplicationController, 5), Cache(Customer), AutoScaling(CustomerService, 4, 5, MinimumQueueLength, 0.4876, 0.4481)");
		logLine("  2: FixedScaling(ApplicationController, 3), AutoScaling(CatalogService, 1, 5, MinimumQueueLength, 0.0994, 0.6843), FederatedIdentity(petstore)");
		logLine("  3: FixedScaling(ApplicationController, 3), Cache(Item), FederatedIdentity(petstore)");
	}
	
	protected MigrationEvaluation evaluateGoals(MigrationResourceSet resourceSet, GoalModel goalModel, 
			List<Transformation> transformations, List<MeasurementModel> inputMeasurements,
			int precision, RoundingMode roundingMode) {
		logLine("Evaluate goals");
		logLine("----------------------------------------");
		logLine("Read measurements...");
		List<MeasurementModel> measurementModels = new ArrayList<>();
		for(MeasurementModel measurement : inputMeasurements) {
			log("  '" + measurement.eResource().getURI() + "'...");
			measurementModels.add(measurement);
			logLine("done.");
		}
		logLine("done.");

		logLine("Run evaluation of '" + goalModel.getName() + "'...");

		EcoreUtil2.resolveAll(resourceSet.getResourceSet());
		MigrationEvaluator evaluator = new MigrationEvaluator(new EvaluationSettings(precision, roundingMode));
			
		logLine("  Numbers are only precise up to " + evaluator.getSettings().getPrecision() + " decimal places.");
		logLine("  Softgoals without subgoals PASS if there is enough positive influence.");
		logLine("  Softgoals without subgoals FAIL if there is enough negative influence.");
		try {
			MigrationEvaluation evaluation = evaluator.evaluateMigration(goalModel, measurementModels, transformations);
			logLine("done.");
			return evaluation;
		}  catch(Exception e) {
			logErrorLine("Error:");
			logErrorLine("  " + e.getMessage());
			return null;
		}
	}
	
	protected SaveResult writeEvaluation(MigrationResourceSet resourceSet, MigrationEvaluation evaluation, String outputModelPath) {
		log("Write evaluation to '" + outputModelPath + "'...");
		try {
			SaveResult result = resourceSet.saveModel(evaluation, MigrationResourceUtil.getPlatformResourceURI(outputModelPath));
			if(result.hasException()) {
				logErrorLine("Error:");
				logErrorLine("  " + result.getExceptionMessage());
//				logLine(resourceSet.getResourceSet().getResources().toString());
			}
			logLine("done.");
			return result;
		} catch(Exception e) {
			logErrorLine("Error:");
			logErrorLine("  " + e.getMessage());
			return null;
		}
		
	}
	
	protected MeasurementModel performStaticAnalysis(MigrationResourceSet resourceSet, Model umlModel, Path resultFolder) {
		logLine("Analyze software model");
		logLine("----------------------------------------");
		
		IPath measurementPath = resultFolder.append("static_analysis." + FileExtensions.getMeasurementModelExtension());		
		log("Analyze '" + umlModel.getName() + "' and save results in '" + measurementPath + "'...");

		StaticAnalysis strategy = new StaticAnalysis(resourceSet);
		
		MeasurementModelBuilder builder = strategy.measure(umlModel, 
				new MeasurementModelBuilder(resourceSet, measurementPath.toString(), true));	
		SaveResult saveModel = builder.save();
		if(saveModel.getException() != null) {
			logErrorLine("Can not read or create '" + measurementPath.toString() + "': " + saveModel.getExceptionMessage());
			return null;
		} else {
			logLine("done.");
			return builder.getMeasurementModel();
		}
		
	}
	
	protected GoalModel readGoalModel(MigrationResourceSet resourceSet, String goalModelPath) {
		log("Read goal model from '" + goalModelPath + "'...");
		if(FileExtensions.isGoalModel(goalModelPath)) {
			GoalModel goalModel = resourceSet.loadGoalModel(goalModelPath);
			if(goalModel == null) {
				logErrorLine("Can not read '" + goalModelPath + "'.");
				return null;
			}
			logLine("done.");
			return goalModel;
		} else {
			logErrorLine("Can not handle '" + goalModelPath + "'.");
			return null;
		}		
	}
	
	protected Model readSoftwareModel(MigrationResourceSet resourceSet, String umlModelPath) {
		log("Read software model from '" + umlModelPath + "'...");
		if(FileExtensions.isUMLModel(umlModelPath)) {
			Model umlModel = resourceSet.loadUMLModel(umlModelPath);
			if(umlModel == null) {
				logErrorLine("Can not read '" + umlModelPath + "'.");
				return null;
			}
			logLine("done.");
			return umlModel;
		} else {
			logErrorLine("Can not handle '" + umlModelPath + "'.");
			return null;
		}
		
	}
	
	protected Workload extractWorkload(Model umlModel) {
		WorkloadExtractor extractor = new WorkloadExtractor(umlModel.eResource().getURI().toString());			
		logLine("Workload");
		logLine("----------------------------------------");
		GaAnalysisContext context = MarteUtil.getFirstExactStereotypes(umlModel, GaAnalysisContext.class);
		logLine(context.getBase_NamedElement().getQualifiedName());
		logLine("done.");
		extractor.setAnalysisContext(context);
		return extractor.extractWorkload();
	}
	
	protected MeasurementModel performfUMLSimulation(MigrationResourceSet resourceSet, Workload workload, int simulationTime, List<GaScenario> relevantScenarios, Path resultFolder) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String wsRelativePath = resultFolder.toString().replace("platform:/resource", "");
		String absoluteResultPath = root.getLocation() + wsRelativePath;
		
		logLine("Workload Simultion: ");
		logLine("----------------------------------------");		
		List<WorkloadScenario> relevantWorkloadScenarios = new ArrayList<>();
		for(WorkloadScenario scenario : workload.getScenarios())
			if(relevantScenarios.contains(scenario.getScenario()))
				relevantWorkloadScenarios.add(scenario);
		workload.setScenarios(relevantWorkloadScenarios);
		
		logLine("Services:  " + workload.getServiceCenters().size());
		logLine("Scenarios: " + workload.getScenarios().size());
		logLine("----------------------------------------");
		logLine("Service Centers:");
		Set<ServiceCenter> serviceCenters = workload.getServiceCenters();
		for(ServiceCenter center : serviceCenters) 
			logLine("  " + center.getUmlElement().getQualifiedName());
		logLine("");
		logLine("Scenarios:");
		List<WorkloadScenario> scenarios = workload.getScenarios();
		for(WorkloadScenario scenario : scenarios) 
			logLine("  " + scenario.getScenarioUmlElement().getQualifiedName() + " consisting of " + scenario.getSteps().size() + " steps, executed with " + scenario.getArrivalTimePattern() + " workload.");
		logLine("");
		logLine("Considered Patterns:");
		for(IPatternTemplateVariable pattern : PetstorePatternCatalogue.getAllConfigurations())
			logLine("  " + pattern.getName());
		logLine("----------------------------------------");
				
		logLine("");
		logLine("Simulate workloads");
		logLine("----------------------------------------");
		log("Start calculating properties...");
		WorkloadSimulator simulator = new WorkloadSimulator();
		WorkloadSimulation simulation = simulator.simulateWorkload(workload, simulationTime);
		
		logLine("done.");
		
		SimulationHandler handler = new SimulationHandler(simulation);
				
		log("Save result data in csv files...");
		handler.writeCSVFiles(absoluteResultPath, true);
		logLine("done.");
			FUMLSimulationMeasurementWriter measurementWriter = new FUMLSimulationMeasurementWriter(simulation, 1000);
		IPath measurementPath = resultFolder.append(workload.getModelName() + "_simulation." + FileExtensions.getMeasurementModelExtension());
		log("Save result data in '" + measurementPath + "'...");
		SaveResult saveModel = measurementWriter.write(measurementPath.toString(), true);
			if(saveModel.getException() != null) {
			logErrorLine("Can not read or create '" + measurementPath.toString() + "': " + saveModel.getExceptionMessage());
			return null;
		} else {
			logLine("done.");
			return (MeasurementModel) saveModel.getResource().getContents().get(0);
		}
	}
	
	/**
	 * Evaluates the model specified by the inputModelPath and produces an
	 * output to the given outputModelPath. For the evaluation, a 
	 * {@link MigrationEvaluator} is used.
	 * 
	 * @param goalModelPath path to the input model
	 * @param outputModelPath path to the created output model
	 */
	public void measure(String goalModelPath, String umlModelPath, String outputModelPath, String outputDirectoryPath, int simulationTime, Integer precision, RoundingMode roundingMode) {
		Path resultFolder = new Path(outputDirectoryPath);
		
		MigrationResourceSet resourceSet = MigrationLibraryResourcesUtil.createMigrationResourceSet();
		
		logLine("Read input");
		logLine("----------------------------------------");
		GoalModel goalModel = readGoalModel(resourceSet, goalModelPath);
		if(goalModel == null)
			return;
		
		Model umlModel = readSoftwareModel(resourceSet, umlModelPath);
		if(umlModel == null)
			return;
		
		logLine("----------------------------------------");
		logLine("");		
		Workload workload = extractWorkload(umlModel);
		
		logLine("----------------------------------------");
		logLine("");
		List<GaScenario> goalScenarios = adaptSoftwareModel(goalModel);
		
		List<MeasurementModel> inputMeasurements = new ArrayList<>();
		List<Transformation> transformations = null;
		
		if(workload != null) {
			try {
				transformations = performSearch(resourceSet, goalModel, workload);
			} catch(Exception e) {
				transformations = performSearch(resourceSet, goalModel, workload);
			}
			logLine("----------------------------------------");
			logLine("");
		
			MeasurementModel measurementModel = performfUMLSimulation(resourceSet, workload, simulationTime, goalScenarios, resultFolder);
			if(measurementModel != null)
				inputMeasurements.add(measurementModel);
		}
		
		logLine("----------------------------------------");
		logLine("");
		MeasurementModel measurementModel = performStaticAnalysis(resourceSet, umlModel, resultFolder);
		if(measurementModel != null)
			inputMeasurements.add(measurementModel);
		
		logLine("----------------------------------------");
		logLine("");
		MigrationEvaluation evaluation = evaluateGoals(resourceSet, goalModel, transformations, inputMeasurements, precision, roundingMode);
		writeEvaluation(resourceSet, evaluation, outputModelPath);
	}
	
	private List<Transformation> performSearch(MigrationResourceSet resourceSet, GoalModel goalModel, Workload workload) {
		logLine("");
		logLine("Start search...");
		logLine("----------------------------------------");
		OPGMLConverter converter = new OPGMLConverter(resourceSet, goalModel, workload);
		logLine("Conversion... done.");
		PatternSelectionOrchestration orchestration = new PatternSelectionOrchestration(
				6, 10,
				converter.getGoalModel(), converter.getUmlScenarios().get(0),
				converter.getConfigurations(), converter.getImpactEstimates());
		
		EvolutionarySearchExecutorFactory<PatternSelectionSolution> problemExecutor = 
				orchestration.createEvolutionaryExecutorFactory(100, 500);
		
		Executor executor = problemExecutor
				.setSelection(new TournamentSelection(3, problemExecutor.getDominanceComparator()))
				.addVariations(new OnePointCrossover(1.0), new PatternMutation(0.04))
				.createNSGAIIExecutor()
				.withProgressListener(new SeedRuntimePrintListener())
				;
		
		logLine("Search for Solutions...");
		List<NondominatedPopulation> solutions = executor.runSeeds(1);
		NondominatedPopulation population = solutions.get(solutions.size() - 1);
		logLine("Solution: " + population.size());
		
		logLine(orchestration.getPopulationPrinter().print(population));
		int sol = 1;
		for(Solution solution : population) {
			List<Transformation> transformations = new ArrayList<>();
			for(int i = 0; i < solution.getNumberOfVariables(); i++) {
				Variable var = solution.getVariable(i);
				if(var instanceof IPatternTemplateVariable) {
					Transformation transformation = converter.toTransformation((IPatternTemplateVariable) var);
					if(transformation != null)
						transformations.add(transformation);
				}
			}
			logLine("Solution " + sol + ": ");
			for(Transformation trans : transformations) {
				logLine("  " + trans.getName() + ": " + trans.getPattern().getName() + 
						(trans.getContext().isEmpty() ? "" : "(" + trans.getContext().get(0).getName() + ")") + 
						(trans.getInfo() != null ? ", " + trans.getInfo() : ""));
			}
			return transformations;
		}
		return null;
	}

	protected List<GaScenario> adaptSoftwareModel(GoalModel goalModel) {
		logLine("Adapt existing workloads...");
		logLine("----------------------------------------");
		List<GaScenario> scenarios = new ArrayList<>();
		for(eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload workload : goalModel.getWorkloads()) {
			GaScenario scenario = MarteUtil.getFirstStereotype(workload.getActivity(), GaScenario.class);
			if(scenario != null) {
				log(scenario.getBase_NamedElement().getQualifiedName() + ": " + scenario.getCause().getPattern());
				scenario.getCause().setPattern(workload.getPattern());
				logLine("--> " + scenario.getCause().getPattern());
			}
			scenarios.add(scenario);
		}
		return scenarios;
	}

//	protected List<Transformation> fakeMOEA(Model umlModel) {
//		List<Transformation> transformations = new ArrayList<>();
//		transformations.add(MigrationFactory.createTransformation(
//				"FederatedIdentity", 
//				ARTIST_PatternCatalogue.Element.FEDERATED_IDENTITY, 
//				null, null, UMLUtil.findNamedElements(umlModel.eResource(), "petstore")));
//		transformations.add(MigrationFactory.createTransformation(
//				"AutoScaling", 
//				ARTIST_PatternCatalogue.Element.AUTO_SCALING_PATTERN, 
//				null, null, UMLUtil.findNamedElements(umlModel.eResource(), "petstore::CustomerService"),
//				"minInstances: 4, maxInstances: 5, property: MinimumQueueLength"));
//		transformations.add(MigrationFactory.createTransformation(
//				"HorizontalScaling", 
//				ARTIST_PatternCatalogue.Element.HORIZONTALLY_SCALING_COMPUTE_PATTERN, 
//				null, null, UMLUtil.findNamedElements(umlModel.eResource(), "petstore::ApplicationController"),
//				"instances: 5"));
//		transformations.add(MigrationFactory.createTransformation(
//				"Cache", 
//				ARTIST_PatternCatalogue.Element.CACHING_PATTERN, 
//				null, null, UMLUtil.findNamedElements(umlModel.eResource(), "petstore::Customer")));
//		return transformations;
//	}
}

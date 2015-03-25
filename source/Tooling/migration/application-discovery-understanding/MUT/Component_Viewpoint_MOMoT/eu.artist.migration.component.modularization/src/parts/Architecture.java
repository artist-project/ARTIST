package parts;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.Solution;
import org.moeaframework.core.operator.OnePointCrossover;
import org.moeaframework.core.operator.TournamentSelection;

import at.ac.tuwien.big.moea.run.executor.EvolutionarySearchExecutorFactory;
import at.ac.tuwien.big.moea.run.experiment.Experiment;
import at.ac.tuwien.big.moea.run.listener.SeedRuntimePrintListener;
import at.ac.tuwien.big.moea.util.CastUtil;
import at.ac.tuwien.big.moea.util.EcoreUtil;
import at.ac.tuwien.big.momot.MomotFactory;
import at.ac.tuwien.big.momot.MomotOrchestration;
import at.ac.tuwien.big.momot.operator.mutation.BlacklistMatchParameterMutation;
import at.ac.tuwien.big.momot.operator.mutation.MatchPlaceholderMutation;
import at.ac.tuwien.big.momot.rule.ParameterManager;
import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;
import at.ac.tuwien.big.momot.rule.parameter.increment.IncrementalStringValue;
import at.ac.tuwien.big.momot.rule.parameter.increment.IncrementalStringValue.StringMode;
import at.ac.tuwien.big.momot.rule.parameter.random.RandomListValue;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.solution.repair.MatchPlaceholderSolutionRepairer;

public class Architecture {
	private static final String RULES = "architecture.henshin";
	private static final String MODEL_DIRECTORY = "models/";
	private static final String OUTPUT_DIRECTORY = "output/";
	
	private static final String MM_FEATURE_CLASS = "Class";
	private static final String MM_FEATURE_CLASS_NAME = "name";
	
	private static final String RULE_CREATECLASS = "createClass";
	private static final String RULE_CREATECLASSDEPENDENCY = "createClassDependency";
	private static final String RULE_REASSIGNCLASS = "reassignClass";
	private static final String RULE_REMOVEASSIGNMENT = "removeAssignment";
	private static final String RULE_CREATECOMPONENT_COMPONENTNAME = "createComponent.componentName";
	private static final String RULE_ASSIGNCLASS_CLASSNAME = "assignClass.className";
	private static final String RULE_ASSIGNCLASS_COMPONENTNAME = "assignClass.componentName";
	
	
	public static MomotOrchestration createOrchestration(String initialModel) {
		MomotFactory factory = new MomotFactory(MODEL_DIRECTORY, RULES);
		EGraph graph = factory.loadGraph(initialModel);
		
		List<EObject> classes = graph.getDomain(factory.getEClass(MM_FEATURE_CLASS), false);
		List<String> classesNames = new ArrayList<>();
		for(EObject clazz : classes)
			classesNames.add(EcoreUtil.getFeatureValue(clazz, MM_FEATURE_CLASS_NAME, String.class));

		int maxComponents = classes.size(); // worst case: 1 class per feature
		maxComponents = (int) Math.ceil(maxComponents / 3.0);
		int maxTransformations = maxComponents + classes.size(); // worst case: create class + assign feature
				
		System.err.println("Class    = " + classesNames);
		System.err.println("|Classes| = " + classes.size());
		System.err.println("SolutionLength = " + maxTransformations + "\n");
		
		MomotOrchestration orchestration = new MomotOrchestration(factory, graph, maxTransformations);
			
		// use the fitness function for CRA problem
		orchestration.setFitnessFunction(new ArchitectureFitnessFunction(
				orchestration.getInitialGraph(), orchestration.getMatchHelper()));
		
		// replace non-executable matches with placeholders
		orchestration.getFitnessFunction().setSolutionRepairer(new MatchPlaceholderSolutionRepairer());
		
		// ignore rules that are only used to generate input models
		orchestration.getRuleManager().ignoreRules(
				RULE_CREATECLASS,
				RULE_CREATECLASSDEPENDENCY,
				RULE_REASSIGNCLASS,
				RULE_REMOVEASSIGNMENT);
			
		// specify parameters of interest (preserved in the solution sequence)
		orchestration.getParameterManager().preserveParameters(
				RULE_CREATECOMPONENT_COMPONENTNAME,
				RULE_ASSIGNCLASS_CLASSNAME,
				RULE_ASSIGNCLASS_COMPONENTNAME
		);

		
		// make sure that component names are unique
		IParameterValue<String> componentNamesValues = new RandomListValue<String>(
					new IncrementalStringValue("Component_", "a", "", StringMode.CAPITALIZED), 
					maxComponents);
		
		// set possible values for generation and mutation
		ParameterManager parameterManager = orchestration.getParameterManager();
		parameterManager.setParameterValue(RULE_CREATECOMPONENT_COMPONENTNAME, componentNamesValues);
		parameterManager.setParameterValue(RULE_ASSIGNCLASS_CLASSNAME, new RandomListValue<String>(classesNames));
		parameterManager.setParameterValue(RULE_ASSIGNCLASS_COMPONENTNAME, componentNamesValues);
		return orchestration;
	}
	
	public static void addEvolutionarySearch(MomotOrchestration orchestration, Experiment experiment) {
		EvolutionarySearchExecutorFactory<MatchSolution> evolutionaryExecutor = orchestration.createEvolutionaryExecutorFactory(
				100, 
				100,
				new TournamentSelection(2),
				new OnePointCrossover(1), 
				new MatchPlaceholderMutation(0.2),
				new BlacklistMatchParameterMutation(0.1, orchestration.getParameterManager())
					.addToBlacklist(RULE_CREATECOMPONENT_COMPONENTNAME));
		
		experiment.addExecutor("Random", evolutionaryExecutor.createRandomSearchExecutor());
		experiment.addExecutor("NSGA-II", evolutionaryExecutor.createNSGAIIExecutor());
		//experiment.addExecutor("NSGA-III", evolutionaryExecutor.createNSGAIIIExecutor(0, 4));
		experiment.addExecutor("EpsilonMOEA", evolutionaryExecutor.createEpsilonMOEAExecutor(0.05));
	}
	
	public static void saveSolutions(MomotOrchestration orchestration, NondominatedPopulation solutions, String inputModel) {
		String outputPrefix = getOutputModelPrefix(inputModel);
		
		for(Solution solution : solutions) {
			ArchitectureCalculationModel model = CastUtil.asClass(
					solution.getAttribute(ArchitectureFitnessFunction.ATTRIBUTE_CALCULATION_MODEL), 
					ArchitectureCalculationModel.class);
			
			if(model == null)
				continue;
			
			String outputFile = outputPrefix + model.getComponentNames().size() + ".xmi";
			try {
				orchestration.save(model.toEGraph(orchestration.getFactory()), outputFile);
				System.out.println(outputFile + ": ok");
			} catch(Exception e) {
				System.err.println(outputFile + ": " + e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	public static String getOutputModelPrefix(String inputModel) {
		String subDirectory = OUTPUT_DIRECTORY;
		String filePrefix = inputModel.substring(0, inputModel.length() - 4);
		try {
			subDirectory += filePrefix + "/";
			FileUtils.forceMkdir(new File(MODEL_DIRECTORY + subDirectory));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return subDirectory + filePrefix + "_cd";
	}
	
	public static String getReferenceFile(String inputModel) {
		String subDirectory = MODEL_DIRECTORY + OUTPUT_DIRECTORY;
		String filePrefix = inputModel.substring(0, inputModel.length() - 4);
		try {
			subDirectory += filePrefix + "/";
			FileUtils.forceMkdir(new File(subDirectory));
			FileUtils.cleanDirectory(new File(subDirectory));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return subDirectory + filePrefix + "_reference.csv";
	}
	
	public static void printReferenceSet(MomotOrchestration orchestration, String referenceFile) {
		System.out.println("------------------------------------");
		System.out.println("ReferenceSet" + orchestration.getFitnessFunction().getObjectiveNames() + "");
		System.out.println("------------------------------------");
		try {
			System.out.println(new String(Files.readAllBytes(Paths.get(referenceFile))));
		} catch (IOException e) {
			System.out.println("Error reading reference file: " + e.getMessage());
		}
	}
	
	
	public static void solveCRA(String inputModel, int algorithmRuns) {
		//JT: Everything related to fitness function, objectives, constraints... is within the class created here
		MomotOrchestration orchestration = createOrchestration(inputModel);		
		
		String referenceFile = getReferenceFile(inputModel);
		
		Experiment experiment = new Experiment()
			.useProgressListener(new SeedRuntimePrintListener())
			.saveReferenceFile(getReferenceFile(inputModel))
			.printLogging(true);
				
		addEvolutionarySearch(orchestration, experiment);
		
		experiment.run(algorithmRuns); // run each provided algorithm 5 times
		
		NondominatedPopulation solutions = experiment.getReferenceSet();
		System.out.println(orchestration.print(solutions));
		printReferenceSet(orchestration, referenceFile);
		
		saveSolutions(orchestration, solutions, inputModel);		
	}
	
	public static void main(String[] args) throws IOException {	
		solveCRA("ArchitectureModelNoComponents_10.xmi", 2);
	}
}

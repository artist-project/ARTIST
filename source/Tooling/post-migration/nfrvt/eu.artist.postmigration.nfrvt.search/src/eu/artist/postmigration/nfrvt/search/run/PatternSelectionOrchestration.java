package eu.artist.postmigration.nfrvt.search.run;

import at.ac.tuwien.big.moea.AbstractProblemOrchestration;
import at.ac.tuwien.big.moea.initialization.solution.IRandomSolutionGenerator;
import eu.artist.postmigration.opgml.fitness.analysis.ScenarioAnalysis;
import eu.artist.postmigration.opgml.gml.GoalModel;
import eu.artist.postmigration.opgml.gml.uml.UMLScenario;
import eu.artist.postmigration.opgml.initialization.PatternSelectionSolutionGenerator;
import eu.artist.postmigration.opgml.input.PatternImpactEstimates;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternSelectionSolution;

public class PatternSelectionOrchestration extends AbstractProblemOrchestration<PatternSelectionSolution>{

	private int nrRequests;
	private GoalModel goalModel;
	private UMLScenario scenario;
	private PatternImpactEstimates estimates;
	private IPatternTemplateVariable[] configurations;

	public PatternSelectionOrchestration(
			int nrVariables, int nrRequests, 
			GoalModel goalModel, UMLScenario scenario,
			IPatternTemplateVariable[] configurations,
			PatternImpactEstimates estimates) {
		super(PatternSelectionSolution.class, nrVariables);
		this.nrRequests = nrRequests;
		this.goalModel = goalModel;
		this.scenario = scenario;
		this.configurations = configurations;
		this.estimates = estimates;
		setFitnessFunction(new ExtendedGoalFitnessFunction(
				createAnalysis(getNrRequests()),
				getGoalModel()));
	}
	
	public GoalModel getGoalModel() {
		return goalModel;
	}
	
	public UMLScenario getScenario() {
		return scenario;
	}
	
	public PatternImpactEstimates getEstimates() {
		return estimates;
	}
	
	public int getNrRequests() {
		return nrRequests;
	}

	public IPatternTemplateVariable[] getConfigurations() {
		return configurations;
	}
	
	public ScenarioAnalysis createAnalysis(int nrRequests) {
		return new ScenarioAnalysis(
				getScenario(),
				getEstimates())
			.setNrRequests(nrRequests);
	}

	@Override
	protected IRandomSolutionGenerator<PatternSelectionSolution> createSolutionGenerator() {
		return new PatternSelectionSolutionGenerator(
				getNrVariables(), 
				getFitnessFunction().evaluatesNrObjectives(), 
				getFitnessFunction().evaluatesNrConstraints(), 
				getConfigurations());
	}

	public static void main(String[] args) {
		
	}
}

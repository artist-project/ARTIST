package eu.artist.postmigration.nfrvt.search.run;

import at.ac.tuwien.big.moea.fitness.dimension.AbstractFitnessDimension;
import eu.artist.postmigration.opgml.fitness.GoalAnalysisMultiFitnessFunction;
import eu.artist.postmigration.opgml.fitness.analysis.ScenarioAnalysis;
import eu.artist.postmigration.opgml.gml.GoalModel;
import eu.artist.postmigration.opgml.variable.FederatedIdentityTemplate;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternSelectionSolution;

public class ExtendedGoalFitnessFunction extends GoalAnalysisMultiFitnessFunction {
	public ExtendedGoalFitnessFunction(ScenarioAnalysis analysis, GoalModel goals) {
		super(analysis, goals);
	}

	@Override
	protected void initConstraintDimensions() {
		super.initConstraintDimensions();
		addConstraint(new AbstractFitnessDimension<PatternSelectionSolution>(PatternSelectionSolution.class, "SingleFederatedIdentity") {
			@Override
			public double evaluate(PatternSelectionSolution solution) {
				boolean exists = false;
				for(IPatternTemplateVariable config : solution.getNonEmptyConfigurations())
					if(config instanceof FederatedIdentityTemplate) {
						if(exists)
							return CONSTRAINT_VIOLATED;
						exists = true;
					}
				return CONSTRAINT_OK;
			}
		});
	}
	
	@Override
	protected void initObjectiveDimensions() {
		super.initObjectiveDimensions();
		addObjective(new AbstractFitnessDimension<PatternSelectionSolution>(
				PatternSelectionSolution.class, "Security") {
			@Override
			public double evaluate(PatternSelectionSolution solution) {
				int federatedIdentity = 0;
				for(IPatternTemplateVariable config : solution.getNonEmptyConfigurations())
					if(config instanceof FederatedIdentityTemplate) {
						federatedIdentity++;
					}
				return 0.2 - (federatedIdentity * 0.2);
			}
		});
		removeObjective("Cost");
	}
}

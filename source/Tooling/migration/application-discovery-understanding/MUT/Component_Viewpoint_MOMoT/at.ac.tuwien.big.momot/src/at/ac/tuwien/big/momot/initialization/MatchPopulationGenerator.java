package at.ac.tuwien.big.momot.initialization;

import at.ac.tuwien.big.moea.initialization.RandomPopulationGenerator;
import at.ac.tuwien.big.moea.initialization.solution.IRandomSolutionGenerator;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class MatchPopulationGenerator extends RandomPopulationGenerator<MatchSolution> {

	public MatchPopulationGenerator(int populationSize,
			IRandomSolutionGenerator<MatchSolution> solutionGenerator) {
		super(populationSize, solutionGenerator);
	}

}

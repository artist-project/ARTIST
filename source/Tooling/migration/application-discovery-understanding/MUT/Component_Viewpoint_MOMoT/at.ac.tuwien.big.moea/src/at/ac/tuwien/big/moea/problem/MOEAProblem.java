package at.ac.tuwien.big.moea.problem;

import org.moeaframework.core.Solution;
import org.moeaframework.problem.AbstractProblem;

import at.ac.tuwien.big.moea.fitness.IFitnessFunction;
import at.ac.tuwien.big.moea.initialization.solution.ISolutionGenerator;

public class MOEAProblem<S extends Solution> extends AbstractProblem implements IMOEAProblem<S> {
	
	private ISolutionGenerator<S> solutionGenerator;
	private IFitnessFunction<S> fitnessFunction;

	public MOEAProblem(IFitnessFunction<S> fitnessFunction, ISolutionGenerator<S> solutionGenerator) {
		super(solutionGenerator.getNrVariables(), solutionGenerator.getNrObjectives(), solutionGenerator.getNrConstraints());
		this.fitnessFunction = fitnessFunction;
		this.solutionGenerator = solutionGenerator;
	}

	public ISolutionGenerator<S> getSolutionGenerator() {
		return solutionGenerator;
	}

	public IFitnessFunction<S> getFitnessFunction() {
		return fitnessFunction;
	}

	@Override
	public void evaluate(Solution solution) {
		getFitnessFunction().doEvaluate(solution);
	}

	@Override
	public Solution newSolution() {
		return getSolutionGenerator().createNewSolution();
	}

}

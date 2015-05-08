package at.ac.tuwien.big.moea.operator;

import org.moeaframework.core.PRNG;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;

import at.ac.tuwien.big.moea.util.MathUtil;

public abstract class AbstractProbabilityVariation implements IProbabilityVariation {

	public static final double ALWAYS_EVOLVE = 1.0;
	public static final double NEVER_EVOLVE = 0.0;
	
	private double probability;
	
	public AbstractProbabilityVariation() {
		this(ALWAYS_EVOLVE);
	}
	
	public AbstractProbabilityVariation(double probability) {
		this.probability = probability;
	}
	
	public double getProbability() {
		return probability;
	}
	
	public AbstractProbabilityVariation setProbability(double probability) {
		this.probability = probability;
		return this;
	}
	
	public boolean shouldEvolve() {
		return PRNG.nextDouble() <= probability;
	}
	
	protected void checkArity(Solution[] parents) {
		if(parents == null || parents.length != getArity())
			throw new IllegalArgumentException(getArity() + " solutions must be supplied to this variation.");
	}
	
	@Override
	public Solution[] evolve(Solution[] parents) {
		checkArity(parents);	
		if(!shouldEvolve())
			return parents;
		
		return doEvolve(parents);
	}
	
	protected abstract Solution[] doEvolve(Solution[] parents);
	
	public static boolean shouldEvolve(double probability) {
		return PRNG.nextDouble() <= probability;
	}
	
	public static Variable getRandomVariable(Solution solution) {
		if(solution == null || solution.getNumberOfVariables() == 0)
			return null;
		
		return solution.getVariable(MathUtil.randomInteger(solution.getNumberOfVariables()));
	}
}

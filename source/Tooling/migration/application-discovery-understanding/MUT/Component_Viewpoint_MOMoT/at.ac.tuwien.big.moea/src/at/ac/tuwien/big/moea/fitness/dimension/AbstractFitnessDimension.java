package at.ac.tuwien.big.moea.fitness.dimension;

import org.moeaframework.core.Solution;

public abstract class AbstractFitnessDimension<T extends Solution> implements IFitnessDimension<T>, Comparable<IFitnessDimension<T>> {

	private Class<T> clazz;
	private String name;
	private FunctionType type;
	private double weight = 1.0;
	
	public AbstractFitnessDimension(Class<T> solutionClazz, String name, FunctionType type) {
		this.clazz = solutionClazz;
		this.name = name;
		this.type = type;
	}
	
	public AbstractFitnessDimension(Class<T> solutionClazz, String name) {
		this(solutionClazz, name, FunctionType.Minimum);
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public FunctionType getFunctionType() {
		return type;
	}
	
	@Override
	public boolean isMaximumFunction() {
		return FunctionType.Maximum == getFunctionType();
	}

	@Override
	public boolean isMinimumFunction() {
		return FunctionType.Minimum == getFunctionType();
	}
	
	@Override
	public double doEvaluate(Solution solution) {
		if(clazz.isInstance(solution)) {
			double result = evaluate(clazz.cast(solution));
			if(Double.isInfinite(result))
				return result;
			return getWeight() * result;
		}
		return WORST_FITNESS;
	}
	
	@Override
	public IFitnessDimension<T> setWeight(double weight) {
		this.weight = weight;
		return this;
	}
	
	@Override
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public int compareTo(IFitnessDimension<T> o) {
		return getName().compareTo(o.getName());
	}	
}

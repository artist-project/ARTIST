package at.ac.tuwien.big.moea.fitness.comparator;

import java.io.Serializable;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.util.CastUtil;

public class AttributeFitnessComparator<C extends Comparable<C> & Serializable, S extends Solution> extends AbstractFitnessComparator<C, S> {

	private String attributeName;
	private Class<C> comparableClass;

	public AttributeFitnessComparator(String attributeName, Class<C> comparableClass) {
		this.attributeName = attributeName;
		this.comparableClass = comparableClass;
	}
	
	public String getAttributeName() {
		return attributeName;
	}
	
	public Class<C> getComparableClass() {
		return comparableClass;
	}
	
	@Override
	public C getValue(S solution) {
		return CastUtil.asClass(solution.getAttribute(getAttributeName()), getComparableClass());
	}
}

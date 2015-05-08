package at.ac.tuwien.big.moea.algorithm.local;

import java.io.Serializable;
import java.util.Comparator;

import org.moeaframework.core.Solution;

public interface IFitnessComparator<C extends Comparable<C> & Serializable, S extends Solution> extends Comparator<S> {
	C getValue(S solution);
}

package at.ac.tuwien.big.moea.algorithm;

import org.moeaframework.core.Algorithm;

public interface IAlgorithmCreator<A extends Algorithm> {
	A newInstance();
}

package at.ac.tuwien.big.moea.run.executor;

import java.io.File;

import org.moeaframework.Analyzer;
import org.moeaframework.Instrumenter;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.problem.IMOEAProblem;

public interface IExecutorFactory<S extends Solution> {
	IMOEAProblem<S> getProblem();
	
	IExecutorFactory<S> setMaxEvaluations(int maxEvaluations);
	int getMaxEvaluations();
	
	File getReferenceSetFile();
	IExecutorFactory<S> setReferenceSetFile(String referenceSetFile);
	IExecutorFactory<S> setReferenceSetFile(File referenceSetFile);
	
	IExecutorFactory<S> setInstrumenter(Instrumenter instrumenter);
	Instrumenter getInstrumenter();
	
	Analyzer createAnalyzer();
}

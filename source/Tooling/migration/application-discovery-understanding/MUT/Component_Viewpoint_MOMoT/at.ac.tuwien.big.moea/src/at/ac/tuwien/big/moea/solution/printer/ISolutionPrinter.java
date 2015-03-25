package at.ac.tuwien.big.moea.solution.printer;

import org.moeaframework.core.Solution;

public interface ISolutionPrinter<S extends Solution> {
	ISolutionPrinter<S> addObjectiveName(int index, String name);
	ISolutionPrinter<S> addVariableName(int index, String name);
	ISolutionPrinter<S> addConstraintName(int index, String name);
	
	ISolutionPrinter<S> setObjectiveNames(Iterable<String> names);
	ISolutionPrinter<S> setVariableNames(Iterable<String> names);
	ISolutionPrinter<S> setConstraintNames(Iterable<String> names);
	
	public String getObjectiveName(int index);
	public String getVariableName(int index);
	public String getConstraintName(int index);
	
	public String getObjectiveData(S solution, int index);
	public String getVariableData(S solution, int index);
	public String getConstraintData(S solution, int index);
	
	boolean printVariables();
	boolean printObjectives();
	boolean printAttributes();
	boolean printConstraints();
	
	boolean printSummaries();
	
	String print(S solution);
}

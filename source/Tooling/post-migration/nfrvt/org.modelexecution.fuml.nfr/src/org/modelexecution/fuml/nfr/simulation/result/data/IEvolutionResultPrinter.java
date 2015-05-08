package org.modelexecution.fuml.nfr.simulation.result.data;

public interface IEvolutionResultPrinter  {
	void printPropertyHeaderLine(StringBuilder builder);
	void printPropertyEvolution(StringBuilder builder, int finalTime, int stepSize);
	void printPropertyValueLine(StringBuilder builder, int time, int stepSize);
}

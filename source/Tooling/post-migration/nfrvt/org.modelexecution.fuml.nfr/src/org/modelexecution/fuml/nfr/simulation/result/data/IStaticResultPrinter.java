package org.modelexecution.fuml.nfr.simulation.result.data;

import scala.collection.immutable.Range;

public interface IStaticResultPrinter {
	void printStatic(StringBuilder builer, Range range);
}

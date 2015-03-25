package at.ac.tuwien.big.moea.solution.printer;

import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.util.CastUtil;

public class PopulationPrinter<S extends Solution> implements IPopulationPrinter<S> {
	
	private ISolutionPrinter<S> solutionPrinter;
	private Class<S> solutionClazz;

	public PopulationPrinter(Class<S> solutionClazz, ISolutionPrinter<S> solutionPrinter) {
		this.solutionClazz = solutionClazz;
		this.solutionPrinter = solutionPrinter;		
	}

	public ISolutionPrinter<S> getSolutionPrinter() {
		return solutionPrinter;
	}

	@Override
	public String print(Population population) {
		String txt = "Population with " + population.size() + " solution(s):\n";
		int solutionNr = 1;
		for(Solution solution : population) {
			txt += "\n------------------\n";
			txt += "Solution " + solutionNr++ + "/" + population.size() + "\n";
			txt += "------------------\n";
			txt += getSolutionPrinter().print(CastUtil.asClass(solution, solutionClazz)) + "\n";
		}
		return txt;
	}
}
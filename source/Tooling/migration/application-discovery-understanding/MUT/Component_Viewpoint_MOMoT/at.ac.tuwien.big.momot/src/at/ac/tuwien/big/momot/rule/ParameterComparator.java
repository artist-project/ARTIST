package at.ac.tuwien.big.momot.rule;

import java.util.Comparator;

import org.eclipse.emf.henshin.model.Parameter;

public class ParameterComparator implements Comparator<Parameter> {

	@Override
	public int compare(Parameter p1, Parameter p2) {
		String p1QN = p1.getUnit().getName() + "::" + p1.getName();
		String p2QN = p2.getUnit().getName() + "::" + p2.getName();
		
		return p1QN.compareTo(p2QN);
	}

}

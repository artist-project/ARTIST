package at.ac.tuwien.big.momot.variable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;

import at.ac.tuwien.big.moea.util.CastUtil;

public class MatchVariable extends MatchImpl implements IMatchVariable {
	
	private static final long serialVersionUID = 2668791725840429124L;
	
	public MatchVariable(Rule rule) {
		this(rule, false);
	}

	public MatchVariable(Rule rule, boolean isResultMatch) {
		super(rule, isResultMatch);
	}

	public MatchVariable(Assignment assignment, boolean isResultMatch) {
//		super(assignment, isResultMatch);
		super((Rule)assignment.getUnit(), isResultMatch);
		copyParameterValues(assignment);
	}
	
	public MatchVariable(Assignment assignment) {
		super(assignment, assignment.isResult());
	}

	@Override
	public MatchVariable copy() {
		return new MatchVariable(this, isResult());
	}
	
	public void setParameterValue(String parameterName, Object value) {
		setParameterValue(getUnit().getParameter(parameterName), value);
	}
	
	public Object getParameterValue(String parameterName) {
		return getParameterValue(getUnit().getParameter(parameterName));
	}
	
	public <T> T getParameterValue(String parameterName, Class<T> resultClass) {
		return CastUtil.asClass(getParameterValue(parameterName), resultClass);
	}
	
	public Integer getParameterInteger(String parameterName) {
		return getParameterValue(parameterName, Integer.class);
	}

	@Override
	public int compareTo(IMatchVariable other) {
		int comparison = getRule().getName().compareTo(other.getUnit().getName());
		if(comparison != 0)
			return comparison;
		
		EList<Parameter> parameters = getRule().getParameters();
		for(Parameter parameter : parameters) {
			Object thisValue = getParameterValue(parameter);
			Object otherValue = other.getParameterValue(parameter);
			if(thisValue != null && otherValue != null)
				comparison = thisValue.toString().compareTo(otherValue.toString());
			else if(thisValue == null && otherValue != null)
				return 1;
			else if(thisValue != null && otherValue == null)
				return -1;
			
			if(comparison != 0)
				return comparison;
		}
		return 0;
	}
}

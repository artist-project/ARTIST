package at.ac.tuwien.big.momot.operator.mutation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.model.Parameter;

import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.momot.rule.ParameterManager;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.IMatchVariable;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;

public class MatchParameterMutation extends AbstractMatchSolutionMutation {

	private ParameterManager parameterManager;

	public MatchParameterMutation(ParameterManager parameterManager) {
		super();
		this.parameterManager = parameterManager;
	}
	
	public MatchParameterMutation(double probability, ParameterManager parameterManager) {
		super(probability);
		this.parameterManager = parameterManager;
	}
	
	public ParameterManager getParameterManager() {
		return parameterManager;
	}

	@Override
	protected MatchSolution mutate(MatchSolution mutant) {
		IMatchVariable randomMatch = CollectionUtil.getRandomElement(mutant.getMatchVariables());
		int nrTries = 0;
		while(randomMatch instanceof MatchPlaceholderVariable) {
			if(++nrTries == 3)
				return mutant;
			randomMatch = CollectionUtil.getRandomElement(mutant.getMatchVariables());
		}
		
		EList<Parameter> ruleParameters = randomMatch.getUnit().getParameters();
		for(Parameter parameter : ruleParameters) {
			Object value = randomMatch.getParameterValue(parameter);
			if(value != null) {
				Object paramValue = getParameterManager().nextParameterValue(parameter);
				if(paramValue != null) {
					randomMatch.setParameterValue(parameter, paramValue);
					break;
				}
			}
				
		}
		return mutant;
	}
}

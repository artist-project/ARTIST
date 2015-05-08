package at.ac.tuwien.big.momot.operator.mutation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.model.Parameter;

import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.momot.rule.ParameterManager;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.IMatchVariable;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;

public class BlacklistMatchParameterMutation extends AbstractMatchSolutionMutation {
	
	private ParameterManager parameterManager;
	private List<Parameter> blackList = new ArrayList<>();
	
	public BlacklistMatchParameterMutation(ParameterManager parameterManager) {
		super();
		this.parameterManager = parameterManager;
	}
	
	public BlacklistMatchParameterMutation(double probability, ParameterManager parameterManager) {
		super(probability);
		this.parameterManager = parameterManager;
	}
	
	public ParameterManager getParameterManager() {
		return parameterManager;
	}
	
	public BlacklistMatchParameterMutation addToBlacklist(String ruleName, String parameterName) {
		Parameter parameter = getParameterManager().getParameter(ruleName, parameterName);
		blackList.add(parameter);
		return this;
	}
	
	public BlacklistMatchParameterMutation addToBlacklist(String qualifiedParameterName) {
		Parameter parameter = getParameterManager().getParameter(qualifiedParameterName);
		blackList.add(parameter);
		return this;
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
			if(blackList.contains(parameter))
				continue;
			
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

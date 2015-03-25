package at.ac.tuwien.big.momot.rule;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;

import at.ac.tuwien.big.moea.util.CastUtil;
import at.ac.tuwien.big.moea.util.TextUtil;
import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;
import at.ac.tuwien.big.momot.rule.parameter.increment.IncrementalStringValue;
import at.ac.tuwien.big.momot.rule.parameter.random.RandomDoubleValue;
import at.ac.tuwien.big.momot.rule.parameter.random.RandomIntegerValue;

public class ParameterManager {
	private static Map<String, EList<Parameter>> cachedRuleParameters = new HashMap<>();
	
	private RuleManager ruleManager;
	private Map<String, Map<String, IParameterValue<?>>> ruleParameterValues = new HashMap<>();
	private Set<String> preservedParameters = new HashSet<>();
		
	public ParameterManager(RuleManager ruleManager) {
		this.ruleManager = ruleManager;		
	}
	
	public RuleManager getRuleManager() {
		return ruleManager;
	}
	
	protected List<Rule> getRules() {
		return getRuleManager().getRules();
	}
	
	protected Rule getRule(String name) {
		return getRuleManager().getRule(name);
	}
	
	protected Rule assertRule(String name) {
		return getRuleManager().assertRule(name);
	}
		
	public Parameter getParameter(String qualifiedParameterName) {
		String[] parts = TextUtil.assertSplit(qualifiedParameterName, 2);
		return getParameter(parts[0], parts[1]);
	}
	
	public Parameter getParameter(String ruleName, String parameterName) {
		return getParameter(getRule(ruleName), parameterName);
	}
	
	public Parameter getParameter(Rule rule, String parameterName) {
		if(rule == null)
			return null;
		return rule.getParameter(parameterName);
	}
	
	public Parameter assertParameter(String qualifiedParameterName) {
		Parameter parameter = getParameter(qualifiedParameterName);
		if(parameter == null)
			throw new IllegalArgumentException("No Parameter with name '" + qualifiedParameterName + "'.");
		return parameter;
	}
	
	public Parameter assertParameter(String ruleName, String parameterName) {
		Parameter parameter = getParameter(ruleName, parameterName);
		if(parameter == null)
			throw new IllegalArgumentException("No Parameter with name '" + ruleName + "." + parameterName + "'.");
		return parameter;
	}
	
	public ParameterManager setParameterValue(Parameter parameter, IParameterValue<?> value) {
		return setParameterValue(parameter.getUnit().getName(), parameter.getName(), value);
	}
	
	public ParameterManager setParameterValue(String qualifiedParameterName, IParameterValue<?> value) {
		String[] parts = TextUtil.assertSplit(qualifiedParameterName, 2);
		return setParameterValue(parts[0], parts[1], value);
	}
	
	public ParameterManager setParameterValue(String ruleName, String parameterName, IParameterValue<?> value) {
		assertRule(ruleName);
		if(!ruleParameterValues.containsKey(ruleName))
			ruleParameterValues.put(ruleName, new HashMap<String, IParameterValue<?>>());
		ruleParameterValues.get(ruleName).put(parameterName, value);
		preserveParameter(getQualifiedParameterName(ruleName, parameterName));
		return this;
	}
	
	public IParameterValue<?> getParameterValue(Parameter parameter) {
		return getParameterValue(parameter.getUnit().getName(), parameter.getName());
	}
	
	public IParameterValue<?> getParameterValue(String qualifiedParameterName) {
		String[] parts = TextUtil.assertSplit(qualifiedParameterName, 2);
		return getParameterValue(parts[0], parts[1]);
	}
	
	public IParameterValue<?> getParameterValue(String ruleName, String parameterName) {
		Map<String, IParameterValue<?>> values = ruleParameterValues.get(ruleName);
		if(values == null)
			return null;
		return values.get(parameterName);
	}
	
	public Object nextParameterValue(Parameter parameter) {
		IParameterValue<?> value = getParameterValue(parameter);
		if(value == null)
			return null;
		return value.nextValue();
	}
	
	public <T extends Object> T nextParameterValue(Parameter parameter, Class<T> parameterType) {
		return CastUtil.asClass(nextParameterValue(parameter), parameterType);
	}
	
	public Object nextParameterValue(String qualifiedParameterName) {
		IParameterValue<?> value = getParameterValue(qualifiedParameterName);
		if(value == null)
			return null;
		return value.nextValue();
	}
	
	public <T extends Object> T nextParameterValue(String qualifiedParameterName, Class<T> parameterType) {
		return CastUtil.asClass(nextParameterValue(qualifiedParameterName), parameterType);
	}
	
	public Object nextParameterValue(String ruleName, String parameterName) {
		IParameterValue<?> value = getParameterValue(ruleName, parameterName);
		if(value == null)
			return null;
		return value.nextValue();
	}
	
	public <T extends Object> T nextParameterValue(String ruleName, String parameterName, Class<T> parameterType) {
		return CastUtil.asClass(nextParameterValue(ruleName, parameterName), parameterType);
	}
	
	public ParameterManager preserveParameter(Parameter parameter) {
		preservedParameters.add(getQualifiedParameterName(parameter));
		return this;
	}
	
	public ParameterManager preserveParameter(String qualifiedParameterName) {
//		assertParameter(qualifiedParameterName);
		preservedParameters.add(qualifiedParameterName);
		return this;
	}
	
	public ParameterManager preserveParameter(String ruleName, String parameterName) {
//		assertParameter(ruleName, parameterName);
		preservedParameters.add(getQualifiedParameterName(ruleName, parameterName));
		return this;
	}
	
	public ParameterManager preserveParameters(String... qualifiedParameterNames) {
		for(String qualifiedParameterName : qualifiedParameterNames)
			preserveParameter(qualifiedParameterName);
		return this;
	}
	
	public Match populateMatch(Match match) {
		if(match == null || match.getRule() == null)
			return match;
		
		Map<String, IParameterValue<?>> parameterValues = ruleParameterValues.get(match.getRule().getName());
		if(parameterValues == null || parameterValues.isEmpty())
			return match; 
		
		for(Parameter parameter : getRuleParameters(match.getRule())) {
			IParameterValue<?> value = parameterValues.get(parameter.getName());
			if(value != null)
				match.setParameterValue(parameter, value.nextValue());
		}
		
		return match;
	}
	
	public Match cleanMatch(Assignment assignment) {
		return cleanMatch(CastUtil.asClass(assignment, Match.class));
	}
	
	public Match cleanMatch(Match match) {
		if(match == null || match.getRule() == null)
			return match;
		
		for(Parameter parameter : getRuleParameters(match.getRule())) {
			if(!preservedParameters.contains(getQualifiedParameterName(parameter)))
				match.setParameterValue(parameter, null);
		}
		
		return match;
	}
	
	public static EList<Parameter> getRuleParameters(Rule rule) {
		EList<Parameter> parameters = cachedRuleParameters.get(rule.getModule().getName() + rule.getName());
		if(parameters == null) {
			parameters = rule.getParameters();
			cachedRuleParameters.put(rule.getModule().getName() + rule.getName(), parameters);
		}
		return parameters;
	}
	
	public static String getQualifiedParameterName(String ruleName, String parameterName) {
		return ruleName + TextUtil.JAVA_DELIMITER + parameterName;
	}
	
	public static String getQualifiedParameterName(Parameter parameter) {
		return getQualifiedParameterName(parameter.getUnit().getName(), parameter.getName());
	}
	
	public static IParameterValue<?> getDefaultUserParameterValue(Parameter parameter) {
		Class<?> clazz = CastUtil.wrap(parameter.getType().getInstanceClass());
		
		if(clazz == Double.class)
			return new RandomDoubleValue();
		
		if(clazz == Integer.class)
			return new RandomIntegerValue();

		
		if(clazz == String.class)
			return new IncrementalStringValue();
		
		return null;
	}
}

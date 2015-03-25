package at.ac.tuwien.big.momot.engine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.script.ScriptEngine;

import org.eclipse.emf.henshin.interpreter.matching.conditions.AttributeCondition;
import org.eclipse.emf.henshin.interpreter.matching.conditions.ConditionHandler;

import at.ac.tuwien.big.momot.ocl.OCLScriptEngine;

/**
 * An extended version of the condition handler that checks which
 * protocol is handled by which {@link ScriptEngine}.
 * 
 * Otherwise the code has been copied from the original implementation of
 * {@link ConditionHandler}.
 */
public class MomotConditionHandler extends ConditionHandler {

	// Attribute conditions:
	final Collection<AttributeCondition> attributeConditions;
		
	// Involved conditions:
	final Map<String, Collection<AttributeCondition>> involvedConditions;
		
	// Assigned parameters:
	final Collection<String> assignedParameters;

	// Used script engine:
	final ScriptEngine defaultEngine;

	private Map<String, ScriptEngine> protocolScriptEngines;
	
	public MomotConditionHandler(Map<String, Collection<String>> conditionParameters, ScriptEngine defaultEngine,
			Map<String, ScriptEngine> protocolScriptEngines) {
		super(new TreeMap<String, Collection<String>>(), defaultEngine);
			
		this.attributeConditions = new ArrayList<AttributeCondition>();
		this.involvedConditions = new HashMap<String, Collection<AttributeCondition>>();
		this.assignedParameters = new HashSet<String>();
		this.defaultEngine = defaultEngine;
		this.protocolScriptEngines = protocolScriptEngines;

		for (String condition : conditionParameters.keySet()) {
			Collection<String> usedParameters = conditionParameters.get(condition);
			
			String attributeCondition = condition;
			ScriptEngine engine = defaultEngine;
			for(Entry<String, ScriptEngine> protocolEngine : protocolScriptEngines.entrySet()) {
				if(condition.startsWith(protocolEngine.getKey())) {
					attributeCondition = attributeCondition.substring(protocolEngine.getKey().length());
					usedParameters.add(OCLScriptEngine.CONTEXT_VARIABLE);
					
					engine = protocolEngine.getValue();
					break;
				}
			}
			AttributeCondition attCondition = new AttributeCondition(
					attributeCondition, usedParameters, engine);
			attributeConditions.add(attCondition);

			// Create a map for easy lookup of conditions a parameter is involved in:
			for (String usedParameter : usedParameters) {
				Collection<AttributeCondition> conditionList = involvedConditions.get(usedParameter);
				if (conditionList == null) {
					conditionList = new ArrayList<AttributeCondition>();
					involvedConditions.put(usedParameter, conditionList);
				}
				conditionList.add(attCondition);
			}
		}
	}
	
	/**
	 * Set the value for a parameter.
	 * @param paramName Parameter name.
	 * @param value Value.
	 * @return <code>true</code> if it was set.
	 */
	public boolean setParameter(String paramName, Object value) {
		boolean result = true;
		if (assignedParameters.add(paramName)) {
			defaultEngine.put(paramName, value);
			for(ScriptEngine engine : protocolScriptEngines.values())
				engine.put(paramName, value);
			Collection<AttributeCondition> conditionList = involvedConditions.get(paramName);
			if (conditionList != null) {
				for (AttributeCondition condition : conditionList) {
					condition.parameters.remove(paramName);
					result = result && condition.eval();
				}
			}
		}
		return result;
	}

	/**
	 * Unset a parameter value.
	 * @param paramName Parameter name.
	 */
	public void unsetParameter(String paramName) {
		if (assignedParameters.remove(paramName)) {
			Collection<AttributeCondition> conditionList = involvedConditions.get(paramName);
			if (conditionList != null) {
				for (AttributeCondition condition : involvedConditions.get(paramName)) {
					condition.parameters.add(paramName);
				}
			}
		}
	}

	/**
	 * Check whether a parameter is set.
	 * @param paramName Parameter name.
	 * @return <code>true</code> if it is set.
	 */
	public boolean isSet(String paramName) {
		return assignedParameters.contains(paramName);
	}

	/**
	 * Get the value for a parameter.
	 * @param paramName Name of the parameter.
	 * @return The value.
	 */
	public Object getParameter(String paramName) {
		return defaultEngine.get(paramName);
	}

	/**
	 * Get all parameter values.
	 * @return Map with all parameter values.
	 */
	public Map<String, Object> getParameterValues() {
		Map<String, Object> paramValues = new HashMap<String, Object>();
		for (String paramName : assignedParameters) {
			paramValues.put(paramName, defaultEngine.get(paramName));
		}
		return paramValues;
	}

}

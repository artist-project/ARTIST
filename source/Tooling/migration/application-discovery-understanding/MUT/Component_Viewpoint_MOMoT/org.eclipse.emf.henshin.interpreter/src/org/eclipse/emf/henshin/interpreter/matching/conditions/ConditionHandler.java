/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.matching.conditions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.script.ScriptEngine;

/**
 * Condition handler.
 * 
 * @author Enrico Biermann, Christian Krause
 */
public class ConditionHandler {
	
	// Attribute conditions:
	final Collection<AttributeCondition> attributeConditions;
	
	// Involved conditions:
	final Map<String, Collection<AttributeCondition>> involvedConditions;
	
	// Assigned parameters:
	final Collection<String> assignedParameters;

	// Used script engine:
	final ScriptEngine scriptEngine;

	/**
	 * Default constructor.
	 * @param conditionParameters Condition parameters.
	 * @param scriptEngine Script engine,
	 */
	public ConditionHandler(
			Map<String, Collection<String>> conditionParameters,
			ScriptEngine scriptEngine) {
		
		this.attributeConditions = new ArrayList<AttributeCondition>();
		this.involvedConditions = new HashMap<String, Collection<AttributeCondition>>();
		this.assignedParameters = new HashSet<String>();
		this.scriptEngine = scriptEngine;

		for (String condition : conditionParameters.keySet()) {
			Collection<String> usedParameters = conditionParameters.get(condition);
			AttributeCondition attCondition = new AttributeCondition(condition, usedParameters, scriptEngine);
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
			scriptEngine.put(paramName, value);
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
		return scriptEngine.get(paramName);
	}

	/**
	 * Get all parameter values.
	 * @return Map with all parameter values.
	 */
	public Map<String, Object> getParameterValues() {
		Map<String, Object> paramValues = new HashMap<String, Object>();
		for (String paramName : assignedParameters) {
			paramValues.put(paramName, scriptEngine.get(paramName));
		}
		return paramValues;
	}
}

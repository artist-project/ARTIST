package at.ac.tuwien.big.momot.rule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;

import at.ac.tuwien.big.moea.util.TextUtil;

public class RuleManager {
	private Module module;
	private List<Rule> rules = new ArrayList<>();
	private Map<String, Rule> nameToRules = new HashMap<>();
	
	public RuleManager(Module module) {
		this.module = module;
		initRules();
	}
	
	private void initRules() {
		for(Unit unit : module.getUnits())
			if(unit instanceof Rule) {
				rules.add((Rule)unit);
				nameToRules.put(unit.getName(), (Rule)unit);
			}
	}
	
	public RuleManager ignoreRules(String... names) {
		for(String name : names)
			ignoreRule(getRule(name));
		return this;
	}
	
	public Rule ignoreRule(String name) {
		return ignoreRule(getRule(name));
	}
	
	public Rule ignoreRule(Rule rule) {
		if(rule != null) {
			this.rules.remove(rule);
			this.nameToRules.remove(rule.getName());
		}
		return rule;
	}
	
	public RuleManager addRules(String... names) {
		for(String name : names)
			addRule(getRule(name));
		return this;
	}
	
	public Rule addRule(String name) {
		return addRule(getRule(name));
	}
	
	public Rule addRule(Rule rule) {
		if(rule != null && rule.getModule().equals(this.module) && !this.nameToRules.containsKey(rule)) {
			this.rules.add(rule);
			this.nameToRules.put(rule.getName(), rule);
			return rule;
		}
		return null;
	}
	
	public List<Rule> getRules() {
		return Collections.unmodifiableList(rules);
	}
	
	public void resetRules() {
		initRules();
	}
	
	public List<Rule> getSubRules(String ruleName) {
		return getSubRules(ruleName, false);
	}
	
	public List<Rule> getSubRules(String ruleName, boolean deep) {
		Rule rule = getRule(ruleName);
		if(rule == null)
			return new ArrayList<>();
		if(!deep)
			return rule.getMultiRules();
		else
			return rule.getAllMultiRules();
	}
	
	public Rule getSubRule(String qualifiedSubRuleName) {
		String[] parts = TextUtil.assertSplit(qualifiedSubRuleName, 2, "Qualified sub rule name must contain both the rule name and sub rule name.");
		return getSubRule(parts[0], parts[1]);		
	}
	
	public Rule getSubRule(String ruleName, String subRuleName) {
		Rule rule = getRule(ruleName);
		if(rule == null)
			return null;
		return rule.getMultiRule(subRuleName);
	}
	
	public Rule getRule(String name) {
		return nameToRules.get(name);
	}
	
	public Rule assertRule(String name, String errorMsg) {
		Rule rule = getRule(name);
		if(rule == null)
			throw new IllegalArgumentException(errorMsg);
		return rule;
	}
	
	public Rule assertRule(String name) {
		return assertRule(name, "No (not-ignored) rule with name '" + name + "' found in module '" + module.getName() + "'.");
	}

	public Module getModule() {
		return this.module;
	}
}

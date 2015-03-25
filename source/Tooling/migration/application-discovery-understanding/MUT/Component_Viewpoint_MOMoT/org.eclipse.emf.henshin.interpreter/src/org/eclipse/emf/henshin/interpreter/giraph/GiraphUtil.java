package org.eclipse.emf.henshin.interpreter.giraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;

public class GiraphUtil {

	public static String getInstanceCode(Rule rule) throws Exception {
		StringBuffer json = new StringBuffer();
		List<ENamedElement> types = new ArrayList<ENamedElement>(getTypeConstants(rule.getModule()).keySet());
		for (int i=0; i<rule.getLhs().getNodes().size(); i++) {
			Node n = rule.getLhs().getNodes().get(i);
			json.append("[[" + i + "]," + types.indexOf(n.getType()) + ",[");
			for (int j=0; j<n.getOutgoing().size(); j++) {
				Edge e = n.getOutgoing().get(j);
				int trg = rule.getLhs().getNodes().indexOf(e.getTarget());
				json.append("[[" + trg + "]," + types.indexOf(e.getType()) + "]");
				if (j<n.getOutgoing().size()-1) json.append(",");
			}
			json.append("]]\n");
		}
		return json.toString();
	}

	public static Map<Unit,String> getUnitConstants(Unit mainUnit) {
		EList<Unit> units = mainUnit.getSubUnits(true);
		units.add(0, mainUnit);
		Map<Unit,String> unitConstants = new LinkedHashMap<Unit, String>();
		for (Unit unit : units) {
			String name = (unit instanceof Rule ? "RULE" : "UNIT") + "_" + camelCase2Upper(unit.getName());
			unitConstants.put(unit, name);
		}
		return unitConstants;
	}

	public static Map<ENamedElement,String> getTypeConstants(Module module) {

		// Check if we need the package name:
		boolean needPackage = false;
		Set<String> classNames = new HashSet<String>();
		for (EPackage pack : module.getImports()) {
			for (EClassifier classifier : pack.getEClassifiers()) {
				if (classifier instanceof EClass) {
					if (classNames.contains(classifier.getName())) {
						needPackage = true;
						break;
					}
					classNames.add(classifier.getName());
				}
			}
		}

		// Generate the names:
		Map<ENamedElement,String> typeConstants = new LinkedHashMap<ENamedElement, String>();
		for (EPackage pack : module.getImports()) {
			for (EClassifier classifier : pack.getEClassifiers()) {
				if (!(classifier instanceof EClass)) {
					continue;
				}
				String name = "TYPE_";
				if (needPackage) {
					name = name + camelCase2Upper(pack.getName()) + "_";
				}
				name = name + camelCase2Upper(classifier.getName());
				typeConstants.put(classifier, name);
				for (EReference ref : ((EClass) classifier).getEReferences()) {
					typeConstants.put(ref, name + "_" + camelCase2Upper(ref.getName()));
				}
			}
		}		
		return typeConstants;

	}

	public static Collection<Rule> collectRules(Unit unit) {
		Set<Rule> rules = new LinkedHashSet<Rule>();
		if (unit instanceof Rule) {
			rules.add((Rule) unit);
		}
		for (Unit subUnit : unit.getSubUnits(true)) {
			if (subUnit instanceof Rule) {
				rules.add((Rule) subUnit);
			}
		}
		return rules;
	}

	public static String getNodeName(Node node) {
		return node.getName()!=null && node.getName().trim().length()>0 ? 
				"\""+node.getName()+"\"" : 
					"" + node.getGraph().getNodes().indexOf(node);
	}

	private static String camelCase2Upper(String s) {
		String r = "";
		boolean u = false;
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			char C = Character.toUpperCase(c);
			if (Character.isUpperCase(c)) {
				r = r + (u ? ("_"+C) : C);
			} else {
				u = true;
				r = r + C;
			}
		}
		return r;
	}

	public static Map<Rule,GiraphRuleData> generateRuleData(Unit mainUnit) throws Exception {
		Map<Rule,GiraphRuleData> data = new LinkedHashMap<Rule,GiraphRuleData>();
		for (Rule rule : collectRules(mainUnit)) {
			data.put(rule, new GiraphRuleData(rule));
		}
		return data;
	}
	
	public static List<EClass> getValidTypes(Node node, Module module) {
		Set<ENamedElement> allTypes = getTypeConstants(module).keySet();
		List<EClass> types = new ArrayList<EClass>();
		for (ENamedElement type : allTypes) {
			if (type instanceof EClass) {
				if (type==node.getType() || ((EClass) type).getEAllSuperTypes().contains(node.getType())) {
					types.add((EClass) type);
				}
			}
		}
		return types;
	}
	
}
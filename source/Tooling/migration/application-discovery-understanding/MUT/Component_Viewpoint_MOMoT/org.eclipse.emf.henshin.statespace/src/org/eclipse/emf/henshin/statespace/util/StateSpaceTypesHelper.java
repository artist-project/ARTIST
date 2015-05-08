package org.eclipse.emf.henshin.statespace.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.StateSpace;

/**
 * Helper methods for gathering information about types in state spaces.
 * @author Christian Krause
 */
public class StateSpaceTypesHelper {

	/**
	 * Get a list of all known types in a state space.
	 * @param stateSpace State space.
	 */
	public static List<EClass> getTypes(StateSpace stateSpace) {
		List<EClass> types = new ArrayList<EClass>();
		for (Rule rule : stateSpace.getRules()) {
			for (EPackage pack : rule.getModule().getImports()) {
				for (EClassifier type : pack.getEClassifiers()) {
					if (type instanceof EClass && !types.contains(type)) {
						types.add((EClass) type);
					}
				}
			}
		}
		return types;
	}

	/**
	 * Get a map that associated names to types in a state space.
	 * @param stateSpace State space.
	 */
	public static Map<String,EClass> getTypesNameMap(StateSpace stateSpace) {
		Map<String,EClass> typesMap = new LinkedHashMap<String,EClass>();
		for (EClass type : getTypes(stateSpace)) {
			typesMap.put(type.getName(), (EClass) type);
		}
		return typesMap;
	}

	/**
	 * Gather all known attribute types in a state space.
	 * @param stateSpace State space.
	 */
	public static Map<String,EAttribute> getAttributesNameMap(StateSpace stateSpace) {
		Map<String,EAttribute> attributes = new LinkedHashMap<String,EAttribute>();
		for (EClass type : getTypes(stateSpace)) {
			for (EAttribute att : type.getEAllAttributes()) {
				attributes.put(type.getName() + "." + att.getName(), att);
			}
		}
		return attributes;
	}
	
}

/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.tests.basic;

import static org.junit.Assert.*;

import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.GraphElement;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.model.util.HenshinModelCleaner;
import org.eclipse.emf.henshin.tests.framework.HenshinTest;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for setting actions.
 * 
 * @author Christian Krause
 */
public class ActionTest extends HenshinTest {

	// Rules to test:
	private List<Rule> rules;

	@Before
	public void loadRules() {

		// Load rules:
		List<File> files = findHenshinFiles(new File("basic/rules"));
		assertFalse("No Henshin files found", files.isEmpty());
		HenshinResourceSet resourceSet = new HenshinResourceSet();
		rules = new ArrayList<Rule>();
		for (File file : files) {
			Module system = resourceSet.getModule(file.getAbsolutePath(), false);
			for (Unit unit : system.getUnits()) {
				if (unit instanceof Rule) {
					Rule rule = (Rule) unit;
					HenshinModelCleaner.cleanRule(rule);
					rules.add(rule);
				}
			}
		}

	}

	@Test
	public void setNodeActions() {
		String[] actions = new String[] { "create", "delete" };
		doSetActionsTest(HenshinPackage.eINSTANCE.getNode(), actions);
	}

	@Test
	public void setEdgeActions() {
		// doSetActionsTest(HenshinPackage.eINSTANCE.getEdge());
	}

	@Test
	public void setAttributeActions() {
		// doSetActionsTest(HenshinPackage.eINSTANCE.getAttribute());
	}

	private void doSetActionsTest(EClass elementType, String... actionStrings) {

		// Parse the actions:
		List<Action> actions = new ArrayList<Action>();
		for (String action : actionStrings) {
			try {
				actions.add(Action.parse(action));
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		}

		// Check all rules:
		for (Rule rule : rules) {

			System.out.println("Testing " + elementType.getName().toLowerCase() + " actions for rule "
					+ rule.eResource().getURI().lastSegment() + ":" + rule.getName() + "...");

			// Set actions for all action elements:
			for (GraphElement element : getActionElements(rule, elementType)) {
				element = copyRule(element);
				for (Action action1 : actions) {
					setAction(element, action1);
					for (Action action2 : actions) {
						GraphElement copiedElement = copyRule(element);
						setAction(copiedElement, action2);
						setAction(copiedElement, action1);
					}
				}
			}
		}
	}

	/*
	 * Get the action elements in a rule.
	 */
	private List<? extends GraphElement> getActionElements(Rule rule, EClass elementType) {
		List<GraphElement> result = new ArrayList<GraphElement>();
		if (elementType == null || elementType == HenshinPackage.eINSTANCE.getNode()) {
			result.addAll((List<? extends GraphElement>) rule.getActionNodes(null));
		}
		if (elementType == null || elementType == HenshinPackage.eINSTANCE.getEdge()) {
			result.addAll((List<? extends GraphElement>) rule.getActionEdges(null));
		}
		if (elementType == null || elementType == HenshinPackage.eINSTANCE.getAttribute()) {
			List<Node> nodes = rule.getActionNodes(null);
			for (Node node : nodes) {
				result.addAll((List<? extends GraphElement>) node.getActionAttributes(null));
			}
		}
		return result;
	}

	/*
	 * Set an element action and check if it went well.
	 */
	private void setAction(GraphElement element, Action action) {

		Rule rule = element.getGraph().getRule();

		// Get all action elements before setting the action:
		List<? extends GraphElement> elems1 = getActionElements(rule, null);

		// Get the actions of all other nodes:
		Map<Node, Action> actions1 = new HashMap<Node, Action>();
		for (Node node : rule.getActionNodes(null)) {
			if (node != element) {
				actions1.put(node, node.getAction());
			}
		}

		// Now set the action!!!
		element.setAction(action);

		// Check whether we now have the correct new action:
		if (!action.equals(element.getAction())) {
			fail("Error setting action " + action + " for " + element + " (got action " + element.getAction() + ")");
		}

		// Get all action elements again:
		List<? extends GraphElement> elems2 = getActionElements(rule, null);

		// The action elements should not have changed:
		if (elems1.size() != elems2.size() || !elems1.containsAll(elems2)) {
			// fail("Action elements are not the same after setting action of " + element + " to " + action);
		}

		// Check whether the actions of all other nodes stayed the same:
		for (Entry<Node, Action> entry : actions1.entrySet()) {
			if (!entry.getValue().equals(entry.getKey().getAction())) {
				// fail("Action for independent " + element + " changed from " + entry.getValue() + " to " +
				// element.getAction());
			}
		}

	}

	/*
	 * Copy a rule and return the copy of an element in it.
	 */
	private GraphElement copyRule(GraphElement element) {
		Copier copier = new Copier();
		copier.copy(element.getGraph().getRule());
		copier.copyReferences();
		return (GraphElement) copier.get(element);
	}

}

/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.menuContributors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
/**
 * 
 * Contributes the dynamic creation of paths over the imported packages. 
 * 
 * @author Gregor Bonifer
 *
 */
public class CreateDynamicMC extends MenuContributor {
	
	public static MenuContributor INSTANCE = new CreateDynamicMC();
	
	Graph graph;
	
	Map<EClass, Integer> counts = new HashMap<EClass, Integer>();
	
	@Override
	protected void contributeActions(IMenuManager menuManager, List<?> selection) {
		
		if (selection.size() != 1)
			return;
		
		counts.clear();
		
		if (selection.get(0) instanceof Node) {
			final Node node = (Node) selection.get(0);
			if (node.getType() == null || node.getGraph() == null)
				return;
			graph = node.getGraph();
			menuManager.add(new DynamicReferenceMenu("Create Path ..", node.getType(),
					new NodeCommand() {
						Node getNode() {
							return node;
						}
					}));
		} else if (selection.get(0) instanceof Graph) {
			graph = (Graph) selection.get(0);
			menuManager.add(new DynamicPackageSelectionMenu("Create Path .."));
		}
	}
	
	protected Action DUMMY_ACTION = new Action("dummy") {
	};
	
	protected Collection<Node> findNodesForTypes(EClass eClass) {
		Collection<Node> result = new HashSet<Node>();
		for (Node node : graph.getNodes()) {
			if (node.getType() != null
					&& (eClass.isSuperTypeOf(node.getType()) || (eClass.getName().equals("EObject"))))
				result.add(node);
		}
		return result;
	}
	
	protected Collection<EClass> findSubTypes(EClass superClass) {
		Collection<EClass> result = new ArrayList<EClass>();
		for (EPackage pack : graph.getRule().getModule().getImports()) {
			for (EClassifier eClassifier : pack.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (superClass.isSuperTypeOf(eClass))
						result.add(eClass);
				}
			}
		}
		return result;
	}
	
	protected String getNewName(EClass eClass) {
		int count = counts.containsKey(eClass) ? counts.get(eClass) : 0;
		counts.put(eClass, count + 1);
		return "node_" + (graph.getNodes().size() + 1);
	}
	
	protected abstract class DynamicMenuManager extends MenuManager {
		
		public DynamicMenuManager(String text) {
			super(text);
			add(DUMMY_ACTION);
			setRemoveAllWhenShown(true);
			addMenuListener(new IMenuListener() {
				@Override
				public void menuAboutToShow(IMenuManager manager) {
					populateMenu(manager);
				}
			});								
		}
		
		protected abstract void populateMenu(IMenuManager manager);
	}
	
	protected abstract class DynamicEClassBasedMenuManager extends DynamicMenuManager {
		
		protected EClass eClass;
		
		public DynamicEClassBasedMenuManager(String text, final EClass eClass) {
			super(text);
			this.eClass = eClass;
		}
		
		@Override
		final protected void populateMenu(IMenuManager manager) {
			populateMenu(manager, eClass);
		}
		
		protected abstract void populateMenu(IMenuManager manager, EClass eClass);
		
	}
	
	protected class DynamicReferenceMenu extends DynamicEClassBasedMenuManager {
		NodeCommand cmd;
		
		public DynamicReferenceMenu(String text, EClass eClass, NodeCommand cmd) {
			super(text, eClass);
			this.cmd = cmd;
		}
		
		@Override
		protected void populateMenu(IMenuManager manager, EClass eClass) {
			for (EReference reference : eClass.getEAllReferences()) {
				String label = reference.getName();
				if (reference.isDerived())
					label += " (derived)";
				manager.add(new DynamicSubClassSelectionMenu(label, reference.getEReferenceType(),
						new AppendEdgeCommand(reference, cmd)));
			}
		}
	}
	
	protected class DynamicClassConnectionMenu extends DynamicEClassBasedMenuManager {
		NodeCommand cmd;
		
		public DynamicClassConnectionMenu(String text, EClass eClass, NodeCommand cmd) {
			super(text, eClass);
			this.cmd = cmd;
		}
		
		@Override
		protected void populateMenu(IMenuManager manager, EClass eClass) {
			manager.add(createAction("Create", cmd));
			manager.add(new DynamicReferenceMenu("Create and Expand ..", eClass, cmd));
		}
	}
	
	protected class DynamicSubClassSelectionMenu extends DynamicEClassBasedMenuManager {
		
		AppendEdgeCommand cmd;
		
		public DynamicSubClassSelectionMenu(String text, EClass eClass, AppendEdgeCommand cmd) {
			super(text, eClass);
			this.cmd = cmd;
		}
		
		protected IMenuManager populateConnectMenu(IMenuManager manager, EClass eClass) {
			for (Node node : findNodesForTypes(eClass))
				manager.add(createAction(node.getName() + ":" + node.getType().getName(),
						new AppendEdgeToNode(node, cmd)));
			return manager;
		}
		
		protected IMenuManager populateConnectAndExpandMenu(IMenuManager manager, EClass eClass) {
			for (Node node : findNodesForTypes(eClass))
				manager.add(new DynamicReferenceMenu(node.getName() + ":"
						+ node.getType().getName(), node.getType(), new AppendEdgeToNode(node, cmd)));
			return manager;
		}
		
		@Override
		protected void populateMenu(IMenuManager manager, EClass eClass) {
			for (EClass subClass : findSubTypes(eClass)) {
				String label = subClass.getName();
				if (subClass.isAbstract())
					label += " (abstract)";
				if (subClass.isInterface())
					label += " (interface)";
				manager.add(new DynamicClassConnectionMenu(label, subClass, new AppendNodeCommand(
						subClass, cmd)));
			}
			manager.add(new Separator());
			manager.add(populateConnectMenu(new MenuManager("Connect"), eClass));
			manager.add(populateConnectAndExpandMenu(new MenuManager("Connect and Expand .."),
					eClass));
		}
	}
	
	protected class DynamicPackageSelectionMenu extends DynamicMenuManager {
		
		public DynamicPackageSelectionMenu(String text) {
			super(text);
		}
		
		@Override
		protected void populateMenu(IMenuManager manager) {
			for (EPackage importedPackage : graph.getRule().getModule()
					.getImports()) {
				manager.add(new DynamicClassSelectionMenu(importedPackage.getName(),
						importedPackage));
			}
		}
	}
	
	protected class DynamicClassSelectionMenu extends DynamicMenuManager {
		
		EPackage ePackage;
		
		public DynamicClassSelectionMenu(String text, EPackage ePackage) {
			super(text);
			this.ePackage = ePackage;
		}
		
		@Override
		protected void populateMenu(IMenuManager manager) {
			for (EClassifier classifier : ePackage.getEClassifiers())
				if (classifier instanceof EClass) {
					EClass eClass = (EClass) classifier;
					String label = eClass.getName();
					if (eClass.isAbstract())
						label += " (abstract)";
					if (eClass.isInterface())
						label += " (interface)";
					manager.add(new DynamicClassConnectionMenu(label, eClass,
							new CreateNodeCommand(eClass)));
				}
		}
	}
	
	abstract class NodeCommand extends CompoundCommand {
		protected boolean prepare() {
			return true;
		}
		
		abstract Node getNode();
	}
	
	class CreateNodeCommand extends NodeCommand {
		
		EClass eClass;
		Node node;
		
		public CreateNodeCommand(EClass eClass) {
			super();
			this.eClass = eClass;
		}
		
		public void execute() {
			node = HenshinFactory.eINSTANCE.createNode();
			node.setType(eClass);
			node.setName(getNewName(eClass));
			appendAndExecute(new AddCommand(domain, graph,
					HenshinPackage.eINSTANCE.getGraph_Nodes(), node));
		}
		
		public Node getNode() {
			return node;
		}
	}
	
	class AppendNodeCommand extends NodeCommand {
		
		EClass eClass;
		AppendEdgeCommand cmd;
		Node node;
		
		public AppendNodeCommand(EClass eClass, AppendEdgeCommand cmd) {
			super();
			this.eClass = eClass;
			this.cmd = cmd;
		}
		
		public void execute() {
			appendAndExecute(cmd);
			node = HenshinFactory.eINSTANCE.createNode();
			node.setType(eClass);
			node.setName(getNewName(eClass));
			appendAndExecute(new AddCommand(domain, graph,
					HenshinPackage.eINSTANCE.getGraph_Nodes(), node));
			appendAndExecute(new SetCommand(domain, cmd.getEdge(),
					HenshinPackage.eINSTANCE.getEdge_Target(), node));
		}
		
		public Node getNode() {
			return node;
		}
	}
	
	class AppendEdgeCommand extends CompoundCommand {
		
		EReference reference;
		NodeCommand cmd;
		Edge edge;
		
		public AppendEdgeCommand(EReference reference, NodeCommand cmd) {
			super();
			this.reference = reference;
			this.cmd = cmd;
		}
		
		protected boolean prepare() {
			return true;
		}
		
		public Edge getEdge() {
			return edge;
		}
		
		@Override
		public void execute() {
			appendAndExecute(cmd);
			edge = HenshinFactory.eINSTANCE.createEdge();
			edge.setType(reference);
			appendAndExecute(new AddCommand(domain, graph,
					HenshinPackage.eINSTANCE.getGraph_Edges(), edge));
			appendAndExecute(new SetCommand(domain, edge,
					HenshinPackage.eINSTANCE.getEdge_Source(), cmd.getNode()));
		}
	}
	
	class AppendEdgeToNode extends NodeCommand {
		
		Node node;
		AppendEdgeCommand cmd;
		
		public AppendEdgeToNode(Node node, AppendEdgeCommand cmd) {
			super();
			this.cmd = cmd;
			this.node = node;
		}
		
		public void execute() {
			appendAndExecute(cmd);
			appendAndExecute(new SetCommand(domain, cmd.getEdge(),
					HenshinPackage.eINSTANCE.getEdge_Target(), node));
		};
		
		Node getNode() {
			return node;
		}
	}
}

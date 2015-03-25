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
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.editor.commands.CreateEdgeCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.editor.commands.QuantUtil;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;

/**
 * Contributes creation of {@link Edge}s.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 * @author Felix Rieger
 */
public class CreateEdgeCommandMenuContributor extends MenuContributor {
	
	public static MenuContributor INSTANCE = new CreateEdgeCommandMenuContributor();
	
	private static final String COMMAND_LABEL = "CreateEdge";
	private static final String COMMAND_LABEL_UR = "CreateEdge_UnnamedReference";
	private static final String COMMAND_LABEL_EM = "CreateEdge_ExceededMultiplicity";
	private static final String COMMAND_LABEL_AE = "CreateEdge_AlreadyExists";
	private static final String COMMAND_LABEL_DU = "CreateEdge_DerivedUnmapped";
	private static final String COMMAND_LABEL_DERIVED = "CreateEdge_DerivedReference";
	
	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.henshin.editor.commands.MenuContributor#contributeActions
	 * (org.eclipse.jface.action.IMenuManager, java.util.List)
	 */
	@Override
	public void contributeActions(IMenuManager menuManager, List<?> selection) {
		
		if (selection.size() != 2)
			return;
		
		if (!QuantUtil.allInstancesOf(Node.class, selection.toArray()))
			return;
		
		Node sourceNode = (Node) selection.get(0);
		Node targetNode = (Node) selection.get(1);
		
		if (!QuantUtil.allIdenticalAndNotNull(sourceNode.getGraph(), targetNode.getGraph()))
			return;
		
		boolean includeDerived = false;
		// boolean createDerived = false;
		// Node mappedSourceNode = null;
		// Node mappedTargetNode = null;
		// Graph graph = sourceNode.getGraph();
		// if (HenshinRuleAnalysisUtil.isLHS(graph)) {
		// Graph rhs = graph.getContainerRule().getRhs();
		// List<Mapping> mappings = graph.getContainerRule().getMappings();
		// mappedSourceNode = HenshinMappingUtil.getNodeImage(sourceNode, rhs,
		// mappings);
		// mappedTargetNode = HenshinMappingUtil.getNodeImage(targetNode, rhs,
		// mappings);
		// createDerived = includeDerived = QuantUtil.noneNull(
		// mappedSourceNode, mappedTargetNode);
		// } else if (HenshinRuleAnalysisUtil.isRHS(graph)) {
		// List<Mapping> mappings = graph.getContainerRule().getMappings();
		// mappedSourceNode = HenshinMappingUtil.getNodeOrigin(sourceNode,
		// mappings);
		// mappedTargetNode = HenshinMappingUtil.getNodeOrigin(targetNode,
		// mappings);
		// createDerived = includeDerived = QuantUtil.noneNull(
		// mappedSourceNode, mappedTargetNode);
		// } else
		includeDerived = true;
		
		if (QuantUtil.anyNull(sourceNode.getType(), targetNode.getType()))
			return;
		
		Collection<EReference> references = new ArrayList<EReference>();
		Collection<EReference> referencesWithExceededMultiplicity = new ArrayList<EReference>();
		Collection<EReference> existingReferences = new ArrayList<EReference>();
		Collection<EReference> derivedUnmappedReferences = new ArrayList<EReference>();
		
		// lookup references between the given types for which their are no
		// edges yet.
		//
		eRefLoop: for (EReference reference : sourceNode.getType().getEAllReferences()) {
			// reference has matching type
			//
			if (!(reference.getEType() instanceof EClass))
				continue;
			
			EClass refType = (EClass) reference.getEType();
			if (refType.isSuperTypeOf(targetNode.getType()) || (refType.getName() == "EObject")) {
				
				if (reference.isDerived() && !includeDerived) {
					derivedUnmappedReferences.add(reference);
					continue;
				}
				
				// count given
				int multiplicityCounter = 0;
				
				for (Edge edge : sourceNode.getOutgoing()) {
					
					if (reference.equals(edge.getType())) {
						multiplicityCounter++;
					}
					// check whether their already exists an edge for this
					// reference between the given nodes
					//
					if ((edge.getTarget() == targetNode) && reference.equals(edge.getType())) {
						existingReferences.add(edge.getType());
						continue eRefLoop;
					}
				}
				// check whether the multiplicity of the reference allows
				// another edge
				//
				if ((reference.getUpperBound() == -1)
						|| (multiplicityCounter < reference.getUpperBound())) {
					references.add(reference);
				} else {
					referencesWithExceededMultiplicity.add(reference);
				}
			}
		}
		
		Collection<EReference> inverseReferences = new ArrayList<EReference>();
		Collection<EReference> inverseReferencesWithExceededMultiplicity = new ArrayList<EReference>();
		Collection<EReference> inverseExistingReferences = new ArrayList<EReference>();
		Collection<EReference> inverseDerivedUnmappedReferences = new ArrayList<EReference>();
		// lookup references between the given types for which their are no
		// edges yet.
		//
		eRefLoop: for (EReference reference : targetNode.getType().getEAllReferences()) {
			if (!(reference.getEType() instanceof EClass))
				continue;
			EClass refType = (EClass) reference.getEType();
			
			// reference has matching type
			//
			if (refType.isSuperTypeOf(sourceNode.getType()) || (refType.getName() == "EObject")) {
				
				if (reference.isDerived() && !includeDerived) {
					inverseDerivedUnmappedReferences.add(reference);
					continue;
				}
				
				// count given
				int multiplicityCounter = 0;
				
				for (Edge edge : targetNode.getOutgoing()) {
					
					if (reference.equals(edge.getType())) {
						multiplicityCounter++;
					}
					// check whether their already exists an edge for this
					// reference between the given nodes
					//
					if ((edge.getTarget() == sourceNode) && reference.equals(edge.getType())) {
						inverseExistingReferences.add(edge.getType());
						continue eRefLoop;
					}
				}
				// check whether the multiplicity of the reference allows
				// another edge
				//
				if ((reference.getUpperBound() == -1)
						|| (multiplicityCounter < reference.getUpperBound())) {
					inverseReferences.add(reference);
				} else {
					inverseReferencesWithExceededMultiplicity.add(reference);
				}
			}
		}
		
		if (references.size() + referencesWithExceededMultiplicity.size()
				+ existingReferences.size() + derivedUnmappedReferences.size() > 0) {
			MenuManager mm = new MenuManager(getLabel(COMMAND_LABEL) + " " + sourceNode.getName()
					+ " -> " + targetNode.getName());
			for (EReference ref : references) {
				// System.out.println("domain: " + domain);
				// Command cmd = new CreateEdgeCommand(sourceNode, targetNode,
				// ref);
				Command cmd = new CreateEdgeCommand(domain, sourceNode.getGraph(), sourceNode,
						targetNode, ref);
				String label = ref.getName();
				if (ref.isDerived()) {
					label += getLabel(COMMAND_LABEL_DERIVED);
					// if (createDerived)
					// cmd = cmd.chain(new
					// CreateEdgeCommand(domain,mappedNodemappedSourceNode,
					// mappedTargetNode,
					// ref));
				}
				label = label.length() > 0 ? label : getLabel(COMMAND_LABEL_UR);
				mm.add(createAction(label, cmd));
			}
			for (EReference ref : referencesWithExceededMultiplicity) {
				mm.add(createUnrunnableItem(ref.getName() + " * " + getLabel(COMMAND_LABEL_EM)
						+ " *"));
			}
			for (EReference ref : existingReferences) {
				mm.add(createUnrunnableItem(ref.getName() + " * " + getLabel(COMMAND_LABEL_AE)
						+ " *"));
			}
			for (EReference ref : derivedUnmappedReferences) {
				mm.add(createUnrunnableItem(ref.getName() + " * " + getLabel(COMMAND_LABEL_DU)
						+ " *"));
			}
			menuManager.add(mm);
		}
		
		if (inverseReferences.size() + inverseReferencesWithExceededMultiplicity.size()
				+ inverseExistingReferences.size() > 0) {
			MenuManager mm = new MenuManager(getLabel(COMMAND_LABEL) + " " + targetNode.getName()
					+ " -> " + sourceNode.getName());
			for (EReference ref : inverseReferences) {
				Command cmd = new CreateEdgeCommand(domain, targetNode.getGraph(), targetNode,
						sourceNode, ref);
				String label = ref.getName();
				if (ref.isDerived()) {
					label += getLabel(COMMAND_LABEL_DERIVED);
					// if (createDerived)
					// cmd = cmd.chain(new CreateEdgeCommand(mappedTargetNode,
					// mappedSourceNode,
					// ref));
				}
				
				mm.add(createAction(label, cmd));
			}
			for (EReference ref : inverseReferencesWithExceededMultiplicity) {
				mm.add(createUnrunnableItem(ref.getName() + " * " + getLabel(COMMAND_LABEL_EM)
						+ " *"));
			}
			for (EReference ref : inverseExistingReferences) {
				mm.add(createUnrunnableItem(ref.getName() + " * " + getLabel(COMMAND_LABEL_AE)
						+ " *"));
			}
			for (EReference ref : inverseDerivedUnmappedReferences) {
				mm.add(createUnrunnableItem(ref.getName() + " * " + getLabel(COMMAND_LABEL_DU)
						+ " *"));
			}
			menuManager.add(mm);
		}
	}
}
/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.commands;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;

/**
 * Creates a {@link Mapping} between two given {@link Node}s.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class CreateMappingCommand extends CompoundCommand {
	
	protected EditingDomain domain;
	protected Node origin;
	protected Node image;
	protected Mapping mapping;
	protected Collection<?> affectedObjects;
	protected EObject owner;
	protected EStructuralFeature feature;
	
	public CreateMappingCommand(EditingDomain domain, Node source, Node target) {
		super();
		this.domain = domain;
		this.origin = source;
		this.image = target;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		/*
		 * 1) Check at first if any reference is null which shall not be null.
		 * 2) Check if the graphs of origin and image are not the same.
		 */
		if (QuantUtil.anyNull(origin, image, origin.getGraph(), image.getGraph(), origin.getGraph()
				.eContainer(), image.getGraph().eContainer())
				|| QuantUtil.allIdentical(origin.getGraph(), image.getGraph()))
			return false;
		
		if (isUnmappedLhsRhsPairFromSameRule(origin, image)) {
			feature = HenshinPackage.eINSTANCE.getRule_Mappings();
			owner = origin.getGraph().getRule();
		} else if (isMappableSourceAndNestedTargetNode(origin, image)) {
			feature = HenshinPackage.eINSTANCE.getNestedCondition_Mappings();
			owner = image.getGraph().eContainer();
		} else if (isMappableSourceAndMultiRuleTargetNode(origin, image)) {
			feature = HenshinPackage.eINSTANCE.getRule_MultiMappings();
			owner = image.getGraph().getRule();
		} else
			return false;
		
		mapping = HenshinFactory.eINSTANCE.createMapping(origin, image);
		affectedObjects = Collections.singleton(mapping);
		append(domain.createCommand(AddCommand.class, new CommandParameter(owner, feature,
				Collections.singleton(mapping), CommandParameter.NO_INDEX)));
		return super.prepare();
	}// prepare
	
	/**
	 * Returns whether both nodes are in LHS or both nodes are in LHS and the
	 * Rule containing the image has to be a direct multiRule of Rule containing
	 * the origin.
	 * 
	 * @param origin
	 * @param image
	 * @return
	 */
	private boolean isMappableSourceAndMultiRuleTargetNode(Node origin, Node image) {
		boolean result = false;
		result |= origin.getGraph().isLhs() && image.getGraph().isLhs();
		result |= origin.getGraph().isRhs() && image.getGraph().isRhs();
		result &= origin.getGraph().getRule().getMultiRules()
				.contains(image.getGraph().getRule());
		return result;
	}
	
	// @Override
	// public void execute() {
	//
	// mapping = HenshinFactory.eINSTANCE.createMapping();
	// mapping.setOrigin(origin);
	// mapping.setImage(image);
	// redo();
	// }
	
	// @Override
	// public void redo() {
	// if (lhsRhsMapping) {
	// origin.getGraph().getContainerRule().getMappings().add(mapping);
	// } else {
	// NestedCondition nc = (NestedCondition) image.getGraph().eContainer();
	// nc.getMappings().add(mapping);
	// }
	// affectedObjects = Collections.singleton(mapping);
	// }
	
	// @Override
	// public boolean canUndo() {
	// return true;
	// }
	//
	// @Override
	// public void undo() {
	// if (lhsRhsMapping) {
	// origin.getGraph().getContainerRule().getMappings().remove(mapping);
	// affectedObjects =
	// Collections.singleton(origin.getGraph().getContainerRule());
	// } else {
	// NestedCondition nc = (NestedCondition) image.getGraph().eContainer();
	// nc.getMappings().remove(mapping);
	// affectedObjects = Collections.singleton(nc);
	// }
	// }
	
	// @Override
	// public Collection<?> getAffectedObjects() {
	// return affectedObjects;
	// }
	
	/**
	 * Returns true is source and target are contained in the LHS and RHS of the
	 * same rule.
	 * 
	 * @param source
	 * @param target
	 * @return
	 */
	protected boolean isUnmappedLhsRhsPairFromSameRule(Node source, Node target) {
		return source.getGraph().isLhs()
				&& target.getGraph().isRhs()
				&& (source.getGraph().getRule() == target.getGraph().getRule())
				&& isUnmapped(source, target, source.getGraph().getRule().getMappings());
	}// isLhsRhsPairFromSameRule
	
	/**
	 * Checks if <code>sourceNode</code> or <code>targetNode</code> are involved
	 * in a mapping already, being origin or image respectively, contained in
	 * <code>mappings</code>.
	 * 
	 * @param sourceNode
	 * @param targetNode
	 * @param mappings
	 * @return
	 */
	protected boolean isUnmapped(Node sourceNode, Node targetNode, Collection<Mapping> mappings) {
		for (Mapping mapping : mappings) {
			if (mapping.getOrigin() == sourceNode || mapping.getImage() == targetNode)
				return false;
		}// for
		return true;
	}// isUnmapped
	
	/**
	 * @param sourceNode
	 * @param targetNode
	 * @return
	 */
	private boolean isMappableSourceAndNestedTargetNode(Node sourceNode, Node targetNode) {
		if (targetNode.getGraph().eContainer() instanceof NestedCondition) {
			NestedCondition nc = (NestedCondition) targetNode.getGraph().eContainer();
			return isUnmapped(sourceNode, targetNode, nc.getMappings());
		}// if
		return false;
	}// isMappableSourceAndTargetNode
	
}// class

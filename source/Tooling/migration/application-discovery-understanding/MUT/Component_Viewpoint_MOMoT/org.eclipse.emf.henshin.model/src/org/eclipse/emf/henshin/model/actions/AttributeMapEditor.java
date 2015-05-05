/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.actions;

import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.Node;

public class AttributeMapEditor extends AbstractMapEditor<Attribute> {
	
	// Node map editor:
	private NodeMapEditor nodeMapEditor;
	
	/**
	 * Default constructor.
	 */
	public AttributeMapEditor(Graph source, Graph target, MappingList mappings) {
		super(source, target, mappings);
		nodeMapEditor = new NodeMapEditor(source, target, mappings);
	}
	
	/**
	 * Alternative constructor.
	 */
	public AttributeMapEditor(Graph target) {
		super(target);
		nodeMapEditor = new NodeMapEditor(target);
	}
	
	/**
	 * Alternative constructor.
	 */
	public AttributeMapEditor(NodeMapEditor nodeMapEditor) {
		super(nodeMapEditor);
		this.nodeMapEditor = nodeMapEditor;
	}
	
	/*
	 * Set the opposite attribute.
	 */
	private void setOppositeAttribute(Attribute attribute, Attribute opposite) {
		Node node = nodeMapEditor.getOpposite(attribute.getNode());
		if (node==null) {
			node = nodeMapEditor.copy(attribute.getNode());
		}
		Attribute old = node.getAttribute(attribute.getType());
		if (old!=null) {
			node.getAttributes().remove(old);	// remove the old one
		}
		if (opposite!=null) {
			node.getAttributes().add(opposite);	// add the new one
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doCopy(java.lang.Object)
	 */
	@Override
	protected Attribute doCopy(Attribute attribute) {
		Attribute opposite = getOpposite(attribute);
		if (opposite==null) {
			opposite = HenshinFactory.eINSTANCE.createAttribute();
			opposite.setType(attribute.getType());
			opposite.setValue(attribute.getValue());
			setOppositeAttribute(attribute, opposite);
		}
		return opposite;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doMove(java.lang.Object)
	 */
	@Override
	protected void doMove(Attribute attribute) {
		setOppositeAttribute(attribute, attribute);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doRemove(java.lang.Object)
	 */
	@Override
	protected void doRemove(Attribute attribute) {
		attribute.setNode(null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doReplace(java.lang.Object)
	 */
	@Override
	protected Attribute doReplace(Attribute attribute) {
		Node node = attribute.getNode();
		int index = node.getAttributes().indexOf(attribute);
		Attribute opposite = getOpposite(attribute);
		node.getAttributes().set(index, opposite);
		return opposite;
	}
	
}

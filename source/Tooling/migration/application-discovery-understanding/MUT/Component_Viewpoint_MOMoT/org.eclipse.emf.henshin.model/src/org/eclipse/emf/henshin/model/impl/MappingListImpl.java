/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.GraphElement;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.Node;

/**
 * An implementation of the {@link MappingList} interface.
 * @author Christian Krause
 */
public class MappingListImpl extends BasicEList<Mapping> implements MappingList {

	// Generated serial ID:
	private static final long serialVersionUID = -7095784906496813L;

	/**
	 * Default constructor.
	 */
	public MappingListImpl() {
		super();
	}
		
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#get(org.eclipse.emf.henshin.model.Node, org.eclipse.emf.henshin.model.Node)
	 */
	@Override
	public Mapping get(Node origin, Node image) {
		return MappingListHelper.get(this, origin, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#add(org.eclipse.emf.henshin.model.Node, org.eclipse.emf.henshin.model.Node)
	 */
	@Override
	public Mapping add(Node origin, Node image) {
		return MappingListHelper.add(this, origin, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#add(org.eclipse.emf.henshin.model.Edge, org.eclipse.emf.henshin.model.Edge)
	 */
	@Override
	public void add(Edge origin, Edge image) {
		MappingListHelper.add(this, origin, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#add(org.eclipse.emf.henshin.model.Attribute, org.eclipse.emf.henshin.model.Attribute)
	 */
	@Override
	public Mapping add(Attribute origin, Attribute image) {
		return MappingListHelper.add(this, origin, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#add(org.eclipse.emf.henshin.model.GraphElement, org.eclipse.emf.henshin.model.GraphElement)
	 */
	@Override
	public <E extends GraphElement> void add(E origin, E image) {
		MappingListHelper.add(this, origin, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#remove(org.eclipse.emf.henshin.model.Node, org.eclipse.emf.henshin.model.Node)
	 */
	@Override
	public Mapping remove(Node origin, Node image) {
		return MappingListHelper.remove(this, origin, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#remove(org.eclipse.emf.henshin.model.Edge, org.eclipse.emf.henshin.model.Edge)
	 */
	@Override
	public void remove(Edge origin, Edge image) {
		MappingListHelper.remove(this, origin, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#remove(org.eclipse.emf.henshin.model.Attribute, org.eclipse.emf.henshin.model.Attribute)
	 */
	@Override
	public Mapping remove(Attribute origin, Attribute image) {
		return MappingListHelper.remove(this, origin, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#remove(org.eclipse.emf.henshin.model.GraphElement, org.eclipse.emf.henshin.model.GraphElement)
	 */
	@Override
	public <E extends GraphElement> void remove(E origin, E image) {
		MappingListHelper.remove(this, origin, image);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#getImage(org.eclipse.emf.henshin.model.Node, org.eclipse.emf.henshin.model.Graph)
	 */
	@Override
	public Node getImage(Node origin, Graph imageGraph) {
		return MappingListHelper.getImage(this, origin, imageGraph);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#getOrigin(org.eclipse.emf.henshin.model.Node)
	 */
	@Override
	public Node getOrigin(Node image) {
		return MappingListHelper.getOrigin(this, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#getImage(org.eclipse.emf.henshin.model.Edge, org.eclipse.emf.henshin.model.Graph)
	 */
	@Override
	public Edge getImage(Edge origin, Graph imageGraph) {
		return MappingListHelper.getImage(this, origin, imageGraph);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#getOrigin(org.eclipse.emf.henshin.model.Edge)
	 */
	@Override
	public Edge getOrigin(Edge image) {
		return MappingListHelper.getOrigin(this, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#getImage(org.eclipse.emf.henshin.model.Attribute, org.eclipse.emf.henshin.model.Graph)
	 */
	@Override
	public Attribute getImage(Attribute origin, Graph imageGraph) {
		return MappingListHelper.getImage(this, origin, imageGraph);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#getOrigin(org.eclipse.emf.henshin.model.Attribute)
	 */
	@Override
	public Attribute getOrigin(Attribute image) {
		return MappingListHelper.getOrigin(this, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#getOrigin(java.lang.Object)
	 */
	@Override
	public <E extends GraphElement> E getOrigin(E image) {
		return MappingListHelper.getOrigin(this, image);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#getImage(java.lang.Object, org.eclipse.emf.henshin.model.Graph)
	 */
	@Override
	public <E extends GraphElement> E getImage(E origin, Graph imageGraph) {
		return MappingListHelper.getImage(this, origin, imageGraph);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.MappingList#isOnto(org.eclipse.emf.henshin.model.Graph)
	 */
	@Override
	public boolean isOnto(Graph imageGraph) {
		return MappingListHelper.isOnto(this, imageGraph);
	}

}

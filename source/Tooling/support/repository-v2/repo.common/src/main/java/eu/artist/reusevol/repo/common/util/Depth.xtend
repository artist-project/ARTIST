/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
 
package eu.artist.reusevol.repo.common.util

import org.jcrom.util.NodeFilter

class Depth extends ValidatedId<NodeFilter> {
	
	public static val ENTITY = new Depth(0)
	public static val CHILDREN = new Depth(1)
	public static val ALL = new Depth(NodeFilter.DEPTH_INFINITE)

	static val msg = '''Unknown argument for depth. Allowed values are 'entity', 'children' and 'all'.'''

	public new(String input) {
		super(input)
	}

	public new(Integer depth) {
		super(asString(depth))
	}

	override parse(String input) throws Exception {
		switch(input.toLowerCase) {
			case "entity": new NodeFilter(0)
			case "children": new NodeFilter(1)
			case "all": new NodeFilter(NodeFilter.DEPTH_INFINITE)
			default: throw new IllegalArgumentException(msg)
		}
	}
	
	def int getDepth() {
		get.filterDepth
	}
	
	def String asString() {
		asString(get.filterDepth)
	}
	
	override toString() {
		"Depth(" + asString(get.filterDepth) + ")"
	}

	static def String asString(Integer depth) {
		switch(depth) {
			case 0: "entity"
			case 1: "children"
			case NodeFilter.DEPTH_INFINITE: "all"
			default: throw new IllegalArgumentException(msg)
		}
	}
}
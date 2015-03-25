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

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.HenshinFactory;

/**
 * Creates a new {@link Edge} from a given edge's target to its source. the type
 * of the new edge is the opposite if the given edge's type.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 * 
 */
public class CreateOppositeEdgeCommand extends AbstractCommand {
	
	private Edge newEdge;
	
	private Edge edge;
	
	public void setEdge(Edge edge) {
		this.edge = edge;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return edge != null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		newEdge = HenshinFactory.eINSTANCE.createEdge(edge.getTarget(), edge.getSource(), edge
				.getType().getEOpposite());
		redo();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		edge.getGraph().getEdges().add(newEdge);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#undo()
	 */
	@Override
	public void undo() {
		edge.getGraph().getEdges().remove(newEdge);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return true;
	}
	
}

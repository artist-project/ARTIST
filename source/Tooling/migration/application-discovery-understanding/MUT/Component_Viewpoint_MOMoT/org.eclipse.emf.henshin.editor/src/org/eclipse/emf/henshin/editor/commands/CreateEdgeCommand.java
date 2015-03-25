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

import java.util.Collections;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Node;

/**
 * Creates an {@link Edge} of a given type between two given {@link Node}s.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 * 
 */
public class CreateEdgeCommand extends CompoundCommand {
	
	protected Node source;
	protected Node target;
	protected EReference edgeType;
	protected Graph graph;
	protected Edge edge;
	protected EditingDomain domain;
	
	public CreateEdgeCommand(EditingDomain domain, Graph graph, Node source, Node target,
			EReference type) {
		super(CompoundCommand.LAST_COMMAND_ALL);
		this.domain = domain;
		this.graph = graph;
		
		edge = HenshinFactory.eINSTANCE.createEdge();
		
		this.append(domain.createCommand(SetCommand.class, new CommandParameter(edge,
				HenshinPackage.eINSTANCE.getEdge_Source(), source, -1)));
		
		this.append(domain.createCommand(SetCommand.class, new CommandParameter(edge,
				HenshinPackage.eINSTANCE.getEdge_Target(), target, -1)));
		
		this.append(domain.createCommand(SetCommand.class, new CommandParameter(edge,
				HenshinPackage.eINSTANCE.getEdge_Type(), type, -1)));
		
	}
	
	@Override
	public void execute() {
		super.execute();
		this.appendAndExecute(domain.createCommand(AddCommand.class, new CommandParameter(graph,
				HenshinPackage.eINSTANCE.getGraph_Edges(), Collections.singleton(edge), -1)));
		
	}
	
}

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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.provider.util.HenshinNameUtil;

/**
 * Creates one {@link Node} in each {@link Graph} of a given {@link Rule} and a
 * {@link Mapping} between them.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class CreateMappedNodeCommand extends AbstractCommand {
	
	protected Rule rule;
	protected Node origNode, imgNode;
	protected Mapping mapping;
	
	/**
	 * @param rule
	 */
	public CreateMappedNodeCommand(Rule rule) {
		this.rule = rule;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		return this.rule != null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		HenshinFactory factory = HenshinFactory.eINSTANCE;
		origNode = factory.createNode();
		origNode.setName(HenshinNameUtil.generateNewNodeName(rule.getLhs()));
		
		imgNode = factory.createNode();
		imgNode.setName(HenshinNameUtil.generateNewNodeName(rule.getRhs()));
		
		mapping = factory.createMapping();
		mapping.setOrigin(origNode);
		mapping.setImage(imgNode);
		redo();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#getAffectedObjects()
	 */
	@Override
	public Collection<?> getAffectedObjects() {
		Collection<Object> affectedObjects = new ArrayList<Object>();
		affectedObjects.add(origNode);
		affectedObjects.add(imgNode);
		affectedObjects.add(mapping);
		return affectedObjects;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#getResult()
	 */
	@Override
	public Collection<?> getResult() {
		return this.getAffectedObjects();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#undo()
	 */
	@Override
	public void undo() {
		rule.getLhs().getNodes().remove(origNode);
		rule.getRhs().getNodes().remove(imgNode);
		rule.getMappings().remove(mapping);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		rule.getLhs().getNodes().add(origNode);
		rule.getRhs().getNodes().add(imgNode);
		rule.getMappings().add(mapping);
	}
	
}// class

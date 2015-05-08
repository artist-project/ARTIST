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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;

/**
 * Deduces parameters according to a rules content.<br>
 * So far, the deduction is pretty simplistic, i.e., node names and attribute
 * values (consisting of at least one letter and arbitrary word characters) lead
 * to the creation of {@link Parameter} objects. Note that parameter deletion is
 * not performed at all!
 * 
 * @author Stefan Jurack (sjurack)
 */
public class DeduceParametersCommand extends AbstractCommand {
	
	protected Rule rule;
	protected Set<String> parameterNames;
	protected List<Parameter> newParameters;
	
	/**
	 * @param rule
	 */
	public DeduceParametersCommand(Rule rule) {
		this.rule = rule;
		this.parameterNames = new HashSet<String>();
		this.newParameters = new ArrayList<Parameter>();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		return ((rule != null) && (!rule.getLhs().getNodes().isEmpty() || !rule.getRhs().getNodes()
				.isEmpty()));
	}// prepare
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		
		deduceParametersFromGraph(this.rule.getLhs());
		deduceParametersFromGraph(this.rule.getRhs());
		
		for (Parameter p : rule.getParameters()) {
			// remove the names of already existing parameters
			parameterNames.remove(p.getName());
		}// for
		
		// create the Parameter objects
		for (String name : parameterNames) {
			HenshinFactory factory = HenshinFactory.eINSTANCE;
			Parameter para = factory.createParameter();
			para.setName(name);
			this.newParameters.add(para);
		}// for
		
		redo();
	}// execute
	
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
		this.rule.getParameters().removeAll(newParameters);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		this.rule.getParameters().addAll(newParameters);
	}
	
	/**
	 * Deduces parameters from the given graph by checking its node names and
	 * attribute values.
	 * 
	 * @param rhs
	 */
	private void deduceParametersFromGraph(Graph graph) {
		
		for (Node n : graph.getNodes()) {
			if (n.getName() != null && !n.getName().trim().isEmpty())
				parameterNames.add(n.getName().trim());
			
			for (Attribute a : n.getAttributes()) {
				
				if (a.getValue() != null) {
					String value = a.getValue().trim();
					/*
					 * two staged test: 1) Only [a-zA-Z_0-9], then 2) at least
					 * one non-digit
					 */
					if (value.matches("^\\w+$") && value.matches("^.*[^0-9].*$")) {
						parameterNames.add(value);
					}// if
				}// if
			}// for
		}// for
		
	}// deduceParametersFromGraph
	
}// class

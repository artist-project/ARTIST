/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.gml.ui;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import eu.artist.postmigration.nfrvt.lang.common.ui.ARTISTCommonTemplateProposalProvider;
import eu.artist.postmigration.nfrvt.lang.gml.services.GMLGrammarAccess;

public class GMLTemplateProposalProvider extends ARTISTCommonTemplateProposalProvider {

	@Inject
	GMLGrammarAccess grammar;
	
	@Inject
	public GMLTemplateProposalProvider(TemplateStore templateStore,
			ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
	}
	
	@Override
	protected void createTemplates(TemplateContext templateContext, 
			ContentAssistContext context,
			ITemplateAcceptor acceptor) {
		
		//"regular templates"
		super.createTemplates(templateContext, context, acceptor);
		
		addTemplate(templateContext, context, acceptor, 
				Lists.newArrayList(grammar.getGoalModelRule(), grammar.getImportNamespaceRule()),
				"gms",
				"Skeleton for minimal goal model", 
				"goalmodel ${name} {\n" + 
					"\tworkloads [ ]\n" +
					"\tapplied-properties [ ]\n" + 
					"\tgoals [ ]\n" +
				"}");
		
		addTemplate(templateContext, context, acceptor, 
				Lists.newArrayList(grammar.getGoalModelRule(), grammar.getImportNamespaceRule()),
				"gmsc",
				"Skeleton for minimal goal model with comments", 
				"/*\n" + 
				" * You can describe your goal model in this comment section.\n" + 
				" */\n" + 
				"goalmodel ${name} {\n" + 
					"\tworkloads [ ]\n" +
					"\tapplied-properties [ ]\n" + 
					"\tgoals [ ]\n" +
				"}");
		
		addTemplate(templateContext, context, acceptor,
				grammar.getWorkloadRule(),
				"workload",
				"Skeleton for workload",
				"${name} {\n" + 
					"\tactivity ${uml_activity},\n" + 
					"\tpattern \"${open}\"\n" +
				"}");
		
		addTemplate(templateContext, context, acceptor,
				grammar.getAppliedQualitativePropertyRule(),
				"quali",
				"Skeleton for applied qualitative property",
				"qualitative ${name} {\n" + 
					"\tproperty ${qualitative_property},\n" + 
					"\tcontext [ ]\n" +
				"}");
		
		addTemplate(templateContext, context, acceptor,
				grammar.getAppliedQuantitativePropertyRule(),
				"quanti",
				"Skeleton for applied quantitative property",
				"quantitative ${name} {\n" + 
					"\tproperty ${quantitative_property},\n" + 
					"\tcontext [ ${context_element} ]\n" +
				"}");
		
		addTemplate(templateContext, context, acceptor,
				grammar.getAppliedQuantitativePropertyRule(),
				"quantiw",
				"Skeleton for applied quantitative property with workload",
				"quantitative ${name} {\n" + 
					"\tproperty ${quantitative_property},\n" + 
					"\tcontext [ ${context_element} ],\n" +
					"\tworkload ${defined_workload}\n" +
				"}");
		
		addTemplate(templateContext, context, acceptor,
				grammar.getGoalRule(),
				"sgs",
				"Skeleton for soft goal",
				"softgoal ${name} {\n" + 
					"\tkind ${required},\n" + 
					"\tpriority ${1},\n" + 
					"\tproperty ${property},\n" +
					"\tthreshold ${threshold}\n" +
				"}");
		
		addTemplate(templateContext, context, acceptor,
				grammar.getGoalRule(),
				"hgs",
				"Skeleton for hard goal",
				"hardgoal ${name} {\n" + 
					"\tkind ${required},\n" + 
					"\tpriority ${1},\n" + 
					"\tcondition ${true}\n" +
				"}");
		
		addTemplate(templateContext, context, acceptor,
				grammar.getGoalRule(),
				"cgs",
				"Skeleton for composite goal",
				"composite ${name} {\n" + 
					"\tkind ${required},\n" + 
					"\tpriority ${1},\n" + 
					"\tcondition ${true}\n" +
				"}");
	}
}

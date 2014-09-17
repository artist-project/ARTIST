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
package eu.artist.postmigration.nfrvt.lang.common.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class ARTISTCommonTemplateProposalProvider extends DefaultTemplateProposalProvider {
	
	private static Map<ParserRule, String> ruleToID = new HashMap<>();
	private ContextTypeIdHelper helper;	
	
	@Inject
	public ARTISTCommonTemplateProposalProvider(TemplateStore templateStore,
			ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
		this.helper = helper;
	}

	protected String getId(ParserRule rule) {
		String id = ruleToID.get(rule);
		if(id == null) {
			id = getHelper().getId(rule);
			ruleToID.put(rule, id);
		}
		return id;
	}
	
	protected List<String> getIds(Collection<ParserRule> rules) {
		ArrayList<String> ids = Lists.newArrayList();
		for(ParserRule rule : rules)
			ids.add(getId(rule));
		return ids;
	}
	
	public ContextTypeIdHelper getHelper() {
		return helper;
	}
	
	protected boolean shouldApply(TemplateContext templateContext, String ruleId) {
		String contextId = templateContext.getContextType().getId();
		return contextId.equals(ruleId);
	}
	
	protected boolean shouldApply(TemplateContext templateContext, Collection<String> ruleIds) {
		String contextId = templateContext.getContextType().getId();
		return ruleIds.contains(contextId);
	}
	
	protected void addTemplate(TemplateContext templateContext, 
			ContentAssistContext context, ITemplateAcceptor acceptor,
			ParserRule rule, String name, String description, String pattern) {
		addTemplate(templateContext, context, acceptor, rule, name, description, pattern, true);
	}
	
	protected void addTemplate(TemplateContext templateContext, 
			ContentAssistContext context, ITemplateAcceptor acceptor,
			ParserRule rule, String name, String description, String pattern, 
			boolean isAutoInsertable) {
		addTemplate(templateContext, context, acceptor, Lists.newArrayList(rule), name, description, pattern);
	}
	
	protected void addTemplate(TemplateContext templateContext, 
			ContentAssistContext context, ITemplateAcceptor acceptor,
			Collection<ParserRule> rules, String name, String description, String pattern) {
		addTemplate(templateContext, context, acceptor, rules, name, description, pattern, true);
	}
	
	protected void addTemplate(TemplateContext templateContext, 
			ContentAssistContext context, ITemplateAcceptor acceptor,
			Collection<ParserRule> rules, String name, String description, String pattern, 
			boolean isAutoInsertable) {
		List<String> ids = getIds(rules);
		if(shouldApply(templateContext, ids)) {
			Template template = new Template(
					name, 
					description, 
			        ids.get(0),
			        pattern, 
					isAutoInsertable);
		
			acceptTemplate(templateContext, context, acceptor, template);
		}
	}
	
	protected void acceptTemplate(TemplateContext templateContext, 
			ContentAssistContext context, ITemplateAcceptor acceptor, 
			Template template) {
		
	    TemplateProposal tp = createProposal(template, 
	        templateContext, 
	        context, 
	        getImage(template), 
	        getRelevance(template));
	    
	    acceptor.accept(tp);
	}
}

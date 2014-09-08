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
package eu.artist.postmigration.nfrvt.lang.common.serializer;

import com.google.inject.Inject;
import eu.artist.postmigration.nfrvt.lang.common.services.ARTISTCommonGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ARTISTCommonSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ARTISTCommonGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AndOperator_AmpersandAmpersandKeyword_1_1_or_AndKeyword_1_0;
	protected AbstractElementAlias match_ImplicationOperator_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1;
	protected AbstractElementAlias match_NotEqualsOperator_ExclamationMarkEqualsSignKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_1;
	protected AbstractElementAlias match_NotOperator_ExclamationMarkKeyword_1_0_or_NotKeyword_1_1;
	protected AbstractElementAlias match_OrOperator_OrKeyword_1_0_or_VerticalLineVerticalLineKeyword_1_1;
	protected AbstractElementAlias match_XOrOperator_CircumflexAccentKeyword_1_1_or_XorKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ARTISTCommonGrammarAccess) access;
		match_AndOperator_AmpersandAmpersandKeyword_1_1_or_AndKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0()));
		match_ImplicationOperator_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getImplicationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1_1()));
		match_NotEqualsOperator_ExclamationMarkEqualsSignKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getNotEqualsOperatorAccess().getLessThanSignGreaterThanSignKeyword_1_1()));
		match_NotOperator_ExclamationMarkKeyword_1_0_or_NotKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getNotOperatorAccess().getNotKeyword_1_1()));
		match_OrOperator_OrKeyword_1_0_or_VerticalLineVerticalLineKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1_1()));
		match_XOrOperator_CircumflexAccentKeyword_1_1_or_XorKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getXOrOperatorAccess().getCircumflexAccentKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getLeftParenthesisRule())
			return getLeftParenthesisToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRightParenthesisRule())
			return getRightParenthesisToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * LeftParenthesis:
	 * 	'('
	 * ;
	 */
	protected String getLeftParenthesisToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * RightParenthesis:
	 * 	')'
	 * ;
	 */
	protected String getRightParenthesisToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AndOperator_AmpersandAmpersandKeyword_1_1_or_AndKeyword_1_0.equals(syntax))
				emit_AndOperator_AmpersandAmpersandKeyword_1_1_or_AndKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplicationOperator_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1.equals(syntax))
				emit_ImplicationOperator_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotEqualsOperator_ExclamationMarkEqualsSignKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_1.equals(syntax))
				emit_NotEqualsOperator_ExclamationMarkEqualsSignKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotOperator_ExclamationMarkKeyword_1_0_or_NotKeyword_1_1.equals(syntax))
				emit_NotOperator_ExclamationMarkKeyword_1_0_or_NotKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OrOperator_OrKeyword_1_0_or_VerticalLineVerticalLineKeyword_1_1.equals(syntax))
				emit_OrOperator_OrKeyword_1_0_or_VerticalLineVerticalLineKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XOrOperator_CircumflexAccentKeyword_1_1_or_XorKeyword_1_0.equals(syntax))
				emit_XOrOperator_CircumflexAccentKeyword_1_1_or_XorKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'and' | '&&'
	 */
	protected void emit_AndOperator_AmpersandAmpersandKeyword_1_1_or_AndKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '=>' | '->'
	 */
	protected void emit_ImplicationOperator_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!=' | '<>'
	 */
	protected void emit_NotEqualsOperator_ExclamationMarkEqualsSignKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!' | 'not'
	 */
	protected void emit_NotOperator_ExclamationMarkKeyword_1_0_or_NotKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '||' | 'or'
	 */
	protected void emit_OrOperator_OrKeyword_1_0_or_VerticalLineVerticalLineKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'xor' | '^'
	 */
	protected void emit_XOrOperator_CircumflexAccentKeyword_1_1_or_XorKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

package eu.artist.postmigration.nfrvt.lang.gel.serializer;

import com.google.inject.Inject;
import eu.artist.postmigration.nfrvt.lang.gel.services.GELGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class GELSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GELGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AndOperator_AmpersandAmpersandKeyword_1_1_or_AndKeyword_1_0;
	protected AbstractElementAlias match_AppliedQuantitativePropertyEvaluation___CommaKeyword_10_0_RealizationsKeyword_10_1_LeftSquareBracketKeyword_10_2_RightSquareBracketKeyword_10_4__q;
	protected AbstractElementAlias match_BooleanExpressionEvaluation___CommaKeyword_5_0_DifferenceKeyword_5_1__q;
	protected AbstractElementAlias match_BooleanExpressionEvaluation___CommaKeyword_6_0_EvaluationsKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q;
	protected AbstractElementAlias match_BooleanExpressionEvaluation___ResultKeyword_2_0_CommaKeyword_2_2__q;
	protected AbstractElementAlias match_ImplicationOperator_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1;
	protected AbstractElementAlias match_NotEqualsOperator_ExclamationMarkEqualsSignKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_1;
	protected AbstractElementAlias match_NotOperator_ExclamationMarkKeyword_1_0_or_NotKeyword_1_1;
	protected AbstractElementAlias match_NumberExpressionEvaluation___CommaKeyword_7_0_ArithmeticEvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q;
	protected AbstractElementAlias match_OrOperator_OrKeyword_1_0_or_VerticalLineVerticalLineKeyword_1_1;
	protected AbstractElementAlias match_QuantitativePropertyRealization___StrategyKeyword_2_0_CommaKeyword_2_2__q;
	protected AbstractElementAlias match_Transformation___CommaKeyword_5_0_SourceKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q;
	protected AbstractElementAlias match_Transformation___CommaKeyword_6_0_TargetKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q;
	protected AbstractElementAlias match_ValueSpecificationExpressionEvaluation___CommaKeyword_7_0_EvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q;
	protected AbstractElementAlias match_XOrOperator_CircumflexAccentKeyword_1_1_or_XorKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GELGrammarAccess) access;
		match_AndOperator_AmpersandAmpersandKeyword_1_1_or_AndKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0()));
		match_AppliedQuantitativePropertyEvaluation___CommaKeyword_10_0_RealizationsKeyword_10_1_LeftSquareBracketKeyword_10_2_RightSquareBracketKeyword_10_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getCommaKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getRealizationsKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getLeftSquareBracketKeyword_10_2()), new TokenAlias(false, false, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getRightSquareBracketKeyword_10_4()));
		match_BooleanExpressionEvaluation___CommaKeyword_5_0_DifferenceKeyword_5_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBooleanExpressionEvaluationAccess().getCommaKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getBooleanExpressionEvaluationAccess().getDifferenceKeyword_5_1()));
		match_BooleanExpressionEvaluation___CommaKeyword_6_0_EvaluationsKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBooleanExpressionEvaluationAccess().getCommaKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getBooleanExpressionEvaluationAccess().getEvaluationsKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getBooleanExpressionEvaluationAccess().getLeftSquareBracketKeyword_6_2()), new TokenAlias(false, false, grammarAccess.getBooleanExpressionEvaluationAccess().getRightSquareBracketKeyword_6_4()));
		match_BooleanExpressionEvaluation___ResultKeyword_2_0_CommaKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBooleanExpressionEvaluationAccess().getResultKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getBooleanExpressionEvaluationAccess().getCommaKeyword_2_2()));
		match_ImplicationOperator_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getImplicationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1_1()));
		match_NotEqualsOperator_ExclamationMarkEqualsSignKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getNotEqualsOperatorAccess().getLessThanSignGreaterThanSignKeyword_1_1()));
		match_NotOperator_ExclamationMarkKeyword_1_0_or_NotKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getNotOperatorAccess().getNotKeyword_1_1()));
		match_NumberExpressionEvaluation___CommaKeyword_7_0_ArithmeticEvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNumberExpressionEvaluationAccess().getCommaKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getNumberExpressionEvaluationAccess().getArithmeticEvaluationsKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getNumberExpressionEvaluationAccess().getLeftSquareBracketKeyword_7_2()), new TokenAlias(false, false, grammarAccess.getNumberExpressionEvaluationAccess().getRightSquareBracketKeyword_7_4()));
		match_OrOperator_OrKeyword_1_0_or_VerticalLineVerticalLineKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1_1()));
		match_QuantitativePropertyRealization___StrategyKeyword_2_0_CommaKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getQuantitativePropertyRealizationAccess().getStrategyKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getQuantitativePropertyRealizationAccess().getCommaKeyword_2_2()));
		match_Transformation___CommaKeyword_5_0_SourceKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTransformationAccess().getCommaKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getTransformationAccess().getSourceKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getTransformationAccess().getLeftSquareBracketKeyword_5_2()), new TokenAlias(false, false, grammarAccess.getTransformationAccess().getRightSquareBracketKeyword_5_4()));
		match_Transformation___CommaKeyword_6_0_TargetKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTransformationAccess().getCommaKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getTransformationAccess().getTargetKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getTransformationAccess().getLeftSquareBracketKeyword_6_2()), new TokenAlias(false, false, grammarAccess.getTransformationAccess().getRightSquareBracketKeyword_6_4()));
		match_ValueSpecificationExpressionEvaluation___CommaKeyword_7_0_EvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getCommaKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getEvaluationsKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getLeftSquareBracketKeyword_7_2()), new TokenAlias(false, false, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getRightSquareBracketKeyword_7_4()));
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
			else if(match_AppliedQuantitativePropertyEvaluation___CommaKeyword_10_0_RealizationsKeyword_10_1_LeftSquareBracketKeyword_10_2_RightSquareBracketKeyword_10_4__q.equals(syntax))
				emit_AppliedQuantitativePropertyEvaluation___CommaKeyword_10_0_RealizationsKeyword_10_1_LeftSquareBracketKeyword_10_2_RightSquareBracketKeyword_10_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BooleanExpressionEvaluation___CommaKeyword_5_0_DifferenceKeyword_5_1__q.equals(syntax))
				emit_BooleanExpressionEvaluation___CommaKeyword_5_0_DifferenceKeyword_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BooleanExpressionEvaluation___CommaKeyword_6_0_EvaluationsKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q.equals(syntax))
				emit_BooleanExpressionEvaluation___CommaKeyword_6_0_EvaluationsKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BooleanExpressionEvaluation___ResultKeyword_2_0_CommaKeyword_2_2__q.equals(syntax))
				emit_BooleanExpressionEvaluation___ResultKeyword_2_0_CommaKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplicationOperator_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1.equals(syntax))
				emit_ImplicationOperator_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotEqualsOperator_ExclamationMarkEqualsSignKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_1.equals(syntax))
				emit_NotEqualsOperator_ExclamationMarkEqualsSignKeyword_1_0_or_LessThanSignGreaterThanSignKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotOperator_ExclamationMarkKeyword_1_0_or_NotKeyword_1_1.equals(syntax))
				emit_NotOperator_ExclamationMarkKeyword_1_0_or_NotKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NumberExpressionEvaluation___CommaKeyword_7_0_ArithmeticEvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q.equals(syntax))
				emit_NumberExpressionEvaluation___CommaKeyword_7_0_ArithmeticEvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OrOperator_OrKeyword_1_0_or_VerticalLineVerticalLineKeyword_1_1.equals(syntax))
				emit_OrOperator_OrKeyword_1_0_or_VerticalLineVerticalLineKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_QuantitativePropertyRealization___StrategyKeyword_2_0_CommaKeyword_2_2__q.equals(syntax))
				emit_QuantitativePropertyRealization___StrategyKeyword_2_0_CommaKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transformation___CommaKeyword_5_0_SourceKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q.equals(syntax))
				emit_Transformation___CommaKeyword_5_0_SourceKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transformation___CommaKeyword_6_0_TargetKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q.equals(syntax))
				emit_Transformation___CommaKeyword_6_0_TargetKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ValueSpecificationExpressionEvaluation___CommaKeyword_7_0_EvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q.equals(syntax))
				emit_ValueSpecificationExpressionEvaluation___CommaKeyword_7_0_EvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     (',' 'realizations' '[' ']')?
	 */
	protected void emit_AppliedQuantitativePropertyEvaluation___CommaKeyword_10_0_RealizationsKeyword_10_1_LeftSquareBracketKeyword_10_2_RightSquareBracketKeyword_10_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' 'difference')?
	 */
	protected void emit_BooleanExpressionEvaluation___CommaKeyword_5_0_DifferenceKeyword_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' 'evaluations' '[' ']')?
	 */
	protected void emit_BooleanExpressionEvaluation___CommaKeyword_6_0_EvaluationsKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('result' ',')?
	 */
	protected void emit_BooleanExpressionEvaluation___ResultKeyword_2_0_CommaKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '<>' | '!='
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
	 *     (',' 'arithmetic-evaluations' '[' ']')?
	 */
	protected void emit_NumberExpressionEvaluation___CommaKeyword_7_0_ArithmeticEvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('strategy' ',')?
	 */
	protected void emit_QuantitativePropertyRealization___StrategyKeyword_2_0_CommaKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' 'source' '[' ']')?
	 */
	protected void emit_Transformation___CommaKeyword_5_0_SourceKeyword_5_1_LeftSquareBracketKeyword_5_2_RightSquareBracketKeyword_5_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' 'target' '[' ']')?
	 */
	protected void emit_Transformation___CommaKeyword_6_0_TargetKeyword_6_1_LeftSquareBracketKeyword_6_2_RightSquareBracketKeyword_6_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' 'evaluations' '[' ']')?
	 */
	protected void emit_ValueSpecificationExpressionEvaluation___CommaKeyword_7_0_EvaluationsKeyword_7_1_LeftSquareBracketKeyword_7_2_RightSquareBracketKeyword_7_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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

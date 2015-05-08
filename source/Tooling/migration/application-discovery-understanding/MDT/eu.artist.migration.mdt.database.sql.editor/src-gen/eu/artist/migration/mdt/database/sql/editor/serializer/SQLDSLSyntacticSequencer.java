package eu.artist.migration.mdt.database.sql.editor.serializer;

import com.google.inject.Inject;
import eu.artist.migration.mdt.database.sql.editor.services.SQLDSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SQLDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SQLDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_InsertSQL_OtherParserRuleCall_3_a;
	protected AbstractElementAlias match_Model_OtherParserRuleCall_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SQLDSLGrammarAccess) access;
		match_InsertSQL_OtherParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getInsertSQLAccess().getOtherParserRuleCall_3());
		match_Model_OtherParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getModelAccess().getOtherParserRuleCall_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSpaceRule())
			return getSpaceToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOtherRule())
			return getotherToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Space :
	 * 	' '*
	 * ;
	 */
	protected String getSpaceToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * other :
	 * 	ML_COMMENT
	 * 	| 
	 * 	OTHER_COMMAND
	 * ;
	 */
	protected String getotherToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/*";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_InsertSQL_OtherParserRuleCall_3_a.equals(syntax))
				emit_InsertSQL_OtherParserRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Model_OtherParserRuleCall_1_a.equals(syntax))
				emit_Model_OtherParserRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     other*
	 */
	protected void emit_InsertSQL_OtherParserRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     other*
	 */
	protected void emit_Model_OtherParserRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

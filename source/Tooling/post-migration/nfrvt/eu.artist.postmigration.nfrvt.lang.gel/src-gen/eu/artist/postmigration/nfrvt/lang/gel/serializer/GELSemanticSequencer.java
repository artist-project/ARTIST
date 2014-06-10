package eu.artist.postmigration.nfrvt.lang.gel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.DivisionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.EqualsOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterOrEqualThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImplicationOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURI;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessOrEqualThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaxOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaximumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ModulusOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicationOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicativeExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotEqualsOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.OrOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SubstractionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator;
import eu.artist.postmigration.nfrvt.lang.common.serializer.ARTISTCommonSemanticSequencer;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization;
import eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.services.GELGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GELSemanticSequencer extends ARTISTCommonSemanticSequencer {

	@Inject
	private GELGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ArtistCommonPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ArtistCommonPackage.ABSOLUTE_FUNCTION:
				if(context == grammarAccess.getAbsoluteFunctionRule() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberFunctionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_AbsoluteFunction(context, (AbsoluteFunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.ABSOLUTE_OPERATOR:
				if(context == grammarAccess.getAbsoluteOperatorRule()) {
					sequence_AbsoluteOperator(context, (AbsoluteOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.ADDITION_OPERATOR:
				if(context == grammarAccess.getAdditionOperatorRule()) {
					sequence_AdditionOperator(context, (AdditionOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.AND_OPERATOR:
				if(context == grammarAccess.getAndOperatorRule()) {
					sequence_AndOperator(context, (AndOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.AVERAGE_FUNCTION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getAverageFunctionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberFunctionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_AverageFunction(context, (AverageFunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.AVG_OPERATOR:
				if(context == grammarAccess.getAvgOperatorRule()) {
					sequence_AvgOperator(context, (AvgOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralValueExpressionRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.COLLECTION:
				if(context == grammarAccess.getCollectionRule()) {
					sequence_Collection(context, (Collection) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.COMMON_LOGARITHM_FUNCTION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getCommonLogarithmFunctionRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberFunctionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_CommonLogarithmFunction(context, (CommonLogarithmFunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.COMMON_LOGARITHM_OPERATOR:
				if(context == grammarAccess.getCommonLogarithmOperatorRule()) {
					sequence_CommonLogarithmOperator(context, (CommonLogarithmOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.COMPARISON:
				if(context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0()) {
					sequence_Comparison(context, (Comparison) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.CONJUNCTION:
				if(context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0()) {
					sequence_Conjunction(context, (Conjunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.DISJUNCTION:
				if(context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0()) {
					sequence_Disjunction(context, (Disjunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.DIVISION_OPERATOR:
				if(context == grammarAccess.getDivisionOperatorRule()) {
					sequence_DivisionOperator(context, (DivisionOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.EQUALS_OPERATOR:
				if(context == grammarAccess.getEqualsOperatorRule()) {
					sequence_EqualsOperator(context, (EqualsOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.EXPONENTIAL_FUNCTION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExponentialFunctionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberFunctionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_ExponentialFunction(context, (ExponentialFunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.EXPONENTIAL_OPERATOR:
				if(context == grammarAccess.getExponentialOperatorRule()) {
					sequence_ExponentialOperator(context, (ExponentialOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.GREATER_OR_EQUAL_THAN_OPERATOR:
				if(context == grammarAccess.getGreaterOrEqualThanOperatorRule()) {
					sequence_GreaterOrEqualThanOperator(context, (GreaterOrEqualThanOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.GREATER_THAN_OPERATOR:
				if(context == grammarAccess.getGreaterThanOperatorRule()) {
					sequence_GreaterThanOperator(context, (GreaterThanOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.IMPLICATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0()) {
					sequence_Implication(context, (Implication) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.IMPLICATION_OPERATOR:
				if(context == grammarAccess.getImplicationOperatorRule()) {
					sequence_ImplicationOperator(context, (ImplicationOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.IMPORT_NAMESPACE:
				if(context == grammarAccess.getImportNamespaceRule()) {
					sequence_ImportNamespace(context, (ImportNamespace) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.IMPORT_URI:
				if(context == grammarAccess.getImportURIRule()) {
					sequence_ImportURI(context, (ImportURI) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.IMPORT_UR_IOR_NAMESPACE:
				if(context == grammarAccess.getImportURIorNamespaceRule()) {
					sequence_ImportURIorNamespace(context, (ImportURIorNamespace) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.INSTANCE_SPECIFICATION_EXPRESSION:
				if(context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getInstanceSpecificationExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_InstanceSpecificationExpression(context, (InstanceSpecificationExpression) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.LESS_OR_EQUAL_THAN_OPERATOR:
				if(context == grammarAccess.getLessOrEqualThanOperatorRule()) {
					sequence_LessOrEqualThanOperator(context, (LessOrEqualThanOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.LESS_THAN_OPERATOR:
				if(context == grammarAccess.getLessThanOperatorRule()) {
					sequence_LessThanOperator(context, (LessThanOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.MAX_OPERATOR:
				if(context == grammarAccess.getMaxOperatorRule()) {
					sequence_MaxOperator(context, (MaxOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.MAXIMUM_FUNCTION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getMaximumFunctionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberFunctionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_MaximumFunction(context, (MaximumFunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.MIN_OPERATOR:
				if(context == grammarAccess.getMinOperatorRule()) {
					sequence_MinOperator(context, (MinOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.MINIMUM_FUNCTION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getMinimumFunctionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberFunctionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_MinimumFunction(context, (MinimumFunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.MODULUS_OPERATOR:
				if(context == grammarAccess.getModulusOperatorRule()) {
					sequence_ModulusOperator(context, (ModulusOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.MULTIPLICATION_OPERATOR:
				if(context == grammarAccess.getMultiplicationOperatorRule()) {
					sequence_MultiplicationOperator(context, (MultiplicationOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.NATURAL_LOGARITHM_FUNCTION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNaturalLogarithmFunctionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberFunctionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_NaturalLogarithmFunction(context, (NaturalLogarithmFunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.NATURAL_LOGARITHM_OPERATOR:
				if(context == grammarAccess.getNaturalLogarithmOperatorRule()) {
					sequence_NaturalLogarithmOperator(context, (NaturalLogarithmOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.NEGATION:
				if(context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Negation(context, (Negation) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.NOT_EQUALS_OPERATOR:
				if(context == grammarAccess.getNotEqualsOperatorRule()) {
					sequence_NotEqualsOperator(context, (NotEqualsOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.NOT_OPERATOR:
				if(context == grammarAccess.getNotOperatorRule()) {
					sequence_NotOperator(context, (NotOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.NULL_LITERAL:
				if(context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralValueExpressionRule() ||
				   context == grammarAccess.getNullLiteralRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_NullLiteral(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralValueExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberLiteralRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.OBJECT_SPECIFICATION_EXPRESSION:
				if(context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getObjectSpecificationExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_ObjectSpecificationExpression(context, (ObjectSpecificationExpression) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.OR_OPERATOR:
				if(context == grammarAccess.getOrOperatorRule()) {
					sequence_OrOperator(context, (OrOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.PARENTHESIZED_EXPRESSION:
				if(context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_ParenthesizedExpression(context, (ParenthesizedExpression) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.PROPERTY_VALUE_PAIR:
				if(context == grammarAccess.getPropertyValuePairRule()) {
					sequence_PropertyValuePair(context, (PropertyValuePair) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.STRING_LITERAL:
				if(context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralValueExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.SUBSTRACTION_OPERATOR:
				if(context == grammarAccess.getSubstractionOperatorRule()) {
					sequence_SubstractionOperator(context, (SubstractionOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.SUM_FUNCTION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getArithmeticExpressionRule() ||
				   context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberFunctionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getSumFunctionRule()) {
					sequence_SumFunction(context, (SumFunction) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.SUM_OPERATOR:
				if(context == grammarAccess.getSumOperatorRule()) {
					sequence_SumOperator(context, (SumOperator) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.TUPLE:
				if(context == grammarAccess.getTupleRule()) {
					sequence_Tuple(context, (Tuple) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.UNLIMITED_LITERAL:
				if(context == grammarAccess.getBooleanUnitRule() ||
				   context == grammarAccess.getComparableExpressionRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0() ||
				   context == grammarAccess.getLiteralValueExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUnlimitedLiteralRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_UnlimitedLiteral(context, (UnlimitedLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArtistCommonPackage.XOR_OPERATOR:
				if(context == grammarAccess.getXOrOperatorRule()) {
					sequence_XOrOperator(context, (XOrOperator) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == GelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GelPackage.APPLIED_QUALITATIVE_PROPERTY_EVALUATION:
				if(context == grammarAccess.getAppliedPropertyEvaluationRule() ||
				   context == grammarAccess.getAppliedQualitativePropertyEvaluationRule()) {
					sequence_AppliedQualitativePropertyEvaluation(context, (AppliedQualitativePropertyEvaluation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION:
				if(context == grammarAccess.getAppliedPropertyEvaluationRule() ||
				   context == grammarAccess.getAppliedQuantitativePropertyEvaluationRule()) {
					sequence_AppliedQuantitativePropertyEvaluation(context, (AppliedQuantitativePropertyEvaluation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.BOOLEAN_EXPRESSION_EVALUATION:
				if(context == grammarAccess.getBooleanExpressionEvaluationRule() ||
				   context == grammarAccess.getValueExpressionEvaluationRule()) {
					sequence_BooleanExpressionEvaluation(context, (BooleanExpressionEvaluation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.COMPOSITE_GOAL_EVALUATION:
				if(context == grammarAccess.getCompositeGoalEvaluationRule() ||
				   context == grammarAccess.getGoalEvaluationRule()) {
					sequence_CompositeGoalEvaluation(context, (CompositeGoalEvaluation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.GOAL_MODEL_EVALUATION:
				if(context == grammarAccess.getGoalModelEvaluationRule()) {
					sequence_GoalModelEvaluation(context, (GoalModelEvaluation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.HARD_GOAL_EVALUATION:
				if(context == grammarAccess.getGoalEvaluationRule() ||
				   context == grammarAccess.getHardGoalEvaluationRule()) {
					sequence_HardGoalEvaluation(context, (HardGoalEvaluation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.MIGRATION_EVALUATION:
				if(context == grammarAccess.getMigrationEvaluationRule()) {
					sequence_MigrationEvaluation(context, (MigrationEvaluation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.NUMBER_EXPRESSION_EVALUATION:
				if(context == grammarAccess.getNumberExpressionEvaluationRule() ||
				   context == grammarAccess.getValueExpressionEvaluationRule()) {
					sequence_NumberExpressionEvaluation(context, (NumberExpressionEvaluation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION:
				if(context == grammarAccess.getQuantitativePropertyRealizationRule()) {
					sequence_QuantitativePropertyRealization(context, (QuantitativePropertyRealization) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.SOFT_GOAL_EVALUATION:
				if(context == grammarAccess.getGoalEvaluationRule() ||
				   context == grammarAccess.getSoftGoalEvaluationRule()) {
					sequence_SoftGoalEvaluation(context, (SoftGoalEvaluation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.TRANSFORMATION:
				if(context == grammarAccess.getTransformationRule()) {
					sequence_Transformation(context, (Transformation) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.VALUE_SPECIFICATION_EXPRESSION_EVALUATION:
				if(context == grammarAccess.getValueExpressionEvaluationRule() ||
				   context == grammarAccess.getValueSpecificationExpressionEvaluationRule()) {
					sequence_ValueSpecificationExpressionEvaluation(context, (ValueSpecificationExpressionEvaluation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID property=[AppliedQualitativeProperty|QualifiedName] value=ValueSpecification evaluation=NumberExpressionEvaluation)
	 */
	protected void sequence_AppliedQualitativePropertyEvaluation(EObject context, AppliedQualitativePropertyEvaluation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.APPLIED_PROPERTY_EVALUATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.APPLIED_PROPERTY_EVALUATION__NAME));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.APPLIED_PROPERTY_EVALUATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.APPLIED_PROPERTY_EVALUATION__VALUE));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.APPLIED_PROPERTY_EVALUATION__EVALUATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.APPLIED_PROPERTY_EVALUATION__EVALUATION));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.APPLIED_QUALITATIVE_PROPERTY_EVALUATION__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.APPLIED_QUALITATIVE_PROPERTY_EVALUATION__PROPERTY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getPropertyAppliedQualitativePropertyQualifiedNameParserRuleCall_4_0_1(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getValueValueSpecificationParserRuleCall_7_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getEvaluationNumberExpressionEvaluationParserRuleCall_9_0(), semanticObject.getEvaluation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         property=[AppliedQuantitativeProperty|QualifiedName] 
	 *         value=ValueSpecification 
	 *         evaluation=ValueExpressionEvaluation 
	 *         (realizations+=QuantitativePropertyRealization realizations+=QuantitativePropertyRealization*)?
	 *     )
	 */
	protected void sequence_AppliedQuantitativePropertyEvaluation(EObject context, AppliedQuantitativePropertyEvaluation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (result=BooleanLiteral? reason=STRING difference=Number? evaluations+=ValueExpressionEvaluation*)
	 */
	protected void sequence_BooleanExpressionEvaluation(EObject context, BooleanExpressionEvaluation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID goal=[CompositeGoal|QualifiedName] verdict=Verdict reason=STRING conditionEvaluation=BooleanExpressionEvaluation)
	 */
	protected void sequence_CompositeGoalEvaluation(EObject context, CompositeGoalEvaluation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.GOAL_EVALUATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.GOAL_EVALUATION__NAME));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.GOAL_EVALUATION__VERDICT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.GOAL_EVALUATION__VERDICT));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.GOAL_EVALUATION__REASON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.GOAL_EVALUATION__REASON));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.COMPOSITE_GOAL_EVALUATION__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.COMPOSITE_GOAL_EVALUATION__GOAL));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompositeGoalEvaluationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCompositeGoalEvaluationAccess().getGoalCompositeGoalQualifiedNameParserRuleCall_4_0_1(), semanticObject.getGoal());
		feeder.accept(grammarAccess.getCompositeGoalEvaluationAccess().getVerdictVerdictEnumRuleCall_7_0(), semanticObject.getVerdict());
		feeder.accept(grammarAccess.getCompositeGoalEvaluationAccess().getReasonSTRINGTerminalRuleCall_10_0(), semanticObject.getReason());
		feeder.accept(grammarAccess.getCompositeGoalEvaluationAccess().getConditionEvaluationBooleanExpressionEvaluationParserRuleCall_13_0(), semanticObject.getConditionEvaluation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (goalModel=[GoalModel|QualifiedName] verdict=Verdict reason=STRING evaluations+=GoalEvaluation*)
	 */
	protected void sequence_GoalModelEvaluation(EObject context, GoalModelEvaluation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID goal=[HardGoal|QualifiedName] verdict=Verdict reason=STRING conditionEvaluation=BooleanExpressionEvaluation)
	 */
	protected void sequence_HardGoalEvaluation(EObject context, HardGoalEvaluation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.GOAL_EVALUATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.GOAL_EVALUATION__NAME));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.GOAL_EVALUATION__VERDICT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.GOAL_EVALUATION__VERDICT));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.GOAL_EVALUATION__REASON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.GOAL_EVALUATION__REASON));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.HARD_GOAL_EVALUATION__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.HARD_GOAL_EVALUATION__GOAL));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.HARD_GOAL_EVALUATION__CONDITION_EVALUATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.HARD_GOAL_EVALUATION__CONDITION_EVALUATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHardGoalEvaluationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHardGoalEvaluationAccess().getGoalHardGoalQualifiedNameParserRuleCall_4_0_1(), semanticObject.getGoal());
		feeder.accept(grammarAccess.getHardGoalEvaluationAccess().getVerdictVerdictEnumRuleCall_7_0(), semanticObject.getVerdict());
		feeder.accept(grammarAccess.getHardGoalEvaluationAccess().getReasonSTRINGTerminalRuleCall_10_0(), semanticObject.getReason());
		feeder.accept(grammarAccess.getHardGoalEvaluationAccess().getConditionEvaluationBooleanExpressionEvaluationParserRuleCall_13_0(), semanticObject.getConditionEvaluation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         imports+=ImportNamespace* 
	 *         name=QualifiedName 
	 *         date=STRING 
	 *         transformations+=Transformation* 
	 *         propertyEvaluations+=AppliedPropertyEvaluation* 
	 *         evaluation=GoalModelEvaluation
	 *     )
	 */
	protected void sequence_MigrationEvaluation(EObject context, MigrationEvaluation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (result=NumberLiteral? reason=STRING evaluations+=NumberExpressionEvaluation*)
	 */
	protected void sequence_NumberExpressionEvaluation(EObject context, NumberExpressionEvaluation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         strategy=[EvaluationStrategy|QualifiedName]? 
	 *         level=RealizationLevelKind 
	 *         type=RealizationTypeKind 
	 *         values+=ValueSpecification 
	 *         values+=ValueSpecification* 
	 *         precision=EBIGDECIMAL?
	 *     )
	 */
	protected void sequence_QuantitativePropertyRealization(EObject context, QuantitativePropertyRealization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID goal=[SoftGoal|QualifiedName] verdict=Verdict reason=STRING difference=Number?)
	 */
	protected void sequence_SoftGoalEvaluation(EObject context, SoftGoalEvaluation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID pattern=[Pattern|QualifiedName] source+=[NamedElement|QualifiedName]* target+=[NamedElement|QualifiedName]*)
	 */
	protected void sequence_Transformation(EObject context, Transformation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (result=ValueSpecification? reason=STRING evaluations+=ValueExpressionEvaluation*)
	 */
	protected void sequence_ValueSpecificationExpressionEvaluation(EObject context, ValueSpecificationExpressionEvaluation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

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
package eu.artist.postmigration.nfrvt.lang.gml.serializer;

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
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalComparison;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalConjunction;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalDisjunction;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalNegation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.ParenthesizedGoalExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Workload;
import eu.artist.postmigration.nfrvt.lang.gml.services.GMLGrammarAccess;
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
public class GMLSemanticSequencer extends ARTISTCommonSemanticSequencer {

	@Inject
	private GMLGrammarAccess grammarAccess;
	
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
		else if(semanticObject.eClass().getEPackage() == GmlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GmlPackage.APPLIED_QUALITATIVE_PROPERTY:
				if(context == grammarAccess.getAppliedPropertyRule() ||
				   context == grammarAccess.getAppliedQualitativePropertyRule()) {
					sequence_AppliedQualitativeProperty(context, (AppliedQualitativeProperty) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY:
				if(context == grammarAccess.getAppliedPropertyRule() ||
				   context == grammarAccess.getAppliedQuantitativePropertyRule()) {
					sequence_AppliedQuantitativeProperty(context, (AppliedQuantitativeProperty) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAppliedQuantitativePropertyExpressionRule() ||
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
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_AppliedQuantitativePropertyExpression(context, (AppliedQuantitativePropertyExpression) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.COMPOSITE_GOAL:
				if(context == grammarAccess.getCompositeGoalRule() ||
				   context == grammarAccess.getGoalRule()) {
					sequence_CompositeGoal(context, (CompositeGoal) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.GOAL_BOOLEAN_LITERAL:
				if(context == grammarAccess.getGoalBooleanLiteralRule() ||
				   context == grammarAccess.getGoalBooleanUnitRule() ||
				   context == grammarAccess.getGoalComparisonRule() ||
				   context == grammarAccess.getGoalComparisonAccess().getGoalComparisonLeftAction_1_0() ||
				   context == grammarAccess.getGoalConjunctionRule() ||
				   context == grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalDisjunctionRule() ||
				   context == grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalExpressionRule() ||
				   context == grammarAccess.getGoalImplicationRule() ||
				   context == grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0()) {
					sequence_GoalBooleanLiteral(context, (GoalBooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.GOAL_COMPARISON:
				if(context == grammarAccess.getGoalComparisonRule() ||
				   context == grammarAccess.getGoalComparisonAccess().getGoalComparisonLeftAction_1_0() ||
				   context == grammarAccess.getGoalConjunctionRule() ||
				   context == grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalDisjunctionRule() ||
				   context == grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalExpressionRule() ||
				   context == grammarAccess.getGoalImplicationRule() ||
				   context == grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0()) {
					sequence_GoalComparison(context, (GoalComparison) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.GOAL_CONJUNCTION:
				if(context == grammarAccess.getGoalConjunctionRule() ||
				   context == grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalDisjunctionRule() ||
				   context == grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalExpressionRule() ||
				   context == grammarAccess.getGoalImplicationRule() ||
				   context == grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0()) {
					sequence_GoalConjunction(context, (GoalConjunction) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.GOAL_DISJUNCTION:
				if(context == grammarAccess.getGoalDisjunctionRule() ||
				   context == grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalExpressionRule() ||
				   context == grammarAccess.getGoalImplicationRule() ||
				   context == grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0()) {
					sequence_GoalDisjunction(context, (GoalDisjunction) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.GOAL_IMPLICATION:
				if(context == grammarAccess.getGoalExpressionRule() ||
				   context == grammarAccess.getGoalImplicationRule() ||
				   context == grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0()) {
					sequence_GoalImplication(context, (GoalImplication) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.GOAL_MODEL:
				if(context == grammarAccess.getGoalModelRule()) {
					sequence_GoalModel(context, (GoalModel) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.GOAL_NEGATION:
				if(context == grammarAccess.getGoalBooleanUnitRule() ||
				   context == grammarAccess.getGoalComparisonRule() ||
				   context == grammarAccess.getGoalComparisonAccess().getGoalComparisonLeftAction_1_0() ||
				   context == grammarAccess.getGoalConjunctionRule() ||
				   context == grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalDisjunctionRule() ||
				   context == grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalExpressionRule() ||
				   context == grammarAccess.getGoalImplicationRule() ||
				   context == grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0() ||
				   context == grammarAccess.getGoalNegationRule()) {
					sequence_GoalNegation(context, (GoalNegation) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.GOAL_REFERENCE:
				if(context == grammarAccess.getGoalBooleanUnitRule() ||
				   context == grammarAccess.getGoalComparisonRule() ||
				   context == grammarAccess.getGoalComparisonAccess().getGoalComparisonLeftAction_1_0() ||
				   context == grammarAccess.getGoalConjunctionRule() ||
				   context == grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalDisjunctionRule() ||
				   context == grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalExpressionRule() ||
				   context == grammarAccess.getGoalImplicationRule() ||
				   context == grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0() ||
				   context == grammarAccess.getGoalReferenceRule()) {
					sequence_GoalReference(context, (GoalReference) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.HARD_GOAL:
				if(context == grammarAccess.getGoalRule() ||
				   context == grammarAccess.getHardGoalRule()) {
					sequence_HardGoal(context, (HardGoal) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.PARENTHESIZED_GOAL_EXPRESSION:
				if(context == grammarAccess.getGoalBooleanUnitRule() ||
				   context == grammarAccess.getGoalComparisonRule() ||
				   context == grammarAccess.getGoalComparisonAccess().getGoalComparisonLeftAction_1_0() ||
				   context == grammarAccess.getGoalConjunctionRule() ||
				   context == grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalDisjunctionRule() ||
				   context == grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getGoalExpressionRule() ||
				   context == grammarAccess.getGoalImplicationRule() ||
				   context == grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0() ||
				   context == grammarAccess.getParenthesizedGoalExpressionRule()) {
					sequence_ParenthesizedGoalExpression(context, (ParenthesizedGoalExpression) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.SOFT_GOAL:
				if(context == grammarAccess.getGoalRule() ||
				   context == grammarAccess.getSoftGoalRule()) {
					sequence_SoftGoal(context, (SoftGoal) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.SOFT_GOAL_IMPACT:
				if(context == grammarAccess.getSoftGoalImpactRule()) {
					sequence_SoftGoalImpact(context, (SoftGoalImpact) semanticObject); 
					return; 
				}
				else break;
			case GmlPackage.WORKLOAD:
				if(context == grammarAccess.getWorkloadRule()) {
					sequence_Workload(context, (Workload) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID property=[QualitativeProperty|QualifiedName] (context+=[NamedElement|QualifiedName] context+=[NamedElement|QualifiedName]*)?)
	 */
	protected void sequence_AppliedQualitativeProperty(EObject context, AppliedQualitativeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[AppliedQuantitativeProperty|QualifiedName]
	 */
	protected void sequence_AppliedQuantitativePropertyExpression(EObject context, AppliedQuantitativePropertyExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         property=[QuantitativeProperty|QualifiedName] 
	 *         (function=MinOperator | function=MaxOperator | function=AvgOperator | function=SumOperator)? 
	 *         context+=[NamedElement|QualifiedName] 
	 *         context+=[NamedElement|QualifiedName]* 
	 *         workload=[Workload|QualifiedName]?
	 *     )
	 */
	protected void sequence_AppliedQuantitativeProperty(EObject context, AppliedQuantitativeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID kind=GoalKind priority=INT condition=GoalExpression)
	 */
	protected void sequence_CompositeGoal(EObject context, CompositeGoal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.GOAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.GOAL__NAME));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.GOAL__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.GOAL__KIND));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.GOAL__PRIORITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.GOAL__PRIORITY));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.COMPOSITE_GOAL__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.COMPOSITE_GOAL__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompositeGoalAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCompositeGoalAccess().getKindGoalKindEnumRuleCall_4_0(), semanticObject.getKind());
		feeder.accept(grammarAccess.getCompositeGoalAccess().getPriorityINTTerminalRuleCall_7_0(), semanticObject.getPriority());
		feeder.accept(grammarAccess.getCompositeGoalAccess().getConditionGoalExpressionParserRuleCall_10_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EBOOLEAN
	 */
	protected void sequence_GoalBooleanLiteral(EObject context, GoalBooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=GoalComparison_GoalComparison_1_0 (operator=EqualsOperator | operator=NotEqualsOperator) right=GoalBooleanUnit)
	 */
	protected void sequence_GoalComparison(EObject context, GoalComparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=GoalConjunction_GoalConjunction_1_0 operator=AndOperator right=GoalComparison)
	 */
	protected void sequence_GoalConjunction(EObject context, GoalConjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getGoalConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getGoalConjunctionAccess().getRightGoalComparisonParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=GoalDisjunction_GoalDisjunction_1_0 (operator=OrOperator | operator=XOrOperator) right=GoalConjunction)
	 */
	protected void sequence_GoalDisjunction(EObject context, GoalDisjunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=GoalImplication_GoalImplication_1_0 operator=ImplicationOperator right=GoalDisjunction)
	 */
	protected void sequence_GoalImplication(EObject context, GoalImplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.GOAL_IMPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getGoalImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getGoalImplicationAccess().getRightGoalDisjunctionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         imports+=ImportNamespace* 
	 *         name=QualifiedName 
	 *         (workloads+=Workload workloads+=Workload*)? 
	 *         (appliedProperties+=AppliedProperty appliedProperties+=AppliedProperty*)? 
	 *         (goals+=Goal goals+=Goal*)?
	 *     )
	 */
	protected void sequence_GoalModel(EObject context, GoalModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=NotOperator value=GoalBooleanUnit)
	 */
	protected void sequence_GoalNegation(EObject context, GoalNegation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[Goal|QualifiedName]
	 */
	protected void sequence_GoalReference(EObject context, GoalReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID kind=GoalKind priority=INT condition=Expression successRate=POSITIVE_SMALL_DECIMAL?)
	 */
	protected void sequence_HardGoal(EObject context, HardGoal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=GoalExpression
	 */
	protected void sequence_ParenthesizedGoalExpression(EObject context, ParenthesizedGoalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=[SoftGoal|QualifiedName] impact=Impact)
	 */
	protected void sequence_SoftGoalImpact(EObject context, SoftGoalImpact semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.SOFT_GOAL_IMPACT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.SOFT_GOAL_IMPACT__TARGET));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.SOFT_GOAL_IMPACT__IMPACT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.SOFT_GOAL_IMPACT__IMPACT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSoftGoalImpactAccess().getTargetSoftGoalQualifiedNameParserRuleCall_0_0_1(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getSoftGoalImpactAccess().getImpactImpactParserRuleCall_1_0(), semanticObject.getImpact());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         kind=GoalKind 
	 *         priority=INT 
	 *         property=[AppliedQualitativeProperty|QualifiedName] 
	 *         threshold=Impact 
	 *         (impacts+=SoftGoalImpact impacts+=SoftGoalImpact*)?
	 *     )
	 */
	protected void sequence_SoftGoal(EObject context, SoftGoal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID activity=[Activity|QualifiedName] pattern=STRING)
	 */
	protected void sequence_Workload(EObject context, Workload semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.WORKLOAD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.WORKLOAD__NAME));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.WORKLOAD__ACTIVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.WORKLOAD__ACTIVITY));
			if(transientValues.isValueTransient(semanticObject, GmlPackage.Literals.WORKLOAD__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GmlPackage.Literals.WORKLOAD__PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkloadAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWorkloadAccess().getActivityActivityQualifiedNameParserRuleCall_3_0_1(), semanticObject.getActivity());
		feeder.accept(grammarAccess.getWorkloadAccess().getPatternSTRINGTerminalRuleCall_6_0(), semanticObject.getPattern());
		feeder.finish();
	}
}

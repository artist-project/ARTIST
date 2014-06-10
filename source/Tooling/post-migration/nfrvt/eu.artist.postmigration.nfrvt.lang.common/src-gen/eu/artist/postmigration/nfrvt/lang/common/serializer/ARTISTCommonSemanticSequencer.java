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
import eu.artist.postmigration.nfrvt.lang.common.services.ARTISTCommonGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ARTISTCommonSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ARTISTCommonGrammarAccess grammarAccess;
	
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
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (operator=AbsoluteOperator value=NumberExpression)
	 */
	protected void sequence_AbsoluteFunction(EObject context, AbsoluteFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {AbsoluteOperator}
	 */
	protected void sequence_AbsoluteOperator(EObject context, AbsoluteOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {AdditionOperator}
	 */
	protected void sequence_AdditionOperator(EObject context, AdditionOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=AdditiveExpression_AdditiveExpression_1_0 (operator=SubstractionOperator | operator=AdditionOperator) right=MultiplicativeExpression)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {AndOperator}
	 */
	protected void sequence_AndOperator(EObject context, AndOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=AvgOperator values+=NumberExpression values+=NumberExpression*)
	 */
	protected void sequence_AverageFunction(EObject context, AverageFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {AvgOperator}
	 */
	protected void sequence_AvgOperator(EObject context, AvgOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EBOOLEAN
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=ValueSpecification values+=ValueSpecification*)
	 */
	protected void sequence_Collection(EObject context, Collection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=CommonLogarithmOperator value=NumberExpression)
	 */
	protected void sequence_CommonLogarithmFunction(EObject context, CommonLogarithmFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CommonLogarithmOperator}
	 */
	protected void sequence_CommonLogarithmOperator(EObject context, CommonLogarithmOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0 (operator=EqualsOperator | operator=NotEqualsOperator) right=BooleanUnit)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Conjunction_Conjunction_1_0 operator=AndOperator right=Comparison)
	 */
	protected void sequence_Conjunction(EObject context, Conjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Disjunction_Disjunction_1_0 (operator=OrOperator | operator=XOrOperator) right=Conjunction)
	 */
	protected void sequence_Disjunction(EObject context, Disjunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DivisionOperator}
	 */
	protected void sequence_DivisionOperator(EObject context, DivisionOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EqualsOperator}
	 */
	protected void sequence_EqualsOperator(EObject context, EqualsOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=ExponentialOperator base=NumberExpression exponent=NumberExpression)
	 */
	protected void sequence_ExponentialFunction(EObject context, ExponentialFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ExponentialOperator}
	 */
	protected void sequence_ExponentialOperator(EObject context, ExponentialOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {GreaterOrEqualThanOperator}
	 */
	protected void sequence_GreaterOrEqualThanOperator(EObject context, GreaterOrEqualThanOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {GreaterThanOperator}
	 */
	protected void sequence_GreaterThanOperator(EObject context, GreaterThanOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ImplicationOperator}
	 */
	protected void sequence_ImplicationOperator(EObject context, ImplicationOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Implication_Implication_1_0 operator=ImplicationOperator right=Disjunction)
	 */
	protected void sequence_Implication(EObject context, Implication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.IMPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_ImportNamespace(EObject context, ImportNamespace semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.IMPORT_NAMESPACE__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.IMPORT_NAMESPACE__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ImportURI(EObject context, ImportURI semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.IMPORT_URI__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.IMPORT_URI__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportURIAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (importURI=STRING | importedNamespace=QualifiedNameWithWildcard)
	 */
	protected void sequence_ImportURIorNamespace(EObject context, ImportURIorNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[InstanceSpecification|QualifiedName]
	 */
	protected void sequence_InstanceSpecificationExpression(EObject context, InstanceSpecificationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LessOrEqualThanOperator}
	 */
	protected void sequence_LessOrEqualThanOperator(EObject context, LessOrEqualThanOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LessThanOperator}
	 */
	protected void sequence_LessThanOperator(EObject context, LessThanOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MaxOperator}
	 */
	protected void sequence_MaxOperator(EObject context, MaxOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=MaxOperator values+=NumberExpression values+=NumberExpression*)
	 */
	protected void sequence_MaximumFunction(EObject context, MaximumFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MinOperator}
	 */
	protected void sequence_MinOperator(EObject context, MinOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=MinOperator values+=NumberExpression values+=NumberExpression*)
	 */
	protected void sequence_MinimumFunction(EObject context, MinimumFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ModulusOperator}
	 */
	protected void sequence_ModulusOperator(EObject context, ModulusOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MultiplicationOperator}
	 */
	protected void sequence_MultiplicationOperator(EObject context, MultiplicationOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=MultiplicativeExpression_MultiplicativeExpression_1_0 
	 *         (operator=MultiplicationOperator | operator=DivisionOperator | operator=ModulusOperator) 
	 *         right=NumberExpression
	 *     )
	 */
	protected void sequence_MultiplicativeExpression(EObject context, MultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=NaturalLogarithmOperator value=NumberExpression)
	 */
	protected void sequence_NaturalLogarithmFunction(EObject context, NaturalLogarithmFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NaturalLogarithmOperator}
	 */
	protected void sequence_NaturalLogarithmOperator(EObject context, NaturalLogarithmOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=NotOperator value=BooleanUnit)
	 */
	protected void sequence_Negation(EObject context, Negation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NotEqualsOperator}
	 */
	protected void sequence_NotEqualsOperator(EObject context, NotEqualsOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NotOperator}
	 */
	protected void sequence_NotOperator(EObject context, NotOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NULL
	 */
	protected void sequence_NullLiteral(EObject context, NullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Number
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[DataType|QualifiedName] (value=Collection | value=Tuple))
	 */
	protected void sequence_ObjectSpecificationExpression(EObject context, ObjectSpecificationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OrOperator}
	 */
	protected void sequence_OrOperator(EObject context, OrOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_ParenthesizedExpression(EObject context, ParenthesizedExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=[Property|QualifiedName] value=ValueSpecification)
	 */
	protected void sequence_PropertyValuePair(EObject context, PropertyValuePair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.PROPERTY_VALUE_PAIR__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.PROPERTY_VALUE_PAIR__PROPERTY));
			if(transientValues.isValueTransient(semanticObject, ArtistCommonPackage.Literals.PROPERTY_VALUE_PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArtistCommonPackage.Literals.PROPERTY_VALUE_PAIR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyQualifiedNameParserRuleCall_0_0_1(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=RelationalExpression_RelationalExpression_1_0_0_0 operator=GreaterThanOperator right=ComparableExpression) | 
	 *         (left=RelationalExpression_RelationalExpression_1_0_1_0 operator=GreaterOrEqualThanOperator right=ComparableExpression) | 
	 *         (left=RelationalExpression_RelationalExpression_1_0_2_0 operator=LessOrEqualThanOperator right=ComparableExpression) | 
	 *         (left=RelationalExpression_RelationalExpression_1_0_3_0 operator=LessThanOperator right=ComparableExpression)
	 *     )
	 */
	protected void sequence_RelationalExpression(EObject context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SubstractionOperator}
	 */
	protected void sequence_SubstractionOperator(EObject context, SubstractionOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=SumOperator values+=NumberExpression values+=NumberExpression*)
	 */
	protected void sequence_SumFunction(EObject context, SumFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SumOperator}
	 */
	protected void sequence_SumOperator(EObject context, SumOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tuples+=PropertyValuePair tuples+=PropertyValuePair*)
	 */
	protected void sequence_Tuple(EObject context, Tuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='*'
	 */
	protected void sequence_UnlimitedLiteral(EObject context, UnlimitedLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {XOrOperator}
	 */
	protected void sequence_XOrOperator(EObject context, XOrOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

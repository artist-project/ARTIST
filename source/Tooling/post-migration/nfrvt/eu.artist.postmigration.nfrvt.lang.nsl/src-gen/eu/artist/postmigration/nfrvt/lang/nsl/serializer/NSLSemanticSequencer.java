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
package eu.artist.postmigration.nfrvt.lang.nsl.serializer;

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
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.nsl.services.NSLGrammarAccess;
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
public class NSLSemanticSequencer extends ARTISTCommonSemanticSequencer {

	@Inject
	private NSLGrammarAccess grammarAccess;
	
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
				   context == grammarAccess.getArithmeticExpressionRule()) {
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
				if(context == grammarAccess.getInstanceSpecificationExpressionRule() ||
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
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0()) {
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
				if(context == grammarAccess.getLiteralValueExpressionRule() ||
				   context == grammarAccess.getNullLiteralRule() ||
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
				if(context == grammarAccess.getObjectSpecificationExpressionRule() ||
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
				if(context == grammarAccess.getParenthesizedExpressionRule()) {
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
				if(context == grammarAccess.getLiteralValueExpressionRule() ||
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
				if(context == grammarAccess.getLiteralValueExpressionRule() ||
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
		else if(semanticObject.eClass().getEPackage() == NslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case NslPackage.BASE_QUANTITATIVE_PROPERTY:
				if(context == grammarAccess.getBaseQuantitativePropertyRule() ||
				   context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getQuantitativePropertyRule()) {
					sequence_BaseQuantitativeProperty(context, (BaseQuantitativeProperty) semanticObject); 
					return; 
				}
				else break;
			case NslPackage.DERIVED_QUANTITATIVE_PROPERTY:
				if(context == grammarAccess.getDerivedQuantitativePropertyRule() ||
				   context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getQuantitativePropertyRule()) {
					sequence_DerivedQuantitativeProperty(context, (DerivedQuantitativeProperty) semanticObject); 
					return; 
				}
				else break;
			case NslPackage.PARENTHESIZED_ARITHMETIC_EXPRESSION:
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
				   context == grammarAccess.getParenthesizedArithmeticExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_ParenthesizedArithmeticExpression(context, (ParenthesizedArithmeticExpression) semanticObject); 
					return; 
				}
				else break;
			case NslPackage.PROPERTY_CATALOGUE:
				if(context == grammarAccess.getPropertyCatalogueRule()) {
					sequence_PropertyCatalogue(context, (PropertyCatalogue) semanticObject); 
					return; 
				}
				else break;
			case NslPackage.PROPERTY_IMPACT:
				if(context == grammarAccess.getPropertyImpactRule()) {
					sequence_PropertyImpact(context, (PropertyImpact) semanticObject); 
					return; 
				}
				else break;
			case NslPackage.QUALITATIVE_PROPERTY:
				if(context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getQualitativePropertyRule()) {
					sequence_QualitativeProperty(context, (QualitativeProperty) semanticObject); 
					return; 
				}
				else break;
			case NslPackage.QUANTITATIVE_PROPERTY_EXPRESSION:
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
				   context == grammarAccess.getQuantitativePropertyExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0()) {
					sequence_QuantitativePropertyExpression(context, (QuantitativePropertyExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING type=[DataType|QualifiedName] direction=DirectionKind (impacts+=PropertyImpact impacts+=PropertyImpact*)?)
	 */
	protected void sequence_BaseQuantitativeProperty(EObject context, BaseQuantitativeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         type=[DataType|QualifiedName] 
	 *         direction=DirectionKind 
	 *         expression=ArithmeticExpression 
	 *         (impacts+=PropertyImpact impacts+=PropertyImpact*)?
	 *     )
	 */
	protected void sequence_DerivedQuantitativeProperty(EObject context, DerivedQuantitativeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ArithmeticExpression
	 */
	protected void sequence_ParenthesizedArithmeticExpression(EObject context, ParenthesizedArithmeticExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=ImportNamespace* name=QualifiedName properties+=Property*)
	 */
	protected void sequence_PropertyCatalogue(EObject context, PropertyCatalogue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=[Property|QualifiedName] impact=Impact)
	 */
	protected void sequence_PropertyImpact(EObject context, PropertyImpact semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NslPackage.Literals.PROPERTY_IMPACT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NslPackage.Literals.PROPERTY_IMPACT__TARGET));
			if(transientValues.isValueTransient(semanticObject, NslPackage.Literals.PROPERTY_IMPACT__IMPACT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NslPackage.Literals.PROPERTY_IMPACT__IMPACT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyImpactAccess().getTargetPropertyQualifiedNameParserRuleCall_0_0_1(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getPropertyImpactAccess().getImpactImpactParserRuleCall_1_0(), semanticObject.getImpact());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING direction=DirectionKind? properties+=[Property|QualifiedName]* (impacts+=PropertyImpact impacts+=PropertyImpact*)?)
	 */
	protected void sequence_QualitativeProperty(EObject context, QualitativeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[QuantitativeProperty|QualifiedName]
	 */
	protected void sequence_QuantitativePropertyExpression(EObject context, QuantitativePropertyExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

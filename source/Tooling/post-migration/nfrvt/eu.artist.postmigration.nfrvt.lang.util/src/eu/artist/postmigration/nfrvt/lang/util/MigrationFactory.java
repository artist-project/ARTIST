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
package eu.artist.postmigration.nfrvt.lang.util;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonFactory;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURI;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaximumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicativeExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.BooleanLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.NumericLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.RelationalLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlFactory;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanUnit;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalComparison;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalConjunction;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalDisjunction;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalNegation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.ParenthesizedGoalExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslFactory;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlFactory;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslFactory;

/**
 * The migration factory encapsulates the access to the different ARTIST 
 * migration language factories (e.g., {@link GmlFactory}) and provides
 * convenient methods for creating objects for any of the migration 
 * languages, i.e., also methods where optional parameters must not be
 * specified explicitly.
 * 
 * @author Martin Fleck
 *
 * @see ArtistCommonFactory
 * @see NslFactory
 * @see EslFactory
 * @see TslFactory
 * @see GmlFactory
 * @see GelFactory
 */
public class MigrationFactory {
	public static final ArtistCommonFactory COMMON = ArtistCommonFactory.eINSTANCE;
	public static final NslFactory NSL = NslFactory.eINSTANCE;
	public static final PmlFactory PML = PmlFactory.eINSTANCE;
	public static final TslFactory TSL = TslFactory.eINSTANCE;
	public static final GmlFactory GML = GmlFactory.eINSTANCE;
	public static final GelFactory GEL = GelFactory.eINSTANCE;
	
	private static EvaluationSettings settings = new EvaluationSettings();
	
	/**
	 * Specifies the {@link EvaluationSettings} for the created evaluation 
	 * objects containing, e.g., the rounding mode.
	 *  
	 * @param settings new settings
	 */
	public static void setSettings(EvaluationSettings settings) {
		MigrationFactory.settings = settings;
	}
	
	/**
	 * Returns the {@link EvaluationSettings} used for the created evaluation 
	 * objects containing, e.g., the rounding mode.
	 */
	public static EvaluationSettings getSettings() {
		return settings;
	}
	
	/**
	 * Removes any invalid characters from the given name to produce a valid
	 * qualified name. 
	 * 
	 * @param name name to be converted to a qualified name
	 * @return valid qualified name
	 */
	public static String toQualifiedName(String name) {
		if(name == null)
			return null;
		return name.replace(" ", "_").replace("^", "");
	}
	
	//
	// COMMON
	//
	
	/**
	 * Creates a new implication with the specified left and right hand side.
	 * An implication is evaluated as stated by 
	 * {@link BooleanLogic#implies(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS => RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created implication
	 * 
	 * @see BooleanLogic#implies(Boolean, Boolean)
	 */
	public static Implication createImplication(Disjunction left, Disjunction right) {
		Implication implication = COMMON.createImplication();
		implication.setLeft(left);
		implication.setOperator(COMMON.createImplicationOperator());
		implication.setRight(right);
		return implication;
	}
	
	/**
	 * Creates a new disjunction with the specified left and right hand side.
	 * An implication is evaluated as stated by 
	 * {@link BooleanLogic#or(Boolean, Boolean)} and 
	 * {@link BooleanLogic#xor(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS (or|xor) RHS 
	 * <p/>
	 * Warning: The operator of this disjunction is empty and must be 
	 * set by the user.
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created disjunction
	 * 
	 * @see BooleanLogic#xor(Boolean, Boolean)
	 * @see BooleanLogic#or(Boolean, Boolean)
	 */
	private static Disjunction createDisjunction(Disjunction left, Disjunction right) {
		Disjunction disjunction = COMMON.createDisjunction();
		disjunction.setLeft(left);
		disjunction.setRight(right);
		return disjunction;
	}
	
	/**
	 * Creates a new disjunction with the specified left and right hand side.
	 * An implication is evaluated as stated by 
	 * {@link BooleanLogic#or(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS || RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created disjunction
	 * 
	 * @see BooleanLogic#or(Boolean, Boolean)
	 */
	public static Disjunction createOrDisjunction(Disjunction left, Disjunction right) {
		Disjunction disjunction = createDisjunction(left, right);
		disjunction.setOperator(COMMON.createOrOperator());
		return disjunction;
	}
	
	/**
	 * Creates a new disjunction with the specified left and right hand side.
	 * A disjunction is evaluated as stated by 
	 * {@link BooleanLogic#xor(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS xor RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created disjunction
	 * 
	 * @see BooleanLogic#xor(Boolean, Boolean)
	 */
	public static Disjunction createXOrDisjunction(Disjunction left, Disjunction right) {
		Disjunction disjunction = createDisjunction(left, right);
		disjunction.setOperator(COMMON.createXOrOperator());
		return disjunction;
	}
	
	/**
	 * Creates a new conjunction with the specified left and right hand side.
	 * A conjunction is evaluated as stated by 
	 * {@link BooleanLogic#and(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS && RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created conjunction
	 * 
	 * @see BooleanLogic#and(Boolean, Boolean)
	 */
	public static Conjunction createConjunction(Disjunction left, Disjunction right) {
		Conjunction conjunction = COMMON.createConjunction();
		conjunction.setLeft(left);
		conjunction.setRight(right);
		conjunction.setOperator(COMMON.createAndOperator());
		return conjunction;
	}
	
	/**
	 * Creates a new comparison with the specified left and right hand side.
	 * A comparison is evaluated as stated by 
	 * {@link BooleanLogic#equals(Boolean, Boolean)} and 
	 * {@link BooleanLogic#unequals(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS (==|!=) RHS 
	 * <p/>
	 * Warning: The operator of this comparison is empty and must be 
	 * set by the user.
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created comparison
	 * 
	 * @see BooleanLogic#equals(Boolean, Boolean)
	 * @see BooleanLogic#unequals(Boolean, Boolean)
	 */
	private static Comparison createComparison(BooleanUnit left, BooleanUnit right) {
		Comparison expression = COMMON.createComparison();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	/**
	 * Creates a new comparison with the specified left and right hand side.
	 * A comparison is evaluated as stated by 
	 * {@link BooleanLogic#equals(Boolean, Boolean)},
	 * <p/>
	 * Mathematical expression: LHS == RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created comparison
	 * 
	 * @see BooleanLogic#equals(Boolean, Boolean)
	 */
	public static Comparison createEqualsComparison(BooleanUnit left, BooleanUnit right) {
		Comparison expression = createComparison(left, right);
		expression.setOperator(COMMON.createEqualsOperator());
		return expression;
	}
	
	/**
	 * Creates a new comparison with the specified left and right hand side.
	 * A comparison is evaluated as stated by 
	 * {@link BooleanLogic#unequals(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS != RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created comparison
	 * 
	 * @see BooleanLogic#unequals(Boolean, Boolean)
	 */
	public static Comparison createNotEqualsComparison(BooleanUnit left, BooleanUnit right) {
		Comparison expression = createComparison(left, right);
		expression.setOperator(COMMON.createNotEqualsOperator());
		return expression;
	}
	
	/**
	 * Creates a new negation with the specified boolean expression.
	 * A negation is evaluated as stated by 
	 * {@link BooleanLogic#not(Boolean)}.
	 * <p/>
	 * Mathematical expression: !Expression 
	 * 
	 * @param expression boolean expression
	 * @return newly created negation
	 * 
	 * @see BooleanLogic#not(Boolean)
	 */
	public static Negation createNegation(BooleanUnit expression) {
		Negation negation = COMMON.createNegation();
		negation.setOperator(COMMON.createNotOperator());
		negation.setValue(expression);
		return negation;
	}
	
	/**
	 * Creates a new relational expression with the specified left-hand and
	 * right-hand side.
	 * <p/>
	 * Relational expression: LHS op RHS
	 * <p/>
	 * Warning: The operator of this expression is empty and must be 
	 * set by the user.
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	protected static RelationalExpression createRelationalExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = COMMON.createRelationalExpression();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	/**
	 * Creates a new greater-than expression with the specified 
	 * left-hand and right-hand side.
	 * This expression is evaluated as stated by 
	 * {@link RelationalLogic#greater(ValueSpecification, ValueSpecification)}.
	 * <p/>
	 * Relational expression: LHS > RHS
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	public static RelationalExpression createGreaterThanExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = createRelationalExpression(left, right);
		expression.setOperator(COMMON.createGreaterThanOperator());
		return expression;
	}
	
	/**
	 * Creates a new greater or equal-than expression with the specified 
	 * left-hand and right-hand side.
	 * This expression is evaluated as stated by 
	 * {@link RelationalLogic#greaterOrEqual(ValueSpecification, ValueSpecification)}.
	 * <p/>
	 * Relational expression: LHS >= RHS
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	public static RelationalExpression createGreaterOrEqualThanExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = createRelationalExpression(left, right);
		expression.setOperator(COMMON.createGreaterOrEqualThanOperator());
		return expression;
	}
	
	/**
	 * Creates a new less-than expression with the specified 
	 * left-hand and right-hand side.
	 * This expression is evaluated as stated by 
	 * {@link RelationalLogic#less(ValueSpecification, ValueSpecification)}.
	 * <p/>
	 * Relational expression: LHS < RHS
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	public static RelationalExpression createLessThanExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = createRelationalExpression(left, right);
		expression.setOperator(COMMON.createLessThanOperator());
		return expression;
	}
	
	/**
	 * Creates a new less-or-equal-than expression with the specified 
	 * left-hand and right-hand side.
	 * This expression is evaluated as stated by 
	 * {@link RelationalLogic#lessOrEqual(ValueSpecification, ValueSpecification)}.
	 * <p/>
	 * Relational expression: LHS <= RHS
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	public static RelationalExpression createLessOrEqualThanExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = createRelationalExpression(left, right);
		expression.setOperator(COMMON.createLessOrEqualThanOperator());
		return expression;
	}
	
	/**
	 * Creates parenthesis around the given expression.
	 * <p/>
	 * Relational expression: (value)
	 * 
	 * @param value expression to be parenthesized
	 * @return newly created expression
	 */
	public static ParenthesizedExpression createParenthesizedExpression(Expression value) {
		ParenthesizedExpression expression = COMMON.createParenthesizedExpression();
		expression.setValue(value);
		return expression;
	}
	
	/**
	 * Creates a new addition-expression with the specified left-hand and
	 * right-hand side.
	 * <p/>
	 * Mathematical expression: LHS (+|-) RHS
	 * <p/>
	 * Warning: The operator of this expression is empty and must be 
	 * set by the user.
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	protected static AdditiveExpression createAdditiveExpression(Disjunction left, Disjunction right) {
		AdditiveExpression expression = COMMON.createAdditiveExpression();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	/**
	 * Creates a new "plus"-expression with the specified 
	 * left-hand and right-hand side.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#add(BigDecimal, BigDecimal)}
	 * <p/>
	 * Mathematical expression: LHS + RHS
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	public static AdditiveExpression createAdditionExpression(Disjunction left, Disjunction right) {
		AdditiveExpression expression = createAdditiveExpression(left, right);
		expression.setOperator(COMMON.createAdditionOperator());
		return expression;
	}
	
	/**
	 * Creates a new "minus"-expression with the specified 
	 * left-hand and right-hand side.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#subtract(BigDecimal, BigDecimal)}
	 * <p/>
	 * Mathematical expression: LHS - RHS
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	public static AdditiveExpression createSubstractionExpression(Disjunction left, Disjunction right) {
		AdditiveExpression expression = createAdditiveExpression(left, right);
		expression.setOperator(COMMON.createSubstractionOperator());
		return expression;
	}
	
	/**
	 * Creates a new multiplicative-expression with the specified left-hand and
	 * right-hand side.
	 * <p/>
	 * Mathematical expression: LHS (*|/|%) RHS
	 * <p/>
	 * Warning: The operator of this expression is empty and must be 
	 * set by the user.
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	protected static MultiplicativeExpression createMultiplicativeExpression(Disjunction left, Disjunction right) {
		MultiplicativeExpression expression = COMMON.createMultiplicativeExpression();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	/**
	 * Creates a new "multiply"-expression with the specified 
	 * left-hand and right-hand side.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#multiply(BigDecimal, BigDecimal)}
	 * <p/>
	 * Mathematical expression: LHS * RHS
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	public static MultiplicativeExpression createMultiplicationExpression(Disjunction left, Disjunction right) {
		MultiplicativeExpression expression = createMultiplicativeExpression(left, right);
		expression.setOperator(COMMON.createMultiplicationOperator());
		return expression;
	}
	
	/**
	 * Creates a new "divide"-expression with the specified 
	 * left-hand and right-hand side.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#divide(BigDecimal, BigDecimal)}
	 * <p/>
	 * Mathematical expression: LHS / RHS
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	public static MultiplicativeExpression createDivisionExpression(Disjunction left, Disjunction right) {
		MultiplicativeExpression expression = createMultiplicativeExpression(left, right);
		expression.setOperator(COMMON.createDivisionOperator());
		return expression;
	}
	
	/**
	 * Creates a new "modulo"-expression with the specified 
	 * left-hand and right-hand side.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#modulo(BigDecimal, BigDecimal)}
	 * <p/>
	 * Mathematical expression: LHS % RHS
	 *
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return newly created expression
	 */
	public static MultiplicativeExpression createModuloExpression(Disjunction left, Disjunction right) {
		MultiplicativeExpression expression = createMultiplicativeExpression(left, right);
		expression.setOperator(COMMON.createModulusOperator());
		return expression;
	}
	
	/**
	 * Creates a new "maximum"-expression with the specified 
	 * values.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#max(List)}
	 * <p/>
	 * Mathematical expression: max(value1, value2, value3, ...)
	 *
	 * @param values list of values
	 * @return newly created expression
	 */
	public static MaximumFunction createMaximumFunction(Iterable<? extends NumberExpression> values) {
		MaximumFunction f = COMMON.createMaximumFunction();
		CollectionUtil.add(values, f.getValues());
		f.setOperator(COMMON.createMaxOperator());
		return f;
	}
	
	/**
	 * Creates a new "minimum"-expression with the specified 
	 * values.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#min(List)}
	 * <p/>
	 * Mathematical expression: min(value1, value2, value3, ...)
	 *
	 * @param values list of values
	 * @return newly created expression
	 */
	public static MinimumFunction createMinimumFunction(Iterable<? extends NumberExpression> values) {
		MinimumFunction f = COMMON.createMinimumFunction();
		CollectionUtil.add(values, f.getValues());
		f.setOperator(COMMON.createMinOperator());
		return f;
	}
	
	/**
	 * Creates a new "average"-expression with the specified 
	 * values.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#avg(List)}
	 * <p/>
	 * Mathematical expression: avg(value1, value2, value3, ...)
	 *
	 * @param values list of values
	 * @return newly created expression
	 */
	public static AverageFunction createAverageFunction(Iterable<? extends NumberExpression> values) {
		AverageFunction f = COMMON.createAverageFunction();
		CollectionUtil.add(values, f.getValues());
		f.setOperator(COMMON.createAvgOperator());
		return f;
	}
	
	/**
	 * Creates a new "sum"-expression with the specified 
	 * values.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#sum(List)}
	 * <p/>
	 * Mathematical expression: sum(value1, value2, value3, ...)
	 *
	 * @param values list of values
	 * @return newly created expression
	 */
	public static SumFunction createSumFunction(Iterable<? extends NumberExpression> values) {
		SumFunction f = COMMON.createSumFunction();
		CollectionUtil.add(values, f.getValues());
		f.setOperator(COMMON.createSumOperator());
		return f;
	}
	
	/**
	 * Creates a new "exponential"-expression with the specified 
	 * base and exponent.
	 * This expression is evaluated as stated by 
	 * {@link NumericLogic#pow(BigDecimal, BigDecimal)}
	 * <p/>
	 * Mathematical expression: base^exponent
	 *
	 * @param base base
	 * @param exponent exponent
	 * @return newly created expression
	 */
	public static ExponentialFunction createExponentialFunction(NumberExpression base, NumberExpression exponent) {
		ExponentialFunction f = COMMON.createExponentialFunction();
		f.setBase(base);
		f.setExponent(exponent);
		f.setOperator(COMMON.createExponentialOperator());
		return f;
	}
	
	/**
	 * Creates a new "absolute"-expression with the specified value.
	 * This expression is evaluated as stated by
	 * {@link NumericLogic#abs(BigDecimal)}
	 * <p/>
	 * Mathematical expression: abs(value)
	 * 
	 * @param value value
	 * @return newly created expression
	 */
	public static AbsoluteFunction createAbsoluteFunction(NumberExpression value) {
		AbsoluteFunction f = COMMON.createAbsoluteFunction();
		f.setValue(value);
		f.setOperator(COMMON.createAbsoluteOperator());
		return f;
	}
	
	/**
	 * Creates a new "natural logarithm"-expression with the specified value.
	 * This expression is evaluated as stated by
	 * {@link NumericLogic#ln(BigDecimal)}
	 * <p/>
	 * Mathematical expression: ln(value)
	 * 
	 * @param value value
	 * @return newly created expression
	 */
	public static NaturalLogarithmFunction createNaturalLogarithmFunction(NumberExpression value) {
		NaturalLogarithmFunction f = COMMON.createNaturalLogarithmFunction();
		f.setValue(value);
		f.setOperator(COMMON.createNaturalLogarithmOperator());
		return f;
	}
	
	/**
	 * Creates a new "common logarithm"-expression with the specified value.
	 * This expression is evaluated as stated by
	 * {@link NumericLogic#log(BigDecimal)}
	 * <p/>
	 * Mathematical expression: log(value)
	 * 
	 * @param value value
	 * @return newly created expression
	 */
	public static CommonLogarithmFunction createCommonLogarithmFunction(NumberExpression value) {
		CommonLogarithmFunction f = COMMON.createCommonLogarithmFunction();
		f.setValue(value);
		f.setOperator(COMMON.createCommonLogarithmOperator());
		return f;
	}
	
	/**
	 * Creates a new "object specification"-expression for the given data.
	 * <p/>
	 * Example:
	 * <pre>
	 * MyObjectType {
	 *   prop1 = val1,
	 *   prop2 = val2
	 * }
	 * </pre>
	 * 
	 * @param type type of the specified object
	 * @param tuple list of property-value pairs
	 * @return newly created expression
	 */
	public static ObjectSpecificationExpression createTupleObjectExpression(DataType type, Tuple tuple) {
		ObjectSpecificationExpression e = COMMON.createObjectSpecificationExpression();
		e.setType(type);
		e.setValue(tuple);
		return e;
	}
	
	/**
	 * Creates a new "object specification"-expression for the given data.
	 * <p/>
	 * Example:
	 * <pre>
	 * ArrayType [ 1, 2, 3, 4 ]
	 * </pre>
	 * 
	 * @param type type of the specified object
	 * @param collection list of values
	 * @return newly created expression
	 */
	public static ObjectSpecificationExpression createCollectionObjectExpression(DataType type, Collection collection) {
		ObjectSpecificationExpression e = COMMON.createObjectSpecificationExpression();
		e.setType(type);
		e.setValue(collection);
		return e;
	}
	
	/**
	 * Creates a new "object specification"-expression for the given data.
	 * <p/>
	 * Example:
	 * <pre>
	 * MyObjectType {
	 *   prop1 = val1,
	 *   prop2 = val2
	 * }
	 * </pre>
	 * 
	 * @param type type of the specified object
	 * @param pairs list of property-value pairs
	 * @return newly created expression
	 */
	public static ObjectSpecificationExpression createTupleObjectExpression(DataType type, List<PropertyValuePair> pairs) {
		ObjectSpecificationExpression e = COMMON.createObjectSpecificationExpression();
		e.setType(type);
		e.setValue(createTuple(pairs));
		return e;
	}
	
	/**
	 * Creates a new "object specification"-expression for the given data.
	 * <p/>
	 * Example:
	 * <pre>
	 * ArrayType [ 1, 2, 3, 4 ]
	 * </pre>
	 * 
	 * @param type type of the specified object
	 * @param values list of values
	 * @return newly created expression
	 */
	public static ObjectSpecificationExpression createCollectionObjectExpression(DataType type, Iterable<ValueSpecification> values) {
		ObjectSpecificationExpression e = COMMON.createObjectSpecificationExpression();
		e.setType(type);
		e.setValue(createCollection(values));
		return e;
	}
	
	/**
	 * Creates a new "collection"-expression for the given data.
	 * <p/>
	 * Example:
	 * <pre>
	 * [ 1, 2, 3, 4 ]
	 * </pre>
	 * 
	 * @param values list of values
	 * @return newly created expression
	 */
	public static Collection createCollection(Iterable<ValueSpecification> values) {
		Collection collection = COMMON.createCollection();
		CollectionUtil.add(values, collection.getValues());
		return collection;
	}
	
	/**
	 * Creates a new "tuple"-expression for the given data.
	 * <p/>
	 * Example:
	 * <pre>
	 * {
	 *   prop1 = val1,
	 *   prop2 = val2
	 * }
	 * </pre>
	 * 
	 * @param pairs list of property-value pairs
	 * @return newly created expression
	 */
	public static Tuple createTuple(Iterable<PropertyValuePair> pairs) {
		Tuple tuple = COMMON.createTuple();
		CollectionUtil.add(pairs, tuple.getTuples());
		return tuple;
	}
	
	/**
	 * Creates a new "tuple"-expression for the given data.
	 * <p/>
	 * Example:
	 * <pre>
	 * {
	 *   prop1 = val1,
	 *   prop2 = val2
	 * }
	 * </pre>
	 * 
	 * @param pair property-value pair
	 * @return newly created expression
	 */
	public static Tuple createTuple(PropertyValuePair pair) {
		Tuple tuple = COMMON.createTuple();
		CollectionUtil.add(pair, tuple.getTuples());
		return tuple;
	}

	/**
	 * Creates a new "property-value pair"-expression for the given data.
	 * Example:
	 * <pre>
	 *   name = "Value"
	 * </pre>
	 * @param property property
	 * @param value value of property
	 * @return newly created expression
	 */
	public static PropertyValuePair createPropertyValuePair(Property property, ValueSpecification value) {
		PropertyValuePair pair = COMMON.createPropertyValuePair();
		pair.setProperty(property);
		pair.setValue(value);
		return pair;
	}
	
	/**
	 * Creates a new instance specification expression from a UML instance
	 * specification.
	 * 
	 * @param value UML instance specification
	 * @return newly created expression
	 */
	public static InstanceSpecificationExpression createInstanceSpecificationExpression(InstanceSpecification value) {
		InstanceSpecificationExpression e = COMMON.createInstanceSpecificationExpression();
		e.setValue(value);
		return e;
	}
	
	/**
	 * Creates a new literal for the given value.
	 * 
	 * @param value value for which to create a literal
	 * @return literal representing the value
	 */
	public static BooleanLiteral createBooleanLiteral(Boolean value) {
		BooleanLiteral l = COMMON.createBooleanLiteral();
		l.setValue(value);
		return l;
	}
	
	/**
	 * Creates a new literal for the given value.
	 * 
	 * @param value value for which to create a literal
	 * @return literal representing the value
	 */
	public static NumberLiteral createNumberLiteral(BigDecimal value) {
		NumberLiteral l = COMMON.createNumberLiteral();
		if(value.scale() < 0)
			value = value.setScale(0, getSettings().getRoundingMode());
		l.setValue(value);
		return l;
	}
	
	/**
	 * Creates a new literal for the given value.
	 * 
	 * @param value value for which to create a literal
	 * @return literal representing the value
	 */
	public static NumberLiteral createNumberLiteral(double value) {
		return createNumberLiteral(new BigDecimal(value, getSettings().getMathContext()));
	}
	
	/**
	 * Creates a new literal for the given value.
	 * 
	 * @param value value for which to create a literal
	 * @return literal representing the value
	 */
	public static NumberLiteral createNumberLiteral(int value) {
		return createNumberLiteral(NumericLogic.scale(new BigDecimal(value)));
	}
	
	/**
	 * Creates a new literal for the given value.
	 * 
	 * @param value value for which to create a literal
	 * @return literal representing the value
	 */
	public static StringLiteral createStringLiteral(String value) {
		StringLiteral l = COMMON.createStringLiteral();
		l.setValue(value);
		return l;
	}
	
	/**
	 * Creates a new null literal.
	 * 
	 * @return null literal
	 */
	public static NullLiteral createNullLiteral() {
		NullLiteral l = COMMON.createNullLiteral();
		l.setValue("null");
		return l;
	}
	
	/**
	 * Creates a new unlimited literal.
	 * 
	 * @return unlimited literal
	 */
	public static UnlimitedLiteral createUnlimitedLiteral() {
		UnlimitedLiteral l = COMMON.createUnlimitedLiteral();
		l.setValue("*");
		return l;
	}
	
	/**
	 * Creates an import statement using the given uri.
	 * 
	 * @param uriString uri
	 * @return created import
	 */
	public static ImportURI createImportURI(String uriString) {
		ImportURI uri = COMMON.createImportURI();
		uri.setImportURI(toQualifiedName(uriString));
		return uri;
	}
	
	/**
	 * Creates an import statement using the uri of the given object.
	 * 
	 * @param obj object from which to get the uri for import
	 * @return created import
	 */
	public static ImportNamespace createImportNamespace(EObject obj) {
		ImportNamespace uri = COMMON.createImportNamespace();
		String namespace = MigrationResourceUtil.getFullyQualifiedNameWithWildcard(obj);
		if(namespace == null)
			return null;
		uri.setImportedNamespace(namespace);
		return uri;
	}
	
	/**
	 * Creates an import statement using the given namespace.
	 * 
	 * @param namespace namespace
	 * @return created import
	 */
	public static ImportNamespace createImportNamespace(String namespace) {
		ImportNamespace uri = COMMON.createImportNamespace();
		uri.setImportedNamespace(toQualifiedName(namespace));
		return uri;
	}
	
	//
	// NSL
	//
	
	/**
	 * Creates a property catalogue with the given name including all given 
	 * properties.
	 * 
	 * @param qualifiedName name to be used for the property catalogue
	 * @param properties properties to be included in the catalogue
	 * @return created property catalogue
	 */
	public static PropertyCatalogue createPropertyCatalogue(String qualifiedName, Iterable<eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property> properties) {
		PropertyCatalogue catalogue = NSL.createPropertyCatalogue();
		catalogue.setName(toQualifiedName(qualifiedName));
		CollectionUtil.add(properties, catalogue.getProperties());
		return catalogue;
	}
	
	/**
	 * Creates an empty property catalogue with the given name. 
	 * 
	 * @param qualifiedName name to be used for the property catalogue
	 * @return created property catalogue
	 */
	public static PropertyCatalogue createPropertyCatalogue(String qualifiedName) {
		return createPropertyCatalogue(qualifiedName, null);
	}
	
	/**
	 * Creates a complete qualitative property with the given name, 
	 * description, and direction kind.
	 * A hierarchy is given with the provided sub-properties and 
	 * relations are defined by the property impacts.
	 * <p/>
	 * Qualitative properties refer to properties which can not be measured
	 * in a clear-cut manner. These properties are usually
	 * more abstract, e.g., Security. 
	 * 
	 * @param name name of the new property, should be unique
	 * @param description description of the new property
	 * @param direction indicating where 'better' values of this property are
	 * @param properties sub-properties of the newly created property
	 * @param propertyImpacts impacts of the new property to other properties
	 * @return newly created qualitative property
	 */
	public static QualitativeProperty createQualitativeProperty(String name, String description, DirectionKind direction, Iterable<eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property> properties, Iterable<? extends PropertyImpact> propertyImpacts) {
		QualitativeProperty qp = NSL.createQualitativeProperty();
		qp.setName(toQualifiedName(name));
		qp.setDescription(description);
		if(direction != null)
			qp.setDirection(direction);
		CollectionUtil.add(properties, qp.getProperties());
		CollectionUtil.add(propertyImpacts, qp.getImpacts());
		return qp;
	}
	
	/**
	 * Creates a qualitative property with the given name, 
	 * description, and direction kind.
	 * <p/>
	 * Qualitative properties refer to properties which can not be measured
	 * in a clear-cut manner. These properties are usually
	 * more abstract, e.g., Security. 
	 * 
	 * @param name name of the new property, should be unique
	 * @param description description of the new property
	 * @param direction indicating where 'better' values of this property are
	 * @return newly created qualitative property
	 */
	public static QualitativeProperty createQualitativeProperty(String name, String description, DirectionKind direction) {
		return createQualitativeProperty(name, description, direction, null, null);
	}
	
	/**
	 * Creates a qualitative property with the given name and
	 * description.
	 * <p/>
	 * Qualitative properties refer to properties which can not be measured
	 * in a clear-cut manner. These properties are usually
	 * more abstract, e.g., Security. 
	 * 
	 * @param name name of the new property, should be unique
	 * @param description description of the new property
	 * @return newly created qualitative property
	 */
	public static QualitativeProperty createQualitativeProperty(String name, String description) {
		return createQualitativeProperty(name, description, null, null, null);
	}
	
	/**
	 * Creates a complete quantitative base property with the given name, 
	 * description, type, and direction kind.
	 * The new properties relations are defined by the property impacts.
	 * <p/>
	 * Quantitative properties refer to properties which can be measured
	 * in a clear-cut manner. These properties are usually on a low level
	 * of abstraction and often numeric, e.g., response time or utilization.
	 * 
	 * @param name name of the new property, should be unique
	 * @param description description of the new property
	 * @param type data type of the new property
	 * @param direction indicating where 'better' values of this property are
	 * @param propertyImpacts impacts of the new property to other properties
	 * @return newly created property
	 */
	public static BaseQuantitativeProperty createBaseQuantitativeProperty(String name, String description, DataType type, DirectionKind direction, Iterable<? extends PropertyImpact> propertyImpacts) {
		BaseQuantitativeProperty qp = NSL.createBaseQuantitativeProperty();
		qp.setName(toQualifiedName(name));
		qp.setDescription(description);
		qp.setType(type);
		qp.setDirection(direction);
		CollectionUtil.add(propertyImpacts, qp.getImpacts());
		return qp;
	}
	
	/**
	 * Creates a complete quantitative base property with the given name, 
	 * description, type, and direction kind.
	 * <p/>
	 * Quantitative properties refer to properties which can be measured
	 * in a clear-cut manner. These properties are usually on a low level
	 * of abstraction and often numeric, e.g., response time or utilization.
	 *  
	 * @param name name of the new property, should be unique
	 * @param description description of the new property
	 * @param type data type of the new property
	 * @param direction indicating where 'better' values of this property are
	 * @return newly created property
	 */
	public static BaseQuantitativeProperty createBaseQuantitativeProperty(String name, String description, DataType type, DirectionKind direction) {
		return createBaseQuantitativeProperty(name, description, type, direction, null);
	}
	
	/**
	 * Creates a complete quantitative base property with the given name, 
	 * description, and type.
	 * <p/>
	 * Quantitative properties refer to properties which can be measured
	 * in a clear-cut manner. These properties are usually on a low level
	 * of abstraction and often numeric, e.g., response time or utilization.
	 * 
	 * @param name name of the new property, should be unique
	 * @param description description of the new property
	 * @param type data type of the new property
	 * @return newly created property
	 */
	public static BaseQuantitativeProperty createBaseQuantitativeProperty(String name, String description, DataType type) {
		return createBaseQuantitativeProperty(name, description, type, null, null);
	}
	
	/**
	 * Creates a complete derived quantitative property with the given name,
	 * description, type and direction.
	 * The new properties relations are defined by the property impacts.
	 * <p/>
	 * Derived quantitative properties are based on the definition of other 
	 * quantitative properties, both base and derived. The definition is 
	 * given in form of an expression.
	 * 
	 * @param name name of the new property, should be unique
	 * @param description description of the new property
	 * @param type data type of the new property
	 * @param direction indicating where 'better' values of this property are
	 * @param expression definition of this property
	 * @param propertyImpacts impacts of the new property to other properties
	 * @return newly created property
	 */
	public static DerivedQuantitativeProperty createDerivedQuantitativeProperty(String name, String description, DataType type, DirectionKind direction, ArithmeticExpression expression, Iterable<? extends PropertyImpact> propertyImpacts) {
		DerivedQuantitativeProperty qp = NSL.createDerivedQuantitativeProperty();
		qp.setName(toQualifiedName(name));
		qp.setDescription(description);
		qp.setType(type);
		qp.setDirection(direction);
		qp.setExpression(expression);
		CollectionUtil.add(propertyImpacts, qp.getImpacts());
		return qp;
	}
	
	/**
	 * Creates a complete derived quantitative property with the given name,
	 * description, type and direction.
	 * <p/>
	 * Derived quantitative properties are based on the definition of other 
	 * quantitative properties, both base and derived. The definition is 
	 * given in form of an expression.
	 * 
	 * @param name name of the new property, should be unique
	 * @param description description of the new property
	 * @param type data type of the new property
	 * @param direction indicating where 'better' values of this property are
	 * @param expression definition of this property
	 * @return newly created property
	 */
	public static DerivedQuantitativeProperty createDerivedQuantitativeProperty(String name, String description, DataType type, DirectionKind direction, ArithmeticExpression expression) {
		return createDerivedQuantitativeProperty(name, description, type, direction, expression, null);
	}
	
	/**
	 * Creates a property impact relation between a source property and a 
	 * target property. The impact is given as a numerical value between
	 * [-1,1] indicating whether the source property has a positive (positive
	 * value) or negative (negative value) impact on the target property.
	 * The source property is not given explicitly but determined by the
	 * property in which this impact is contained.
	 * 
	 * @param target target property
	 * @param impact quantitative positive or negative impact on the target 
	 * property
	 * @return newly created property impact
	 */
	public static PropertyImpact createPropertyImpact(eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property target, BigDecimal impact) {
		PropertyImpact propertyImpact = NSL.createPropertyImpact();
		propertyImpact.setTarget(target);
		propertyImpact.setImpact(impact);
		return propertyImpact;
	}
	
	/**
	 * Creates a property impact relation between a source property/pattern and
	 * a target property. The impact is given as a numerical value between
	 * [-1,1] indicating whether the source property has a positive (positive
	 * value) or negative (negative value) impact on the target property.
	 * The source property or pattern is not given explicitly but determined by
	 * the element in which this impact is contained.
	 * 
	 * @param target target property
	 * @param impact quantitative positive or negative impact on the target 
	 * property
	 * @return newly created property impact
	 */
	public static PropertyImpact createPropertyImpact(eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property target, double impact) {
		return createPropertyImpact(target, new BigDecimal(impact, getSettings().getMathContext()));
	}
	
	/**
	 * Creates parenthesis around the given arithmetic expression: (value)
	 * 
	 * @param value arithmetic expression that should be parenthesized
	 * @return newly created expression
	 */
	public static ParenthesizedArithmeticExpression createParenthesizedArithmeticExpression(ArithmeticExpression value) {
		ParenthesizedArithmeticExpression expression = NSL.createParenthesizedArithmeticExpression();
		expression.setValue(value);
		return expression;
	}
	
	/**
	 * Creates an expression referring to a quantitative property.
	 * 
	 * @param value property to which the new expression should refer
	 * @return newly created expression
	 */
	public static QuantitativePropertyExpression createQuantitativePropertyExpression(QuantitativeProperty value) {
		QuantitativePropertyExpression expression = NSL.createQuantitativePropertyExpression();
		expression.setValue(value);
		return expression;
	}	
	
	//
	// TSL
	//
	
	/**
	 * Creates a pattern catalogue with the given name including all given 
	 * patterns.
	 * 
	 * @param qualifiedName name to be used for the pattern catalogue
	 * @param patterns patterns to be included in the catalogue
	 * @return created pattern catalogue
	 */
	public static PatternCatalogue createPatternCatalogue(String qualifiedName, Iterable<Pattern> patterns) {
		PatternCatalogue catalogue = TSL.createPatternCatalogue();
		catalogue.setName(toQualifiedName(qualifiedName));
		CollectionUtil.add(patterns, catalogue.getPatterns());
		return catalogue;
	}
	
	/**
	 * Creates a new, empty pattern catalogue with the given name.
	 * 
	 * @param qualifiedName name to be used for the pattern catalogue
	 * @return created pattern catalogue
	 */
	public static PatternCatalogue createPatternCatalogue(String qualifiedName) {
		return createPatternCatalogue(qualifiedName, null);
	}
	
	/**
	 * Creates a new complete pattern with the given data.
	 * 
	 * @param name name of the new pattern, should be unique
	 * @param context context in which this pattern can be applied
	 * @param problem description of the problem this pattern tries to solve
	 * @param solution description of the solution provided by this pattern
	 * @param propertyImpacts impacts this pattern has on properties
	 * @param patternImpacts impacts this pattern has on other patterns
	 * @param relatedPatterns patterns that are connected to this pattern, 
	 * e.g., hierarchically or similarity.
	 * @return newly created pattern
	 */
	public static Pattern createPattern(String name, String context, String problem, String solution, 
			Iterable<? extends PropertyImpact> propertyImpacts, Iterable<? extends PatternImpact> patternImpacts, Iterable<? extends Pattern> relatedPatterns) {
		Pattern pattern = TSL.createPattern();
		pattern.setName(toQualifiedName(name));
		pattern.setContext(context);
		pattern.setProblem(problem);
		pattern.setSolution(solution);
		CollectionUtil.add(propertyImpacts, pattern.getPropertyImpacts());
		CollectionUtil.add(patternImpacts, pattern.getPatternImpacts());
		CollectionUtil.add(relatedPatterns, pattern.getRelatedPatterns());
		return pattern;
	}
	
	/**
	 * Creates a pattern impact relation between a source pattern and a 
	 * target pattern. The impact is given as a numerical value between
	 * [-1,1] indicating whether the source pattern has a positive (positive
	 * value) or negative (negative value) impact on the target pattern.
	 * The source pattern is not given explicitly but determined by the
	 * pattern in which this impact is contained.
	 * 
	 * @param target target pattern
	 * @param impact quantitative positive or negative impact on the target 
	 * pattern
	 * @return newly created pattern impact
	 */
	public static PatternImpact createPatternImpact(Pattern target, BigDecimal impact) {
		PatternImpact patternImpact = TSL.createPatternImpact();
		patternImpact.setTarget(target);
		patternImpact.setImpact(impact);
		return patternImpact;
	}
	
	/**
	 * Creates a pattern impact relation between a source pattern and a 
	 * target pattern. The impact is given as a numerical value between
	 * [-1,1] indicating whether the source pattern has a positive (positive
	 * value) or negative (negative value) impact on the target pattern.
	 * The source pattern is not given explicitly but determined by the
	 * pattern in which this impact is contained.
	 * 
	 * @param target target pattern
	 * @param impact quantitative positive or negative impact on the target 
	 * pattern
	 * @return newly created pattern impact
	 */
	public static PatternImpact createPatternImpact(Pattern target, double impact) {
		return createPatternImpact(target, new BigDecimal(impact, getSettings().getMathContext()));
	}	

	//
	// ESL
	//
	
//	/**
//	 * Creates a evaluation strategy catalogue with the given name including 
//	 * all given evaluation strategies.
//	 * 
//	 * @param name name to be used for the evaluation strategy catalogue
//	 * @param strategies strategies to be included in the catalogue
//	 * @return created evaluation strategy catalogue
//	 */
//	public static EvaluationStrategyCatalogue createEvaluationStrategyCatalogue(String name, Iterable<? extends EvaluationStrategy> strategies) {
//		EvaluationStrategyCatalogue catalogue = ESL.createEvaluationStrategyCatalogue();
//		catalogue.setName(toQualifiedName(name));
//		CollectionUtil.add(strategies, catalogue.getStrategies());
//		return catalogue;
//	}
//	
//	/**
//	 * Creates a new, empty evaluation strategy catalogue with the given name.
//	 * 
//	 * @param name name to be used for the evaluation strategy catalogue
//	 * @return created evaluation strategy catalogue
//	 */
//	public static EvaluationStrategyCatalogue createEvaluationStrategyCatalogue(String name) {
//		return createEvaluationStrategyCatalogue(name, null);
//	}
//	
//	/**
//	 * Creates a new complete evaluation strategy with the given data.
//	 * 
//	 * @param name name of the evaluation strategy
//	 * @param description short description of the strategy
//	 * @param level indicating whether this strategy works on model or on code 
//	 * level
//	 * @param properties properties this strategy can evaluate
//	 * @return newly created evaluation strategy
//	 */
//	public static EvaluationStrategy createEvaluationStrategy(String name, String description, EvaluationStrategyLevelKind level, Iterable<? extends QuantitativeProperty> properties) {
//		EvaluationStrategy strategy = ESL.createEvaluationStrategy();
//		strategy.setName(toQualifiedName(name));
//		strategy.setDescription(description);
//		strategy.setLevel(level);
//		CollectionUtil.add(properties, strategy.getProperties());
//		return strategy;
//	}
//	
//	/**
//	 * Creates a new complete evaluation strategy with the given data.
//	 * 
//	 * @param name name of the evaluation strategy
//	 * @param description short description of the strategy
//	 * @param level indicating whether this strategy works on model or on code 
//	 * level
//	 * @param property property this strategy can evaluate
//	 * @return newly created evaluation strategy
//	 */
//	public static EvaluationStrategy createEvaluationStrategy(String name, String description, EvaluationStrategyLevelKind level, QuantitativeProperty property) {
//		return createEvaluationStrategy(name, description, level, Lists.newArrayList(property));
//	}
	
	//
	// GML
	//
	
	/**
	 * Creates a new complete goal model with the given data.
	 * <p/>
	 * A goal model contains all the goals, both soft goals and hard goals, 
	 * that should be fulfilled through the migration. The goals are set
	 * into the context of a given software system in terms of workloads and 
	 * applied properties, which are used in the goals conditions.
	 * A goal model is considered fulfilled if all top-level goals (see
	 * {@link #createCompositeGoal(String, GoalKind, int, GoalExpression)})
	 * are fulfilled.
	 * 
	 * @param qualifiedName name to be used for the goal model
	 * @param workloads possible software behavior scenarios
	 * @param properties properties applied in the context of the software 
	 * system
	 * @param goals goals representing the objectives of the migration
	 * @return newly created goal model
	 * 
	 * @see HardGoal
	 * @see SoftGoal
	 */
	public static GoalModel createGoalModel(String qualifiedName, Iterable<? extends Workload> workloads, Iterable<? extends AppliedProperty> properties, Iterable<? extends Goal> goals) {
		GoalModel goalModel = GML.createGoalModel();
		goalModel.setName(toQualifiedName(qualifiedName));
		CollectionUtil.add(workloads, goalModel.getWorkloads());
		CollectionUtil.add(properties, goalModel.getAppliedProperties());
		CollectionUtil.add(goals, goalModel.getGoals());		
		return goalModel;
	}
	
	/**
	 * Creates a new empty goal model with the given name.
	 * <p/>
	 * A goal model contains all the goals, both soft goals and hard goals, 
	 * that should be fulfilled through the migration. The goals are set
	 * into the context of a given software system in terms of workloads and 
	 * applied properties, which are used in the goals conditions.
	 * 
	 * @param qualifiedName name to be used for the goal model
	 * @return newly created goal model
	 * 
	 * @see HardGoal
	 * @see SoftGoal
	 */
	public static GoalModel createGoalModel(String qualifiedName) {
		return createGoalModel(qualifiedName, null, null, null);
	}
	
	/**
	 * Creates a workload with the given data.
	 * <p/>
	 * A workload describes a certain usage scenario modeled by the activity 
	 * that is executed according to the given pattern for open and closed 
	 * workloads. The specified executed behavior is given a name so it can
	 * be referred to in goals. 
	 * 
	 * @param name name of the workload
	 * @param activity scenario describing the software behavior
	 * @param pattern pattern specifying how the scenario should be executed
	 * @return created workload
	 */
	public static Workload createWorkload(String name, Activity activity, String pattern) {
		Workload workload = COMMON.createWorkload();
		workload.setName(toQualifiedName(name));
		workload.setActivity(activity);
		workload.setPattern(pattern);
		return workload;
	}
	
	/**
	 * Creates a workload with the given data.
	 * <p/>
	 * A workload describes a certain usage scenario modeled by the activity 
	 * that is executed according to the given pattern for open and closed 
	 * workloads. 
	 * 
	 * @param activity scenario describing the software behavior
	 * @param pattern pattern specifying how the scenario should be executed
	 * @return created workload
	 */
	public static Workload createWorkload(Activity activity, String pattern) {
		Workload workload = COMMON.createWorkload();
		workload.setActivity(activity);
		workload.setPattern(pattern);
		return workload;
	}
	
	/**
	 * Creates an applied qualitative property with the given data.
	 * <p/>
	 * An applied property is a property set into the context of a software 
	 * system, e.g., the response time of a specific function or the
	 * language of the whole application. If no context is set, it is
	 * assumed that the property refers to the whole application. Qualitative 
	 * properties are used in soft goals.
	 * 
	 * @param name name for the applied property
	 * @param property property of interest
	 * @param context reference to the software system for which the property
	 * is of interest
	 * @return created applied property
	 * 
	 * @see QualitativeProperty
	 * @see SoftGoal
	 */
	public static AppliedQualitativeProperty createAppliedQualitativeProperty(String name, QualitativeProperty property, Iterable<? extends NamedElement> context) {
		AppliedQualitativeProperty appliedQualitativeProperty = GML.createAppliedQualitativeProperty();
		appliedQualitativeProperty.setName(toQualifiedName(name));
		appliedQualitativeProperty.setProperty(property);
		CollectionUtil.add(context, appliedQualitativeProperty.getContext());
		return appliedQualitativeProperty;
	}
	
	/**
	 * Creates an applied qualitative property with the given data.
	 * <p/>
	 * An applied property is a property set into the context of a software 
	 * system, e.g., the response time of a specific function or the
	 * language of the whole application. If no context is set, it is
	 * assumed that the property refers to the whole application. Qualitative 
	 * properties are used in soft goals.
	 * 
	 * @param name name for the applied property
	 * @param property property of interest
	 * @return created applied property
	 * 
	 * @see QualitativeProperty
	 * @see SoftGoal
	 */
	public static AppliedQualitativeProperty createAppliedQualitativeProperty(String name, QualitativeProperty property) {
		return createAppliedQualitativeProperty(name, property, null);
	}
	
	/**
	 * Creates an applied quantitative property with the given data.
	 * <p/>
	 * An applied property is a property set into the context of a software 
	 * system, e.g., the response time of a specific function or the
	 * language of the whole application. If no context is set, it is
	 * assumed that the property refers to the whole application. When no
	 * workload is given, it is assumed that the property should hold in
	 * all possible situations (almost impossible to evaluate for most 
	 * properties).
	 *  
	 * @param name name for the applied property
	 * @param property property of interest
	 * @param function mathematical function applied on the value of the 
	 * property, e.g., minimum or maximum
	 * @param context reference to the software system for which the property
	 * is of interest
	 * @param workload workload for which the property is of interest
	 * @return created applied property
	 * 
	 * @see QuantitativeProperty
	 * @see HardGoal
	 */
	public static AppliedQuantitativeProperty createAppliedQuantitativeProperty(String name, QuantitativeProperty property, Operator function, Iterable<? extends NamedElement> context, Workload workload) {
		AppliedQuantitativeProperty appliedQuantitativeProperty = GML.createAppliedQuantitativeProperty();
		appliedQuantitativeProperty.setName(toQualifiedName(name));
		appliedQuantitativeProperty.setProperty(property);
		if(function != null)
			appliedQuantitativeProperty.setFunction(function);
		CollectionUtil.add(context, appliedQuantitativeProperty.getContext());
		if(workload != null)
			appliedQuantitativeProperty.setWorkload(workload);		
		return appliedQuantitativeProperty;
	}
	
	/**
	 * Creates an applied quantitative property with the given data.
	 * <p/>
	 * An applied property is a property set into the context of a software 
	 * system, e.g., the response time of a specific function or the
	 * language of the whole application. If no context is set, it is
	 * assumed that the property refers to the whole application. When no
	 * workload is given, it is assumed that the property should hold in
	 * all possible situations (almost impossible to evaluate for most 
	 * properties).
	 *  
	 * @param name name for the applied property
	 * @param property property of interest
	 * @return created applied property
	 * 
	 * @see QuantitativeProperty
	 * @see HardGoal
	 */
	public static AppliedQuantitativeProperty createAppliedQuantitativeProperty(String name, QuantitativeProperty property) {
		return createAppliedQuantitativeProperty(name, property, null, null, null);
	}
	
	/**
	 * Creates an applied quantitative property with the given data.
	 * <p/>
	 * An applied property is a property set into the context of a software 
	 * system, e.g., the response time of a specific function or the
	 * language of the whole application. If no context is set, it is
	 * assumed that the property refers to the whole application. When no
	 * workload is given, it is assumed that the property should hold in
	 * all possible situations (almost impossible to evaluate for most 
	 * properties).
	 *  
	 * @param name name for the applied property
	 * @param property property of interest
	 * @param context reference to the software system for which the property
	 * is of interest
	 * @return created applied property
	 * 
	 * @see QuantitativeProperty
	 * @see HardGoal
	 */
	public static AppliedQuantitativeProperty createAppliedQuantitativeProperty(String name, QuantitativeProperty property, Iterable<? extends NamedElement> context) {
		return createAppliedQuantitativeProperty(name, property, null, context, null);
	}
	
	/**
	 * Creates an applied quantitative property with the given data.
	 * <p/>
	 * An applied property is a property set into the context of a software 
	 * system, e.g., the response time of a specific function or the
	 * language of the whole application. If no context is set, it is
	 * assumed that the property refers to the whole application. When no
	 * workload is given, it is assumed that the property should hold in
	 * all possible situations (almost impossible to evaluate for most 
	 * properties).
	 *  
	 * @param name name for the applied property
	 * @param property property of interest
	 * @param context reference to the software system for which the property
	 * is of interest
	 * @param workload workload for which the property is of interest
	 * @return created applied property
	 * 
	 * @see QuantitativeProperty
	 * @see HardGoal
	 */
	public static AppliedQuantitativeProperty createAppliedQuantitativeProperty(String name, QuantitativeProperty property, Iterable<? extends NamedElement> context, Workload workload) {
		return createAppliedQuantitativeProperty(name, property, null, context, workload);
	}
	
	/**
	 * Creates an applied quantitative property with the given data.
	 * <p/>
	 * An applied property is a property set into the context of a software 
	 * system, e.g., the response time of a specific function or the
	 * language of the whole application. If no context is set, it is
	 * assumed that the property refers to the whole application. When no
	 * workload is given, it is assumed that the property should hold in
	 * all possible situations (almost impossible to evaluate for most 
	 * properties).
	 *  
	 * @param name name for the applied property
	 * @param property property of interest
	 * @param function mathematical function applied on the value of the 
	 * property, e.g., minimum or maximum
	 * @param context reference to the software system for which the property
	 * is of interest
	 * @return created applied property
	 * 
	 * @see QuantitativeProperty
	 * @see HardGoal
	 */
	public static AppliedQuantitativeProperty createAppliedQuantitativeProperty(String name, QuantitativeProperty property, Operator function, Iterable<? extends NamedElement> context) {
		return createAppliedQuantitativeProperty(name, property, function, context, null);
	}
	
	/**
	 * Creates a soft goal with the given data.
	 * <p/>
	 * A soft goal is an objective that has no clear-cut way of evaluation, 
	 * i.e., an objective that refers to qualitative properties which can not 
	 * be measured in a clear-cut manner. These goals are usually on a high
	 * level of abstraction, e.g., 'Improve Security'.<br/>
	 * Soft goals are therefore evaluated using impact analysis, i.e., the 
	 * summation of impacts that used optimization patterns have on 
	 * qualitative properties of a system considering the goals priority.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind what the origin of this goal is 
	 * @param priority indicates the importance of the goal, lower value is 
	 * higher importance
	 * @param property property that should be improved
	 * @param threshold how much impact is needed for the goal to be successful
	 * @param impacts the impact the fulfillment of this goal has on other goals
	 * @return newly created goal
	 */
	public static SoftGoal createSoftGoal(String name, GoalKind kind, int priority, AppliedQualitativeProperty property, double threshold, Iterable<? extends SoftGoalImpact> impacts) {
		SoftGoal goal = GML.createSoftGoal();
		goal.setName(toQualifiedName(name));
		goal.setKind(kind);
		goal.setPriority(priority);
		goal.setProperty(property);
		goal.setThreshold(new BigDecimal(threshold, getSettings().getMathContext()));
		CollectionUtil.add(impacts, goal.getImpacts());
		return goal;
	}
	
	/**
	 * Creates a soft goal with the given data.
	 * <p/>
	 * A soft goal is an objective that has no clear-cut way of evaluation, 
	 * i.e., an objective that refers to qualitative properties which can not 
	 * be measured in a clear-cut manner. These goals are usually on a high
	 * level of abstraction, e.g., 'Improve Security'.<br/>
	 * Soft goals are therefore evaluated using impact analysis, i.e., the 
	 * summation of impacts that used optimization patterns have on 
	 * qualitative properties of a system considering the goals priority.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind where the origin of this goal is 
	 * @param priority indicates the importance of the goal, lower value is 
	 * higher importance
	 * @param property property that should be improved
	 * @param threshold how much impact is needed for the goal to be successful
	 * @return newly created goal
	 */
	public static SoftGoal createSoftGoal(String name, GoalKind kind, int priority, AppliedQualitativeProperty property, double threshold) {
		return createSoftGoal(name, kind, priority, property, threshold, null);
	}
	
	/**
	 * Creates an impact-relation to the target soft goal with the given 
	 * impact. The impact is given as a numerical value between
	 * [-1,1] indicating whether the source has a positive (positive
	 * value) or negative (negative value) impact on the target goal.
	 * The source is not given explicitly but determined by the
	 * container of this element. 
	 * 
	 * @param target target soft goal
	 * @param impact impact factor
	 * @return newly created impact
	 */
	public static SoftGoalImpact createSoftGoalImpact(SoftGoal target, BigDecimal impact) {
		SoftGoalImpact goalImpact = GML.createSoftGoalImpact();
		goalImpact.setTarget(target);
		goalImpact.setImpact(impact);
		return goalImpact;
	}
	
	/**
	 * Creates an impact-relation to the target soft goal with the given 
	 * impact. The impact is given as a numerical value between
	 * [-1,1] indicating whether the source has a positive (positive
	 * value) or negative (negative value) impact on the target goal.
	 * The source is not given explicitly but determined by the
	 * container of this element. 
	 * 
	 * @param target target soft goal
	 * @param impact impact factor
	 * @return newly created impact
	 */
	public static SoftGoalImpact createSoftGoalImpact(SoftGoal target, double impact) {
		return createSoftGoalImpact(target, new BigDecimal(impact, getSettings().getMathContext()));
	}
	
	/**
	 * Creates a hard goal with the given data.
	 * <p/>
	 * A hard goal is an objective that has a clear-cut way of evaluation, 
	 * i.e., an objective that refers to quantitative properties which can 
	 * be measured in a clear-cut manner. These goals are usually on a low
	 * level of abstraction, e.g., 'ResponeTime <= 3 seconds'.<br/>
	 * Hard goals are therefore evaluated using evaluation strategies to 
	 * retrieve the value of the quantitative properties used in the goals
	 * condition. The goals success rate specified in how many cases the
	 * condition must be fulfilled for the goal to be seen as successful
	 * (default: 100% = 1.0).
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind where the origin of this goal is
	 * @param priority indicates the importance of the goal, lower value is 
	 * higher importance
	 * @param condition success condition of this goal
	 * @param successRate rate the condition must be fulfilled for the goal
	 * to be seen successful
	 * @return newly created goal
	 * 
	 * @see AppliedQuantitativeProperty
	 */
	public static HardGoal createHardGoal(String name, GoalKind kind, int priority, Expression condition, Double successRate) {
		HardGoal goal = GML.createHardGoal();
		goal.setName(toQualifiedName(name));
		goal.setKind(kind);
		goal.setPriority(priority);
		goal.setCondition(condition);
		if(successRate != null)
			goal.setSuccessRate(new BigDecimal(successRate, getSettings().getMathContext()));
		return goal;
	}
	
	/**
	 * Creates a hard goal with the given data.
	 * <p/>
	 * A hard goal is an objective that has a clear-cut way of evaluation, 
	 * i.e., an objective that refers to quantitative properties which can 
	 * be measured in a clear-cut manner. These goals are usually on a low
	 * level of abstraction, e.g., 'ResponeTime <= 3 seconds'.<br/>
	 * Hard goals are therefore evaluated using evaluation strategies to 
	 * retrieve the value of the quantitative properties used in the goals
	 * condition. The goals success rate specified in how many cases the
	 * condition must be fulfilled for the goal to be seen as successful
	 * (default: 100% = 1.0).
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind where the origin of this goal is
	 * @param priority indicates the importance of the goal, lower value is 
	 * higher importance
	 * @param condition success condition of this goal
	 * @return newly created goal
	 * 
	 * @see AppliedQuantitativeProperty
	 */
	public static HardGoal createHardGoal(String name, GoalKind kind, int priority, Expression condition) {
		return createHardGoal(name, kind, priority, condition, null);
	}
	
	/**
	 * Creates a composite goal with the given data.
	 * <p/>
	 * A composite goal is a way to introduce a hierarchy between goals via a
	 * goal success condition, e.g., 'GoalA and GoalB' must be fulfilled. All 
	 * goals referred to in the condition are considered sub-goals. All goals
	 * that are not sub-goals in any other goals are considered top-level 
	 * goals.<br/>
	 * Composite goals are evaluated using boolean algebra on the evaluated 
	 * sub goals according to this goals condition.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind where the origin of this goal is
	 * @param priority indicates the importance of the goal, lower value is 
	 * higher importance
	 * @param condition success condition of this goal
	 * @return newly created goal
	 */
	public static CompositeGoal createCompositeGoal(String name, GoalKind kind, int priority, GoalExpression condition) {
		CompositeGoal goal = GML.createCompositeGoal();
		goal.setName(toQualifiedName(name));
		goal.setKind(kind);
		goal.setPriority(priority);
		goal.setCondition(condition);
		return goal;
	}
	
	/**
	 * Creates a new implication with the specified left and right hand side.
	 * An implication is evaluated as stated by 
	 * {@link BooleanLogic#implies(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS => RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created implication
	 * 
	 * @see BooleanLogic#implies(Boolean, Boolean)
	 */
	public static GoalImplication createGoalImplication(GoalDisjunction left, GoalDisjunction right) {
		GoalImplication implication = GML.createGoalImplication();
		implication.setLeft(left);
		implication.setOperator(COMMON.createImplicationOperator());
		implication.setRight(right);
		return implication;
	}
	
	/**
	 * Creates a new disjunction with the specified left and right hand side.
	 * An implication is evaluated as stated by 
	 * {@link BooleanLogic#or(Boolean, Boolean)} and 
	 * {@link BooleanLogic#xor(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS (or|xor) RHS 
	 * <p/>
	 * Warning: The operator of this disjunction is empty and must be 
	 * set by the user.
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created disjunction
	 * 
	 * @see BooleanLogic#xor(Boolean, Boolean)
	 * @see BooleanLogic#or(Boolean, Boolean)
	 */
	private static GoalDisjunction createGoalDisjunction(GoalDisjunction left, GoalDisjunction right) {
		GoalDisjunction disjunction = GML.createGoalDisjunction();
		disjunction.setLeft(left);
		disjunction.setRight(right);
		return disjunction;
	}
	
	/**
	 * Creates a new disjunction with the specified left and right hand side.
	 * An implication is evaluated as stated by 
	 * {@link BooleanLogic#or(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS || RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created disjunction
	 * 
	 * @see BooleanLogic#or(Boolean, Boolean)
	 */
	public static GoalDisjunction createGoalOrDisjunction(GoalDisjunction left, GoalDisjunction right) {
		GoalDisjunction disjunction = createGoalDisjunction(left, right);
		disjunction.setOperator(COMMON.createOrOperator());
		return disjunction;
	}
	
	/**
	 * Creates a new disjunction with the specified left and right hand side.
	 * A disjunction is evaluated as stated by 
	 * {@link BooleanLogic#xor(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS xor RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created disjunction
	 * 
	 * @see BooleanLogic#xor(Boolean, Boolean)
	 */
	public static GoalDisjunction createGoalXOrDisjunction(GoalDisjunction left, GoalDisjunction right) {
		GoalDisjunction disjunction = createGoalDisjunction(left, right);
		disjunction.setOperator(COMMON.createXOrOperator());
		return disjunction;
	}
	
	/**
	 * Creates a new conjunction with the specified left and right hand side.
	 * A conjunction is evaluated as stated by 
	 * {@link BooleanLogic#and(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS && RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created conjunction
	 * 
	 * @see BooleanLogic#and(Boolean, Boolean)
	 */
	public static GoalConjunction createGoalConjunction(GoalDisjunction left, GoalDisjunction right) {
		GoalConjunction conjunction = GML.createGoalConjunction();
		conjunction.setLeft(left);
		conjunction.setRight(right);
		conjunction.setOperator(COMMON.createAndOperator());
		return conjunction;
	}
	
	/**
	 * Creates a new comparison with the specified left and right hand side.
	 * A comparison is evaluated as stated by 
	 * {@link BooleanLogic#equals(Boolean, Boolean)} and 
	 * {@link BooleanLogic#unequals(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS (==|!=) RHS 
	 * <p/>
	 * Warning: The operator of this comparison is empty and must be 
	 * set by the user.
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created comparison
	 * 
	 * @see BooleanLogic#equals(Boolean, Boolean)
	 * @see BooleanLogic#unequals(Boolean, Boolean)
	 */
	private static GoalComparison createGoalComparison(GoalBooleanUnit left, GoalBooleanUnit right) {
		GoalComparison expression = GML.createGoalComparison();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	/**
	 * Creates a new comparison with the specified left and right hand side.
	 * A comparison is evaluated as stated by 
	 * {@link BooleanLogic#equals(Boolean, Boolean)},
	 * <p/>
	 * Mathematical expression: LHS == RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created comparison
	 * 
	 * @see BooleanLogic#equals(Boolean, Boolean)
	 */
	public static GoalComparison createGoalEqualsComparison(GoalBooleanUnit left, GoalBooleanUnit right) {
		GoalComparison expression = createGoalComparison(left, right);
		expression.setOperator(COMMON.createEqualsOperator());
		return expression;
	}
	
	/**
	 * Creates a new comparison with the specified left and right hand side.
	 * A comparison is evaluated as stated by 
	 * {@link BooleanLogic#unequals(Boolean, Boolean)}.
	 * <p/>
	 * Mathematical expression: LHS != RHS 
	 * 
	 * @param left left hand side
	 * @param right right hand side 
	 * @return newly created comparison
	 * 
	 * @see BooleanLogic#unequals(Boolean, Boolean)
	 */
	public static Comparison createNotEqualsComparison(GoalBooleanUnit left, GoalBooleanUnit right) {
		GoalComparison expression = createGoalComparison(left, right);
		expression.setOperator(COMMON.createNotEqualsOperator());
		return expression;
	}
	
	/**
	 * Creates a new negation with the specified boolean expression.
	 * A negation is evaluated as stated by 
	 * {@link BooleanLogic#not(Boolean)}.
	 * <p/>
	 * Mathematical expression: !Expression 
	 * 
	 * @param expression boolean expression
	 * @return newly created negation
	 * 
	 * @see BooleanLogic#not(Boolean)
	 */
	public static GoalNegation createGoalNegation(GoalBooleanUnit expression) {
		GoalNegation negation = GML.createGoalNegation();
		negation.setOperator(COMMON.createNotOperator());
		negation.setValue(expression);
		return negation;
	}
	
	/**
	 * Creates a new literal for the given value.
	 * 
	 * @param value value for which to create a literal
	 * @return literal representing the value
	 */
	public static GoalBooleanLiteral createGoalBooleanLiteral(Boolean value) {
		GoalBooleanLiteral l = GML.createGoalBooleanLiteral();
		l.setValue(value);
		return l;
	}
	
	/**
	 * Creates parenthesis around the given expression.
	 * <p/>
	 * Expression: (value)
	 * 
	 * @param value expression to be parenthesized
	 * @return newly created expression
	 */
	public static ParenthesizedGoalExpression createParenthesizedGoalExpression(GoalExpression value) {
		ParenthesizedGoalExpression expression = GML.createParenthesizedGoalExpression();
		expression.setValue(value);
		return expression;
	}
	
	/**
	 * Creates a reference to an existing goal usable in a composite goal
	 * condition (see 
	 * {@link #createCompositeGoal(String, GoalKind, int, GoalExpression)}).
	 * 
	 * @param goal goal to referenced
	 * @return create reference
	 */
	public static GoalReference createGoalReference(Goal goal) {
		GoalReference ref = GML.createGoalReference();
		ref.setValue(goal);
		return ref;
	}
	
	/**
	 * Creates a reference to an applied quantitative property usable in a
	 * hard goal condition (see
	 * {@link #createHardGoal(String, GoalKind, int, Expression, Double)}).
	 * 
	 * @param property applied property to be referenced
	 * @return reference
	 */
	public static AppliedQuantitativePropertyExpression createAppliedQuantitativePropertyExpression(AppliedQuantitativeProperty property) {
		AppliedQuantitativePropertyExpression expression = GML.createAppliedQuantitativePropertyExpression();
		expression.setValue(property);
		return expression;
	}
	
	//
	// GEL
	//
	
	/**
	 * Creates a new migration evaluation with the given data.
	 * <p/>
	 * A migration evaluation encapsulates the evaluation of a complete 
	 * migration process, i.e., the goals specified in the pre-migration phase,
	 * the transformations applied in the migration phase, and the evaluation
	 * of the individual goals done in the post-migration phase.
	 * 
	 * @param qualifiedName name of the evaluation, should be unique
	 * @param date date of the evaluation
	 * @param transformations transformations applied in the migration
	 * @param propertyEvaluations evaluation of the applied properties
	 * @param goalModelEvaluation evaluation of the migration goals
	 * @return newly created migration evaluation
	 */
	public static MigrationEvaluation createMigrationEvaluation(String qualifiedName, Date date, Iterable<? extends Transformation> transformations, Iterable<? extends AppliedPropertyEvaluation> propertyEvaluations, GoalModelEvaluation goalModelEvaluation) {
		MigrationEvaluation evaluation = GEL.createMigrationEvaluation();
		evaluation.setName(toQualifiedName(qualifiedName));
		evaluation.setDate(date);
		CollectionUtil.add(transformations, evaluation.getTransformations());
		CollectionUtil.add(propertyEvaluations, evaluation.getPropertyEvaluations());
		if(goalModelEvaluation != null)
			evaluation.setEvaluation(goalModelEvaluation);
		return evaluation;
	}
	
	public static MigrationEvaluation createMigrationEvaluation(String qualifiedName, Date date) {
		return createMigrationEvaluation(qualifiedName, date, null, null, null);
	}
	
	/**
	 * Creates a new migration evaluation with the given data.
	 * <p/>
	 * A migration evaluation encapsulates the evaluation of a complete 
	 * migration process, i.e., the goals specified in the pre-migration phase,
	 * the transformations applied in the migration phase, and the evaluation
	 * of the individual goals done in the post-migration phase.
	 * 
	 * @param qualifiedName name of the evaluation, should be unique
	 * @param date date of the evaluation
	 * @param goalModelEvaluation evaluation of the migration goals
	 * @return newly created migration evaluation
	 */
	public static MigrationEvaluation createMigrationEvaluation(String qualifiedName, Date date, GoalModelEvaluation goalModelEvaluation) {
		return createMigrationEvaluation(qualifiedName, date, null, null, goalModelEvaluation);
	}
	
	/**
	 * Creates a new migration evaluation with the given data.
	 * <p/>
	 * A migration evaluation encapsulates the evaluation of a complete 
	 * migration process, i.e., the goals specified in the pre-migration phase,
	 * the transformations applied in the migration phase, and the evaluation
	 * of the individual goals done in the post-migration phase.
	 * 
	 * @param qualifiedName name of the evaluation, should be unique
	 * @param date date of the evaluation
	 * @param propertyEvaluations evaluation of the applied properties
	 * @param goalModelEvaluation evaluation of the migration goals
	 * @return newly created migration evaluation
	 */
	public static MigrationEvaluation createMigrationEvaluation(String qualifiedName, Date date, Iterable<? extends AppliedPropertyEvaluation> propertyEvaluations, GoalModelEvaluation goalModelEvaluation) {
		return createMigrationEvaluation(qualifiedName, date, null, propertyEvaluations, goalModelEvaluation);
	}
	
	/**
	 * Creates a new transformation with the given data.
	 * <p/>
	 * A transformation is a pattern applied in the context of a software 
	 * system. When a pattern in applied, all its impacts are activated.
	 * 
	 * @param name name of the transformation, should be unique
	 * @param pattern pattern that has been applied
	 * @param sources source elements in the original application
	 * @param targets target elements in the migrated application
	 * @param context context in which pattern is applied
	 * @param info additional information, e.g, parameters
	 * @return newly created transformation
	 */
	public static Transformation createTransformation(String name, Pattern pattern, Iterable<? extends NamedElement> sources, Iterable<? extends NamedElement> targets, Iterable<? extends NamedElement> context, String info) {
		Transformation transformation = GEL.createTransformation();
		transformation.setName(toQualifiedName(name));
		transformation.setPattern(pattern);
		CollectionUtil.add(sources, transformation.getSource());
		CollectionUtil.add(targets, transformation.getTarget());
		CollectionUtil.add(context, transformation.getContext());
		if(info != null && !info.isEmpty())
			transformation.setInfo(info);
		return transformation;
	}
	
	/**
	 * Creates a new transformation with the given data.
	 * <p/>
	 * A transformation is a pattern applied in the context of a software 
	 * system. When a pattern in applied, all its impacts are activated.
	 * 
	 * @param name name of the transformation, should be unique
	 * @param pattern pattern that has been applied
	 * @param sources source elements in the original application
	 * @param targets target elements in the migrated application
	 * @param context context in which pattern is applied
	 * @return newly created transformation
	 */
	public static Transformation createTransformation(String name, Pattern pattern, Iterable<? extends NamedElement> sources, Iterable<? extends NamedElement> targets, Iterable<? extends NamedElement> context) {
		return createTransformation(name, pattern, sources, targets, context, null);
	}
	
	/**
	 * Creates a new transformation with the given data.
	 * <p/>
	 * A transformation is a pattern applied in the context of a software 
	 * system. When a pattern in applied, all its impacts are activated.
	 * 
	 * @param name name of the transformation, should be unique
	 * @param pattern pattern that has been applied
	 * @param sources source elements in the original application
	 * @param targets target elements in the migrated application
	 * @return newly created transformation
	 */
	public static Transformation createTransformation(String name, Pattern pattern, Iterable<? extends NamedElement> sources, Iterable<? extends NamedElement> targets) {
		return createTransformation(name, pattern, sources, targets, null, null);
	}
	
	/**
	 * Creates a new transformation with the given data.
	 * <p/>
	 * A transformation is a pattern applied in the context of a software 
	 * system. When a pattern in applied, all its impacts are activated.
	 * 
	 * @param name name of the transformation, should be unique
	 * @param pattern pattern that has been applied
	 * @return newly created transformation
	 */
	public static Transformation createTransformation(String name, Pattern pattern) {
		return createTransformation(name, pattern, null, null);
	}
	
	/**
	 * Creates an evaluation for applied qualitative properties. The value
	 * of such a property is the sum of all impacts on this property, e.g.,
	 * from patterns through transformations.
	 * 
	 * @param name name of this evaluation
	 * @param property property that is evaluated
	 * @param value the evaluation result value
	 * @param evaluation the sub-evaluation chain
	 * @return newly created evaluation
	 */
	public static AppliedQualitativePropertyEvaluation createAppliedQualitativePropertyEvaluation(String name, AppliedQualitativeProperty property, ValueSpecification value, NumberExpressionEvaluation evaluation) {
		AppliedQualitativePropertyEvaluation eval = GEL.createAppliedQualitativePropertyEvaluation();
		eval.setName(toQualifiedName(name));
		eval.setProperty(property);
		eval.setValue(value);
		eval.setEvaluation(evaluation);
		return eval;
	}
	
	/**
	 * Creates an evaluation for applied quantitative properties. The value
	 * of such a property is evaluated using the possible evaluation
	 * strategies for this property. The final value is determined by
	 * choosing the first value (for now).
	 * 
	 * @param name name of this evaluation
	 * @param property property that is evaluated
	 * @param value the final evaluation result value
	 * @param evaluation the sub-evaluation chain
	 * @param measurements a list of measurements created by the evaluation
	 * strategies
	 * @return newly created evaluation
	 */
	public static AppliedQuantitativePropertyEvaluation createAppliedQuantitativePropertyEvaluation(String name, AppliedQuantitativeProperty property, ValueSpecification value, ValueExpressionEvaluation evaluation, Iterable<? extends Measurement> measurements) {
		AppliedQuantitativePropertyEvaluation eval = GEL.createAppliedQuantitativePropertyEvaluation();
		eval.setName(toQualifiedName(name));
		eval.setProperty(property);
		eval.setValue(value);
		eval.setEvaluation(evaluation);
		CollectionUtil.add(measurements, eval.getMeasurements());
		return eval;
	}
	
	/**
	 * Creates an evaluation for applied quantitative properties. The value
	 * of such a property is evaluated using the possible evaluation
	 * strategies for this property. The final value is determined by
	 * choosing the first value (for now).
	 * 
	 * @param name name of this evaluation
	 * @param property property that is evaluated
	 * @param value the final evaluation result value
	 * @param evaluation the sub-evaluation chain
	 * @return newly created evaluation
	 */
	public static AppliedQuantitativePropertyEvaluation createAppliedQuantitativePropertyEvaluation(String name, AppliedQuantitativeProperty property, ValueSpecification value, ValueExpressionEvaluation evaluation) {
		return createAppliedQuantitativePropertyEvaluation(name, property, value, evaluation, null);
	}
	
	/**
	 * Creates an evaluation for a goal model. A goal model is considered to be
	 * successful when all top-level goals are fulfilled (see
	 * {@link #createCompositeGoal(String, GoalKind, int, GoalExpression)}).
	 * 
	 * @param goalModel goal model that has been evaluated.
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the verdict
	 * @param evaluations chain of sub-evaluations
	 * @return newly created evaluation
	 */
	public static GoalModelEvaluation createGoalModelEvaluation(GoalModel goalModel, Verdict verdict, String reason, Iterable<? extends GoalEvaluation> evaluations) {
		GoalModelEvaluation eval = GEL.createGoalModelEvaluation();
		eval.setGoalModel(goalModel);
		eval.setVerdict(verdict);
		eval.setReason(reason);
		CollectionUtil.add(evaluations, eval.getEvaluations());
		return eval;
	}
	
	/**
	 * Creates an evaluation for a goal model. A goal model is considered to be
	 * successful when all top-level goals are fulfilled (see
	 * {@link #createCompositeGoal(String, GoalKind, int, GoalExpression)}).
	 * 
	 * @param goalModel goal model that has been evaluated.
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the verdict
	 * @return newly created evaluation
	 */
	public static GoalModelEvaluation createGoalModelEvaluation(GoalModel goalModel, Verdict verdict, String reason) {
		return createGoalModelEvaluation(goalModel, verdict, reason, null);
	}
	
	/**
	 * Creates an evaluation for a soft goal. Soft goals are evaluated using 
	 * impact analysis, i.e., the summation of impacts that used optimization 
	 * patterns (transformations) have on qualitative properties of a system 
	 * considering the goals priority.
	 * 
	 * @param name unique name of the evaluation
	 * @param goal goal that has been evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the verdict
	 * @param difference distance to the goal target value
	 * @return newly created evaluation
	 */
	public static SoftGoalEvaluation createSoftGoalEvaluation(String name, SoftGoal goal, Verdict verdict, String reason, BigDecimal difference) {
		SoftGoalEvaluation eval = GEL.createSoftGoalEvaluation();
		eval.setName(toQualifiedName(name));
		eval.setGoal(goal);
		eval.setVerdict(verdict);
		eval.setReason(reason);
		if(difference != null)
			eval.setDifference(difference);
		return eval;
	}
	
	/**
	 * Creates an evaluation for a soft goal. Soft goals are evaluated using 
	 * impact analysis, i.e., the summation of impacts that used optimization 
	 * patterns (transformations) have on qualitative properties of a system 
	 * considering the goals priority.
	 * 
	 * @param name unique name of the evaluation
	 * @param goal goal that has been evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the verdict
	 * @param difference distance to the goal target value
	 * @return newly created evaluation
	 */
	public static SoftGoalEvaluation createSoftGoalEvaluation(String name, SoftGoal goal, Verdict verdict, String reason, double difference) {
		return createSoftGoalEvaluation(name, goal, verdict, reason, new BigDecimal(difference, getSettings().getMathContext()));
	}
	
	/**
	 * Creates an evaluation for a soft goal. Soft goals are evaluated using 
	 * impact analysis, i.e., the summation of impacts that used optimization 
	 * patterns (transformations) have on qualitative properties of a system 
	 * considering the goals priority.
	 * 
	 * @param name unique name of the evaluation
	 * @param goal goal that has been evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the verdict
	 * @param difference distance to the goal target value
	 * @return newly created evaluation
	 */
	public static SoftGoalEvaluation createSoftGoalEvaluation(String name, SoftGoal goal, Verdict verdict, String reason, int difference) {
		return createSoftGoalEvaluation(name, goal, verdict, reason, new BigDecimal(difference, getSettings().getMathContext()));
	}
	
	/**
	 * Creates an evaluation for a soft goal. Soft goals are evaluated using 
	 * impact analysis, i.e., the summation of impacts that used optimization 
	 * patterns (transformations) have on qualitative properties of a system 
	 * considering the goals priority.
	 * 
	 * @param name unique name of the evaluation
	 * @param goal goal that has been evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the verdict
	 * @return newly created evaluation
	 */
	public static SoftGoalEvaluation createSoftGoalEvaluation(String name, SoftGoal goal, Verdict verdict, String reason) {
		return createSoftGoalEvaluation(name, goal, verdict, reason, null);
	}
	
	/**
	 * Creates an evaluation for a hard goal. Hard goals are therefore 
	 * evaluated using evaluation strategies to retrieve the value of the 
	 * quantitative properties used in the goals condition. The goals success 
	 * rate specified in how many cases the condition must be fulfilled for 
	 * the goal to be seen as successful.
	 * 
	 * @param name unique name of the evaluation
	 * @param goal goal that has been evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the verdict
	 * @param evaluation evaluation of the goal condition
	 * @return newly created evaluation
	 */
	public static HardGoalEvaluation createHardGoalEvaluation(String name, HardGoal goal, Verdict verdict, String reason, BooleanExpressionEvaluation evaluation) {
		HardGoalEvaluation eval = GEL.createHardGoalEvaluation();
		eval.setName(toQualifiedName(name));
		eval.setGoal(goal);
		eval.setVerdict(verdict);
		eval.setReason(reason);
		eval.setConditionEvaluation(evaluation);
		return eval;
	}
	
	/**
	 * Creates an evaluation for a composite goal. Composite goals are 
	 * evaluated using boolean algebra to evaluate the goals condition.
	 * 
	 * @param name unique name of the evaluation
	 * @param goal goal that has been evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the verdict
	 * @param evaluation evaluation of the goal condition
	 * @return newly created evaluation
	 */
	public static CompositeGoalEvaluation createCompositeGoalEvaluation(String name, CompositeGoal goal, Verdict verdict, String reason, BooleanExpressionEvaluation evaluation) {
		CompositeGoalEvaluation eval = GEL.createCompositeGoalEvaluation();
		eval.setName(toQualifiedName(name));
		eval.setGoal(goal);
		eval.setVerdict(verdict);
		eval.setReason(reason);
		eval.setConditionEvaluation(evaluation);
		return eval;
	}
	
	/**
	 * Creates an evaluation for an expression yielding an object result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param evaluations chain of sub-evaluations
	 * @return newly created evaluation
	 */
	public static ValueSpecificationExpressionEvaluation createValueSpecificationExpressionEvaluation(ValueSpecification result, String reason, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		ValueSpecificationExpressionEvaluation eval = GEL.createValueSpecificationExpressionEvaluation();
		if(result != null)
			eval.setResult(copy(result));
		eval.setReason(reason);
		CollectionUtil.add(evaluations, eval.getEvaluations());
		return eval;
	}
	
	/**
	 * Creates an evaluation for an expression yielding an object result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @return newly created evaluation
	 */
	public static ValueSpecificationExpressionEvaluation createValueSpecificationExpressionEvaluation(ValueSpecification result, String reason) {
		return createValueSpecificationExpressionEvaluation(result, reason, null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param difference difference to the target value
	 * @param evaluations chain of sub-evaluations
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason, BigDecimal difference, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		BooleanExpressionEvaluation eval = GEL.createBooleanExpressionEvaluation();
		if(result != null)
			eval.setResult(copy(result));
		eval.setReason(reason);
		if(difference != null)
			eval.setDifference(difference);
		CollectionUtil.add(evaluations, eval.getEvaluations());
		return eval;
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param difference difference to the target value
	 * @param evaluations chain of sub-evaluations
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, BigDecimal difference, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		return createBooleanExpressionEvaluation(ValueUtil.createBooleanLiteralOrNull(result), reason, difference, evaluations);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param difference difference to the target value
	 * @param evaluations chain of sub-evaluations
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, double difference, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		return createBooleanExpressionEvaluation(ValueUtil.createBooleanLiteralOrNull(result), reason, new BigDecimal(difference, getSettings().getMathContext()), evaluations);
	}
	
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param evaluations chain of sub-evaluations
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		return createBooleanExpressionEvaluation(ValueUtil.createBooleanLiteralOrNull(result), reason, null, evaluations);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param difference difference to the target value
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason, BigDecimal difference) {
		return createBooleanExpressionEvaluation(result, reason, difference, null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param difference difference to the target value
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, BigDecimal difference) {
		return createBooleanExpressionEvaluation(result, reason, difference, null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param difference difference to the target value
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason, double difference) {
		return createBooleanExpressionEvaluation(result, reason, new BigDecimal(difference, getSettings().getMathContext()), null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param difference difference to the target value
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, double difference) {
		return createBooleanExpressionEvaluation(result, reason, new BigDecimal(difference, getSettings().getMathContext()), null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param difference difference to the target value
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason, int difference) {
		return createBooleanExpressionEvaluation(result, reason, new BigDecimal(difference, getSettings().getMathContext()), null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param difference difference to the target value
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, int difference) {
		return createBooleanExpressionEvaluation(result, reason, new BigDecimal(difference, getSettings().getMathContext()), null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason) {
		return createBooleanExpressionEvaluation(result, reason, null, null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a boolean result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @return newly created evaluation
	 */
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason) {
		return createBooleanExpressionEvaluation(result, reason, null, null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a numeric result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param evaluations chain of sub-evaluations
	 * @return newly created evaluation
	 */
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(NumberLiteral result, String reason, Iterable<? extends NumberExpressionEvaluation> evaluations) {
		NumberExpressionEvaluation eval = GEL.createNumberExpressionEvaluation();
		if(result != null)
			eval.setResult(copy(result));
		eval.setReason(reason);
		CollectionUtil.add(evaluations, eval.getEvaluations());
		return eval;
	}
	
	/**
	 * Creates an evaluation for an expression yielding a numeric result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @param evaluations chain of sub-evaluations
	 * @return newly created evaluation
	 */
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(BigDecimal result, String reason, Iterable<? extends NumberExpressionEvaluation> evaluations) {
		return createNumberExpressionEvaluation(ValueUtil.createNumberLiteralOrNull(result), reason, evaluations);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a numeric result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @return newly created evaluation
	 */
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(NumberLiteral result, String reason) {
		return createNumberExpressionEvaluation(result, reason, (Iterable<? extends NumberExpressionEvaluation>)null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a numeric result.
	 * 
	 * @param result result of the evaluation
	 * @param reason reason for the result
	 * @return newly created evaluation
	 */
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(BigDecimal result, String reason) {
		return createNumberExpressionEvaluation(result, reason, (Iterable<? extends NumberExpressionEvaluation>)null);
	}
	
	/**
	 * Creates an evaluation for an expression yielding a numeric null result.
	 * 
	 * @param reason reason for the result
	 * @return newly created evaluation
	 */
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(String reason) {
		return createNumberExpressionEvaluation((NumberLiteral)null, reason, (Iterable<? extends NumberExpressionEvaluation>)null);
	}
	
	/**
	 * Same as calling {@link ObjectUtil#copy(EObject)}.
	 * 
	 * @param v object to be copied
	 * @return copy of the provided object
	 */
	public static <T extends EObject> T copy(T v) {
		return ObjectUtil.copy(v);
	}
	
	/**
	 * Creates a new boolean literal based on the given boolean value. 
	 * If the value is null, null is returned.
	 * 
	 * @param b boolean value
	 * @return new boolean literal or null
	 */
	public static BooleanLiteral createBooleanLiteralOrNull(Boolean b) {
		if(b == null)
			return null;
		return createBooleanLiteral(b);
	}
	
	/**
	 * Creates a new measurement model with the given observations.
	 * 
	 * @param observations observations included in the measurement model
	 * @return new measurement model
	 */
	public static MeasurementModel createMeasurementModel(Iterable<? extends Observation> observations) {
		MeasurementModel model = PML.createMeasurementModel();
		CollectionUtil.add(observations, model.getObservations());
		return model;
	}
	
	/**
	 * Creates a new, empty measurement model.
	 * 
	 * @return new measurement model
	 */
	public static MeasurementModel createMeasurementModel() {
		return PML.createMeasurementModel();
	}
	
	/**
	 * Creates a new observation based on the given data.
	 * 
	 * @param toolName name of the tool that made the observation
	 * @param dateTime date of the observation
	 * @param level artifact level on which the observation was made
	 * @param measurements measurements taken during observation
	 * @return new observation
	 */
	public static Observation createObservation(String toolName, Date dateTime, String level, String measureType, Iterable<? extends Measurement> measurements) {
		Observation observation = PML.createObservation();
		if(toolName != null)
			observation.setToolName(toQualifiedName(toolName));
		observation.setDateTime(dateTime);
		if(level != null)
			observation.setLevel(level);
		if(measureType != null && !measureType.isEmpty())
			observation.setMeasurementType(measureType);
		CollectionUtil.add(measurements, observation.getMeasurements());
		return observation;
	}
	
	/**
	 * Creates a new observation based on the given data.
	 * 
	 * @param toolName name of the tool that made the observation
	 * @param dateTime date of the observation
	 * @param measurements measurements taken during observation
	 * @return new observation
	 */
	public static Observation createObservation(String toolName, Date dateTime, Iterable<? extends Measurement> measurements) {
		return createObservation(toolName, dateTime, null, null, measurements);
	}
	
	/**
	 * Creates a new observation based on the given data.
	 * 
	 * @param toolName name of the tool that made the observation
	 * @param dateTime date of the observation
	 * @return new observation
	 */
	public static Observation createObservation(String toolName, Date dateTime) {
		return createObservation(toolName, dateTime, null, null, null);
	}
	
	/**
	 * Creates a new observation based on the given data. The current
	 * date will be used as observation date.
	 * 
	 * @param toolName name of the tool that made the observation
	 * @param measurements measurements taken during observation
	 * @return new observation
	 */
	public static Observation createObservation(String toolName, Iterable<? extends Measurement> measurements) {
		return createObservation(toolName, new Date(), null, null, measurements);
	}
	
	/**
	 * Creates a new observation based on the given data. The current
	 * date will be used as observation date.
	 * 
	 * @param toolName name of the tool that made the observation
	 * @return new observation
	 */
	public static Observation createObservation(String toolName) {
		return createObservation(toolName, new Date(), null, null, null);
	}
	
	/**
	 * Creates a new measurement based on the given data. A unique
	 * name is necessary to reference the measurement in the goal
	 * evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param context element for which the property has been measured
	 * @param workload workload under which the property has been measured
	 * @param measureType type of measurement, e.g., estimated or calculated
	 * @param confidence confidence of the correctness of the measurement [0,1]
	 * @param value measured value
	 * @param info additional information concerning the value
	 * @return new measurement
	 */
	public static DataPointMeasurement createDataPointMeasurement(String name, QuantitativeProperty quantitativeProperty, NamedElement context, Workload workload, BigDecimal confidence, ValueSpecification value, String info) {
		DataPointMeasurement measurement = PML.createDataPointMeasurement();
		measurement.setName(toQualifiedName(name));
		measurement.setProperty(quantitativeProperty);
		measurement.setContext(context);
		if(workload != null) {
			Workload copy = ObjectUtil.copy(workload);
			if(copy.getName() != null)
				copy.setName(null);
			measurement.setWorkload(copy);
		}
		if(confidence != null)
			measurement.setConfidence(confidence);
		measurement.setValue(value);
		if(info != null && !info.isEmpty())
			measurement.setInfo(info);
		return measurement;
	}
	
	/**
	 * Creates a new measurement based on the given data. A unique
	 * name is necessary to reference the measurement in the goal
	 * evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param context element for which the property has been measured
	 * @param workload workload under which the property has been measured
	 * @param measureType type of measurement, e.g., estimated or calculated
	 * @param confidence confidence of the correctness of the measurement [0,1]
	 * @param value measured value
	 * @return new measurement
	 */
	public static DataPointMeasurement createDataPointMeasurement(String name, QuantitativeProperty quantitativeProperty, NamedElement context, Workload workload, BigDecimal confidence, ValueSpecification value) {
		return createDataPointMeasurement(name, quantitativeProperty, context, workload, confidence, value, null);
	}
	
	/**
	 * Creates a new measurement based on the given data. A unique
	 * name is necessary to reference the measurement in the goal
	 * evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param context element for which the property has been measured
	 * @param workload workload under which the property has been measured
	 * @param measureType type of measurement, e.g., estimated or calculated
	 * @param confidence confidence of the correctness of the measurement [0,1]
	 * @param value measured value
	 * @param info additional information concerning the value
	 * @return new measurement
	 */
	public static DataPointMeasurement createDataPointMeasurement(String name, QuantitativeProperty quantitativeProperty, NamedElement context, Workload workload, double confidence, ValueSpecification value, String info) {
		return createDataPointMeasurement(name, quantitativeProperty, context, workload, new BigDecimal(Double.toString(confidence)), value, info);
	}
	
	/**
	 * Creates a new measurement based on the given data. A unique
	 * name is necessary to reference the measurement in the goal
	 * evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param context element for which the property has been measured
	 * @param workload workload under which the property has been measured
	 * @param confidence confidence of the correctness of the measurement [0,1]
	 * @param value measured value
	 * @param info additional information concerning the value
	 * @return new measurement
	 */
	public static DataPointMeasurement createDataPointMeasurement(String name, QuantitativeProperty quantitativeProperty, NamedElement context, Workload workload, ValueSpecification value, String info) {
		return createDataPointMeasurement(name, quantitativeProperty, context, workload, null, value, info);
	}
	
	/**
	 * Creates a new measurement based on the given data. A unique
	 * name is necessary to reference the measurement in the goal
	 * evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param context element for which the property has been measured
	 * @param value measured value
	 * @param info additional information concerning the value
	 * @return new measurement
	 */
	public static DataPointMeasurement createDataPointMeasurement(String name, QuantitativeProperty quantitativeProperty, NamedElement context, ValueSpecification value, String info) {
		return createDataPointMeasurement(name, quantitativeProperty, context, null, null, value, info);
	}
	
	/**
	 * Creates a new measurement based on the given data. A unique
	 * name is necessary to reference the measurement in the goal
	 * evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param context element for which the property has been measured
	 * @param workload workload under which the property has been measured
	 * @param measureType type of measurement, e.g., estimated or calculated
	 * @param confidence confidence of the correctness of the measurement [0,1]
	 * @param value measured value
	 * @return new measurement
	 */
	public static DataPointMeasurement createDataPointMeasurement(String name, QuantitativeProperty quantitativeProperty, NamedElement context, Workload workload, double confidence, ValueSpecification value) {
		return createDataPointMeasurement(name, quantitativeProperty, context, workload, new BigDecimal(Double.toString(confidence)), value, null);
	}
	
	/**
	 * Creates a new measurement based on the given data. A unique
	 * name is necessary to reference the measurement in the goal
	 * evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param context element for which the property has been measured
	 * @param workload workload under which the property has been measured
	 * @param value measured value
	 * @return new measurement
	 */
	public static DataPointMeasurement createDataPointMeasurement(String name, QuantitativeProperty quantitativeProperty, NamedElement context, Workload workload, ValueSpecification value) {
		return createDataPointMeasurement(name, quantitativeProperty, context, workload, null, value, null);
	}
	
	/**
	 * Creates a new measurement based on the given data. A unique
	 * name is necessary to reference the measurement in the goal
	 * evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param provider provider which has been measured
	 * @param service service that has been measured
	 * @param test test that has been used for measurement
	 * @param workload workload that has been used for measurement
	 * @param confidence confidence of the correctness of the measurement [0,1]
	 * @param value measured value
	 * @param info additional information concerning the value
	 * @return new measurement
	 */
	public static BenchmarkMeasurement createBenchmarkMeasurement(String name, QuantitativeProperty quantitativeProperty, EnumerationLiteral provider, String service, String test, String workload, BigDecimal confidence, ValueSpecification value, String info) {
		BenchmarkMeasurement measurement = PML.createBenchmarkMeasurement();
		measurement.setName(toQualifiedName(name));
		measurement.setProperty(quantitativeProperty);
		measurement.setProvider(provider);
		if(service != null)
			measurement.setService(service);
		if(test != null)
			measurement.setTest(test);
		if(workload != null)
			measurement.setWorkload(workload);
		if(confidence != null)
			measurement.setConfidence(confidence);
		measurement.setValue(value);
		if(info != null && !info.isEmpty())
			measurement.setInfo(info);
		return measurement;
	}
	
	/**
	 * Creates a new measurement based on the given data. A unique
	 * name is necessary to reference the measurement in the goal
	 * evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param provider provider which has been measured
	 * @param service service that has been measured
	 * @param test test that has been used for measurement
	 * @param workload workload that has been used for measurement
	 * @param confidence confidence of the correctness of the measurement [0,1]
	 * @param value measured value
	 * @param info additional information concerning the value
	 * @return new measurement
	 */
	public static BenchmarkMeasurement createBenchmarkMeasurement(String name, QuantitativeProperty quantitativeProperty, EnumerationLiteral provider, String service, String test, String workload, double confidence, ValueSpecification value, String info) {
		return createBenchmarkMeasurement(name, quantitativeProperty, provider, service, test, workload, new BigDecimal(Double.toString(confidence)), value, info);
	}
	
	/**
	 * Creates a new measurement based on a time series data. A unique
	 * name is necessary to reference the measurement in the goal evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param context element for which the property has been measured
	 * @param workload workload under which the property has been measured
	 * @param confidence confidence of the correctness of the measurement [0,1]
	 * @param values measured, timed values
	 * @param info additional information concerning the value
	 * @return new measurement
	 */
	public static TimeSeriesMeasurement createTimeSeriesMeasurement(String name, QuantitativeProperty quantitativeProperty, NamedElement context, Workload workload, BigDecimal confidence, List<TimeValuePair> values, String info) {
		TimeSeriesMeasurement measurement = PML.createTimeSeriesMeasurement();
		measurement.setName(toQualifiedName(name));
		measurement.setProperty(quantitativeProperty);
		measurement.setContext(context);
		if(workload != null) {
			Workload copy = ObjectUtil.copy(workload);
			if(copy.getName() != null)
				copy.setName(null);
			measurement.setWorkload(copy);
		}
		if(confidence != null)
			measurement.setConfidence(confidence);
		if(values != null)
			measurement.getValues().addAll(values);
		if(info != null && !info.isEmpty())
			measurement.setInfo(info);
		return measurement;
	}
	
	/**
	 * Creates a new measurement based on a time series data. A unique
	 * name is necessary to reference the measurement in the goal evaluation.
	 * 
	 * @param name unique name of the measurement
	 * @param quantitativeProperty measured property
	 * @param context element for which the property has been measured
	 * @param workload workload under which the property has been measured
	 * @param confidence confidence of the correctness of the measurement [0,1]
	 * @param values measured, timed values
	 * @param info additional information concerning the value
	 * @return new measurement
	 */
	public static TimeSeriesMeasurement createTimeSeriesMeasurement(String name, QuantitativeProperty quantitativeProperty, NamedElement context, Workload workload, double confidence, List<TimeValuePair> values, String info) {
		return createTimeSeriesMeasurement(name, quantitativeProperty, context, workload, new BigDecimal(Double.toString(confidence)), values, info);
	}
	
	/**
	 * Creates a new time value pair for the use in a time series measurement.
	 * 
	 * @param dateTime time of the measurement
	 * @param value value of the measurement
	 * @return new time-value pair
	 */
	public static TimeValuePair createTimeValuePair(Date dateTime, ValueSpecification value) {
		TimeValuePair pair = PML.createTimeValuePair();
		pair.setDateTime(dateTime);
		pair.setValue(value);
		return pair;
	}
}

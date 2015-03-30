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
package eu.artist.postmigration.nfrvt.eval;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.util.PolymorphicDispatcher;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.DivisionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.EqualsOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterOrEqualThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImplicationOperator;
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
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotEqualsOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.OrOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SubstractionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.BooleanLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.NumericLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.RelationalLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.renderer.GELTextRenderer;
import eu.artist.postmigration.nfrvt.lang.util.CollectionUtil;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;
import eu.artist.postmigration.nfrvt.lang.util.ObjectUtil;

/**
 * An expression evaluator is able to evaluate any {@link Expression}. This 
 * class delegates the actual evaluation of objects of type T to methods with 
 * the signature 'evaluate(T)' using a {@link PolymorphicDispatcher}. 
 * Subclasses only need to provide additional evaluate-methods.
 * 
 * @author Martin Fleck
 *
 */
public class ExpressionEvaluator {
		
	protected static GELTextRenderer renderer = new GELTextRenderer();
	private EvaluationSettings settings;

	private PolymorphicDispatcher<? extends ValueExpressionEvaluation> evaluateDispatcher = new PolymorphicDispatcher<>(
			"evaluate", Collections.singletonList(this));
	
	/**
	 * Create an expression evaluator that is able to evaluate any 
	 * {@link Expression}. The given settings specify how numeric evaluations
	 * should be handled, e.g., their precision and their rounding mode.
	 * 
	 * @param settings settings used for the evaluation
	 */
	public ExpressionEvaluator(EvaluationSettings settings) {
		setSettings(settings);
	}
	
	/**
	 * The settings specify how numeric evaluations should be handled, e.g., 
	 * their precision and their rounding mode.
	 * 
	 * @param settings new settings
	 */
	public void setSettings(EvaluationSettings settings) {
		this.settings = settings;
		renderer.setPrecision(settings.getPrecision());
	}
	
	/**
	 * Returns the current settings used for the evaluation.
	 * 
	 * @return current settings
	 */
	public EvaluationSettings getSettings() {
		return settings;
	}
	
	/**
	 * Evaluates the given objects if possible.
	 * 
	 * @param obj object to be evaluated
	 * @return evaluation result or null if the evaluation is not possible
	 */
	public ValueExpressionEvaluation doEvaluate(Object obj) {
		if(obj == null)
			return null;
		return evaluateDispatcher.invoke(obj);
	}
	
	/**
	 * Evaluates the given objects if possible.
	 * 
	 * @param obj object to be evaluated
	 * @param resultClass class the result should have
	 * @return evaluation result or null if the evaluation is not possible or
	 * the result is not an instance of the given class
	 */
	public <T extends ValueExpressionEvaluation> T doEvaluate(Object obj, Class<T> resultClass) {
		if(obj == null)
			return null;
		ValueExpressionEvaluation eval = evaluateDispatcher.invoke(obj);
		return ObjectUtil.asClass(eval, resultClass);
	}
	
	protected ValueExpressionEvaluation evaluate(Implication e) {
		return evaluateBinaryBoolean(e);
	}
	
	protected ValueExpressionEvaluation evaluate(Disjunction e) {
		return evaluateBinaryBoolean(e);
	}
	
	protected ValueExpressionEvaluation evaluate(Conjunction e) {
		return evaluateBinaryBoolean(e);
	}
	
	protected ValueExpressionEvaluation evaluate(Comparison e) {
		return evaluateBinaryRelational(e);
	}
	
	protected ValueExpressionEvaluation evaluateBinaryBoolean(Implication parent) {
		ValueExpressionEvaluation leftEval = doEvaluate(parent.getLeft());
		Boolean left = assertBooleanOrNull(leftEval);
		
		ValueExpressionEvaluation rightEval = doEvaluate(parent.getRight());		
		Boolean right = assertBooleanOrNull(rightEval);

		Boolean result = null;
		
		if(parent.getOperator() instanceof EqualsOperator)
			result = BooleanLogic.equals(left, right);
		
		if(parent.getOperator() instanceof NotEqualsOperator)
			result = BooleanLogic.unequals(left, right);
		
		if(parent.getOperator() instanceof AndOperator)
			result = BooleanLogic.and(left, right);
		
		if(parent.getOperator() instanceof OrOperator)
			result = BooleanLogic.or(left, right);
		
		if(parent.getOperator() instanceof XOrOperator)
			result = BooleanLogic.xor(left, right);
		
		if(parent.getOperator() instanceof ImplicationOperator)
			result = BooleanLogic.implies(left, right);
		
		return MigrationFactory.createBooleanExpressionEvaluation(
				result, 
				"[" + renderer.doRender(leftEval.getResult()) + " " + renderer.doRender(parent.getOperator()) + " " + renderer.doRender(rightEval.getResult()) + "] = " + renderer.doRender(result),
				CollectionUtil.asIterable(leftEval, rightEval));
	}
	
	protected BooleanExpressionEvaluation evaluate(Negation n) {
		ValueExpressionEvaluation valueEvaluation = doEvaluate(n.getValue());
		Boolean value = assertBooleanOrNull(valueEvaluation);
		Boolean result = BooleanLogic.not(value);

		return MigrationFactory.createBooleanExpressionEvaluation(
				result, 
				"[" + renderer.doRender(n.getOperator()) + " " + renderer.doRender(valueEvaluation.getResult()) + "] = " + renderer.doRender(result),
				CollectionUtil.asIterable(valueEvaluation));
	}
	
	protected BooleanExpressionEvaluation evaluate(BooleanLiteral b) {
		return MigrationFactory.createBooleanExpressionEvaluation(
				MigrationFactory.createBooleanLiteralOrNull(b.getValue()), 
				"[" + renderer.doRender(b) + "] is user-specified.");
	}
	
	protected BooleanExpressionEvaluation evaluateBinaryRelational(Comparison e) {
		ValueExpressionEvaluation left = doEvaluate(e.getLeft());
		ValueExpressionEvaluation right = doEvaluate(e.getRight());
		
		Integer comparison = null;
		try {
			comparison = RelationalLogic.compare(left.getResult(), right.getResult());
		} catch(Exception ex) {
			throw new IllegalArgumentException(
				"LHS and RHS of condition are not comparable: " 
				+ ValueUtil.getTypeName(left.getResult()) + " " 
				+ renderer.doRender(e.getOperator()) + " " 
				+ ValueUtil.getTypeName(right.getResult()));
		}
		
		Boolean result = null;
		if(e.getOperator() instanceof GreaterThanOperator)
			result = RelationalLogic.greater(comparison);
		if(e.getOperator() instanceof GreaterOrEqualThanOperator)
			result = RelationalLogic.greaterOrEqual(comparison);	
		if(e.getOperator() instanceof LessThanOperator)
			result = RelationalLogic.less(comparison);
		if(e.getOperator() instanceof LessOrEqualThanOperator)
			result = RelationalLogic.lessOrEqual(comparison);
		if(e.getOperator() instanceof EqualsOperator)
			result = RelationalLogic.equals(comparison);
		if(e.getOperator() instanceof NotEqualsOperator)
			result = RelationalLogic.notEquals(comparison);
		
		if(result == null) {
			return MigrationFactory.createBooleanExpressionEvaluation(
				result, 
				"[" + renderer.doRender(e) + "] can not be evaluated.",
				CollectionUtil.asIterable(left, right));
		}
		
		BigDecimal difference = null;
		if(left.getResult() instanceof NumberLiteral && right.getResult() instanceof NumberLiteral) {
			NumberLiteral leftLiteral = (NumberLiteral) left.getResult();
			NumberLiteral rightLiteral = (NumberLiteral) right.getResult();
			difference = NumericLogic.abs(NumericLogic.subtract(leftLiteral.getValue(), rightLiteral.getValue()));
		} else {
			difference = NumericLogic.abs(new BigDecimal(comparison, settings.getMathContext()));
		}
		
		return MigrationFactory.createBooleanExpressionEvaluation(
				result, 
				"[" + renderer.doRender(left.getResult()) + " " + renderer.doRender(e.getOperator()) + " " + renderer.doRender(right.getResult()) + "] = " + renderer.doRender(result),
				difference,
				CollectionUtil.asIterable(left, right));
	}
	
	protected ValueExpressionEvaluation evaluate(RelationalExpression e) {
		return evaluateBinaryRelational(e);
	}
	
	protected ValueExpressionEvaluation evaluate(ParenthesizedExpression e) {
		return doEvaluate(e.getValue());
	}
	
	protected ValueSpecificationExpressionEvaluation evaluate(InstanceSpecificationExpression e) {
		return MigrationFactory.createValueSpecificationExpressionEvaluation(
				MigrationFactory.createInstanceSpecificationExpression(e.getValue()),
				"[" + renderer.doRender(e) + "] is user-specified.");
	}
	
	protected ValueSpecificationExpressionEvaluation evaluate(ObjectSpecificationExpression e) {		
		return MigrationFactory.createValueSpecificationExpressionEvaluation(
				MigrationFactory.copy(e),
				"[" + renderer.doRender(e) + "] is user-specified.");
	}

	protected ValueSpecificationExpressionEvaluation evaluate(NullLiteral literal) {
		return MigrationFactory.createValueSpecificationExpressionEvaluation(
				MigrationFactory.createNullLiteral(), 
				"[" + renderer.doRender(literal) + "] is user-specified.");
	}
	
	protected ValueSpecificationExpressionEvaluation evaluate(UnlimitedLiteral literal) {
		return MigrationFactory.createValueSpecificationExpressionEvaluation(
				MigrationFactory.createUnlimitedLiteral(), 
				"[" + renderer.doRender(literal) + "] is user-specified.");
	}
	
	public ValueSpecificationExpressionEvaluation evaluate(StringLiteral literal) {
		return MigrationFactory.createValueSpecificationExpressionEvaluation(
				MigrationFactory.createStringLiteral(literal.getValue()), 
				"[" + renderer.doRender(literal) + "] is user-specified.");
	}
	
	/**
	 * ARITHMETIC EXPRESSIONS 
	 *
	 **/
	
	protected NumberExpressionEvaluation evaluateBinaryArithmetic(Implication parent) {
		
		ValueExpressionEvaluation leftEval = doEvaluate(parent.getLeft());		
		ValueExpressionEvaluation rightEval = doEvaluate(parent.getRight());
		
		BigDecimal left = getNumberOrNull(leftEval);
		BigDecimal right = getNumberOrNull(rightEval);
		
		BigDecimal result = null;
		
		if(parent.getOperator() instanceof SubstractionOperator)
			result = NumericLogic.subtract(left, right);
		
		else if(parent.getOperator() instanceof AdditionOperator)
			result = NumericLogic.add(left, right);
		
		if(parent.getOperator() instanceof MultiplicationOperator)
			result = NumericLogic.multiply(left, right);
		
		if(parent.getOperator() instanceof DivisionOperator)
			result = NumericLogic.divide(left, right);
		
		if(parent.getOperator() instanceof ModulusOperator)
			result = NumericLogic.modulo(left, right);
		
		if(result == null)
			return getUnsuccessfulNumberEvaluation(parent, leftEval, rightEval);
		
		return MigrationFactory.createNumberExpressionEvaluation(
				result,
				"[" + renderer.doRender(leftEval.getResult()) + " " + renderer.doRender(parent.getOperator()) + " " + renderer.doRender(rightEval.getResult()) + "] = " + renderer.doRender(result),
				CollectionUtil.asIterable(NumberExpressionEvaluation.class, leftEval, rightEval));
		
	}
	
	protected ValueExpressionEvaluation evaluate(AdditiveExpression e) {
		return evaluateBinaryArithmetic(e);
	}
	
	protected ValueExpressionEvaluation evaluate(MultiplicativeExpression e) {
		return evaluateBinaryArithmetic(e);
	}
	
	public List<BigDecimal> getEvaluationResults(List<NumberExpressionEvaluation> evaluations) {
		List<BigDecimal> results = new ArrayList<>();
		BigDecimal cur;
		for(NumberExpressionEvaluation evaluation : evaluations) {
			cur = ValueUtil.valueOf(evaluation.getResult());
			if(cur != null)
				results.add(cur);
		}
		return results;
	}
	
	protected ValueExpressionEvaluation evaluateNumberList(NumberFunction e, List<NumberExpression> values) {		
		List<NumberExpressionEvaluation> valueEvals = new ArrayList<>();
		NumberExpressionEvaluation eval = null;
		for(NumberExpression numberExpression : values) {
			eval = doEvaluate(numberExpression, NumberExpressionEvaluation.class);
			if(eval != null)
				valueEvals.add(eval);
		}
		
		List<BigDecimal> evaluationResults = getEvaluationResults(valueEvals);
		BigDecimal result = null;
		
		if(e.getOperator() instanceof MinOperator) 
			result = NumericLogic.min(evaluationResults);
		else if(e.getOperator() instanceof MaxOperator) 
			result = NumericLogic.max(evaluationResults);
		else if(e.getOperator() instanceof SumOperator) 
			result = NumericLogic.sum(evaluationResults);
		else if(e.getOperator() instanceof AvgOperator) 
			result = NumericLogic.avg(evaluationResults);
		
		if(result == null)
			return getUnsuccessfulNumberEvaluation(e, valueEvals);
		
		return MigrationFactory.createNumberExpressionEvaluation(
			result,
			"[" + renderer.doRender(e.getOperator()) + renderer.doRender(valueEvals) + "] = " + renderer.doRender(result),
			valueEvals);
	}
	
	protected ValueExpressionEvaluation evaluate(MinimumFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	protected ValueExpressionEvaluation evaluate(MaximumFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	protected ValueExpressionEvaluation evaluate(AverageFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	protected ValueExpressionEvaluation evaluate(SumFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	protected ValueExpressionEvaluation evaluate(ExponentialFunction e) {
		NumberExpressionEvaluation baseEval = doEvaluate(e.getBase(), NumberExpressionEvaluation.class);
		NumberExpressionEvaluation expEval = doEvaluate(e.getExponent(), NumberExpressionEvaluation.class);		
		BigDecimal result = NumericLogic.pow(getNumberOrNull(baseEval), getNumberOrNull(expEval));		
		if(result == null)
			return getUnsuccessfulNumberEvaluation(e, baseEval, expEval);

		return MigrationFactory.createNumberExpressionEvaluation(
				result,
				"[" + renderer.doRender(e.getOperator()) + "(" + renderer.doRender(baseEval.getResult()) + ", " + renderer.doRender(expEval.getResult()) + ")] = " + renderer.doRender(result),
				CollectionUtil.asIterable(baseEval, expEval));
	}
	
	protected NumberExpressionEvaluation evaluate(AbsoluteFunction e) {
		NumberExpressionEvaluation valueEval = doEvaluate(e.getValue(), NumberExpressionEvaluation.class);		
		BigDecimal result = NumericLogic.abs(getNumberOrNull(valueEval));
		if(result == null)
			return getUnsuccessfulNumberEvaluation(e, valueEval);
		
		return MigrationFactory.createNumberExpressionEvaluation(
				result,
				"[" + renderer.doRender(e.getOperator()) + "(" + renderer.doRender(valueEval.getResult()) + ")] = " + renderer.doRender(result),
				CollectionUtil.asIterable(valueEval));
	}
	
	protected NumberExpressionEvaluation evaluate(NaturalLogarithmFunction e) {
		NumberExpressionEvaluation valueEval = doEvaluate(e.getValue(), NumberExpressionEvaluation.class);		
		BigDecimal result = NumericLogic.ln(getNumberOrNull(valueEval));
		if(result == null)
			return getUnsuccessfulNumberEvaluation(e, valueEval);
		
		return MigrationFactory.createNumberExpressionEvaluation(
				result,
				"[" + renderer.doRender(e.getOperator()) + "(" + renderer.doRender(valueEval.getResult()) + ")] = " + renderer.doRender(result),
				CollectionUtil.asIterable(valueEval));
	}
	
	protected NumberExpressionEvaluation evaluate(CommonLogarithmFunction e) {
		NumberExpressionEvaluation valueEval = doEvaluate(e.getValue(), NumberExpressionEvaluation.class);
		BigDecimal result = NumericLogic.log(getNumberOrNull(valueEval));
		if(result == null)
			return getUnsuccessfulNumberEvaluation(e, valueEval);

		return MigrationFactory.createNumberExpressionEvaluation(
				result, 
				"[" + renderer.doRender(e.getOperator()) + "(" + renderer.doRender(valueEval) + ")] = " + renderer.doRender(result),
				CollectionUtil.asIterable(valueEval));
	}
	
	protected NumberExpressionEvaluation evaluate(NumberLiteral e) {
		return MigrationFactory.createNumberExpressionEvaluation(e, "[" + renderer.doRender(e) + "] is user-specified.");
	}
	
	protected NumberExpressionEvaluation getUnsuccessfulNumberEvaluation(Expression e, Iterable<? extends NumberExpressionEvaluation> subEvals) {
		return getUnsuccessfulNumberEvaluation(e, "", subEvals);
	}
	
	protected NumberExpressionEvaluation getUnsuccessfulNumberEvaluation(Expression e, ValueExpressionEvaluation... subEvals) {
		return getUnsuccessfulNumberEvaluation(e, "", CollectionUtil.asIterable(NumberExpressionEvaluation.class, subEvals));
	}
	
	protected NumberExpressionEvaluation getUnsuccessfulNumberEvaluation(Expression e, String message, Iterable<? extends NumberExpressionEvaluation> subEvals) {
		NumberExpressionEvaluation eval = MigrationFactory.createNumberExpressionEvaluation(
				"[" + renderer.doRender(e) + "] can not be evaluated. " + message);
		if(subEvals != null)
			for(NumberExpressionEvaluation subEval : subEvals) 
				if(subEval != null)
					eval.getEvaluations().add(subEval);
		return eval;
	}
	
	protected static Boolean getBooleanOrNull(ValueExpressionEvaluation e) {
		if(e == null || e.getResult() == null || !ValueUtil.isBoolean(e.getResult()))
			return null;
		return ValueUtil.valueOf((BooleanLiteral)e.getResult());
	}
	
	protected static BigDecimal getNumberOrNull(ValueExpressionEvaluation e) {
		if(e == null || e.getResult() == null || !ValueUtil.isNumber(e.getResult()))
			return null;
		return ValueUtil.valueOf((NumberLiteral)e.getResult());
	}
	
	protected static Boolean assertBooleanOrNull(ValueExpressionEvaluation e) {
		if(e == null || e.getResult() == null)
			return null; 
		try {
			return ValueUtil.assertBooleanOrNull(e.getResult());
		} catch(Exception ex) {
			throw new IllegalArgumentException("Value '" + renderer.doRender(e.getResult()) + "' is not boolean value.");
		}
	}

}

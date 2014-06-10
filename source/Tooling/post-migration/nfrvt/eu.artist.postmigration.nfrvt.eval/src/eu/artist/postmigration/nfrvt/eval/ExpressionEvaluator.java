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
import java.util.List;

import eu.artist.postmigration.nfrvt.lang.gel.renderer.GELTextRenderer;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ComparableExpression;
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
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.LiteralValueExpression;
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
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.BooleanLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.NumericLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.RelationalLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;

public class ExpressionEvaluator {
	
	public static BooleanExpressionEvaluation newBooleanExpressionEvaluation() {
		return GelFactory.eINSTANCE.createBooleanExpressionEvaluation();
	}
	
	public static NumberExpressionEvaluation newNumberExpressionEvaluation() {
		return GelFactory.eINSTANCE.createNumberExpressionEvaluation();
	}
	
	public static ValueSpecificationExpressionEvaluation newValueSpecificationExpressionEvaluation() {
		return GelFactory.eINSTANCE.createValueSpecificationExpressionEvaluation();
	}
	
	public static Boolean getBooleanOrNull(ValueExpressionEvaluation e) {
		if(e == null || e.getResult() == null || !ValueUtil.isBoolean(e.getResult()))
			return null;
		return ValueUtil.valueOf((BooleanLiteral)e.getResult());
	}
	
	public static BigDecimal getNumberOrNull(ValueExpressionEvaluation e) {
		if(e == null || e.getResult() == null || !ValueUtil.isNumber(e.getResult()))
			return null;
		return ValueUtil.valueOf((NumberLiteral)e.getResult());
	}
	
	public static Boolean assertBooleanOrNull(ValueExpressionEvaluation e) {
		if(e == null || e.getResult() == null)
			return null; 
		try {
			return ValueUtil.assertBooleanOrNull(e.getResult());
		} catch(Exception ex) {
			throw new IllegalArgumentException("Value '" + renderer.doRender(e.getResult()) + "' is not boolean value.");
		}
	}
	
	private static void addEvaluation(ValueExpressionEvaluation parent, ValueExpressionEvaluation child) {
		if(child == null)
			return;
		
		if(parent instanceof ValueSpecificationExpressionEvaluation)
			((ValueSpecificationExpressionEvaluation)parent).getEvaluations().add(child);
		if(parent instanceof BooleanExpressionEvaluation)
			((BooleanExpressionEvaluation)parent).getEvaluations().add(child);
		if(parent instanceof NumberExpressionEvaluation && child instanceof NumberExpressionEvaluation)
			((NumberExpressionEvaluation)parent).getEvaluations().add((NumberExpressionEvaluation)child);
	}
	
	protected static GELTextRenderer renderer = new GELTextRenderer();
	
	private EvaluationSettings settings = new EvaluationSettings();
	
	
	public ExpressionEvaluator(EvaluationSettings settings) {
		this.settings = settings;
	}
	
	public void setSettings(EvaluationSettings s) {
		settings = s;
		NumericLogic.setSettings(settings);
	}
	
	public EvaluationSettings getSettings() {
		return settings;
	}
		
	
	public ValueExpressionEvaluation evaluate(Expression e) {
		if(e instanceof Implication)
			return evaluate((Implication)e);

		return null;
	}
	
	public ValueExpressionEvaluation evaluate(Implication e) {
		if(e instanceof Disjunction)
			return evaluate((Disjunction)e);
		
		return evaluateBinaryBoolean(e);
	}
	
	public ValueExpressionEvaluation evaluate(Disjunction e) {
		if(e instanceof Conjunction)
			return evaluate((Conjunction)e);
		
		return evaluateBinaryBoolean(e);
	}
	
	public ValueExpressionEvaluation evaluate(Conjunction e) {
		if(e instanceof Comparison)
			return evaluate((Comparison)e);
		
		return evaluateBinaryBoolean(e);
	}
	
	public ValueExpressionEvaluation evaluate(Comparison e) {
		if(e instanceof BooleanUnit)
			return evaluate((BooleanUnit)e);
		
		return evaluateBinaryRelational(e);
	}
	
	public ValueExpressionEvaluation evaluateBinaryBoolean(Implication parent) {
		ValueExpressionEvaluation leftEval = evaluate(parent.getLeft());
		ValueExpressionEvaluation rightEval = evaluate(parent.getRight());
		
		BooleanExpressionEvaluation evaluation = newBooleanExpressionEvaluation();
		addEvaluation(evaluation, leftEval);
		addEvaluation(evaluation, rightEval);
		
		Boolean left = assertBooleanOrNull(leftEval);
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
		
		evaluation.setResult(ValueUtil.createBooleanLiteralOrNull(result));
		evaluation.setReason("[" + renderer.doRender(leftEval) + " " + renderer.doRender(parent.getOperator()) + " " + renderer.doRender(rightEval) + "] = " + renderer.doRender(result));
		return evaluation;
	}
	
	public ValueExpressionEvaluation evaluate(BooleanUnit e) {
		if(e instanceof BooleanLiteral)
			return evaluate((BooleanLiteral)e);
		if(e instanceof Negation)
			return evaluate((Negation)e);
		if(e instanceof RelationalExpression)
			return evaluate((RelationalExpression)e);
		return null;
	}
	
	public BooleanExpressionEvaluation evaluate(Negation n) {
		BooleanExpressionEvaluation evaluation = newBooleanExpressionEvaluation();
		
		ValueExpressionEvaluation valueEvaluation = evaluate(n.getValue());
		addEvaluation(evaluation, valueEvaluation);
		
		Boolean value = assertBooleanOrNull(valueEvaluation);
		Boolean result = BooleanLogic.not(value);
		evaluation.setResult(ValueUtil.createBooleanLiteralOrNull(result));
		evaluation.setReason("[" + renderer.doRender(n.getOperator()) + " " + renderer.doRender(valueEvaluation) + "] = " + renderer.doRender(result));
		return evaluation;
	}
	
	public BooleanExpressionEvaluation evaluate(BooleanLiteral b) {
		BooleanExpressionEvaluation evaluation = newBooleanExpressionEvaluation();
		evaluation.setResult(ValueUtil.createBooleanLiteralOrNull(b.getValue()));
		evaluation.setReason("[" + renderer.doRender(b) + "] is user-specified.");
		return evaluation;
	}
	
	public BooleanExpressionEvaluation evaluateBinaryRelational(Comparison e) {
		BooleanExpressionEvaluation evaluation = newBooleanExpressionEvaluation();
		
		ValueExpressionEvaluation left = evaluate(e.getLeft());
		ValueExpressionEvaluation right = evaluate(e.getRight());
		
		addEvaluation(evaluation, left);
		addEvaluation(evaluation, right);
		
		Integer comparison = null;
		try {
			comparison = RelationalLogic.compare(left.getResult(), right.getResult());
		} catch(Exception ex) {
			throw new IllegalArgumentException(
				"LHS and RHS of condition are not comparable: " + renderer.doRender(e));
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
			evaluation.setResult(null);
			evaluation.setReason("[" + renderer.doRender(e) + "] can not be evaluated.");
			return evaluation;
		}
		
		evaluation.setResult(ValueUtil.createBooleanLiteralOrNull(result));
		evaluation.setDifference(new BigDecimal(comparison, settings.getMathContext()));
		evaluation.setReason("[" + renderer.doRender(left) + " " + renderer.doRender(e.getOperator()) + " " + renderer.doRender(right) + "] = " + renderer.doRender(result));
		
		return evaluation;
	}
	
	public ValueExpressionEvaluation evaluate(RelationalExpression e) {
		if(e instanceof ComparableExpression)
			return evaluate((ComparableExpression)e);
		
		return evaluateBinaryRelational(e);
	}
	
	public ValueExpressionEvaluation evaluate(ComparableExpression e) {
		if(e instanceof ParenthesizedExpression)
			return evaluate((ParenthesizedExpression)e);
		
		if(e instanceof ArithmeticExpression)
			return evaluate((ArithmeticExpression)e);
		
		if(e instanceof ValueSpecification)
			return evaluate((ValueSpecification)e);
		
		return null;
	}
	
	public ValueExpressionEvaluation evaluate(ParenthesizedExpression e) {
		return evaluate(e.getValue());
	}
	
	public ValueExpressionEvaluation evaluate(ValueSpecification e) {
		if(e instanceof LiteralValueExpression)
			return evaluate((LiteralValueExpression)e);
		if(e instanceof ObjectSpecificationExpression)
			return evaluate((ObjectSpecificationExpression)e);
		if(e instanceof InstanceSpecificationExpression)
			return evaluate((InstanceSpecificationExpression)e);
		
		return null;
	}
	
	public ValueSpecificationExpressionEvaluation evaluate(InstanceSpecificationExpression e) {
		ValueSpecificationExpressionEvaluation evaluation = newValueSpecificationExpressionEvaluation();
		evaluation.setResult(ValueUtil.createInstanceSpecificationExpression(e.getValue()));
		evaluation.setReason("[" + renderer.doRender(e) + "] is user-specified.");
		return evaluation;
	}
	
	public ValueSpecificationExpressionEvaluation evaluate(ObjectSpecificationExpression e) {
		ValueSpecificationExpressionEvaluation evaluation = newValueSpecificationExpressionEvaluation();
		evaluation.setResult(ValueUtil.copy(e));
		evaluation.setReason("[" + renderer.doRender(e) + "] is user-specified.");
		return evaluation;
	}
	
	public ValueExpressionEvaluation evaluate(LiteralValueExpression e) {
		if(e instanceof NumberLiteral)
			return evaluate((NumberLiteral)e);
		if(e instanceof BooleanLiteral)
			return evaluate((BooleanLiteral)e);		
		if(e instanceof NullLiteral)
			return evaluate((NullLiteral)e);
		if(e instanceof StringLiteral)
			return evaluate((StringLiteral)e);
		if(e instanceof UnlimitedLiteral)
			return evaluate((UnlimitedLiteral)e);
		
		return null;
	}

	public ValueSpecificationExpressionEvaluation evaluate(NullLiteral literal) {
		ValueSpecificationExpressionEvaluation evaluation = newValueSpecificationExpressionEvaluation();
		evaluation.setResult(ValueUtil.createNullLiteral());
		evaluation.setReason("[" + renderer.doRender(literal) + "] is user-specified.");
		return evaluation;
	}
	
	public ValueSpecificationExpressionEvaluation evaluate(UnlimitedLiteral literal) {
		ValueSpecificationExpressionEvaluation evaluation = newValueSpecificationExpressionEvaluation();
		evaluation.setResult(ValueUtil.createUnlimitedLiteral());
		evaluation.setReason("[" + renderer.doRender(literal) + "] is user-specified.");
		return evaluation;
	}
	
	public ValueSpecificationExpressionEvaluation evaluate(StringLiteral literal) {
		ValueSpecificationExpressionEvaluation evaluation = newValueSpecificationExpressionEvaluation();
		evaluation.setResult(ValueUtil.createStringLiteral(literal.getValue()));
		evaluation.setReason("[" + renderer.doRender(literal) + "] is user-specified.");
		return evaluation;
	}
	
	/**
	 * ARITHMETIC EXPRESSIONS 
	 *
	 **/
	
	public ValueExpressionEvaluation evaluate(ArithmeticExpression e) {
		if(e instanceof AdditiveExpression)
			return evaluate((AdditiveExpression)e);
		
		return null;
	}
	
	public NumberExpressionEvaluation evaluateBinaryArithmetic(Implication parent) {
		NumberExpressionEvaluation evaluation = newNumberExpressionEvaluation();
		
		ValueExpressionEvaluation leftEval = evaluate(parent.getLeft());
		addEvaluation(evaluation, leftEval);
		
		ValueExpressionEvaluation rightEval = evaluate(parent.getRight());
		addEvaluation(evaluation, rightEval);
		
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
			return getUnsuccessfulNumberEvaluation(evaluation, parent);
		
		evaluation.setResult(ValueUtil.createNumberLiteral(result));
		evaluation.setReason("[" + renderer.doRender(leftEval) + " " + renderer.doRender(parent.getOperator()) + " " + renderer.doRender(rightEval) + "] = " + renderer.doRender(result));
		
		return evaluation;
		
	}
	
	public ValueExpressionEvaluation evaluate(AdditiveExpression e) {
		if(e instanceof MultiplicativeExpression)
			return evaluate((MultiplicativeExpression)e);
		
		return evaluateBinaryArithmetic(e);
	}
	
	public ValueExpressionEvaluation evaluate(MultiplicativeExpression e) {
		if(e instanceof NumberExpression)
			return evaluate((NumberExpression)e);

		return evaluateBinaryArithmetic(e);
	}
	
	public ValueExpressionEvaluation evaluate(NumberExpression e) {
		if(e instanceof NumberLiteral)
			return evaluate((NumberLiteral)e);
		if(e instanceof NumberFunction)
			return evaluate((NumberFunction)e);
		
		return null;
	}
	
	public ValueExpressionEvaluation evaluate(NumberFunction e) {
		if(e instanceof MaximumFunction)
			return evaluate((MaximumFunction)e);
		if(e instanceof MinimumFunction)
			return evaluate((MinimumFunction)e);
		if(e instanceof AverageFunction)
			return evaluate((AverageFunction)e);
		if(e instanceof SumFunction)
			return evaluate((SumFunction)e);
		if(e instanceof ExponentialFunction)
			return evaluate((ExponentialFunction)e);
		if(e instanceof AbsoluteFunction)
			return evaluate((AbsoluteFunction)e);
		if(e instanceof NaturalLogarithmFunction)
			return evaluate((NaturalLogarithmFunction)e);
		if(e instanceof CommonLogarithmFunction)
			return evaluate((CommonLogarithmFunction)e);
		
		return null;
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
	
	public ValueExpressionEvaluation evaluateNumberList(NumberFunction e, List<NumberExpression> values) {
		NumberExpressionEvaluation evaluation = newNumberExpressionEvaluation();
		
		ValueExpressionEvaluation valueEval;
		for(NumberExpression numberExpression : values) {
			valueEval = evaluate(numberExpression);
			if(valueEval != null && valueEval instanceof NumberExpressionEvaluation)
				evaluation.getEvaluations().add((NumberExpressionEvaluation)valueEval);
		}
		
		List<BigDecimal> evaluationResults = getEvaluationResults(evaluation.getEvaluations());
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
			return getUnsuccessfulNumberEvaluation(evaluation, e);
		
		evaluation.setResult(ValueUtil.createNumberLiteral(result));
		evaluation.setReason("[" + renderer.doRender(e.getOperator()) + renderer.doRender(evaluation.getEvaluations()) + "] = " + renderer.doRender(result));
		
		return evaluation;
	}
	
	public ValueExpressionEvaluation evaluate(MinimumFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	public ValueExpressionEvaluation evaluate(MaximumFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	public ValueExpressionEvaluation evaluate(AverageFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	public ValueExpressionEvaluation evaluate(SumFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	public ValueExpressionEvaluation evaluate(ExponentialFunction e) {
		NumberExpressionEvaluation evaluation = newNumberExpressionEvaluation();
		
		ValueExpressionEvaluation baseEval = evaluate(e.getBase());
		ValueExpressionEvaluation expEval = evaluate(e.getExponent());
		addEvaluation(evaluation, baseEval);
		addEvaluation(evaluation, expEval);
		
		BigDecimal result = NumericLogic.pow(getNumberOrNull(baseEval), getNumberOrNull(expEval));		
		if(result == null)
			return getUnsuccessfulNumberEvaluation(evaluation, e);
		
		evaluation.setResult(ValueUtil.createNumberLiteral(result));
		evaluation.setReason("[" + renderer.doRender(e.getOperator()) + "(" + renderer.doRender(baseEval) + ", " + renderer.doRender(expEval) + "] = " + renderer.doRender(result));
		return evaluation;
	}
	
	public NumberExpressionEvaluation evaluate(AbsoluteFunction e) {
		NumberExpressionEvaluation evaluation = newNumberExpressionEvaluation();
		
		ValueExpressionEvaluation valueEval = evaluate(e.getValue());
		addEvaluation(evaluation, valueEval);
		
		BigDecimal result = NumericLogic.abs(getNumberOrNull(valueEval));
		if(result == null)
			return getUnsuccessfulNumberEvaluation(evaluation, e);
		
		evaluation.setResult(ValueUtil.createNumberLiteral(result));
		evaluation.setReason("[" + renderer.doRender(e.getOperator()) + "(" + renderer.doRender(valueEval) + ")] = " + renderer.doRender(result));
		return evaluation;
	}
	
	public NumberExpressionEvaluation evaluate(NaturalLogarithmFunction e) {
		NumberExpressionEvaluation evaluation = newNumberExpressionEvaluation();
		
		ValueExpressionEvaluation valueEval = evaluate(e.getValue());
		addEvaluation(evaluation, valueEval);
		
		BigDecimal result = NumericLogic.ln(getNumberOrNull(valueEval));
		if(result == null)
			return getUnsuccessfulNumberEvaluation(evaluation, e);
		
		evaluation.setResult(ValueUtil.createNumberLiteral(result));
		evaluation.setReason("[" + renderer.doRender(e.getOperator()) + "(" + renderer.doRender(valueEval) + ")] = " + renderer.doRender(result));
		return evaluation;
	}
	
	public NumberExpressionEvaluation evaluate(CommonLogarithmFunction e) {
		NumberExpressionEvaluation evaluation = newNumberExpressionEvaluation();
		
		ValueExpressionEvaluation valueEval = evaluate(e.getValue());
		addEvaluation(evaluation, valueEval);

		BigDecimal result = NumericLogic.log(getNumberOrNull(valueEval));
		if(result == null)
			return getUnsuccessfulNumberEvaluation(evaluation, e);

		evaluation.setResult(ValueUtil.createNumberLiteral(result));
		evaluation.setReason("[" + renderer.doRender(e.getOperator()) + "(" + renderer.doRender(valueEval) + ")] = " + renderer.doRender(result));
		return evaluation;
	}
	
	public NumberExpressionEvaluation evaluate(NumberLiteral e) {
		NumberExpressionEvaluation evaluation = newNumberExpressionEvaluation();
		evaluation.setResult(ValueUtil.createNumberLiteral(e.getValue()));
		evaluation.setReason("[" + renderer.doRender(e) + "] is user-specified.");
		return evaluation;
	}
	
	protected NumberExpressionEvaluation getUnsuccessfulNumberEvaluation(NumberExpressionEvaluation evaluation, Expression e) {
		return getUnsuccessfulNumberEvaluation(evaluation, e, "");
	}
	
	protected NumberExpressionEvaluation getUnsuccessfulNumberEvaluation(NumberExpressionEvaluation evaluation, Expression e, String message) {
		evaluation.setResult(null);
		evaluation.setReason("[" + renderer.doRender(e) + "] can not be evaluated. " + message);
		return evaluation;
	}
}

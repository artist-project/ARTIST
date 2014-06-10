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
package eu.artist.postmigration.nfrvt.lang.common.eval;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
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
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.OrOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SubstractionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.BooleanLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.NumericLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.RelationalLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.common.renderer.ITextRenderer;

public class ExpressionValidator {
	
	protected Map<String, EStructuralFeature> infos = new HashMap<>();
	protected Map<String, EStructuralFeature> warnings = new HashMap<>();
	protected Map<String, EStructuralFeature> errors = new HashMap<>();
	protected ITextRenderer renderer;
	
	private PolymorphicDispatcher<? extends ValueSpecification> evaluateDispatcher = new PolymorphicDispatcher<>(
			"evaluate", Collections.singletonList(this));

	public ExpressionValidator(ITextRenderer renderer) {
		this.setRenderer(renderer);
	}
	
	protected ITextRenderer getRenderer() {
		return renderer;
	}

	protected void setRenderer(ITextRenderer renderer) {
		this.renderer = renderer;
	}
	
	public void addWarning(String warning, EStructuralFeature feature) {
		warnings.put(warning, feature);
	}
	
	public Map<String, EStructuralFeature> getWarnings() {
		return warnings;
	}
	
	public void addError(String error, EStructuralFeature feature) {
		errors.put(error, feature);
	}
	
	public Map<String, EStructuralFeature> getErrors() {
		return errors;
	}
	
	public void addInfo(String info, EStructuralFeature feature) {
		infos.put(info, feature);
	}
	
	public Map<String, EStructuralFeature> getInfos() {
		return infos;
	}
	
	public void reset() {
		infos = new HashMap<>();
		warnings = new HashMap<>();
		errors = new HashMap<>();
	}
	
	public ValueSpecification doEvaluate(Object obj) {
		if(obj == null)
			return null;
		ValueSpecification value = evaluateDispatcher.invoke(obj);
		return value;
	}
	
	protected ValueSpecification evaluate(Object obj) {
		return null;
	}
	
	protected ValueSpecification evaluate(Expression e) {
		return null;
	}
	
	protected ValueSpecification evaluate(Implication e) {
		return evaluateBinaryBoolean(e);
	}
	
	protected ValueSpecification evaluate(Disjunction e) {
		return evaluateBinaryBoolean(e);
	}
	
	protected ValueSpecification evaluate(Conjunction e) {
		return evaluateBinaryBoolean(e);
	}
	
	protected BooleanLiteral evaluate(Comparison e) {	
		return evaluateBinaryRelational(e);
	}
	
	protected BooleanLiteral evaluate(RelationalExpression e) {
		return evaluateBinaryRelational(e);
	}
		
	private BooleanLiteral evaluateBinaryBoolean(Implication parent) {
		Boolean left = null;
		Boolean right = null;
		boolean error = false;
		try {
			left = ValueUtil.assertBooleanOrNull(doEvaluate(parent.getLeft()));
		} catch(Exception e) {
			addError(getRenderer().doRender(parent.getLeft()) + " is not a boolean value.", getFeature());
			error = true;
		}
		try {
			right = ValueUtil.assertBooleanOrNull(doEvaluate(parent.getRight()));
		} catch(Exception e) {
			addError(getRenderer().doRender(parent.getRight()) + " is not a boolean value.", getFeature());
			error = true;
		}
		if(error)
			return null;

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
		
		return ValueUtil.createBooleanLiteralOrNull(result);
	}
	
	protected BooleanLiteral evaluate(Negation n) {
		try {
			Boolean value = ValueUtil.assertBooleanOrNull(doEvaluate(n.getValue()));
			return ValueUtil.createBooleanLiteralOrNull(value);
		} catch(Exception e) {
			addError(getRenderer().doRender(n.getValue()) + " is not a boolean value.", getFeature());
			return null;
		}
	}
	
	protected BooleanLiteral evaluateBinaryRelational(Comparison e) {		
		ValueSpecification left = doEvaluate(e.getLeft());
		ValueSpecification right = doEvaluate(e.getRight());
		
		Integer comparison;
		try {
			comparison = RelationalLogic.compare(left, right);
		} catch(Exception ex) {
			addError("LHS and RHS of condition are not comparable: " + getRenderer().doRender(e), getFeature());
			return null;
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
		
		return ValueUtil.createBooleanLiteralOrNull(result);
	}
	
	
		
	protected ValueSpecification evaluate(ParenthesizedExpression e) {
		return doEvaluate(e.getValue());
	}
	
	protected ValueSpecification evaluate(ValueSpecification e) {
		return e;
	}
	
	/**
	 * ARITHMETIC EXPRESSIONS 
	 *
	 **/
	
	protected NumberLiteral evaluateBinaryArithmetic(Implication parent) {

		BigDecimal left = ValueUtil.getNumberOrNull(doEvaluate(parent.getLeft()));
		BigDecimal right = ValueUtil.getNumberOrNull(doEvaluate(parent.getRight()));
		
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
		
		return ValueUtil.createNumberLiteralOrNull(result);
	}
	
	protected NumberLiteral evaluate(AdditiveExpression e) {
		return evaluateBinaryArithmetic(e);
	}
	
	protected NumberLiteral evaluate(MultiplicativeExpression e) {
		return evaluateBinaryArithmetic(e);
	}
	
	protected NumberLiteral evaluateNumberList(NumberFunction e, List<NumberExpression> values) {
		List<BigDecimal> evaluationResults = new ArrayList<>();
		NumberLiteral cur;
		for(NumberExpression numberExpression : values) {
			cur = asNumberLiteral(doEvaluate(numberExpression));
			if(cur != null && cur.getValue() != null) {
					evaluationResults.add(cur.getValue());
			}
		}
		BigDecimal result = null;
		
		if(e.getOperator() instanceof MinOperator) 
			result = NumericLogic.min(evaluationResults);
		else if(e.getOperator() instanceof MaxOperator) 
			result = NumericLogic.max(evaluationResults);
		else if(e.getOperator() instanceof SumOperator) 
			result = NumericLogic.sum(evaluationResults);
		else if(e.getOperator() instanceof AvgOperator) 
			result = NumericLogic.avg(evaluationResults);
		
		return ValueUtil.createNumberLiteralOrNull(result);
	}
	
	protected NumberLiteral evaluate(MinimumFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	protected NumberLiteral evaluate(MaximumFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	protected NumberLiteral evaluate(AverageFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	protected NumberLiteral evaluate(SumFunction e) {
		return evaluateNumberList(e, e.getValues());
	}
	
	protected NumberLiteral evaluate(ExponentialFunction e) {
		NumberLiteral base = asNumberLiteral(doEvaluate(e.getBase()));
		NumberLiteral exp = asNumberLiteral(doEvaluate(e.getExponent()));
		if(base == null || exp == null)
			return null;
		return ValueUtil.createNumberLiteralOrNull(NumericLogic.pow(base.getValue(), exp.getValue()));
	}
	
	protected NumberLiteral evaluate(AbsoluteFunction e) {		
		NumberLiteral value = asNumberLiteral(doEvaluate(e.getValue()));
		if(value == null)
			return null;
		return ValueUtil.createNumberLiteralOrNull(NumericLogic.abs(value.getValue()));
	}
	
	protected NumberLiteral evaluate(NaturalLogarithmFunction e) {
		NumberLiteral value = asNumberLiteral(doEvaluate(e.getValue()));
		if(value == null)
			return null;
		return ValueUtil.createNumberLiteralOrNull(NumericLogic.ln(value.getValue()));
	}
	
	protected NumberLiteral evaluate(CommonLogarithmFunction e) {
		NumberLiteral value = asNumberLiteral(doEvaluate(e.getValue()));
		if(value == null)
			return null;
		return ValueUtil.createNumberLiteralOrNull(NumericLogic.log(value.getValue()));
	}
	
	protected NumberLiteral evaluate(NumberLiteral e) {
		return e;
	}
	
	protected BooleanLiteral evaluate(BooleanLiteral e) {
		return e;
	}
	
	protected ValueSpecification evaluate(InstanceSpecificationExpression e) {
		return e;
	}
	
	protected ValueSpecification evaluate(ObjectSpecificationExpression  e) {
		return e;
	}

	private EStructuralFeature feature;
	
	public EStructuralFeature getFeature() {
		return feature;
	}

	public void setFeature(EStructuralFeature feature) {
		this.feature = feature;
	}
	
	private static NumberLiteral asNumberLiteral(ValueSpecification e) {
		if(e instanceof NumberLiteral)
			return (NumberLiteral) e;
		return null;
	}
}

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
package eu.artist.postmigration.nfrvt.eval.util;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.xtext.EcoreUtil2;

import com.google.common.collect.Lists;

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
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EslFactory;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind;
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
import eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind;
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
import eu.artist.postmigration.nfrvt.lang.gml.gml.Workload;
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
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslFactory;

public class MigrationFactory {
	private static final ArtistCommonFactory COMMON = ArtistCommonFactory.eINSTANCE;
	private static final NslFactory NSL = NslFactory.eINSTANCE;
	private static final EslFactory ESL = EslFactory.eINSTANCE;
	private static final TslFactory TSL = TslFactory.eINSTANCE;
	private static final GmlFactory GML = GmlFactory.eINSTANCE;
	private static final GelFactory GEL = GelFactory.eINSTANCE;
	
	private static EvaluationSettings settings = new EvaluationSettings();
	
	public static void setSettings(EvaluationSettings s) {
		settings = s;
	}
	
	public static EvaluationSettings getSettings() {
		return settings;
	}
	
	// general
	public static String toQualifiedName(String name) {
		return name.replace(" ", "_");
	}
	
	private static <T extends EObject> void add(Iterable<? extends T> from, List<T> to) {
		add(from, to, false);
	}
	
	private static <T extends EObject> void add(Iterable<? extends T> from, List<T> to, boolean copy) {
		if(from == null || to == null)
			return;
		for(T obj : from)
			if(obj != null)
				if(copy)
					to.add(copy(obj));
				else
					to.add(obj);
	}
	
	//
	// COMMON
	//
	
	public static Implication createImplication(Disjunction left, Disjunction right) {
		Implication implication = COMMON.createImplication();
		implication.setLeft(left);
		implication.setOperator(COMMON.createImplicationOperator());
		implication.setRight(right);
		return implication;
	}
	
	private static Disjunction createDisjunction(Conjunction left, Conjunction right) {
		Disjunction disjunction = COMMON.createDisjunction();
		disjunction.setLeft(left);
		disjunction.setRight(right);
		return disjunction;
	}
	
	public static Disjunction createOrDisjunction(Conjunction left, Conjunction right) {
		Disjunction disjunction = createDisjunction(left, right);
		disjunction.setOperator(COMMON.createOrOperator());
		return disjunction;
	}
	
	public static Disjunction createXOrDisjunction(Conjunction left, Conjunction right) {
		Disjunction disjunction = createDisjunction(left, right);
		disjunction.setOperator(COMMON.createXOrOperator());
		return disjunction;
	}
	
	public static Conjunction createConjunction(Comparison left, Comparison right) {
		Conjunction conjunction = COMMON.createConjunction();
		conjunction.setLeft(left);
		conjunction.setRight(right);
		conjunction.setOperator(COMMON.createAndOperator());
		return conjunction;
	}
	
	private static Comparison createComparison(BooleanUnit left, BooleanUnit right) {
		Comparison expression = COMMON.createComparison();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	public static Comparison createEqualsComparison(BooleanUnit left, BooleanUnit right) {
		Comparison expression = createComparison(left, right);
		expression.setOperator(COMMON.createEqualsOperator());
		return expression;
	}
	
	public static Comparison createNotEqualsComparison(BooleanUnit left, BooleanUnit right) {
		Comparison expression = createComparison(left, right);
		expression.setOperator(COMMON.createNotEqualsOperator());
		return expression;
	}
	
	public static Negation createNegation(BooleanUnit expression) {
		Negation negation = COMMON.createNegation();
		negation.setOperator(COMMON.createNotOperator());
		negation.setValue(expression);
		return negation;
	}
	
	private static RelationalExpression createRelationalExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = COMMON.createRelationalExpression();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	public static RelationalExpression createGreaterThanExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = createRelationalExpression(left, right);
		expression.setOperator(COMMON.createGreaterThanOperator());
		return expression;
	}
	
	public static RelationalExpression createGreaterOrEqualThanExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = createRelationalExpression(left, right);
		expression.setOperator(COMMON.createGreaterOrEqualThanOperator());
		return expression;
	}
	
	public static RelationalExpression createLessThanExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = createRelationalExpression(left, right);
		expression.setOperator(COMMON.createLessThanOperator());
		return expression;
	}
	
	public static RelationalExpression createLessOrEqualThanExpression(Disjunction left, Disjunction right) {
		RelationalExpression expression = createRelationalExpression(left, right);
		expression.setOperator(COMMON.createLessOrEqualThanOperator());
		return expression;
	}
	
	public static ParenthesizedExpression createParenthesizedExpression(Expression value) {
		ParenthesizedExpression expression = COMMON.createParenthesizedExpression();
		expression.setValue(value);
		return expression;
	}
	
	private static AdditiveExpression createAdditiveExpression(Disjunction left, Disjunction right) {
		AdditiveExpression expression = COMMON.createAdditiveExpression();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	public static AdditiveExpression createAdditionExpression(Disjunction left, Disjunction right) {
		AdditiveExpression expression = createAdditiveExpression(left, right);
		expression.setOperator(COMMON.createAdditionOperator());
		return expression;
	}
	
	public static AdditiveExpression createSubstractionExpression(Disjunction left, Disjunction right) {
		AdditiveExpression expression = createAdditiveExpression(left, right);
		expression.setOperator(COMMON.createSubstractionOperator());
		return expression;
	}
	
	private static MultiplicativeExpression createMultiplicativeExpression(Disjunction left, Disjunction right) {
		MultiplicativeExpression expression = COMMON.createMultiplicativeExpression();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	public static MultiplicativeExpression createMultiplicationExpression(Disjunction left, Disjunction right) {
		MultiplicativeExpression expression = createMultiplicativeExpression(left, right);
		expression.setOperator(COMMON.createMultiplicationOperator());
		return expression;
	}
	
	public static MultiplicativeExpression createDivisionExpression(Disjunction left, Disjunction right) {
		MultiplicativeExpression expression = createMultiplicativeExpression(left, right);
		expression.setOperator(COMMON.createDivisionOperator());
		return expression;
	}
	
	public static MultiplicativeExpression createModuloExpression(Disjunction left, Disjunction right) {
		MultiplicativeExpression expression = createMultiplicativeExpression(left, right);
		expression.setOperator(COMMON.createModulusOperator());
		return expression;
	}
	
	public MaximumFunction createMaximumFunction(Iterable<? extends NumberExpression> values) {
		MaximumFunction f = COMMON.createMaximumFunction();
		add(values, f.getValues());
		f.setOperator(COMMON.createMaxOperator());
		return f;
	}
	
	public MinimumFunction createMinimumFunction(Iterable<? extends NumberExpression> values) {
		MinimumFunction f = COMMON.createMinimumFunction();
		add(values, f.getValues());
		f.setOperator(COMMON.createMinOperator());
		return f;
	}
	
	public AverageFunction createAverageFunction(Iterable<? extends NumberExpression> values) {
		AverageFunction f = COMMON.createAverageFunction();
		add(values, f.getValues());
		f.setOperator(COMMON.createAvgOperator());
		return f;
	}
	
	public SumFunction createSumFunction(Iterable<? extends NumberExpression> values) {
		SumFunction f = COMMON.createSumFunction();
		add(values, f.getValues());
		f.setOperator(COMMON.createSumOperator());
		return f;
	}
	
	public ExponentialFunction createExponentialFunction(NumberExpression base, NumberExpression exponent) {
		ExponentialFunction f = COMMON.createExponentialFunction();
		f.setBase(base);
		f.setExponent(exponent);
		f.setOperator(COMMON.createExponentialOperator());
		return f;
	}
	
	public AbsoluteFunction createAbsoluteFunction(NumberExpression value) {
		AbsoluteFunction f = COMMON.createAbsoluteFunction();
		f.setValue(value);
		f.setOperator(COMMON.createAbsoluteOperator());
		return f;
	}
	
	public NaturalLogarithmFunction createNaturalLogarithmFunction(NumberExpression value) {
		NaturalLogarithmFunction f = COMMON.createNaturalLogarithmFunction();
		f.setValue(value);
		f.setOperator(COMMON.createNaturalLogarithmOperator());
		return f;
	}
	
	public CommonLogarithmFunction createCommonLogarithmFunction(NumberExpression value) {
		CommonLogarithmFunction f = COMMON.createCommonLogarithmFunction();
		f.setValue(value);
		f.setOperator(COMMON.createCommonLogarithmOperator());
		return f;
	}
	
	public ObjectSpecificationExpression createTupleObjectExpression(DataType type, Tuple tuple) {
		ObjectSpecificationExpression e = COMMON.createObjectSpecificationExpression();
		e.setType(type);
		e.setValue(tuple);
		return e;
	}
	
	public ObjectSpecificationExpression createCollectionObjectExpression(DataType type, Collection collection) {
		ObjectSpecificationExpression e = COMMON.createObjectSpecificationExpression();
		e.setType(type);
		e.setValue(collection);
		return e;
	}
	
	public ObjectSpecificationExpression createTupleObjectExpression(DataType type, Iterable<PropertyValuePair> pairs) {
		ObjectSpecificationExpression e = COMMON.createObjectSpecificationExpression();
		e.setType(type);
		e.setValue(createTuple(pairs));
		return e;
	}
	
	public ObjectSpecificationExpression createCollectionObjectExpression(DataType type, Iterable<ValueSpecification> values) {
		ObjectSpecificationExpression e = COMMON.createObjectSpecificationExpression();
		e.setType(type);
		e.setValue(createCollection(values));
		return e;
	}
	
	public static Collection createCollection(Iterable<ValueSpecification> values) {
		Collection collection = COMMON.createCollection();
		add(values, collection.getValues());
		return collection;
	}
	
	public static Tuple createTuple(Iterable<PropertyValuePair> pairs) {
		Tuple tuple = COMMON.createTuple();
		add(pairs, tuple.getTuples());
		return tuple;
	}
	
	public static PropertyValuePair createPropertyValuePair(Property property, ValueSpecification value) {
		PropertyValuePair pair = COMMON.createPropertyValuePair();
		pair.setProperty(property);
		pair.setValue(value);
		return pair;
	}
	
	public static InstanceSpecificationExpression createInstanceSpecificationExpression(InstanceSpecification value) {
		InstanceSpecificationExpression e = COMMON.createInstanceSpecificationExpression();
		e.setValue(value);
		return e;
	}
	
	public static BooleanLiteral createBooleanLiteral(Boolean value) {
		BooleanLiteral l = COMMON.createBooleanLiteral();
		l.setValue(value);
		return l;
	}
	
	public static NumberLiteral createNumberLiteral(BigDecimal value) {
		NumberLiteral l = COMMON.createNumberLiteral();
		l.setValue(value);
		return l;
	}
	
	public static NumberLiteral createNumberLiteral(double value) {
		return createNumberLiteral(new BigDecimal(value, getSettings().getMathContext()));
	}
	
	public static NumberLiteral createNumberLiteral(int value) {
		return createNumberLiteral(new BigDecimal(value, getSettings().getMathContext()));
	}
	
	public static StringLiteral createStringLiteral(String value) {
		StringLiteral l = COMMON.createStringLiteral();
		l.setValue(value);
		return l;
	}
	
	public static NullLiteral createNullLiteral() {
		NullLiteral l = COMMON.createNullLiteral();
		l.setValue("null");
		return l;
	}
	
	public static UnlimitedLiteral createUnlimitedLiteral() {
		UnlimitedLiteral l = COMMON.createUnlimitedLiteral();
		l.setValue("*");
		return l;
	}
	
	public static ImportURI createImportURI(String uriString) {
		ImportURI uri = COMMON.createImportURI();
		uri.setImportURI(toQualifiedName(uriString));
		return uri;
	}
	
	public static ImportNamespace createImportNamespace(String namespace) {
		ImportNamespace uri = COMMON.createImportNamespace();
		uri.setImportedNamespace(toQualifiedName(namespace));
		return uri;
	}
	
	//
	// NSL
	//
	
	public static PropertyCatalogue createPropertyCatalogue(String qualifiedName, Iterable<eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property> properties) {
		PropertyCatalogue catalogue = NSL.createPropertyCatalogue();
		catalogue.setName(toQualifiedName(qualifiedName));
		add(properties, catalogue.getProperties());
		return catalogue;
	}
	
	public static PropertyCatalogue createPropertyCatalogue(String qualifiedName) {
		return createPropertyCatalogue(qualifiedName, null);
	}
	
	public static QualitativeProperty createQualitativeProperty(String name, String description, DirectionKind direction, Iterable<eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property> properties, Iterable<? extends PropertyImpact> propertyImpacts) {
		QualitativeProperty qp = NSL.createQualitativeProperty();
		qp.setName(toQualifiedName(name));
		qp.setDescription(description);
		if(direction != null)
			qp.setDirection(direction);
		add(properties, qp.getProperties());
		add(propertyImpacts, qp.getImpacts());
		return qp;
	}
	
	public static QualitativeProperty createQualitativeProperty(String name, String description, DirectionKind direction) {
		return createQualitativeProperty(name, description, direction, null, null);
	}
	
	public static BaseQuantitativeProperty createBaseQuantitativeProperty(String name, String description, DataType type, DirectionKind direction, Iterable<? extends PropertyImpact> propertyImpacts) {
		BaseQuantitativeProperty qp = NSL.createBaseQuantitativeProperty();
		qp.setName(toQualifiedName(name));
		qp.setDescription(description);
		qp.setType(type);
		qp.setDirection(direction);
		add(propertyImpacts, qp.getImpacts());
		return qp;
	}
	
	public static BaseQuantitativeProperty createBaseQuantitativeProperty(String name, String description, DataType type, DirectionKind direction) {
		return createBaseQuantitativeProperty(name, description, type, direction, null);
	}
	
	public static DerivedQuantitativeProperty createDerivedQuantitativeProperty(String name, String description, DataType type, DirectionKind direction, ArithmeticExpression expression, Iterable<? extends PropertyImpact> propertyImpacts) {
		DerivedQuantitativeProperty qp = NSL.createDerivedQuantitativeProperty();
		qp.setName(toQualifiedName(name));
		qp.setDescription(description);
		qp.setType(type);
		qp.setDirection(direction);
		qp.setExpression(expression);
		add(propertyImpacts, qp.getImpacts());
		return qp;
	}
	
	public static DerivedQuantitativeProperty createDerivedQuantitativeProperty(String name, String description, DataType type, DirectionKind direction, ArithmeticExpression expression) {
		return createDerivedQuantitativeProperty(name, description, type, direction, expression, null);
	}
			
	public static PropertyImpact createPropertyImpact(eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property target, BigDecimal impact) {
		PropertyImpact propertyImpact = NSL.createPropertyImpact();
		propertyImpact.setTarget(target);
		propertyImpact.setImpact(impact);
		return propertyImpact;
	}
	
	public static ParenthesizedArithmeticExpression createParenthesizedArithmeticExpression(ArithmeticExpression value) {
		ParenthesizedArithmeticExpression expression = NSL.createParenthesizedArithmeticExpression();
		expression.setValue(value);
		return expression;
	}
	
	public static QuantitativePropertyExpression createQuantitativePropertyExpression(QuantitativeProperty value) {
		QuantitativePropertyExpression expression = NSL.createQuantitativePropertyExpression();
		expression.setValue(value);
		return expression;
	}
	
	public static PropertyImpact createPropertyImpact(eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property target, double impact) {
		return createPropertyImpact(target, new BigDecimal(impact, getSettings().getMathContext()));
	}
	
	//
	// TSL
	//
	
	public static PatternCatalogue createPatternCatalogue(String qualifiedName, Iterable<Pattern> patterns) {
		PatternCatalogue catalogue = TSL.createPatternCatalogue();
		catalogue.setName(toQualifiedName(qualifiedName));
		add(patterns, catalogue.getPatterns());
		return catalogue;
	}
	
	public static PatternCatalogue createPatternCatalogue(String qualifiedName) {
		return createPatternCatalogue(qualifiedName, null);
	}
	
	public static PatternImpact createPatternImpact(Pattern target, BigDecimal impact) {
		PatternImpact patternImpact = TSL.createPatternImpact();
		patternImpact.setTarget(target);
		patternImpact.setImpact(impact);
		return patternImpact;
	}
	
	public static PatternImpact createPatternImpact(Pattern target, double impact) {
		return createPatternImpact(target, new BigDecimal(impact, getSettings().getMathContext()));
	}
	
	public static Pattern createPattern(String name, String context, String problem, String solution, 
			Iterable<? extends PropertyImpact> propertyImpacts, Iterable<? extends PatternImpact> patternImpacts, Iterable<? extends Pattern> relatedPatterns) {
		Pattern pattern = TSL.createPattern();
		pattern.setName(toQualifiedName(name));
		pattern.setContext(context);
		pattern.setProblem(problem);
		pattern.setSolution(solution);
		add(propertyImpacts, pattern.getPropertyImpacts());
		add(patternImpacts, pattern.getPatternImpacts());
		add(relatedPatterns, pattern.getRelatedPatterns());
		return pattern;
	}

	//
	// ESL
	//
	
	public static EvaluationStrategyCatalogue createEvaluationStrategyCatalogue(String name, Iterable<? extends EvaluationStrategy> strategies) {
		EvaluationStrategyCatalogue catalogue = ESL.createEvaluationStrategyCatalogue();
		catalogue.setName(toQualifiedName(name));
		add(strategies, catalogue.getStrategies());
		return catalogue;
	}
	
	public static EvaluationStrategyCatalogue createEvaluationStrategyCatalogue(String name) {
		return createEvaluationStrategyCatalogue(name, null);
	}
	
	public static EvaluationStrategy createEvaluationStrategy(String name, String description, EvaluationStrategyLevelKind level, Iterable<? extends QuantitativeProperty> properties) {
		EvaluationStrategy strategy = ESL.createEvaluationStrategy();
		strategy.setName(toQualifiedName(name));
		strategy.setDescription(description);
		strategy.setLevel(level);
		add(properties, strategy.getProperties());
		return strategy;
	}
	
	public static EvaluationStrategy createEvaluationStrategy(String name, String description, EvaluationStrategyLevelKind level, QuantitativeProperty property) {
		return createEvaluationStrategy(name, description, level, Lists.newArrayList(property));
	}
	
	//
	// GML
	//
	
	public static GoalModel createGoalModel(String qualifiedName, Iterable<? extends Workload> workloads, Iterable<? extends AppliedProperty> properties, Iterable<? extends Goal> goals) {
		GoalModel goalModel = GML.createGoalModel();
		goalModel.setName(toQualifiedName(qualifiedName));
		add(workloads, goalModel.getWorkloads());
		add(properties, goalModel.getAppliedProperties());
		add(goals, goalModel.getGoals());		
		return goalModel;
	}
	
	public static GoalModel createGoalModel(String qualifiedName) {
		return createGoalModel(qualifiedName, null, null, null);
	}
	
	public static Workload createWorkload(String name, Activity activity, String pattern) {
		Workload workload = GML.createWorkload();
		workload.setName(toQualifiedName(name));
		workload.setActivity(activity);
		workload.setPattern(pattern);
		return workload;
	}
	
	public static AppliedQualitativeProperty createAppliedQualitativeProperty(String name, QualitativeProperty property, Iterable<? extends NamedElement> context) {
		AppliedQualitativeProperty appliedQualitativeProperty = GML.createAppliedQualitativeProperty();
		appliedQualitativeProperty.setName(toQualifiedName(name));
		appliedQualitativeProperty.setProperty(property);
		add(context, appliedQualitativeProperty.getContext());
		return appliedQualitativeProperty;
	}
	
	public static AppliedQuantitativeProperty createAppliedQuantitativeProperty(String name, QuantitativeProperty property, Iterable<? extends NamedElement> context) {
		return createAppliedQuantitativeProperty(name, property, null, context, null);
	}
	
	public static AppliedQuantitativeProperty createAppliedQuantitativeProperty(String name, QuantitativeProperty property, Iterable<? extends NamedElement> context, Workload workload) {
		return createAppliedQuantitativeProperty(name, property, null, context, workload);
	}
	
	public static AppliedQuantitativeProperty createAppliedQuantitativeProperty(String name, QuantitativeProperty property, Operator function, Iterable<? extends NamedElement> context) {
		return createAppliedQuantitativeProperty(name, property, function, context, null);
	}
	
	public static AppliedQuantitativeProperty createAppliedQuantitativeProperty(String name, QuantitativeProperty property, Operator function, Iterable<? extends NamedElement> context, Workload workload) {
		AppliedQuantitativeProperty appliedQuantitativeProperty = GML.createAppliedQuantitativeProperty();
		appliedQuantitativeProperty.setName(toQualifiedName(name));
		appliedQuantitativeProperty.setProperty(property);
		if(function != null)
			appliedQuantitativeProperty.setFunction(function);
		add(context, appliedQuantitativeProperty.getContext());
		if(workload != null)
			appliedQuantitativeProperty.setWorkload(workload);		
		return appliedQuantitativeProperty;
	}
	
	public static SoftGoal createSoftGoal(String name, GoalKind kind, int priority, AppliedQualitativeProperty property, double threshold, Iterable<? extends SoftGoalImpact> impacts) {
		SoftGoal goal = GML.createSoftGoal();
		goal.setName(toQualifiedName(name));
		goal.setKind(kind);
		goal.setPriority(priority);
		goal.setProperty(property);
		goal.setThreshold(new BigDecimal(threshold, getSettings().getMathContext()));
		add(impacts, goal.getImpacts());
		return goal;
	}
	
	public static SoftGoal createSoftGoal(String name, GoalKind kind, int priority, AppliedQualitativeProperty property, double threshold) {
		return createSoftGoal(name, kind, priority, property, threshold, null);
	}
	
	public static SoftGoalImpact createSoftGoalImpact(SoftGoal target, BigDecimal impact) {
		SoftGoalImpact goalImpact = GML.createSoftGoalImpact();
		goalImpact.setTarget(target);
		goalImpact.setImpact(impact);
		return goalImpact;
	}
	
	public static SoftGoalImpact createSoftGoalImpact(SoftGoal target, double impact) {
		return createSoftGoalImpact(target, new BigDecimal(impact, getSettings().getMathContext()));
	}
	
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
	
	public static HardGoal createHardGoal(String name, GoalKind kind, int priority, Expression condition) {
		return createHardGoal(name, kind, priority, condition, null);
	}
	
	public static CompositeGoal createCompositeGoal(String name, GoalKind kind, int priority, GoalExpression condition) {
		CompositeGoal goal = GML.createCompositeGoal();
		goal.setName(toQualifiedName(name));
		goal.setKind(kind);
		goal.setPriority(priority);
		goal.setCondition(condition);
		return goal;
	}
	
	public static GoalImplication createGoalImplication(GoalDisjunction left, GoalDisjunction right) {
		GoalImplication implication = GML.createGoalImplication();
		implication.setLeft(left);
		implication.setOperator(COMMON.createImplicationOperator());
		implication.setRight(right);
		return implication;
	}
	
	private static GoalDisjunction createGoalDisjunction(GoalConjunction left, GoalConjunction right) {
		GoalDisjunction disjunction = GML.createGoalDisjunction();
		disjunction.setLeft(left);
		disjunction.setRight(right);
		return disjunction;
	}
	
	public static GoalDisjunction createGoalOrDisjunction(GoalConjunction left, GoalConjunction right) {
		GoalDisjunction disjunction = createGoalDisjunction(left, right);
		disjunction.setOperator(COMMON.createOrOperator());
		return disjunction;
	}
	
	public static Disjunction createGoalXOrDisjunction(GoalConjunction left, GoalConjunction right) {
		GoalDisjunction disjunction = createGoalDisjunction(left, right);
		disjunction.setOperator(COMMON.createXOrOperator());
		return disjunction;
	}
	
	public static GoalConjunction createGoalConjunction(GoalComparison left, GoalComparison right) {
		GoalConjunction conjunction = GML.createGoalConjunction();
		conjunction.setLeft(left);
		conjunction.setRight(right);
		conjunction.setOperator(COMMON.createAndOperator());
		return conjunction;
	}
	
	private static GoalComparison createGoalComparison(GoalBooleanUnit left, GoalBooleanUnit right) {
		GoalComparison expression = GML.createGoalComparison();
		expression.setLeft(left);
		expression.setRight(right);
		return expression;
	}
	
	public static GoalComparison createGoalEqualsComparison(GoalBooleanUnit left, GoalBooleanUnit right) {
		GoalComparison expression = createGoalComparison(left, right);
		expression.setOperator(COMMON.createEqualsOperator());
		return expression;
	}
	
	public static Comparison createNotEqualsComparison(GoalBooleanUnit left, GoalBooleanUnit right) {
		GoalComparison expression = createGoalComparison(left, right);
		expression.setOperator(COMMON.createNotEqualsOperator());
		return expression;
	}
	
	public static GoalNegation createGoalNegation(GoalBooleanUnit expression) {
		GoalNegation negation = GML.createGoalNegation();
		negation.setOperator(COMMON.createNotOperator());
		negation.setValue(expression);
		return negation;
	}
	
	public static GoalBooleanLiteral createGoalBooleanLiteral(Boolean value) {
		GoalBooleanLiteral l = GML.createGoalBooleanLiteral();
		l.setValue(value);
		return l;
	}
	
	public static ParenthesizedGoalExpression createParenthesizedGoalExpression(GoalExpression value) {
		ParenthesizedGoalExpression expression = GML.createParenthesizedGoalExpression();
		expression.setValue(value);
		return expression;
	}
	
	public static GoalReference createGoalReference(Goal goal) {
		GoalReference ref = GML.createGoalReference();
		ref.setValue(goal);
		return ref;
	}
	
	public static AppliedQuantitativePropertyExpression createAppliedQuantitativePropertyExpression(AppliedQuantitativeProperty property) {
		AppliedQuantitativePropertyExpression expression = GML.createAppliedQuantitativePropertyExpression();
		expression.setValue(property);
		return expression;
	}
	
	//
	// GEL
	//
	
	public static MigrationEvaluation createMigrationEvaluation(String qualifiedName, Date date, Iterable<? extends Transformation> transformations, Iterable<? extends AppliedPropertyEvaluation> propertyEvaluations, GoalModelEvaluation goalModelEvaluation) {
		MigrationEvaluation evaluation = GEL.createMigrationEvaluation();
		evaluation.setName(toQualifiedName(qualifiedName));
		evaluation.setDate(date.toString());
		add(transformations, evaluation.getTransformations());
		add(propertyEvaluations, evaluation.getPropertyEvaluations());
		if(goalModelEvaluation != null)
			evaluation.setEvaluation(goalModelEvaluation);
		return evaluation;
	}
	
	public static MigrationEvaluation createMigrationEvaluation(String qualifiedName, Date date, GoalModelEvaluation goalModelEvaluation) {
		return createMigrationEvaluation(qualifiedName, date, null, null, goalModelEvaluation);
	}
	
	public static MigrationEvaluation createMigrationEvaluation(String qualifiedName, Date date, Iterable<? extends AppliedPropertyEvaluation> propertyEvaluations, GoalModelEvaluation goalModelEvaluation) {
		return createMigrationEvaluation(qualifiedName, date, null, propertyEvaluations, goalModelEvaluation);
	}
	
	public static Transformation createTransformation(String name, Pattern pattern, Iterable<? extends NamedElement> sources, Iterable<? extends NamedElement> targets) {
		Transformation transformation = GEL.createTransformation();
		transformation.setName(toQualifiedName(name));
		transformation.setPattern(pattern);
		add(sources, transformation.getSource());
		add(targets, transformation.getTarget());
		return transformation;
	}
	
	public static Transformation createTransformation(String name, Pattern pattern) {
		return createTransformation(name, pattern, null, null);
	}
	
	public static AppliedQualitativePropertyEvaluation createAppliedQualitativePropertyEvaluation(String name, AppliedQualitativeProperty property, ValueSpecification value, NumberExpressionEvaluation evaluation) {
		AppliedQualitativePropertyEvaluation eval = GEL.createAppliedQualitativePropertyEvaluation();
		eval.setName(toQualifiedName(name));
		eval.setProperty(property);
		eval.setValue(value);
		eval.setEvaluation(evaluation);
		return eval;
	}
	
	public static AppliedQuantitativePropertyEvaluation createAppliedQuantitativePropertyEvaluation(String name, AppliedQuantitativeProperty property, ValueSpecification value, ValueExpressionEvaluation evaluation, Iterable<? extends QuantitativePropertyRealization> realizations) {
		AppliedQuantitativePropertyEvaluation eval = GEL.createAppliedQuantitativePropertyEvaluation();
		eval.setName(toQualifiedName(name));
		eval.setProperty(property);
		eval.setValue(value);
		eval.setEvaluation(evaluation);
		add(realizations, eval.getRealizations());
		return eval;
	}
	
	public static AppliedQuantitativePropertyEvaluation createAppliedQuantitativePropertyEvaluation(String name, AppliedQuantitativeProperty property, ValueSpecification value, ValueExpressionEvaluation evaluation) {
		return createAppliedQuantitativePropertyEvaluation(name, property, value, evaluation, null);
	}
	
	public static QuantitativePropertyRealization createQuantitativePropertyRealization(String name, EvaluationStrategy strategy, RealizationLevelKind level, RealizationTypeKind type, Iterable<? extends ValueSpecification> values, BigDecimal precision) {
		QuantitativePropertyRealization realization = GEL.createQuantitativePropertyRealization();
		realization.setName(toQualifiedName(name));
		if(strategy != null)
			realization.setStrategy(strategy);
		realization.setLevel(level);
		realization.setType(type);
		add(values, realization.getValues());
		if(precision != null)
			realization.setPrecision(precision);
		return realization;
	}
	
	public static QuantitativePropertyRealization createQuantitativePropertyRealization(String name, EvaluationStrategy strategy, RealizationLevelKind level, RealizationTypeKind type, Iterable<? extends ValueSpecification> values, double precision) {
		return createQuantitativePropertyRealization(name, strategy, level, type, values, new BigDecimal(precision, getSettings().getMathContext()));
	}
	
	public static QuantitativePropertyRealization createQuantitativePropertyRealization(String name, EvaluationStrategy strategy, RealizationLevelKind level, RealizationTypeKind type, Iterable<? extends ValueSpecification> values) {
		return createQuantitativePropertyRealization(name, strategy, level, type, values, null);
	}
		
	public static QuantitativePropertyRealization createQuantitativePropertyRealization(String name, RealizationLevelKind level, RealizationTypeKind type, Iterable<ValueSpecification> values) {
		return createQuantitativePropertyRealization(name, null, level, type, values, null);
	}
	
	public static QuantitativePropertyRealization createQuantitativePropertyRealization(String name, EvaluationStrategy strategy, RealizationLevelKind level, RealizationTypeKind type) {
		return createQuantitativePropertyRealization(name, strategy, level, type, null, null);
	}
	
	public static QuantitativePropertyRealization createQuantitativePropertyRealization(String name, RealizationLevelKind level, RealizationTypeKind type) {
		return createQuantitativePropertyRealization(name, null, level, type, null, null);
	}
	
	public static GoalModelEvaluation createGoalModelEvaluation(GoalModel goalModel, Verdict verdict, String reason, Iterable<? extends GoalEvaluation> evaluations) {
		GoalModelEvaluation eval = GEL.createGoalModelEvaluation();
		eval.setGoalModel(goalModel);
		eval.setVerdict(verdict);
		eval.setReason(reason);
		add(evaluations, eval.getEvaluations());
		return eval;
	}
	
	public static GoalModelEvaluation createGoalModelEvaluation(GoalModel goalModel, Verdict verdict, String reason) {
		return createGoalModelEvaluation(goalModel, verdict, reason, null);
	}
	
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
	
	public static SoftGoalEvaluation createSoftGoalEvaluation(String name, SoftGoal goal, Verdict verdict, String reason, double difference) {
		return createSoftGoalEvaluation(name, goal, verdict, reason, new BigDecimal(difference, getSettings().getMathContext()));
	}
		
	public static SoftGoalEvaluation createSoftGoalEvaluation(String name, SoftGoal goal, Verdict verdict, String reason, int difference) {
		return createSoftGoalEvaluation(name, goal, verdict, reason, new BigDecimal(difference, getSettings().getMathContext()));
	}
	
	public static SoftGoalEvaluation createSoftGoalEvaluation(String name, SoftGoal goal, Verdict verdict, String reason) {
		return createSoftGoalEvaluation(name, goal, verdict, reason, null);
	}
	
	public static HardGoalEvaluation createHardGoalEvaluation(String name, HardGoal goal, Verdict verdict, String reason, BooleanExpressionEvaluation evaluation) {
		HardGoalEvaluation eval = GEL.createHardGoalEvaluation();
		eval.setName(toQualifiedName(name));
		eval.setGoal(goal);
		eval.setVerdict(verdict);
		eval.setReason(reason);
		eval.setConditionEvaluation(evaluation);
		return eval;
	}
	
	public static CompositeGoalEvaluation createCompositeGoalEvaluation(String name, CompositeGoal goal, Verdict verdict, String reason, BooleanExpressionEvaluation evaluation) {
		CompositeGoalEvaluation eval = GEL.createCompositeGoalEvaluation();
		eval.setName(toQualifiedName(name));
		eval.setGoal(goal);
		eval.setVerdict(verdict);
		eval.setReason(reason);
		eval.setConditionEvaluation(evaluation);
		return eval;
	}
	
	public static ValueSpecificationExpressionEvaluation createValueSpecificationExpressionEvaluation(ValueSpecification result, String reason, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		ValueSpecificationExpressionEvaluation eval = GEL.createValueSpecificationExpressionEvaluation();
		if(result != null)
			eval.setResult(copy(result));
		eval.setReason(reason);
		add(evaluations, eval.getEvaluations());
		return eval;
	}
	
	public static ValueSpecificationExpressionEvaluation createValueSpecificationExpressionEvaluation(ValueSpecification result, String reason) {
		return createValueSpecificationExpressionEvaluation(result, reason, null);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason, BigDecimal difference, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		BooleanExpressionEvaluation eval = GEL.createBooleanExpressionEvaluation();
		if(result != null)
			eval.setResult(copy(result));
		eval.setReason(reason);
		if(difference != null)
			eval.setDifference(difference);
		add(evaluations, eval.getEvaluations());
		return eval;
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, BigDecimal difference, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		return createBooleanExpressionEvaluation(ValueUtil.createBooleanLiteralOrNull(result), reason, difference, evaluations);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		return createBooleanExpressionEvaluation(ValueUtil.createBooleanLiteralOrNull(result), reason, null, evaluations);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason, BigDecimal difference) {
		return createBooleanExpressionEvaluation(result, reason, difference, null);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, BigDecimal difference) {
		return createBooleanExpressionEvaluation(result, reason, difference, null);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason, double difference) {
		return createBooleanExpressionEvaluation(result, reason, new BigDecimal(difference, getSettings().getMathContext()), null);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, double difference) {
		return createBooleanExpressionEvaluation(result, reason, new BigDecimal(difference, getSettings().getMathContext()), null);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason, int difference) {
		return createBooleanExpressionEvaluation(result, reason, new BigDecimal(difference, getSettings().getMathContext()), null);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, int difference) {
		return createBooleanExpressionEvaluation(result, reason, new BigDecimal(difference, getSettings().getMathContext()), null);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(BooleanLiteral result, String reason) {
		return createBooleanExpressionEvaluation(result, reason, null, null);
	}
	
	public static BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason) {
		return createBooleanExpressionEvaluation(result, reason, null, null);
	}
	
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(NumberLiteral result, String reason, Iterable<? extends NumberExpressionEvaluation> evaluations) {
		NumberExpressionEvaluation eval = GEL.createNumberExpressionEvaluation();
		if(result != null)
			eval.setResult(copy(result));
		eval.setReason(reason);
		add(evaluations, eval.getEvaluations());
		return eval;
	}
	
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(BigDecimal result, String reason, Iterable<? extends NumberExpressionEvaluation> evaluations) {
		return createNumberExpressionEvaluation(ValueUtil.createNumberLiteralOrNull(result), reason, evaluations);
	}
	
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(NumberLiteral result, String reason) {
		return createNumberExpressionEvaluation(result, reason, (Iterable<? extends NumberExpressionEvaluation>)null);
	}
	
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(BigDecimal result, String reason) {
		return createNumberExpressionEvaluation(result, reason, (Iterable<? extends NumberExpressionEvaluation>)null);
	}
	
	public static NumberExpressionEvaluation createNumberExpressionEvaluation(String reason) {
		return createNumberExpressionEvaluation((NumberLiteral)null, reason, (Iterable<? extends NumberExpressionEvaluation>)null);
	}
	
	public static <T extends EObject> T copy(T v) {
		return EcoreUtil2.copy(v);
	}
}

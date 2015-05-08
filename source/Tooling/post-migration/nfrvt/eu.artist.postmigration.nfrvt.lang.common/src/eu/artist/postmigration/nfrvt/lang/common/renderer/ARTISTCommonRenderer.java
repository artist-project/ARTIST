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
package eu.artist.postmigration.nfrvt.lang.common.renderer;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import eu.artist.postmigration.nfrvt.lang.common.ARTISTDateTimeValueConverter;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ComparableExpression;
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

/**
 * A base renderer for all ARTIST migration languages. All rendering is 
 * delegated to methods with the signature 'render(T)' using a 
 * {@link PolymorphicDispatcher}. Subclasses can implement
 * additional render methods for the objects of type T they want to 
 * render.
 * 
 * @author Martin Fleck
 */
public class ARTISTCommonRenderer implements ITextRenderer {

	private PolymorphicDispatcher<String> renderDispatcher = new PolymorphicDispatcher<>(
			"render", Collections.singletonList(this));

	private DecimalFormat format = new DecimalFormat();
	
	public ARTISTCommonRenderer() {
		format.setMaximumFractionDigits(2);
		format.setMinimumFractionDigits(0);
		format.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
		format.setGroupingUsed(false);
	}
	
	public void setPrecision(int precision) {
		format.setMaximumFractionDigits(precision);
	}
	
	@Override
	public String doRender(Object obj) {
		if(obj == null)
			return null;
		String render = renderDispatcher.invoke(obj);
		if(render == null)
			return null;
		return render;
	}

	@Override
	public String doRender(String leftParenthesis, String rightParenthesis,
			String delimiter, java.util.Collection<? extends Object> objects) {
		if (objects.size() == 0)
			return leftParenthesis + rightParenthesis;

		String delim = "";
		StringBuilder builder = new StringBuilder();
		builder.append(leftParenthesis);
		for (Object elem : objects) {
			builder.append(delim).append(doRender(elem));
			delim = delimiter;
		}
		builder.append(rightParenthesis);
		return builder.toString();
	}
	
	@Override
	public String doRender(java.util.Collection<? extends Object> objects) {
		return doRender("(", ")", ", ", objects);
	}
	
	@Override
	public String doRender(String leftParenthesis, String rightParenthesis,
			String delimiter, Object... objects) {
		if (objects.length == 0)
			return leftParenthesis + rightParenthesis;

		String delim = "";
		StringBuilder builder = new StringBuilder();
		builder.append(leftParenthesis);
		for (Object elem : objects) {
			builder.append(delim).append(doRender(elem));
			delim = delimiter;
		}
		builder.append(rightParenthesis);
		return builder.toString();
	}

	@Override
	public String doRender(Object... objects) {
		return doRender("(", ")", ", ", objects);
	}
	
	protected String render(Object op) {
		return null;
	}
	
	protected String render(AdditionOperator op) {
		return "+";
	}

	protected String render(AndOperator op) {
		return "&&";
	}

	protected String render(NotOperator op) {
		return "not";
	}

	protected String render(DivisionOperator op) {
		return "/";
	}

	protected String render(EqualsOperator op) {
		return "==";
	}

	protected String render(GreaterOrEqualThanOperator op) {
		return ">=";
	}

	protected String render(GreaterThanOperator op) {
		return ">";
	}

	protected String render(ImplicationOperator op) {
		return "=>";
	}

	protected String render(LessOrEqualThanOperator op) {
		return "<=";
	}

	protected String render(LessThanOperator op) {
		return "<";
	}

	protected String render(ModulusOperator op) {
		return "%";
	}

	protected String render(MultiplicationOperator op) {
		return "*";
	}

	protected String render(NotEqualsOperator op) {
		return "!=";
	}

	protected String render(OrOperator op) {
		return "||";
	}

	protected String render(SubstractionOperator op) {
		return "-";
	}

	protected String render(XOrOperator op) {
		return "xor";
	}

	protected String render(MaxOperator op) {
		return "max";
	}

	protected String render(MinOperator op) {
		return "min";
	}

	protected String render(AvgOperator op) {
		return "avg";
	}

	protected String render(SumOperator op) {
		return "sum";
	}

	protected String render(ExponentialOperator op) {
		return "exp";
	}

	protected String render(AbsoluteOperator op) {
		return "abs";
	}

	protected String render(NaturalLogarithmOperator op) {
		return "ln";
	}

	protected String render(CommonLogarithmOperator op) {
		return "log";
	}

	protected String render(UnlimitedLiteral l) {
		return l.getValue();
	}

	protected String render(StringLiteral l) {
		return "«" + l.getValue() + "»";
	}

	protected String render(NullLiteral l) {
		return l.getValue();
	}

	protected String render(NumberLiteral l) {
		if (l == null)
			return null;
		return doRender(l.getValue());
	}

	protected String render(BigDecimal decimal) {
		return format.format(decimal.doubleValue());
	}

	protected String render(BooleanLiteral l) {
		if (l == null)
			return null;
		if (l.getValue() == null)
			return "unknown";
		return doRender(l.getValue());
	}

	protected String render(Boolean b) {
		if (b == null)
			return null;
		return Boolean.toString(b);
	}

	protected String render(ObjectSpecificationExpression e) {
		return doRender(e.getType()) + " " + doRender(e.getValue());
	}

	protected String render(Collection c) {
		return doRender("[", "]", ", ", c.getValues());
	}

	protected String render(Tuple t) {
		return doRender("{", "}", ", ", t.getTuples());
	}

	protected String render(PropertyValuePair p) {
		return doRender(p.getProperty()) + " = " + doRender(p.getValue());
	}

	protected String render(Property property) {
		if (property == null)
			return null;
		return property.getName();
	}

	protected String render(DataType type) {
		if (type == null)
			return null;
		return type.getName();
	}

	protected String render(InstanceSpecificationExpression e) {
		if(e.getValue() == null)
			return null;
		String qn = e.getValue().getQualifiedName();
		return qn;
	}

	protected String render(Implication e) {
		return doRender(e.getLeft()) + " " + doRender(e.getOperator()) + " "
				+ doRender(e.getRight());
	}

	protected String render(Disjunction e) {
		return doRender(e.getLeft()) + " " + doRender(e.getOperator()) + " "
				+ doRender(e.getRight());
	}

	protected String render(Conjunction e) {
		return doRender(e.getLeft()) + " " + doRender(e.getOperator()) + " "
				+ doRender(e.getRight());
	}

	protected String render(Comparison e) {
		return doRender(e.getLeft()) + " " + doRender(e.getOperator()) + " "
				+ doRender(e.getRight());
	}

	protected String render(Negation n) {
		return "!" + doRender(n.getValue()) + "";
	}

	protected String render(RelationalExpression e) {
		return doRender(e.getLeft()) + " " + doRender(e.getOperator()) + " "
				+ doRender(e.getRight());
	}

	protected String render(ComparableExpression e) {
		return doRender(e.getLeft()) + " " + doRender(e.getOperator()) + " "
				+ doRender(e.getRight());
	}

	protected String render(ParenthesizedExpression e) {
		return "(" + doRender(e.getValue()) + ")";
	}

	protected String render(ArithmeticExpression e) {
		return doRender(e.getLeft()) + " " + doRender(e.getOperator()) + " "
				+ doRender(e.getRight());
	}

	protected String render(AdditiveExpression e) {
		return doRender(e.getLeft()) + " " + doRender(e.getOperator()) + " "
				+ doRender(e.getRight());
	}

	protected String render(MultiplicativeExpression e) {
		return doRender(e.getLeft()) + " " + doRender(e.getOperator()) + " "
				+ doRender(e.getRight());
	}

	protected String render(MaximumFunction e) {
		return doRender(e.getOperator()) + doRender(e.getValues());
	}

	protected String render(MinimumFunction e) {
		return doRender(e.getOperator()) + doRender(e.getValues());
	}

	protected String render(AverageFunction e) {
		return doRender(e.getOperator()) + doRender(e.getValues());
	}

	protected String render(SumFunction e) {
		return doRender(e.getOperator()) + doRender(e.getValues());
	}

	protected String render(ExponentialFunction e) {
		return doRender(e.getOperator()) + "(" + doRender(e.getBase()) + ", "
				+ doRender(e.getExponent()) + ")";
	}

	protected String render(AbsoluteFunction e) {
		return doRender(e.getOperator()) + "(" + doRender(e.getValue()) + ")";
	}

	protected String render(NaturalLogarithmFunction e) {
		return doRender(e.getOperator()) + "(" + doRender(e.getValue()) + ")";
	}

	protected String render(CommonLogarithmFunction e) {
		return doRender(e.getOperator()) + "(" + doRender(e.getValue()) + ")";
	}

	public String getEllipsisText(String text, int maxLength) {
		if (text.length() < maxLength)
			return text;

		String ellipsis = "...";
		return text.substring(0, maxLength - 3) + ellipsis;
	}

	protected String render(ImportURIorNamespace i) {
		String importUri = i.getImportURI() != null
				&& !i.getImportURI().isEmpty() ? i.getImportURI() : "";
		String importNs = i.getImportedNamespace() != null
				&& !i.getImportedNamespace().isEmpty() ? i
				.getImportedNamespace() : "";
		return importUri + importNs;
	}

	protected String render(ImportURI i) {
		return i.getImportURI();
	}

	protected String render(ImportNamespace i) {
		return i.getImportedNamespace();
	}
	
	protected String render(String s) {
		return s;
	}
	
	protected String render(Date date) {
		return ARTISTDateTimeValueConverter.MILLISECONDS.format(date);
	}
}

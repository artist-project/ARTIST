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
package eu.artist.postmigration.nfrvt.lang.common.validation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Property;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit;
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
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression;
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
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.LiteralValueExpression;
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
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator;
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
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator;

public class ARTISTCommonRenderer {
	
		public String render(Operator op) {
			if(op instanceof AdditionOperator)
				return render((AdditionOperator)op);
			if(op instanceof DivisionOperator)
				return render((DivisionOperator)op);
			if(op instanceof AndOperator)
				return render((AndOperator)op);
			if(op instanceof NotOperator)
				return render((NotOperator)op);
			if(op instanceof EqualsOperator)
				return render((EqualsOperator)op);
			if(op instanceof GreaterOrEqualThanOperator)
				return render((GreaterOrEqualThanOperator)op);
			if(op instanceof GreaterThanOperator)
				return render((GreaterThanOperator)op);
			if(op instanceof ImplicationOperator)
				return render((ImplicationOperator)op);
			if(op instanceof LessOrEqualThanOperator)
				return render((LessOrEqualThanOperator)op);
			if(op instanceof LessThanOperator)
				return render((LessThanOperator)op);
			if(op instanceof ModulusOperator)
				return render((ModulusOperator)op);
			if(op instanceof MultiplicationOperator)
				return render((MultiplicationOperator)op);
			if(op instanceof NotEqualsOperator)
				return render((NotEqualsOperator)op);
			if(op instanceof OrOperator)
				return render((OrOperator)op);
			if(op instanceof SubstractionOperator)
				return render((SubstractionOperator)op);
			if(op instanceof XOrOperator)
				return render((XOrOperator)op);
			if(op instanceof MaxOperator)
				return render((MaxOperator)op);
			if(op instanceof MinOperator)
				return render((MinOperator)op);
			if(op instanceof AvgOperator)
				return render((AvgOperator)op);
			if(op instanceof ExponentialOperator)
				return render((ExponentialOperator)op);
			if(op instanceof AbsoluteOperator)
				return render((AbsoluteOperator)op);
			if(op instanceof NaturalLogarithmOperator)
				return render((NaturalLogarithmOperator)op);
			if(op instanceof CommonLogarithmOperator)
				return render((CommonLogarithmOperator)op);
			if(op instanceof SumOperator)
				return render((SumOperator)op);
			return null;
		}

		public String render(AdditionOperator op) {
			return "+";
		}
		
		public String render(AndOperator op) {
			return "&&";
		}
		
		public String render(NotOperator op) {
			return "not";
		}
		
		public String render(DivisionOperator op) {
			return "/";
		}
		
		public String render(EqualsOperator op) {
			return "==";
		}
		
		public String render(GreaterOrEqualThanOperator op) {
			return ">=";
		}
		
		public String render(GreaterThanOperator op) {
			return ">";
		}
		
		public String render(ImplicationOperator op) {
			return "=>";
		}
		
		public String render(LessOrEqualThanOperator op) {
			return "<=";
		}
		
		public String render(LessThanOperator op) {
			return "<";
		}
		
		public String render(ModulusOperator op) {
			return "%";
		}
		
		public String render(MultiplicationOperator op) {
			return "*";
		}
		
		public String render(NotEqualsOperator op) {
			return "!=";
		}
		
		public String render(OrOperator op) {
			return "||";
		}
		
		public String render(SubstractionOperator op) {
			return "-";
		}
		
		public String render(XOrOperator op) {
			return "xor";
		}
	
		public String render(MaxOperator op) {
			return "max";
		}
		
		public String render(MinOperator op) {
			return "min";
		}
		
		public String render(AvgOperator op) {
			return "avg";
		}
		
		public String render(SumOperator op) {
			return "sum";
		}
		
		public String render(ExponentialOperator op) {
			return "exp";
		}
		
		public String render(AbsoluteOperator op) {
			return "abs";
		}
		
		public String render(NaturalLogarithmOperator op) {
			return "ln";
		}
		
		public String render(CommonLogarithmOperator op) {
			return "log";
		}
		
		public String render(LiteralValueExpression e) {
			if(e instanceof StringLiteral)
				return render((StringLiteral)e);
			if(e instanceof UnlimitedLiteral)
				return render((UnlimitedLiteral)e);
			if(e instanceof NullLiteral)
				return render((NullLiteral)e);
			if(e instanceof NumberLiteral)
				return render((NumberLiteral)e);
			if(e instanceof BooleanLiteral)
				return render((BooleanLiteral)e);
			
			return null;
		}
		
		public String render(UnlimitedLiteral l) {
			return l.getValue();
		}
		
		public String render(StringLiteral l) {
			return ">" + l.getValue() + "<";
		}
		
		public String render(NullLiteral l) {
			return l.getValue();
		}
		
		public String render(NumberLiteral l) {
			if(l == null)
				return null;
			return render(l.getValue());
		}
		
		public String render(BigDecimal decimal) {
			return decimal.toEngineeringString();
		}
		
		public String render(BooleanLiteral l) {
			if(l == null)
				return null;
			if(l.getValue() == null)
				return "unknown";
			return render(l.getValue());
		}
		
		public String render(Boolean b) {
			if(b == null)
				return null;
			return Boolean.toString(b);
		}
		
		public String render(ValueSpecification vs) {
			if(vs == null)
				return null;
			if(vs instanceof InstanceSpecificationExpression)
				return render((InstanceSpecificationExpression)vs);
			if(vs instanceof ObjectSpecificationExpression)
				return render((ObjectSpecificationExpression)vs);
			if(vs instanceof LiteralValueExpression)
				return render((LiteralValueExpression)vs);
			
			return null;
		}
		
		public String render(ObjectSpecificationExpression e) {
			Object value = e.getValue();
			String valueString = "";
			if(value instanceof Collection)
				valueString = render((Collection)value);
			else if(value instanceof Tuple)
				valueString = render((Tuple)value);
			return render(e.getType()) + " " + valueString;
		}
		
		public String render(Collection c) {
			return renderList(c.getValues(), ValueSpecification.class, "[", "]", ",");
		}
		
		public String render(Tuple t) {
			return renderList(t.getTuples(), PropertyValuePair.class, "{", "}", ",");
		}
		
		public String render(PropertyValuePair p) {
			return render(p.getProperty()) + " = " + render(p.getValue());
		}
		
		private String render(Property property) {
			if(property == null)
				return null;
			return property.getName();
		}

		public String render(DataType type) {
			if(type == null)
				return null;
			return type.getName();
		}
		
		public String render(InstanceSpecificationExpression e) {
			String qn = e.getValue().getQualifiedName();
			return qn;
		}
		
		
		public String render(Expression e) {
			if(e instanceof Implication)
				return render((Implication)e);

			return null;
		}
		
		public String render(Implication e) {
			if(e instanceof Disjunction)
				return render((Disjunction)e);
			
			return render(e.getLeft()) + " " + render(e.getOperator()) + " " + render(e.getRight());
		}
		
		public String render(Disjunction e) {
			if(e instanceof Conjunction)
				return render((Conjunction)e);
			
			return render(e.getLeft()) + " " + render(e.getOperator()) + " " + render(e.getRight());
		}
		
		public String render(Conjunction e) {
			if(e instanceof Comparison)
				return render((Comparison)e);
			
			return render(e.getLeft()) + " " + render(e.getOperator()) + " " + render(e.getRight());
		}
		
		public String render(Comparison e) {
			if(e instanceof BooleanUnit)
				return render((BooleanUnit)e);
			
			return render(e.getLeft()) + " " + render(e.getOperator()) + " " + render(e.getRight());
		}
		
		public String render(BooleanUnit e) {
			if(e instanceof BooleanLiteral)
				return render((BooleanLiteral)e);
			if(e instanceof Negation)
				return render((Negation)e);
			if(e instanceof RelationalExpression)
				return render((RelationalExpression)e);
			return null;
		}
		
		public String render(Negation n) {
			return "!" + render(n.getValue()) + "";
		}
		
		public String render(RelationalExpression e) {
			if(e instanceof ComparableExpression)
				return render((ComparableExpression)e);
			
			return render(e.getLeft()) + " " + render(e.getOperator()) + " " + render(e.getRight());
		}
		
		public String render(ComparableExpression e) {
			if(e instanceof ArithmeticExpression)
				return render((ArithmeticExpression)e);
			if(e instanceof ValueSpecification)
				return render((ValueSpecification)e);
			if(e instanceof ParenthesizedExpression)
				return render((ParenthesizedExpression)e);
			
			return render(e.getLeft()) + " " + render(e.getOperator()) + " " + render(e.getRight());
		}
		
		public String render(ParenthesizedExpression e) {
			return "(" + render(e.getValue()) + ")";
		}
		
		public String render(ArithmeticExpression e) {
			if(e instanceof AdditiveExpression)
				return render((AdditiveExpression)e);
			
			return render(e.getLeft()) + " " + render(e.getOperator()) + " " + render(e.getRight());
		}
		
		public String render(AdditiveExpression e) {
			if(e instanceof MultiplicativeExpression)
				return render((MultiplicativeExpression)e);
			
			return render(e.getLeft()) + " " + render(e.getOperator()) + " " + render(e.getRight());
		}
		
		public String render(MultiplicativeExpression e) {
			if(e instanceof NumberExpression)
				return render((NumberExpression)e);
			
			return render(e.getLeft()) + " " + render(e.getOperator()) + " " + render(e.getRight());
		}
		
		public String render(NumberExpression e) {
			if(e instanceof NumberLiteral)
				return render((NumberLiteral)e);
			if(e instanceof NumberFunction)
				return render((NumberFunction)e);
			
			return null;
		}		
		
		public String render(NumberFunction e) {
			if(e instanceof MaximumFunction)
				return render((MaximumFunction)e);
			
			if(e instanceof MinimumFunction)
				return render((MinimumFunction)e);
			
			if(e instanceof AverageFunction)
				return render((AverageFunction)e);
			
			if(e instanceof SumFunction)
				return render((SumFunction)e);
			
			if(e instanceof ExponentialFunction)
				return render((ExponentialFunction)e);
			
			if(e instanceof AbsoluteFunction)
				return render((AbsoluteFunction)e);
			
			if(e instanceof NaturalLogarithmFunction)
				return render((NaturalLogarithmFunction)e);
			
			if(e instanceof CommonLogarithmFunction)
				return render((CommonLogarithmFunction)e);
			
			return null;
		}
		
		public String render(MaximumFunction e) {
			return render(e.getOperator()) + renderList(e.getValues(), NumberExpression.class);
		}
		
		public String render(MinimumFunction e) {
			return render(e.getOperator()) + renderList(e.getValues(), NumberExpression.class);
		}
		
		public String render(AverageFunction e) {
			return render(e.getOperator()) + renderList(e.getValues(), NumberExpression.class);
		}
		
		public String render(SumFunction e) {
			return render(e.getOperator()) + renderList(e.getValues(), NumberExpression.class);
		}
		
		public String render(ExponentialFunction e) {
			return render(e.getOperator()) + "(" + render(e.getBase()) + ", " + render(e.getExponent()) + ")";
		}
		
		public String render(AbsoluteFunction e) {
			return render(e.getOperator()) + "(" + render(e.getValue()) + ")";
		}
		
		public String render(NaturalLogarithmFunction e) {
			return render(e.getOperator()) + "(" + render(e.getValue()) + ")";
		}
		
		public String render(CommonLogarithmFunction e) {
			return render(e.getOperator()) + "(" + render(e.getValue()) + ")";
		}
	
		public <T extends Object> String renderList(List<T> list, Class<T> clazz, String leftParenthesis, String rightParenthesis, String delimiter) {
			if(list.size() == 0)
				return leftParenthesis + rightParenthesis;
			
			Method method = null;
			try {
				method = getClass().getMethod("render", clazz);
			} catch (NoSuchMethodException | SecurityException e1) {
				e1.printStackTrace();
				return leftParenthesis + rightParenthesis;
			}
			
			String delim = "";
			
			StringBuilder builder = new StringBuilder();
			builder.append(leftParenthesis);
			for(T elem : list) {
				try {
					builder.append(delim).append(method.invoke(this, elem));
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
				delim = delimiter;
			}
			builder.append(rightParenthesis);
			return builder.toString();
		}
		
		public <T extends Object> String renderList(List<T> list, Class<T> clazz) {
			return renderList(list, clazz, "(", ")", ", ");
		}
		
		public String getEllipsisText(String text, int maxLength) {
			if(text.length() < maxLength)
				return text;
			
			String ellipsis = "...";
			return text.substring(0, maxLength - 3) + ellipsis;
		}
		
		public String render(ImportURIorNamespace i) {
			String importUri = i.getImportURI() != null && !i.getImportURI().isEmpty() ? i.getImportURI() : "";
			String importNs = i.getImportedNamespace() != null && !i.getImportedNamespace().isEmpty() ? i.getImportedNamespace() : "";
			return "import " + importUri + importNs;
		}
		
		public String render(ImportURI i) {
			return "import " + i.getImportURI();
		}
		
		public String render(ImportNamespace i) {
			return "import " + i.getImportedNamespace();
		}
}

/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 * 
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/

package eu.artist.reusevol.server.util.search

import java.util.List
import org.apache.cxf.jaxrs.ext.search.ConditionType
import org.apache.cxf.jaxrs.ext.search.PrimitiveStatement
import org.apache.cxf.jaxrs.ext.search.SearchCondition
import org.apache.cxf.jaxrs.ext.search.SearchConditionVisitor

class JcrSql2Visitor<T> implements SearchConditionVisitor<T, String> {

	val String nodeType
	val String classname
	val String basePath

	var StringBuilder sb

	new(String nodeType, String classname) {
		this(nodeType, classname, null)
	}

	new(String nodeType, String classname, String basePath) {
		this.nodeType = nodeType
		this.classname = classname
		this.basePath = basePath
		this.sb = null
	}

	override visit(SearchCondition<T> sc) {
		sb = if (sb == null) {
			new StringBuilder() => [
				append("SELECT * FROM [").append(nodeType)
				.append("] WHERE [classname] = '")
				.append(classname).append("' AND ")
			]
		} else {
			sb
		}

		val statement = sc.getStatement
		if (statement != null) {
			renderSimpleStatement(statement)
		} else {
			renderCompositeExpression(sc)
		}
	}

	private def renderSimpleStatement(PrimitiveStatement statement) {
		val value = getSingleValue(statement)
		val conditionType = statement.condition
		val property = statement.property

		sb.append("[").append(property).append("]");
		if (conditionType == ConditionType.EQUALS) {
			sb.append(" = ");
		} else if (conditionType == ConditionType.GREATER_THAN) {
			sb.append(" > ");
		} else if (conditionType == ConditionType.LESS_THAN) {
			sb.append(" < ");
		} else if (conditionType == ConditionType.GREATER_OR_EQUALS) {
			sb.append(" >= ");
		} else if (conditionType == ConditionType.LESS_OR_EQUALS) {
			sb.append(" <= ");
		} else if (conditionType == ConditionType.NOT_EQUALS) {
			sb.append(" != ");
		}
		sb.append("'").append(value).append("'");
	}

	private def String getSingleValue(PrimitiveStatement statement) {
		if (statement.getValue() instanceof List<?>) {
			(statement.value as List<String>).get(0)
		} else {
			statement.value.toString
		}
	}

	private def void renderCompositeExpression(SearchCondition<T> sc) {
		val conditions = sc.searchConditions

		conditions.forEach [ it, i |
			sb.append("(")
			accept(this)
			sb.append(")")

			if (i < conditions.size - 1) {
				renderCompositeOperator(sc)
			}
		]
	}

	private def void renderCompositeOperator(SearchCondition<T> sc) {
		if (sc.conditionType == ConditionType.AND) {
			sb.append(" AND ")
		} else if (sc.conditionType == ConditionType.OR) {
			sb.append(" OR ")
		}
	}

	override getQuery() {
		if (sb != null) {
			if (basePath != null) {
				sb.append(" AND ISDESCENDANTNODE(['").append(basePath).append("'])")
			}
			sb.toString()
		} else {
			null
		}
	}

}

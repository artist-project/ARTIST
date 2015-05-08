/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result.html;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;

import org.modelexecution.fuml.nfr.simulation.result.AbstractPrinter;

public class SimulationJavaScript extends AbstractPrinter {

	private String jsString;
	
	public void writeFile(File file) throws FileNotFoundException, IOException, URISyntaxException {
		FileOutputStream jsFile = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(jsFile, "UTF-8");
		writer.append(getJavaScriptString());
		writer.flush();
		writer.close();
		jsFile.close();
	}
	
	private String getJavaScriptString() {
		if(jsString == null) {
			StringBuilder builder = new StringBuilder();
			printLine(builder, "function chartPropertyEvolution(info) {");
			printLine(builder, "   var goalAvailable = !(info.goal in window);");
			printLine(builder, "");
			printLine(builder, "   var width = info.chart.width - info.margin.left - info.margin.right;");
			printLine(builder, "   var height = info.chart.height - info.margin.top - info.margin.bottom;");
			printLine(builder, "");
			printLine(builder, "   var svg = d3.select(\"body\").append(\"svg\")");
			printLine(builder, "      .attr(\"width\", width + info.margin.left + info.margin.right)");
			printLine(builder, "      .attr(\"height\", height + info.margin.top + info.margin.bottom)");
			printLine(builder, "      .append(\"g\")");
			printLine(builder, "      .attr(\"transform\", \"translate(\" + info.margin.left + \",\" + info.margin.top + \")\");");
			printLine(builder, "");
			printLine(builder, "   var tooltip = d3.select(\"body\").append(\"div\")");
			printLine(builder, "      .attr(\"class\", \"tooltip\")");
			printLine(builder, "      .style(\"opacity\", 0);");
			printLine(builder, "");
			printLine(builder, "   d3.csv(info.csv, function(error, csvLines) {");
			printLine(builder, "      var colorArray = [\"#1f77b4\", // blue");
			printLine(builder, "                   \"#ff7f0e\", // orange");
			printLine(builder, "                   \"#2ca02c\", // green");
			printLine(builder, "                   \"#9467bd\", // purple");
			printLine(builder, "                   \"#8c564b\", // brown");
			printLine(builder, "                   \"#e377c2\", // pink");
			printLine(builder, "                   \"#bcbd22\", // turquoise");
			printLine(builder, "                   \"#7f7f7f\", // gray");
			printLine(builder, "                   \"#aec7e8\", // light blue");
			printLine(builder, "                   \"#ffbb78\", // light orange");
			printLine(builder, "                   \"#98df8a\"  // light green");
			printLine(builder, "                 ];");
			printLine(builder, "      colorArray.splice(d3.keys(csvLines[0]).length - 2, 0, \"#d62728\"); // red for goal");
			printLine(builder, "");
			printLine(builder, "      var color = d3.scale.ordinal();");
			printLine(builder, "      color.range(colorArray);");
			printLine(builder, "      color.domain(");
			printLine(builder, "         d3.keys(csvLines[0]) // line 0 contains column names");
			printLine(builder, "            // sort alphabetically, goal always last");
			printLine(builder, "            .sort(function(a, b) {");
			printLine(builder, "               if(goalAvailable && a === info.goal.column) return 1;");
			printLine(builder, "               else return a.localeCompare(b);");
			printLine(builder, "            })");
			printLine(builder, "            // don't use axis values as data");
			printLine(builder, "            .filter(function(columnName) {");
			printLine(builder, "               return columnName !== info.xAxis.column &&");
			printLine(builder, "                      (info.yAxis.column in window || columnName === info.yAxis.column);");
			printLine(builder, "         })");
			printLine(builder, "      )");
			printLine(builder, "");
			printLine(builder, "      csvLines.forEach(function(line) {");
			printLine(builder, "         line[info.xAxis.column] = (+line[info.xAxis.column]/1000);");
			printLine(builder, "      });");
			printLine(builder, "");
			printLine(builder, "      var allColumns = color.domain().map(function(name) {");
			printLine(builder, "         return {");
			printLine(builder, "            name: name,");
			printLine(builder, "            values: csvLines.map(function(line) {");
			printLine(builder, "               return {xValue: +line[info.xAxis.column], yValue: +line[name]};");
			printLine(builder, "            })");
			printLine(builder, "         };");
			printLine(builder, "      });");
			printLine(builder, "");
			printLine(builder, "      allColumns.getColumn = function(name) {");
			printLine(builder, "         return allColumns.filter(function(column) { return column.name === name })[0];");
			printLine(builder, "      }");
			printLine(builder, "");
			printLine(builder, "      if(goalAvailable)");
			printLine(builder, "         var goalValue = allColumns.getColumn(info.goal.column).values[0].yValue; // just pick first one");
			printLine(builder, "");
			printLine(builder, "      allColumns.forEach(function(column) {");
			printLine(builder, "         column.maxValue = d3.max(column.values, function(v) { return v.yValue; }).toFixed(4);");
			printLine(builder, "         column.minValue = d3.min(column.values, function(v) { return v.yValue; }).toFixed(4);");
			printLine(builder, "         column.avgValue = d3.mean(column.values, function(v) { return v.yValue; }).toFixed(4);");
			printLine(builder, "");
			printLine(builder, "         column.isGoal = !goalAvailable || column.name === info.goal.column;");
			printLine(builder, "         column.meetsGoal = !goalAvailable || column.avgValue <= goalValue;");
			printLine(builder, "         column.displayClass = column.isGoal ? \"goalIndependent\" : column.meetsGoal ? \"goalFulfilled\" : \"goalFailed\";");
			printLine(builder, "         column.markUp = column.isGoal ? \"\" : column.meetsGoal ? \"✓\" : \"✗\";");
			printLine(builder, "      });");
			printLine(builder, "");
			printLine(builder, "      // Axis");
			printLine(builder, "");
			printLine(builder, "      var x = d3.scale.linear().range([0, width]);");
			printLine(builder, "      var y = d3.scale.linear().range([height, 0]);");
			printLine(builder, "");
			printLine(builder, "      x.domain(d3.extent(csvLines, function(line) { return line[info.xAxis.column]; }));");
			printLine(builder, "      y.domain([");
			printLine(builder, "         d3.min(allColumns, function(column) { return column.minValue; }),");
			printLine(builder, "         d3.max(allColumns, function(column) { return column.maxValue; })");
			printLine(builder, "      ]);");
			printLine(builder, "");
			printLine(builder, "      var xAxis = d3.svg.axis()");
			printLine(builder, "         .scale(x)");
			printLine(builder, "         .orient(\"bottom\");");
			printLine(builder, "");
			printLine(builder, "      var yAxis = d3.svg.axis()");
			printLine(builder, "         .scale(y)");
			printLine(builder, "         .orient(\"left\");");
			printLine(builder, "");
			printLine(builder, "      svg.append(\"g\")");
			printLine(builder, "         .attr(\"class\", \"x axis\")");
			printLine(builder, "         .attr(\"transform\", \"translate(0,\" + height + \")\")");
			printLine(builder, "         .call(xAxis)");
			printLine(builder, "         .append(\"text\")");
			printLine(builder, "         .attr(\"x\", width + 5)");
			printLine(builder, "         .attr(\"y\", 16)");
			printLine(builder, "         .attr(\"dx\", \".71em\")");
			printLine(builder, "         .style(\"text-anchor\", \"start\")");
			printLine(builder, "         .text(info.xAxis.label);");
			printLine(builder, "");
			printLine(builder, "      svg.append(\"g\")");
			printLine(builder, "         .attr(\"class\", \"y axis\")");
			printLine(builder, "         .call(yAxis)");
			printLine(builder, "         .append(\"text\")");
			printLine(builder, "         .attr(\"transform\", \"rotate(-90)\")");
			printLine(builder, "         .attr(\"y\", -42)");
			printLine(builder, "         .attr(\"dy\", \".71em\")");
			printLine(builder, "         .style(\"text-anchor\", \"end\")");
			printLine(builder, "         .text(info.yAxis.label);");
			printLine(builder, "");
			printLine(builder, "      // Lines");
			printLine(builder, "");
			printLine(builder, "      var line = d3.svg.line()");
			printLine(builder, "         .x(function(value) { return x(value.xValue); })");
			printLine(builder, "         .y(function(value) { return y(value.yValue); });");
			printLine(builder, "");
			printLine(builder, "      var property = svg.selectAll(\".property\")");
			printLine(builder, "         .data(allColumns)");
			printLine(builder, "         .enter().append(\"g\")");
			printLine(builder, "         .attr(\"class\", \"property\");");
			printLine(builder, "");
			printLine(builder, "      var path = property.append(\"path\")");
			printLine(builder, "         .attr(\"class\", function(column) { return \"line \" + column.name  + (column.isGoal && goalAvailable ? \" goal\" : \"\"); })");
			printLine(builder, "         .attr(\"d\", function(column) { return line(column.values); })");
			printLine(builder, "         .style(\"stroke\", function(column) { return color(column.name); });");
			printLine(builder, "");
			printLine(builder, "      // Legends");
			printLine(builder, "");
			printLine(builder, "      var legend = svg.selectAll(\".legend\")");
			printLine(builder, "         .data(color.domain().slice())");
			printLine(builder, "         .enter().append(\"g\")");
			printLine(builder, "         .attr(\"class\", function(columnName) { return \"legend \" + columnName; })");
			printLine(builder, "         .attr(\"transform\", function(columnName, i) { return \"translate(0,\" + i * 20 + \")\"; });");
			printLine(builder, "");
			printLine(builder, "      legend.append(\"rect\")");
			printLine(builder, "         .style(\"fill\", color)");
			printLine(builder, "         .data(allColumns)");
			printLine(builder, "         .attr(\"x\", width + info.margin.top)");
			printLine(builder, "         .attr(\"y\", function(column) { return column.isGoal ? 1 : -9; })");
			printLine(builder, "         .attr(\"width\", 7)");
			printLine(builder, "         .attr(\"height\", 18);");
			printLine(builder, "");
			printLine(builder, "      legend.append(\"text\")");
			printLine(builder, "         .data(allColumns)");
			printLine(builder, "         .attr(\"x\", width + 22)");
			printLine(builder, "         .attr(\"y\", function(column) { return column.isGoal ? 10 : 0; })");
			printLine(builder, "         .attr(\"dy\", \".35em\")");
			printLine(builder, "         .text(function(column) { return column.markUp; })");
			printLine(builder, "         .attr(\"class\", function(column) { return column.displayClass; });");
			printLine(builder, "");
			printLine(builder, "      legend.append(\"text\")");
			printLine(builder, "         .data(allColumns)");
			printLine(builder, "         .attr(\"x\", function(column) { return column.isGoal ? (width + 22) : (width + 33); })");
			printLine(builder, "         .attr(\"y\", function(column) { return column.isGoal ? 10 : 0; })");
			printLine(builder, "         .attr(\"dy\", \".35em\")");
			printLine(builder, "         .text(function(column) { return goalAvailable && column.isGoal ? info.goal.label : column.name; });");
			printLine(builder, "");
			printLine(builder, "      // Animation");
			printLine(builder, "");
			printLine(builder, "      function mouseOver(column) {");
			printLine(builder, "         d3.selectAll(\".line\").filter(\".\" + column.name).interrupt().transition().style(\"stroke-width\", \"3px\").duration(400).ease(\"elastic\");");
			printLine(builder, "         d3.selectAll(\".legend\").filter(\".\" + column.name).interrupt().transition().style(\"font-weight\", \"bold\").duration(400).ease(\"elastic\");");
			printLine(builder, "         tooltip.attr(\"class\", \"tooltip \" + column.displayClass)");
			printLine(builder, "                .style(\"left\", (d3.event.pageX)+5 + \"px\").style(\"top\", (d3.event.pageY + 5) + \"px\")");
			printLine(builder, "                .html(\"Minimum: \" + column.minValue + \"<br/>\" + \"Maximum: \" + column.maxValue + \"<br/>\" + \"Average: \" + column.avgValue);");
			printLine(builder, "         tooltip.transition().duration(200).style(\"opacity\", .8);");
			printLine(builder, "      }");
			printLine(builder, "");
			printLine(builder, "      function mouseOut(column) {");
			printLine(builder, "         d3.selectAll(\".line\").filter(\".\" + column.name).transition().style(\"stroke-width\", \"1.5px\").delay(100).duration(1000).ease(\"elastic\");");
			printLine(builder, "         d3.selectAll(\".legend\").filter(\".\" + column.name).transition().style(\"font-weight\", \"normal\").delay(100).duration(1000).ease(\"elastic\");");
			printLine(builder, "         tooltip.transition().duration(500).style(\"opacity\", 0);");
			printLine(builder, "      }");
			printLine(builder, "");
			printLine(builder, "      path.on(\"mouseover\", function(column) { mouseOver(column); })");
			printLine(builder, "          .on(\"mouseout\", function(column) { mouseOut(column); });");
			printLine(builder, "");
			printLine(builder, "      legend.on(\"mouseover\", function(columnName) { mouseOver(allColumns.getColumn(columnName)); })");
			printLine(builder, "            .on(\"mouseout\", function(columnName) { mouseOut(allColumns.getColumn(columnName)); });");
			printLine(builder, "   });");
			printLine(builder, "}");
			jsString = builder.toString();
		}
		return jsString;
	}
}

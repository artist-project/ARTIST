/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.util;

/**
 * Data class for XY-plots. Can be used as validation results.
 * @author Christian Krause
 */
public class StateSpaceXYPlot {
	
	// Name of the X- and Y-axis.
	private String xName, yName;
	
	// X- and Y-coordinates of the plots.
	private double[][] xValues, yValues;
	
	// Minimum and maximum values.
	private double xMin = 0, yMin = 0, xMax = 0, yMax = 0;
	
	// Maximum number of segments.
	private int xMaxSegments = 0, yMaxSegments = 0;
	
	// The legend.
	private String[] legend;
	
	/**
	 * Default constructor.
	 * @param xName Name of the X-axis.
	 * @param yName Name of the Y-axis.
	 * @param xValues X-values.
	 * @param yValues Y-values.
	 */
	public StateSpaceXYPlot(String xName, String yName, double[][] xValues, double[][] yValues, String[] legend) {
		
		this.xName = xName;
		this.yName = yName;
		this.xValues = xValues;
		this.yValues = yValues;
		this.legend = legend;
		
		// Compute minimum and maximum values.
		for (int series=0; series<getSeriesCount(); series++) {
			for (int point=0; point<getSeriesLength(series); point++) {
				double x = xValues[series][point];
				double y = yValues[series][point];
				xMin = Math.min(xMin,x);
				yMin = Math.min(yMin,y);
				xMax = Math.max(xMax,x);
				yMax = Math.max(yMax,y);
				xMaxSegments = Math.max(xMaxSegments, xValues[series].length);
				yMaxSegments = Math.max(yMaxSegments, yValues[series].length);
			}
		}
		
	}
	
	public int getSeriesCount() {
		return Math.min(xValues.length, yValues.length);
	}
	
	public int getSeriesLength(int series) {
		return Math.min(xValues[series].length, yValues[series].length);
	}

	public double getX(int series, int point) {
		return xValues[series][point];
	}

	public double getY(int series, int point) {
		return yValues[series][point];
	}

	public int getXScaled(int series, int point, int span) {
		double value = xValues[series][point];
		return (int) ((double)span * value/xMax);
	}

	public int getYScaled(int series, int point, int span) {
		double value = yValues[series][point];
		return (int) ((double)span * value/yMax);
	}

	public double getXMin() {
		return xMin;
	}

	public double getYMin() {
		return yMin;
	}

	public double getXMax() {
		return xMax;
	}

	public double getYMax() {
		return yMax;
	}

	public int getXMaxSegments() {
		return xMaxSegments;
	}

	public int getYMaxSegments() {
		return yMaxSegments;
	}

	public String getXName() {
		return xName;
	}
	
	public String getYName() {
		return yName;
	}

	public String getLegend(int series) {
		if (legend!=null && series<legend.length) {
			return legend[series];			
		} else {
			return null;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String r = "";
		for (int i=0; i<yValues[0].length; i++) {
			for (int j=0; j<yValues.length; j++) {
				r = r + yValues[j][i];
				if (j<yValues.length-1) {
					r = r + " ";
				}
			}
			r = r + "\n";
		}
		return r;
	}

}

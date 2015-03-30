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

import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Settings considered during the evaluation of goal models. Currently the 
 * following settings are supported:
 * <ul>
 *   <li><b>Suffix:</b> Suffix appended during evaluation, e.g., 
 *   		MyGoalModel -> MyGoalModel_Evaluation. Default: '_Evaluation'.</li>
 *   <li><b>Precision:</b> The non-negative int precision setting for double 
 *   		values. Default: 16.
 *   <li><b>RoundingMode:</b> Rounding behavior for numerical operations. 
 *   		Default: {@link RoundingMode#HALF_EVEN}.
 * </ul>
 * The precision and rounding mode setting are combined into a 
 * {@link MathContext}.
 * 
 * @author Martin Fleck
 *
 */
public class EvaluationSettings {
	private static final String SUFFIX = "_Evaluation";
	private static final MathContext MATH_CONTEXT = MathContext.DECIMAL64;
	
	private String suffix;
	private MathContext mathContext;
	
	/**
	 * Settings considered during the evaluation of goal models.
	 * By default, the suffix '_Evaluation' is used, 16 digits are considered
	 * for numerical operations and values are rounded according to 
	 * {@link RoundingMode#HALF_EVEN}.
	 */
	public EvaluationSettings() {
		this(SUFFIX, MATH_CONTEXT);
	}
	
	/**
	 * Creates new settings with the provided information.
	 * 
	 * @param suffix suffix appended during evaluation, e.g., MyGoalModel -> 
	 * MyGoalModel_Evaluation
	 * @param precision the non-negative int precision setting for double 
	 * values
	 * @param roundingMode rounding behavior for numerical operations
	 */
	public EvaluationSettings(String suffix, int precision, RoundingMode roundingMode) {
		this(suffix, new MathContext(precision, roundingMode));
	}
	
	/**
	 * Creates new settings with the provided information.
	 * 
	 * @param suffix suffix appended during evaluation, e.g., MyGoalModel -> 
	 * MyGoalModel_Evaluation
	 * @param context context containing the precision value and the rounding 
	 * mode
	 */
	public EvaluationSettings(String suffix, MathContext context) {
		this.suffix = suffix;
		this.mathContext = context;
	}
	
	/**
	 * Creates new settings with the provided information.
	 * By default, the suffix '_Evaluation' is used.
	 * 
	 * @param context context containing the precision value and the rounding 
	 * mode
	 */
	public EvaluationSettings(MathContext context) {
		this(SUFFIX, context);
	}
	
	/**
	 * Creates new settings with the provided information.
	 * By default, the suffix '_Evaluation' is used.
	 * 
	 * @param precision the non-negative int precision setting for double 
	 * values
	 * @param roundingMode rounding behavior for numerical operations
	 */
	public EvaluationSettings(int precision, RoundingMode roundingMode) {
		this(SUFFIX, precision, roundingMode);
	}
	
	/**
	 * Returns the suffix contained in this settings.
	 * 
	 * @return suffix contained in this settings
	 */
	public String getSuffix() {
		return suffix;
	}
	
	/**
	 * Returns the non-negative int precision setting for double values used
	 * contained in this settings.
	 * 
	 * @return precision contained in this settings
	 */
	public int getPrecision() {
		return getMathContext().getPrecision();
	}
	
	/**
	 * Returns the math context containing the non-negative precision setting 
	 * and the rounding behavior for numerical operations for this settings.
	 * 
	 * @return math context with precision and rounding behavior
	 */
	public MathContext getMathContext() {
		return mathContext;
	}
	
	/**
	 * Returns the rounding behavior for numerical operations
	 * contained in this settings.
	 * 
	 * @return rounding behavior
	 */
	public RoundingMode getRoundingMode() {
		return getMathContext().getRoundingMode();
	}
}

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

public class EvaluationSettings {
	private String suffix = "_Evaluation";
	private MathContext mathContext = MathContext.DECIMAL64;
	
	public EvaluationSettings() { }
	public EvaluationSettings(String suffix, int precision, RoundingMode roundingMode) {
		this(suffix, new MathContext(precision, roundingMode));
	}
	
	public EvaluationSettings(String suffix, MathContext context) {
		this.suffix = suffix;
		this.mathContext = context;
	}
	
	public String getSuffix() {
		return suffix;
	}
	
	public int getPrecision() {
		return getMathContext().getPrecision();
	}
	
	public MathContext getMathContext() {
		return mathContext;
	}
	
	public RoundingMode getRoundingMode() {
		return getMathContext().getRoundingMode();
	}
}

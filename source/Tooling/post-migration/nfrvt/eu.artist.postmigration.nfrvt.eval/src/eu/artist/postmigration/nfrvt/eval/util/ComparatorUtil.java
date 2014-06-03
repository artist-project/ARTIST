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

import java.util.Comparator;

import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;

public class ComparatorUtil {

	private static ComparatorUtil INSTANCE = new ComparatorUtil();
	
	public class TransformationComparator implements Comparator<Transformation> {
		@Override
		public int compare(Transformation first, Transformation second) {
			return first.getName().compareTo(second.getName());
		}
	}
	
	public class AppliedPropertyEvaluationComparator implements Comparator<AppliedPropertyEvaluation> {
		@Override
		public int compare(AppliedPropertyEvaluation first, AppliedPropertyEvaluation second) {
			return first.getProperty().getName().compareTo(second.getProperty().getName());
		}
	}
	
	public static TransformationComparator createTransformationComparator() {
		return INSTANCE.new TransformationComparator();
	}
	
	public static AppliedPropertyEvaluationComparator createAppliedPropertyEvaluationComparator() {
		return INSTANCE.new AppliedPropertyEvaluationComparator();
	}
}

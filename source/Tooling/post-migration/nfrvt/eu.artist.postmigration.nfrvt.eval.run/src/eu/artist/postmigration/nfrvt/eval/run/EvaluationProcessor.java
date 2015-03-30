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
package eu.artist.postmigration.nfrvt.eval.run;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.EcoreUtil2;

import eu.artist.postmigration.nfrvt.eval.MigrationEvaluator;
import eu.artist.postmigration.nfrvt.eval.run.internal.process.InternalEvaluationProcess;
import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet.SaveResult;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceUtil;
import eu.artist.postmigration.nfrvt.lang.util.run.ConsoleLogger;

/**
 * The evaluation processor does the actual evaluation work and provides the 
 * necessary output to the console using a {@link ConsoleLogger}. The 
 * evaluation itself is delegated to a {@link MigrationEvaluator}.
 * <p/>
 * This class is used by the internal evaluation process.
 * 
 * @see InternalEvaluationProcess
 * @author Martin Fleck
 *
 */
public class EvaluationProcessor {
	private ConsoleLogger logger;
	
	public EvaluationProcessor() { }
	
	public EvaluationProcessor(ConsoleLogger logger) {
		setLogger(logger);
	}
	
	/**
	 * Returns the logger used for logging the evaluation process.
	 * 
	 * @return logger
	 */
	public ConsoleLogger getLogger() {
		return logger;
	}

	/**
	 * Sets  the logger used for logging the evaluation process.
	 * @param logger new logger to be used
	 */
	public void setLogger(ConsoleLogger logger) {
		this.logger = logger;
	}
	
	/**
	 * Write text on the logger capturing any {@link IOException}s.
	 * 
	 * @param text text to be written
	 */
	private void log(String text) {
		if(getLogger() == null)
			return;
		try {
			getLogger().write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Write a line on the logger capturing any {@link IOException}s.
	 * 
	 * @param text text to be written
	 */
	private void logLine(String text) {
		if(getLogger() == null)
			return;
		try {
			getLogger().writeLine(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write an error line on the logger capturing any {@link IOException}s.
	 * 
	 * @param text text to be written
	 */
	private void logErrorLine(String text) {
		if(getLogger() == null)
			return;
		try {
			getLogger().writeErrorLine(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Evaluates the model specified by the inputModelPath and produces an
	 * output to the given outputModelPath. For the evaluation, a 
	 * {@link MigrationEvaluator} is used.
	 * 
	 * @param inputModelPath path to the input model
	 * @param inputMeasurements models containing measurements (at least 1)
	 * @param outputModelPath path to the created output model
	 * @param roundingMode 
	 * @param precision 
	 */
	public void evaluate(String inputModelPath, List<String> inputMeasurements, String outputModelPath, int precision, RoundingMode roundingMode) {
		logLine("----------------------------------------");
		
		log("Read goal model from '" + inputModelPath + "'...");
		
		MigrationEvaluation evaluation = null;
		MigrationResourceSet set = new MigrationResourceSet();
		
		
		GoalModel goalModel = null;
		List<Transformation> transformations = null;
		if(FileExtensions.isGoalModel(inputModelPath)) {
			goalModel = set.loadGoalModel(inputModelPath);
			if(goalModel == null) {
				logErrorLine("Can not read '" + inputModelPath + "'.");
				return;
			}
			transformations = new ArrayList<>();
		} else if(FileExtensions.isMigrationEvaluation(inputModelPath)) {
			MigrationEvaluation inputEvaluation = set.loadMigrationEvaluation(inputModelPath);
			if(inputEvaluation == null) {
				logErrorLine("Can not read '" + inputModelPath + "'.");
				return;
			}
			goalModel = inputEvaluation.getEvaluation().getGoalModel();
			transformations = inputEvaluation.getTransformations();
		} else {
			logErrorLine("Can not handle '" + inputModelPath + "'.");
			return;
		}
		logLine("done.");

		logLine("Read measurements...");
		List<MeasurementModel> measurementModels = new ArrayList<>();
		for(String measurement : inputMeasurements) {
			log("  '" + measurement + "'...");
			MeasurementModel measurementModel = set.loadMeasurementModel(measurement);
			if(measurementModel == null)
				logErrorLine("not found.");
			else {
				measurementModels.add(measurementModel);
				logLine("done.");
			}
		}
		logLine("done.");

		logLine("----------------------------------------");
		logLine("Run evaluation of '" + goalModel.getName() + "'...");

		EcoreUtil2.resolveAll(set.getResourceSet());
		MigrationEvaluator evaluator = new MigrationEvaluator(new EvaluationSettings(precision, roundingMode));
			
		logLine("  Numbers are only precise up to " + evaluator.getSettings().getPrecision() + " decimal places.");
		logLine("  Softgoals without subgoals PASS if there is enough positive influence.");
		logLine("  Softgoals without subgoals FAIL if there is enough negative influence.");
		try {
			evaluation = evaluator.evaluateMigration(goalModel, measurementModels, transformations);
		}  catch(Exception e) {
			logErrorLine("Error:");
			logErrorLine("  " + e.getMessage());
			return;
		}
		logLine("done.");
			
		logLine("----------------------------------------");
		log("Write evaluation to '" + outputModelPath + "'...");
		try {
			SaveResult result = set.saveModel(evaluation, MigrationResourceUtil.getPlatformResourceURI(outputModelPath));
			if(result.hasException()) {
				logErrorLine("Error:");
				logErrorLine("  " + result.getExceptionMessage());
				logLine(set.getResourceSet().getResources().toString());
			}
		} catch(Exception e) {
			logErrorLine("Error:");
			logErrorLine("  " + e.getMessage());
			return;
		}
		logLine("done.");
	}
}

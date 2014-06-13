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

import eu.artist.postmigration.nfrvt.eval.MigrationEvaluator;
import eu.artist.postmigration.nfrvt.eval.run.logger.ConsoleLogger;
import eu.artist.postmigration.nfrvt.eval.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.eval.util.MigrationResourceUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;

public class EvaluationProcess {
	private ConsoleLogger logger;
	
	public EvaluationProcess() { }
	public EvaluationProcess(ConsoleLogger logger) {
		setLogger(logger);
	}
	
	public ConsoleLogger getLogger() {
		return logger;
	}

	public void setLogger(ConsoleLogger logger) {
		this.logger = logger;
	}
	
	private void log(String text) {
		if(getLogger() == null)
			return;
		try {
			getLogger().write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void logLine(String text) {
		if(getLogger() == null)
			return;
		try {
			getLogger().writeLine(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void logErrorLine(String text) {
		if(getLogger() == null)
			return;
		try {
			getLogger().writeErrorLine(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void evaluate(String inputModelPath, String outputModelPath) {
		logLine("----------------------------------------");
		
		log("Read goal model from '" + inputModelPath + "'...");
		
		MigrationEvaluation evaluation = null;
		MigrationResourceSet set = new MigrationResourceSet();
		
		if(MigrationResourceUtil.isGoalModel(inputModelPath)) {
			GoalModel goalModel = set.loadGoalModel(inputModelPath);
			if(goalModel == null) {
				logErrorLine("Can not handle '" + inputModelPath + "'.");
				return;
			}
			
			logLine("done.");
			
			logLine("----------------------------------------");
			logLine("Run evaluation of '" + goalModel.getName() + "'...");

			MigrationEvaluator evaluator = new MigrationEvaluator();
			
			logLine("  Numbers are only precise up to " + evaluator.getSettings().getPrecision() + " decimal places.");
			logLine("  Softgoals without subgoals PASS if there is enough positive influence.");
			logLine("  Softgoals without subgoals FAIL if there is enough negative influence.\n");
			
			evaluation = evaluator.evaluateMigration(goalModel);
			logLine("done.");
			
		} else if(MigrationResourceUtil.isEvaluation(inputModelPath)) {
			MigrationEvaluation inputEvaluation = set.loadMigrationEvaluation(inputModelPath);
			if(inputEvaluation == null) {
				logErrorLine("Can not handle '" + inputModelPath + "'.");
				return;
			}
			
			logLine("done.");
			
			logLine("----------------------------------------");
			logLine("Run evaluation of '" + inputEvaluation.getName() + "'...");

			MigrationEvaluator evaluator = new MigrationEvaluator();
			
			logLine("  Numbers are only precise up to " + evaluator.getSettings().getPrecision() + " decimal places.");
			logLine("  Softgoals without subgoals PASS if there is enough positive influence.");
			logLine("  Softgoals without subgoals FAIL if there is enough negative influence.\n");
			
			evaluation = evaluator.evaluateMigration(inputEvaluation);
			logLine("done.");
		} else {
			logErrorLine("Can not handle '" + inputModelPath + "'.");
		}	
		
		logLine("Write evaluation to '" + outputModelPath + "'...\n");
		set.saveModel(evaluation, MigrationResourceUtil.getPlatformResourceURI(outputModelPath));
		logLine("...done.\n");
	}
}

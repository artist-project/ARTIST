package eu.artist.postmigration.nfrvt.strategy.staticanalysis.run;

import java.io.IOException;

import org.eclipse.uml2.uml.Model;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet.SaveResult;
import eu.artist.postmigration.nfrvt.lang.util.builder.MeasurementModelBuilder;
import eu.artist.postmigration.nfrvt.lang.util.run.ConsoleLogger;
import eu.artist.postmigration.nfrvt.strategy.staticanalysis.StaticAnalysis;

public class StaticAnalysisProcessor {
private ConsoleLogger logger;
	
	public StaticAnalysisProcessor() { }
	
	public StaticAnalysisProcessor(ConsoleLogger logger) {
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
	 * @param outputModelPath path to the created output model
	 */
	public void measure(String inputModelPath, String outputModelPath) {
		logLine("----------------------------------------");
		
		log("Read UML model from '" + inputModelPath + "'...");
		MigrationResourceSet resourceSet = new MigrationResourceSet();
		
		if(FileExtensions.isUMLModel(inputModelPath)) {
			Model umlModel = resourceSet.loadUMLModel(inputModelPath);
			if(umlModel == null) {
				logErrorLine("Can not read '" + inputModelPath + "'.");
				return;
			}
			
			logLine("done.");
			
			logLine("----------------------------------------");
			log("Analyze '" + umlModel.getName() + "' and save results in '" + outputModelPath + "'...");

			StaticAnalysis strategy = new StaticAnalysis(resourceSet);
	
			MeasurementModelBuilder builder = strategy.measure(umlModel, new MeasurementModelBuilder(resourceSet, outputModelPath, false));
			
			SaveResult saveModel = builder.save();
			if(saveModel.getException() != null) {
				logErrorLine("Can not read or create '" + outputModelPath + "': " + saveModel.getExceptionMessage());
				return;
			}
			logLine("done.");
			
		} else {
			logErrorLine("Can not handle '" + inputModelPath + "'.");
		}
	}
}

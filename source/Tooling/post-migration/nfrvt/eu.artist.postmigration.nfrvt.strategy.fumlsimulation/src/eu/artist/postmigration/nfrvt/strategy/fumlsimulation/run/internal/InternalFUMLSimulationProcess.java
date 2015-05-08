/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 */
package eu.artist.postmigration.nfrvt.strategy.fumlsimulation.run.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulator;
import org.modelexecution.fuml.nfr.simulation.result.SimulationHandler;
import org.modelexecution.fuml.nfr.simulation.workload.Workload;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadExtractor;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet.SaveResult;
import eu.artist.postmigration.nfrvt.lang.util.run.ConsoleLogger;

public class InternalFUMLSimulationProcess extends Process {

	public static final int EXIT_VALUE = 0;
	
	private int simulationTime;
	private String analysisContext;
	private String resultPath;
	private ConsoleLogger logger = new ConsoleLogger();
	private String modelPath;
	
	public ConsoleLogger getLogger() {
		return logger;
	}
	
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

	public InternalFUMLSimulationProcess(String modelPath, String resultPath, String analysisContext, int simulationTime) {
		this.modelPath = modelPath;
		this.resultPath = resultPath;
		this.analysisContext = analysisContext;
		this.simulationTime = simulationTime;
	}

	public void run(ConsoleLogger consoleLogger) throws IOException {
		setLogger(consoleLogger);
		
		WorkloadExtractor extractor = new WorkloadExtractor(modelPath);
		
		Path resultFolder = new Path(resultPath);
		String wsRelativePath = resultFolder.toString().replace("platform:/resource", "");
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String absoluteResultPath = root.getLocation() + wsRelativePath;
		
		logLine("Start analyzing workload...");
		extractor.setAnalysisContext(analysisContext);
		Workload workload = extractor.extractWorkload();
		logLine("Service Center: " + workload.getServiceCenters().size());
		logLine("Scenarios: " + workload.getScenarios().size());
		logLine("done.");
		
		log("Start calculating properties...");
		WorkloadSimulator simulator = new WorkloadSimulator();
		WorkloadSimulation simulation = simulator.simulateWorkload(workload, simulationTime);			
		logLine("done.");
		
		SimulationHandler handler = new SimulationHandler(simulation);
				
		log("Save result data in csv files...");
		handler.writeCSVFiles(absoluteResultPath, true);
		logLine("done.");

		FUMLSimulationMeasurementWriter measurementWriter = new FUMLSimulationMeasurementWriter(simulation, 1000);
		IPath measurementPath = resultFolder.append(workload.getModelName() + "." + FileExtensions.getMeasurementModelExtension());
		log("Save result data in measurement umlPackage '" + measurementPath + "'...");
		SaveResult saveModel = measurementWriter.write(measurementPath.toString());
		if(saveModel.getException() != null) {
			logErrorLine("Can not read or create '" + workload.getModelName() + "." + FileExtensions.getMeasurementModelExtension() + "': " + saveModel.getExceptionMessage());
			return;
		}
		logLine("done.");
		
//		IPath umlOutputFile = resultFolder.append(workload.getModelName() + "." + FileExtensions.getUMLExtension());
//		log("Save result umlPackage as '" + umlOutputFile + "'...");
//		handler.annotateModel();
//		ModelWriter modelWriter = new ModelWriter(simulation);
//		modelWriter.writeModel(umlOutputFile.toString());
//		logLine("done.");
	}

	public boolean isInRunMode() {
		return true;
	}

	@Override
	public OutputStream getOutputStream() {
		return new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				// we don't need anything from outside using this stream
				// as communication is done directly using commands
			}
		};
	}

	@Override
	public InputStream getInputStream() {
		return new InputStream() {
			@Override
			public int read() throws IOException {
				// we don't communicate via input stream
				return 0;
			}
		};
	}

	@Override
	public InputStream getErrorStream() {
		return new InputStream() {
			@Override
			public int read() throws IOException {
				// we don't communicate via input stream
				return 0;
			}
		};
	}

	@Override
	public int waitFor() throws InterruptedException {
		return EXIT_VALUE;
	}

	@Override
	public int exitValue() {
		return EXIT_VALUE;
	}

	@Override
	public void destroy() {

	}

}

/*
 * Copyright (c) 2013, 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 */
package eu.artist.postmigration.nfrvt.eval.run.internal.process;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import eu.artist.postmigration.nfrvt.eval.run.EvaluationProcess;
import eu.artist.postmigration.nfrvt.eval.run.logger.ConsoleLogger;

public class InternalGMLProcess extends Process {

	public static final int EXIT_VALUE = 0;
	
	private String inputModelPath;
	private String goalModelEvaluationName;
	private String outputModelPath;
	

	public InternalGMLProcess(String inputModelPath, String outputModelPath, String goalModelEvaluationName) {
		this.inputModelPath = inputModelPath;
		this.outputModelPath = outputModelPath;
		this.goalModelEvaluationName = goalModelEvaluationName;	
	}

	public void run(ConsoleLogger consoleLogger) throws IOException {
		new EvaluationProcess(consoleLogger).evaluate(inputModelPath, outputModelPath);
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
	public void destroy() {	}

}

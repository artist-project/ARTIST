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
package eu.artist.postmigration.nfrvt.eval.run.internal.process;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import eu.artist.postmigration.nfrvt.eval.run.EvaluationProcessor;
import eu.artist.postmigration.nfrvt.eval.run.launch.EvaluationLaunchDelegate;
import eu.artist.postmigration.nfrvt.eval.run.logger.ConsoleLogger;

/**
 * Class to be used by the launch delegate and delegates internal work to
 * {@link EvaluationProcessor}.
 * 
 * @author Philip Langer
 * @author Tanja Mayerhofer
 * @author Martin Fleck
 * @see EvaluationLaunchDelegate 
 */
public class InternalEvaluationProcess extends Process {

	public static final int EXIT_VALUE = 0;
	
	private String inputModelPath;
	private String outputModelPath;
	
	/**
	 * Creates a new process with the specified input model and output model. 
	 * The evaluation name is currently ignored.
	 * @param inputModelPath
	 * @param outputModelPath
	 * @param goalModelEvaluationName
	 */
	public InternalEvaluationProcess(String inputModelPath, String outputModelPath, String goalModelEvaluationName) {
		this.inputModelPath = inputModelPath;
		this.outputModelPath = outputModelPath;
	}

	/**
	 * Evaluates the input model and produces an output model. The actual work
	 * is delegated to an {@link EvaluationProcessor}.
	 * @param consoleLogger where logging information should be processed
	 * @throws IOException
	 */
	public void run(ConsoleLogger consoleLogger) throws IOException {
		new EvaluationProcessor(consoleLogger).evaluate(inputModelPath, outputModelPath);
	}

	/**
	 * Always returns true.
	 * @return true
	 */
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

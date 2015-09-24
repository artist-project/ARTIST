package eu.artist.postmigration.nfrvt.strategy.staticanalysis.run.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import eu.artist.postmigration.nfrvt.lang.util.run.ConsoleLogger;
import eu.artist.postmigration.nfrvt.strategy.staticanalysis.run.StaticAnalysisProcessor;

public class InternalStaticAnalysisProcess extends Process {

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
	public InternalStaticAnalysisProcess(String inputModelPath, String outputModelPath) {
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
		new StaticAnalysisProcessor(consoleLogger).measure(inputModelPath, outputModelPath);
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

package eu.artist.postmigration.nfrvt.search.run.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.util.run.ConsoleLogger;
import eu.artist.postmigration.nfrvt.search.run.MigrationExplorerProcessor;

public class InternalMigrationExplorerProcess extends Process {

	public static final int EXIT_VALUE = 0;
	
	private String goalModelPath;
	private String umlModelPath;
	private String outputModelPath;

	private AnalysisSettings analysisSettings;
	private EvaluationSettings evaluationSettings;
	private PatternSettings patternSettings;
	
	/**
	 * Creates a new process with the specified input model and output model. 
	 * The evaluation name is currently ignored.
	 * @param goalModelPath
	 * @param outputModelPath
	 * @param goalModelEvaluationName
	 */
	public InternalMigrationExplorerProcess(String goalModelPath, String umlModelPath, String outputModelPath, AnalysisSettings analysisSettings, EvaluationSettings evaluationSettings, PatternSettings patternSettings) {
		this.goalModelPath = goalModelPath;
		this.umlModelPath = umlModelPath;
		this.outputModelPath = outputModelPath;
		this.analysisSettings = analysisSettings;
		this.evaluationSettings = evaluationSettings;
		this.patternSettings = patternSettings;
	}

	/**
	 * Evaluates the input model and produces an output model. The actual work
	 * is delegated to an {@link EvaluationProcessor}.
	 * @param consoleLogger where logging information should be processed
	 * @throws IOException
	 */
	public void run(ConsoleLogger consoleLogger) throws IOException {
		new MigrationExplorerProcessor(consoleLogger).measure(
				goalModelPath, umlModelPath, outputModelPath, 
				analysisSettings, evaluationSettings, patternSettings);
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

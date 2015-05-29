package eu.artist.postmigration.nfrvt.strategy.staticanalysis.run;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import eu.artist.postmigration.nfrvt.strategy.staticanalysis.StaticAnalysisActivator;
import eu.artist.postmigration.nfrvt.strategy.staticanalysis.run.internal.InternalStaticAnalysisProcess;

public class StaticAnalysisLaunchDelegate extends LaunchConfigurationDelegate {
	private static final String EXEC_LABEL = "Static Analysis Process";

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		String modelPath = getInputModelPath(configuration);
		String resultPath = getOutputModelPath(configuration);
		InternalStaticAnalysisProcess process = new InternalStaticAnalysisProcess(modelPath, resultPath);

		DebugPlugin.newProcess(launch, process, EXEC_LABEL);
	}

	private String getInputModelPath(ILaunchConfiguration configuration)
			throws CoreException {
		@SuppressWarnings("unchecked")
		List<String> inputPath = configuration.getAttribute(StaticAnalysisActivator.ATT_INPUT_MODEL_PATH, (List<String>) null);
		if(inputPath != null)
			return inputPath.get(0);
		return null;
	}

	private String getOutputModelPath(ILaunchConfiguration configuration)
			throws CoreException {
		@SuppressWarnings("unchecked")
		List<String> outputPath = configuration.getAttribute(StaticAnalysisActivator.ATT_OUTPUT_MODEL_PATH, (List<String>) null);
		if(outputPath != null)
			return outputPath.get(0);
		return null;
	}
	
	@Override
	public boolean buildForLaunch(ILaunchConfiguration configuration,
			String mode, IProgressMonitor monitor) throws CoreException {
		return false;
	}
}

package eu.artist.postmigration.nfrvt.search.run;

import java.math.RoundingMode;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import eu.artist.postmigration.nfrvt.search.MigrationExplorerActivator;
import eu.artist.postmigration.nfrvt.search.run.internal.InternalMigrationExplorerProcess;


public class MigrationExplorerLaunchDelegate extends LaunchConfigurationDelegate {
	private static final String EXEC_LABEL = "Migration Explorer Process";

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		String goalModelPath = getGoalModelPath(configuration);
		String umlModelPath = getUMLModelPath(configuration);
		String evaluationModelPath = getOutputModelPath(configuration);
		
		String resultPath = getResultPath(configuration);
		int simulationTime = getSimulationTime(configuration);
		
		Integer precision = getSettingsPrecision(configuration);
		RoundingMode roundingMode = getSettingsRoundingMode(configuration);
		
		InternalMigrationExplorerProcess process = new InternalMigrationExplorerProcess(goalModelPath, umlModelPath, evaluationModelPath, resultPath, simulationTime, precision, roundingMode);

		DebugPlugin.newProcess(launch, process, EXEC_LABEL);
	}

	private String getGoalModelPath(ILaunchConfiguration configuration)
			throws CoreException {
		@SuppressWarnings("unchecked")
		List<String> inputPath = configuration.getAttribute(MigrationExplorerActivator.ATT_INPUT_GOAL_MODEL_PATH, (List<String>) null);
		if(inputPath != null)
			return inputPath.get(0);
		return null;
	}
	
	private String getUMLModelPath(ILaunchConfiguration configuration)
			throws CoreException {
		@SuppressWarnings("unchecked")
		List<String> inputPath = configuration.getAttribute(MigrationExplorerActivator.ATT_INPUT_UML_MODEL_PATH, (List<String>) null);
		if(inputPath != null)
			return inputPath.get(0);
		return null;
	}

	private String getOutputModelPath(ILaunchConfiguration configuration)
			throws CoreException {
		@SuppressWarnings("unchecked")
		List<String> outputPath = configuration.getAttribute(MigrationExplorerActivator.ATT_OUTPUT_MODEL_PATH, (List<String>) null);
		if(outputPath != null)
			return outputPath.get(0);
		return null;
	}
	
	private Integer getSettingsPrecision(ILaunchConfiguration configuration)
			throws CoreException {
		return configuration.getAttribute(
				MigrationExplorerActivator.ATT_SETTINGS_PRECISION,
				2);
	}
	
	private RoundingMode getSettingsRoundingMode(ILaunchConfiguration configuration)
			throws CoreException {
		return RoundingMode.valueOf(configuration.getAttribute(
				MigrationExplorerActivator.ATT_SETTINGS_ROUNDING, 
				RoundingMode.HALF_UP.name()));
	}
	
	private String getResultPath(ILaunchConfiguration configuration)
			throws CoreException {
		return configuration.getAttribute(MigrationExplorerActivator.ATT_QN_RESULT_PATH,
				(String) null);
	}

	private int getSimulationTime(ILaunchConfiguration configuration)
			throws CoreException {
		int simulationTime = 0;
		String simulationTimeString = configuration.getAttribute(
				MigrationExplorerActivator.ATT_QN_SIMULATION_TIME, "");
		try {
			simulationTime = Integer.parseInt(simulationTimeString);
		} catch (NumberFormatException e) {			
		}
		return simulationTime;
	}
	
	@Override
	public boolean buildForLaunch(ILaunchConfiguration configuration,
			String mode, IProgressMonitor monitor) throws CoreException {
		return false;
	}
}

package eu.artist.postmigration.nfrvt.search.run;

import java.math.RoundingMode;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.search.MigrationExplorerActivator;
import eu.artist.postmigration.nfrvt.search.run.internal.AnalysisSettings;
import eu.artist.postmigration.nfrvt.search.run.internal.InternalMigrationExplorerProcess;
import eu.artist.postmigration.nfrvt.search.run.internal.PatternSettings;
import eu.artist.postmigration.opgml.input.PatternImpactEstimates;


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
		
		int fixedScalingMinimum = getFixedScalingMinimum(configuration);
		int fixedScalingMaximum = getFixedScalingMaximum(configuration);
		
		int autoScalingMinimumMinimum = getAutoScalingMinimumMinimum(configuration);
		int autoScalingMinimumMaximum = getAutoScalingMinimumMaximum(configuration);
		int autoScalingMaximumMinimum = getAutoScalingMaximumMinimum(configuration);
		int autoScalingMaximumMaximum = getAutoScalingMaximumMaximum(configuration);
		
		double speedUpCache = getSpeedUpCache(configuration);
		double speedUpInstance = getSpeedUpInstance(configuration);
		
		double pricingCache = getPricingCache(configuration);
		double pricingInstance = getPricingInstance(configuration);
		
		InternalMigrationExplorerProcess process = new InternalMigrationExplorerProcess(
				goalModelPath, umlModelPath, evaluationModelPath, 
				new AnalysisSettings(simulationTime, resultPath),
				new EvaluationSettings(precision, roundingMode),
				new PatternSettings(
						fixedScalingMinimum, fixedScalingMaximum,
						autoScalingMinimumMinimum, autoScalingMinimumMaximum,
						autoScalingMaximumMinimum, autoScalingMaximumMaximum,
						new PatternImpactEstimates()
							.setDefaultCacheSpeedUp(speedUpCache)
							.setDefaultInstanceSpeedUp(speedUpInstance)
							.setPriceOfChachePerTimeUnit(pricingCache)
							.setPriceOfInstancePerTimeUnit(pricingInstance)
						));

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
		return getInteger(configuration, MigrationExplorerActivator.ATT_QN_SIMULATION_TIME);
	}
	
	private int getFixedScalingMinimum(ILaunchConfiguration configuration) {
		return getInteger(configuration, MigrationExplorerActivator.ATT_PATTERN_FIXED_MIN);
	}
	
	private int getFixedScalingMaximum(ILaunchConfiguration configuration) {
		return getInteger(configuration, MigrationExplorerActivator.ATT_PATTERN_FIXED_MAX);
	}
	
	private int getAutoScalingMinimumMinimum(ILaunchConfiguration configuration) {
		return getInteger(configuration, MigrationExplorerActivator.ATT_PATTERN_AUTO_MIN_MIN);
	}
	
	private int getAutoScalingMinimumMaximum(ILaunchConfiguration configuration) {
		return getInteger(configuration, MigrationExplorerActivator.ATT_PATTERN_AUTO_MIN_MAX);
	}
	
	private int getAutoScalingMaximumMinimum(ILaunchConfiguration configuration) {
		return getInteger(configuration, MigrationExplorerActivator.ATT_PATTERN_AUTO_MAX_MIN);
	}
	
	private int getAutoScalingMaximumMaximum(ILaunchConfiguration configuration) {
		return getInteger(configuration, MigrationExplorerActivator.ATT_PATTERN_AUTO_MAX_MAX);
	}
	
	private double getSpeedUpCache(ILaunchConfiguration configuration) {
		return getDouble(configuration, MigrationExplorerActivator.ATT_PATTERN_SPEEDUP_CACHE);
	}
	
	private double getSpeedUpInstance(ILaunchConfiguration configuration) {
		return getDouble(configuration, MigrationExplorerActivator.ATT_PATTERN_SPEEDUP_INSTANCE);
	}
	
	private double getPricingCache(ILaunchConfiguration configuration) {
		return getDouble(configuration, MigrationExplorerActivator.ATT_PATTERN_PRICE_CACHE);
	}
	
	private double getPricingInstance(ILaunchConfiguration configuration) {
		return getDouble(configuration, MigrationExplorerActivator.ATT_PATTERN_PRICE_INSTANCE);
	}
	
	private int getInteger(ILaunchConfiguration configuration, String attribute) {
		int value = 0;
		try {
			String valueString = configuration.getAttribute(attribute, "");
			value = Integer.parseInt(valueString);
		} catch (NumberFormatException | CoreException e) {			
		}
		return value;
	}
	
	private double getDouble(ILaunchConfiguration configuration, String attribute) {
		double value = 0.0;
		try {
			String valueString = configuration.getAttribute(attribute, "");
			value = Double.parseDouble(valueString);
		} catch (NumberFormatException | CoreException e) {			
		}
		return value;
	}
	
	@Override
	public boolean buildForLaunch(ILaunchConfiguration configuration,
			String mode, IProgressMonitor monitor) throws CoreException {
		return false;
	}
}

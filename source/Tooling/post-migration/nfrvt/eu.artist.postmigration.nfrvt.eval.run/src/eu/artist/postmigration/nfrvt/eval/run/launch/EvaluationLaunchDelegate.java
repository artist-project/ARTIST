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
package eu.artist.postmigration.nfrvt.eval.run.launch;

import java.math.RoundingMode;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import eu.artist.postmigration.nfrvt.eval.run.MigrationEvaluationActivator;
import eu.artist.postmigration.nfrvt.eval.run.internal.process.InternalEvaluationProcess;

/**
 * The evaluation launch delegate collects all the necessary information
 * from the launch configuration and starts a new process with the 
 * {@link InternalEvaluationProcess}.
 * 
 * @author Philip Langer
 * @author Tanja Mayerhofer
 * @author Martin Fleck
 * @see InternalEvaluationProcess
 * @see ILaunchConfiguration
 */
public class EvaluationLaunchDelegate extends LaunchConfigurationDelegate {

	private static final String GML_EXEC_LABEL = "Goal Evaluation Process";

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		String inputModel = getInputModelPath(configuration);
		List<String> inputMeasurements = getGoalModelEvaluationName(configuration);
		String resultModel = getOutputModelPath(configuration);
		Integer precision = getSettingsPrecision(configuration);
		RoundingMode roundingMode = getSettingsRoundingMode(configuration);
		
		InternalEvaluationProcess process = new InternalEvaluationProcess(inputModel,
				inputMeasurements, resultModel, precision, roundingMode);

		DebugPlugin.newProcess(launch, process, GML_EXEC_LABEL);
	}

	private String getInputModelPath(ILaunchConfiguration configuration)
			throws CoreException {
		return (String)configuration.getAttribute(
				MigrationEvaluationActivator.ATT_INPUT_MODEL_PATH,
				(List<String>) null).get(0);
	}

	@SuppressWarnings("unchecked")
	private List<String> getGoalModelEvaluationName(ILaunchConfiguration configuration)
			throws CoreException {
		return (List<String>) configuration.getAttribute(
				MigrationEvaluationActivator.ATT_INPUT_MEASUREMENT_MODELS_PATHS,
				(List<String>)null);
	}

	private String getOutputModelPath(ILaunchConfiguration configuration)
			throws CoreException {
		return (String) configuration.getAttribute(
				MigrationEvaluationActivator.ATT_OUTPUT_MODEL_PATH,
				(List<String>) null).get(0);
	}
	
	private Integer getSettingsPrecision(ILaunchConfiguration configuration)
			throws CoreException {
		return configuration.getAttribute(
				MigrationEvaluationActivator.ATT_SETTINGS_PRECISION,
				2);
	}
	
	private RoundingMode getSettingsRoundingMode(ILaunchConfiguration configuration)
			throws CoreException {
		return RoundingMode.valueOf(configuration.getAttribute(
				MigrationEvaluationActivator.ATT_SETTINGS_ROUNDING, 
				RoundingMode.HALF_UP.name()));
	}

	@Override
	public boolean buildForLaunch(ILaunchConfiguration configuration,
			String mode, IProgressMonitor monitor) throws CoreException {
		return false;
	}

}
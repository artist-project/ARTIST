/**
 * Copyright (c) 2013, 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 */
package eu.artist.postmigration.nfrvt.eval.run.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import eu.artist.postmigration.nfrvt.eval.run.Activator;
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
		String modelPath = getInputModelPath(configuration);
		String resultPath = getOutputModelPath(configuration);
		String analysisContext = getGoalModelEvaluationName(configuration);

		InternalEvaluationProcess process = new InternalEvaluationProcess(modelPath,
				resultPath, analysisContext);

		DebugPlugin.newProcess(launch, process, GML_EXEC_LABEL);
	}

	private String getInputModelPath(ILaunchConfiguration configuration)
			throws CoreException {
		return configuration.getAttribute(Activator.ATT_INPUT_MODEL_PATH,
				(String) null);
	}

	private String getGoalModelEvaluationName(ILaunchConfiguration configuration)
			throws CoreException {
		return configuration.getAttribute(
				Activator.ATT_GOALMODELEVALUATION_NAME, (String) null);
	}

	private String getOutputModelPath(ILaunchConfiguration configuration)
			throws CoreException {
		return configuration.getAttribute(Activator.ATT_OUTPUT_MODEL_PATH,
				(String) null);
	}

	@Override
	public boolean buildForLaunch(ILaunchConfiguration configuration,
			String mode, IProgressMonitor monitor) throws CoreException {
		return false;
	}

}
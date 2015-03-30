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
package eu.artist.postmigration.nfrvt.eval.run.ui.launch;

import java.util.List;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import eu.artist.postmigration.nfrvt.eval.run.MigrationEvaluationActivator;
import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.util.run.ui.ModelSelectionTab;

/**
 * A tab group consisting of the {@link ModelSelectionTab}, the 
 * {@link EnvironmentTab}, and the {@link CommonTab}, used in the 
 * Migration Evaluation Launch Configuration.
 * 
 * @author Philip Langer
 * @author Tanja Mayerhofer
 * @author Martin Fleck
 *
 */
public class EvaluationLaunchConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		List<String> inputExtensions = FileExtensions.getGoalModelExtensions();
		inputExtensions.addAll(FileExtensions.getMigrationEvaluationExtensions());
		
		ModelSelectionTab tab =
				new ModelSelectionTab(
						MigrationEvaluationActivator.GML_PROCESS_FACTORY_ID,
						MigrationEvaluationActivator.getDefault().getBundle().getEntry("icons/ModelSelectionTab.png"));
		MigrationEvaluationActivator.ATT_INPUT_MODEL_PATH = tab.addInput("Goal or Evaluation Model", 
				inputExtensions, 
				FileExtensions.getGoalModelExtension(), 
				1, 1,
				false, 
				true,
				MigrationEvaluationActivator.ATT_INPUT_MODEL_PATH);
		MigrationEvaluationActivator.ATT_INPUT_MEASUREMENT_MODELS_PATHS = tab.addInput("Measurement Model", 
				FileExtensions.getMeasurementModelExtensions(), 
				FileExtensions.getMeasurementModelExtension(), 
				1, ModelSelectionTab.UNLIMITED,
				false, 
				false,
				MigrationEvaluationActivator.ATT_INPUT_MEASUREMENT_MODELS_PATHS);
		MigrationEvaluationActivator.ATT_OUTPUT_MODEL_PATH = tab.addOutput("Migration Evaluation", 
				FileExtensions.getMigrationEvaluationExtensions(), 
				FileExtensions.getMigrationEvaluationExtension(), 
				1, 1,
				true, 
				false,
				MigrationEvaluationActivator.ATT_OUTPUT_MODEL_PATH);
		
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				tab, new EvaluationSettingsTab(), new EnvironmentTab(), new CommonTab() };
		setTabs(tabs);
	}

}

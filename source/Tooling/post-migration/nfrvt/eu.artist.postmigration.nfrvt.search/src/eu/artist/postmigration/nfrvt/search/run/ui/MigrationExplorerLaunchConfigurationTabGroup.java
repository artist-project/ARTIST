package eu.artist.postmigration.nfrvt.search.run.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.util.run.ui.ModelSelectionTab;
import eu.artist.postmigration.nfrvt.search.MigrationExplorerActivator;

public class MigrationExplorerLaunchConfigurationTabGroup extends
AbstractLaunchConfigurationTabGroup {

@Override
public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
	ModelSelectionTab tab =
		new ModelSelectionTab(
				MigrationExplorerActivator.PROCESS_FACTORY_ID,
				MigrationExplorerActivator.getDefault().getBundle().getEntry("icons/ModelSelectionTab.png"));
	MigrationExplorerActivator.ATT_INPUT_GOAL_MODEL_PATH = tab.addInput("Goal Model", 
		FileExtensions.getGoalModelExtensions(), 
		FileExtensions.getGoalModelExtension(), 
		1, 1,
		false, 
		false,
		MigrationExplorerActivator.ATT_INPUT_GOAL_MODEL_PATH);
	
	MigrationExplorerActivator.ATT_INPUT_UML_MODEL_PATH = tab.addInput("Software Model", 
			FileExtensions.getUMLExtensions(), 
			FileExtensions.getUMLExtension(), 
			1, 1,
			false, 
			false,
			MigrationExplorerActivator.ATT_INPUT_UML_MODEL_PATH);
	
	MigrationExplorerActivator.ATT_OUTPUT_MODEL_PATH = tab.addOutput("Migration Evaluation", 
		FileExtensions.getMigrationEvaluationExtensions(), 
		FileExtensions.getMigrationEvaluationExtension(), 
		1, 1,
		true, 
		false,
		MigrationExplorerActivator.ATT_OUTPUT_MODEL_PATH);

	ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
		tab, new EvaluationSettingsTab(), new AnalysisSettingsTab(), new PatternSettingsTab(), new EnvironmentTab(), new CommonTab() };
	setTabs(tabs);
}

}

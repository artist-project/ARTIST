package eu.artist.postmigration.nfrvt.strategy.staticanalysis.run.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.util.run.ui.ModelSelectionTab;
import eu.artist.postmigration.nfrvt.strategy.staticanalysis.StaticAnalysisActivator;

public class StaticAnalysisLaunchConfigurationTabGroup extends
AbstractLaunchConfigurationTabGroup {

@Override
public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
	ModelSelectionTab tab =
		new ModelSelectionTab(
				StaticAnalysisActivator.PROCESS_FACTORY_ID,
				StaticAnalysisActivator.getDefault().getBundle().getEntry("icons/ModelSelectionTab.png"));
	StaticAnalysisActivator.ATT_INPUT_MODEL_PATH = tab.addInput("UML Model", 
		FileExtensions.getUMLExtensions(), 
		FileExtensions.getUMLExtension(), 
		1, 1,
		false, 
		true,
		StaticAnalysisActivator.ATT_INPUT_MODEL_PATH);
	
	StaticAnalysisActivator.ATT_OUTPUT_MODEL_PATH = tab.addOutput("Measurement Model", 
		FileExtensions.getMeasurementModelExtensions(), 
		FileExtensions.getMeasurementModelExtension(), 
		1, 1,
		true, 
		false,
		StaticAnalysisActivator.ATT_OUTPUT_MODEL_PATH);

	ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
		tab, new EnvironmentTab(), new CommonTab() };
	setTabs(tabs);
}

}

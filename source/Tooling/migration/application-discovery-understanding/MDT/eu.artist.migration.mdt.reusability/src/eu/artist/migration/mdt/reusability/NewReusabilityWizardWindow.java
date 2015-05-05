package eu.artist.migration.mdt.reusability;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class NewReusabilityWizardWindow {

	
	protected Shell shell;
	Button btnPresentationLayer;
	Button btnBusinessLayer;
	private Group grpScope;
	private Group grpConfigurationFile;
	private Text textConfigFilePath;
	private String strConfigurationFilePath="";

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			NewReusabilityWizardWindow window = new NewReusabilityWizardWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();		
		shell.open();		
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setLocation(400,100);
		shell.setSize(369, 300);
		shell.setText("Reusability Wizard");
		
		Button btnNext = new Button(shell, SWT.NONE);
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				ContextData.setBusinessReused(btnBusinessLayer.getSelection());
				ContextData.setPresentationReused(btnPresentationLayer.getSelection());
				if ((strConfigurationFilePath=="") || (strConfigurationFilePath.contains(".xml")==false)) {
					MessageDialog.openWarning(shell, "Warning", "You have to select a valid configuration xml file");
					textConfigFilePath.setFocus();
					return;
				}								
				if (btnPresentationLayer.getSelection()==true){
					shell.close();
					Log.writeLog("presentation layer is selected");
					PresentationLayerReusabilityConditionsWindow window = new PresentationLayerReusabilityConditionsWindow();
					window.open();
				}
				else{
					if (btnBusinessLayer.getSelection()==true){
						shell.close();						
						Configuration.setConfigurationFromConfigFile(strConfigurationFilePath);
						BusinessLayerReusabilityConditionsWindow window = new BusinessLayerReusabilityConditionsWindow();
						window.open();
					}
					else{
						MessageDialog.openWarning(shell, "Warning", "You have to select an option.");
					}
				}
			}
		});
		btnNext.setBounds(229, 212, 68, 23);
		btnNext.setText("Next");
		
		grpScope = new Group(shell, SWT.NONE);
		grpScope.setText("Scope:");
		grpScope.setBounds(26, 22, 258, 80);
		
		btnPresentationLayer = new Button(grpScope, SWT.CHECK);
		btnPresentationLayer.setBounds(10, 21, 202, 16);
		btnPresentationLayer.setText("Presentation Layer");
		
		btnBusinessLayer = new Button(grpScope, SWT.CHECK);		
		btnBusinessLayer.setBounds(10, 54, 202, 16);
		btnBusinessLayer.setText("Business Layer");
		
		grpConfigurationFile = new Group(shell, SWT.NONE);
		grpConfigurationFile.setText("Configuration File:");
		grpConfigurationFile.setBounds(26, 108, 258, 80);
		
		textConfigFilePath = new Text(grpConfigurationFile, SWT.BORDER);
		textConfigFilePath.setBounds(10, 32, 190, 19);
		
		Button btnPathSelection = new Button(grpConfigurationFile, SWT.NONE);
		btnPathSelection.setBounds(207, 32, 41, 23);
		btnPathSelection.setText("...");
		btnPathSelection.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.NULL);
				strConfigurationFilePath = dialog.open();								
				textConfigFilePath.setText(strConfigurationFilePath);
			}
		});

	}
}

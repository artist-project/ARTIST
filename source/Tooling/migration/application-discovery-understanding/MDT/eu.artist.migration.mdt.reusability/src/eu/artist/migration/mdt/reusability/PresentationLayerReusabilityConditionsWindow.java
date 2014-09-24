package eu.artist.migration.mdt.reusability;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.tecnalia.structures.Project;

public class PresentationLayerReusabilityConditionsWindow {

	protected Shell shell;
	private Text textPresentationComponentsPath;
	Label lblSelectPresentationLayers;
	Button btnPathSelection;
	String selectedPath ="";
	private Button btnYes;
	private Button btnNo;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PresentationLayerReusabilityConditionsWindow window = new PresentationLayerReusabilityConditionsWindow();
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
		textPresentationComponentsPath.setEnabled(false);
		btnPathSelection.setEnabled(false);
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
		shell.setSize(544, 300);
		shell.setText("PresentationLayer Reusability Conditions");
		
		Button btnNext = new Button(shell, SWT.NONE);
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (btnYes.getSelection() && (selectedPath=="")){
					MessageDialog.openWarning(shell, "Warning", "You have to select a path");
				}
				else{
					if ((!btnYes.getSelection()) && (!btnNo.getSelection())){
						MessageDialog.openWarning(shell, "Warning", "You have to make a selection");
						return;
					}
						
					if (btnYes.getSelection()){
						ContextData.setPresentationPath(selectedPath);
						Project reusableProject = GenerateReusableProject.getProject();
						reusableProject.setPresentationPath(selectedPath);
					}
					if (ContextData.isBusinessReused()){
						shell.close();
						BusinessLayerReusabilityConditionsWindow window = new BusinessLayerReusabilityConditionsWindow();
						window.open();
					}
					else{						
						if (!btnYes.getSelection()){
							MessageDialog.openInformation(shell, "Info", "The reusability process has finished.");
						}
						else{
							SelectionOfCodeToBeReusedWindow window = new SelectionOfCodeToBeReusedWindow();
							window.open();
						}
						shell.close();
						
					}
				}
			}
		});		
		btnNext.setBounds(222, 184, 68, 23);
		btnNext.setText("Next");
		
		lblSelectPresentationLayers = new Label(shell, SWT.NONE);		
		lblSelectPresentationLayers.setBounds(73, 100, 303, 13);
		lblSelectPresentationLayers.setText("Select Presentation Layer's components path");
		
		Label lblSameTechnologyOn = new Label(shell, SWT.NONE);
		lblSameTechnologyOn.setBounds(73, 10, 392, 13);
		lblSameTechnologyOn.setText("Same technology on source and destination for presentation layer?");
		
		textPresentationComponentsPath = new Text(shell, SWT.BORDER);
		textPresentationComponentsPath.setBounds(73, 125, 216, 19);
		
		btnPathSelection = new Button(shell, SWT.NONE);
		btnPathSelection.setBounds(313, 123, 38, 23);
		btnPathSelection.setText("...");
		
		btnYes = new Button(shell, SWT.RADIO);		
		btnYes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				textPresentationComponentsPath.setEnabled(btnYes.getSelection());
				btnPathSelection.setEnabled(btnYes.getSelection());
				ContextData.setSameTechPresentation(btnYes.getSelection());
			}
		});
		btnYes.setBounds(74, 29, 83, 16);
		btnYes.setText("Yes");
		
		btnNo = new Button(shell, SWT.RADIO);
		btnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				textPresentationComponentsPath.setEnabled(false);
				btnPathSelection.setEnabled(false);
			}
		});		
		btnNo.setBounds(74, 61, 83, 16);
		btnNo.setText("No");
		btnPathSelection.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(shell, SWT.NULL);
				selectedPath  = dialog.open();
				textPresentationComponentsPath.setText(selectedPath);
			}
		});

	}
}

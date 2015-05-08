package eu.artist.postmigration.nfrvt.search.run.ui;

import java.math.RoundingMode;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import eu.artist.postmigration.nfrvt.search.MigrationExplorerActivator;

public class EvaluationSettingsTab extends AbstractLaunchConfigurationTab {

	private static int defaultPrecision = 2;
	private static RoundingMode defaultRoundingMode = RoundingMode.HALF_UP;

	protected String name = "Evaluation Settings";
	private Text precisionText;
	private Combo roundingModeCombo;
	private String[] roundingModesNames;
	
	public EvaluationSettingsTab() {
		initRoundingModeNames();
		setDirty(false);
	}
	
	public void initRoundingModeNames() {
		RoundingMode[] roundingModes = RoundingMode.values();
		roundingModesNames = new String[roundingModes.length];
		for(int i = 0; i < roundingModes.length; i++)
			roundingModesNames[i] = roundingModes[i].name();
	}
	
	public int getPrecision() {
		try {
			return Integer.parseInt(precisionText.getText());
		} catch(NumberFormatException e) {
			return defaultPrecision;
		}
	}
	
	public RoundingMode getRoundingMode() {
		try {
			int index = roundingModeCombo.getSelectionIndex();
			if(index > -1)
				return RoundingMode.valueOf(roundingModeCombo.getItems()[index]);
			return defaultRoundingMode;
		} catch(Exception e) {
			return defaultRoundingMode;
		}
	}
	
	private static void addSpanData(Control control, int span) {
        GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false);
        data.horizontalSpan = span;
        control.setLayoutData(data);
    }
	
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.verticalSpacing = 6;
		composite.setLayout(gridLayout);
		
		Group group = new Group(composite, SWT.NONE);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
		{	// block to avoid name collisions
			GridLayout layout = new GridLayout(2, false);
			layout.marginTop = 0;
			layout.marginLeft = 0;
			layout.marginRight = 0;
			layout.marginBottom = 0;
			layout.verticalSpacing = 7;
			layout.horizontalSpacing = 7;
			group.setLayout(layout);
		}
		group.setText("Arithmetic Settings");
		
		
		
		Label precisionLabel = new Label(group, SWT.LEFT);
		precisionLabel.setText("Decimal Precision:");
		
		precisionText = new Text(group, SWT.SINGLE | SWT.BORDER);
		precisionText.setTextLimit(3);
		precisionText.addVerifyListener(new VerifyListener() {
			@Override
			public void verifyText(VerifyEvent e) {
				boolean isNumber = true;
				String text = e.text;
				if(!text.isEmpty())
					try {
						isNumber = Integer.parseInt(text) >= 0;
					} catch(NumberFormatException ex) {
						isNumber = false;
					}
				e.doit = isNumber;
			}
		});
		precisionText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});
		addSpanData(precisionText, 1);
		
		Label roundingModeLabel = new Label(group, SWT.LEFT);
		roundingModeLabel.setText("Rounding Mode:");
		
		roundingModeCombo = new Combo(group, SWT.DROP_DOWN);
		roundingModeCombo.setItems(roundingModesNames);
		roundingModeCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});
		addSpanData(roundingModeCombo, 1);
		
		setControl(composite);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(MigrationExplorerActivator.ATT_SETTINGS_PRECISION, defaultPrecision);
		configuration.setAttribute(MigrationExplorerActivator.ATT_SETTINGS_ROUNDING, defaultRoundingMode.name());
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			int precision = configuration.getAttribute(MigrationExplorerActivator.ATT_SETTINGS_PRECISION, defaultPrecision);
			if(precisionText != null)
				precisionText.setText(Integer.toString(precision));
			String roundingModeName = configuration.getAttribute(MigrationExplorerActivator.ATT_SETTINGS_ROUNDING, defaultRoundingMode.name());
			int index = RoundingMode.valueOf(roundingModeName).ordinal();
			if(roundingModeCombo != null && index > -1 && index < roundingModeCombo.getItems().length)
				roundingModeCombo.select(index);
		} catch (CoreException e) {
			;
		}
		updateLaunchConfigurationDialog();
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DebugPlugin.ATTR_PROCESS_FACTORY_ID, MigrationExplorerActivator.PROCESS_FACTORY_ID);
		configuration.setAttribute(MigrationExplorerActivator.ATT_SETTINGS_PRECISION, getPrecision());
		configuration.setAttribute(MigrationExplorerActivator.ATT_SETTINGS_ROUNDING, getRoundingMode().name());
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public EvaluationSettingsTab setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public Image getImage() {
		URL imgUrl = MigrationExplorerActivator.getDefault().getBundle().getEntry("icons/EvaluationSettings.gif");
		if(imgUrl != null) {
			ImageDescriptor id = null;
			Image result = MigrationExplorerActivator.getDefault().getImageRegistry().get(imgUrl.toExternalForm());
			if (result == null) {
				id = ImageDescriptor.createFromURL(imgUrl);
				if (id != null) {
					result = id.createImage();
					MigrationExplorerActivator.getDefault().getImageRegistry().put(imgUrl.toExternalForm(), result);
				}
			}
			return result;
		}
		return null;
	}
}

/*******************************************************************************
 * Copyright (c) 2014 ATOS S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jesús Gorroñogoitia - main development
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/
package eu.artist.migration.ct.gui.rcp2gwt.dialog;

import java.util.EnumSet;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import eu.artist.migration.ct.gui.rcp2gwt.abstractors.Cloudifiers;

/**
 * This dialog prompts the user to select from the available GUI cloudifier
 * Depending on the selected cloudifiers, it might prompt the user to select other required input models
 * @author Jesús Gorroñogoitia
 *
 */
public class GUICloudifierDialog extends TitleAreaDialog {

	private ListViewer lvCloudifier;
	private Button btOpenPluginModel;
	private Text tPluginModel;
	private Button cbMergeLegacyModel;
	private Composite mergeLegacyModelComposite;
	private Composite legacyModelComposite;
	
	private IFile inputModel;
	private String legacyModel;
	private EnumSet<Cloudifiers> selectedCloudifiers = EnumSet
			.noneOf(Cloudifiers.class);
	private boolean legacyMergeEnabled = false;

	/**
	 * Default constructor
	 * @param parentShell Eclipse shell that display the dialog
	 */
	public GUICloudifierDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	/**
	 * This superclass method has been override to set the title, message and disable the OK button
	 * upon the dialog pops up.
	 */
	public void create() {
		super.create();
		setTitle("GUI Cloudification");
		setMessage("Cloudifiers for selected class model "
				+ inputModel.getName(), IMessageProvider.INFORMATION);
		//Disabling OK button by default
		enableOKButton(false);
	}

	private void enableOKButton(boolean enable) {
		getButton(IDialogConstants.OK_ID).setEnabled(enable);
	}

	@Override
	/**
	 * This method designs and renders the dialog visual controls.
	 */
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout(2, false);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(layout);

		createGUICloudifierSelector(container);
		createMergeModelCheckbox(container);
		createOpenOriginalModelButton(container);
		
		return area;
	}

	/**
	 * This method renders the widgets for check the option to merge with the legacy model.
	 * @param container Composite where placing these widgets
	 */
	private void createMergeModelCheckbox(Composite container) {
		mergeLegacyModelComposite = new Composite(container, SWT.NONE);
		mergeLegacyModelComposite.setLayout(new GridLayout(2, false));
		mergeLegacyModelComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		mergeLegacyModelComposite.setVisible(true);
		
		Label lbtFirstName = new Label(mergeLegacyModelComposite, SWT.NONE);
		lbtFirstName.setText("Merge it in legacy model?");

		cbMergeLegacyModel = new Button(mergeLegacyModelComposite, SWT.CHECK);
		cbMergeLegacyModel.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false, 1, 1));

		cbMergeLegacyModel.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				legacyModelComposite.setVisible(((Button)e.getSource()).getSelection()); 
				setLegacyMergeEnabled(true);
				validate();
			}
		});
	}
	
	/**
	 * This method renders the widgets for selecting optional plug-in models
	 * @param container Composite where placing these widgets
	 */
	private void createOpenOriginalModelButton(Composite container) {
		legacyModelComposite = new Composite(container, SWT.NONE);
		legacyModelComposite.setLayout(new GridLayout(2, false));
		legacyModelComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		legacyModelComposite.setVisible(false);

		
		Label lbtFirstName = new Label(legacyModelComposite, SWT.NONE);
		lbtFirstName.setText("Select Plugin model");

		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = false;
		gridData.horizontalAlignment = GridData.BEGINNING;

		btOpenPluginModel = new Button(legacyModelComposite, SWT.PUSH);
		btOpenPluginModel.setText("Browse");
		btOpenPluginModel.setLayoutData(gridData);

		btOpenPluginModel
				.addSelectionListener(new PluginSelectionAdapter(this) {
					@Override
					public void widgetSelected(SelectionEvent e) {
						FileDialog dialog = new FileDialog(this.rootDialog
								.getShell(), SWT.OPEN);
						dialog.setText("Select Legacy model");
						dialog.setFilterExtensions(new String[] { "*.uml" });
						this.rootDialog.setLegacyModel(dialog.open());
						System.out.println("legacy model: " + legacyModel);
						
						validate();
					}
				});

		tPluginModel = new Text(legacyModelComposite, SWT.BORDER);
		tPluginModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

	}


	/**
	 * This method renders the widgets for selecting available component model generators.
	 * @param container Composite where placing these widgets
	 */
	private void createGUICloudifierSelector(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Select abstractor types");

		lvCloudifier = new ListViewer(container);
		lvCloudifier.setContentProvider(ArrayContentProvider.getInstance());
		lvCloudifier.setLabelProvider (
			new LabelProvider() {
				  @Override
				  public String getText(Object element) {
				    if (element instanceof Cloudifiers) {
				    	Cloudifiers generator = (Cloudifiers) element;
				      return generator.getLabel();
				    }
				    return super.getText(element);
				  }
			}
		);

		Cloudifiers cmTypes[] = Cloudifiers.values();
		lvCloudifier.setInput(cmTypes);
		
		lvCloudifier.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				selectedCloudifiers.clear();
				Iterator abstractors = selection.iterator();
				while (abstractors.hasNext()){
					Cloudifiers abstractor = (Cloudifiers) abstractors.next();
					selectedCloudifiers.add (abstractor);
				}
				validate();
			}
		});
	}

	/**
	 * This method validates whether or not the dialog form has been completely fulfilled 
	 * and OK button can be enabled.
	 */
	protected void validate() {
		boolean enable = true;
		
		if (getSelectedGUICloudifiers().isEmpty()){
			enable = false;
		}
		
		if (isLegacyMergeEnabled() && !isValid(getLegacyModel())){
			enable = false;
		}
		
		enableOKButton(enable);
	}

	/**
	 * This method checks that the provided plug-in model is valid.
	 * TODO: Implement a more robust validation, checking that the model file really exists
	 * @param pluginModel Path to selected plug-in model.
	 * @return
	 */
	private boolean isValid(String model) {
		return model != null && !model.isEmpty();
	}

	@Override
	protected boolean isResizable() {
		return true;
	}
	
	/**
	 * This method enables this dialog caller to pass the input class model 
	 * for which a set of component models should be generated
	 * @param model Input class model selected by the user in the workspace
	 */
	public void setInputModel(IFile model) {
		this.inputModel = model;
	}
	
	/**
	 * It stores the plug-in model selected by the user
	 * @param pluginModel The plug-in model.
	 */
	protected void setLegacyModel(String legacyModel) {
		this.legacyModel = legacyModel;
		tPluginModel.setText(legacyModel);
	}

	/**
	 * It returns the plug-in model selected by the user
	 * @return The plug-in model.
	 */
	public String getLegacyModel() {
		return this.legacyModel;
	}

	/**
	 * It sets whether or not the user has selected to merge the cloudified GUI model into the legacy one
	 * @param User's selection
	 */
	public void setLegacyMergeEnabled(boolean enabled) {
		this.legacyMergeEnabled = enabled;
	}
	
	/**
	 * It returns whether or not the user has selected to merge the cloudified GUI model into the legacy one
	 * @return User's selection
	 */
	public boolean isLegacyMergeEnabled() {
		return this.legacyMergeEnabled;
	}
	
	/**
	 * It returns the collection of selected GUI cloudifiers
	 * @return Collection of selected cloudifiers
	 */
	public EnumSet<Cloudifiers> getSelectedGUICloudifiers() {
		return this.selectedCloudifiers;
	}

	/**
	 * Helper class to pass the root dialog to the SelectionAdapter to those listeners that require it.
	 * @author Jesús Gorroñogoitia
	 *
	 */
	class PluginSelectionAdapter extends SelectionAdapter {
		GUICloudifierDialog rootDialog;

		public PluginSelectionAdapter(GUICloudifierDialog rootDialog) {
			this.rootDialog = rootDialog;
		}
	}

	
}
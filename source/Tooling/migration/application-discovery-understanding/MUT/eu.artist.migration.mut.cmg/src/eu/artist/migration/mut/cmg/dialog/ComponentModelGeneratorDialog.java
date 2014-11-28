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
package eu.artist.migration.mut.cmg.dialog;

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

import eu.artist.migration.mut.cmg.generators.CMGenerators;

/**
 * This dialog prompts the user to select from the available component model generators
 * Depending on the selected generators, it might prompt the user to select other required input models
 * It also offers to merge generated component models if multiple generators have been selected.
 * @author Jesús Gorroñogoitia
 *
 */
public class ComponentModelGeneratorDialog extends TitleAreaDialog {

	private ListViewer lvCMSelector;
	private Button cbMergeModels;
	private Button btOpenPluginModel;
	private Text tPluginModel;
	private Composite mergeModelComposite;
	private Composite pluginModelComposite;
	
	private IFile inputModel;
	private String pluginModel;
	private boolean mergeModels;
	private boolean RCPCMGeneratorEnabled;
	private EnumSet<CMGenerators> selectedCMGenerators = EnumSet
			.noneOf(CMGenerators.class);


	/**
	 * Default constructor
	 * @param parentShell Eclipse shell that display the dialog
	 */
	public ComponentModelGeneratorDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	/**
	 * This superclass method has been override to set the title, message and disable the OK button
	 * upon the dialog pops up.
	 */
	public void create() {
		super.create();
		setTitle("Component Model Generator");
		setMessage("Component model generation for selected class model "
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

		createComponentModelSelector(container);
		createOpenPluginModelButton(container);
		createMergeModelCheckbox(container);
		
		return area;
	}

	/**
	 * This method renders the widgets for selecting optional plug-in models
	 * @param container Composite where placing these widgets
	 */
	private void createOpenPluginModelButton(Composite container) {
		pluginModelComposite = new Composite(container, SWT.NONE);
		pluginModelComposite.setLayout(new GridLayout(2, false));
		pluginModelComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		pluginModelComposite.setVisible(false);

		
		Label lbtFirstName = new Label(pluginModelComposite, SWT.NONE);
		lbtFirstName.setText("Select Plugin model");

		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = false;
		gridData.horizontalAlignment = GridData.BEGINNING;

		btOpenPluginModel = new Button(pluginModelComposite, SWT.PUSH);
		btOpenPluginModel.setText("Browse");
		btOpenPluginModel.setLayoutData(gridData);

		btOpenPluginModel
				.addSelectionListener(new PluginSelectionAdapter(this) {
					@Override
					public void widgetSelected(SelectionEvent e) {
						FileDialog dialog = new FileDialog(this.rootDialog
								.getShell(), SWT.OPEN);
						dialog.setText("Select Plugin model");
						dialog.setFilterExtensions(new String[] { "*_xml.xmi" });
						this.rootDialog.setPluginModel(dialog.open());
						System.out.println("plugin model: " + pluginModel);
						
						validate();
					}
				});

		tPluginModel = new Text(pluginModelComposite, SWT.BORDER);
		tPluginModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

	}

	/**
	 * This method renders the widgets for check the option to merge generated component models.
	 * @param container Composite where placing these widgets
	 */
	private void createMergeModelCheckbox(Composite container) {
		mergeModelComposite = new Composite(container, SWT.NONE);
		mergeModelComposite.setLayout(new GridLayout(2, false));
		mergeModelComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		mergeModelComposite.setVisible(false);
		
		Label lbtFirstName = new Label(mergeModelComposite, SWT.NONE);
		lbtFirstName.setText("Merge Models?");

		cbMergeModels = new Button(mergeModelComposite, SWT.CHECK);
		cbMergeModels.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false, 1, 1));

		cbMergeModels.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setMergeModel(cbMergeModels.getSelection());
			}
		});
	}

	/**
	 * This method renders the widgets for selecting available component model generators.
	 * @param container Composite where placing these widgets
	 */
	private void createComponentModelSelector(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Select component model types");

//		GridData gridData = new GridData();
//		gridData.grabExcessHorizontalSpace = true;
//		gridData.horizontalAlignment = GridData.FILL;

		lvCMSelector = new ListViewer(container);
		lvCMSelector.setContentProvider(ArrayContentProvider.getInstance());
		lvCMSelector.setLabelProvider (
			new LabelProvider() {
				  @Override
				  public String getText(Object element) {
				    if (element instanceof CMGenerators) {
				    	CMGenerators generator = (CMGenerators) element;
				      return generator.getLabel();
				    }
				    return super.getText(element);
				  }
			}
		);

		CMGenerators cmTypes[] = CMGenerators.values();//{ CMGenerators.Observer_pattern, CMGenerators.RCP };
		lvCMSelector.setInput(cmTypes);
		
		lvCMSelector.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				selectedCMGenerators.clear();
				Iterator selectors = selection.iterator();
				RCPCMGeneratorEnabled = false;
				while (selectors.hasNext()){
					CMGenerators selector = (CMGenerators) selectors.next();
					selectedCMGenerators.add (selector);
					if (selector.equals(CMGenerators.RCP)) RCPCMGeneratorEnabled = true;
				}
				
				if (selectedCMGenerators.size() >=2) mergeModelComposite.setVisible(true); else mergeModelComposite.setVisible(false);
				if (RCPCMGeneratorEnabled) pluginModelComposite.setVisible(true); else pluginModelComposite.setVisible(false);
				
				validate();
			}

//			private Collection<? extends CMGenerators> getGenerators(
//					int[] selectedItems) {
//				Collection<CMGenerators> result = new ArrayList<>();
//				for (int i = 0; i < selectedItems.length; i++) {
//					CMGenerators generator = CMGenerators.values()[selectedItems[i]];
//					result.add(generator);
//				}
//
//				return result;
//			}
//
//			private boolean contains(int[] selectedItems, int ordinal) {
//				boolean result = false;
//				for (int i = 0; i < selectedItems.length; i++) {
//					if (selectedItems[i] == ordinal) {
//						result = true;
//						break;
//					}
//				}
//				return result;
//			}
		});
	}

	/**
	 * This method validates whether or not the dialog form has been completely fulfilled 
	 * and OK button can be enabled.
	 */
	protected void validate() {
		boolean enable = true;
		
		if (getSelectedCMGenerators().isEmpty()){
			enable = false;
		}
		
		if (isRCPCMGeneratorEnabled() && !isValid(getPluginModel())){
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
	private boolean isValid(String pluginModel) {
		return pluginModel != null && !pluginModel.isEmpty();
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
	protected void setPluginModel(String pluginModel) {
		this.pluginModel = pluginModel;
		tPluginModel.setText(pluginModel);
	}

	/**
	 * It returns the plug-in model selected by the user
	 * @return The plug-in model.
	 */
	public String getPluginModel() {
		return this.pluginModel;
	}

	/**
	 * It stores the user's selection whether or not merging generated models. 
	 * @param merge Flag informing about merging decision.
	 */
	private void setMergeModel(boolean merge) {
		this.mergeModels = merge;
	}

	/**
	 * It returns the user's selection whether or not merging generated models. 
	 * @return Flag informing about merging decision.
	 */
	public boolean isMergeModel() {
		return this.mergeModels;
	}
	
	/**
	 * It returns whether or not the user has selected the Eclipse RCP component model generator
	 * @return User's selection
	 */
	public boolean isRCPCMGeneratorEnabled() {
		return this.RCPCMGeneratorEnabled;
	}
	
	/**
	 * It returns the collection of selected component model generators
	 * @return Collection of selected generators
	 */
	public EnumSet<CMGenerators> getSelectedCMGenerators() {
		return this.selectedCMGenerators;
	}

	/**
	 * Helper class to pass the root dialog to the SelectionAdapter to those listeners that require it.
	 * @author Jesús Gorroñogoitia
	 *
	 */
	class PluginSelectionAdapter extends SelectionAdapter {
		ComponentModelGeneratorDialog rootDialog;

		public PluginSelectionAdapter(ComponentModelGeneratorDialog rootDialog) {
			this.rootDialog = rootDialog;
		}
	}

	
}
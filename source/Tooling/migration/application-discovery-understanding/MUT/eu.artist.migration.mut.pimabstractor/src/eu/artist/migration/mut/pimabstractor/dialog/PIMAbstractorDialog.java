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
package eu.artist.migration.mut.pimabstractor.dialog;

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
import eu.artist.migration.mut.pimabstractor.abstractors.Abstractors;

/**
 * This dialog prompts the user to select from the available PIM abstractors
 * Depending on the selected abstractors, it might prompt the user to select other required input models
 * @author Jesús Gorroñogoitia
 *
 */
public class PIMAbstractorDialog extends TitleAreaDialog {

	private ListViewer lvAbstractor;
	private Button btOpenPluginModel;
	private Text tPluginModel;
	private Composite pluginModelComposite;
	
	private IFile inputModel;
	private String pluginModel;
	private boolean RCPAbstractorEnabled;
	private EnumSet<Abstractors> selectedAbstractors = EnumSet
			.noneOf(Abstractors.class);


	/**
	 * Default constructor
	 * @param parentShell Eclipse shell that display the dialog
	 */
	public PIMAbstractorDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	/**
	 * This superclass method has been override to set the title, message and disable the OK button
	 * upon the dialog pops up.
	 */
	public void create() {
		super.create();
		setTitle("Model Abstraction");
		setMessage("Abstraction for selected class model "
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

		createAbstractorSelector(container);
		createOpenPluginModelButton(container);
		
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
	 * This method renders the widgets for selecting available component model generators.
	 * @param container Composite where placing these widgets
	 */
	private void createAbstractorSelector(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Select abstractor types");

//		GridData gridData = new GridData();
//		gridData.grabExcessHorizontalSpace = true;
//		gridData.horizontalAlignment = GridData.FILL;

		lvAbstractor = new ListViewer(container);
		lvAbstractor.setContentProvider(ArrayContentProvider.getInstance());
		lvAbstractor.setLabelProvider (
			new LabelProvider() {
				  @Override
				  public String getText(Object element) {
				    if (element instanceof Abstractors) {
				    	Abstractors generator = (Abstractors) element;
				      return generator.getLabel();
				    }
				    return super.getText(element);
				  }
			}
		);

		Abstractors cmTypes[] = Abstractors.values();
		lvAbstractor.setInput(cmTypes);
		
		lvAbstractor.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				selectedAbstractors.clear();
				Iterator abstractors = selection.iterator();
				RCPAbstractorEnabled = false;
				while (abstractors.hasNext()){
					Abstractors abstractor = (Abstractors) abstractors.next();
					selectedAbstractors.add (abstractor);
					if (abstractor.equals(Abstractors.RCP) ||
						abstractor.equals (Abstractors.GUI)	) 
						RCPAbstractorEnabled = true;
				}
				
				if (RCPAbstractorEnabled) pluginModelComposite.setVisible(true); else pluginModelComposite.setVisible(false);
				
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
		
		if (getSelectedAbstractors().isEmpty()){
			enable = false;
		}
		
		if (isRCPAbstractorEnabled() && !isValid(getPluginModel())){
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
	 * It returns whether or not the user has selected the Eclipse RCP abstractor
	 * @return User's selection
	 */
	public boolean isRCPAbstractorEnabled() {
		return this.RCPAbstractorEnabled;
	}
	
	/**
	 * It returns the collection of selected abstractors
	 * @return Collection of selected abstractors
	 */
	public EnumSet<Abstractors> getSelectedAbstractors() {
		return this.selectedAbstractors;
	}

	/**
	 * Helper class to pass the root dialog to the SelectionAdapter to those listeners that require it.
	 * @author Jesús Gorroñogoitia
	 *
	 */
	class PluginSelectionAdapter extends SelectionAdapter {
		PIMAbstractorDialog rootDialog;

		public PluginSelectionAdapter(PIMAbstractorDialog rootDialog) {
			this.rootDialog = rootDialog;
		}
	}

	
}
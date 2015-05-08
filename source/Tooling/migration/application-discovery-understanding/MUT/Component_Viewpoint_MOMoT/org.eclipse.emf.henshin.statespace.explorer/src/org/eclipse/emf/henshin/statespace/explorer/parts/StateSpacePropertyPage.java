/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.parts;

import java.text.DecimalFormat;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceFactory;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.hashcodes.StateSpaceHashCodeUtil;
import org.eclipse.emf.henshin.statespace.resource.StateSpaceResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PropertyPage;

/**
 * Property page for state spaces.
 * @author Christian Krause
 */
public class StateSpacePropertyPage extends PropertyPage {
	
	// Labels:
	private Label statesLabel, transitionsLabel, 
				  rulesLabel, statesPerHashLabel;

	
	private void addSection(Composite parent) {
		
		Composite composite = createDefaultComposite(parent);
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("States:");
		statesLabel = new Label(composite, SWT.NONE);

		label = new Label(composite, SWT.NONE);
		label.setText("Transitions:");
		transitionsLabel = new Label(composite, SWT.NONE);

		label = new Label(composite, SWT.NONE);
		label.setText("Rules:");
		rulesLabel = new Label(composite, SWT.NONE);

		label = new Label(composite, SWT.NONE);
		label.setText("States per hash:");
		statesPerHashLabel = new Label(composite, SWT.NONE);

		StateSpaceManager manager = loadStateSpace();
		StateSpace stateSpace = manager.getStateSpace();
		
		statesLabel.setText(stateSpace.getStates().size() + " (" + stateSpace.getOpenStates().size() + " open)");
		transitionsLabel.setText(stateSpace.getTransitionCount()+"");
		rulesLabel.setText(stateSpace.getRules().size()+"");
		
		DecimalFormat decimal = new DecimalFormat("###,##0.000");
		statesPerHashLabel.setText(decimal.format(StateSpaceHashCodeUtil.getHashCodeCollisions(stateSpace)) + "");
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		addSection(composite);
		return composite;
		
	}

	private Composite createDefaultComposite(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
		
	}
	
	private StateSpaceManager loadStateSpace() {
		
		ResourceSet resourceSet = new ResourceSetImpl();
    	URI uri = URI.createPlatformResourceURI(((IResource) getElement()).getFullPath().toString(), false);
    	
    	StateSpaceResource resource = null;
    	StateSpaceManager manager = null;
    	
		try {			
			// Perform the loading:
			resource = (StateSpaceResource) resourceSet.getResource(uri, true);
			
			// Load the state space manager:
			manager = StateSpaceFactory.eINSTANCE.createStateSpaceManager(resource.getStateSpace(), 1);
			
		}
		catch (Throwable e) {
			StateSpaceExplorerPlugin.getInstance().logError("Error loading state space", e);
			MessageDialog.openError(getShell(), "Load State Space", "Error loading state space. See the error log for mor information.");
		}
		
		return manager;
		
	}
	
}
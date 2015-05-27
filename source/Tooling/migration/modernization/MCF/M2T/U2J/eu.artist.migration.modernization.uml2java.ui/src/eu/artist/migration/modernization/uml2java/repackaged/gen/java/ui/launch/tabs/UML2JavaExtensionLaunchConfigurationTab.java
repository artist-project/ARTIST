/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html

 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation

 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 ********************************************************************************/
package eu.artist.migration.modernization.uml2java.repackaged.gen.java.ui.launch.tabs;

import eu.artist.migration.modernization.uml2java.repackaged.gen.java.ui.UML2JavaUIActivator;
import eu.artist.migration.modernization.uml2java.repackaged.gen.java.ui.utils.UML2JavaMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.osgi.framework.Bundle;

public class UML2JavaExtensionLaunchConfigurationTab extends AbstractUML2JavaLaunchConfigurationTab {

	private List<IExtension> generatorExtensions;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		// collect generator extensions
		this.collectBundlesOfGeneratorExtensions();

		Font font = parent.getFont();
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		composite.setFont(font);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 1;
		composite.setLayoutData(gd);

		this.createExtensionsGroup(composite, font);

		this.setControl(composite);
		this.update();
	}

	private void collectBundlesOfGeneratorExtensions() {
		generatorExtensions = new ArrayList<IExtension>();

		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("org.eclipse.acceleo.engine.dynamic.templates");

		if (point != null) {
			IExtension[] extensions = point.getExtensions();

			for (IExtension extension : extensions) {
				// we are only interested in extensions, i.e., they are not generators!
				if (!isGenerator(extension.getConfigurationElements())) {
					Bundle bundle = Platform.getBundle(extension.getContributor().getName());
					// writeToConsole("State: " + bundle.getState());
					generatorExtensions.add(extension);
					// writeToConsole("Added bundle to collection: " + extension.getContributor().getName());
				}
			}
		}
	}

	/**
	 * Creates the group containing the extensions of the basic UML to Java generator.
	 * 
	 * @param composite
	 *            The composite containing the group
	 * @param font
	 *            The font used by the parent of the group
	 */
	private void createExtensionsGroup(Composite composite, Font font) {
		GridData gd;
		Group accessorsGroup = createGroup(composite, UML2JavaMessages
				.getString("UML2JavaExtensionLaunchConfigurationTab.ExtensionsGroupName"), 3, 1,
				GridData.FILL_HORIZONTAL);
		Composite comp = new Composite(accessorsGroup, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		comp.setLayout(layout);
		comp.setFont(font);
		gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 2;
		comp.setLayoutData(gd);

		for (IExtension extension : this.generatorExtensions) {
			// Installed generator extensions
			Button extensionButton = new Button(comp, SWT.CHECK);
			extensionButton.setFont(composite.getFont());
			gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = 1;
			extensionButton.setLayoutData(gd);
			extensionButton.setText(extension.getContributor().getName());
			extensionButton.setData("extension", extension);
			extensionButton.setSelection(true);
			extensionButton.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent e) {
					Button button = (Button)e.getSource();
					IExtension extension = (IExtension)button.getData("extension");

					// writeToConsole("Button selected ..." + button.getSelection());

					if (!button.getSelection()) {
						// Object token = ((ExtensionRegistry)registry).getTemporaryUserToken();
						// boolean result = registry.removeExtension(extension, token);
						writeToConsole("Currently not supported!");

						/*
						 * if(bundle.getState() != Bundle.UNINSTALLED) { try { bundle.;
						 * writeToConsole("What is the status? " + bundle.getState() + " (" + Bundle.INSTALLED
						 * + ")"); writeToConsole("Try to uninstall bundle " + bundle.getSymbolicName()); }
						 * catch (BundleException e1) { writeToConsole(e1.getMessage()); e1.printStackTrace();
						 * } }
						 */
					} else {
						// if(bundle.getState() == Bundle.UNINSTALLED) {
						writeToConsole("Currently not supported!");
						// writeToConsole("What is the status? " + bundle.getState() + " (" +
						// Bundle.UNINSTALLED + ")");
						// }
					}
					update();
				}

				public void widgetDefaultSelected(SelectionEvent e) {
					update();
				}
			});

			createHelpButton(comp, "This is a generator extension");
		}
	}

	/**
	 * Check if a given extension is a generator
	 */
	private boolean isGenerator(IConfigurationElement[] configurations) {
		boolean isGenerator = true;
		for (IConfigurationElement configuration : configurations) {
			if (configuration.getName().equalsIgnoreCase("generator")) {
				return isGenerator;
			}
		}
		return !isGenerator;
	}

	private void writeToConsole(String message) {
		MessageConsole myConsole = findConsole("Extensions");
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println(message);
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (IConsole element : existing) {
			if (name.equals(element.getName())) {
				return (MessageConsole)element;
			}
		}
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] {myConsole });
		return myConsole;
	}

	/**
	 * Update the launch configuration and check potential errors.
	 */
	private void update() {
		// nothing yet

		this.getLaunchConfigurationDialog().updateButtons();
		this.getLaunchConfigurationDialog().updateMessage();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public void initializeFrom(ILaunchConfiguration configuration) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		return super.isValid(launchConfig);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return UML2JavaMessages.getString("UML2JavaExtensionLaunchConfigurationTab.Name");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getImage()
	 */
	@Override
	public Image getImage() {
		return UML2JavaUIActivator.getDefault().getImage("icons/class_obj.gif");
	}

}

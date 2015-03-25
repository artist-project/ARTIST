/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.presentation;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.editor.util.EcoreSelectionDialogUtil;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.impl.ModuleImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResource;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;

/**
 * Custom wizard page for importing packages.
 * @author Christian Krause
 */
public class ImportPackagesWizardPage extends WizardPage {

	/**
	 * List of packages URIs to import.
	 */
	private ArrayList<URI> packageURIs;

	/**
	 * List widget displaying the packages.
	 */
	private List listWidget;

	/**
	 * Default constructor.
	 * @param pageId The page Id.
	 */
	public ImportPackagesWizardPage(String pageId) {
		super(pageId);
		packageURIs = new ArrayList<URI>();
		setTitle(HenshinEditorPlugin.INSTANCE.getString("_UI_HenshinModelWizard_label"));
		setDescription(HenshinEditorPlugin.INSTANCE.getString("_UI_Wizard_import_packages_description"));
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {

		GridData fillBoth = new GridData();
		fillBoth.verticalAlignment = GridData.FILL;
		fillBoth.grabExcessVerticalSpace = true;
		fillBoth.grabExcessHorizontalSpace = true;
		fillBoth.horizontalAlignment = GridData.FILL;

		GridData fillHorizontal = new GridData();
		fillHorizontal.verticalAlignment = GridData.BEGINNING;
		fillHorizontal.grabExcessHorizontalSpace = true;
		fillHorizontal.horizontalAlignment = GridData.FILL;

		Composite composite = new Composite(parent, SWT.NONE); {
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			layout.makeColumnsEqualWidth = false;
			composite.setLayout(layout);
			composite.setLayoutData(fillBoth);
		}

		listWidget = new List(composite, SWT.MULTI | SWT.BORDER | SWT.FILL); {
			listWidget.setLayoutData(fillBoth);
		}

		Composite buttons = new Composite(composite, SWT.NONE); {
			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			buttons.setLayout(layout);
			buttons.setLayoutData(fillBoth);
		}

		Button addFromRegistryButton = new Button(buttons, SWT.PUSH); {
			addFromRegistryButton.setText("Add From Registry");
			addFromRegistryButton.setLayoutData(fillHorizontal);
			addFromRegistryButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					addFromRegistry();
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					addFromRegistry();
				}
			});
		}

		Button addFromWorkspaceButton = new Button(buttons, SWT.PUSH); {
			addFromWorkspaceButton.setText("Add From Workspace");
			addFromWorkspaceButton.setLayoutData(fillHorizontal);
			addFromWorkspaceButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					addFromWorkspace();
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					addFromWorkspace();
				}
			});
		}

		Button removeButton = new Button(buttons, SWT.PUSH); {
			removeButton.setText("Remove");
			removeButton.setLayoutData(fillHorizontal);
			removeButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					remove();
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					remove();
				}
			});
		}

		setControl(composite);

	}

	private void addFromRegistry() {
		EPackage ePackage = EcoreSelectionDialogUtil.selectRegisteredPackage(listWidget.getShell(), new ResourceSetImpl());
		add(ePackage);
	}

	private void addFromWorkspace() {
		EPackage ePackage = EcoreSelectionDialogUtil.selectEcoreFilePackage(listWidget.getShell(), new ResourceSetImpl());
		add(ePackage);		
	}

	private void add(EPackage ePackage) {
		if (ePackage!=null) {
			URI uri = EcoreUtil.getURI(ePackage);
			if (!packageURIs.contains(uri)) {
				packageURIs.add(uri);
				listWidget.add(ePackage.getNsURI());
			}
		}		
	}

	private void remove() {
		int[] selected = listWidget.getSelectionIndices();
		Arrays.sort(selected);
		for (int i=0; i<selected.length; i++) {
			listWidget.remove(selected[i]);
			packageURIs.remove(selected[i]);
		}
		if (selected.length==1 && listWidget.getItemCount()>0) {
			listWidget.select(Math.min(selected[0], listWidget.getItemCount()-1));
		}
	}

	public ArrayList<URI> getPackageURIs() {
		return packageURIs;
	}

	public Module createModule() {
		// Create a module with the imported packages (lazily):
		Module module = new ModuleImpl() {
			@Override
			public NotificationChain eSetResource(Resource.Internal resource, NotificationChain notifications) {
				doImportPackages(this, resource);
				return super.eSetResource(resource, notifications);
			}
		};
		return module;
	}

	private void doImportPackages(Module module, Resource resource) {
		if (resource==null) {
			resource = new HenshinResource();
		}
		ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet==null) {
			resourceSet = new HenshinResourceSet();
		}
		for (URI uri : packageURIs) {
			EObject object = resourceSet.getEObject(uri, true);
			if (object instanceof EPackage) {
				module.getImports().add((EPackage) object);
			}
		}
	}

}

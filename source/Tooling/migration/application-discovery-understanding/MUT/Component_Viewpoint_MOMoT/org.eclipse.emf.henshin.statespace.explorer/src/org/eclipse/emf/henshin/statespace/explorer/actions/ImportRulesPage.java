/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.actions;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.presentation.HenshinIcons;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.IWorkbenchAdapter;

/**
 * A wizard page that displays a list of imported transformation
 * rules and that lets the user add and remove rules.
 * @author Christian Krause
 */
public class ImportRulesPage extends WizardPage {
	
	// Imported rules:
	private List<Rule> rules;
	
	// SWT tree for the rules:
	private Tree tree;
	
	// StateSpace resource:
	private Resource stateSpaceResource;
	
	/**
	 * Default constructor.
	 */
	protected ImportRulesPage() {
		super("Import Rules");
		this.rules = new ArrayList<Rule>();
		setDescription("Add or remove transformation rules to be used for this state space.");
	}
	
	/**
	 * Set the state space resource to be used.
	 * @param resource State space resource.
	 */
	public void setStateSpaceResource(Resource resource) {
		this.stateSpaceResource = resource;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2,false));
		
		tree = new Tree(container, SWT.BORDER | SWT.SINGLE);
		tree.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		for (Rule rule : rules) {
			addRuleTreeItem(rule);
		}
		tree.deselectAll();
		
		Composite buttons = new Composite(container, SWT.NONE);
		buttons.setLayoutData(new GridData(GridData.BEGINNING));
		buttons.setLayout(new GridLayout(1,false));
		
		createButton(buttons, "Add");
		createButton(buttons, "Remove");
		
		setControl(container);
		
	}
	
	/*
	 * Open a selection dialog for rules.
	 */
	public void add() {
		
		// Open a selection dialog:
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new RuleLabelProvider(), new RuleContentProvider());
		dialog.setTitle("Select Rule");
		dialog.setMessage("Please select the transformation rule to be imported:");		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		dialog.setInput(root);
		
		URI uri = stateSpaceResource.getURI().trimSegments(1);
		IResource container = root.findMember(uri.toPlatformString(true));
		if (container!=null) dialog.setInitialSelection(container);
		
		dialog.addFilter(new RuleViewFilter());		
		dialog.setValidator(new RuleSelectionValidator());
		dialog.setAllowMultiple(true);
		dialog.open();
		
		Object[] result = dialog.getResult();
		if (result==null) return;
		
		for (int i=0; i<result.length; i++) {
			if (result[i] instanceof Rule) {
				Rule rule = (Rule) result[i];
				if (!rules.contains(rule)) {
					rules.add(rule);
					addRuleTreeItem(rule);
				}
			}
		}
		
	}
	
	/*
	 * Get the rule name how it should be displayed in the list.
	 */
	private void addRuleTreeItem(Rule rule) {
		TreeItem item = new TreeItem(tree, SWT.NONE);
		item.setText(rule.getName() + " (" + rule.eResource().getURI().path() + ")");
		item.setImage(HenshinIcons.RULE);
	}
	
	/*
	 * Remove the currently selected rules.
	 */
	public void remove() {
		TreeItem[] items = tree.getSelection();
		if (items!=null && items.length>0) {
			int index = tree.indexOf(items[0]);
			items[0].dispose();
			rules.remove(index);
		}
	}
		
	/*
	 * Private helper method for creating buttons.
	 */
	private Button createButton(Composite parent, final String name) {
		Button button = new Button(parent, SWT.PUSH);
		button.setText(name);
		button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final ImportRulesPage thisPage = this;
		button.addSelectionListener(new SelectionListener(){
			public void widgetDefaultSelected(SelectionEvent e) {}
			public void widgetSelected(SelectionEvent e) {
				try {
					Method method = ImportRulesPage.class.getMethod(name.toLowerCase());
					if (method!=null) method.invoke(thisPage);
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		});
		return button;
	}
	
	/**
	 * Get the imported rules.
	 * @return List of rules.
	 */
	public List<Rule> getRules() {
		return rules;
	}
	
	
	/*
	 * A view filter for henshin files.
	 */
	static class RuleViewFilter extends ViewerFilter {
		
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof IAdaptable) {
				IAdaptable adapter = (IAdaptable) element;
				Object adaptedResource = adapter.getAdapter(IResource.class);
				if (adaptedResource != null) {
					IResource res = (IResource) adaptedResource;
					if ("henshin".equals(res.getFileExtension()) || IResource.FILE!=res.getType()) {
						return true;
					}
				}
			}
			return element instanceof Rule;
		}
		
	}
	
	/*
	 * Internal label provider class.
	 */
	static class RuleLabelProvider extends LabelProvider implements ILabelProvider {
		
		/* 
		 * (non-Javadoc)
		 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
		 */
		@Override
		public Image getImage(Object element) {
			if (element instanceof IAdaptable) {
				final IAdaptable adaptable = (IAdaptable) element;
				final Object adapter = adaptable.getAdapter(IWorkbenchAdapter.class);
				if (adapter != null) {
					final IWorkbenchAdapter res = (IWorkbenchAdapter) adapter;
					return res.getImageDescriptor(element).createImage();
				}
			}
			if (element instanceof Rule) {
				return HenshinIcons.RULE;
			}
			return null;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
		 */
		@Override
		public String getText(Object element) {
			if (element instanceof IAdaptable) {
				final IAdaptable adaptable = (IAdaptable) element;
				final Object adapter = adaptable.getAdapter(IWorkbenchAdapter.class);
				if (adapter != null) {
					final IWorkbenchAdapter res = (IWorkbenchAdapter) adapter;
					return res.getLabel(element);
				}
			}
			if (element instanceof Rule) {
				return ((Rule) element).getName();
			}
			return element.toString();
		}
		
	}
	
	/*
	 * Ecore content provider.
	 */
	class RuleContentProvider extends BaseWorkbenchContentProvider {
		
		/* 
		 * (non-Javadoc)
		 * @see org.eclipse.ui.model.BaseWorkbenchContentProvider#getChildren(java.lang.Object)
		 */
		@Override
		public Object[] getChildren(Object element) {
			if (element instanceof IAdaptable) {
				
				IAdaptable adapter = (IAdaptable) element;
				Object adaptedResource = adapter.getAdapter(IResource.class);
				
				if (adaptedResource != null) {
					IResource res = (IResource) adaptedResource;
					if ("henshin".equals(res.getFileExtension())) {
						
						// Construct an URI:
						String filePath = res.getFullPath().toString();
						URI baseURI = stateSpaceResource.getURI();
						URI absolute = URI.createPlatformResourceURI(filePath, true);
						URI relative = absolute.deresolve(baseURI);
						
						// Create the resource:
						ResourceSet resourceSet = stateSpaceResource.getResourceSet();
						Resource resource = resourceSet.getResource(absolute,true);
						resource.setURI(relative);
						
						List<Rule> rules = new ArrayList<Rule>();
						for (EObject item : resource.getContents()) {
							if (item instanceof Module) {
								for (Unit unit : ((Module) item).getUnits()) {
									if (unit instanceof Rule) {
										rules.add((Rule) unit);
									}
								}
							}
						}
						return rules.toArray();
						
					}
				}
			}
			return super.getChildren(element);
		}
	}
	
	/*
	 * Rule selection validator.
	 */
	static class RuleSelectionValidator implements ISelectionStatusValidator {
		
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.ui.dialogs.ISelectionStatusValidator#validate(java.lang.Object[])
		 */
		public IStatus validate(Object[] selection) {
			if (selection.length > 0) {
				final Object obj = selection[0];
				if (obj instanceof Rule) {
					return new Status(IStatus.OK, StateSpaceExplorerPlugin.ID, "Rule selected");
				}
			}
			return new Status(IStatus.ERROR, StateSpaceExplorerPlugin.ID, "No rule selected");
		}
	};

}

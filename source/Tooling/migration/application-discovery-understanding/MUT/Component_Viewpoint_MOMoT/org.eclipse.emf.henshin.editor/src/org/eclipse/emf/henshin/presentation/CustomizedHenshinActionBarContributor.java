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

import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.CleanUpCommandMenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.CompleteMultiRulesCommandMenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.CopySubgraphMenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.CreateDynamicMC;
import org.eclipse.emf.henshin.editor.menuContributors.CreateEdgeCommandMenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.CreateMappingCommandMenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.CreateNestedConditionMenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.FormulaCommandMenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.RemoveMappedNodesMenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.SimpleCommandMenuContributor;
import org.eclipse.emf.henshin.editor.menuContributors.UnitCommandMenuContributor;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.provider.ReferencedRuleItemProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.ui.IEditorPart;

/**
 * Provides more complex editing actions by forwarding the current selection to
 * a set of {@link MenuContributor}s. Manages {@link MenuManager}s holding the
 * {@link Action}s and actualizes them on {@link SelectionListener}- and
 * {@link CommandStackListener} events. Implementing
 * {@link CommandStackListener} is required since applicability of more complex
 * actions might depend on changes that would go undetected by selection change
 * only. e.g. property changes may affect applicability.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 * 
 */
public class CustomizedHenshinActionBarContributor extends HenshinActionBarContributor implements
		CommandStackListener {
	
	protected Collection<IMenuManager> managedMenus = new HashSet<IMenuManager>();
	
	protected EditingDomain domain;
	
	protected List<?> currentSelection;
	
	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		if (part != null) {
			domain = ((IEditingDomainProvider) part).getEditingDomain();
			domain.getCommandStack().addCommandStackListener(this);
		} else {
			if (domain != null) {
				domain.getCommandStack().removeCommandStackListener(this);
			}
			domain = null;
		}
	}
	
	@Override
	public void commandStackChanged(EventObject event) {
		clearMenuManagers();
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		super.selectionChanged(event);
		if (event.getSelection() instanceof IStructuredSelection) {
			currentSelection = ((IStructuredSelection) event.getSelection()).toList();
		}
		refreshMenuManagers();
	}
	
	protected void clearMenuManagers() {
		for (IMenuManager mm : managedMenus) {
			mm.removeAll();
		}
	}
	
	protected void refreshMenuManagers() {
		for (IMenuManager mm : managedMenus) {
			mm.removeAll();
			buildContributions(mm);
		}
	}
	
	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		
		super.menuAboutToShow(menuManager);
		
		IMenuManager submenuManager = new MenuManager(
				HenshinEditorPlugin.INSTANCE.getString("_UI_CreateAdvanced_menu_item"));
		buildContributions(submenuManager);
		menuManager.insertBefore("edit", submenuManager);
		buildNavigationActions(menuManager);
	}
	
	protected void buildNavigationActions(IMenuManager menuManager) {
		IStructuredSelection selection = (IStructuredSelection) selectionProvider.getSelection();
		menuManager.insertBefore("edit", new Separator("henshinNavigation"));
		if (selection.size() == 1) {
			
			if (selection.getFirstElement() instanceof ReferencedRuleItemProvider) {
				final ReferencedRuleItemProvider rrip = (ReferencedRuleItemProvider) selection
						.getFirstElement();
				menuManager.appendToGroup(
						"henshinNavigation",
						new Action(HenshinEditorPlugin.INSTANCE
								.getString("_UI_NavigationAction_GotoDeclaration")) {
							@Override
							public void run() {
								Rule rule = (Rule) rrip.getValue();
								HenshinEditor hEditor = (HenshinEditor) activeEditor;
								hEditor.setSelectionToViewer(Collections.singleton(rule));
							}
						});
			}
			if (selection.getFirstElement() instanceof Unit
					&& domain instanceof AdapterFactoryEditingDomain) {
				Unit unit = (Unit) selection.getFirstElement();
				AdapterFactoryEditingDomain aDomain = (AdapterFactoryEditingDomain) domain;
				
				IMenuManager usageMenu = new MenuManager(
						HenshinEditorPlugin.INSTANCE.getString("_UI_NavigationAction_GotoUsage"));
				Collection<Setting> settings = EcoreUtil.UsageCrossReferencer.find(unit,
						unit.eContainer());
				boolean used = false;
				for (final Setting setting : settings) {
					used = true;
					Object adapter = aDomain.getAdapterFactory().adapt(setting.getEObject(),
							ITreeItemContentProvider.class);
					if (adapter == null)
						continue;
					ITreeItemContentProvider tcp = (ITreeItemContentProvider) adapter;
					for (final Object child : tcp.getChildren(setting.getEObject())) {
						if (child instanceof IWrapperItemProvider
								&& ((IWrapperItemProvider) child).getValue() == unit) {
							usageMenu.add(new Action(setting.getEObject().getClass()
									.getSimpleName()
									+ "." + setting.getEStructuralFeature().getName()) {
								@Override
								public void run() {
									HenshinEditor hEditor = (HenshinEditor) activeEditor;
									hEditor.setSelectionToViewer(Collections.singleton(child));
								}
							});
						}
						
					}
					
				}
				if (!used)
					usageMenu.add(new Action(HenshinEditorPlugin.INSTANCE
							.getString("_UI_NavigationAction_GotoUsage_None")) {
						@Override
						public boolean isEnabled() {
							return false;
						}
					});
				
				menuManager.appendToGroup("henshinNavigation", usageMenu);
			}
		}
	}
	
	@Override
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);
		IMenuManager subMenuManager = (IMenuManager) menuManager
				.find("org.eclipse.emf.henshin.modelMenuID");
		MenuManager mm = new MenuManager(
				HenshinEditorPlugin.INSTANCE.getString("_UI_CreateAdvanced_menu_item"));
		subMenuManager.setVisible(false);
		subMenuManager.insertBefore("additions", mm);
		this.managedMenus.add(mm);
	}
	
	/**
	 * 
	 * Delegating the actual build of {@link Action}s to {@link MenuContributor}
	 * s.
	 * 
	 * @param menuManager
	 */
	protected void buildContributions(IMenuManager menuManager) {
		
		CreateDynamicMC.INSTANCE.buildContributions(menuManager, currentSelection, domain);
		
		SimpleCommandMenuContributor.INSTANCE.buildContributions(menuManager, currentSelection,
				domain);
		CreateEdgeCommandMenuContributor.INSTANCE.buildContributions(menuManager, currentSelection,
				domain);
		RemoveMappedNodesMenuContributor.INSTANCE.buildContributions(menuManager, currentSelection,
				domain);
		CreateMappingCommandMenuContributor.INSTANCE.buildContributions(menuManager,
				currentSelection, domain);
		FormulaCommandMenuContributor.INSTANCE.buildContributions(menuManager, currentSelection,
				domain);
		CreateNestedConditionMenuContributor.INSTANCE.buildContributions(menuManager,
				currentSelection, domain);
		
		CopySubgraphMenuContributor.INSTANCE.buildContributions(menuManager, currentSelection,
				domain);
		
		UnitCommandMenuContributor.INSTANCE.buildContributions(menuManager,
				currentSelection, domain);

		CleanUpCommandMenuContributor.INSTANCE.buildContributions(menuManager, currentSelection, domain);
		
		CompleteMultiRulesCommandMenuContributor.INSTANCE.buildContributions(menuManager, currentSelection, domain);

		// ExpandNodeMenuContributor.INSTANCE.buildContributions(menuManager,
		// currentSelection, domain);
		
		menuManager.update(true);
	}
	
}

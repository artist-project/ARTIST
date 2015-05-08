/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.commands;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.presentation.HenshinEditorPlugin;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;

/**
 * MenuContributor are singletons that populate a given {@link IMenuManager}
 * with {@link Action}s that are applicable for the given selection. On
 * {@link Action#run()}, the the {@link Action} executes its wrapped
 * {@link Command} on the given {@link EditingDomain}'s {@link CommandStack}.
 * 
 * This class is an abstract providing a common interface and convenience
 * methods.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 * 
 */
public abstract class MenuContributor {
	
	/**
	 * Shared key prefix for all labels used by this {@link MenuContributor}
	 */
	protected String propertyPrefix = "_UI_AdvancedCommand_";
	
	/**
	 * Singleton access
	 */
	public static MenuContributor INSTANCE = new MenuContributor() {
		@Override
		protected void contributeActions(IMenuManager menuManager, List<?> selection) {
		}
	};
	
	protected EditingDomain domain;
	
	protected MenuContributor() {
	}
	
	/**
	 * Performs selection analysis and builds the corresponding actions.
	 * 
	 * @param menuManager
	 * @param selection
	 */
	protected abstract void contributeActions(IMenuManager menuManager, List<?> selection);
	
	public void buildContributions(IMenuManager menuManager, List<?> selection, EditingDomain domain) {
		this.domain = domain;
		contributeActions(menuManager, selection);
	}
	
	/**
	 * Convenience method to retrieve labels from the plugin's properties.
	 * 
	 * @param key
	 * @return
	 */
	protected String getLabel(String key) {
		return HenshinEditorPlugin.INSTANCE.getString(propertyPrefix + key);
	}
	
	/**
	 * Creates a disabled {@link Action} as a workaround to insert labels.
	 * Convenient to display explanations why a certain action is not applicable
	 * in the given context.
	 * 
	 * @param label
	 * @return
	 */
	protected IAction createUnrunnableItem(final String label) {
		return new Action() {
			
			@Override
			public String getText() {
				return label;
			}
			
			@Override
			public boolean isEnabled() {
				return false;
			}
		};
	}
	
	/**
	 * Build an {@link Action} with the given label, that executes the given
	 * {@link Command} on {@link Action#run()}.
	 * 
	 * @param label
	 * @param cmd
	 * @return
	 */
	protected IAction createAction(final String label, final Command cmd) {
		
		return new Action() {
			@Override
			public void run() {
				if (domain != null) {
					domain.getCommandStack().execute(cmd);
				}
			}
			
			@Override
			public String getText() {
				return label;
			}
		};
	}
	
}

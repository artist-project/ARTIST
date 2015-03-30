/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.artist.premigration.tft.tft.views.InventoryView;

/**
 * Menu command handler for opening the Inventory View
 * 
 * @author Burak Karaboga
 *
 */
public class OpenInventoryViewHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	/**
	 * Opens the Inventory View
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			//Find and show InventoryView using the static ID field
			HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().showView(InventoryView.ID);
		} catch (PartInitException e) {
			e.printStackTrace();
			throw new ExecutionException(e.getMessage(), e.getCause());
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}

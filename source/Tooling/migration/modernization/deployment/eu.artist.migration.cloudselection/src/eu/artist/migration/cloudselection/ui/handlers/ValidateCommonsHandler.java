/*******************************************************************************
 * Copyright (c) 2015 ICCS/NTUA
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Aliki Kopaneli
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/ 

package eu.artist.migration.cloudselection.ui.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;

import eu.artist.migration.cloudselection.ui.Utils;
import eu.artist.migration.cloudselection.ui.views.CommonFeaturesView;
import eu.artist.migration.cloudselection.ui.views.ProviderSelectorView;
import eu.artist.migration.cloudselection.umlmodelservice.validation.CommonValidator;

public class ValidateCommonsHandler extends AbstractHandler {
	public ValidateCommonsHandler(){
	}
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IViewReference[] refs = window.getPages()[0].getViewReferences();
		IWorkbenchPart  part = null;
		String value = "a";
		CommonFeaturesView curView = null;
		ProviderSelectorView selector = null;
		List<String> list = null;
		boolean gotProviders = false;
		boolean gotFeatures = false;
		for (int i=0; i<refs.length; i++){
			part = refs[i].getPart(false);
			if (part  instanceof eu.artist.migration.cloudselection.ui.views.ProviderSelectorView){
				selector = (ProviderSelectorView) part; 
				gotProviders = true;
			}
			else if (part instanceof eu.artist.migration.cloudselection.ui.views.CommonFeaturesView){
				curView = (CommonFeaturesView)part;
				gotFeatures = true;
			}
			if (gotFeatures && gotProviders){
				break;
			}
		}
		if (!gotFeatures){
			System.exit(1);
		}
		else{
			if (gotProviders){
				list = selector.findSelectedProviders();
			}
			else{
				list = Utils.findSupportedProviders();
			}
			value = CommonValidator.validate(curView.findCheckedRoot(), list);
			IParameter iparam;
					
			//get the command from plugin.xml
			ICommandService cmdService = (ICommandService)window.getService(ICommandService.class);
			Command cmd = cmdService.getCommand("eu.artist.migration.cloudselection.commands.showresults");
			
			//get the parameter
			try {
				iparam = cmd.getParameter("eu.artist.migration.cloudselection.commandPartrueameter1");
				Parameterization params = new Parameterization(iparam, value);
				Parameterization[] parameters = new Parameterization[1];
				parameters[0] = params;
				//build the parameterized command
				ParameterizedCommand pc = new ParameterizedCommand(cmd, parameters);
				//execute the command
				IHandlerService handlerService = (IHandlerService)window.getService(IHandlerService.class);
				handlerService.executeCommand(pc, null);
			} catch (NotDefinedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotEnabledException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotHandledException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}

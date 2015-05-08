/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.filter;

import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.swt.widgets.ToolBar;

/**
 * @author Gregor Bonifer
 * @author Stefan Jurack
 */
public class FilterControlsViewer extends BaseFilterControlsViewer {
	
	protected FilterController filterController;
	
	public FilterControlsViewer(FilterController filter) {
		this.filterController = filter;
	}
	
	public void addControls(ToolBar tb) {
		
		// create ToolItem for Mappings
		//
		new ButtonController(new ButtonState(getString("_UI_FeatureFilter_ShowMappings"),
				getImage("full/obj16/Filter/MappingsShow.png")) {
			@Override
			void initState() {
				filterController.setFiltered(true, HenshinPackage.eINSTANCE.getMapping());
			}
		}, new ButtonState(getString("_UI_FeatureFilter_HideMappings"),
				getImage("full/obj16/Filter/MappingsHide.png")) {
			@Override
			void initState() {
				filterController.setFiltered(false, HenshinPackage.eINSTANCE.getMapping());
			}
		}, this.filterController.isFiltered(HenshinPackage.eINSTANCE.getMapping())).init(tb);
		
		// create ToolItem for Parameters
		//
		new ButtonController(new ButtonState(getString("_UI_FeatureFilter_ShowParameters"),
				getImage("full/obj16/Filter/ParametersShow.png")) {
			@Override
			void initState() {
				filterController.setFiltered(true, HenshinPackage.eINSTANCE.getParameter());
			}
		}, new ButtonState(getString("_UI_FeatureFilter_HideParameters"),
				getImage("full/obj16/Filter/ParametersHide.png")) {
			@Override
			void initState() {
				filterController.setFiltered(false, HenshinPackage.eINSTANCE.getParameter());
			}
		}, this.filterController.isFiltered(HenshinPackage.eINSTANCE.getParameter())).init(tb);
		
		// createToolItem for ParameterMappings
		//
		new ButtonController(new ButtonState(getString("_UI_FeatureFilter_ShowParameterMappings"),
				getImage("full/obj16/Filter/ParameterMappingsShow.png")) {
			@Override
			void initState() {
				filterController.setFiltered(true, HenshinPackage.eINSTANCE.getParameterMapping());
			}
		}, new ButtonState(getString("_UI_FeatureFilter_HideParameterMappings"),
				getImage("full/obj16/Filter/ParameterMappingsHide.png")) {
			@Override
			void initState() {
				filterController.setFiltered(false, HenshinPackage.eINSTANCE.getParameterMapping());
			}
		}, this.filterController.isFiltered(HenshinPackage.eINSTANCE.getParameterMapping())).init(tb);
		
	}
	
}

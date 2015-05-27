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

package eu.artist.migration.cloudselection.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;

import eu.artist.migration.cloudselection.ui.Utils;

public class ProviderSelectorView extends ViewPart{
	TableViewer viewer;

	public class ALabelProvider extends LabelProvider{
		public Image checked = Utils.createImage("checkboxenabledon.gif");
		public Image unch = Utils.createImage("checkboxenabledoff.gif");
		
		@Override
		public String getText(Object element){
			if (element instanceof Data){
				return ((Data)element).name;
			}
			else return null;
		}
		@Override
		public Image getImage(Object element) {
			if (element instanceof Data){
				if (((Data)element).selected){
					return checked;
				}
				else{
					return unch;
				}
			}
			return null;
		}
	}
	
	public class Data{
		String name;
		boolean selected;
		public Data(String name, boolean selected){
			this.name = name;
			this.selected = selected;
		}
	}
	
	
	
	public void createPartControl(Composite parent) { 
		Data[] myArray = findSupportedProviders().toArray(new Data[0]);
		viewer = new TableViewer(parent);
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setLabelProvider(new ALabelProvider());
		viewer.setInput(myArray);
		final Table t = viewer.getTable();
		t.addMouseListener(new 
				MouseListener(){
    		
	    	@Override
			public void mouseDown(MouseEvent e) {
				int item = t.getSelectionIndex();
				Data clickedElement = ((Data[])viewer.getInput())[item];
				clickedElement.selected = !clickedElement.selected;		
				viewer.refresh();
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseUp(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public List<String> findSelectedProviders(){
		List<String> list = new ArrayList<String>();
		Data[] data = (Data[])viewer.getInput();
		for (int i=0; i<data.length; i++){
			if (data[i].selected){
				list.add(data[i].name);
			}
		}
		return list;
	}
	
	public List<Data> findSupportedProviders(){
		List<Data> list = new ArrayList<Data>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("org.eclipse.papyrus.uml.extensionpoints.UMLProfile");
		for (int i=0; i<point.getExtensions().length; i++){
			IConfigurationElement ce = point.getExtensions()[i].getConfigurationElements()[0];
			if (ce.getAttribute("description").endsWith("cloud environment") 
					&& ce.getAttribute("provider").equals("ARTIST Project")){
					list.add(new Data(ce.getAttribute("name"), false));		
			}
		}
		return list;
	}
	
	public void setFocus(){
		viewer.getControl().setFocus();
	}
}

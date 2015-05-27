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

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import eu.artist.migration.cloudselection.viewdatamodel.HelperElement;
import eu.artist.migration.cloudselection.viewdatamodel.ModelElement;

public class ViewContentProvider implements  ITreeContentProvider{
	protected TreeViewer viewer;
	
	public void dispose() {}
	
	public void setViewer(TreeViewer viewer){
		this.viewer = viewer;
	}
	public Object[] getChildren(Object parent){
		if (parent instanceof HelperElement){
			return  ((HelperElement) parent).getChildren().toArray();
		}
		else {
			return null;
		}
	}
	
	public Object getParent(Object element) {
		if(element instanceof ModelElement) {
			return ((ModelElement)element).getParent();
		}
		return null;
	}
	
	public boolean hasChildren(Object element){
		if (element instanceof HelperElement){
			return getChildren(element).length>0;
		}
		else return false;
	}
	
	public Object[] getElements(Object inputElement){
		return getChildren(inputElement);
	}
	
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		//this.viewer = (TreeViewer)viewer;
	}
	
}

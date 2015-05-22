package eu.artist.migration.cloudselection.ui.views;


import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import eu.artist.migration.cloudselection.ui.Utils;
import eu.artist.migration.cloudselection.viewdatamodel.EnumerationProperty;
import eu.artist.migration.cloudselection.viewdatamodel.HelperElement;
import eu.artist.migration.cloudselection.viewdatamodel.LeafElement;
import eu.artist.migration.cloudselection.viewdatamodel.ModelElement;
import eu.artist.migration.cloudselection.viewdatamodel.ServiceElement;


public class ViewLabelProvider extends LabelProvider{
	
	public Image general = Utils.createImage("cloud.png");
	public Image checked = Utils.createImage("checkboxenabledon.gif");
	public Image unch = Utils.createImage("checkboxenabledoff.gif");
	public Image property = Utils.createImage("settings_32.png");
	public Image service = Utils.createImage("clouds.png");
	
		public Image getImage(Object element) {
		if (element instanceof ServiceElement){
			return service;
		}
		else if(element instanceof EnumerationProperty){
			return property;
		}
		else if (element instanceof HelperElement){
			return general;
		}
		else if (element instanceof LeafElement) {
			if (((LeafElement) element).isChecked())
				return checked;
			else 
				return unch;
		} else {
			throw unknownElement(element);
		}
	 }
	
	public String getText(Object element) {
		if (element instanceof ModelElement) {
			return ((ModelElement) element).getName();
		} else {
			throw unknownElement(element);
		}
	}

	public void dispose() {
	}

	protected RuntimeException unknownElement(Object element) {
		return new RuntimeException("Unknown type of element in tree of type " + element.getClass().getName());
	}

}

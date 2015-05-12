package eu.artist.migration.cloudselection.viewdatamodel;

import java.util.ArrayList;
import java.util.List;

public class HelperElement extends ModelElement{

	protected List<ModelElement> children;
	
	public HelperElement(){
		this.name = "";
		this.children = new ArrayList<ModelElement>();
	}
	
	public HelperElement(String name){
		this.name = name;
		this.children = new ArrayList<ModelElement>();
	}

	public void addChild (ModelElement child){
		child.setParent(this);
		children.add(child);
	}
	
	public void removeChild (ModelElement child){
		int found = children.indexOf(child);
		if (found>-1){
			children.remove(found);
		}
	}
	
	public List<ModelElement> getChildren (){
		return children;
	}
}

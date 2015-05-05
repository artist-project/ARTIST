package eu.artist.migration.cloudselection.viewdatamodel;

public abstract class ModelElement {
	
	protected String name;
	protected ModelElement parent;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setParent(ModelElement parent){
		this.parent = parent;
	}
	
	public ModelElement getParent(){
		return this.parent;
	}
}

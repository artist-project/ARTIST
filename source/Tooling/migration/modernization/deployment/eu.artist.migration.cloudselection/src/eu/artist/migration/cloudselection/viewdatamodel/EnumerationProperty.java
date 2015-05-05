package eu.artist.migration.cloudselection.viewdatamodel;

public class EnumerationProperty extends HelperElement{
	
	protected String parentStereotype;
	
	public EnumerationProperty(String referencedProperty, String parentStereotype){
		super(referencedProperty);
		this.parentStereotype = parentStereotype;
	}

	public String getReferencedProperty() {
		return name;
	}
	
	public String getParentStereotype(){
		return parentStereotype;
	}
}

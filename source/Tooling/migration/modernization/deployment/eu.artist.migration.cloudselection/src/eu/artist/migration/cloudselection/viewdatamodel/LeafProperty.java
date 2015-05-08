package eu.artist.migration.cloudselection.viewdatamodel;

public class LeafProperty extends LeafElement{

	protected String referencedProperty;
	protected String parentStereotype;
	
	public String getReferencedProperty() {
		return referencedProperty;
	}

	public void setReferencedProperty(String referencedProperty) {
		this.referencedProperty = referencedProperty;
	}

	public LeafProperty(boolean checked, String referencedProperty, String parentStereotype){
		super(referencedProperty, checked);
		this.referencedProperty = referencedProperty;
	}
}

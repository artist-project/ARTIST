package eu.artist.migration.cloudselection.viewdatamodel;

public class LeafElement extends ModelElement {

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	protected boolean checked;
	
	public LeafElement(String name, boolean checked){
		this.name = name;
		this.checked = checked;
	}
}

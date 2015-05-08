package eu.artist.premigration.tft.tft.model.migrationstrategy;

/**
 * Enumeration mapping all migration strategy categories with possible stereotypes belonging to each category
 * 
 * @author Burak Karaboga
 *
 */
public enum TargetPlatform {

	GAE("Google App Engine"),
	AZURE("Windows Azure"),
	EC2 ("Amazon EC2");
	
	private TargetPlatform(String name){
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}
	
	public String toString(){
		return this.name();
	}
}

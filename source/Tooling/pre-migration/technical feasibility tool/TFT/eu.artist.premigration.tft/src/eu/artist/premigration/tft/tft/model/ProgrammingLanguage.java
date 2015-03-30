package eu.artist.premigration.tft.tft.model;

public enum ProgrammingLanguage {

	JAVA("java"),
	CSHARP("cs");
	
	private ProgrammingLanguage(String name){
		this.extension = name;
	}

	private String extension;

	public String getExtension() {
		return extension;
	}
	
	public String toString(){
		return this.name();
	}
}

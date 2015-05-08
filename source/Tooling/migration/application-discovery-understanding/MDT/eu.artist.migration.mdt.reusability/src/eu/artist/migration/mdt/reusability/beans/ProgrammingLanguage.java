package eu.artist.migration.mdt.reusability.beans;

public class ProgrammingLanguage {
	private String name;
	private String fileExt;
	private String preselected;
	public static String programingLanguajeMAT="";

	public String getPreselected() {
		return preselected;
	}

	public void setPreselected(String preselected) {
		this.preselected = preselected;
	}

	public ProgrammingLanguage() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}
	
	

}

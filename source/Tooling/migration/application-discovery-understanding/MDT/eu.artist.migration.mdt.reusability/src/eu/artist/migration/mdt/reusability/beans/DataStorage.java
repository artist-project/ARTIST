package eu.artist.migration.mdt.reusability.beans;

import java.util.ArrayList;

public class DataStorage {
	private String name;
	private String reusabilityLevel;
	private ArrayList keywords;	
	public static String dataStorageTypeMAT="";
	
	public DataStorage() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReusabilityLevel() {
		return reusabilityLevel;
	}

	public void setReusabilityLevel(String reusabilityLevel) {
		this.reusabilityLevel = reusabilityLevel;
	}

	public ArrayList getKeywords() {
		return keywords;
	}

	public void setKeywords(ArrayList keywords) {
		this.keywords = keywords;
	}
		
}

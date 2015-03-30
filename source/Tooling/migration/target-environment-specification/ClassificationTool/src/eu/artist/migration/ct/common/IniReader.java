package eu.artist.migration.ct.common;

import java.io.File;
import org.ini4j.Ini;

public class IniReader {
	private static volatile IniReader instance = null;
	private String fileName;
	private Ini iniFile;

	// private constructor
	private IniReader(String fileName) {
		this.fileName = fileName;
		iniFile = null;
		try {
			iniFile = new Ini(new File(fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static IniReader getInstance() {
		if (instance == null) {
			synchronized (IniReader.class) {
				// Double check
				if (instance == null) {
					instance = new IniReader(Constants.DEFAULT_CONFIGURATION_FILE);
				}
			}
		}
		return instance;
	}
	
	public String getClassificationEngine() {
		if (iniFile == null) {
			//Default value if ini file does not exist
			return "knn";
		}
		
		return iniFile.get("classification", "engine");
	}
	
	public String getDbHost() {
		if (iniFile == null) {
			//Default value if ini file does not exist
			return "localhost";
		}
		
		return iniFile.get("database", "host");
	}
	
	public String getDbPort() {
		if (iniFile == null) {
			//Default value if ini file does not exist
			return "3306";
		}
		
		return iniFile.get("database", "port");
	}
	
	public String getDbUser() {
		if (iniFile == null) {
			//Default value if ini file does not exist
			return "root";
		}
		
		return iniFile.get("database", "user");
	}
	
	public String getDbPass() {
		if (iniFile == null) {
			//Default value if ini file does not exist
			return "";
		}
		
		return iniFile.get("database", "pass");
	}
	
	public String getDbName() {
		if (iniFile == null) {
			//Default value if ini file does not exist
			return "benchmarks";
		}
		
		return iniFile.get("database", "db");
	}

	public String getFileName() {
		return fileName;
	}
	
	public double getPriceWeight() {
		double ret = 0.5;
		if (iniFile == null) {
			//Default value if ini file does not exist
			return ret;
		}
		
		String temp = iniFile.get("service_efficiency", "price_weight");
		try {
			ret = Double.parseDouble(temp);
		}
		catch (Exception ex) {
			return ret;
		}
		
		return ret;
	}
	
	public double getPerformanceWeight() {
		double ret = 0.5;
		if (iniFile == null) {
			//Default value if ini file does not exist
			return ret;
		}
		
		String temp = iniFile.get("service_efficiency", "performance_weight");
		try {
			ret = Double.parseDouble(temp);
		}
		catch (Exception ex) {
			return ret;
		}
		
		return ret;
	}
}




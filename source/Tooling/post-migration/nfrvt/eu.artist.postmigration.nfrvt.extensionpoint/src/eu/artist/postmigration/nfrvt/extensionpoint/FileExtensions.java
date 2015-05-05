package eu.artist.postmigration.nfrvt.extensionpoint;

import java.util.List;

import com.google.common.collect.Lists;

public class FileExtensions {
	public static List<String> getAllExtensions() {
		return Lists.newArrayList(
				"uml",
				"nsl", "prop", 
				"tsl", "pattern", "optpat", 
				"pml", "measurement", "value", 
				"gml", "goal", 
				"gel", "eval");
	}
	
	public static List<String> getUMLExtensions() {
		return Lists.newArrayList("uml");
	}
	
	public static String getUMLExtension() {
		return "uml";
	}
	
	public static List<String> getPropertyCatalogueExtensions() {
		return Lists.newArrayList("nsl", "prop");
	}
	
	public static String getPropertyCatalogueExtension() {
		return "prop";
	}
	
	public static List<String> getPatternCatalogueExtensions() {
		return Lists.newArrayList("tsl", "pattern", "optpat");
	}
	
	public static String getPatternCatalogueExtension() {
		return "pattern";
	}
	
	public static List<String> getMeasurementModelExtensions() {
		return Lists.newArrayList("pml", "measurement", "value");
	}
	
	public static String getMeasurementModelExtension() {
		return "measurement";
	}
	
	public static List<String> getGoalModelExtensions() {
		return Lists.newArrayList("gml", "goal");
	}
	
	public static String getGoalModelExtension() {
		return "goal";
	}
	
	public static List<String> getMigrationEvaluationExtensions() {
		return Lists.newArrayList("gel", "eval");
	}
	
	public static String getMigrationEvaluationExtension() {
		return "eval";
	}
	
	protected static String getFileExtension(String fileName) {
		if(fileName == null)
			return null;
		String[] fileNameSegments = fileName.split("\\.");
		if(fileNameSegments == null || fileNameSegments.length == 0)
			return fileName;
		return fileNameSegments[fileNameSegments.length - 1];
	}
	
	public static boolean isPropertyCatalogue(String fileName) {
		if(fileName == null)
			return false;
		return getPropertyCatalogueExtensions().contains(getFileExtension(fileName));
	}
	
	public static boolean isPatternCatalogue(String fileName) {
		if(fileName == null)
			return false;
		return getPatternCatalogueExtensions().contains(getFileExtension(fileName));
	}
	
	public static boolean isMeasurementModel(String fileName) {
		if(fileName == null)
			return false;
		return getMeasurementModelExtensions().contains(getFileExtension(fileName));
	}
	
	public static boolean isGoalModel(String fileName) {
		if(fileName == null)
			return false;
		return getGoalModelExtensions().contains(getFileExtension(fileName));
	}
	
	public static boolean isMigrationEvaluation(String fileName) {
		if(fileName == null)
			return false;
		return getMigrationEvaluationExtensions().contains(getFileExtension(fileName));
	}
	
	public static boolean isUMLModel(String fileName) {
		if(fileName == null)
			return false;
		return getUMLExtensions().contains(getFileExtension(fileName));
	}
}

package eu.artist.migration.mdt.reusability;

public class ContextData {
	private static boolean businessReused;
	private static boolean presentationReused;
	private static String presentationPath;
	private static boolean sameTechPresentation;
	private static boolean sameLangBusiness;
	
	public static boolean isSameTechPresentation() {
		return sameTechPresentation;
	}

	public static void setSameTechPresentation(boolean sameTechPresentation) {
		ContextData.sameTechPresentation = sameTechPresentation;
	}

	public static boolean isSameLangBusiness() {
		return sameLangBusiness;
	}

	public static void setSameLangBusiness(boolean sameLangBusiness) {
		ContextData.sameLangBusiness = sameLangBusiness;
	}

	public static String getPresentationPath() {
		return presentationPath;
	}

	public static void setPresentationPath(String presentationPath) {
		ContextData.presentationPath = presentationPath;
	}

	public static boolean isBusinessReused() {
		return businessReused;
	}

	public static void setBusinessReused(boolean businessReused) {
		ContextData.businessReused = businessReused;
	}

	public static boolean isPresentationReused() {
		return presentationReused;
	}

	public static void setPresentationReused(boolean presentationReused) {
		ContextData.presentationReused = presentationReused;
	}
	
	

	public ContextData() {
		// TODO Auto-generated constructor stub
	}
	
	

}

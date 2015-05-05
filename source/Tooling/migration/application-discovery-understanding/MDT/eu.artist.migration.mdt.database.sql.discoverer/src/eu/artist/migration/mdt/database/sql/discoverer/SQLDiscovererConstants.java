package eu.artist.migration.mdt.database.sql.discoverer;

public class SQLDiscovererConstants {
	
	private SQLDiscovererConstants() {
		// prevent instantiation
	}
	
	public static final String SQL_FILE_SUFFIX = "sql"; //$NON-NLS-1$
	public static final String SQL_MODEL_FILE_SUFFIX = "xmi"; //$NON-NLS-1$
	public static final String UML_MODEL_FILE_SUFFIX = "uml"; //$NON-NLS-1$
	public static final String UML_PROFILE_MODEL_FILE_SUFFIX = ".profile.uml"; //$NON-NLS-1$
	public static final String UML_OBJECT_MODEL_FILE_SUFFIX = "_umlObject.uml"; //$NON-NLS-1$
	
	public static final String DISCOVERING_MESSAGE = "Discovering SQL model"; //$NON-NLS-1$
	
	public static final String ATL_MODULE = "transformations/InsertClass2UMLObject.asm"; //$NON-NLS-1$
	public static final String ATL_LIBRARY_SHORT_NAME = "InsertClass2UMLObjectHelpers"; //$NON-NLS-1$
	public static final String ATL_LIBRARY = "transformations/InsertClass2UMLObjectHelpers.asm"; //$NON-NLS-1$
}

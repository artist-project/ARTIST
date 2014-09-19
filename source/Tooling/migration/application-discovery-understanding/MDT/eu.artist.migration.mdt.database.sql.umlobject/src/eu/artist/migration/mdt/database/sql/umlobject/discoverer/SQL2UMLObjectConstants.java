package eu.artist.migration.mdt.database.sql.umlobject.discoverer;

public class SQL2UMLObjectConstants {
	
	private SQL2UMLObjectConstants() {
		// prevent instantiation
	}
	
	public static final String SQL_MODEL_FILE_SUFFIX = "xmi"; //$NON-NLS-1$
	public static final String UML_MODEL_FILE_SUFFIX = "uml"; //$NON-NLS-1$
	public static final String UML_PROFILE_MODEL_FILE_SUFFIX = ".profile.uml"; //$NON-NLS-1$
	public static final String UML_OBJECT_MODEL_FILE_SUFFIX = "_umlObject.uml"; //$NON-NLS-1$
	
	public static final String DISCOVERING_MESSAGE = "Discovering UML objects model"; //$NON-NLS-1$
	
	public static final String ATL_MODULE = "transformations/InsertClass2UMLObject.asm"; //$NON-NLS-1$
	public static final String ATL_LIBRARY_SHORT_NAME = "InsertClass2UMLObjectHelpers"; //$NON-NLS-1$
	public static final String ATL_LIBRARY = "transformations/InsertClass2UMLObjectHelpers.asm"; //$NON-NLS-1$
	public static final String UML_PROFILE_DB = "models/model.profile.uml"; //$NON-NLS-1$
}

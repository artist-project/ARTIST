package eu.artist.postmigration.nfrvt.lang.uml;

import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Type;

public class MARTEUtil {
	public static boolean isReal(Type type) {
		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();
			return "MARTE_Library::MARTE_PrimitivesTypes::Real".equals(qualifiedName); //$NON-NLS-1$
		}
		return false; 
	}
	
	public static boolean isInteger(Type type) {
		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();
			return "MARTE_Library::MARTE_PrimitivesTypes::Integer".equals(qualifiedName); //$NON-NLS-1$
		}
		return false; 
	}

	public static boolean isBoolean(PrimitiveType type) {
		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();
			return "MARTE_Library::MARTE_PrimitivesTypes::Boolean".equals(qualifiedName); //$NON-NLS-1$
		}
		return false; 
	}
	
	public static boolean isString(PrimitiveType type) {
		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();
			return "MARTE_Library::MARTE_PrimitivesTypes::String".equals(qualifiedName); //$NON-NLS-1$
		}
		return false; 
	}
	
	public static boolean isUnlimitedNatural(PrimitiveType type) {
		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();
			return "MARTE_Library::MARTE_PrimitivesTypes::UnlimitedNatural".equals(qualifiedName); //$NON-NLS-1$
		}
		return false; 
	}
	
	public static boolean isDateTime(PrimitiveType type) {
		if (type instanceof PrimitiveType) {
			String qualifiedName = type.getQualifiedName();
			return "MARTE_Library::MARTE_PrimitivesTypes::DateTime".equals(qualifiedName); //$NON-NLS-1$
		}
		return false; 
	}
}

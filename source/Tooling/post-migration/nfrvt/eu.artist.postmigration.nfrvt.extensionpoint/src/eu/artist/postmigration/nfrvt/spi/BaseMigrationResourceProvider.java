package eu.artist.postmigration.nfrvt.spi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.resource.UMLResource;

public class BaseMigrationResourceProvider implements IMigrationResourceProvider {

	public static URI ECORE_PRIMITIVE_TYPES = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
	public static URI UML_PRIMITIVE_TYPES = URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI);
	public static URI JAVA_PRIMITIVE_TYPES = URI.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI);
	public static URI XML_PRIMITIVE_TYPES = URI.createURI(UMLResource.XML_PRIMITIVE_TYPES_LIBRARY_URI);
	public static URI MARTE_LIBRARY = URI.createURI("pathmap://Papyrus_LIBRARIES/MARTE_Library.library.uml");
	
	@Override
	public List<URI> getResourceURIs() {
		List<URI> uris = new ArrayList<>();
		uris.add(ECORE_PRIMITIVE_TYPES);
		uris.add(UML_PRIMITIVE_TYPES);
		uris.add(JAVA_PRIMITIVE_TYPES);
		uris.add(XML_PRIMITIVE_TYPES);
		uris.add(MARTE_LIBRARY);
		return uris;
	}

}

package eu.artist.postmigration.nfrvt.extensionpoint;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;

public class RegisteredModelResources {
	private static RegisteredModelResources handler;
	private List<String> allowedExtensions = FileExtensions.getAllExtensions();
	private Set<URI> uris;
	
	private RegisteredModelResources() {		
		uris = collectURIs();
	}
	
	protected Set<URI> collectURIs() {
		Set<URI> uris = new HashSet<>();
		if(!Platform.isRunning())
			return uris;
		if(Platform.getExtensionRegistry() == null) 
			return uris;
		
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(ExtensionID.MIGRATION_RESOURCE_EXTENSION);
		try {
			for (IConfigurationElement e : config) {
				  String path = e.getAttribute(ExtensionID.ATT_PATH);
				  if(path == null)
					  break;
				  
				  try {
					  URI uri = URI.createURI(path);
					  if(validate(uri))
						  uris.add(uri);
					  else
						  System.out.println(uri + " not supported.");
				  }	catch(Exception ex) {
					  ; // fail silently
				  }
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return uris;
	}
	
	public static RegisteredModelResources getInstance() {
		if(handler == null)
			handler = new RegisteredModelResources();
		return handler;
	}
	
	public Set<URI> getURIs() {
		return Collections.unmodifiableSet(uris);
	}

	private boolean validate(URI uri) {
		if(uri == null)
			return false;
		return allowedExtensions.contains(uri.fileExtension());
	}
}

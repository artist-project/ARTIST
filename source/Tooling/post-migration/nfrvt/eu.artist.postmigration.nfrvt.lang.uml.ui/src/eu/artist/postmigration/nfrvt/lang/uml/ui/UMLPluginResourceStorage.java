package eu.artist.postmigration.nfrvt.lang.uml.ui;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

public class UMLPluginResourceStorage implements IStorage {
	  protected IPath path;
	  protected URI uri;
	  
	  public UMLPluginResourceStorage(URI uri) {
		  this.uri = uri.trimFragment();
		  this.path = new Path(uri.toPlatformString(true));
	  }
	 
	  public InputStream getContents() throws CoreException {
		URL url;
		try {
			url = new URL(uri.toString());
			InputStream inputStream = url.openConnection().getInputStream();
			return inputStream;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	  }
	 
	  public IPath getFullPath() {
	    return path;
	  }
	 
	  public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
	    return null;
	  }
	 
	  public String getName() {
		  return uri.toString();
	  }
	 
	  public boolean isReadOnly() {
	    return true;
	  }
	  
	  public URI getUri() {
		return uri;
	}
}

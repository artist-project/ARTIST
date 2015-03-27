package eu.artist.migration.cloudselection.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

import eu.artist.migration.cloudselection.umlmodelservice.modelparsing.Resources;

public class Utils {
	
	public static String pathToModelFile;
		
	public static void loadCore(){
		Resources.loadCoreResource(pathToModelFile);
	}
	
	public static Image createImage (String path){
		Bundle bundle = Platform.getBundle("eu.artist.migration.cloudselection");
		URL fileURL = bundle.getEntry("icons/" + path);
		File file = null;
		try {
		URL resolvedFileURL = FileLocator.toFileURL(fileURL);

			// We need to use the 3-arg constructor of URI in order to properly escape file system chars
			URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
			file = new File(resolvedURI);
		
		//File file = new File("/home/aliki/eclipse_workspaces/workspace_kepler_2/eu.artist.migration.cloudselection/icons/" + path);
		    return new Image(null, new FileInputStream(file));
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		    return null;
		} catch (IOException e1) {
		    e1.printStackTrace();
		    return null;
		}
	}

}

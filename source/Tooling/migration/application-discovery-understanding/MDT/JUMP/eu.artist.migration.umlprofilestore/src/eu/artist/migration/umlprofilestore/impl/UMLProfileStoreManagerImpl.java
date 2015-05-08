/*******************************************************************************
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.umlprofilestore.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import eu.artist.migration.umlprofilestore.UMLProfileStoreManager;
import eu.artist.migration.umlprofilestore.UMLProfileStorePlugin;

/**
 * @author Alexander Bergmayr
 *
 */
public class UMLProfileStoreManagerImpl implements UMLProfileStoreManager {
	
	/**
	 * 
	 */
	private static boolean IS_INTIALIZED = false;
	
	/**
	 * Path to the profiles in the store
	 */
	private final String mapping = "pathmap://UML_PROFILE_STORE/PROFILES/";
	
	/**
	 * The resource set of the profiles in the store
	 */
	private static ResourceSet resourceSet;
	
	/**
	 * 
	 */
	private UMLProfileStoreManagerImpl() { }
	
	/**
	 * 
	 * @return the {@link JavaDiscoverer}
	 */
	public static UMLProfileStoreManager init() {
		if(!IS_INTIALIZED) {
			IS_INTIALIZED = true;
			
			// init the resource set
			resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
			UMLPackage.eINSTANCE.eClass();
			
			return new UMLProfileStoreManagerImpl();
		} 
		return UMLProfileStoreManager.INSTANCE;
	}
	
	/* (non-Javadoc)
	 * @see eu.artist.migration.umlprofilestore.UMLProfileStoreManager#getUMLProfiles()
	 */
	@Override
	public Collection<Resource> getUMLProfiles() {
		return getCollectUMLProfiles().values();
	}

	/* (non-Javadoc)
	 * @see eu.artist.migration.umlprofilestore.UMLProfileStoreManager#addProfile(org.eclipse.emf.ecore.resource.Resource)
	 */
	@SuppressWarnings("restriction")
	@Override
	public void addProfile(Resource profile) {
		String profileName = profile.getURI().lastSegment();
		
		Map<String, Resource> collectedProfiles = getCollectUMLProfiles();
		
		// we do have to adapt the plugin.xml if the profile
		// is not yet in the store
		if(!collectedProfiles.containsKey(profileName)) {
//			IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();			
//			String extensionContent = "<plugin>"
//					                + "<extension point=" + '"' + "org.eclipse.papyrus.uml.extensionpoints.UMLProfile" + '"' + ">"
//					                + "<profile description=" + '"' + "UML Profile for JPA2" + '"'
//                                              + " iconpath=" + '"' + "icon/icon.png" + '"'
//                                              + " name=" + '"' + "JPA2" + '"'
//                                              + " path=" + '"' + "platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/jpa2_profile.profile.uml" + '"'
//                                              + " provider=" + '"' + "TUWien" + '"' + ">"
//                                    + "</profile>"
//                                    + "</extension>"
//					                + "</plugin>";
			
			String extensionContent =
	                "<extension point=" + '"' + "org.eclipse.papyrus.uml.extensionpoints.UMLProfile" + '"' + ">"
	                + "<profile description=" + '"' + "UML Profile for JPA2" + '"'
                              + " iconpath=" + '"' + "icon/icon.png" + '"'
                              + " name=" + '"' + "JPA2" + '"'
                              + " path=" + '"' + "platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/jpa2_profile.profile.uml" + '"'
                              + " provider=" + '"' + "TUWien" + '"' + ">"
                    + "</profile>"
                    + "</extension>"
	                + "</plugin>";			
			
//			InputStream is = null;
//			try {
//				is = new ByteArrayInputStream(extensionContent.getBytes("UTF-8"));
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			IContributor contributor = ContributorFactoryOSGi.createContributor(Platform.getBundle(UMLProfileStorePlugin.PLUGIN_ID));
//			Object token = ((ExtensionRegistry) extensionRegistry).getTemporaryUserToken();
//			boolean result = extensionRegistry.addContribution(is, contributor, false, "TestName", null, token);
//			System.out.println(result);

			try {
				UMLProfileStorePlugin.getDefault().stop(UMLProfileStorePlugin.getDefault().getBundle().getBundleContext());
				
				System.out.println("stopped ...");
				
				
				StringBuffer pluginXmlContent = getPluginXml();
				pluginXmlContent.delete(pluginXmlContent.lastIndexOf("</"), pluginXmlContent.length());
				pluginXmlContent.append(extensionContent);
				System.out.println(pluginXmlContent);
				setPluginXml(pluginXmlContent.toString());
				
				BundleContext bundleContext = Platform.getBundle(UMLProfileStorePlugin.PLUGIN_ID).getBundleContext();

				UMLProfileStorePlugin plugin = new UMLProfileStorePlugin();
				plugin.start(bundleContext);
				
				System.out.println("started ...");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// writeToConsole("Registry successful: " + result);
		}
		
		Bundle umlProfileStore = Platform.getBundle(UMLProfileStorePlugin.PLUGIN_ID);
		URL fileURL = umlProfileStore.getEntry("umlprofiles");
		
		File file = null;
		try {
		    file = new File(FileLocator.resolve(fileURL).toURI());
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		}
		
		System.out.println(file.toString());
		
		URI profileURI = URI.createFileURI(file.toString());
		profileURI = profileURI.appendSegment(profileName);
		System.out.println(profileURI);
		profile.setURI(profileURI);
		
		// writeToConsole("URI: " + profile.getURI());
		
		try {
			profile.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			for(StackTraceElement stElement : e.getStackTrace()) {
				// writeToConsole(stElement.toString());
			}
		}
	}
	
	private Map<String, Resource> getCollectUMLProfiles() {
		Bundle umlProfileStore = Platform.getBundle(UMLProfileStorePlugin.PLUGIN_ID);
		URL fileURL = umlProfileStore.getEntry("./umlprofiles");
		
		File file = null;
		try {
		    file = new File(FileLocator.resolve(fileURL).toURI());
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		}
		
		Map<String, Resource> umlProfiles = new HashMap<String, Resource>();
		
		for(File umlProfile : file.listFiles()) {			
			if(umlProfile.getName().endsWith(UMLResource.FILE_EXTENSION)) {
				String profileName = URI.createFileURI(umlProfile.getAbsolutePath()).lastSegment();
				URI profileURI = URI.createURI(mapping.concat(profileName)).trimFragment();
				URI normalizedProfileURI = resourceSet.getURIConverter().normalize(profileURI);
						
				Resource profileResource = resourceSet.getResource(normalizedProfileURI, true);
				umlProfiles.put(profileName, profileResource);
			}
		}
		
		return umlProfiles;
	}
	
	private void setPluginXml(String content) {
		Bundle umlProfileStore = Platform.getBundle(UMLProfileStorePlugin.PLUGIN_ID);
		URL fileURL = umlProfileStore.getEntry("plugin.xml");
		
		BufferedWriter writer = null;
		File file = null;
		try {
		    file = new File(FileLocator.resolve(fileURL).toURI());
		    writer = new BufferedWriter(new FileWriter(file));
		    writer.write(content);
		    writer.flush();
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	private StringBuffer getPluginXml() {
		Bundle umlProfileStore = Platform.getBundle(UMLProfileStorePlugin.PLUGIN_ID);
		URL fileURL = umlProfileStore.getEntry("plugin.xml");
		
		StringBuffer result = new StringBuffer();
		File file = null;
		BufferedReader reader = null;
		try {
		    file = new File(FileLocator.resolve(fileURL).toURI());
		    reader = new BufferedReader(new FileReader(file));
		    
		    String currentLine;
			while ((currentLine = reader.readLine()) != null) {
				result.append(currentLine);
			}
			
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return result;
	}
	
	private void writeToConsole(String message) {
		MessageConsole myConsole = findConsole("JUMP");
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println(message);
	}
	
	private MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	}
}

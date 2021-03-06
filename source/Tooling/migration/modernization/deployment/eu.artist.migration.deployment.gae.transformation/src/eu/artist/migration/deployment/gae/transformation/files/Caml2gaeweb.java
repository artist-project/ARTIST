/*******************************************************************************
 * Copyright (c) 2010, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package eu.artist.migration.deployment.gae.transformation.files;

import gaeweb.GaewebPackage;
import gaeweb.util.GaewebResourceFactoryImpl;
import gaeweb.util.GaewebResourceImpl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

/**
 * Entry point of the 'Caml2gaeweb' transformation module.
 */
public class Caml2gaeweb {

	/**
	 * The property file. Stores module list, the metamodel and library locations.
	 * @generated
	 */
	private Properties properties;
	
	/**
	 * The UMLM model.
	 * @generated
	 */
	protected IModel umlmModel;	
	
	/**
	 * The GAEP model.
	 * @generated
	 */
	protected IModel gaepModel;	
	
	/**
	 * The CMLM model.
	 * @generated
	 */
	protected IModel cmlcpModel;	
	
	/**
	 * The SECP model.
	 * @generated
	 */
	protected IModel secpmModel;
	
	
	/**
	 * The AEWM model.
	 * @generated
	 */
	protected IModel aewmModel;	
		
	/**
	 * The main method.
	 * 
	 * @param args
	 *            are the arguments
	 * @generated NOT
	 */
	public static void main(String[] args) {
		try {
			if (args.length < 3) {
				System.out.println("Arguments not valid : {UMLM_model_path, GAEP_model_path, CMLM_model_path, SECP_model_path, AEWM_model_path}.");
			} else {
				Caml2gaeweb runner = new Caml2gaeweb();
				runner.loadModels(args[0], args[1], args[2], args[3]);
				runner.doCaml2gaeweb(new NullProgressMonitor());
				runner.saveModels(args[4], Boolean.TRUE);
			}
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ATLExecutionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Constructor.
	 *
	 * @generated
	 */
	public Caml2gaeweb() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("Caml2gaeweb.properties").openStream());
		EPackage.Registry.INSTANCE.put(getMetamodelUri("UMLMM"), org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}
	
	/**
	 * Load the input and input/output models, initialize output models.
	 * 
	 * @param umlmModelPath
	 *            the UMLM model path
	 * @param gaepModelPath
	 *            the GAEP model path
	 * @throws ATLCoreException
	 *             if a problem occurs while loading models
	 *
	 * @generated
	 */
	public void loadModels(String umlmModelPath, String gaepModelPath, String cmlmModelPath, String secpmModelPath) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
	 	IReferenceModel umlmmMetamodel = factory.newReferenceModel();
		injector.inject(umlmmMetamodel, getMetamodelUri("UMLMM"));
	 	IReferenceModel aewmmMetamodel = factory.newReferenceModel();
		injector.inject(aewmmMetamodel, getMetamodelUri("AEWMM"));
		this.umlmModel = factory.newModel(umlmmMetamodel);
		injector.inject(umlmModel, umlmModelPath);
		this.gaepModel = factory.newModel(umlmmMetamodel);
		injector.inject(gaepModel, gaepModelPath);
		this.cmlcpModel = factory.newModel(umlmmMetamodel);
		injector.inject(cmlcpModel, cmlmModelPath);
		this.secpmModel = factory.newModel(umlmmMetamodel);
		injector.inject(secpmModel, secpmModelPath);
		this.aewmModel = factory.newModel(aewmmMetamodel);
	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param aewmModelPath
	 *            the AEWM model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 *
	 * @generated
	 */
	public void saveModels(String aewmModelPath) throws ATLCoreException {
		IExtractor extractor = new EMFExtractor();
		extractor.extract(aewmModel, aewmModelPath);
	}

	/**
	 * Save the output and input/output models.
	 * 
	 * @param aewmModelPath
	 *            the AEWM model path
	 * @param targetPath
	 *            path to target folder where to place models          
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 * @throws IOException 
	 *             if a problem occurs while saving models
	 * @generated NOT
	 */
	public void saveModels(String aewmModelPath, String targetPath, boolean skipXMI) throws ATLCoreException, IOException {
		if(!skipXMI) {
			IExtractor extractor = new EMFExtractor();
			extractor.extract(aewmModel, aewmModelPath);
		}
		
		// add file extension to registry					
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
		    .put("xml", new GaewebResourceFactoryImpl());
		
		// add the model content to an XML resource
		URI location = null;
		if (targetPath!=null)
			aewmModelPath = new File(targetPath).getAbsolutePath() + File.separator + aewmModelPath;
		
		// create the resource set and register the metamodel packages
		Resource xmiResource = ((EMFModel) aewmModel).getResource();
		xmiResource.setURI(URI.createFileURI(aewmModelPath));
		xmiResource.getResourceSet().getPackageRegistry().put(GaewebPackage.eINSTANCE.getNsURI(), GaewebPackage.eINSTANCE);
		
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(xmiResource.getResourceSet().getPackageRegistry());
		// put metadata options
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
			
		GaewebResourceImpl gaeResource = new GaewebResourceImpl(xmiResource.getURI());
		gaeResource.getContents().add(EcoreUtil.copy(xmiResource.getContents().get(0)));
		gaeResource.save(options);
	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param aewmModelPath
	 *            the AEWM model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 * @throws IOException 
	 *             if a problem occurs while saving models
	 * @generated NOT
	 */
	public void saveModels(String aewmModelPath, boolean skipXMI) throws ATLCoreException, IOException {
		saveModels (aewmModelPath, null, skipXMI);
	}

	/**
	 * Transform the models.
	 * 
	 * @param monitor
	 *            the progress monitor
	 * @throws ATLCoreException
	 *             if an error occurs during models handling
	 * @throws IOException
	 *             if a module cannot be read
	 * @throws ATLExecutionException
	 *             if an error occurs during the execution
	 *
	 * @generated
	 */
	public Object doCaml2gaeweb(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(umlmModel, "UMLM", "UMLMM");
		launcher.addInModel(gaepModel, "GAEP", "UMLMM");
		launcher.addInModel(cmlcpModel, "CMLCP", "UMLMM");
		launcher.addInModel(secpmModel, "SECP", "UMLMM");
		launcher.addOutModel(aewmModel, "AEWM", "AEWMM");
		return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList());
	}
	
	/**
	 * Returns an Array of the module input streams, parameterized by the
	 * property file.
	 * 
	 * @return an Array of the module input streams
	 * @throws IOException
	 *             if a module cannot be read
	 *
	 * @generated
	 */
	protected InputStream[] getModulesList() throws IOException {
		InputStream[] modules = null;
		String modulesList = properties.getProperty("Caml2gaeweb.modules");
		if (modulesList != null) {
			String[] moduleNames = modulesList.split(",");
			modules = new InputStream[moduleNames.length];
			for (int i = 0; i < moduleNames.length; i++) {
				String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString();
				modules[i] = getFileURL(asmModulePath).openStream();
			}
		}
		return modules;
	}
	
	/**
	 * Returns the URI of the given metamodel, parameterized from the property file.
	 * 
	 * @param metamodelName
	 *            the metamodel name
	 * @return the metamodel URI
	 *
	 * @generated
	 */
	protected String getMetamodelUri(String metamodelName) {
		return properties.getProperty("Caml2gaeweb.metamodels." + metamodelName);
	}
	
	/**
	 * Returns the file name of the given library, parameterized from the property file.
	 * 
	 * @param libraryName
	 *            the library name
	 * @return the library file name
	 *
	 * @generated
	 */
	protected InputStream getLibraryAsStream(String libraryName) throws IOException {
		return getFileURL(properties.getProperty("Caml2gaeweb.libraries." + libraryName)).openStream();
	}
	
	/**
	 * Returns the options map, parameterized from the property file.
	 * 
	 * @return the options map
	 *
	 * @generated
	 */
	protected Map<String, Object> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("Caml2gaeweb.options.")) {
				options.put(entry.getKey().toString().replaceFirst("Caml2gaeweb.options.", ""), 
				entry.getValue().toString());
			}
		}
		return options;
	}
	
	/**
	 * Finds the file in the plug-in. Returns the file URL.
	 * 
	 * @param fileName
	 *            the file name
	 * @return the file URL
	 * @throws IOException
	 *             if the file doesn't exist
	 * 
	 * @generated
	 */
	protected static URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = Caml2gaeweb.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = Caml2gaeweb.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}

	/**
	 * Tests if eclipse is running.
	 * 
	 * @return <code>true</code> if eclipse is running
	 *
	 * @generated
	 */
	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}

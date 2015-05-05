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
package eu.artist.migration.deployment.azure.transformation.files;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.util.AzureCSCfgResourceFactoryImpl;
import eu.artist.migration.deployment.azure.cscfg.util.AzureCSCfgResourceImpl;
import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.util.AzureCSDefResourceFactoryImpl;
import eu.artist.migration.deployment.azure.csdef.util.AzureCSDefResourceImpl;
import eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage;
import eu.artist.migration.deployment.azure.csdes.util.AzureCSDesAdapterFactory;
import eu.artist.migration.deployment.azure.csdes.util.AzureCSDesResourceImpl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

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
 * Entry point of the 'Caml2azure' transformation module.
 */
public class Caml2azure {

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
	 * The AZUP model.
	 * @generated
	 */
	protected IModel azupModel;	
	
	/**
	 * The ACSDM model.
	 * @generated
	 */
	protected IModel acsdmModel;	
	
	
	/**
	 * The ACSCFGM model.
	 * @generated
	 */
	protected IModel acscfgmModel;
	
	/**
	 * The ACSDESM model.
	 * @generated
	 */
	protected IModel acsdesmModel;
		

	/**
	 * Constructor.
	 *
	 * @generated
	 */
	public Caml2azure() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("Caml2azure.properties").openStream());
		EPackage.Registry.INSTANCE.put(getMetamodelUri("UMLMM"), org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(getMetamodelUri("ACSDMM"), eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(getMetamodelUri("ACSCMM"), eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(getMetamodelUri("ACSDESMM"), eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}
	
	/**
	 * Load the input and input/output models, initialize output models.
	 * 
	 * @param umlmModelPath
	 *            the UMLM model path
	 * @param azupModelPath
	 *            the AZUP model path
	 * @throws ATLCoreException
	 *             if a problem occurs while loading models
	 *
	 * @generated
	 */
	public void loadModels(String umlmModelPath, String azupModelPath) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
	 	IReferenceModel umlmmMetamodel = factory.newReferenceModel();
		injector.inject(umlmmMetamodel, getMetamodelUri("UMLMM"));
		
	 	IReferenceModel acsdmmMetamodel = factory.newReferenceModel();
		injector.inject(acsdmmMetamodel, getMetamodelUri("ACSDMM"));
		
		IReferenceModel acscfgmmMetamodel = factory.newReferenceModel();
		injector.inject(acscfgmmMetamodel, getMetamodelUri("ACSCMM"));
		
		IReferenceModel acsdesmmMetamodel = factory.newReferenceModel();
		injector.inject(acsdesmmMetamodel, getMetamodelUri("ACSDESMM"));
		
		this.umlmModel = factory.newModel(umlmmMetamodel);
		injector.inject(umlmModel, umlmModelPath);
		
		this.azupModel = factory.newModel(umlmmMetamodel);
		injector.inject(azupModel, azupModelPath);
		
		this.acsdmModel = factory.newModel(acsdmmMetamodel);
		
		this.acscfgmModel = factory.newModel(acscfgmmMetamodel);
		
		this.acsdesmModel = factory.newModel(acsdesmmMetamodel);
	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param acsdmModelPath
	 *            the ACSDM model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 *
	 * @generated
	 */
//	public void saveModels(String acsdmModelPath) throws ATLCoreException {
//		IExtractor extractor = new EMFExtractor();
//		extractor.extract(acsdmModel, acsdmModelPath);
//	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param acsdmModelPath
	 *            the ACSDM model path
	 * @param targetPath
	 *            path to target folder where to place models          
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 * @throws IOException 
	 *             if a problem occurs while saving models
	 * @generated NOT
	 */
	public void saveServiceDefinitionModel(String acsdmModelPath, String targetPath, boolean skipXMI) throws ATLCoreException, IOException {
		if(!skipXMI) {
			IExtractor extractor = new EMFExtractor();
			extractor.extract(acsdmModel, acsdmModelPath);
		}
		
		// add file extension to registry					
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
		    .put("xml", new AzureCSDefResourceFactoryImpl());
		
		// add the model content to an XML resource
		URI location = null;
		if (targetPath!=null)
			acsdmModelPath = new File(targetPath).getAbsolutePath() + File.separator + acsdmModelPath;
		
		// create the resource set and register the metamodel packages
		Resource xmiResource = ((EMFModel) acsdmModel).getResource();
		xmiResource.setURI(URI.createFileURI(acsdmModelPath));
		xmiResource.getResourceSet().getPackageRegistry().put(AzureCSDefPackage.eINSTANCE.getNsURI(), AzureCSDefPackage.eINSTANCE);
		
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(xmiResource.getResourceSet().getPackageRegistry());
		// put metadata options
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
			
		AzureCSDefResourceImpl gaeResource = new AzureCSDefResourceImpl(xmiResource.getURI());
		gaeResource.getContents().add(EcoreUtil.copy(xmiResource.getContents().get(0)));
		gaeResource.save(options);
	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param acsdmModelPath
	 *            the ACSDM model path
	 * @param targetPath
	 *            path to target folder where to place models          
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 * @throws IOException 
	 *             if a problem occurs while saving models
	 * @generated NOT
	 */
	public void saveServiceConfigurationModel(String acscfgmModelPath, String targetPath, boolean skipXMI) throws ATLCoreException, IOException {
		if(!skipXMI) {
			IExtractor extractor = new EMFExtractor();
			extractor.extract(acscfgmModel, acscfgmModelPath);
		}
		
		// add file extension to registry					
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
		    .put("xml", new AzureCSCfgResourceFactoryImpl());
		
		// add the model content to an XML resource
		URI location = null;
		if (targetPath!=null)
			acscfgmModelPath = new File(targetPath).getAbsolutePath() + File.separator + acscfgmModelPath;
		
		// create the resource set and register the metamodel packages
		Resource xmiResource = ((EMFModel) acscfgmModel).getResource();
		xmiResource.setURI(URI.createFileURI(acscfgmModelPath));
		xmiResource.getResourceSet().getPackageRegistry().put(AzureCSCfgPackage.eINSTANCE.getNsURI(), AzureCSCfgPackage.eINSTANCE);
		
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(xmiResource.getResourceSet().getPackageRegistry());
		// put metadata options
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);		
			
		AzureCSCfgResourceImpl gaeResource = new AzureCSCfgResourceImpl(xmiResource.getURI());
		gaeResource.getContents().add(EcoreUtil.copy(xmiResource.getContents().get(0)));
		gaeResource.save(options);
	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param acsdmModelPath
	 *            the ACSDM model path
	 * @param targetPath
	 *            path to target folder where to place models          
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 * @throws IOException 
	 *             if a problem occurs while saving models
	 * @generated NOT
	 */
	public void saveServiceDescriptionModel(String acsdesmModelPath, String targetPath, boolean skipXMI) throws ATLCoreException, IOException {
		if(!skipXMI) {
			IExtractor extractor = new EMFExtractor();
			extractor.extract(acsdesmModel, acsdesmModelPath);
		}
		
		// add file extension to registry					
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
		    .put("xml", new AzureCSDesAdapterFactory());
		
		// add the model content to an XML resource
		URI location = null;
		if (targetPath!=null)
			acsdesmModelPath = new File(targetPath).getAbsolutePath() + File.separator + acsdesmModelPath;
		
		// create the resource set and register the metamodel packages
		Resource xmiResource = ((EMFModel) acsdesmModel).getResource();
		xmiResource.setURI(URI.createFileURI(acsdesmModelPath));
		xmiResource.getResourceSet().getPackageRegistry().put(AzureCSDesPackage.eINSTANCE.getNsURI(), AzureCSDesPackage.eINSTANCE);
		
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(xmiResource.getResourceSet().getPackageRegistry());
		// put metadata options
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);		
			
		AzureCSDesResourceImpl gaeResource = new AzureCSDesResourceImpl(xmiResource.getURI());
		gaeResource.getContents().add(EcoreUtil.copy(xmiResource.getContents().get(0)));
		gaeResource.save(options);
	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param acsdmModelPath
	 *            the ACSDM model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 * @throws IOException 
	 *             if a problem occurs while saving models
	 * @generated NOT
	 */
	public void saveModels(String acsdmModelPath, String acscfgmModelPath, String acsdesmModelPath, boolean skipXMI) throws ATLCoreException, IOException {
		saveServiceDefinitionModel (acsdmModelPath, null, skipXMI);
		saveServiceConfigurationModel (acscfgmModelPath, null, skipXMI);
		saveServiceDescriptionModel (acsdesmModelPath, null, skipXMI);
	}
	
	public void saveModels(String acsdmModelPath, String acscfgmModelPath, String acsdesmModelPath, String targetPath, boolean skipXMI) throws ATLCoreException, IOException {
		saveServiceDefinitionModel (acsdmModelPath, targetPath, skipXMI);
		saveServiceConfigurationModel (acscfgmModelPath, targetPath, skipXMI);
		saveServiceDescriptionModel (acsdesmModelPath, targetPath, skipXMI);
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
	public void doCaml2azure(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
		// Generating Service Definition
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(umlmModel, "UMLM", "UMLMM");
		launcher.addInModel(azupModel, "AZUP", "UMLMM");
		launcher.addOutModel(acsdmModel, "ACSDM", "ACSDMM");
		launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList("serdef"));
		
		// Generating Service Configuration
		launcher = new EMFVMLauncher();
		launcher.initialize(launcherOptions);
		launcher.addInModel(umlmModel, "UMLM", "UMLMM");
		launcher.addInModel(azupModel, "AZUP", "UMLMM");
		launcher.addOutModel(acscfgmModel, "ACSCM", "ACSCMM");
		launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList("sercfg"));
		
		// Generating Service Description
		launcher = new EMFVMLauncher();
		launcher.initialize(launcherOptions);
		launcher.addInModel(umlmModel, "UMLM", "UMLMM");
		launcher.addInModel(azupModel, "AZUP", "UMLMM");
		launcher.addOutModel(acsdesmModel, "ACSDESM", "ACSDESMM");
		launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList("serdes"));
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
	protected InputStream[] getModulesList(String module) throws IOException {
		InputStream[] modules = null;
		String modulesList = properties.getProperty("Caml2azure.modules." + module);
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
		return properties.getProperty("Caml2azure.metamodels." + metamodelName);
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
		return getFileURL(properties.getProperty("Caml2azure.libraries." + libraryName)).openStream();
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
			if (entry.getKey().toString().startsWith("Caml2azure.options.")) {
				options.put(entry.getKey().toString().replaceFirst("Caml2azure.options.", ""), 
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
			URL resourceURL = Caml2azure.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = Caml2azure.class.getResource(fileName);
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

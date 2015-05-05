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
package eu.artist.migration.mut.umlprofiler.codemodel2umlclassesdiagram.files;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import eu.artist.migration.model.trace.TracePackage;

/**
 * Entry point of the 'CodeModel2UMLClassesDiagram' transformation module.
 */
public class CodeModel2UMLClassesDiagram {

	/**
	 * The property file. Stores module list, the metamodel and library locations.
	 * @generated
	 */
	private Properties properties;
	
	/**
	 * The CM model.
	 * @generated
	 */
	protected IModel cmModel;	
	
	/**
	 * The JP model.
	 * @generated
	 */
	protected IModel jpModel;	
	
	/**
	 * The JPT model.
	 * @generated
	 */
	protected IModel jptModel;	
	
	/**
	 * The EJT model.
	 * @generated
	 */
	protected IModel ejtModel;

	/**
	 * The MC model.
	 * @generated
	 */
	protected IModel mcModel;

	/**
	 * The UPT model.
	 * @generated
	 */
	protected IModel uptModel;	
	
	/**
	 * The UCD model.
	 * @generated
	 */
	protected IModel ucdModel;	
	
	/**
	 * The TM model.
	 * @generated
	 */
	protected IModel tmModel;	
		
	/**
	 * The main method.
	 * 
	 * @param args
	 *            are the arguments
	 * @generated
	 */
	public static void main(String[] args) {
		try {
			if (args.length < 8) {
				System.out.println("Arguments not valid : {CM_model_path, JP_model_path, JPT_model_path, EJT_model_path, MC_model_path, UPT_model_path, UCD_model_path, TM_model_path}.");
			} else {
				CodeModel2UMLClassesDiagram runner = new CodeModel2UMLClassesDiagram();
				runner.loadModels(args[0], args[1], args[2], args[3], args[4], args[5]);
				runner.doCodeModel2UMLClassesDiagram(new NullProgressMonitor());
				runner.saveModels(args[6], args[7]);
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
	 * @generated NOT
	 */
	public CodeModel2UMLClassesDiagram() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("CodeModel2UMLClassesDiagram.properties").openStream());
		EPackage.Registry.INSTANCE.put(getMetamodelUri("UMLMM"), org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(getMetamodelUri("JMM"), org.eclipse.gmt.modisco.java.emf.JavaPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(getMetamodelUri("TMM"), TracePackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}
	
	/**
	 * Load the input and input/output models, initialize output models.
	 * 
	 * @param cmModelPath
	 *            the CM model path
	 * @param jpModelPath
	 *            the JP model path
	 * @param jptModelPath
	 *            the JPT model path
	 * @param ejtModelPath
	 *            the EJT model path
	 * @param mcModelPath
	 *            the MC model path
	 * @param uptModelPath
	 *            the UPT model path
	 * @throws ATLCoreException
	 *             if a problem occurs while loading models
	 *
	 * @generated
	 */
	public void loadModels(String cmModelPath, String jpModelPath, String jptModelPath, String ejtModelPath, String mcModelPath, String uptModelPath) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
	 	IReferenceModel jmmMetamodel = factory.newReferenceModel();
		injector.inject(jmmMetamodel, getMetamodelUri("JMM"));
	 	IReferenceModel umlmmMetamodel = factory.newReferenceModel();
		injector.inject(umlmmMetamodel, getMetamodelUri("UMLMM"));
	 	IReferenceModel tmmMetamodel = factory.newReferenceModel();
		injector.inject(tmmMetamodel, getMetamodelUri("TMM"));
		this.cmModel = factory.newModel(jmmMetamodel);
		injector.inject(cmModel, cmModelPath);
		this.jpModel = factory.newModel(umlmmMetamodel);
		injector.inject(jpModel, jpModelPath);
		this.jptModel = factory.newModel(umlmmMetamodel);
		injector.inject(jptModel, jptModelPath);
		this.ejtModel = factory.newModel(umlmmMetamodel);
		injector.inject(ejtModel, ejtModelPath);
		this.mcModel = factory.newModel(umlmmMetamodel);
		injector.inject(mcModel, mcModelPath);
		this.uptModel = factory.newModel(umlmmMetamodel);
		injector.inject(uptModel, uptModelPath);
		this.ucdModel = factory.newModel(umlmmMetamodel);
		this.tmModel = factory.newModel(tmmMetamodel);
	}

	/**
	 * Save the output and input/output models.
	 * 
	 * @param ucdModelPath
	 *            the UCD model path
	 * @param tmModelPath
	 *            the TM model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 *
	 * @generated
	 */
	public void saveModels(String ucdModelPath, String tmModelPath) throws ATLCoreException {
		IExtractor extractor = new EMFExtractor();
		extractor.extract(ucdModel, ucdModelPath);
		extractor.extract(tmModel, tmModelPath);
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
	public Object doCodeModel2UMLClassesDiagram(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(cmModel, "CM", "JMM");
		launcher.addInModel(jpModel, "JP", "UMLMM");
		launcher.addInModel(jptModel, "JPT", "UMLMM");
		launcher.addInModel(ejtModel, "EJT", "UMLMM");
		launcher.addInModel(mcModel, "MC", "UMLMM");
		launcher.addInModel(uptModel, "UPT", "UMLMM");
		launcher.addOutModel(ucdModel, "UCD", "UMLMM");
		launcher.addOutModel(tmModel, "TM", "TMM");
		launcher.addLibrary("javaLibrary", getLibraryAsStream("javaLibrary"));
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
		String modulesList = properties.getProperty("CodeModel2UMLClassesDiagram.modules");
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
		return properties.getProperty("CodeModel2UMLClassesDiagram.metamodels." + metamodelName);
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
		return getFileURL(properties.getProperty("CodeModel2UMLClassesDiagram.libraries." + libraryName)).openStream();
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
			if (entry.getKey().toString().startsWith("CodeModel2UMLClassesDiagram.options.")) {
				options.put(entry.getKey().toString().replaceFirst("CodeModel2UMLClassesDiagram.options.", ""), 
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
			URL resourceURL = CodeModel2UMLClassesDiagram.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = CodeModel2UMLClassesDiagram.class.getResource(fileName);
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

/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.resource;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;

/**
 * Resource set implementation for Henshin.
 * Provides some convenience methods for easy use 
 * and supports automatic resolving of relative 
 * file URIs using a base directory.
 * 
 * @author Christian Krause
 */
public class HenshinResourceSet extends ResourceSetImpl {

	/**
	 * Base directory URI converter. If the base directory is set and 
	 * a relative file URI should be converted, then the relative file 
	 * URI is resolved using the base directory.
	 */
	private class BaseDirURIConverter extends ExtensibleURIConverterImpl {
		@Override
		public URI normalize(URI uri) {
			if (uri.isFile() && uri.isRelative() && baseDir!=null) {
				return uri.resolve(baseDir);
			} else {
				return super.normalize(uri);
			}
		}		
	}

	/** 
	 * Absolute file path of the base directory as a file URI.
	 */
	private URI baseDir;

	/**
	 * Constructor which sets the base directory for this resource set.
	 * 
	 * @param baseDir Base directory (can be also <code>null</code>).
	 */
	public HenshinResourceSet(String baseDir) {
		
		// Make sure the standard packages are initialized:
		EcorePackage.eINSTANCE.getName();
		HenshinPackage.eINSTANCE.getName();
		initPackageImplementation("org.eclipse.emf.henshin.trace.TracePackage");
		initPackageImplementation("org.eclipse.emf.henshin.wrap.WrapPackage");
		
		// Register common XMI file resource factories:
		if (!EcorePlugin.IS_ECLIPSE_RUNNING) {
			registerXMIResourceFactories(HenshinResource.FILE_EXTENSION, "ecore", "xmi");
		}
		
		// Set the base directory:
		if (baseDir!=null) {
			baseDir = new File(baseDir).getAbsolutePath();
			if (!baseDir.endsWith(File.separator)) {
				baseDir = baseDir + File.separator;
			}
			this.baseDir = URI.createFileURI(baseDir);
			setURIConverter(new BaseDirURIConverter());
		}
		
	}

	/**
	 * Constructor without base directory.
	 */
	public HenshinResourceSet() {
		this(null);
	}

	/**
	 * Get the base directory for this resource set as a file URI.
	 * 
	 * @return The base directory as a file URI or <code>null</code>.
	 */
	public URI getBaseDir() {
		return baseDir;
	}
	
	/**
	 * Register {@link XMIResourceFactoryImpl}s for the given file extensions.
	 * The factories are registered in the scope of this resource set. The 
	 * resource factories are registered only if no other resource factory
	 * is already registered for the file extension.
	 * 
	 * @param fileExtension File extensions.
	 */
	public void registerXMIResourceFactories(String... fileExtensions) {
		Map<String, Object> map = getResourceFactoryRegistry().getExtensionToFactoryMap();
		for (String extension : fileExtensions) {
			Resource.Factory factory;
			if (HenshinResource.FILE_EXTENSION.equals(extension)) {
				factory = new HenshinResourceFactory();
			} else if ("ecore".equals(extension)) {
				factory = new EcoreResourceFactoryImpl();
			} else {
				factory = new XMIResourceFactoryImpl();
			}
			if (!map.containsKey(extension)) {
				map.put(extension, factory);
			}
		}
	}

	/**
	 * Load {@link EPackage}s from an Ecore file and
	 * register them in the local package registry.
	 * 
	 * @param ecorePath The relative path to an Ecore file.
	 * @return List of loaded and registered {@link EPackage}s.
	 */
	public List<EPackage> registerDynamicEPackages(String ecorePath) {
		List<EPackage> result = new ArrayList<EPackage>();
		try {
			Resource resource = getResource(ecorePath);
			Iterator<EObject> it = resource.getAllContents();
			while (it.hasNext()) {
				EObject next = it.next();
				if (next instanceof EPackage) {
					result.add((EPackage) next);
					getPackageRegistry().put(((EPackage) next).getNsURI(), next);
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Try to initialize a generated package implementation. Note that
	 * this has a global effect (not limited to this resource set).
	 * 
	 * @param packageClassName Class name of the (interface) of a package implementation.
	 * @return <code>true</code> if the package was successfully initialized.
	 */
	public boolean initPackageImplementation(String packageClassName) {
		try {
			Class<?> clazz = Class.forName(packageClassName);
			return (clazz!=null && clazz.getField("eINSTANCE").get(clazz)!=null);
		} catch (Throwable t) {
			return false;
		}
	}
	
	/**
	 * Load a resource for the given (relative) path and file name. 
	 * If the path is relative, it will be resolved using the base 
	 * directory of this resource set.
	 * 
	 * @param path Possible relative model path.
	 * @return The loaded resource.
	 */
	public Resource getResource(String path) {
		return getResource(URI.createFileURI(path), true);
	}

	/**
	 * Create a resource for a given path.
	 * @see #getResource(String)
	 * @see #createResource(URI)
	 * @param path Possible relative model path.
	 * @return The created resource.
	 */
	public Resource createResource(String path) {
		return createResource(URI.createFileURI(path));
	}
	
	/**
	 * Load a resource for the given file name and get the first
	 * {@link EObject} contained in it. If the path is relative, 
	 * it will be resolved using the base directory of this resource set.
	 * 
	 * @param path Possible relative path and file name.
	 * @return The first contained object.
	 */
	public EObject getEObject(String path) {
		Resource resource = getResource(path);
		if (resource!=null && !resource.getContents().isEmpty()) {
			return resource.getContents().get(0);
		}
		return null;
	}

	/**
	 * Load a {@link Module} from a Henshin file given as a 
	 * path and file name. If the path is relative, it will be 
	 * resolved using the base directory of this resource set.
	 * The behavior is as in {@link #getModule(URI, boolean)}.
	 * 
	 * @see #getModule(URI, boolean)
	 * @param path Possibly relative path to a Henshin file.
	 * @param fixImports If <code>true</code>, tries to fix the imports of the loaded module (default is <code>false</code>).
	 * @return The contained {@link Module}.
	 */
	public Module getModule(String path, boolean fixImports) {
		return getModule(URI.createFileURI(path), fixImports);
	}

	/**
	 * <p>
	 * Load a {@link Module} from a Henshin file given by a URI. 
	 * </p>
	 * <p>
	 * If <code>fixImports</code> is set to <code>true</code>, 
	 * the method will try to fix broken imports of the module.
	 * Specifically, it will check for every imported package
	 * of the module, if a another package with the same namespace
	 * URI is registered in the local package registry of this
	 * resource. If yes, all references to elements of this package
	 * in the module will be replaced by the found package.
	 * </p>
	 * <p>
	 * If you want to fix the imports, you should first load the
	 * instance models to be transformed, and then call this method.
	 * </p>
	 * 
	 * @param path Possible relative path and file name of a Henshin resource.
	 * @param fixImports If <code>true</code>, tries to fix the imports of the loaded module (default is <code>false</code>).
	 * @return The contained {@link Module}.
	 */
	public Module getModule(URI uri, boolean fixImports) {
		
		// Try to load the module:
		Module module = null;
		Resource resource = getResource(uri, true);
		if (resource!=null) {
			for (EObject object : resource.getContents()) {
				if (object instanceof Module) {
					module = (Module) object;
					break;
				}
			}
		}
		
		// Fix imports?
		if (module!=null && fixImports) {
			Iterator<EObject> it = module.eAllContents();
			while (it.hasNext()) {
				EObject obj = it.next();
				if (obj instanceof Node) {  // nodes
					Node n = (Node) obj;
					EPackage real = getRealEPackage(n.getType().getEPackage());
					if (real!=null) {
						n.setType((EClass) real.getEClassifier(n.getType().getName()));
					}
				}
				else if (obj instanceof Edge) {  // edges
					Edge e = (Edge) obj;
					EPackage real = getRealEPackage(e.getType().getEContainingClass().getEPackage());
					if (real!=null) {
						EClass owner = (EClass) real.getEClassifier(e.getType().getEContainingClass().getName());
						e.setType((EReference) owner.getEStructuralFeature(e.getType().getName()));
					}
				}
				else if (obj instanceof Attribute) {  // attributes
					Attribute a = (Attribute) obj;
					EPackage real = getRealEPackage(a.getType().getEContainingClass().getEPackage());
					if (real!=null) {
						EClass owner = (EClass) real.getEClassifier(a.getType().getEContainingClass().getName());
						a.setType((EAttribute) owner.getEStructuralFeature(a.getType().getName()));
					}
				}
			}
		}
		return module;
	}

	/**
	 * Load a {@link Module} from a Henshin file given as a 
	 * path and file name. If the path is relative, it will be 
	 * resolved using the base directory of this resource set.
	 * This does not fix imports.
	 * 
	 * @see #getModule(String, boolean)
	 * @param path Possibly relative path to a Henshin file.
	 * @return The contained {@link Module}.
	 */
	public Module getModule(String path) {
		return getModule(path, false);
	}

	/**
	 * Get the real package that should be used. This checks whether there is
	 * a different {@link EPackage} registered in this resource set's package registry
	 * under the same namespace URI as the given used package. If yes, this package
	 * will be returned, otherwise <code>null</code>.
	 * 
	 * @param usedPackage The used package in a module.
	 * @return The correct package or <code>null</code>.
	 */
	private EPackage getRealEPackage(EPackage usedPackage) {
		EPackage realPackage = getPackageRegistry().getEPackage(usedPackage.getNsURI());
		if (realPackage!=null && realPackage!=usedPackage) {
			return realPackage;
		}
		return null;
	}

	/**
	 * Save an {@link EObject} at a given path. This creates a new resource
	 * under the given path, adds the object to the resource and saves it.
	 * This delegates to {@link #saveEObject(EObject, URI)}.
	 * 
	 * @param object {@link EObject} to be saved.
	 * @param path Possibly relative file path.
	 */
	public void saveEObject(EObject object, String path) {
		saveEObject(object, URI.createFileURI(path));
	}

	/**
	 * Save an {@link EObject} at a given URI. This creates a new resource
	 * under the given path, adds the object to the resource and saves it.
	 * 
	 * @param object {@link EObject} to be saved.
	 * @param uri URI pointing to the file where the object should be saved.
	 */
	public void saveEObject(EObject object, URI uri) {
		Resource resource = createResource(uri);
		resource.getContents().clear();
		resource.getContents().add(object);		
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		try {
			resource.save(options);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}

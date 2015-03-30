package org.modelexecution.fumldebug.debugger.uml;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.modelexecution.fuml.convert.ConverterRegistry;
import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fuml.convert.IConverter;

public class UMLModelLoader {
	
	private static final ConverterRegistry converterRegistry = ConverterRegistry.getInstance();
	private static final String PLATFORM_RESOURCE = "platform:/resource";
	private static final String PLATFORM_PLUGIN = "platform:/plugin";

	private String modelPath;
	private ResourceSet resourceSet;
	private Resource umlResource;

	private IConversionResult conversionResult;

	public UMLModelLoader() {
		resourceSet = createResourceSet();
	}
	
	private void reset() {
		umlResource = null; 
	}
	
	public UMLModelLoader setModel(String modelPath) {
		if(!modelPath.equals(this.modelPath))
			reset();
		this.modelPath = modelPath;
		return this;
	}
	
	protected ResourceSet createResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", UMLResource.Factory.INSTANCE); //$NON-NLS-1$
		return resourceSet;		
	}

	public UMLModelLoader loadModel() {
		if(isLoaded())
			return this;		
		if(modelPath.contains(PLATFORM_RESOURCE))
			umlResource = resourceSet.getResource(getResourceURI(modelPath), true);
		else if(modelPath.contains(PLATFORM_PLUGIN))
			umlResource = resourceSet.getResource(getPluginURI(modelPath), true);
		else
			umlResource = resourceSet.getResource(getFileURI(modelPath), true);
		EcoreUtil.resolveAll(resourceSet);
		return this;
	}

	public boolean isLoaded() {
		return umlResource != null;
	}
	
	private URI getResourceURI(String path) {
		return URI.createPlatformResourceURI(path.replace(PLATFORM_RESOURCE, ""), true);
	}

	private URI getFileURI(String path) {
		return URI.createFileURI(new File(path).getAbsolutePath());
	}
	
	private URI getPluginURI(String path) {
		return URI.createPlatformPluginURI(path.replace(PLATFORM_PLUGIN, ""), true);
	}
	
	private IConverter getConverter(NamedElement namedElement) {
		return converterRegistry.getConverter(namedElement);
	}

	private IConversionResult convertResource() {		
		NamedElement namedElement = obtainFirstNamedElement();
		IConverter converter = getConverter(namedElement);
		return converter.convert(namedElement);
	}

	public NamedElement obtainFirstNamedElement() {
		if(!isLoaded())
			loadModel();
		for(EObject eObject : getUMLModelResource().getContents()) {
			if(eObject instanceof NamedElement) {
				return (NamedElement)eObject;
			}
		}
		return null;
	}

	public String getModelPath() {
		return this.modelPath;
	}
	
	public Resource getUMLModelResource() {
		return umlResource;
	}

	public IConversionResult getConversionResult() {
		if(conversionResult == null)
			conversionResult = convertResource();
		return conversionResult;
	}
}

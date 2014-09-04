/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.loader;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Namespace;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage;

/**
 * @author pneubaue
 *
 */
public class WSMigrationTraceHandler {

	private static final String MODEL_FILE_EXTENSION = "xmi";
	private ResourceSet resSet;
	private List<Namespace> namespaceList = new ArrayList<Namespace>();
	private List<SourceElement> sourceElementList = new ArrayList<SourceElement>();
	private List<TargetElement> targetElementList = new ArrayList<TargetElement>();	
	
	public WSMigrationTraceHandler(String model) throws Exception {				
		Resource resource = loadModel(model);
		
		TreeIterator<EObject> treeIt = resource.getAllContents();
	    while (treeIt.hasNext()){
	    	EObject next = treeIt.next();
	    	if (next.eClass().getName().equals("SourceElement")){
	    		sourceElementList.add((SourceElement) next);
	    	} else if (next.eClass().getName().equals("TargetElement")){
	    		targetElementList.add((TargetElement) next);
	    	} else if (next.eClass().getName().equals("Namespace")){
	    		namespaceList.add((Namespace) next);
	    	}
	    }
	}
	
	private static Resource loadModel(String model) throws Exception {
		WsmigrationtracePackage.eINSTANCE.eClass();
		   
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put(MODEL_FILE_EXTENSION, new XMIResourceFactoryImpl());

	    ResourceSet resSet = new ResourceSetImpl();
	    Resource resource = null;
	    try {
	    	resource = resSet.getResource(URI.createURI(model), true);
	    } catch (Exception e) {
	    	throw new Exception("Failed to load model (" + model + ").");
	    }
		return resource;
	}
	
	@SuppressWarnings("unused")
	private ResourceSet createResourceSet() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put(MODEL_FILE_EXTENSION, new XMIResourceFactoryImpl());

	    ResourceSet resSet = new ResourceSetImpl();
		return resSet;
	}
	
	/*
	 *  This method is a helper method to prepare the loading of a model from XMI
	 * 
	 */
	private ResourceSet createResourceSet(String pathEcoreMMFile) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new EcoreResourceFactoryImpl());
		
		Resource metamodel = resSet.getResource(URI.createURI(pathEcoreMMFile), true);
		
		EPackage ep0 = (EPackage) metamodel.getContents().get(0); 
		resSet.getPackageRegistry().put(ep0.getNsURI(), ep0);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
		(MODEL_FILE_EXTENSION, new XMIResourceFactoryImpl(){ public Resource createResource(URI uri)
		{   XMIResource xmiResource = new XMIResourceImpl(uri);
			return xmiResource;
		} });
		return resSet;
	}
	
	/*
	 *  Load a model based on its metamodel
	 * 
	 */
	@SuppressWarnings("unused")
	private Resource loadModel(String model, String metamodel) {
		ResourceSet resSet = this.createResourceSet(metamodel);
		Resource resource = resSet.getResource(
				URI.createFileURI(new File(model).getAbsolutePath()), true);		
		return resource;	
	}
	
	/**
	 * Retrieves a list of target elements that correspond to a given source element.
	 * 
	 * @param sourceElement source element used to find corresponding target elements for
	 * @return a list of target elements that correspond to a given source element 
	 */
	public List<TargetElement> getTargetElements(SourceElement sourceElement) {
		List<TargetElement> targetElements = new ArrayList<TargetElement>();
		for (SourceElement containedSourceElement : sourceElementList) {
			if (sourceElement.equals(containedSourceElement)) {
				targetElements.addAll(containedSourceElement.getTargetElement());
			}
		}
		return targetElements;
	}// getTargetElements
	
	/**
	 * Retrieves a list of source elements that correspond to a given target element.
	 * 
	 * @param targetElement target element used to find corresponding source elements for
	 * @return a list of source elements that correspond to a given target element
	 */
	public List<SourceElement> getSourceElements(TargetElement targetElement) {
		List<SourceElement> sourceElements = new ArrayList<SourceElement>();
		for (SourceElement sourceElement : sourceElementList) {
			for (TargetElement matchingTargetElement : sourceElement.getTargetElement()) {
				if (targetElement.equals(matchingTargetElement)) {
					sourceElements.add(sourceElement);
				}
			}
		}
		return sourceElements;
	}// getSourceElements
	
	public MultiMap<SourceElement, SourceParameter> getSourceParameters(TargetElement targetElement, TargetParameter targetParameter) {
		MultiMap<SourceElement, SourceParameter> sourceMultiMap = new MultiValueMap<>();
		
		for (SourceElement sourceElement : getSourceElements(targetElement)) {
			for (SourceParameter sourceParameter : sourceElement.getParameters()) {
				
				for (TargetParameter matchingTargetParameter : sourceParameter.getTargetParameter()) {
					if (targetParameter.equals(matchingTargetParameter)) {
						sourceMultiMap.put(sourceElement, sourceParameter);						
					}
				}
				
			}
		}
		return sourceMultiMap;
	}// getSourceParameters
	
	/**
	 * Retrieves a multi value list of target elements and target parameters corresponding to a given source element and source parameter
	 * 
	 * @param sourceElement source element used to find corresponding target elements for
	 * @param sourceParameter source parameter used to find corresponding target parameters for
	 * @return a multi value list of target elements and target parameters corresponding to a given source element and source parameter
	 */
	public MultiMap<TargetElement, TargetParameter> getTargetParameters(SourceElement sourceElement, SourceParameter sourceParameter) {	
		MultiMap<TargetElement, TargetParameter> targetMultiMap = new MultiValueMap<TargetElement, TargetParameter>();
		
		for (TargetParameter targetParameter : sourceParameter.getTargetParameter()) {
			for (TargetElement targetElement : getTargetElements(sourceElement)) {
				
				for (TargetParameter matchingTargetParameter : targetElement.getParameters()) {
					if(targetParameter.equals(matchingTargetParameter)) {
						targetMultiMap.put(targetElement, targetParameter);
					}
				}
				
			}
		}		
		return targetMultiMap;
	}// getTargetParameters	
	
//	/**
//	 * Retrieves the target element based on it's namespace URI, element name, and list of parameter names
//	 * 
//	 * @param namespaceUri namespace URI to look for in the target element
//	 * @param elementName element name to look for in the target element
//	 * @param parameterNames list of parameter names to look for in the target element
//	 * @return target element based on it's element name and list of parameter names
//	 */
//	public TargetElement getTargetElement(String namespaceUri, String elementName, Map<String, String> parameterNames) {
//		for (TargetElement targetElementInList : targetElementList) {
//			if (targetElementInList.getElementName().equals(elementName)) {
//				if (targetElementInList.getElementNamespace() != null && !targetElementInList.getElementNamespace().getNamespaceURI().equals(namespaceUri)) {
//					break; // wrong namespace -> skip
//				} else {					
//					for (TargetParameter targetParameter : targetElementInList.getParameters()) {
//						if ( !parameterNames.containsKey(targetParameter.getParameterName()) ) {
//							return null; // not equal
//						}
//					}
//					return targetElementInList; // correct target element found
//				}
//			}
//		}
//		return null;
//	}// getTargetElement
	
	/**
	 * Retrieves the target element based on it's namespace URI, element name, and list of parameter names
	 * 
	 * @param namespaceUri namespace URI to look for in the target element
	 * @param elementName element name to look for in the target element
	 * @param parameterNameValueMap list of parameter names to look for in the target element
	 * @return target element based on it's element name and list of parameter names
	 */
	public TargetElement getTargetElement(String namespaceUri, String elementName, Map<String, String> parameterNameValueMap) {
		for (TargetElement targetElementInList : targetElementList) {
			if (targetElementInList.getElementName().equals(elementName)) {
				if (targetElementInList.getElementNamespace() != null && !targetElementInList.getElementNamespace().getNamespaceURI().equals(namespaceUri)) {
					break; // wrong namespace -> skip
				} else {					
					// same element name, check if single parameter that itself has children (and hence its value is null) matches based on name
					if (parameterNameValueMap.size()==1 && parameterNameValueMap.values().toArray()[0]==null) {
						String singleParameterName = (String) parameterNameValueMap.keySet().toArray()[0];
						TargetElement singleChild = (TargetElement) targetElementInList.getChildTargetElement().toArray()[0];
						if (singleChild.getElementName().equals(singleParameterName)) {
							// assume that the correct target element in list has been found
							return targetElementInList;
						}
					}
					
					// same element name, check for same parameter names in children
					for (TargetElement childTargetElement : targetElementInList.getChildTargetElement()) {
						// child source element exists, check for parameter matching there						
						int equalNamedParametersFound = 0;
						for (TargetParameter childTargetElementParameter : childTargetElement.getParameters()) {
							if ( parameterNameValueMap.containsKey(childTargetElementParameter.getParameterName()) ) {
								equalNamedParametersFound++;
							}							
						}
						if (equalNamedParametersFound == parameterNameValueMap.keySet().size()) {
							// assume that the correct target element in list has been found
							return targetElementInList;
						}
					}
					
					// same element name, check for same parameter names
					int equalNamedParametersFound = 0;
					for (String parameterName : parameterNameValueMap.keySet()) {
						for (TargetParameter targetParameter : targetElementInList.getParameters()) {
							if ( parameterName.equals(targetParameter.getParameterName()) ) {
								equalNamedParametersFound++;
							}
						}					
					}		
					if (equalNamedParametersFound == parameterNameValueMap.keySet().size()) {
						// assume that the correct source element in list has been found (found parameters must be a subset of given parameters)
						return targetElementInList;
					}
				}
			}
		}
		return null;
	}// getTargetElement
	
	/**
	 * Retrieves the source element based on it's namespace URI, element name, and list of parameter names
	 * 
	 * @param namespaceUri namespace URI to look for in the target element
	 * @param elementName element name to look for in the target element
	 * @param parameterNameValueMap map of parameter names and values to look for their name in the target element
	 * @return source element based on it's element name and list of parameter names
	 * @throws Exception 
	 */
	public SourceElement getSourceElement(String namespaceUri, String elementName, Map<String, String> parameterNameValueMap) throws Exception {
		for (SourceElement sourceElementInList : sourceElementList) {
			if (sourceElementInList.getElementName().equals(elementName)) {
				if (sourceElementInList.getElementNamespace() != null && !sourceElementInList.getElementNamespace().getNamespaceURI().equals(namespaceUri)) {
					break; // wrong namespace -> skip
				} else {
					// same element name, check if single parameter that itself has children (and hence its value is null) matches based on name
					if (parameterNameValueMap.size()==1 && parameterNameValueMap.values().toArray()[0]==null) {
						String singleParameterName = (String) parameterNameValueMap.keySet().toArray()[0];
						SourceElement singleChild = (SourceElement) sourceElementInList.getChildSourceElement().toArray()[0];
						if (singleChild.getElementName().equals(singleParameterName)) {
							// assume that the correct source element in list has been found
							return sourceElementInList;
						}
					}
					
					// same element name, check for same parameter names in children
					for (SourceElement childSourceElement : sourceElementInList.getChildSourceElement()) {
						// child source element exists, check for parameter matching there						
						int equalNamedParametersFound = 0;
						for (SourceParameter childSourceElementParameter : childSourceElement.getParameters()) {
							if ( parameterNameValueMap.containsKey(childSourceElementParameter.getParameterName()) ) {
								equalNamedParametersFound++;
							}							
						}
						if (equalNamedParametersFound == parameterNameValueMap.keySet().size()) {
							// assume that the correct source element in list has been found
							return sourceElementInList;
						}
					}
					
					// same element name, check for same parameter names
					int equalNamedParametersFound = 0;
					for (String parameterName : parameterNameValueMap.keySet()) {
						for (SourceParameter sourceParameter : sourceElementInList.getParameters()) {
							if ( parameterName.equals(sourceParameter.getParameterName()) ) {
								equalNamedParametersFound++;
							}
						}					
					}		
					if (equalNamedParametersFound == parameterNameValueMap.keySet().size()) {
						// assume that the correct source element in list has been found
						return sourceElementInList;
					}
				}
			}			
		}
		throw new Exception("Could not find matching SourceElement for element name " + elementName);
	}// getSourceElement
		
	public static void main(String[] args) throws Exception {
		
		WSMigrationTraceHandler loader = new WSMigrationTraceHandler("models/wsTraceExample.xmi");
		
		System.out.println(".. From source to target ...");

		SourceElement sourceElement = loader.sourceElementList.get(1);
		SourceParameter sourceParameter = sourceElement.getParameters().get(0);
		List<TargetElement> targetElementList = loader.getTargetElements(sourceElement);
		MultiMap<TargetElement, TargetParameter> targetMultiMap = loader.getTargetParameters(sourceElement, sourceParameter);
		
		System.out.println("sourceElement = " + sourceElement);
		System.out.println("sourceParameter = " + sourceParameter);		
		System.out.println("targetElementList = " + targetElementList);
		System.out.println("targetMultiMap = " + targetMultiMap);
		
		for (TargetElement targetElement : targetMultiMap.keySet()) {
			System.out.println("-----------");
			System.out.println("targetElement name = " + targetElement.getElementName());
			System.out.println("targetParameter = " + targetMultiMap.get(targetElement));
		}
		
		// -----------------
		
		System.out.println(".. From target to source ...");
		
		TargetElement targetElement = loader.targetElementList.get(3);
		TargetParameter targetParameter = targetElement.getParameters().get(0);
		List<SourceElement> sourceElementList = loader.getSourceElements(targetElement);
		MultiMap<SourceElement, SourceParameter> sourceMultiMap = loader.getSourceParameters(targetElement, targetParameter);
		
		System.out.println("targetElement = " + targetElement);
		System.out.println("targetParameter = " + targetParameter);		
		System.out.println("sourceElementList = " + sourceElementList);
		System.out.println("sourceMultiMap = " + sourceMultiMap);
		
		for (SourceElement sourceElement1 : sourceMultiMap.keySet()) {
			System.out.println("-----------");
			System.out.println("sourceElement name = " + sourceElement1.getElementName());
			System.out.println("sourceParameter = " + sourceMultiMap.get(sourceElement1));
		}
		
	}
	
}

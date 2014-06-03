/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.eval.util;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.naming.QualifiedName;

import eu.artist.postmigration.nfrvt.lang.common.ARTISTQualifiedNameProvider;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage;

public class MigrationResourceUtil {
//	public static URI ECORE_PRIMITIVE_TYPES = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
//	public static URI UML_PRIMITIVE_TYPES = URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI);
//	public static URI JAVA_PRIMITIVE_TYPES = URI.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI);
//	public static URI XML_PRIMITIVE_TYPES = URI.createURI(UMLResource.XML_PRIMITIVE_TYPES_LIBRARY_URI);
//	public static URI MARTE_LIBRARY = URI.createURI("pathmap://Papyrus_LIBRARIES/MARTE_Library.library.uml");
	
	private static ARTISTQualifiedNameProvider provider = new ARTISTQualifiedNameProvider();
	
	public static ResourceSet init(ResourceSet resourceSet) {
		if(resourceSet != null) {		
			EPackage.Registry packageRegistry = EPackage.Registry.INSTANCE;
			if(packageRegistry.get(NslPackage.eNS_URI) == null)
				packageRegistry.put(NslPackage.eNS_URI, NslPackage.eINSTANCE);
			if(packageRegistry.get(TslPackage.eNS_URI) == null)
				packageRegistry.put(TslPackage.eNS_URI, TslPackage.eINSTANCE);
			if(packageRegistry.get(EslPackage.eNS_URI) == null)
				packageRegistry.put(EslPackage.eNS_URI, EslPackage.eINSTANCE);
			if(packageRegistry.get(GmlPackage.eNS_URI) == null)
				packageRegistry.put(GmlPackage.eNS_URI, GmlPackage.eINSTANCE);
			if(packageRegistry.get(GelPackage.eNS_URI) == null)
				packageRegistry.put(GelPackage.eNS_URI, GelPackage.eINSTANCE);
		}
		return resourceSet;
	}
	
	public static Diagnostic validateResource(Resource resource) {
		return Diagnostician.INSTANCE.validate(resource.getContents().get(0));
	}
	
	public static URI getPlatformResourceURI(String uriString) {
		URI uri = URI.createURI(uriString);
		if(uri.isPlatformResource())
			return uri;
		if(uri.isPlatformPlugin() || uri.isPlatform())
			return URI.createPlatformResourceURI(uri.toPlatformString(true), true);
		String newUriString = uriString;
		if(!uriString.startsWith("/"))
			newUriString = "/" + newUriString;
		return URI.createPlatformResourceURI(newUriString, true);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T findByFeatureValue(EObject root, EStructuralFeature feature, Object value) {
		if(root == null || feature == null || value == null)
			return null;
		Object featureValue = root.eGet(feature);
		if(featureValue != null && featureValue.equals(value))
			return (T) root;
		
		TreeIterator<EObject> contents = root.eAllContents();
		EObject cur;
		while(contents.hasNext()) {
			cur = contents.next();
			featureValue = cur.eGet(feature);
			if(featureValue != null && featureValue.equals(value))
				return (T) cur;
		}
		return null;
	}
	
	public static String getGoalModelFileExtension() {
		return GmlPackage.eNS_PREFIX;
	}
	
	public static String getEvaluationFileExtension() {
		return GelPackage.eNS_PREFIX;
	}
	
	public static boolean isGoalModel(String uriString) {
		return uriString.endsWith(getGoalModelFileExtension());
	}
	
	public static boolean isEvaluation(String uriString) {
		return uriString.endsWith(getEvaluationFileExtension());
	}
	
	public static String getFullyQualifiedName(EObject obj) {
		QualifiedName fqn = provider.getFullyQualifiedName(obj);
		return fqn == null ? null : fqn.toString();
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T findByFullyQualifiedName(EObject root, String fqn) {
		if(fqn == null || root == null)
			return null;
		if(fqn.equals(getFullyQualifiedName(root)))
			return (T)root;
		
		TreeIterator<EObject> contents = root.eAllContents();
		EObject cur;
		String curFQN;
		while(contents.hasNext()) {
			cur = contents.next();
			curFQN = getFullyQualifiedName(cur);
			if(curFQN != null && fqn.equals(curFQN))
				return (T)cur;
		}
		return null;
	}
}

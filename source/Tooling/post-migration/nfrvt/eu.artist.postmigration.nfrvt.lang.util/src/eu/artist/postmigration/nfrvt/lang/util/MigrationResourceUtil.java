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
package eu.artist.postmigration.nfrvt.lang.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtext.naming.QualifiedName;

import eu.artist.postmigration.nfrvt.lang.common.ARTISTQualifiedNameProvider;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.validation.GMLValidator;
import eu.artist.postmigration.nfrvt.lang.util.selector.MigrationModelSelector;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.ClassQuery;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.FQNQuery;

/**
 * This class contains static methods that support the handling of ARTIST
 * migration models.
 * 
 * @author Martin Fleck
 *
 */
public class MigrationResourceUtil {	
	private static ARTISTQualifiedNameProvider provider = new ARTISTQualifiedNameProvider();
	public static final String XTEXT_DELIMITER = ".";
	public static final String XTEXT_WILDCARD = "*";
	public static final String UML_DELIMITER = "::";
	
	/**
	 * Initializes a resource set to be usable with the ARTIST migration 
	 * languages. This method registers and initializes all necessary 
	 * packages.
	 * 
	 * @param resourceSet the resource set to be initialized
	 * @return the given resource set
	 */
	public static ResourceSet init(ResourceSet resourceSet) {
		if(resourceSet != null && !Platform.isRunning())
			MigrationStandaloneSetup.doSetup();
		return resourceSet;
	}
	
	/**
	 * Validates the semantic of the given object as implemented by the 
	 * respective {@link EValidator} in the {@link EValidator.Registry}.
	 * For example, a {@link GoalModel} would be validated with the
	 * {@link GMLValidator}.
	 * <p/>
	 * Important: To validate the given object, the object must be saved in a 
	 * resource!
	 * 
	 * @param object object to be validated
	 * @return info about the validation
	 * 
	 * @see Diagnostician
	 * @see EValidator
	 */
	public static DiagnosticInfo validateSemantic(EObject object) {
		if(object == null)
			return new DiagnosticInfo(null);
		if(object.eResource() == null) {
			System.err.println("Warning: To validate " + object + " it must be saved as resource before.");
			return new DiagnosticInfo(null);
		}
		Diagnostic diagnostic = null;
		try {
			diagnostic = Diagnostician.INSTANCE.validate(object);
		} catch(Throwable t) {
			diagnostic = BasicDiagnostic.toDiagnostic(t);
		}
		return new DiagnosticInfo(diagnostic);		
	}
	
	/**
	 * Validates the semantic of the given resources root object as implemented
	 * by the respective {@link EValidator} in the {@link EValidator.Registry}.
	 * For example, a {@link GoalModel} would be validated with the
	 * {@link GMLValidator}.
	 * 
	 * @param resource resource holding the root object to be validated
	 * @return info about the validation
	 * 
	 * @see Diagnostician
	 * @see EValidator
	 */
	public static DiagnosticInfo validateSemantic(Resource resource) {
		return validateSemantic(resource.getContents().get(0));
	}
	
	/**
	 * Creates a new platform resource {@link URI} based on the given 
	 * uriString by trying to bring the uriString into the necessary
	 * format. Platform resource uris are used to identify a resource
	 * located in the workspace.
	 * 
	 * @param uriString string to be converted into a platform resource uri
	 * @return platform resource uri
	 * 
	 * @see URI#createPlatformResourceURI(String)
	 * @see URI#createPlatformResourceURI(String, boolean)
	 */
	public static URI getPlatformResourceURI(String uriString) {
		URI uri = URI.createURI(uriString);
		if(uriString.startsWith("pathmap://"))
			return uri;
		if(uri.isPlatformResource())
			return uri;
		if(uri.isPlatformPlugin() || uri.isPlatform())
			return URI.createPlatformResourceURI(uri.toPlatformString(true), true);
		String newUriString = uriString;
		if(!uriString.startsWith("/"))
			newUriString = "/" + newUriString;
		return URI.createPlatformResourceURI(newUriString, true);
	}
	
	/**
	 * Returns the first object contained in root that has the given feature 
	 * with the given value. If no such element is found, null is returned.
	 * <p/>
	 * For finding elements by name or by class, please use the other methods
	 * of this class.
	 * 
	 * @param root root object
	 * @param feature feature to look for
	 * @param value value the feature must have
	 * @return element with the given value in the given feature or null
	 */
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
	
//	/**
//	 * Returns the file extensions used for {@link GoalModel} resources.
//	 * @return file extensions used for {@link GoalModel} resources
//	 */
//	public static String getGoalModelFileExtension() {
//		return GmlPackage.eNS_PREFIX;
//	}
//	
//	/**
//	 * Returns the file extensions used for {@link MigrationEvaluation} 
//	 * resources.
//	 * @return file extensions used for {@link MigrationEvaluation} resources
//	 */
//	public static String getEvaluationFileExtension() {
//		return GelPackage.eNS_PREFIX;
//	}
//	
//	/**
//	 * Returns true if the given uriString refers to a {@link GoalModel}. This
//	 * is true if the uriString ends with the respective file extension.
//	 * 
//	 * @param uriString uri string to be checked
//	 * @return true if the uri refers to a goal model, false otherwise
//	 * @see #getGoalModelFileExtension()
//	 */
//	public static boolean isGoalModel(String uriString) {
//		return uriString.endsWith(getGoalModelFileExtension());
//	}
//	
//	/**
//	 * Returns true if the given uriString refers to a 
//	 * {@link MigrationEvaluation}. This is true if the uriString ends with 
//	 * the respective file extension.
//	 * 
//	 * @param uriString uri string to be checked
//	 * @return true if the uri refers to a goal model, false otherwise
//	 * @see #getEvaluationFileExtension()
//	 */
//	public static boolean isEvaluation(String uriString) {
//		return uriString.endsWith(getEvaluationFileExtension());
//	}
	
	/**
	 * Returns the fully qualified name of the given object in the Xtext 
	 * format, i.e., using '.' as delimiter, or null if the name can not
	 * be determined.
	 * <p/>
	 * Example: org.eclipse.emf.ecore.EObject
	 * 
	 * @param obj object for which the qualified name should be returned or
	 * null if the name can not be determined
	 * @return the fully qualified name of the given object
	 * 
	 * @see QualifiedName
	 * @see UML2Util#getQualifiedName(ENamedElement, String)
	 */
	public static String getFullyQualifiedName(EObject obj) {
		if(obj == null)
			return null;
		if(obj instanceof ENamedElement)
			return UML2Util.getQualifiedName((ENamedElement) obj, XTEXT_DELIMITER);
		QualifiedName fqn = provider.getFullyQualifiedName(obj);
		return fqn == null ? null : fqn.toString();
	}
	
	/**
	 * Returns the fully qualified name with the wildcard (*) of the given 
	 * object in the Xtext format, i.e., using '.' as delimiter. If the name
	 * can not be determined, null is returned.
	 * <p/>
	 * Example: eu.artist.postmigration.nfrvt.&#42;
	 * 
	 * @param obj object for which the qualified name should be returned or
	 * null if the name can not be determined
	 * @return the fully qualified name with wildcard of the given object
	 * 
	 * @see #getFullyQualifiedName(EObject)
	 */
	public static String getFullyQualifiedNameWithWildcard(EObject obj) {
		String fqn = getFullyQualifiedName(obj);
		if(fqn == null)
			return null;
		if(!fqn.endsWith(XTEXT_DELIMITER))
			return fqn + XTEXT_DELIMITER + XTEXT_WILDCARD;
		else
			return fqn + XTEXT_WILDCARD;
	}
	
	/**
	 * Returns the first element contained in the resource set that has the 
	 * given fully qualified name or null if no such element is found.
	 * <p/>
	 * Note: This methods iterates over all resources, which might take quite 
	 * long. If you know the resource, you can also use 
	 * {@link #findByFullyQualifiedName(Resource, String)}.
	 * 
	 * 
	 * @param set resource set in which to search
	 * @param fqn fully qualified name of the element
	 * @return element with the given fully qualified name or null
	 * 
	 * @see #getFullyQualifiedName(EObject)
	 * @deprecated use {@link MigrationModelSelector#selectFirst(MigrationResourceSet, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link FQNQuery}
	 */
	public static <T extends EObject> T findByFullyQualifiedName(MigrationResourceSet set, String fqn) {
		return findByFullyQualifiedName(set.getResourceSet(), fqn);
	}
	
	/**
	 * Returns the first element contained in the resource set that has the 
	 * given fully qualified name or null if no such element is found.
	 * <p/>
	 * Note: This methods iterates over all resources, which might take quite 
	 * long. If you know the resource, you can also use 
	 * {@link #findByFullyQualifiedName(Resource, String)}.
	 * 
	 * 
	 * @param set resource set in which to search
	 * @param fqn fully qualified name of the element
	 * @return element with the given fully qualified name or null
	 * 
	 * @see #getFullyQualifiedName(EObject)
	 * @deprecated use {@link MigrationModelSelector#selectFirst(ResourceSet, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link FQNQuery}
	 */
	public static <T extends EObject> T findByFullyQualifiedName(ResourceSet set, String fqn) {
		T found = null;
		for(Resource res : set.getResources()) {
			found = findByFullyQualifiedName(res, fqn);
			if(found != null)
				return found;
		}
		return null;
	}
	
	/**
	 * Returns the first element contained in the resource that has the given 
	 * fully qualified name or null if no such element is found.
	 * 
	 * @param res resource in which to search
	 * @param fqn fully qualified name of the element
	 * @return element with the given fully qualified name or null
	 * 
	 * @see #getFullyQualifiedName(EObject)
	 * @deprecated use {@link MigrationModelSelector#selectFirst(Resource, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link FQNQuery}
	 */
	public static <T extends EObject> T findByFullyQualifiedName(Resource res, String fqn) {
		if(res == null || res.getContents().isEmpty())
			return null;
		return findByFullyQualifiedName(res.getContents().get(0), fqn);
	}
	
	/**
	 * Returns the first element contained in root that has the given fully
	 * qualified name or null if no such element is found.
	 * 
	 * @param root container element in which to search
	 * @param fqn fully qualified name of the element
	 * @return element with the given fully qualified name or null
	 * 
	 * @see #getFullyQualifiedName(EObject)
	 * @deprecated use {@link MigrationModelSelector#selectFirst(EObject, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link FQNQuery}
	 */
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
	
	/**
	 * Returns all elements with the given class that are contained in root.
	 * If no such elements are found, an empty list is returned.
	 * 
	 * @param roots container elements in which elements are searched
	 * @param clazz class an element must be an instance of
	 * @return all elements with the given class contained in root
	 * @deprecated use {@link MigrationModelSelector#selectFirst(Iterable, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link ClassQuery}
	 */
	public static <T extends EObject> List<T> findByClass(List<? extends EObject> roots, Class<T> clazz) {
		List<T> objects = new ArrayList<>();
		for(EObject root : roots)
			objects.addAll(findByClass(root, clazz));
		return objects;
	}
	
	/**
	 * Returns all elements with the given class that are contained in root.
	 * If no such elements are found, an empty list is returned.
	 * 
	 * @param root container element in which elements are searched
	 * @param clazz class an element must be an instance of
	 * @return all elements with the given class contained in root
	 * @deprecated use {@link MigrationModelSelector#selectFirst(EObject, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link ClassQuery}
	 */
	public static <T extends EObject> List<T> findByClass(EObject root, Class<T> clazz) {
		if(clazz == null || root == null)
			return new ArrayList<>();
		
		List<T> objects = new ArrayList<>();
		if(clazz.isInstance(root))
			objects.add(ObjectUtil.asClass(root, clazz));
		
		TreeIterator<EObject> contents = root.eAllContents();
		EObject cur;
		T casted = null;
		while(contents.hasNext()) {
			cur = contents.next();
			if(clazz.isInstance(cur)) {
				casted = ObjectUtil.asClass(cur, clazz);
				if(casted != null)
					objects.add(casted);
			}
		}
		return objects;
	}
	
	/**
	 * Creates a proxy for the given object.
	 * 
	 * @param obj object for which to create a proxy
	 * @return proxy of the given object
	 * 
	 * @see EcoreUtil#create(org.eclipse.emf.ecore.EClass)
	 * @see InternalEObject
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T createProxy(T obj) {
		InternalEObject proxy = (InternalEObject) EcoreUtil.create(obj.eClass());
		proxy.eSetProxyURI(EcoreUtil.getURI(obj));
		return (T) proxy;
	}
	
	/**
	 * Returns the first element with the given qualifiedName within the 
	 * within the resource of the given object. 
	 * If no such element is found, null is returned.
	 * <p/>
	 * Important: This method should be used for finding UML elements, for 
	 * other elements use, e.g., 
	 * {@link #findByFullyQualifiedName(EObject, String)}.
	 * 
	 * @param obj the container element in which to search
	 * @param qualifiedName qualified name of the element to be found
	 * @param clazz class the element is expected to have
	 * @return element with the specified qualified name and class or null
	 * 
	 * @see UMLUtil#findNamedElements(Resource, String)
	 * @deprecated use {@link MigrationModelSelector#selectFirst(EObject, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link FQNQuery}
	 */
	public static NamedElement findUMLNamedElement(EObject obj, String qualifiedName) {
		return findUMLNamedElement(obj.eResource(), qualifiedName);
	}
	
	/**
	 * Returns the first element with the given qualifiedName within the 
	 * specified resource. 
	 * If no such element is found, null is returned.
	 * <p/>
	 * Important: This method should be used for finding UML elements, for 
	 * other elements use, e.g., 
	 * {@link #findByFullyQualifiedName(Resource, String)}.
	 * 
	 * @param resource the resource in which to search
	 * @param qualifiedName qualified name of the element to be found
	 * @param clazz class the element is expected to have
	 * @return element with the specified qualified name and class or null
	 * 
	 * @see UMLUtil#findNamedElements(Resource, String)
	 * @deprecated use {@link MigrationModelSelector#selectFirst(Resource, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link FQNQuery}
	 */
	public static NamedElement findUMLNamedElement(Resource resource, String qualifiedName) {
		String qn = qualifiedName.replace(XTEXT_DELIMITER, UML_DELIMITER);
		for(NamedElement e : UMLUtil.findNamedElements(resource, qn))
			return e;
		return null;
	}
	
	/**
	 * Returns the first element with the given qualifiedName which is an
	 * instance of the given class within the resource of the given object. 
	 * If no such element is found, null is returned.
	 * <p/>
	 * Important: This method should be used for finding UML elements, for 
	 * other elements use, e.g., 
	 * {@link #findByFullyQualifiedName(EObject, String)}.
	 * 
	 * 
	 * @param obj container element whose resource is searched
	 * @param qualifiedName qualified name of the element to be found
	 * @param clazz class the element is expected to have
	 * @return element with the specified qualified name and class or null
	 * 
	 * @see #findUMLNamedElement(Resource, String, Class)
	 * @see UMLUtil#findNamedElements(Resource, String)
	 * @deprecated use {@link MigrationModelSelector#selectFirst(EObject, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link FQNQuery}
	 */
	public static <T extends NamedElement> T findUMLNamedElement(EObject obj, String qualifiedName, Class<T> clazz) {
		return findUMLNamedElement(obj.eResource(), qualifiedName, clazz);
	}
	
	/**
	 * Returns the first element with the given qualifiedName which is an
	 * instance of the given class within the specified resource. 
	 * If no such element is found, null is returned.
	 * <p/>
	 * Important: This method should be used for finding UML elements, for 
	 * other elements use, e.g., findByFullyQualifiedName.
	 * 
	 * @param resource the resource in which to search
	 * @param qualifiedName qualified name of the element to be found
	 * @param clazz class the element is expected to have
	 * @return element with the specified qualified name and class or null
	 * 
	 * @see UMLUtil#findNamedElements(Resource, String)
	 * @deprecated use {@link MigrationModelSelector#selectFirst(Resource, eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery)} with {@link FQNQuery}
	 */
	public static <T extends NamedElement> T findUMLNamedElement(Resource resource, String qualifiedName, Class<T> clazz) {
		String qn = qualifiedName.replace(XTEXT_DELIMITER, UML_DELIMITER); // just in case
		for(NamedElement e : UMLUtil.findNamedElements(resource, qn)) {
			if(clazz.isInstance(e))
				return ObjectUtil.asClass(e, clazz);
		}
		return null;
	}
}

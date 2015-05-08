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
package eu.artist.migration.mut.umlprofiler.uml2profileduml.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnnotationMemberValuePair;
import org.eclipse.gmt.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.gmt.modisco.java.ArrayInitializer;
import org.eclipse.gmt.modisco.java.BooleanLiteral;
import org.eclipse.gmt.modisco.java.CharacterLiteral;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.StringLiteral;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.internal.util.JavaUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

import eu.artist.migration.model.trace.Trace;
import eu.artist.migration.model.trace.TraceLink;
import eu.artist.migration.mut.umlprofiler.uml2profileduml.UMLProfiler;
import eu.artist.migration.umlprofilestore.UMLProfileStoreManager;

/**
 * @author Alexander Bergmayr
 *
 */
@SuppressWarnings("restriction")
public class UMLProfilerImpl implements UMLProfiler {
	
	/**
	 * 
	 */
	private static boolean IS_INTIALIZED = false;
	
	/**
	 * 
	 */
	private final String defaultMemberValue = "value";
	
	/**
	 * 
	 */
	private Map<EObject, EObject> traceMap = new HashMap<EObject, EObject>();
	
	/**
	 * 
	 */
	private Map<String, Element> profileMap = new HashMap<String, Element>();
	
	
	private Map<String, Integer> annotationsPerProfile = new HashMap<String, Integer>();
	
	int annotationsForApplicationCounter = 0;
	int appliedAnnotationCounter = 0;
	int notFoundAnnotationCounter = 0;
	int notRecognizedAnnotationCounter = 0;
	int unresolvedTypesCounter = 0;
	
	/**
	 * 
	 */
	private UMLProfilerImpl() {	}
	
	/**
	 * 
	 * @return the {@link JavaDiscoverer}
	 */
	public static UMLProfiler init() {
		if(!IS_INTIALIZED) {
			IS_INTIALIZED = true;
			return new UMLProfilerImpl();
		} 
		return UMLProfiler.INSTANCE;
	}
	
	/* (non-Javadoc)
	 * @see eu.artist.migration.mut.umlprofiler.uml2profileduml.UMLProfiler#runProfileApplication(org.eclipse.emf.ecore.resource.Resource)
	 */
	@Override
	public void runProfileApplication(Resource codeModel, Resource traceModel, Resource umlModel, Collection<Resource> profileModels, String umlProfileStoreDirectory) {		
		// TODO: change ... the profile map does not have to be necessarily cleared!!
		traceMap.clear();
		profileMap.clear();
		
		// apply the profile to the model
		Package model = (Package) umlModel.getContents().get(0);
		
		for(Resource res : profileModels) {
			Profile p = (Profile) res.getContents().get(0);
			model.applyProfile(p);
		}
		
		// init map for the trace links
		initTraceMap(traceModel);
		
		// init map for profiles with namespace keys
		initProfileMap(profileModels);
		
		
		// TODO: change requiured ... we need to consider the given path to a potential local UML-Profile-Store !!!
		
		//initProfileMap(UMLProfileStoreManager.readUMLProfiles(umlProfileStoreDirectory));
		initProfileMap(UMLProfileStoreManager.INSTANCE.getUMLProfiles());
		
		applyStereotypes(codeModel);
	}
	
	@Override
	public void runProfileApplication(Resource codeModel, Resource traceModel, Resource umlModel, Collection<Resource> profileModels) {		
		// TODO: change ... the profile map does not have to be necessarily cleared!!
		traceMap.clear();
		profileMap.clear();
		
		// apply the profile to the model
		Package model = (Package) umlModel.getContents().get(0);
		
		for(Resource res : profileModels) {
			Profile p = (Profile) res.getContents().get(0);
			model.applyProfile(p);
		}
		
		// init map for the trace links
		initTraceMap(traceModel);
		
		// init map for profiles with namespace keys
		initProfileMap(profileModels);
		initProfileMap(UMLProfileStoreManager.INSTANCE.getUMLProfiles());
		
		applyStereotypes(codeModel);
	}
	
	private void applyStereotypes(Resource codeModel) {
		// annotation counter
		annotationsForApplicationCounter = 0;
		appliedAnnotationCounter = 0;
		notFoundAnnotationCounter = 0;
		notRecognizedAnnotationCounter = 0;
		unresolvedTypesCounter = 0;
		
		// visit all annotations in the codeModel
		TreeIterator<EObject> iter = codeModel.getAllContents();
		while(iter.hasNext()) {
			EObject eObj = iter.next(); 
			if(eObj.eClass().getClassifierID() == JavaPackage.ANNOTATION) {
				// get the UML element that needs to be annotated / profiled
				Annotation javaAnnotation = (Annotation) eObj;
				annotationsForApplicationCounter++;
				
				applyStereotype(javaAnnotation);
			}
		}
		
		System.out.println("Regocnized annotations " + annotationsForApplicationCounter);
		System.out.println("Applied " + appliedAnnotationCounter + " Stereotypes.");
		System.out.println("Missing " + notFoundAnnotationCounter + " Stereotypes.");
		System.out.println("Not Regocnized " + notRecognizedAnnotationCounter);
		System.out.println("Unresolved Types " + unresolvedTypesCounter);
		
		System.out.println(this.annotationsPerProfile);
	}
	
	private void applyStereotype(Annotation javaAnnotation) {
		EObject javaAnnotatedElement = javaAnnotation.eContainer();
		
		// TODO: check ... proxy annotations result in a Null value
		if(traceMap.containsKey(javaAnnotatedElement)) {
			Element umlElement = (Element) traceMap.get(javaAnnotatedElement);				
		       							
			if(javaAnnotation.getType().getType() instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration annotationType = (AnnotationTypeDeclaration) javaAnnotation.getType().getType();
				Stereotype umlStereotype = this.getElementFromProfile(annotationType, Stereotype.class);
				if(umlStereotype != null) {
					Package umlPackage = umlElement.getNearestPackage();
				
					// the package can be Null if UML Elements are not correctly packaged
					// this should in fact never happen ... 
					if(umlPackage != null) {
						Profile umlProfile = umlStereotype.getProfile();
					
						if(!umlPackage.getAllAppliedProfiles().contains(umlProfile)) {
							umlPackage.applyProfile(umlProfile);
						}
					
						// apply the stereotype
						if(umlElement.isStereotypeApplicable(umlStereotype)) {												
							umlElement.applyStereotype(umlStereotype);
							this.setValues(javaAnnotation, umlElement, umlStereotype);
							
							// stats
							this.reportStereotypeApplication(umlStereotype);
						}
						else {
							// System.out.println("Not applicable: " + umlElement + " - " + umlStereotype);
						}
					}
					// the UML Package is null
					else {
						// System.out.println("UML Element is not correctly packaged! " + umlElement);
					}
				}
				else {
					// System.out.println("Could not apply Stereotype: " + umlStereotype);
					
					// the passed profile does not contain the required annotation
					notFoundAnnotationCounter++;
				}
			}
			else {
				unresolvedTypesCounter++;
			}
		}
		else {
			notRecognizedAnnotationCounter++;
			// System.out.println("Was here " + javaAnnotatedElement);
		}
	}
	
	/**
	 * 
	 * 
	 * @param umlElement
	 * @param valueExpression
	 * @return the UML value for a given Java expression.
	 */
	private Object getValueFromExpression(Element umlElement, Expression valueExpression) {
		// TODO: their might still be cases that are not yet covered.
		Object value = null;
		
		// multi-valued expression
		if(valueExpression.eClass().getClassifierID() == JavaPackage.ARRAY_INITIALIZER) {
			ArrayInitializer arrayInitializer = (ArrayInitializer) valueExpression;
			List<Object> values = new ArrayList<Object>();
			
			for(Expression expression : arrayInitializer.getExpressions()) {
				
				if(expression.eClass().getClassifierID() == JavaPackage.ANNOTATION) {
					Annotation javaAnnotation = (Annotation) expression;
					
					AnnotationTypeDeclaration annotationType = (AnnotationTypeDeclaration) javaAnnotation.getType().getType();
					Stereotype umlStereotype = this.getElementFromProfile(annotationType, Stereotype.class);
					if(umlStereotype != null && umlElement != null) {
						
						EClass stereotypeDefinition = this.getStereotypeDefinition(umlElement, umlStereotype);
						if(stereotypeDefinition != null) {
							EObject stereotypeInstance = EcoreUtil.create(stereotypeDefinition);
							this.setValues(javaAnnotation, umlElement, stereotypeInstance);							
							values.add(stereotypeInstance);
							
							// stats
							this.reportStereotypeApplication(umlStereotype);
							notRecognizedAnnotationCounter--;
						}
					}
				}
				
				else if(expression.eClass().getClassifierID() == JavaPackage.SINGLE_VARIABLE_ACCESS) {
					values.add(this.getValueFromSingleVariableAccess((SingleVariableAccess) expression));
				}
				
				// TODO: Can we avoid the code duplication: See code beneath regarding primitive literal!  
				else if(expression.eClass().getClassifierID() == JavaPackage.STRING_LITERAL) {
					values.add(((StringLiteral) expression).getEscapedValue());
				}
				else if(expression.eClass().getClassifierID() == JavaPackage.CHARACTER_LITERAL) {
					values.add(((CharacterLiteral) expression).getEscapedValue());
				}
				else if(expression.eClass().getClassifierID() == JavaPackage.BOOLEAN_LITERAL) {
					values.add(((BooleanLiteral) expression).isValue());
				}
				else if(expression.eClass().getClassifierID() == JavaPackage.NUMBER_LITERAL) {
					values.add(((NumberLiteral) expression).getTokenValue());
				}
				
			}
			return values;
		}
		
		// EnumerationLiteral
		else if(valueExpression.eClass().getClassifierID() == JavaPackage.SINGLE_VARIABLE_ACCESS) {
			value = this.getValueFromSingleVariableAccess((SingleVariableAccess) valueExpression);
		}
		
		// primitive literal
		else {
			if(valueExpression.eClass().getClassifierID() == JavaPackage.STRING_LITERAL) {
				value = ((StringLiteral) valueExpression).getEscapedValue();
			}
			else if(valueExpression.eClass().getClassifierID() == JavaPackage.CHARACTER_LITERAL) {
				value = ((CharacterLiteral) valueExpression).getEscapedValue();
			}
			else if(valueExpression.eClass().getClassifierID() == JavaPackage.BOOLEAN_LITERAL) {
				value = ((BooleanLiteral) valueExpression).isValue();
			}
			else if(valueExpression.eClass().getClassifierID() == JavaPackage.NUMBER_LITERAL) {
				value = ((NumberLiteral) valueExpression).getTokenValue();
			}
		}
		
		return value;
	}
	
	private Object getValueFromSingleVariableAccess(SingleVariableAccess valueExpression) {
		Object value = null;
		// if the variable isn't a proxy, we should find it in the trace
		if(!valueExpression.getVariable().isProxy()) {
			//
			if(valueExpression.getVariable().eClass().getClassifierID() == JavaPackage.VARIABLE_DECLARATION_FRAGMENT) {
				if(valueExpression.getVariable().getInitializer() != null) {
					value = this.getValueFromExpression(null, valueExpression.getVariable().getInitializer());
				}
			}
			
			// else try to find the value in the trace map
			else {
				Object umlValue = traceMap.get(valueExpression.getVariable());
				value = umlValue;
			}
		}
		else {
			// let's have a look in the profile
			Element umlValue = this.getElementFromProfile(valueExpression.getVariable(), Element.class);
			value = umlValue;
		}
		
		return value;
	}
	
	/**
	 * 
	 * 
	 * @param javaElement
	 * @param type
	 * @return the element in the profile or Null if the javaElement is not mapped to an
	 * 			UML element
	 */
	private <E extends Element> E getElementFromProfile(ASTNode javaElement, Class<E> type) {
		// TODO: check the problem with the restriction ...
		String javaQualifiedName = JavaUtil.getQualifiedName(javaElement);
		String umlQualifiedName = javaQualifiedName.replaceAll("\\.", "::"); 
							
		if(profileMap.containsKey(umlQualifiedName)) {
			return type.cast(profileMap.get(umlQualifiedName));
		}
		else {
			return null;
		}
	}
	
	/**
	 * Set the values of an applied stereotype. 
	 * 
	 * @param javaAnnotation
	 * @param umlElement
	 * @param umlStereotype
	 */
	private void setValues(Annotation javaAnnotation, Element umlElement, Stereotype umlStereotype) {	
		for(AnnotationMemberValuePair annotationValue : javaAnnotation.getValues()) {
			Object newValue = this.getValueFromExpression(umlElement, annotationValue.getValue());
			
			if(newValue != null) {
				
				String memberValue = this.defaultMemberValue;
				if(annotationValue.getMember() != null) {
					memberValue = annotationValue.getMember().getName();
				}
				
				Feature featureToSet = umlStereotype.getFeature(memberValue);			
				if(featureToSet instanceof Property && ((Property) featureToSet).isMultivalued()
						&& !(newValue instanceof List<?>)) {
					List<Object> newValues = new ArrayList<Object>();
					newValues.add(newValue);					
					umlElement.setValue(umlStereotype, memberValue, newValues);
				}
				else {
					umlElement.setValue(umlStereotype, memberValue, newValue);
				}
			}
		}
	}
	
	/**
	 * Set the values of a stereotype that is not applied as usual but rather instantiated. The reason
	 * for this approach is that stereotypes can be contained by other stereotypes in terms
	 * of a "isComposite" relationship. In such a scenario, the stereotype is not applied to any
	 * UML element.    
	 * 
	 * @param javaAnnotation
	 * @param umlElement
	 * @param stereotypeInstance
	 */
	private void setValues(Annotation javaAnnotation, Element umlElement, EObject stereotypeInstance) {
		// tag the values of the applied stereotype
		for(AnnotationMemberValuePair annotationValue : javaAnnotation.getValues()) {
			Object newValue = this.getValueFromExpression(umlElement, annotationValue.getValue());
			
			if(newValue != null) {
				
				String memberValue = this.defaultMemberValue;
				if(annotationValue.getMember() != null) {
					memberValue = annotationValue.getMember().getName();
				}
				
				EStructuralFeature featureToSet = stereotypeInstance.eClass().
						getEStructuralFeature(memberValue);
				
				if(featureToSet.isMany()) {
					EList values = new BasicEList();
					values.add(newValue);
					stereotypeInstance.eSet(featureToSet, new BasicEList());
				}
				else {
					stereotypeInstance.eSet(featureToSet, newValue);
				}
			}
		}
	}
	
	/**
	 * To directly instantiate a stereotype rather than apply it to an UML element
	 * as usual, we need to get the definition of the stereotype. The definition is
	 * basically the generated EClass when defining a UML Profile.
	 * 
	 * @param element
	 * @param stereotype
	 * @return the EClass of the Stereotype.
	 */
	private EClass getStereotypeDefinition(Element element, Stereotype stereotype) {
		if (stereotype != null) {
			Profile profile = stereotype.getProfile();
	
			if (profile != null) {
				org.eclipse.uml2.uml.Package package_ = element
					.getNearestPackage();
	
				if (package_ != null) {
					ProfileApplication profileApplication = package_
						.getProfileApplication(profile, true);
	
					if (profileApplication != null) {
						ENamedElement appliedDefinition = profileApplication
							.getAppliedDefinition(stereotype);
	
						if (appliedDefinition instanceof EClass) {
							EClass eClass = (EClass) appliedDefinition;
	
							if (!eClass.isAbstract()) {
								return eClass;
							}
						}
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param traceModel
	 */
	private void initTraceMap(Resource traceModel) {
		Trace t = (Trace) traceModel.getContents().get(0);
		for(TraceLink tl : t.getTraceLinks()) {
			
			if(traceMap.containsKey(tl.getSourceElements().get(0)) &&
					tl.getSourceElements().get(0).eClass().getClassifierID() == JavaPackage.ANNOTATION_TYPE_DECLARATION) {
					
				if(tl.getTargetElements().get(0) instanceof Stereotype) {	
					traceMap.put(tl.getSourceElements().get(0), tl.getTargetElements().get(0));
				}
			}
			else {
			// TODO: we have to extend the trace map as we may get a list of
			//       targets in the future
				traceMap.put(tl.getSourceElements().get(0), tl.getTargetElements().get(0));
			}
		}
	}
	
	/**
	 * 
	 * @param profiles
	 */
	private void initProfileMap(Collection<Resource> profiles) {
		for(Resource profileResource : profiles) {
			Profile profile = (Profile) profileResource.getContents().get(0);
			
			TreeIterator<EObject> profileContents = profile.eAllContents();
			while(profileContents.hasNext()) {
				EObject eObj = profileContents.next();
				if(eObj instanceof Stereotype || eObj instanceof Enumeration ||
						eObj instanceof EnumerationLiteral) {
					PackageableElement packageableElement = (PackageableElement) eObj;
					
					String qualifiedName = packageableElement.getQualifiedName().replaceFirst(profile.getName() + "::", ""); 
					if(!profileMap.containsKey(qualifiedName)) { 
						profileMap.put(qualifiedName, packageableElement);
						
						// System.out.println(qualifiedName);
					}
					// duplicate of the stereotype referring to the qualified name.
					else {
						// System.out.println("DUPLICATE -> " + packageableElement.getQualifiedName());
					}
				}
			}
		}
	}
	
	private void reportStereotypeApplication(Stereotype umlStereotype) {
		Integer annotationCount = 1;
		if(this.annotationsPerProfile.containsKey(umlStereotype.getProfile().getName())) {
			annotationCount = this.annotationsPerProfile.get(umlStereotype.getProfile().getName());
			annotationCount++;
		}
		this.annotationsPerProfile.put(umlStereotype.getProfile().getName(), annotationCount);
		this.appliedAnnotationCounter++;
	}

}

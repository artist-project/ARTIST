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
package eu.artist.migration.mdt.umlprofilediscovery.codemodel2umlprofile.files;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.gmt.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.gmt.modisco.java.ArrayInitializer;
import org.eclipse.gmt.modisco.java.BooleanLiteral;
import org.eclipse.gmt.modisco.java.CharacterLiteral;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.PrefixExpression;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.StringLiteral;
import org.eclipse.gmt.modisco.java.TypeDeclaration;
import org.eclipse.gmt.modisco.java.TypeLiteral;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import eu.artist.migration.model.trace.Trace;
import eu.artist.migration.model.trace.TraceLink;
import eu.artist.migration.model.trace.TracePackage;

/**
 * @author Alexander Bergmayr
 * 
 */
public class CodeModel2UMLProfilePostProcessor {

	/**
	 * 
	 */
	private static Map<EObject, TraceLink> profileModel2CodeModeltraceMap = new HashMap<EObject, TraceLink>();

	/**
	 * 
	 */
	private static Map<EObject, EObject> codeModel2ProfileModeltraceMap = new HashMap<EObject, EObject>();

	/**
	 * 
	 * @param codeModel
	 * @param profileModel
	 * @param traceModel
	 */
	public static void runPostProcessing(IModel codeModel, IModel profileModel,
	    IModel traceModel) {
		// init the trace map
		initProfileModel2CodeModelTraceMap(traceModel);
		initCodeModel2ProfileModelTraceMap(traceModel);

		// set default values
		setDefaultValues();

		// helper collection to find property duplicates
		Collection<String> properties = new ArrayList<String>();

		// helper collection that stores the elements to destroy
		Collection<Element> umlRemovals = new ArrayList<Element>();
		Set<TraceLink> traceRemovals = new HashSet<TraceLink>();

		// check the stereotypes for duplicates -> Property, Association,
		// Operation
		Set<? extends Object> stereotypes = profileModel
		    .getElementsByType(UMLPackage.eINSTANCE.getStereotype());

		for (Object obj : stereotypes) {
			Stereotype stereotype = (Stereotype) obj;

			// TODO: maybe work with validators here !!
			for (Property property : stereotype.getAllAttributes()) {
				if (properties.contains(property.getName())) {

					// the extension member ends of the Extension
					for (Property extensionEnd : property.getAssociation()
					    .getMemberEnds()) {
						umlRemovals.add(extensionEnd);

						// if we remove an Operation extension, we should remove
						// the constructor
						// constraint as well
						if (property.getType().getName().equalsIgnoreCase("Operation")) {
							umlRemovals.add(stereotype.getOwnedRule("constructorConstraint"));
						}

						// if we remove a Property extension, we should remove
						// the method
						// constraint as well
						if (property.getType().getName().equalsIgnoreCase("Property")) {
							umlRemovals.add(stereotype.getOwnedRule("methodConstraint"));
						}

						traceRemovals.add(profileModel2CodeModeltraceMap.get(extensionEnd));
					}

					// the Extension
					umlRemovals.add(property.getAssociation());
					traceRemovals.add(profileModel2CodeModeltraceMap.get(property
					    .getAssociation()));

					// TODO: we need to remove constraints regarding operations
					// as well!
				} else {
					properties.add(property.getName());
				}
			}

			// clear the collection of properties for the next stereotype
			properties.clear();
		}

		// remove the trace links
		for (TraceLink traceLink : traceRemovals) {
			Trace trace = (Trace) traceLink.eContainer();
			trace.getTraceLinks().remove(traceLink);
		}

		// remove the uml elements
		for (Element element : umlRemovals) {
			element.destroy();
		}
	}

	private static void setDefaultValues() {
		for (EObject eObj : codeModel2ProfileModeltraceMap.keySet()) {
			if (eObj instanceof AnnotationTypeMemberDeclaration) {
				AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) eObj;

				if (member.getDefault() != null) {
					Object value = getValueFromExpression(member.getDefault());

					if (value != null) {
						EObject umlElement = codeModel2ProfileModeltraceMap.get(member);

						if (umlElement != null) {
							Property umlProperty = (Property) umlElement;
							
							// TODO: We need to properly deal with "empty" values, e.g., {}
							if(!(value.toString().equalsIgnoreCase("[]") ||
									 value.toString().equalsIgnoreCase("\"\""))) {
								
								if(!isNumericPrimitiveType(umlProperty.getType()) || 
										(isNumericPrimitiveType(umlProperty.getType()) && StringUtils.isNumeric(value.toString()))) {
										
									
										if(umlProperty.getType() instanceof Enumeration && umlProperty.isMultivalued()) {
											// remove brackets
											value = value.toString().substring(1, value.toString().length() -1);
										}
										umlProperty.setDefault(value.toString());
								}
							}
						}
					}
				}
			}
		}
	}
	
	private static boolean isNumericPrimitiveType(Type type) {
		boolean isNumeric = false;
		
		if(type instanceof PrimitiveType) {
			PrimitiveType primType = (PrimitiveType) type;
			
			if(primType.getName().equalsIgnoreCase("long") || primType.getName().equalsIgnoreCase("int") ||
					primType.getName().equalsIgnoreCase("double") || primType.getName().equalsIgnoreCase("float")) {
				isNumeric = true;
			}
		}
		
		return isNumeric;
	}

	/**
	 * 
	 * 
	 * @param umlElement
	 * @param valueExpression
	 * @return the UML value for a given Java expression.
	 */
	private static Object getValueFromExpression(
	/* Element umlElement, */Expression valueExpression) {
		// TODO: their might still be cases that are not yet covered.
		Object value = null;

		// multi-valued expression
		if (valueExpression.eClass().getClassifierID() == JavaPackage.ARRAY_INITIALIZER) {
			ArrayInitializer arrayInitializer = (ArrayInitializer) valueExpression;
			List<Object> values = new ArrayList<Object>();

			for (Expression expression : arrayInitializer.getExpressions()) {

				if (expression.eClass().getClassifierID() == JavaPackage.ANNOTATION) {
					Annotation javaAnnotation = (Annotation) expression;

					AnnotationTypeDeclaration annotationType = (AnnotationTypeDeclaration) javaAnnotation
					    .getType().getType();
					value = annotationType.getName();					
					// Stereotype umlStereotype =
					// this.getElementFromProfile(annotationType,
					// Stereotype.class);
					// if(umlStereotype != null && umlElement != null) {
					//
					// EClass stereotypeDefinition =
					// this.getStereotypeDefinition(umlElement, umlStereotype);
					// if(stereotypeDefinition != null) {
					// EObject stereotypeInstance =
					// EcoreUtil.create(stereotypeDefinition);
					// this.setValues(javaAnnotation, umlElement,
					// stereotypeInstance);
					// values.add(stereotypeInstance);
					//
					// // stats
					// this.reportStereotypeApplication(umlStereotype);
					// notRecognizedAnnotationCounter--;
					// }
					// }
					// else {
					// System.out.println("... null value");
					// }
				}

				if (expression.eClass().getClassifierID() == JavaPackage.SINGLE_VARIABLE_ACCESS) {
					values
					    .add(getValueFromSingleVariableAccess((SingleVariableAccess) expression));
				}

			}
			return values;
		}

		// EnumerationLiteral
		else if (valueExpression.eClass().getClassifierID() == JavaPackage.SINGLE_VARIABLE_ACCESS) {
			// SingleVariableAccess singleVariableAccess =
			// (SingleVariableAccess) valueExpression;
			value = getValueFromSingleVariableAccess((SingleVariableAccess) valueExpression);
		}

		else if (valueExpression.eClass().getClassifierID() == JavaPackage.TYPE_LITERAL) {
			TypeLiteral typeLiteral = (TypeLiteral) valueExpression;

			if (typeLiteral.getType().getType() instanceof TypeDeclaration) {
				TypeDeclaration type = (TypeDeclaration) typeLiteral.getType()
				    .getType();
				value = type.getName();
			}

			else if (typeLiteral.getType().getType() instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration annotationType = (AnnotationTypeDeclaration) typeLiteral
				    .getType().getType();
				value = annotationType.getName();
			} else if (typeLiteral.getType().getType().eClass().getClassifierID() == JavaPackage.PRIMITIVE_TYPE_VOID) {
				value = "void.class";
			}
		}

		else if (valueExpression.eClass().getClassifierID() == JavaPackage.ANNOTATION) {
			Annotation javaAnnotation = (Annotation) valueExpression;

			AbstractTypeDeclaration annotationType = (AbstractTypeDeclaration) javaAnnotation
			    .getType().getType();
			value = annotationType.getName();
		}

		else if (valueExpression.eClass().getClassifierID() == JavaPackage.PREFIX_EXPRESSION) {
			PrefixExpression prefix = (PrefixExpression) valueExpression;
			value = prefix.getOperator().toString()
			    .concat(getValueFromExpression(prefix.getOperand()).toString());

		}

		// primitive literal
		else {
			if (valueExpression.eClass().getClassifierID() == JavaPackage.STRING_LITERAL) {
				value = ((StringLiteral) valueExpression).getEscapedValue();
			} else if (valueExpression.eClass().getClassifierID() == JavaPackage.CHARACTER_LITERAL) {
				value = ((CharacterLiteral) valueExpression).getEscapedValue();
			} else if (valueExpression.eClass().getClassifierID() == JavaPackage.BOOLEAN_LITERAL) {
				value = ((BooleanLiteral) valueExpression).isValue();
			} else if (valueExpression.eClass().getClassifierID() == JavaPackage.NUMBER_LITERAL) {
				value = ((NumberLiteral) valueExpression).getTokenValue();
			}
		}

		return value;
	}

	private static Object getValueFromSingleVariableAccess(
	    SingleVariableAccess valueExpression) {
		if(valueExpression != null && valueExpression.getVariable() != null) {
			return valueExpression.getVariable().getName();
		}
		else return "";

		// Object value = null;
		// // if the variable isn't a proxy, we should find it in the trace
		// if(!valueExpression.getVariable().isProxy()) {
		// //
		// if(valueExpression.getVariable().eClass().getClassifierID() ==
		// JavaPackage.VARIABLE_DECLARATION_FRAGMENT) {
		// if(valueExpression.getVariable().getInitializer() != null) {
		// value = getValueFromExpression(/*null,*/
		// valueExpression.getVariable().getInitializer());
		// }
		// else {
		// value = valueExpression.getVariable().getName();
		// }
		// }
		//
		// // else try to find the value in the trace map
		// Object umlValue =
		// codeModel2ProfileModeltraceMap.get(valueExpression.getVariable());
		// value = umlValue;
		// }
		// else {
		// // let's have a look in the profile
		// // Element umlValue =
		// this.getElementFromProfile(valueExpression.getVariable(),
		// Element.class);
		// // value = umlValue;
		// value = valueExpression.getVariable().getName();
		// }
		//
		// return value;
	}

	private static void initProfileModel2CodeModelTraceMap(IModel traceModel) {
		// Trace t = (Trace) traceModel.getContents().get(0);
		Set<? extends Object> traceLinks = traceModel
		    .getElementsByType(TracePackage.eINSTANCE.getTraceLink());
		for (Object obj : traceLinks) {
			TraceLink traceLink = (TraceLink) obj;

			for (EObject eObj : traceLink.getTargetElements()) {
				if (profileModel2CodeModeltraceMap.containsKey(eObj))
					System.out.println("override!");
				profileModel2CodeModeltraceMap.put(eObj, traceLink);
			}
		}
	}

	private static void initCodeModel2ProfileModelTraceMap(IModel traceModel) {
		Set<? extends Object> traceLinks = traceModel
		    .getElementsByType(TracePackage.eINSTANCE.getTraceLink());
		for (Object obj : traceLinks) {
			TraceLink tl = (TraceLink) obj;

			if (codeModel2ProfileModeltraceMap.containsKey(tl.getSourceElements()
			    .get(0))
			    && tl.getSourceElements().get(0).eClass().getClassifierID() == JavaPackage.ANNOTATION_TYPE_DECLARATION) {

				if (tl.getTargetElements().get(0) instanceof Stereotype) {
					codeModel2ProfileModeltraceMap.put(tl.getSourceElements().get(0), tl
					    .getTargetElements().get(0));
				}
			} else {
				// TODO: we have to extend the trace map as we may get a list of
				// targets in the future
				codeModel2ProfileModeltraceMap.put(tl.getSourceElements().get(0), tl
				    .getTargetElements().get(0));
			}
		}
	}

}

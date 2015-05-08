/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mdt.dotnet.sharepointmodel2uml.client;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

public class UMLBuilder extends AbstractUMLBuilder {

	protected Model createModel(String name) {
		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName(name);

		out("Model '" + model.getQualifiedName() + "' created.");

		return model;
	}

	protected org.eclipse.uml2.uml.Package createPackage(
			org.eclipse.uml2.uml.Package nestingPackage, String name) {
		org.eclipse.uml2.uml.Package package_ = nestingPackage
			.createNestedPackage(name);

		out("Package '" + package_.getQualifiedName() + "' created.");

		return package_;
	}

	protected PrimitiveType createPrimitiveType(
			org.eclipse.uml2.uml.Package package_, String name) {
		PrimitiveType primitiveType = (PrimitiveType) package_
			.createOwnedPrimitiveType(name);

		out("Primitive type '" + primitiveType.getQualifiedName()
			+ "' created.");

		return primitiveType;
	}

	protected Enumeration createEnumeration(
			org.eclipse.uml2.uml.Package package_, String name) {
		Enumeration enumeration = (Enumeration) package_
			.createOwnedEnumeration(name);

		out("Enumeration '" + enumeration.getQualifiedName() + "' created.");

		return enumeration;
	}

	protected EnumerationLiteral createEnumerationLiteral(
			Enumeration enumeration, String name) {
		EnumerationLiteral enumerationLiteral = enumeration
			.createOwnedLiteral(name);

		out("Enumeration literal '" + enumerationLiteral.getQualifiedName()
			+ "' created.");

		return enumerationLiteral;
	}

	protected org.eclipse.uml2.uml.Class createClass(
			org.eclipse.uml2.uml.Package package_, String name,
			boolean isAbstract) {
		org.eclipse.uml2.uml.Class class_ = package_.createOwnedClass(name,
			isAbstract);

		out("Class '" + class_.getQualifiedName() + "' created.");

		return class_;
	}

	protected Generalization createGeneralization(
			Classifier specificClassifier, Classifier generalClassifier) {
		Generalization generalization = specificClassifier
			.createGeneralization(generalClassifier);

		out("Generalization " + specificClassifier.getQualifiedName() + " ->> "
			+ generalClassifier.getQualifiedName() + " created.");

		return generalization;
	}

	protected Property createAttribute(
			org.eclipse.uml2.uml.Class class_, String name, Type type,
			int lowerBound, int upperBound) {
		Property attribute = class_.createOwnedAttribute(name, type,
			lowerBound, upperBound);

		StringBuffer sb = new StringBuffer();

		sb.append("Attribute '");

		sb.append(attribute.getQualifiedName());

		sb.append("' : ");

		sb.append(type.getQualifiedName());

		sb.append(" [");
		sb.append(lowerBound);
		sb.append("..");
		sb.append(LiteralUnlimitedNatural.UNLIMITED == upperBound
			? "*"
			: String.valueOf(upperBound));
		sb.append("]");

		sb.append(" created.");

		out(sb.toString());

		return attribute;
	}

	protected Association createAssociation(Type type1,
			boolean end1IsNavigable, AggregationKind end1Aggregation,
			String end1Name, int end1LowerBound, int end1UpperBound,
			Type type2, boolean end2IsNavigable,
			AggregationKind end2Aggregation, String end2Name,
			int end2LowerBound, int end2UpperBound) {

		Association association = type1.createAssociation(end1IsNavigable,
			end1Aggregation, end1Name, end1LowerBound, end1UpperBound, type2,
			end2IsNavigable, end2Aggregation, end2Name, end2LowerBound,
			end2UpperBound);

		StringBuffer sb = new StringBuffer();

		sb.append("Association ");

		if (null == end1Name || 0 == end1Name.length()) {
			sb.append('{');
			sb.append(type1.getQualifiedName());
			sb.append('}');
		} else {
			sb.append("'");
			sb.append(type1.getQualifiedName());
			sb.append(NamedElement.SEPARATOR);
			sb.append(end1Name);
			sb.append("'");
		}

		sb.append(" [");
		sb.append(end1LowerBound);
		sb.append("..");
		sb.append(LiteralUnlimitedNatural.UNLIMITED == end1UpperBound
			? "*"
			: String.valueOf(end1UpperBound));
		sb.append("] ");

		sb.append(end2IsNavigable
			? '<'
			: '-');
		sb.append('-');
		sb.append(end1IsNavigable
			? '>'
			: '-');
		sb.append(' ');

		if (null == end2Name || 0 == end2Name.length()) {
			sb.append('{');
			sb.append(type2.getQualifiedName());
			sb.append('}');
		} else {
			sb.append("'");
			sb.append(type2.getQualifiedName());
			sb.append(NamedElement.SEPARATOR);
			sb.append(end2Name);
			sb.append("'");
		}

		sb.append(" [");
		sb.append(end2LowerBound);
		sb.append("..");
		sb.append(LiteralUnlimitedNatural.UNLIMITED == end2UpperBound
			? "*"
			: String.valueOf(end2UpperBound));
		sb.append("]");

		sb.append(" created.");

		out(sb.toString());

		return association;
	}
	
	protected Profile createProfile(String name) {
		Profile profile = UMLFactory.eINSTANCE.createProfile();
		profile.setName(name);

		out("Profile '" + profile.getQualifiedName() + "' created.");

		return profile;
	}
	
	protected Profile importProfile(URI uri) {
		//RESOURCE_SET.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		//RESOURCE_SET.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		RESOURCE_SET.createResource(uri);
		Resource profileResource = RESOURCE_SET.getResource(uri, true);
		Profile profile = (Profile)EcoreUtil.getObjectByType(profileResource.getContents(), UMLPackage.Literals.PROFILE);
	
		out("Profile '" + profile.getQualifiedName() + "' loaded.");
		
		return profile;
	}

	protected PrimitiveType importPrimitiveType(
			org.eclipse.uml2.uml.Package package_, String name) {
		Model umlLibrary = (Model) load(URI
			.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));

		PrimitiveType primitiveType = (PrimitiveType) umlLibrary
			.getOwnedType(name);

		package_.createElementImport(primitiveType);

		out("Primitive type '" + primitiveType.getQualifiedName()
			+ "' imported.");

		return primitiveType;
	}

	protected Stereotype createStereotype(Profile profile, String name,
			boolean isAbstract) {
		Stereotype stereotype = profile.createOwnedStereotype(name, isAbstract);

		out("Stereotype '" + stereotype.getQualifiedName() + "' created.");

		return stereotype;
	}

	protected org.eclipse.uml2.uml.Class referenceMetaclass(
			Profile profile, String name) {
		Model umlMetamodel = (Model) load(URI
			.createURI(UMLResource.UML_METAMODEL_URI));

		org.eclipse.uml2.uml.Class metaclass = (org.eclipse.uml2.uml.Class) umlMetamodel
			.getOwnedType(name);

		profile.createMetaclassReference(metaclass);

		out("Metaclass '" + metaclass.getQualifiedName() + "' referenced.");

		return metaclass;
	}

	protected Extension createExtension(
			org.eclipse.uml2.uml.Class metaclass, Stereotype stereotype,
			boolean required) {
		Extension extension = stereotype.createExtension(metaclass, required);

		out((required
			? "Required extension '"
			: "Extension '") + extension.getQualifiedName() + "' created.");

		return extension;
	}

	protected void defineProfile(Profile profile) {
		profile.define();

		out("Profile '" + profile.getQualifiedName() + "' defined.");
	}

	protected void applyProfile(org.eclipse.uml2.uml.Package package_,
			Profile profile) {
		package_.applyProfile(profile);

		out("Profile '" + profile.getQualifiedName() + "' applied to package '"
			+ package_.getQualifiedName() + "'.");
	}

	protected void applyStereotype(NamedElement namedElement,
			Stereotype stereotype) {
		namedElement.applyStereotype(stereotype);

		out("Stereotype '" + stereotype.getQualifiedName()
			+ "' applied to element '" + namedElement.getQualifiedName() + "'.");
	}

	protected Object getStereotypePropertyValue(
			NamedElement namedElement, Stereotype stereotype, Property property) {
		Object value = namedElement.getValue(stereotype, property.getName());

		out("Value of stereotype property '" + property.getQualifiedName()
			+ "' on element '" + namedElement.getQualifiedName() + "' is "
			+ String.valueOf(value) + ".");

		return value;
	}

	protected void setStereotypePropertyValue(NamedElement namedElement,
			Stereotype stereotype, Property property, Object value) {
		namedElement.setValue(stereotype, property.getName(), value);

		out("Value of stereotype property '" + property.getQualifiedName()
			+ "' on element '" + namedElement.getQualifiedName() + "' set to "
			+ String.valueOf(value) + ".");
	}
	
}

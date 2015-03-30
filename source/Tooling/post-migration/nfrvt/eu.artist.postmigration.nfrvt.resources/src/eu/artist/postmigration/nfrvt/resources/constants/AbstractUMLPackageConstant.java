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
package eu.artist.postmigration.nfrvt.resources.constants;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Type;

import com.google.common.base.CaseFormat;

import eu.artist.postmigration.nfrvt.lang.util.ObjectUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

public class AbstractUMLPackageConstant extends AbstractResourceConstant {
	public static URI PACKAGE_URI;
	
	public final MigrationModelElement<Package> PACKAGE;
	
	protected Package umlPackage;
	protected Map<String, DataType> nameToDataType = new HashMap<>();
	
	public AbstractUMLPackageConstant(URI uri) {
		PACKAGE_URI = uri;
		this.umlPackage = resourceSet.loadUMLPackage(PACKAGE_URI);
		if(uri.hasFragment())
			this.umlPackage = ObjectUtil.asClass(umlPackage.eResource().getEObject(uri.fragment()), Package.class);
		if(umlPackage == null)
			throw new IllegalArgumentException("Can not find package with uri " + uri + ".");
		PACKAGE = new MigrationModelElement<Package>(umlPackage);
		collectDatatypes();
	}
	
	public AbstractUMLPackageConstant(String uriString) {
		this(URI.createURI(uriString));
	}
	
	public Package getPackage() {
		return umlPackage;
	}

	protected void collectDatatypes() {
		DataType dataType = null;
		
		for(Type t : umlPackage.getOwnedTypes()) {
			if(t instanceof DataType) {
				dataType = (DataType) t;
				setDataType(dataType.getName(), dataType);
			}
		}
	}
	
	protected void setDataType(String name, DataType dataType) {
		nameToDataType.put(name, dataType);
	}
	
	public DataType getDataTypeByName(String name) {
		return nameToDataType.get(name);
	}
	
	public PrimitiveType getPrimitiveTypeByName(String name) {
		return ObjectUtil.asClass(nameToDataType.get(name), PrimitiveType.class);
	}
	
	public Enumeration getEnumerationByName(String name) {
		return ObjectUtil.asClass(nameToDataType.get(name), Enumeration.class);
	}
	
	public EnumerationLiteral getEnumerationLiteralByName(String enumName, String literalName) {
		Enumeration enumeration = getEnumerationByName(enumName);
		if(enumeration == null)
			return null;
		return enumeration.getOwnedLiteral(literalName);
	}
	
	protected void generateConstantCode() {
		generateConstantPackageCode(getPackage(), false);
		for(Package p : getPackage().getNestedPackages()) {
			System.out.println("public interface " + p.getName() + " {");
			generateConstantPackageCode(p, true);
			System.out.println("}");
		}
			
	}
	
	protected void generateConstantPackageCode(Package umlPackage, boolean subPackage) {
		// element constants
		System.out.println("public interface Element {");
		System.out.println("final Package PACKAGE = " + this.getClass().getSimpleName() + ".getInstance().PACKAGE.getElement();");
		for(Entry<String, DataType> dataType : nameToDataType.entrySet()) {
			if(subPackage && !dataType.getKey().startsWith(umlPackage.getName() + "::"))
				continue;
			String constantName = toConstantName(dataType.getValue().getName());
			System.out.println(
					"final " + dataType.getValue().eClass().getName() + " " + constantName + " = " +
					this.getClass().getSimpleName() +".getInstance()."+constantName+".getElement();");
			if(dataType.getValue() instanceof Enumeration) {
				Enumeration enumeration = (Enumeration) dataType.getValue();
				System.out.println("public interface " + constantName + "_LITERALS {");
				for(EnumerationLiteral literal : enumeration.getOwnedLiterals()) {
					String litConstantName = toConstantName(literal.getName());
					System.out.println("final EnumerationLiteral " + litConstantName + " = " +
						this.getClass().getSimpleName() +".getInstance()."+constantName+"_" + litConstantName + ".getElement();");
				}
				System.out.println("}");
			}
		}
		System.out.println("}");
		System.out.println();
		
		// fqn constants
		System.out.println("public interface FQN {");
		System.out.println("final String PACKAGE = " + this.getClass().getSimpleName() + ".getInstance().PACKAGE.getFullyQualifiedName();");
		for(Entry<String, DataType> dataType : nameToDataType.entrySet()) {
			if(subPackage && !dataType.getKey().startsWith(umlPackage.getName() + "::"))
				continue;
			String constantName = toConstantName(dataType.getValue().getName());
			System.out.println(
					"final String " + constantName + " = " +
					this.getClass().getSimpleName() +".getInstance()."+constantName+".getFullyQualifiedName();");
			if(dataType.getValue() instanceof Enumeration) {
				Enumeration enumeration = (Enumeration) dataType.getValue();
				System.out.println("public interface " + constantName + "_LITERALS {");
				for(EnumerationLiteral literal : enumeration.getOwnedLiterals()) {
					String litConstantName = toConstantName(literal.getName());
					System.out.println("final String " + litConstantName + " = " +
						this.getClass().getSimpleName() +".getInstance()."+constantName+"_" + litConstantName + ".getFullyQualifiedName();");
				}
				System.out.println("}");
			}
		}
		System.out.println("}");
		System.out.println();
		
		// uri constants
		System.out.println("public interface Uri {");
		System.out.println("final String PACKAGE = " + this.getClass().getSimpleName() + ".getInstance().PACKAGE.getUri();");
		for(Entry<String, DataType> dataType : nameToDataType.entrySet()) {
			if(subPackage && !dataType.getKey().startsWith(umlPackage.getName() + "::"))
				continue;
			String constantName = toConstantName(dataType.getValue().getName());
			System.out.println(
					"final String " + constantName + " = " +
					this.getClass().getSimpleName() +".getInstance()."+constantName+".getUri();");
			if(dataType.getValue() instanceof Enumeration) {
				Enumeration enumeration = (Enumeration) dataType.getValue();
				System.out.println("public interface " + constantName + "_LITERALS {");
				for(EnumerationLiteral literal : enumeration.getOwnedLiterals()) {
					String litConstantName = toConstantName(literal.getName());
					System.out.println("final String " + litConstantName + " = " +
						this.getClass().getSimpleName() +".getInstance()."+constantName+"_" + litConstantName + ".getUri();");
				}
				System.out.println("}");
			}
		}
		System.out.println("}");
		System.out.println();
		
		// migration model element fields 
		for(Entry<String, DataType> dataType : nameToDataType.entrySet()) {
			if(subPackage && !dataType.getKey().startsWith(umlPackage.getName() + "::"))
				continue;
			String constantName = toConstantName(dataType.getValue().getName());
			System.out.println("public final MigrationModelElement<"+dataType.getValue().eClass().getName()+"> " + 
					constantName + ";");
			if(dataType.getValue() instanceof Enumeration) {
				Enumeration enumeration = (Enumeration) dataType.getValue();
				for(EnumerationLiteral literal : enumeration.getOwnedLiterals()) {
					String litConstantName = toConstantName(literal.getName());
					System.out.println("public final MigrationModelElement<EnumerationLiteral> " + constantName + "_" + litConstantName + ";");
				}
			}
		}
		System.out.println();
		
		// constructor initialization
		for(Entry<String, DataType> dataType : nameToDataType.entrySet()) {
			if(subPackage && !dataType.getKey().startsWith(umlPackage.getName() + "::"))
				continue;
			String constantName = toConstantName(dataType.getValue().getName());
			System.out.println(constantName + " = new MigrationModelElement<"+dataType.getValue().eClass().getName()+">"
					+ "(get" + dataType.getValue().eClass().getName() + "ByName(\"" + dataType.getValue().getName() + "\"));");
			if(dataType.getValue() instanceof Enumeration) {
				Enumeration enumeration = (Enumeration) dataType.getValue();
				for(EnumerationLiteral literal : enumeration.getOwnedLiterals()) {
					String litConstantName = toConstantName(literal.getName());
					System.out.println(constantName + "_" + litConstantName + " = "
							+ "new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName(\"" + dataType.getValue().getName() + "\", \"" + literal.getName() + "\"));");
				}
			}
		}
	}
	
	protected static String toConstantName(String name) {
		return CaseFormat.UPPER_CAMEL.to(
				CaseFormat.UPPER_UNDERSCORE, name)
				.replaceAll("__", "_");
	}
	
}

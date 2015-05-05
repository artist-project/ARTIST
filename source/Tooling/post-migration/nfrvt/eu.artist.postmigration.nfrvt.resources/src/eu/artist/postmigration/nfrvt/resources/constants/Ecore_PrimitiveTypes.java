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

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;

import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * A convenience class that provides access to all Ecore Primitive Types
 * through constants. The library containing those types is located 
 * {@link Ecore_PrimitiveTypes#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class Ecore_PrimitiveTypes extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = "pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);

	public interface Element {
		final Package PACKAGE = Ecore_PrimitiveTypes.getInstance().PACKAGE.getElement();
		
		final PrimitiveType E_MAP = Ecore_PrimitiveTypes.getInstance().E_MAP.getElement();
		final PrimitiveType E_RESOURCE = Ecore_PrimitiveTypes.getInstance().E_RESOURCE.getElement();
		final PrimitiveType E_BIG_INTEGER = Ecore_PrimitiveTypes.getInstance().E_BIG_INTEGER.getElement();
		final PrimitiveType E_FLOAT = Ecore_PrimitiveTypes.getInstance().E_FLOAT.getElement();
		final PrimitiveType E_BOOLEAN = Ecore_PrimitiveTypes.getInstance().E_BOOLEAN.getElement();
		final PrimitiveType E_INVOCATION_TARGET_EXCEPTION = Ecore_PrimitiveTypes.getInstance().E_INVOCATION_TARGET_EXCEPTION.getElement();
		final PrimitiveType E_STRING = Ecore_PrimitiveTypes.getInstance().E_STRING.getElement();
		final PrimitiveType E_FEATURE_MAP = Ecore_PrimitiveTypes.getInstance().E_FEATURE_MAP.getElement();
		final PrimitiveType E_BIG_DECIMAL = Ecore_PrimitiveTypes.getInstance().E_BIG_DECIMAL.getElement();
		final PrimitiveType E_BYTE_ARRAY = Ecore_PrimitiveTypes.getInstance().E_BYTE_ARRAY.getElement();
		final PrimitiveType E_DOUBLE = Ecore_PrimitiveTypes.getInstance().E_DOUBLE.getElement();
		final PrimitiveType E_DATE = Ecore_PrimitiveTypes.getInstance().E_DATE.getElement();
		final PrimitiveType E_TREE_ITERATOR = Ecore_PrimitiveTypes.getInstance().E_TREE_ITERATOR.getElement();
		final PrimitiveType E_INTEGER_OBJECT = Ecore_PrimitiveTypes.getInstance().E_INTEGER_OBJECT.getElement();
		final PrimitiveType E_DIAGNOSTIC_CHAIN = Ecore_PrimitiveTypes.getInstance().E_DIAGNOSTIC_CHAIN.getElement();
		final PrimitiveType E_INT = Ecore_PrimitiveTypes.getInstance().E_INT.getElement();
		final PrimitiveType E_SHORT = Ecore_PrimitiveTypes.getInstance().E_SHORT.getElement();
		final PrimitiveType E_E_LIST = Ecore_PrimitiveTypes.getInstance().E_E_LIST.getElement();
		final PrimitiveType E_FLOAT_OBJECT = Ecore_PrimitiveTypes.getInstance().E_FLOAT_OBJECT.getElement();
		final PrimitiveType E_JAVA_OBJECT = Ecore_PrimitiveTypes.getInstance().E_JAVA_OBJECT.getElement();
		final PrimitiveType E_LONG_OBJECT = Ecore_PrimitiveTypes.getInstance().E_LONG_OBJECT.getElement();
		final PrimitiveType E_BYTE_OBJECT = Ecore_PrimitiveTypes.getInstance().E_BYTE_OBJECT.getElement();
		final PrimitiveType E_SHORT_OBJECT = Ecore_PrimitiveTypes.getInstance().E_SHORT_OBJECT.getElement();
		final PrimitiveType E_CHARACTER_OBJECT = Ecore_PrimitiveTypes.getInstance().E_CHARACTER_OBJECT.getElement();
		final PrimitiveType E_BYTE = Ecore_PrimitiveTypes.getInstance().E_BYTE.getElement();
		final PrimitiveType E_ENUMERATOR = Ecore_PrimitiveTypes.getInstance().E_ENUMERATOR.getElement();
		final PrimitiveType E_BOOLEAN_OBJECT = Ecore_PrimitiveTypes.getInstance().E_BOOLEAN_OBJECT.getElement();
		final PrimitiveType E_FEATURE_MAP_ENTRY = Ecore_PrimitiveTypes.getInstance().E_FEATURE_MAP_ENTRY.getElement();
		final PrimitiveType E_CHAR = Ecore_PrimitiveTypes.getInstance().E_CHAR.getElement();
		final PrimitiveType E_DOUBLE_OBJECT = Ecore_PrimitiveTypes.getInstance().E_DOUBLE_OBJECT.getElement();
		final PrimitiveType E_JAVA_CLASS = Ecore_PrimitiveTypes.getInstance().E_JAVA_CLASS.getElement();
		final PrimitiveType E_LONG = Ecore_PrimitiveTypes.getInstance().E_LONG.getElement();
		final PrimitiveType E_RESOURCE_SET = Ecore_PrimitiveTypes.getInstance().E_RESOURCE_SET.getElement();
	}

	public interface FQN {
		final String PACKAGE = Ecore_PrimitiveTypes.getInstance().PACKAGE.getFullyQualifiedName();
		
		final String E_MAP = Ecore_PrimitiveTypes.getInstance().E_MAP.getFullyQualifiedName();
		final String E_RESOURCE = Ecore_PrimitiveTypes.getInstance().E_RESOURCE.getFullyQualifiedName();
		final String E_BIG_INTEGER = Ecore_PrimitiveTypes.getInstance().E_BIG_INTEGER.getFullyQualifiedName();
		final String E_FLOAT = Ecore_PrimitiveTypes.getInstance().E_FLOAT.getFullyQualifiedName();
		final String E_BOOLEAN = Ecore_PrimitiveTypes.getInstance().E_BOOLEAN.getFullyQualifiedName();
		final String E_INVOCATION_TARGET_EXCEPTION = Ecore_PrimitiveTypes.getInstance().E_INVOCATION_TARGET_EXCEPTION.getFullyQualifiedName();
		final String E_STRING = Ecore_PrimitiveTypes.getInstance().E_STRING.getFullyQualifiedName();
		final String E_FEATURE_MAP = Ecore_PrimitiveTypes.getInstance().E_FEATURE_MAP.getFullyQualifiedName();
		final String E_BIG_DECIMAL = Ecore_PrimitiveTypes.getInstance().E_BIG_DECIMAL.getFullyQualifiedName();
		final String E_BYTE_ARRAY = Ecore_PrimitiveTypes.getInstance().E_BYTE_ARRAY.getFullyQualifiedName();
		final String E_DOUBLE = Ecore_PrimitiveTypes.getInstance().E_DOUBLE.getFullyQualifiedName();
		final String E_DATE = Ecore_PrimitiveTypes.getInstance().E_DATE.getFullyQualifiedName();
		final String E_TREE_ITERATOR = Ecore_PrimitiveTypes.getInstance().E_TREE_ITERATOR.getFullyQualifiedName();
		final String E_INTEGER_OBJECT = Ecore_PrimitiveTypes.getInstance().E_INTEGER_OBJECT.getFullyQualifiedName();
		final String E_DIAGNOSTIC_CHAIN = Ecore_PrimitiveTypes.getInstance().E_DIAGNOSTIC_CHAIN.getFullyQualifiedName();
		final String E_INT = Ecore_PrimitiveTypes.getInstance().E_INT.getFullyQualifiedName();
		final String E_SHORT = Ecore_PrimitiveTypes.getInstance().E_SHORT.getFullyQualifiedName();
		final String E_E_LIST = Ecore_PrimitiveTypes.getInstance().E_E_LIST.getFullyQualifiedName();
		final String E_FLOAT_OBJECT = Ecore_PrimitiveTypes.getInstance().E_FLOAT_OBJECT.getFullyQualifiedName();
		final String E_JAVA_OBJECT = Ecore_PrimitiveTypes.getInstance().E_JAVA_OBJECT.getFullyQualifiedName();
		final String E_LONG_OBJECT = Ecore_PrimitiveTypes.getInstance().E_LONG_OBJECT.getFullyQualifiedName();
		final String E_BYTE_OBJECT = Ecore_PrimitiveTypes.getInstance().E_BYTE_OBJECT.getFullyQualifiedName();
		final String E_SHORT_OBJECT = Ecore_PrimitiveTypes.getInstance().E_SHORT_OBJECT.getFullyQualifiedName();
		final String E_CHARACTER_OBJECT = Ecore_PrimitiveTypes.getInstance().E_CHARACTER_OBJECT.getFullyQualifiedName();
		final String E_BYTE = Ecore_PrimitiveTypes.getInstance().E_BYTE.getFullyQualifiedName();
		final String E_ENUMERATOR = Ecore_PrimitiveTypes.getInstance().E_ENUMERATOR.getFullyQualifiedName();
		final String E_BOOLEAN_OBJECT = Ecore_PrimitiveTypes.getInstance().E_BOOLEAN_OBJECT.getFullyQualifiedName();
		final String E_FEATURE_MAP_ENTRY = Ecore_PrimitiveTypes.getInstance().E_FEATURE_MAP_ENTRY.getFullyQualifiedName();
		final String E_CHAR = Ecore_PrimitiveTypes.getInstance().E_CHAR.getFullyQualifiedName();
		final String E_DOUBLE_OBJECT = Ecore_PrimitiveTypes.getInstance().E_DOUBLE_OBJECT.getFullyQualifiedName();
		final String E_JAVA_CLASS = Ecore_PrimitiveTypes.getInstance().E_JAVA_CLASS.getFullyQualifiedName();
		final String E_LONG = Ecore_PrimitiveTypes.getInstance().E_LONG.getFullyQualifiedName();
		final String E_RESOURCE_SET = Ecore_PrimitiveTypes.getInstance().E_RESOURCE_SET.getFullyQualifiedName();
	}

	public interface Uri {
		final String PACKAGE = Ecore_PrimitiveTypes.getInstance().PACKAGE.getUri();
		
		final String E_MAP = Ecore_PrimitiveTypes.getInstance().E_MAP.getUri();
		final String E_RESOURCE = Ecore_PrimitiveTypes.getInstance().E_RESOURCE.getUri();
		final String E_BIG_INTEGER = Ecore_PrimitiveTypes.getInstance().E_BIG_INTEGER.getUri();
		final String E_FLOAT = Ecore_PrimitiveTypes.getInstance().E_FLOAT.getUri();
		final String E_BOOLEAN = Ecore_PrimitiveTypes.getInstance().E_BOOLEAN.getUri();
		final String E_INVOCATION_TARGET_EXCEPTION = Ecore_PrimitiveTypes.getInstance().E_INVOCATION_TARGET_EXCEPTION.getUri();
		final String E_STRING = Ecore_PrimitiveTypes.getInstance().E_STRING.getUri();
		final String E_FEATURE_MAP = Ecore_PrimitiveTypes.getInstance().E_FEATURE_MAP.getUri();
		final String E_BIG_DECIMAL = Ecore_PrimitiveTypes.getInstance().E_BIG_DECIMAL.getUri();
		final String E_BYTE_ARRAY = Ecore_PrimitiveTypes.getInstance().E_BYTE_ARRAY.getUri();
		final String E_DOUBLE = Ecore_PrimitiveTypes.getInstance().E_DOUBLE.getUri();
		final String E_DATE = Ecore_PrimitiveTypes.getInstance().E_DATE.getUri();
		final String E_TREE_ITERATOR = Ecore_PrimitiveTypes.getInstance().E_TREE_ITERATOR.getUri();
		final String E_INTEGER_OBJECT = Ecore_PrimitiveTypes.getInstance().E_INTEGER_OBJECT.getUri();
		final String E_DIAGNOSTIC_CHAIN = Ecore_PrimitiveTypes.getInstance().E_DIAGNOSTIC_CHAIN.getUri();
		final String E_INT = Ecore_PrimitiveTypes.getInstance().E_INT.getUri();
		final String E_SHORT = Ecore_PrimitiveTypes.getInstance().E_SHORT.getUri();
		final String E_E_LIST = Ecore_PrimitiveTypes.getInstance().E_E_LIST.getUri();
		final String E_FLOAT_OBJECT = Ecore_PrimitiveTypes.getInstance().E_FLOAT_OBJECT.getUri();
		final String E_JAVA_OBJECT = Ecore_PrimitiveTypes.getInstance().E_JAVA_OBJECT.getUri();
		final String E_LONG_OBJECT = Ecore_PrimitiveTypes.getInstance().E_LONG_OBJECT.getUri();
		final String E_BYTE_OBJECT = Ecore_PrimitiveTypes.getInstance().E_BYTE_OBJECT.getUri();
		final String E_SHORT_OBJECT = Ecore_PrimitiveTypes.getInstance().E_SHORT_OBJECT.getUri();
		final String E_CHARACTER_OBJECT = Ecore_PrimitiveTypes.getInstance().E_CHARACTER_OBJECT.getUri();
		final String E_BYTE = Ecore_PrimitiveTypes.getInstance().E_BYTE.getUri();
		final String E_ENUMERATOR = Ecore_PrimitiveTypes.getInstance().E_ENUMERATOR.getUri();
		final String E_BOOLEAN_OBJECT = Ecore_PrimitiveTypes.getInstance().E_BOOLEAN_OBJECT.getUri();
		final String E_FEATURE_MAP_ENTRY = Ecore_PrimitiveTypes.getInstance().E_FEATURE_MAP_ENTRY.getUri();
		final String E_CHAR = Ecore_PrimitiveTypes.getInstance().E_CHAR.getUri();
		final String E_DOUBLE_OBJECT = Ecore_PrimitiveTypes.getInstance().E_DOUBLE_OBJECT.getUri();
		final String E_JAVA_CLASS = Ecore_PrimitiveTypes.getInstance().E_JAVA_CLASS.getUri();
		final String E_LONG = Ecore_PrimitiveTypes.getInstance().E_LONG.getUri();
		final String E_RESOURCE_SET = Ecore_PrimitiveTypes.getInstance().E_RESOURCE_SET.getUri();
	}

	public final MigrationModelElement<PrimitiveType> E_MAP;
	public final MigrationModelElement<PrimitiveType> E_RESOURCE;
	public final MigrationModelElement<PrimitiveType> E_BIG_INTEGER;
	public final MigrationModelElement<PrimitiveType> E_FLOAT;
	public final MigrationModelElement<PrimitiveType> E_BOOLEAN;
	public final MigrationModelElement<PrimitiveType> E_INVOCATION_TARGET_EXCEPTION;
	public final MigrationModelElement<PrimitiveType> E_STRING;
	public final MigrationModelElement<PrimitiveType> E_FEATURE_MAP;
	public final MigrationModelElement<PrimitiveType> E_BIG_DECIMAL;
	public final MigrationModelElement<PrimitiveType> E_BYTE_ARRAY;
	public final MigrationModelElement<PrimitiveType> E_DOUBLE;
	public final MigrationModelElement<PrimitiveType> E_DATE;
	public final MigrationModelElement<PrimitiveType> E_TREE_ITERATOR;
	public final MigrationModelElement<PrimitiveType> E_INTEGER_OBJECT;
	public final MigrationModelElement<PrimitiveType> E_DIAGNOSTIC_CHAIN;
	public final MigrationModelElement<PrimitiveType> E_INT;
	public final MigrationModelElement<PrimitiveType> E_SHORT;
	public final MigrationModelElement<PrimitiveType> E_E_LIST;
	public final MigrationModelElement<PrimitiveType> E_FLOAT_OBJECT;
	public final MigrationModelElement<PrimitiveType> E_JAVA_OBJECT;
	public final MigrationModelElement<PrimitiveType> E_LONG_OBJECT;
	public final MigrationModelElement<PrimitiveType> E_BYTE_OBJECT;
	public final MigrationModelElement<PrimitiveType> E_SHORT_OBJECT;
	public final MigrationModelElement<PrimitiveType> E_CHARACTER_OBJECT;
	public final MigrationModelElement<PrimitiveType> E_BYTE;
	public final MigrationModelElement<PrimitiveType> E_ENUMERATOR;
	public final MigrationModelElement<PrimitiveType> E_BOOLEAN_OBJECT;
	public final MigrationModelElement<PrimitiveType> E_FEATURE_MAP_ENTRY;
	public final MigrationModelElement<PrimitiveType> E_CHAR;
	public final MigrationModelElement<PrimitiveType> E_DOUBLE_OBJECT;
	public final MigrationModelElement<PrimitiveType> E_JAVA_CLASS;
	public final MigrationModelElement<PrimitiveType> E_LONG;
	public final MigrationModelElement<PrimitiveType> E_RESOURCE_SET;
	
	private static Ecore_PrimitiveTypes instance;
	
	public static Ecore_PrimitiveTypes getInstance() {
		if(instance == null)
			instance = new Ecore_PrimitiveTypes();
		return instance;
	}
	
	protected Ecore_PrimitiveTypes() {
		super(PACKAGE_URI);

		E_MAP = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EMap"));
		E_RESOURCE = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EResource"));
		E_BIG_INTEGER = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EBigInteger"));
		E_FLOAT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EFloat"));
		E_BOOLEAN = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EBoolean"));
		E_INVOCATION_TARGET_EXCEPTION = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EInvocationTargetException"));
		E_STRING = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EString"));
		E_FEATURE_MAP = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EFeatureMap"));
		E_BIG_DECIMAL = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EBigDecimal"));
		E_BYTE_ARRAY = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EByteArray"));
		E_DOUBLE = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EDouble"));
		E_DATE = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EDate"));
		E_TREE_ITERATOR = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("ETreeIterator"));
		E_INTEGER_OBJECT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EIntegerObject"));
		E_DIAGNOSTIC_CHAIN = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EDiagnosticChain"));
		E_INT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EInt"));
		E_SHORT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EShort"));
		E_E_LIST = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EEList"));
		E_FLOAT_OBJECT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EFloatObject"));
		E_JAVA_OBJECT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EJavaObject"));
		E_LONG_OBJECT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("ELongObject"));
		E_BYTE_OBJECT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EByteObject"));
		E_SHORT_OBJECT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EShortObject"));
		E_CHARACTER_OBJECT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("ECharacterObject"));
		E_BYTE = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EByte"));
		E_ENUMERATOR = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EEnumerator"));
		E_BOOLEAN_OBJECT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EBooleanObject"));
		E_FEATURE_MAP_ENTRY = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EFeatureMapEntry"));
		E_CHAR = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EChar"));
		E_DOUBLE_OBJECT = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EDoubleObject"));
		E_JAVA_CLASS = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EJavaClass"));
		E_LONG = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("ELong"));
		E_RESOURCE_SET = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("EResourceSet"));
	}
}

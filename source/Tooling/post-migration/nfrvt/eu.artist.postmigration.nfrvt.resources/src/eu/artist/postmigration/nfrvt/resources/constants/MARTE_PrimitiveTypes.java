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

import eu.artist.postmigration.nfrvt.lang.util.MARTEResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * A convenience class that provides access to all MARTE Primitive Types
 * through constants. The package containing those types is located 
 * {@link MARTE_PrimitiveTypes#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class MARTE_PrimitiveTypes  extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = MARTEResourcesUtil.MARTE_LIBRARY_URI_STRING + "#_dDxjEAeNEdytasR0-Ec7ew";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);

	public interface Element {
		final Package PACKAGE = MARTE_PrimitiveTypes.getInstance().PACKAGE.getElement();
		
		final PrimitiveType REAL = MARTE_PrimitiveTypes.getInstance().REAL.getElement();
		final PrimitiveType DATE_TIME = MARTE_PrimitiveTypes.getInstance().DATE_TIME.getElement();
		final PrimitiveType STRING = MARTE_PrimitiveTypes.getInstance().STRING.getElement();
		final PrimitiveType BOOLEAN = MARTE_PrimitiveTypes.getInstance().BOOLEAN.getElement();
		final PrimitiveType INTEGER = MARTE_PrimitiveTypes.getInstance().INTEGER.getElement();
		final PrimitiveType UNLIMITED_NATURAL = MARTE_PrimitiveTypes.getInstance().UNLIMITED_NATURAL.getElement();
	}

	public interface FQN {
		final String PACKAGE = MARTE_PrimitiveTypes.getInstance().PACKAGE.getFullyQualifiedName();
		
		final String REAL = MARTE_PrimitiveTypes.getInstance().REAL.getFullyQualifiedName();
		final String DATE_TIME = MARTE_PrimitiveTypes.getInstance().DATE_TIME.getFullyQualifiedName();
		final String STRING = MARTE_PrimitiveTypes.getInstance().STRING.getFullyQualifiedName();
		final String BOOLEAN = MARTE_PrimitiveTypes.getInstance().BOOLEAN.getFullyQualifiedName();
		final String INTEGER = MARTE_PrimitiveTypes.getInstance().INTEGER.getFullyQualifiedName();
		final String UNLIMITED_NATURAL = MARTE_PrimitiveTypes.getInstance().UNLIMITED_NATURAL.getFullyQualifiedName();
	}

	public interface Uri {
		final String PACKAGE = MARTE_PrimitiveTypes.getInstance().PACKAGE.getUri();
		
		final String REAL = MARTE_PrimitiveTypes.getInstance().REAL.getUri();
		final String DATE_TIME = MARTE_PrimitiveTypes.getInstance().DATE_TIME.getUri();
		final String STRING = MARTE_PrimitiveTypes.getInstance().STRING.getUri();
		final String BOOLEAN = MARTE_PrimitiveTypes.getInstance().BOOLEAN.getUri();
		final String INTEGER = MARTE_PrimitiveTypes.getInstance().INTEGER.getUri();
		final String UNLIMITED_NATURAL = MARTE_PrimitiveTypes.getInstance().UNLIMITED_NATURAL.getUri();
	}

	public final MigrationModelElement<PrimitiveType> REAL;
	public final MigrationModelElement<PrimitiveType> DATE_TIME;
	public final MigrationModelElement<PrimitiveType> STRING;
	public final MigrationModelElement<PrimitiveType> BOOLEAN;
	public final MigrationModelElement<PrimitiveType> INTEGER;
	public final MigrationModelElement<PrimitiveType> UNLIMITED_NATURAL;
	
	private static MARTE_PrimitiveTypes instance;
	
	public static MARTE_PrimitiveTypes getInstance() {
		if(instance == null)
			instance = new MARTE_PrimitiveTypes();
		return instance;
	}
	
	protected MARTE_PrimitiveTypes() {
		super(PACKAGE_URI);
		
		REAL = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("Real"));
		DATE_TIME = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("DateTime"));
		STRING = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("String"));
		BOOLEAN = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("Boolean"));
		INTEGER = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("Integer"));
		UNLIMITED_NATURAL = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("UnlimitedNatural"));
	}
}

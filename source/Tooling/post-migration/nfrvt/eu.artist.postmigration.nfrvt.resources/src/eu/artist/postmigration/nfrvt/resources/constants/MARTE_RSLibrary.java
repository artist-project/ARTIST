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
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Package;

import eu.artist.postmigration.nfrvt.lang.util.MARTEResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * A convenience class that provides access to all MARTE RS Library Types
 * and their enumeration values through constants. The package containing 
 * those types is located {@link MARTE_RSLibrary#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class MARTE_RSLibrary extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = MARTEResourcesUtil.MARTE_LIBRARY_URI_STRING + "#_RTwjABgzEdyHL91mBnoLNQ";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);
	
	public interface Element {
		final Package PACKAGE = MARTE_RSLibrary.getInstance().PACKAGE.getElement();
		
		final DataType SHAPE_SPECIFICATION = MARTE_RSLibrary.getInstance().SHAPE_SPECIFICATION.getElement();
		final DataType TILER_SPECIFICATION = MARTE_RSLibrary.getInstance().TILER_SPECIFICATION.getElement();
	}

	public interface FQN {
		final String PACKAGE = MARTE_RSLibrary.getInstance().PACKAGE.getFullyQualifiedName();
		
		final String SHAPE_SPECIFICATION = MARTE_RSLibrary.getInstance().SHAPE_SPECIFICATION.getFullyQualifiedName();
		final String TILER_SPECIFICATION = MARTE_RSLibrary.getInstance().TILER_SPECIFICATION.getFullyQualifiedName();
	}

	public interface Uri {
		final String PACKAGE = MARTE_RSLibrary.getInstance().PACKAGE.getUri();
		
		final String SHAPE_SPECIFICATION = MARTE_RSLibrary.getInstance().SHAPE_SPECIFICATION.getUri();
		final String TILER_SPECIFICATION = MARTE_RSLibrary.getInstance().TILER_SPECIFICATION.getUri();
	}
	
	private static MARTE_RSLibrary instance;
	
	public static MARTE_RSLibrary getInstance() {
		if(instance == null)
			instance = new MARTE_RSLibrary();
		return instance;
	}
	
	public final MigrationModelElement<DataType> SHAPE_SPECIFICATION;
	public final MigrationModelElement<DataType> TILER_SPECIFICATION;
	
	protected MARTE_RSLibrary() {
		super(PACKAGE_URI);

		SHAPE_SPECIFICATION = new MigrationModelElement<DataType>(getDataTypeByName("ShapeSpecification"));
		TILER_SPECIFICATION = new MigrationModelElement<DataType>(getDataTypeByName("TilerSpecification"));
	}
}

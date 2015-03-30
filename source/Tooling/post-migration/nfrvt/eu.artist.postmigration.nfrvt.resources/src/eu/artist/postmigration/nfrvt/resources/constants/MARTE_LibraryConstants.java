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

import eu.artist.postmigration.nfrvt.lang.util.MARTEResourcesUtil;

/**
 * The MARTE library constants hold a link to all sub packages of 
 * the MARTE library as well as the uri information about the
 * library location.
 * 
 * @author Martin Fleck
 *
 */
public class MARTE_LibraryConstants {
	public static final String LIBRARY_URI_STRING = MARTEResourcesUtil.MARTE_LIBRARY_URI_STRING;
	public static final URI LIBRARY_URI = MARTEResourcesUtil.MARTE_LIBRARY_URI;

	public static final MARTE_PrimitiveTypes PRIMITIVE_TYPES = MARTE_PrimitiveTypes.getInstance();
	public static final MARTE_MeasurementUnits MEASUREMENT_UNITS = MARTE_MeasurementUnits.getInstance();
	public static final MARTE_GRMBasicTypes GRM_BASIC_TYPES = MARTE_GRMBasicTypes.getInstance();
	public static final MARTE_DataTypes DATA_TYPES = MARTE_DataTypes.getInstance();
	public static final MARTE_BasicNFPTypes BASIC_NFP_TYPES = MARTE_BasicNFPTypes.getInstance();
	public static final MARTE_TimeTypesLibrary TIME_TYPES_LIBRARY = MARTE_TimeTypesLibrary.getInstance();
	public static final MARTE_TimeLibrary TIME_LIBRARY = MARTE_TimeLibrary.getInstance();
	public static final MARTE_RSLibrary RS_LIBRARY = MARTE_RSLibrary.getInstance();
}

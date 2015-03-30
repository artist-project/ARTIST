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
package eu.artist.postmigration.nfrvt.lang.common;

import java.util.Collection;

import org.eclipse.emf.mwe.utils.Mapping;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

/**
 * A convenience class to declare the standalone setup in model workflow files 
 * (mwe). It provides methods to specify the usage of common packages and 
 * libraries, e.g., Ecore, UML or MARTE, as well as of the ARTIST migration 
 * languages, e.g., the goal modeling language GML.
 * <p/>
 * As single point of configuration, the class 
 * {@link ARTISTStandaloneUsageDependencies} is used.
 * 
 * @author Martin Fleck
 * @see ARTISTStandaloneUsageDependencies
 *
 */
public class ARTISTStandaloneSetup extends StandaloneSetup {
	
	private ARTISTStandaloneUsageDependencies usageDependencies = new ARTISTStandaloneUsageDependencies();
	
	public ARTISTStandaloneSetup() {
		setScanClassPath(true);
	}
	
	public ARTISTStandaloneUsageDependencies getUsageDependencies() {
		return usageDependencies;
	}
	
	/**
	 * Sets the usage dependency configuration for this standalone setup.
	 * 
	 * @param usageDependencies
	 */
	public void setUsageDependencies(ARTISTStandaloneUsageDependencies usageDependencies) {
		this.usageDependencies = usageDependencies;
		if(usageDependencies != null) {
			// order of the following calls is important.
			addUriMaps(usageDependencies.getMappings());
			addRegisterGeneratedEPackages(usageDependencies.getGeneratedEPackages());
			addRegisterGenModelFiles(usageDependencies.getGenModelFiles());
		}
	}
	
	protected void addUriMaps(Collection<Mapping> maps) {
		for(Mapping m : maps)
			addUriMap(m);
	}
	
	protected void addRegisterGeneratedEPackages(Collection<String> generatedEPackages) {
		for(String p : generatedEPackages)
			addRegisterGeneratedEPackage(p);
	}
	
	protected void addRegisterGenModelFiles(Collection<String> genModelFiles) {
		for(String g : genModelFiles)
			addRegisterGenModelFile(g);
	}
}

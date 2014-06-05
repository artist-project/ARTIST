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
package eu.artist.postmigration.nfrvt.lang.util.mwe;

import java.util.Collection;

import org.eclipse.emf.mwe.utils.Mapping;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

public class ARTISTStandaloneSetup extends StandaloneSetup {
	
	private ARTISTStandaloneUsageDependencies usageDependencies = new ARTISTStandaloneUsageDependencies();
	
	public ARTISTStandaloneSetup() {
		setScanClassPath(true);
	}
	
	public ARTISTStandaloneUsageDependencies getUsageDependencies() {
		return usageDependencies;
	}
	
	public void setUsageDependencies(ARTISTStandaloneUsageDependencies usageDependencies) {
		this.usageDependencies = usageDependencies;
		if(usageDependencies != null) {
			addUriMaps(usageDependencies.getMappings());
			addRegisterGeneratedEPackages(usageDependencies.getGeneratedEPackages());
			addRegisterGenModelFiles(usageDependencies.getGenModelFiles());
		}
	}
	
	public void addUriMaps(Collection<Mapping> maps) {
		for(Mapping m : maps)
			addUriMap(m);
	}
	
	public void addRegisterGeneratedEPackages(Collection<String> generatedEPackages) {
		for(String p : generatedEPackages)
			addRegisterGeneratedEPackage(p);
	}
	
	public void addRegisterGenModelFiles(Collection<String> genModelFiles) {
		for(String g : genModelFiles)
			addRegisterGenModelFile(g);
	}
}

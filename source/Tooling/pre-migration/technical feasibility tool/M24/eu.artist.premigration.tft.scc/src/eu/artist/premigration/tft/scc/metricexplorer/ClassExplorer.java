/*
* Copyright (c) 2014 Tecnalia.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*
*Zurik Corera (Tecnalia)-SCC component implementation
*
*
*
*
*Initially developed in the context of ARTIST EU project www.artist-project.eu
*/ 

package eu.artist.premigration.tft.scc.metricexplorer;

import java.io.File;
import java.util.ArrayList;

import eu.artist.premigration.tft.scc.structures.SourceFile;


public interface ClassExplorer {
	public SourceFile findMethodsParser(File file) throws Exception;
	public SourceFile findMethodsParser(File file, ArrayList<Integer> lines) throws Exception;
		
}

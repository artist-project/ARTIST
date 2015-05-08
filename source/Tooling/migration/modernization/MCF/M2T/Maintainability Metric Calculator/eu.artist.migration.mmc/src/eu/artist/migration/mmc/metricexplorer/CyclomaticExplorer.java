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

package eu.artist.migration.mmc.metricexplorer;

import java.util.Arrays;
import java.util.List;

public class CyclomaticExplorer {
	private List<String> cyclomaticList = Arrays.asList(new String[]{"if","while","for","foreach","case","default","continue","goto","catch", "&&", "||"});
	private int cyclomaticComplexity=1;

	
	private void restoreComplexity(){
		cyclomaticComplexity=1;
	}
	
	
	public int getCyclomatic(String source){
		restoreComplexity();
		for (String str :cyclomaticList){
			countInstances(source, str);
		}
		
		return cyclomaticComplexity;
	}
	
	public int countInstances(String source, String str){
		int pos=source.indexOf(str+" ");
		if (pos>=0){
			cyclomaticComplexity++;
			countInstances(source.substring(pos+str.length()+1), str);
		}else{
			return cyclomaticComplexity;
		}
		
		return cyclomaticComplexity;
	}
	
	
}

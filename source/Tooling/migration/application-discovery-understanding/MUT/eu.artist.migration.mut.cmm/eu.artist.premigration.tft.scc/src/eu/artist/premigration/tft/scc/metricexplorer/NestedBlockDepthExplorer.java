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


public class NestedBlockDepthExplorer {
	private int maxNBD=0;
	private int actualNBD=0;

	
	public int getNDB(String source){
		restoreNDB();
		getDepth(source);
		return maxNBD;
	}
	
	private void restoreNDB(){
		maxNBD=0;
		actualNBD=0;
	}
	
	
	private void getDepth(String source){
		int increment=source.indexOf("{");
		int decrement=source.indexOf("}");
		if (increment>=0){
			if (decrement>increment){
				actualNBD++;
				if (actualNBD>=maxNBD){
					maxNBD=actualNBD;
				}
				getDepth(source.substring(increment+1));
			}else{
				actualNBD--;
				getDepth(source.substring(decrement+1));
			}
		}
		
	}
	
	

}

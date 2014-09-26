/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mdt.dotnet.sharepointmodel2uml.client;

public class Util {
	
	public static String getQualifiedName(String id) {
		return id.replaceAll("\\s+","");
	}
	
	public static String findParentType(String id) {
		int i = id.indexOf("00");
		
		if(i == -1) {
			return id.substring(0, id.length() - 2);
		}
		else {
			return id.substring(0, id.indexOf("00"));
		}
	}
}

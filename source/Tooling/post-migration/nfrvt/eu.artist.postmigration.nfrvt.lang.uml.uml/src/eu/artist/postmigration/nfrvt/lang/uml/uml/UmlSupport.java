/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * - Martin Fleck (not itemis): Added doSetup() method
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.uml.uml;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class UmlSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		return new UmlRuntimeModule();
	}
	
	public static void doSetup() {
		new UmlSupport().preInvoke();
	}

}
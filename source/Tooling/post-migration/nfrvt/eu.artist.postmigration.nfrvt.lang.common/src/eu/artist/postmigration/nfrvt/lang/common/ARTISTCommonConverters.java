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

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter;

import com.google.inject.Inject;

/**
 * Converters for Strings, Integers, IDs, qualified names and qualified names
 * with wildcards.
 * 
 * @author Martin Fleck
 *
 */
public class ARTISTCommonConverters extends DefaultTerminalConverters {

	@Inject
	QualifiedNameValueConverter qnConverter;
	
	@ValueConverter(rule = "QualifiedName")
    public IValueConverter<String> QualifiedName() {
		return qnConverter;
    }
	
	@ValueConverter(rule = "QualifiedNameWithWildcard")
    public IValueConverter<String> QualifiedNameWithWildcard() {
		return qnConverter;
    }
}

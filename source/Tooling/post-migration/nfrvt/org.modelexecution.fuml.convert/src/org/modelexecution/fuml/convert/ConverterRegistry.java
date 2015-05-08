/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.convert;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.service.log.LogService;

import fUML.Syntax.Activities.IntermediateActivities.Activity;

/**
 * Registry maintaining the registered {@link IConverter converters} for
 * converting arbitrary objects into fUML {@link Activity activities}.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 */
public class ConverterRegistry {

	private static final String CLASS_ATTRIBUTE = "class"; //$NON-NLS-1$
	private static String ICONVERTER_ID = "org.modelexecution.fuml.convert.converter"; //$NON-NLS-1$
	private static ConverterRegistry instance;

	private Collection<IConverter> registeredConverter;

	private ConverterRegistry() {
		loadRegisteredConverters();
	}

	private void loadRegisteredConverters() {
		initRegisteredConverterCollection();
		obtainConvertersFromRegistry();
	}

	private void initRegisteredConverterCollection() {
		registeredConverter = new HashSet<IConverter>();
	}

	private void obtainConvertersFromRegistry() {
		if(!Platform.isRunning())
			return;
		
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(ICONVERTER_ID);
		for (IConfigurationElement element : config) {
			try {
				Object classObject = element
						.createExecutableExtension(CLASS_ATTRIBUTE);
				if (classObject instanceof IConverter) {
					registeredConverter.add((IConverter) classObject);
				}
			} catch (CoreException e) {
				FUMLConvertPlugin.instance.getLog().log(LogService.LOG_ERROR,
						"Exception while obtaining registered converters", e);
			}
		}
	}

	/**
	 * Returns the singleton instance of this registry.
	 * 
	 * @return the singleton instance of this registry.
	 */
	public static ConverterRegistry getInstance() {
		if (instance == null) {
			instance = new ConverterRegistry();
		}
		return instance;
	}

	/**
	 * Specifies whether there is a converter available for the specified
	 * {@code input}.
	 * 
	 * @param input
	 *            to check for.
	 * @return <code>true</code> if there is a converter available; otherwise
	 *         <code>false</code>.
	 */
	public boolean haveConverter(Object input) {
		return getConverter(input) != null;
	}

	/**
	 * Returns a registered converter for the specified {@code input}, if
	 * available. If there is no converter available for {@code input}, this
	 * method returns <code>null</code>.
	 * 
	 * @param input
	 *            to get converter for.
	 * @return the converter or <code>null</code> if no converter is available.
	 */
	public IConverter getConverter(Object input) {
		for (IConverter converter : registeredConverter) {
			if (converter.canConvert(input)) {
				return converter;
			}
		}
		return null;
	}

}

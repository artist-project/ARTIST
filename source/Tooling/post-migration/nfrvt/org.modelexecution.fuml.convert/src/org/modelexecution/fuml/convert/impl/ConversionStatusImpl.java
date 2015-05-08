/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.convert.impl;

import org.eclipse.core.runtime.MultiStatus;
import org.modelexecution.fuml.convert.IConversionStatus;

/**
 * Default implementation of the {@link IConversionStatus}.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public class ConversionStatusImpl extends MultiStatus implements IConversionStatus {

	public ConversionStatusImpl(String pluginId, int code, String message, Throwable exception) {
		super(pluginId, code, message, exception);
	}

}

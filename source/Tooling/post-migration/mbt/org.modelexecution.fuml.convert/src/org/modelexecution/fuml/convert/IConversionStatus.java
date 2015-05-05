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

import org.eclipse.core.runtime.IStatus;

/**
 * The status of a conversion performed by a {@link IConverter}.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public interface IConversionStatus extends IStatus {

	int CANNOT_CONVERT_INPUT_ERROR = 500;
	int ERROR_WHILE_CONVERSION = 501;

}

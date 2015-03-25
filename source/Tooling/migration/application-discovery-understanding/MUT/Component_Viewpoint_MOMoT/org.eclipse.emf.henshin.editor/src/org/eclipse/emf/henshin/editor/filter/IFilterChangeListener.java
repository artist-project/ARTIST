/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.filter;

/**
 * Interface through which objects may be notified of changes to the filter
 * settings.
 * 
 * @author Gregor Bonifer
 * 
 */
public interface IFilterChangeListener {
	
	void filterChanged();

}

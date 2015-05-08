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
package eu.artist.postmigration.nfrvt.lang.common.renderer;

import java.util.Collection;

/**
 * An {@link ITextRenderer} provides methods for rendering objects to 
 * {@link String}s.
 * @author Martin Fleck
 *
 */
public interface ITextRenderer {
	/**
	 * Renders the given object into a {@link String}.
	 * @param obj object to be rendered.
	 * @return String representation of the given object.
	 */
	public String doRender(Object obj);
	
	/**
	 * Renders the given list of objects into a single {@link String} 
	 * representation.
	 * @param leftParenthesis String used before the collection representation
	 * @param rightParenthesis String used after the collection representation
	 * @param delimiter String used between the objects
	 * @param objects objects to be rendered
	 * @return single {@link String} representation of the given objects
	 */
	public String doRender(String leftParenthesis, String rightParenthesis, String delimiter, Object... objects);
	
	/**
	 * Renders the given list of objects into a single {@link String} 
	 * representation. This is equal to calling 
	 * {@link #doRender(String, String, String, Object...)} with '(' and ')' as
	 * the parenthesis and ', ' as delimiter.
	 * @param objects objects to be rendered
	 * @return {@link String} representation of the given objects
	 */
	public String doRender(Object... objects);
	
	/**
	 * Renders the given list of objects into a single {@link String} 
	 * representation.
	 * @param leftParenthesis String used before the collection representation
	 * @param rightParenthesis String used after the collection representation
	 * @param delimiter String used between the objects
	 * @param objects objects to be rendered
	 * @return single {@link String} representation of the given objects
	 */
	public String doRender(String leftParenthesis, String rightParenthesis, String delimiter, Collection<? extends Object> objects);
	
	/**
	 * Renders the given list of objects into a single {@link String} 
	 * representation. This is equal to calling 
	 * {@link #doRender(String, String, String, Collection)} with '(' and ')' as
	 * the parenthesis and ', ' as delimiter.
	 * @param objects objects to be rendered
	 * @return {@link String} representation of the given objects
	 */
	public String doRender(Collection<? extends Object> objects);
}

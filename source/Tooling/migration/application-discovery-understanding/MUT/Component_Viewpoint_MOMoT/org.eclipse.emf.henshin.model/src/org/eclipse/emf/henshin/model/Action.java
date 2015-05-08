/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * This class represents an action of a {@link GraphElement}. Actions consist of:
 * <ul>
 * <li>an action type,</li>
 * <li>a Boolean multi flag,</li>
 * <li>a possibly empty path (only if the multi flag is <code>true</code>),</li>
 * <li>an optional fragment.</li>
 * </ul>
 * </p>
 * <p>
 * Since version 0.9.3, the syntax of actions is as follows:
 * ...
 * </p>
 * 
 * <p>
 * Some basic examples (all examples shown with surrounding &laquo;..&raquo;):
 * <ul>
 * <li><span style="color:gray">&laquo;preserve&raquo;</span> Preserve a graph element.</li>
 * <li><span style="color:green">&laquo;create&raquo;</span> Create a graph element.</li>
 * <li><span style="color:red">&laquo;delete&raquo;</span> Delete a graph element.</li>
 * <li><span style="color:brown">&laquo;require&raquo;</span> Require the existence of a graph element.</li>
 * <li><span style="color:blue">&laquo;forbid&raquo;</span> Forbid the existence of a graph element.</li>
 * </ul>
 * </p>
 * 
 * <p>
 * Examples of named positive and negative application conditions (PACs and NACs):
 * <ul>
 * <li><span style="color:brown">&laquo;require#1&raquo;</span> Graph element is part of a PAC named <i>1</i>.</li>
 * <li><span style="color:blue">&laquo;forbid#myNAC&raquo;</span> Graph is element of a NAC named <i>myNAC</i>.</li>
 * </ul>
 * </p>
 * 
 * <p>
 * Examples of (nested) multi-rules:
 * <ul>
 * <li><span style="color:gray">&laquo;preserve*&raquo;</span> Preserve all matching graph elements (default multi-rule).</li>
 * <li><span style="color:red">&laquo;delete*&#47;multi&raquo;</span> Delete all matching graph elements (multi-rule <i>multi</i>).</li>
 * <li><span style="color:green">&laquo;create*&#47;my/nested/rule&raquo;</span> Create a graph element in a nested multi rule.</li>
 * <li><span style="color:brown">&laquo;require*&#47;my/nested/rule#1&raquo;</span> Named PAC in a nested multi-rule.</li>
 * <li><span style="color:blue">&laquo;forbid*&#47;my/nested/rule#myNAC&raquo;</span> Named NAC in a nested multi-rule.</li>
 * </ul>
 * </p>
 * 
 * @author Christian Krause
 * @author Stefan Jurack
 */
public final class Action {

	/**
	 * An enum for action types.
	 * @author Christian Krause
	 */
	public static enum Type {
		
		// The following action types are supported:
		PRESERVE, CREATE, DELETE, FORBID, REQUIRE;
		
		/**
		 * Parse an element action type.
		 * @param value String representation of the action type.
		 * @return The parsed action type.
		 * @throws ParseException On parse errors.
		 */
		public static Type parse(String value) throws ParseException {
			value = value.trim();
			for (Type type : values()) {
				if (type.name().equalsIgnoreCase(value)) return type;
			}
			// Some convenience...
			if ("remove".equalsIgnoreCase(value)) {
				return DELETE;
			}
			if ("new".equalsIgnoreCase(value)) {
				return CREATE;
			}
			if ("none".equalsIgnoreCase(value)) {
				return PRESERVE;
			}
			throw new ParseException("Unknown action type: " + value, 0);
		}
			
		/*
		 * (non-Javadoc)
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
		
	}
	
	/**
	 * Separator for paths.
	 */
	public static final char PATH_SEPARATOR = '/';

	/**
	 * Multi-flag marker.
	 */
	public static final char MULTI_MARKER = '*';

	/**
	 * Fragment marker.
	 */
	public static final char FRAGMENT_START = '#';

	// Empty string array.
	private static final String[] EMPTY_STRING_ARRAY = new String[0];

	// Action type.
	private final Type type;

	// Multi flag.
	private final boolean isMulti;

	// Path.
	private final String[] path;

	// Fragment:
	private final String fragment;
	
	/**
	 * Constructor.
	 * @param type Action type.
	 * @param isMulti Multi flag.
	 * @param path Path.
	 * @param fragment Fragment.
	 */
	public Action(Type type, boolean isMulti, String[] path, String fragment) {
		if (type==null) {
			throw new IllegalArgumentException("Action type must not be null.");
		}
		this.type = type;
		this.isMulti = isMulti;
		if (path!=null) {
			this.path = new String[path.length];
			for (int i=0; i<path.length; i++) {
				this.path[i] = (path[i]!=null) ? path[i] : "";
			}
		} else {
			this.path = EMPTY_STRING_ARRAY;
		}
		this.fragment = (fragment==null || fragment.trim().length()==0) ? 
						null : fragment.trim();
	}

	/**
	 * Constructor without fragment.
	 * @param type Action type.
	 * @param isMulti Multi flag.
	 * @param path Path.
	 */
	public Action(Type type, boolean isMulti, String[] path) {
		this(type, isMulti, path, null);
	}

	/**
	 * Constructor without path and fragment.
	 * @param type Action type.
	 * @param isMulti Multi flag.
	 */
	public Action(Type type, boolean isMulti) {
		this(type, isMulti, null, null);
	}

	/**
	 * Constructor without multi-flag, path and fragment.
	 * @param type Action type.
	 */
	public Action(Type type) {
		this(type, false, null, null);
	}

	/**
	 * Parses an action string for graph elements.
	 * @param value String representation of the action.
	 * @return The parsed element action.
	 * @throws ParseException On parse errors.
	 */
	public static Action parse(String value) throws ParseException {
		
		// Null?
		if (value==null) {
			throw new NullPointerException();
		}
		
		// Trim whitespace and convert to char array:
		char[] chars = value.trim().toCharArray();
		
		// Empty string?
		if (chars.length==0) {
			throw new ParseException("Empty string", 0);
		}
		int pos = 0;

		// Parse the action type:
		String type = "";
		while (pos<chars.length && Character.isLetter(chars[pos])) {
			type = type + chars[pos++];
		}
		
		// Eat whitespace:
		while (pos<chars.length && Character.isWhitespace(chars[pos])) {
			pos++;
		}
		
		// Check for the multi-marker:
		boolean isMulti = false;
		if (pos<chars.length && chars[pos]==MULTI_MARKER) {
			isMulti = true;
			pos++;
		}
		
		// Eat whitespace:
		while (pos<chars.length && Character.isWhitespace(chars[pos])) {
			pos++;
		}
		
		// Check if there is a path:
		String[] path = EMPTY_STRING_ARRAY;
		if (pos<chars.length && chars[pos]==PATH_SEPARATOR) {
			pos++;
			List<String> pathList = new ArrayList<String>();
			pathList.add("");
			while (pos<chars.length) {
				if (Character.isJavaIdentifierPart(chars[pos])) {
					String newValue = pathList.get(pathList.size()-1) + chars[pos];
					pathList.set(pathList.size()-1, newValue);
				}
				else if (chars[pos]==PATH_SEPARATOR) {
					pathList.add("");
				}
				else {
					break;
				}
				pos++;
			}
			path = pathList.toArray(path);
		}

		// Check for the fragment:
		String fragment = null;
		if (pos<chars.length && chars[pos]==FRAGMENT_START) {
			fragment = "";
			pos++;
			while (pos<chars.length && Character.isJavaIdentifierPart(chars[pos])) {
				fragment = fragment + chars[pos++];
			}
		}
		
		// Now we MUST be at the end:
		if (pos<chars.length) {
			throw new ParseException("Unexpected character at position " + pos, pos);
		}
		
		// Create and return the new action:
		return new Action(Type.parse(type), isMulti, path, fragment);
		
	}

	/**
	 * Returns the type of this action. This never returns <code>null</code>.
	 * @return The action type.
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Get the multi flag. 
	 * @return Multi flag.
	 */
	public boolean isMulti() {
		return isMulti;
	}

	/**
	 * Returns path this action contains. If no path was specified, this method 
	 * returns an empty string array. This never returns <code>null</code>.
	 * @return The path.
	 */
	public String[] getPath() {
		return Arrays.copyOf(path , path.length);
	}
	
	/**
	 * Returns the fragment of this action or <code>null</code> if it does not have a fragment.
	 * @return The fragment or <code>null</code>.
	 */
	public String getFragment() {
		return fragment;
	}

	/**
	 * Returns <code>true</code> if this action has the same type as the argument action.
	 * @param action An action.
	 * @return <code>true</code> if it has the same type.
	 */
	public boolean hasSameType(Action action) {
		return type==action.type;
	}

	/**
	 * Returns <code>true</code> if this action has the same multi-flag as the argument action.
	 * @param action An action.
	 * @return <code>true</code> if it has the same multi-flag.
	 */
	public boolean hasSameMultiFlag(Action action) {
		return isMulti==action.isMulti;
	}

	/**
	 * Returns <code>true</code> if this action has the same path as the argument action.
	 * @param action An action.
	 * @return <code>true</code> if it has the same path.
	 */
	public boolean hasSamePath(Action action) {
		return Arrays.equals(path, action.path);
	}

	/**
	 * Returns <code>true</code> if this action has the same fragment as the argument action.
	 * @param action An action.
	 * @return <code>true</code> if it has the same fragment.
	 */
	public boolean hasSameFragment(Action action) {
		if (fragment==null) {
			return action.fragment==null;
		}
		return fragment.equals(action.fragment);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int hash = type.hashCode();
		for (String elem : path) {
			hash = (hash + elem.hashCode()) << 1;
		}
		if (isMulti) {
			hash++;
		}
		if (fragment!=null) {
			hash += fragment.hashCode();			
		}
		return hash;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object object) {
		if (object==this) {
			return true;
		}
		if (object instanceof Action) {
			Action action = (Action) object;
			return (hasSameType(action) && hasSameMultiFlag(action) &&
					hasSamePath(action) && hasSameFragment(action));
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(type.toString());
		if (isMulti){
			result.append(MULTI_MARKER);
		}
		if (path.length > 0) {
			for (int i=0; i<path.length; i++) {
				result.append(PATH_SEPARATOR);
				result.append(path[i]);
			}
		}
		if (fragment!=null) {
			result.append(FRAGMENT_START);
			result.append(fragment);
		}
		return result.toString();
	}
	
}

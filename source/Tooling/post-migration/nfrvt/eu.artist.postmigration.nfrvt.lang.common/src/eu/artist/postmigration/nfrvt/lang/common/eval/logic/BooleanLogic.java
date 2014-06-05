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
package eu.artist.postmigration.nfrvt.lang.common.eval.logic;

public class BooleanLogic {
	
	/***
	 * 
	 *  ___|_T_|_U_|_F_|
	 *   T | T | U | F |
	 *   U | T | U | U |
	 *   F | T | T | T |
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static Boolean implies(Boolean left, Boolean right) {
		return or(not(left), right);
	}
	
	/***
	 * 
	 *  ___|_T_|_U_|_F_|
	 *   T | T | U | F |
	 *   U | U | U | F |
	 *   F | F | F | F |
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static Boolean and(Boolean left, Boolean right) {
		if(left != null && right != null)
			return left && right;
		
		if(left != null && left == false)
			return false;
		
		if(right != null && right == false)
			return false;
		
		return null;
	}
	
	/***
	 * 
	 *  ___|_T_|_U_|_F_|
	 *   T | T | T | T |
	 *   U | T | U | U |
	 *   F | T | U | F |
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static Boolean or(Boolean left, Boolean right) {
		if(left == null || right == null) {
			if(left != null && left ||
     		   right != null && right)
				return true; // true or null
			return null; // null or null
		}
		if(!left && !right)
			return false;
		return true;
	}
	
	/***
	 * 
	 *  ___|_T_|_U_|_F_|
	 *   T | F | U | T |
	 *   U | U | U | U |
	 *   F | T | U | F |
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static Boolean xor(Boolean left, Boolean right) {
		if(left == null || right == null) 
			return null; // // null xor (true|false)
		if(left == right)
			return false; // true xor true || false xor false
		return true; // true xor false
	}
	
	/***
	 * 
	 *  ___|___|
	 *   T | F |
	 *   U | U |
	 *   F | T |
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static Boolean not(Boolean value) {
		if(value == null)
			return null;
		return !value;
	}
	
	/***
	 * 
	 *  ___|_T_|_U_|_F_|
	 *   T | T | U | F |
	 *   U | U | T | U |
	 *   F | F | U | T |
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static Boolean equals(Boolean left, Boolean right) {
		if(left == null && right == null)
			return true; // null == null
		if(left == null || right == null)
			return null; // null == (true|false)
		return left == right;
	}
	
	/***
	 * 
	 *  ___|_T_|_U_|_F_|
	 *   T | F | U | T |
	 *   U | U | F | U |
	 *   F | T | U | F |
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static Boolean unequals(Boolean left, Boolean right) {
		return not(equals(left, right));
	}
}

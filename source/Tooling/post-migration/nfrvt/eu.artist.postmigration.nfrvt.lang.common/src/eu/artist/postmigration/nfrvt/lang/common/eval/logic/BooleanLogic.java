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

/**
 * A class with static methods to evaluate boolean expressions.
 * 
 * @author Martin Fleck
 */
public class BooleanLogic {
	
	/***
	 * Truth table:
	 * <pre>
	 *             RHS
	 *     ___|_T_|_U_|_F_|    T .. True
	 *      T | T | U | F |    U .. Unknown/Null
	 * LHS  U | T | U | U |    F .. False
	 *      F | T | T | T |
	 * </pre>
	 * 
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return result according to truth table
	 */
	public static Boolean implies(Boolean left, Boolean right) {
		return or(not(left), right);
	}
	
	/***
	 * Truth table:
	 * <pre>
	 *             RHS
	 *     ___|_T_|_U_|_F_|    T .. True
	 *      T | T | U | F |    U .. Unknown/Null
	 * LHS  U | U | U | F |    F .. False
	 *      F | F | F | F |
	 * </pre>
	 * 
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return result according to truth table
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
	 * Truth table:
	 * <pre>
	 *             RHS
	 *     ___|_T_|_U_|_F_|    T .. True
	 *      T | T | T | T |    U .. Unknown/Null
	 * LHS  U | T | U | U |    F .. False
	 *      F | T | U | F |
	 * </pre>
	 * 
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return result according to truth table
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
	 * Truth table:
	 * <pre>
	 *             RHS
	 *     ___|_T_|_U_|_F_|    T .. True
	 *      T | F | U | T |    U .. Unknown/Null
	 * LHS  U | U | U | U |    F .. False
	 *      F | T | U | F |
	 * </pre>
	 * 
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return result according to truth table
	 */
	public static Boolean xor(Boolean left, Boolean right) {
		if(left == null || right == null) 
			return null; // // null xor (true|false)
		if(left == right)
			return false; // true xor true || false xor false
		return true; // true xor false
	}
	
	/***
	 * Truth table:
	 * <pre>
	 *            
	 *        ___|___|    T .. True
	 *         T | F |    U .. Unknown/Null
	 *  value  U | U |    F .. False
	 *         F | T |
	 * </pre>
	 * 
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return result according to truth table 
	 */
	public static Boolean not(Boolean value) {
		if(value == null)
			return null;
		return !value;
	}
	
	/***
	 * Truth table:
	 * <pre>
	 *             RHS
	 *     ___|_T_|_U_|_F_|    T .. True
	 *      T | T | U | F |    U .. Unknown/Null
	 * LHS  U | U | T | U |    F .. False
	 *      F | F | U | T |
	 * </pre>
	 * 
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return result according to truth table
	 */
	public static Boolean equals(Boolean left, Boolean right) {
		if(left == null && right == null)
			return true; // null == null
		if(left == null || right == null)
			return null; // null == (true|false)
		return left == right;
	}
	
	/***
	 * Truth table:
	 * <pre>
	 *             RHS
	 *     ___|_T_|_U_|_F_|    T .. True
	 *      T | F | U | T |    U .. Unknown/Null
	 * LHS  U | U | F | U |    F .. False
	 *      F | T | U | F |
	 * </pre>
	 * 
	 * @param left left-hand side
	 * @param right right-hand side
	 * @return result according to truth table
	 */
	public static Boolean unequals(Boolean left, Boolean right) {
		return not(equals(left, right));
	}
}

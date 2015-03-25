/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.matching.constraints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.matching.conditions.ConditionHandler;

public class DomainSlot {
	
	/**
	 * The variable which will initialize this domain slot. All other variables
	 * which use this slot will only validate their constraints.
	 */
	Variable owner;
	
	/**
	 * Flag that describes whether this domain slot is initialized. After
	 * initialization the domain contains all possible values that are type
	 * compatible with the type constraint of the owner variable.
	 */
	boolean initialized;
	
	/**
	 * Flag that describes whether this domain slot is locked. A slot is locked
	 * if a value from the domain is selected that fulfills the constraints of
	 * the owner variable.
	 */
	boolean locked;
	
	/**
	 * The current fixed value for this domain slot. Instantiate() will pick one
	 * value from the domain.
	 */
	EObject value;
	
	/** 
	 * All possible values this domain slot might use for instantiation. 
	 */
	List<EObject> domain;
	
	/**
	 * A list of required values created by binary constraints from external
	 * variables.
	 */
	List<EObject> temporaryDomain;
	
	/**
	 * All changes done to other domain slots by ReferenceConstraints of
	 * variables that use this domain slot.
	 */
	final Map<BinaryConstraint, DomainChange> remoteChangeMap;
	
	/**
	 * A collection of parameters that were initialized by constraints belonging
	 * to variables of this domain slot.
	 */
	final List<String> initializedParameters;
	
	/**
	 * The handler for all attribute and index conditions. If a parameter constraints
	 * fixes the value of a parameter, the handler checks all conditions.
	 */
	final ConditionHandler conditionHandler;
	
	/**
	 * A collection of variables whose constraints were already validated
	 * against the current value.
	 */
	final Set<Variable> checkedVariables;
	
	/**
	 * A collection of the values of all domain slots that are currently locked.
	 * Required to ensure injectivity.
	 */
	final Set<EObject> usedObjects;

	/**
	 * Flag indicating whether the injective matching should be used.
	 */
	final boolean injective;

	/**
	 * Flag indicating whether the the matcher should check for dangling edges.
	 */
	final boolean dangling;

	/**
	 * Flag indicating whether the matching should be deterministic.
	 */
	final boolean deterministic;

	/**
	 * Flag indicating whether to use inverse matching order.
	 */
	final boolean inverseMatchingOrder;
	
	/**
	 * Constructor.
	 * @param conditionHandler Condition handler to be used.
	 * @param usedObjects Used objects.
	 * @param options Options.
	 */
	public DomainSlot(ConditionHandler conditionHandler, Set<EObject> usedObjects,
			boolean injective, boolean dangling, boolean deterministic, boolean inverseMatchingOrder) {
		
		this.locked = false;
		this.initialized = false;
		this.conditionHandler = conditionHandler;
		this.usedObjects = usedObjects;
		this.remoteChangeMap = new HashMap<BinaryConstraint, DomainChange>();
		this.initializedParameters = new ArrayList<String>();
		this.checkedVariables = new HashSet<Variable>();
		this.injective= injective;
		this.dangling = dangling;
		this.deterministic = deterministic;
		this.inverseMatchingOrder = inverseMatchingOrder;
		
	}
	
	/**
	 * Sets the value of the domain slot.
	 * @param variable Variable to be set.
	 * @param domainMap The domain map to be used.
	 * @param graph The target graph.
	 * @return <code>true</code> if the instantiation was successful.
	 */
	public boolean instantiate(Variable variable, Map<Variable, DomainSlot> domainMap, EGraph graph) {
		
		// Initialize?
		if (!initialized) {
			initialized = true;
			owner = variable;
			
			// If temporaryDomain is not null, there are BinaryConstraints restricting this slot's domain.
			if (temporaryDomain != null) {
				domain = new ArrayList<EObject>(temporaryDomain);
			}
			
			// Set the domain:
			variable.typeConstraint.initDomain(this, graph);
			if (domain.isEmpty()) {
				return false;
			}
			
			// Non-deterministic matching?
			if (!deterministic) {
				Collections.shuffle(domain);
			}
			
			// Injective matching?
			if (injective) {
				domain.removeAll(usedObjects);
			}
		}
		
		// Lock the slot?
		if (!locked) {
			if (domain.isEmpty()) {
				return false;
			}
			if (inverseMatchingOrder) {
				value = domain.remove(domain.size() - 1);
			} else {
				value = domain.remove(0);
			}
			usedObjects.add(value);
			locked = true;
		}
		
		// Check the variable?
		if (!checkedVariables.contains(variable)) {
			
			// Check the type constraint:
			if (!variable.typeConstraint.check(this)) {
				return false;
			}
			
			// Check the dangling constraints:
			if (dangling) {
				for (DanglingConstraint constraint : variable.danglingConstraints) {
					if (!constraint.check(value, graph)) {
						return false;
					}
				}
			}

			// Check the attribute constraints:
			for (AttributeConstraint constraint : variable.attributeConstraints) {
				if (!constraint.isConstantValue) {
					if (!conditionHandler.isSet((String) constraint.value)) {
						initializedParameters.add((String) constraint.value);
					}
				}
				if (!constraint.check(this)) {
					return false;
				}
				UnaryConstraint unaryUserConstraint = variable.attributeUserConstraints.get(constraint);
				if (unaryUserConstraint != null){
					if (!unaryUserConstraint.check(this)){
						return false;
					}
				}
			}

			// Check the containment constraints:
			for (ContainmentConstraint constraint : variable.containmentConstraints) {
				DomainSlot targetSlot = domainMap.get(constraint.targetVariable);
				if (!constraint.check(this, targetSlot)) {
					return false;
				}
			}
			
			// Check the reference constraints:
			for (ReferenceConstraint constraint : variable.referenceConstraints) {
				DomainSlot targetSlot = domainMap.get(constraint.targetVariable);
				if (!constraint.check(this, targetSlot)) {
					return false;
				}
				BinaryConstraint binaryUserConstraint = variable.binaryUserConstraints.get(constraint);
				if (binaryUserConstraint != null){
					if (!binaryUserConstraint.check(this, targetSlot)) {
						return false;
					}
				}
			}

			// Check the path constraints:
			for (PathConstraint constraint : variable.pathConstraints) {
				DomainSlot targetSlot = domainMap.get(constraint.targetVariable);
				if (!constraint.check(this, targetSlot)) {
					return false;
				}
			}

			// Check the user constraints:
			for (UnaryConstraint constraint : variable.userConstraints){
				if (!constraint.check(this)) {
					return false;
				}
			}
			
			// All checks were successful:
			checkedVariables.add(variable);
			
		}
		
		// Instantiation was successful:
		return true;
		
	}
	
	/**
	 * Removes the lock on this domain slot. If the domain contains additional
	 * objects {@link #instantiate(Variable, Map, EGraphImpl)} may be called
	 * again.
	 * @param sender
	 *            The variable which uses this domain slot. Only the variable
	 *            which originally initialized this domain slot is able to
	 *            unlock it.
	 * @return <code>true</code> if another instantiation is possible.
	 */
	public boolean unlock(Variable sender) {
		
		// Revert the changes to the temporary domain:
		int refCount = sender.referenceConstraints.size();
		int conCount = sender.containmentConstraints.size();
		for (int i=refCount+conCount-1; i>=0; i--) {
			BinaryConstraint constraint = (i>=refCount) ?
					sender.containmentConstraints.get(i-refCount) :
					sender.referenceConstraints.get(i);
			DomainChange change = remoteChangeMap.get(constraint);
			if (change != null) {
				change.slot.temporaryDomain = change.originalValues;
				remoteChangeMap.remove(constraint);
			}
		}				
		
		// Unlock the variable:
		if (locked && sender == owner) {
			locked = false;
			usedObjects.remove(value);
			for (String parameterName : initializedParameters) {
				conditionHandler.unsetParameter(parameterName);
			}
			initializedParameters.clear();
			checkedVariables.clear();	
			return !(domain == null || domain.isEmpty());
		} else {
			checkedVariables.remove(sender);
		}
		
		// Was not locked:
		return false;
		
	}
	
	/**
	 * Clears this domain slot to the state before it was initialized.
	 * Only the variable that originally initialized this domain slot 
	 * is able to clear it.
	 * @param sender The variable which uses this domain slot. 
	 */
	public void clear(Variable sender) {
		unlock(sender);
		if (sender == owner) {
			initialized = false;			
			remoteChangeMap.clear();
			owner = null;
			value = null;
			domain = null;
		}
	}
	
	/**
	 * Resets this domain slot to the state before it was initialized.
	 * Only the variable that originally initialized this domain slot 
	 * is able to reset it. Resetting means clearing and additionally
	 * resetting the temporary domain.
	 * @param sender The variable which uses this domain slot. 
	 */
	public void reset(Variable sender) {
		if (sender == owner) {
			temporaryDomain = null;
		}
		clear(sender);		
	}

	/**
	 * Re-check the constraint of a variable. It is assumed that this 
	 * slot is initialized and locked.
	 * @param variable Variable to be re-checked.
	 * @param domainMap The domain map.
	 * @return <code>true</code> if all constraint were successfully checked.
	 */
	public boolean recheck(Variable variable, Map<Variable, DomainSlot> domainMap) {
		checkedVariables.remove(variable);
		return instantiate(variable, domainMap, null);
	}
	
	/**
	 * Checks whether the domain contains additional possible objects that may
	 * be valid for a match.
	 * @return <code>true</code>, if instantiation might be possible.
	 */
	public boolean instantiationPossible() {
		if (domain == null) {
			return false;
		}
		if (!locked) {
			return domain.size() > 0;
		}
		return false;
	}
	
	/**
	 * Locks a specific value for this slot. The slot will also be locked and
	 * marked as initialized and the value can only be changed by calling this
	 * method again.
	 * @param value The object this domain slot will be mapped to.
	 */
	public void fixInstantiation(EObject value) {
		this.locked = true;
		this.value = value;
		this.initialized = true;
		this.usedObjects.add(value);
		this.owner = null;
	}
	
		
	/**
	 * @return the locked
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * @return the locked
	 */
	public EObject getValue(){
		return this.value;
	}
	
	/**
	 * @return the domain
	 */
	public List<EObject> getDomain() {
		return domain;
	}
	
	/**
	 * @param temporaryDomain the temporaryDomain to set
	 */
	public void setTemporaryDomain(List<EObject> temporaryDomain) {
		this.temporaryDomain = temporaryDomain;
	}

	/**
	 * @return the temporaryDomain
	 */
	public List<EObject> getTemporaryDomain() {
		return temporaryDomain;
	}
	
	/**
	 * @return the remoteChangeMap
	 */
	public Map<BinaryConstraint, DomainChange> getRemoteChangeMap() {
		return remoteChangeMap;
	}
	
	
	
}

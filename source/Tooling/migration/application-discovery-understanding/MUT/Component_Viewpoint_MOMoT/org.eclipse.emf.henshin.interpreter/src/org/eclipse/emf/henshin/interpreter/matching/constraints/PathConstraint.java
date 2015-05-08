package org.eclipse.emf.henshin.interpreter.matching.constraints;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Path constraint class.
 * @author Christian Krause
 */
public class PathConstraint implements BinaryConstraint {
	
	// Integers:
	static final Integer[] INTEGERS = new Integer[64];
	static {
		for (int i=0; i<INTEGERS.length; i++) {
			INTEGERS[i] = i;
		}
	}
	
	// Target variable:
	final Variable targetVariable;
	
	// References list representing a path:
	final List<EReference> references;

	// Number of paths:
	final int numPaths;
	
	/**
	 * Default constructor.
	 * @param target Target variable.
	 * @param references List of reference used for the path.
	 * @param numPaths Number of paths.
	 */
	public PathConstraint(Variable target, List<EReference> references, int numPaths) {
		this.targetVariable = target;
		this.references = references;
		this.numPaths = numPaths;
		if (references.isEmpty()) {
			throw new IllegalArgumentException("Cannot create path constraint for empty paths");
		}
	}

	private static Integer inc(Integer integer) {
		if (integer==null) return INTEGERS[1];
		int succ = integer.intValue() + 1;
		if (succ < INTEGERS.length) {
			return INTEGERS[succ];
		}
		return succ;
	}
	
	/*
	 * Get the targets for a list o sources and a reference.
	 */
	@SuppressWarnings("unchecked")
	private static Map<EObject,Integer> getTargetObjects(Map<EObject,Integer> sources, EReference reference) {
		Map<EObject,Integer> targets = new LinkedHashMap<EObject,Integer>();
		for (Entry<EObject,Integer> source : sources.entrySet()) {
			EObject src = source.getKey();
			if (src.eClass().getEAllReferences().contains(reference)) {
				if (reference.isMany()) {
					for (EObject trg : (List<EObject>) src.eGet(reference)) {
						targets.put(trg, inc(targets.get(trg)));
					}
				} else {
					EObject trg = (EObject) src.eGet(reference);
					if (trg!=null) {
						targets.put(trg, inc(targets.get(trg)));
					}
				}
			}
		}
		return targets;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.matching.constraints.BinaryConstraint#check(org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot, org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot)
	 */
	@Override
	public boolean check(DomainSlot source, DomainSlot target) {

		// Source variable must be locked:
		if (!source.locked) {
			return false;
		}

		// Follow all paths and get the target objects:
		Map<EObject,Integer> targetObjects = new HashMap<EObject,Integer>();
		targetObjects.put(source.value, INTEGERS[1]);
		for (EReference reference : references) {
			targetObjects = getTargetObjects(targetObjects, reference);
		}
		
		// Target domain slot locked?
		if (target.locked) {
			Integer numTargets = targetObjects.get(target.value);
			return (numTargets != null && numTargets >= numPaths);
			
		} else {
			
			// Target not locked yet. Create a domain change to restrict the target domain:
			DomainChange change = new DomainChange(target, target.temporaryDomain);
			source.remoteChangeMap.put(this, change);
			
			// Calculated temporary domain:
			target.temporaryDomain = new ArrayList<EObject>();
			for (Entry<EObject,Integer> entry : targetObjects.entrySet()) {
				if (entry.getValue() >= numPaths) {
					target.temporaryDomain.add(entry.getKey());
				}
			}
			
			// TODO: why does domain restriction not work for path constraints?
			//if (change.originalValues!=null) {
			//	target.temporaryDomain.retainAll(change.originalValues);
			//}
			
			// Temporary domain must not be empty:
			return !target.temporaryDomain.isEmpty();
			
		}

	}

}
package org.eclipse.emf.henshin.interpreter;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * An extension of {@link EGraph}s to support partitioning.
 * @author Christian Krause
 */
public interface PartitionedEGraph extends EGraph {
	
	/**
	 * Get the number of partitions of this partitioned graph.
	 * @return The number of partitions.
	 */
	int getNumPartitions();
	
	/**
	 * Get all {@link EObject}s of this graph which are compatible with the given type
	 * and are in a given partition. The partition must be greater or equal zero and 
	 * strictly less than the number of partitions of this graph.
	 * This returns a fresh and modifiable list.
	 * @param type The type of the objects.
	 * @param strict Whether subtypes are excluded from the result.
	 * @param partition The partition to be used.
	 * @return A set of {@link EObject}s compatible with the type.
	 */
	List<EObject> getDomain(EClass type, boolean strict, int partition);
	
	/**
	 * Returns the size of the domain for a type in a partition. The returned number
	 * equals the size of the list returned by {@link #getDomain(EClass, boolean, int)}.
	 * This method should be used whenever the actual objects are not needed.
	 * @param type The type.
	 * @param strict Whether subtypes are excluded.
	 * @param partition The partition to be used.
	 * @return The size of the domain.
	 */
	int getDomainSize(EClass type, boolean strict, int partition);

}

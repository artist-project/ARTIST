package org.eclipse.emf.henshin.interpreter.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.PartitionedEGraph;

/**
 * Default implementation of {@link PartitionedEGraph}.
 * @author Christian Krause
 */
public class PartitionedEGraphImpl extends EGraphImpl implements PartitionedEGraph {

	/**
	 * Generated serial ID.
	 */
	private static final long serialVersionUID = 3609576887179687552L;

	/**
	 * Number of partitions.
	 */
	private int numPartitions;

	/**
	 * Map associating real {@link EClass}es with proxy {@link EClass}es
	 * used for partitioning the graph.
	 */
	private Map<EClass,List<EClass>> typePartitionMap;

	/**
	 * Map for storing the next partitions per {@link EClass}.
	 */
	private Map<EClass,Integer> nextPartitionMap;
	
	/**
	 * Default constructor.
	 * @param numPartitions Number of partitions to use.
	 */
	public PartitionedEGraphImpl(int numPartitions) {
		super();
		initializePartitions(numPartitions);
	}

	/**
	 * Convenience constructor. Adds an object and all reachable objects to this graph. 
	 * @param object An object.
	 * @param partitionCount Number of partitions to use.
	 */
	public PartitionedEGraphImpl(EObject object, int partitionCount) {
		super();
		initializePartitions(partitionCount);
		initializeContents(Collections.singleton(object));
	}

	/**
	 * Convenience constructor. Adds a collection of objects and all reachable objects to this graph.
	 * @param collection A collection of objects.
	 * @param numPartitions Number of partitions to use.
	 */
	public PartitionedEGraphImpl(Collection<? extends EObject> collection, int numPartitions) {
		super();
		initializePartitions(numPartitions);
		initializeContents(collection);
	}

	/**
	 * Convenience constructor. Adds the contents of a resource and all reachable objects to this graph.
	 * @param resource A resource.
	 * @param numPartitions Number of partitions to use.
	 */
	public PartitionedEGraphImpl(Resource resource, int numPartitions) {
		super();
		initializePartitions(numPartitions);
		initializeContents(resource.getContents());
	}

	/**
	 * Initialize the partitioned graph.
	 * @param numPartitions Number of partitions.
	 */
	protected void initializePartitions(int numPartitions) {
		if (numPartitions < 1) {
			throw new IllegalArgumentException();
		}
		this.numPartitions = numPartitions;
		this.typePartitionMap = new LinkedHashMap<EClass,List<EClass>>();
		this.nextPartitionMap = new LinkedHashMap<EClass,Integer>();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.EGraphImpl#didAdd(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected void didAdd(EObject object) {
		object.eAdapters().add(crossReferenceAdapter);
		EClass type = object.eClass();
		getDomain(type, getNextPartition(type)).add(object);
		addEPackage(type.getEPackage());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.EGraphImpl#didRemove(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected void didRemove(EObject object) {
		object.eAdapters().remove(crossReferenceAdapter);
		for (EClass partitionType : getPartitionTypes(object.eClass())) {
			if (domainMap.get(partitionType).remove(object)) {
				break;
			}
		}
	}

	/**
	 * Get the next partition to use for adding a new object.
	 * @param type The (real) type of the object.
	 * @return The index of the partition to use.
	 */
	protected int getNextPartition(EClass type) {
		Integer partition = nextPartitionMap.get(type);
		if (partition==null) {
			partition = 0;
		}
		nextPartitionMap.put(type, (partition + 1) % numPartitions);
		return partition;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.EGraphImpl#addChildParentRelation(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EClass)
	 */
	@Override
	protected void addChildParentRelation(EClass child, EClass parent) {
		super.addChildParentRelation(child, parent);
		for (EClass childProxy : getPartitionTypes(child)) {
			for (EClass parentProxy : getPartitionTypes(parent)) {
				super.addChildParentRelation(childProxy, parentProxy);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.PartitionedEGraph#getPartitionCount()
	 */
	@Override
	public int getNumPartitions() {
		return numPartitions;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.EGraphImpl#clear()
	 */
	@Override
	public void clear() {
		super.clear();
		typePartitionMap.clear();
		nextPartitionMap.clear();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#getDomain(org.eclipse.emf.ecore.EClass, boolean)
	 */
	@Override
	public List<EObject> getDomain(EClass type, boolean strict) {
		List<EObject> domain = new ArrayList<EObject>();
		for (int p=0; p<numPartitions; p++) {
			domain.addAll(getDomain(type, strict, p));
		}
		return domain;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#getDomainSize(org.eclipse.emf.ecore.EClass, boolean)
	 */
	@Override
	public int getDomainSize(EClass type, boolean strict) {
		int size = 0;
		for (int p=0; p<numPartitions; p++) {
			size += getDomainSize(type, strict, p);
		}
		return size;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.PartitionedEGraph#getDomain(org.eclipse.emf.ecore.EClass, boolean, int)
	 */
	@Override
	public List<EObject> getDomain(EClass type, boolean strict, int partition) {
		if (strict) {
			return new ArrayList<EObject>(getDomain(type, partition));
		}
		List<EObject> domain = new ArrayList<EObject>();
		Set<EClass> inhMap = inheritanceMap.get(type);
		if (inhMap != null) {
			for (EClass child : inhMap) {
				domain.addAll(getDomain(child, partition));
			}
		}
		return domain;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.PartitionedEGraph#getDomainSize(org.eclipse.emf.ecore.EClass, boolean, int)
	 */
	@Override
	public int getDomainSize(EClass type, boolean strict, int partition) {
		if (strict) {
			return getDomain(type, partition).size();
		}
		Set<EClass> inhMap = inheritanceMap.get(type);
		int size = 0;
		if (inhMap != null) {
			for (EClass child : inhMap) {
				size += getDomain(child, partition).size();
			}
		}
		return size;
	}

	/**
	 * Get the list of proxy partition types for a (real) type.
	 * @param type The actual object type.
	 * @return List of proxy partition types.
	 */
	protected List<EClass> getPartitionTypes(EClass type) {
		List<EClass> partitionTypes = typePartitionMap.get(type);
		if (partitionTypes==null) {
			partitionTypes = new ArrayList<EClass>(numPartitions);
			for (int i=0; i<numPartitions; i++) {
				partitionTypes.add(EcoreFactory.eINSTANCE.createEClass());
			}
			typePartitionMap.put(type, partitionTypes);
		}
		return partitionTypes;
	}
	
	/**
	 * Get the domain for a given type and partition.
	 * @param type An object type.
	 * @param partition A partition index.
	 * @return The domain.
	 */
	protected Collection<EObject> getDomain(EClass type, int partition) {
		return getDomain(getPartitionTypes(type).get(partition));
	}

}

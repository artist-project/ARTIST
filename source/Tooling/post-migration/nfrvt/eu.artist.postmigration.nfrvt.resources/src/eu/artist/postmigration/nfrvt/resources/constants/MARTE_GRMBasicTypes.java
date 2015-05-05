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
package eu.artist.postmigration.nfrvt.resources.constants;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Package;

import eu.artist.postmigration.nfrvt.lang.util.MARTEResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * A convenience class that provides access to all MARTE GRM Basic Types
 * through constants. The package containing those types is located 
 * {@link MARTE_GRMBasicTypes#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class MARTE_GRMBasicTypes  extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = MARTEResourcesUtil.MARTE_LIBRARY_URI_STRING + "#_X3JtMAeNEdytasR0-Ec7ew";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);
	
	public interface Element {
		final Package PACKAGE = MARTE_GRMBasicTypes.getInstance().PACKAGE.getElement();
		
		final DataType TABLE_DRIVEN_SCHEDULE = MARTE_GRMBasicTypes.getInstance().TABLE_DRIVEN_SCHEDULE.getElement();
		final Enumeration PERIODIC_SERVER_KIND = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND.getElement();
		public interface PERIODIC_SERVER_KIND_LITERALS {
			final EnumerationLiteral SPORADIC = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_SPORADIC.getElement();
			final EnumerationLiteral DEFERRABLE = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_DEFERRABLE.getElement();
			final EnumerationLiteral UNDEF = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_UNDEF.getElement();
			final EnumerationLiteral OTHER = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_OTHER.getElement();
		}
		final DataType SCHEDULE_SPECIFICATION = MARTE_GRMBasicTypes.getInstance().SCHEDULE_SPECIFICATION.getElement();
		final DataType POOLING_PARAMETERS = MARTE_GRMBasicTypes.getInstance().POOLING_PARAMETERS.getElement();
		final DataType PERIODIC_SERVER_PARAMETERS = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_PARAMETERS.getElement();
		final Enumeration SCHED_POLICY_KIND = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND.getElement();
		public interface SCHED_POLICY_KIND_LITERALS {
			final EnumerationLiteral EARLIEST_DEADLINE_FIRST = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_EARLIEST_DEADLINE_FIRST.getElement();
			final EnumerationLiteral FIFO = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_FIFO.getElement();
			final EnumerationLiteral FIXED_PRIORITY = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_FIXED_PRIORITY.getElement();
			final EnumerationLiteral LEAST_LAXITY_FIRST = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_LEAST_LAXITY_FIRST.getElement();
			final EnumerationLiteral ROUND_ROBIN = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_ROUND_ROBIN.getElement();
			final EnumerationLiteral TIME_TABLE_DRIVEN = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_TIME_TABLE_DRIVEN.getElement();
			final EnumerationLiteral UNDEF = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_UNDEF.getElement();
			final EnumerationLiteral OTHER = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_OTHER.getElement();
		}
		final DataType FIXED_PRIORITY_PARAMETERS = MARTE_GRMBasicTypes.getInstance().FIXED_PRIORITY_PARAMETERS.getElement();
		final DataType TABLE_ENTRY_TYPE = MARTE_GRMBasicTypes.getInstance().TABLE_ENTRY_TYPE.getElement();
		final Enumeration PROTECT_PROTOCOL_KIND = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND.getElement();
		public interface PROTECT_PROTOCOL_KIND_LITERALS {
			final EnumerationLiteral FIFO = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_FIFO.getElement();
			final EnumerationLiteral NO_PREEMPTION = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_NO_PREEMPTION.getElement();
			final EnumerationLiteral PRIORITY_CEILING = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_PRIORITY_CEILING.getElement();
			final EnumerationLiteral PRIORITY_INHERITANCE = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_PRIORITY_INHERITANCE.getElement();
			final EnumerationLiteral STACK_BASED = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_STACK_BASED.getElement();
			final EnumerationLiteral UNDEF = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_UNDEF.getElement();
			final EnumerationLiteral OTHER = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_OTHER.getElement();
		}
		final DataType SCHED_PARAMETERS = MARTE_GRMBasicTypes.getInstance().SCHED_PARAMETERS.getElement();
		final DataType EDF_PARAMETERS = MARTE_GRMBasicTypes.getInstance().EDF_PARAMETERS.getElement();
	}

	public interface FQN {
		final String PACKAGE = MARTE_GRMBasicTypes.getInstance().PACKAGE.getFullyQualifiedName();
		
		final String TABLE_DRIVEN_SCHEDULE = MARTE_GRMBasicTypes.getInstance().TABLE_DRIVEN_SCHEDULE.getFullyQualifiedName();
		final String PERIODIC_SERVER_KIND = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND.getFullyQualifiedName();
		public interface PERIODIC_SERVER_KIND_LITERALS {
			final String SPORADIC = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_SPORADIC.getFullyQualifiedName();
			final String DEFERRABLE = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_DEFERRABLE.getFullyQualifiedName();
			final String UNDEF = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_UNDEF.getFullyQualifiedName();
			final String OTHER = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_OTHER.getFullyQualifiedName();
		}
		final String SCHEDULE_SPECIFICATION = MARTE_GRMBasicTypes.getInstance().SCHEDULE_SPECIFICATION.getFullyQualifiedName();
		final String POOLING_PARAMETERS = MARTE_GRMBasicTypes.getInstance().POOLING_PARAMETERS.getFullyQualifiedName();
		final String PERIODIC_SERVER_PARAMETERS = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_PARAMETERS.getFullyQualifiedName();
		final String SCHED_POLICY_KIND = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND.getFullyQualifiedName();
		public interface SCHED_POLICY_KIND_LITERALS {
			final String EARLIEST_DEADLINE_FIRST = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_EARLIEST_DEADLINE_FIRST.getFullyQualifiedName();
			final String FIFO = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_FIFO.getFullyQualifiedName();
			final String FIXED_PRIORITY = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_FIXED_PRIORITY.getFullyQualifiedName();
			final String LEAST_LAXITY_FIRST = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_LEAST_LAXITY_FIRST.getFullyQualifiedName();
			final String ROUND_ROBIN = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_ROUND_ROBIN.getFullyQualifiedName();
			final String TIME_TABLE_DRIVEN = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_TIME_TABLE_DRIVEN.getFullyQualifiedName();
			final String UNDEF = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_UNDEF.getFullyQualifiedName();
			final String OTHER = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_OTHER.getFullyQualifiedName();
		}
		final String FIXED_PRIORITY_PARAMETERS = MARTE_GRMBasicTypes.getInstance().FIXED_PRIORITY_PARAMETERS.getFullyQualifiedName();
		final String TABLE_ENTRY_TYPE = MARTE_GRMBasicTypes.getInstance().TABLE_ENTRY_TYPE.getFullyQualifiedName();
		final String PROTECT_PROTOCOL_KIND = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND.getFullyQualifiedName();
		public interface PROTECT_PROTOCOL_KIND_LITERALS {
			final String FIFO = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_FIFO.getFullyQualifiedName();
			final String NO_PREEMPTION = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_NO_PREEMPTION.getFullyQualifiedName();
			final String PRIORITY_CEILING = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_PRIORITY_CEILING.getFullyQualifiedName();
			final String PRIORITY_INHERITANCE = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_PRIORITY_INHERITANCE.getFullyQualifiedName();
			final String STACK_BASED = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_STACK_BASED.getFullyQualifiedName();
			final String UNDEF = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_UNDEF.getFullyQualifiedName();
			final String OTHER = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_OTHER.getFullyQualifiedName();
		}
		final String SCHED_PARAMETERS = MARTE_GRMBasicTypes.getInstance().SCHED_PARAMETERS.getFullyQualifiedName();
		final String EDF_PARAMETERS = MARTE_GRMBasicTypes.getInstance().EDF_PARAMETERS.getFullyQualifiedName();
	}

	public interface Uri {
		final String PACKAGE = MARTE_GRMBasicTypes.getInstance().PACKAGE.getUri();
		
		final String TABLE_DRIVEN_SCHEDULE = MARTE_GRMBasicTypes.getInstance().TABLE_DRIVEN_SCHEDULE.getUri();
		final String PERIODIC_SERVER_KIND = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND.getUri();
		public interface PERIODIC_SERVER_KIND_LITERALS {
			final String SPORADIC = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_SPORADIC.getUri();
			final String DEFERRABLE = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_DEFERRABLE.getUri();
			final String UNDEF = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_UNDEF.getUri();
			final String OTHER = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_KIND_OTHER.getUri();
		}
		final String SCHEDULE_SPECIFICATION = MARTE_GRMBasicTypes.getInstance().SCHEDULE_SPECIFICATION.getUri();
		final String POOLING_PARAMETERS = MARTE_GRMBasicTypes.getInstance().POOLING_PARAMETERS.getUri();
		final String PERIODIC_SERVER_PARAMETERS = MARTE_GRMBasicTypes.getInstance().PERIODIC_SERVER_PARAMETERS.getUri();
		final String SCHED_POLICY_KIND = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND.getUri();
		public interface SCHED_POLICY_KIND_LITERALS {
			final String EARLIEST_DEADLINE_FIRST = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_EARLIEST_DEADLINE_FIRST.getUri();
			final String FIFO = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_FIFO.getUri();
			final String FIXED_PRIORITY = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_FIXED_PRIORITY.getUri();
			final String LEAST_LAXITY_FIRST = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_LEAST_LAXITY_FIRST.getUri();
			final String ROUND_ROBIN = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_ROUND_ROBIN.getUri();
			final String TIME_TABLE_DRIVEN = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_TIME_TABLE_DRIVEN.getUri();
			final String UNDEF = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_UNDEF.getUri();
			final String OTHER = MARTE_GRMBasicTypes.getInstance().SCHED_POLICY_KIND_OTHER.getUri();
		}
		final String FIXED_PRIORITY_PARAMETERS = MARTE_GRMBasicTypes.getInstance().FIXED_PRIORITY_PARAMETERS.getUri();
		final String TABLE_ENTRY_TYPE = MARTE_GRMBasicTypes.getInstance().TABLE_ENTRY_TYPE.getUri();
		final String PROTECT_PROTOCOL_KIND = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND.getUri();
		public interface PROTECT_PROTOCOL_KIND_LITERALS {
			final String FIFO = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_FIFO.getUri();
			final String NO_PREEMPTION = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_NO_PREEMPTION.getUri();
			final String PRIORITY_CEILING = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_PRIORITY_CEILING.getUri();
			final String PRIORITY_INHERITANCE = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_PRIORITY_INHERITANCE.getUri();
			final String STACK_BASED = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_STACK_BASED.getUri();
			final String UNDEF = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_UNDEF.getUri();
			final String OTHER = MARTE_GRMBasicTypes.getInstance().PROTECT_PROTOCOL_KIND_OTHER.getUri();
		}
		final String SCHED_PARAMETERS = MARTE_GRMBasicTypes.getInstance().SCHED_PARAMETERS.getUri();
		final String EDF_PARAMETERS = MARTE_GRMBasicTypes.getInstance().EDF_PARAMETERS.getUri();
	}

	public final MigrationModelElement<DataType> TABLE_DRIVEN_SCHEDULE;
	public final MigrationModelElement<Enumeration> PERIODIC_SERVER_KIND;
	public final MigrationModelElement<EnumerationLiteral> PERIODIC_SERVER_KIND_SPORADIC;
	public final MigrationModelElement<EnumerationLiteral> PERIODIC_SERVER_KIND_DEFERRABLE;
	public final MigrationModelElement<EnumerationLiteral> PERIODIC_SERVER_KIND_UNDEF;
	public final MigrationModelElement<EnumerationLiteral> PERIODIC_SERVER_KIND_OTHER;
	public final MigrationModelElement<DataType> SCHEDULE_SPECIFICATION;
	public final MigrationModelElement<DataType> POOLING_PARAMETERS;
	public final MigrationModelElement<DataType> PERIODIC_SERVER_PARAMETERS;
	public final MigrationModelElement<Enumeration> SCHED_POLICY_KIND;
	public final MigrationModelElement<EnumerationLiteral> SCHED_POLICY_KIND_EARLIEST_DEADLINE_FIRST;
	public final MigrationModelElement<EnumerationLiteral> SCHED_POLICY_KIND_FIFO;
	public final MigrationModelElement<EnumerationLiteral> SCHED_POLICY_KIND_FIXED_PRIORITY;
	public final MigrationModelElement<EnumerationLiteral> SCHED_POLICY_KIND_LEAST_LAXITY_FIRST;
	public final MigrationModelElement<EnumerationLiteral> SCHED_POLICY_KIND_ROUND_ROBIN;
	public final MigrationModelElement<EnumerationLiteral> SCHED_POLICY_KIND_TIME_TABLE_DRIVEN;
	public final MigrationModelElement<EnumerationLiteral> SCHED_POLICY_KIND_UNDEF;
	public final MigrationModelElement<EnumerationLiteral> SCHED_POLICY_KIND_OTHER;
	public final MigrationModelElement<DataType> FIXED_PRIORITY_PARAMETERS;
	public final MigrationModelElement<DataType> TABLE_ENTRY_TYPE;
	public final MigrationModelElement<Enumeration> PROTECT_PROTOCOL_KIND;
	public final MigrationModelElement<EnumerationLiteral> PROTECT_PROTOCOL_KIND_FIFO;
	public final MigrationModelElement<EnumerationLiteral> PROTECT_PROTOCOL_KIND_NO_PREEMPTION;
	public final MigrationModelElement<EnumerationLiteral> PROTECT_PROTOCOL_KIND_PRIORITY_CEILING;
	public final MigrationModelElement<EnumerationLiteral> PROTECT_PROTOCOL_KIND_PRIORITY_INHERITANCE;
	public final MigrationModelElement<EnumerationLiteral> PROTECT_PROTOCOL_KIND_STACK_BASED;
	public final MigrationModelElement<EnumerationLiteral> PROTECT_PROTOCOL_KIND_UNDEF;
	public final MigrationModelElement<EnumerationLiteral> PROTECT_PROTOCOL_KIND_OTHER;
	public final MigrationModelElement<DataType> SCHED_PARAMETERS;
	public final MigrationModelElement<DataType> EDF_PARAMETERS;
	
	private static MARTE_GRMBasicTypes instance;
	
	public static MARTE_GRMBasicTypes getInstance() {
		if(instance == null)
			instance = new MARTE_GRMBasicTypes();
		return instance;
	}
	
	protected MARTE_GRMBasicTypes() {
		super(PACKAGE_URI);
		
		TABLE_DRIVEN_SCHEDULE = new MigrationModelElement<DataType>(getDataTypeByName("TableDrivenSchedule"));
		PERIODIC_SERVER_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("PeriodicServerKind"));
		PERIODIC_SERVER_KIND_SPORADIC = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("PeriodicServerKind", "Sporadic"));
		PERIODIC_SERVER_KIND_DEFERRABLE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("PeriodicServerKind", "Deferrable"));
		PERIODIC_SERVER_KIND_UNDEF = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("PeriodicServerKind", "Undef"));
		PERIODIC_SERVER_KIND_OTHER = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("PeriodicServerKind", "Other"));
		SCHEDULE_SPECIFICATION = new MigrationModelElement<DataType>(getDataTypeByName("ScheduleSpecification"));
		POOLING_PARAMETERS = new MigrationModelElement<DataType>(getDataTypeByName("PoolingParameters"));
		PERIODIC_SERVER_PARAMETERS = new MigrationModelElement<DataType>(getDataTypeByName("PeriodicServerParameters"));
		SCHED_POLICY_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("SchedPolicyKind"));
		SCHED_POLICY_KIND_EARLIEST_DEADLINE_FIRST = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SchedPolicyKind", "EarliestDeadlineFirst"));
		SCHED_POLICY_KIND_FIFO = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SchedPolicyKind", "FIFO"));
		SCHED_POLICY_KIND_FIXED_PRIORITY = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SchedPolicyKind", "FixedPriority"));
		SCHED_POLICY_KIND_LEAST_LAXITY_FIRST = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SchedPolicyKind", "LeastLaxityFirst"));
		SCHED_POLICY_KIND_ROUND_ROBIN = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SchedPolicyKind", "RoundRobin"));
		SCHED_POLICY_KIND_TIME_TABLE_DRIVEN = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SchedPolicyKind", "TimeTableDriven"));
		SCHED_POLICY_KIND_UNDEF = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SchedPolicyKind", "Undef"));
		SCHED_POLICY_KIND_OTHER = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SchedPolicyKind", "Other"));
		FIXED_PRIORITY_PARAMETERS = new MigrationModelElement<DataType>(getDataTypeByName("FixedPriorityParameters"));
		TABLE_ENTRY_TYPE = new MigrationModelElement<DataType>(getDataTypeByName("TableEntryType"));
		PROTECT_PROTOCOL_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("ProtectProtocolKind"));
		PROTECT_PROTOCOL_KIND_FIFO = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProtectProtocolKind", "FIFO"));
		PROTECT_PROTOCOL_KIND_NO_PREEMPTION = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProtectProtocolKind", "NoPreemption"));
		PROTECT_PROTOCOL_KIND_PRIORITY_CEILING = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProtectProtocolKind", "PriorityCeiling"));
		PROTECT_PROTOCOL_KIND_PRIORITY_INHERITANCE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProtectProtocolKind", "PriorityInheritance"));
		PROTECT_PROTOCOL_KIND_STACK_BASED = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProtectProtocolKind", "StackBased"));
		PROTECT_PROTOCOL_KIND_UNDEF = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProtectProtocolKind", "Undef"));
		PROTECT_PROTOCOL_KIND_OTHER = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("ProtectProtocolKind", "Other"));
		SCHED_PARAMETERS = new MigrationModelElement<DataType>(getDataTypeByName("SchedParameters"));
		EDF_PARAMETERS = new MigrationModelElement<DataType>(getDataTypeByName("EDF_Parameters"));
	}
}

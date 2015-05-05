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

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue;
import eu.artist.postmigration.nfrvt.resources.MigrationLibraryResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * The ARTIST Pattern Catalogue contains a set of optimization patterns
 * collected during the ARTIST project. This convenience class provides access 
 * to all elements of that catalogue through constants. The library itself is 
 * located at {@link ARTIST_PatternCatalogue#CATALOGUE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class ARTIST_PatternCatalogue extends AbstractPatternCatalogue {
	public static final String CATALOGUE_URI_STRING = MigrationLibraryResourcesUtil.BASE_PATHMAP + "ARTIST_PatternCatalogue.pattern";
	public static final URI CATALOGUE_URI = URI.createURI(CATALOGUE_URI_STRING);
	
	public interface Element {
		final PatternCatalogue CATALOGUE = ARTIST_PatternCatalogue.getInstance().CATALOGUE.getElement();
		
		final Pattern HORIZONTALLY_SCALING_COMPUTE_PATTERN = ARTIST_PatternCatalogue.getInstance().HORIZONTALLY_SCALING_COMPUTE_PATTERN.getElement();
		final Pattern AUTO_SCALING_PATTERN = ARTIST_PatternCatalogue.getInstance().AUTO_SCALING_PATTERN.getElement();
		final Pattern THROTTLING_PATTERN = ARTIST_PatternCatalogue.getInstance().THROTTLING_PATTERN.getElement();
		final Pattern MULTITENANCY_PATTERN = ARTIST_PatternCatalogue.getInstance().MULTITENANCY_PATTERN.getElement();
		final Pattern MAP_REDUCE_PATTERN = ARTIST_PatternCatalogue.getInstance().MAP_REDUCE_PATTERN.getElement();
		final Pattern DATABASE_SHARDING_PATTERN = ARTIST_PatternCatalogue.getInstance().DATABASE_SHARDING_PATTERN.getElement();
		final Pattern CQRS_PATTERN = ARTIST_PatternCatalogue.getInstance().CQRS_PATTERN.getElement();
		final Pattern EVENT_SOURCING_PATTERN = ARTIST_PatternCatalogue.getInstance().EVENT_SOURCING_PATTERN.getElement();
		final Pattern RELATIONAL_DATABASE_PATTERN = ARTIST_PatternCatalogue.getInstance().RELATIONAL_DATABASE_PATTERN.getElement();
		final Pattern KEY_VALUE_STORAGE_PATTERN = ARTIST_PatternCatalogue.getInstance().KEY_VALUE_STORAGE_PATTERN.getElement();
		final Pattern INDEX_TABLE_PATTERN = ARTIST_PatternCatalogue.getInstance().INDEX_TABLE_PATTERN.getElement();
		final Pattern MATERIALIZED_VIEW = ARTIST_PatternCatalogue.getInstance().MATERIALIZED_VIEW.getElement();
		final Pattern EXTERNAL_CONFIGURATION_STORE_PATTERN = ARTIST_PatternCatalogue.getInstance().EXTERNAL_CONFIGURATION_STORE_PATTERN.getElement();
		final Pattern RUNTIME_RECONFIGURATION_PATTERN = ARTIST_PatternCatalogue.getInstance().RUNTIME_RECONFIGURATION_PATTERN.getElement();
		final Pattern CACHING_PATTERN = ARTIST_PatternCatalogue.getInstance().CACHING_PATTERN.getElement();
		final Pattern CONTENT_DELIVERY_PATTERN = ARTIST_PatternCatalogue.getInstance().CONTENT_DELIVERY_PATTERN.getElement();
		final Pattern COLOCATE_PATTERN = ARTIST_PatternCatalogue.getInstance().COLOCATE_PATTERN.getElement();
		final Pattern AFFINITY_GROUPS_PATTERN = ARTIST_PatternCatalogue.getInstance().AFFINITY_GROUPS_PATTERN.getElement();
		final Pattern MULTISITE_DEPLOYMENT_PATTERN = ARTIST_PatternCatalogue.getInstance().MULTISITE_DEPLOYMENT_PATTERN.getElement();
		final Pattern BUSY_SIGNAL_PATTERN = ARTIST_PatternCatalogue.getInstance().BUSY_SIGNAL_PATTERN.getElement();
		final Pattern CIRCUIT_BREAKER_PATTERN = ARTIST_PatternCatalogue.getInstance().CIRCUIT_BREAKER_PATTERN.getElement();
		final Pattern NODE_FAILURE_PATTERN = ARTIST_PatternCatalogue.getInstance().NODE_FAILURE_PATTERN.getElement();
		final Pattern HEALTH_ENDPOINT_MONITORING = ARTIST_PatternCatalogue.getInstance().HEALTH_ENDPOINT_MONITORING.getElement();
		final Pattern SCHEDULER_AGENT_SUPERVISOR_PATTERN = ARTIST_PatternCatalogue.getInstance().SCHEDULER_AGENT_SUPERVISOR_PATTERN.getElement();
		final Pattern QUEUE_BASED_LOAD_LEVELING_PATTERN = ARTIST_PatternCatalogue.getInstance().QUEUE_BASED_LOAD_LEVELING_PATTERN.getElement();
		final Pattern PRIORITY_QUEUE_PATTERN = ARTIST_PatternCatalogue.getInstance().PRIORITY_QUEUE_PATTERN.getElement();
		final Pattern LEADER_ELECTION = ARTIST_PatternCatalogue.getInstance().LEADER_ELECTION.getElement();
		final Pattern PIPES_AND_FILTERS = ARTIST_PatternCatalogue.getInstance().PIPES_AND_FILTERS.getElement();
		final Pattern VALET_KEY_PATTERN = ARTIST_PatternCatalogue.getInstance().VALET_KEY_PATTERN.getElement();
		final Pattern GATE_KEEPER = ARTIST_PatternCatalogue.getInstance().GATE_KEEPER.getElement();
		final Pattern FEDERATED_IDENTITY = ARTIST_PatternCatalogue.getInstance().FEDERATED_IDENTITY.getElement();
	}

	public interface FQN {
		final String CATALOGUE = ARTIST_NFPCatalogue.getInstance().CATALOGUE.getFullyQualifiedName();
		
		final String HORIZONTALLY_SCALING_COMPUTE_PATTERN = ARTIST_PatternCatalogue.getInstance().HORIZONTALLY_SCALING_COMPUTE_PATTERN.getFullyQualifiedName();
		final String AUTO_SCALING_PATTERN = ARTIST_PatternCatalogue.getInstance().AUTO_SCALING_PATTERN.getFullyQualifiedName();
		final String THROTTLING_PATTERN = ARTIST_PatternCatalogue.getInstance().THROTTLING_PATTERN.getFullyQualifiedName();
		final String MULTITENANCY_PATTERN = ARTIST_PatternCatalogue.getInstance().MULTITENANCY_PATTERN.getFullyQualifiedName();
		final String MAP_REDUCE_PATTERN = ARTIST_PatternCatalogue.getInstance().MAP_REDUCE_PATTERN.getFullyQualifiedName();
		final String DATABASE_SHARDING_PATTERN = ARTIST_PatternCatalogue.getInstance().DATABASE_SHARDING_PATTERN.getFullyQualifiedName();
		final String CQRS_PATTERN = ARTIST_PatternCatalogue.getInstance().CQRS_PATTERN.getFullyQualifiedName();
		final String EVENT_SOURCING_PATTERN = ARTIST_PatternCatalogue.getInstance().EVENT_SOURCING_PATTERN.getFullyQualifiedName();
		final String RELATIONAL_DATABASE_PATTERN = ARTIST_PatternCatalogue.getInstance().RELATIONAL_DATABASE_PATTERN.getFullyQualifiedName();
		final String KEY_VALUE_STORAGE_PATTERN = ARTIST_PatternCatalogue.getInstance().KEY_VALUE_STORAGE_PATTERN.getFullyQualifiedName();
		final String INDEX_TABLE_PATTERN = ARTIST_PatternCatalogue.getInstance().INDEX_TABLE_PATTERN.getFullyQualifiedName();
		final String MATERIALIZED_VIEW = ARTIST_PatternCatalogue.getInstance().MATERIALIZED_VIEW.getFullyQualifiedName();
		final String EXTERNAL_CONFIGURATION_STORE_PATTERN = ARTIST_PatternCatalogue.getInstance().EXTERNAL_CONFIGURATION_STORE_PATTERN.getFullyQualifiedName();
		final String RUNTIME_RECONFIGURATION_PATTERN = ARTIST_PatternCatalogue.getInstance().RUNTIME_RECONFIGURATION_PATTERN.getFullyQualifiedName();
		final String CACHING_PATTERN = ARTIST_PatternCatalogue.getInstance().CACHING_PATTERN.getFullyQualifiedName();
		final String CONTENT_DELIVERY_PATTERN = ARTIST_PatternCatalogue.getInstance().CONTENT_DELIVERY_PATTERN.getFullyQualifiedName();
		final String COLOCATE_PATTERN = ARTIST_PatternCatalogue.getInstance().COLOCATE_PATTERN.getFullyQualifiedName();
		final String AFFINITY_GROUPS_PATTERN = ARTIST_PatternCatalogue.getInstance().AFFINITY_GROUPS_PATTERN.getFullyQualifiedName();
		final String MULTISITE_DEPLOYMENT_PATTERN = ARTIST_PatternCatalogue.getInstance().MULTISITE_DEPLOYMENT_PATTERN.getFullyQualifiedName();
		final String BUSY_SIGNAL_PATTERN = ARTIST_PatternCatalogue.getInstance().BUSY_SIGNAL_PATTERN.getFullyQualifiedName();
		final String CIRCUIT_BREAKER_PATTERN = ARTIST_PatternCatalogue.getInstance().CIRCUIT_BREAKER_PATTERN.getFullyQualifiedName();
		final String NODE_FAILURE_PATTERN = ARTIST_PatternCatalogue.getInstance().NODE_FAILURE_PATTERN.getFullyQualifiedName();
		final String HEALTH_ENDPOINT_MONITORING = ARTIST_PatternCatalogue.getInstance().HEALTH_ENDPOINT_MONITORING.getFullyQualifiedName();
		final String SCHEDULER_AGENT_SUPERVISOR_PATTERN = ARTIST_PatternCatalogue.getInstance().SCHEDULER_AGENT_SUPERVISOR_PATTERN.getFullyQualifiedName();
		final String QUEUE_BASED_LOAD_LEVELING_PATTERN = ARTIST_PatternCatalogue.getInstance().QUEUE_BASED_LOAD_LEVELING_PATTERN.getFullyQualifiedName();
		final String PRIORITY_QUEUE_PATTERN = ARTIST_PatternCatalogue.getInstance().PRIORITY_QUEUE_PATTERN.getFullyQualifiedName();
		final String LEADER_ELECTION = ARTIST_PatternCatalogue.getInstance().LEADER_ELECTION.getFullyQualifiedName();
		final String PIPES_AND_FILTERS = ARTIST_PatternCatalogue.getInstance().PIPES_AND_FILTERS.getFullyQualifiedName();
		final String VALET_KEY_PATTERN = ARTIST_PatternCatalogue.getInstance().VALET_KEY_PATTERN.getFullyQualifiedName();
		final String GATE_KEEPER = ARTIST_PatternCatalogue.getInstance().GATE_KEEPER.getFullyQualifiedName();
		final String FEDERATED_IDENTITY = ARTIST_PatternCatalogue.getInstance().FEDERATED_IDENTITY.getFullyQualifiedName();
	}

	public interface Uri {
		final String CATALOGUE = ARTIST_NFPCatalogue.getInstance().CATALOGUE.getUri();
		
		final String HORIZONTALLY_SCALING_COMPUTE_PATTERN = ARTIST_PatternCatalogue.getInstance().HORIZONTALLY_SCALING_COMPUTE_PATTERN.getUri();
		final String AUTO_SCALING_PATTERN = ARTIST_PatternCatalogue.getInstance().AUTO_SCALING_PATTERN.getUri();
		final String THROTTLING_PATTERN = ARTIST_PatternCatalogue.getInstance().THROTTLING_PATTERN.getUri();
		final String MULTITENANCY_PATTERN = ARTIST_PatternCatalogue.getInstance().MULTITENANCY_PATTERN.getUri();
		final String MAP_REDUCE_PATTERN = ARTIST_PatternCatalogue.getInstance().MAP_REDUCE_PATTERN.getUri();
		final String DATABASE_SHARDING_PATTERN = ARTIST_PatternCatalogue.getInstance().DATABASE_SHARDING_PATTERN.getUri();
		final String CQRS_PATTERN = ARTIST_PatternCatalogue.getInstance().CQRS_PATTERN.getUri();
		final String EVENT_SOURCING_PATTERN = ARTIST_PatternCatalogue.getInstance().EVENT_SOURCING_PATTERN.getUri();
		final String RELATIONAL_DATABASE_PATTERN = ARTIST_PatternCatalogue.getInstance().RELATIONAL_DATABASE_PATTERN.getUri();
		final String KEY_VALUE_STORAGE_PATTERN = ARTIST_PatternCatalogue.getInstance().KEY_VALUE_STORAGE_PATTERN.getUri();
		final String INDEX_TABLE_PATTERN = ARTIST_PatternCatalogue.getInstance().INDEX_TABLE_PATTERN.getUri();
		final String MATERIALIZED_VIEW = ARTIST_PatternCatalogue.getInstance().MATERIALIZED_VIEW.getUri();
		final String EXTERNAL_CONFIGURATION_STORE_PATTERN = ARTIST_PatternCatalogue.getInstance().EXTERNAL_CONFIGURATION_STORE_PATTERN.getUri();
		final String RUNTIME_RECONFIGURATION_PATTERN = ARTIST_PatternCatalogue.getInstance().RUNTIME_RECONFIGURATION_PATTERN.getUri();
		final String CACHING_PATTERN = ARTIST_PatternCatalogue.getInstance().CACHING_PATTERN.getUri();
		final String CONTENT_DELIVERY_PATTERN = ARTIST_PatternCatalogue.getInstance().CONTENT_DELIVERY_PATTERN.getUri();
		final String COLOCATE_PATTERN = ARTIST_PatternCatalogue.getInstance().COLOCATE_PATTERN.getUri();
		final String AFFINITY_GROUPS_PATTERN = ARTIST_PatternCatalogue.getInstance().AFFINITY_GROUPS_PATTERN.getUri();
		final String MULTISITE_DEPLOYMENT_PATTERN = ARTIST_PatternCatalogue.getInstance().MULTISITE_DEPLOYMENT_PATTERN.getUri();
		final String BUSY_SIGNAL_PATTERN = ARTIST_PatternCatalogue.getInstance().BUSY_SIGNAL_PATTERN.getUri();
		final String CIRCUIT_BREAKER_PATTERN = ARTIST_PatternCatalogue.getInstance().CIRCUIT_BREAKER_PATTERN.getUri();
		final String NODE_FAILURE_PATTERN = ARTIST_PatternCatalogue.getInstance().NODE_FAILURE_PATTERN.getUri();
		final String HEALTH_ENDPOINT_MONITORING = ARTIST_PatternCatalogue.getInstance().HEALTH_ENDPOINT_MONITORING.getUri();
		final String SCHEDULER_AGENT_SUPERVISOR_PATTERN = ARTIST_PatternCatalogue.getInstance().SCHEDULER_AGENT_SUPERVISOR_PATTERN.getUri();
		final String QUEUE_BASED_LOAD_LEVELING_PATTERN = ARTIST_PatternCatalogue.getInstance().QUEUE_BASED_LOAD_LEVELING_PATTERN.getUri();
		final String PRIORITY_QUEUE_PATTERN = ARTIST_PatternCatalogue.getInstance().PRIORITY_QUEUE_PATTERN.getUri();
		final String LEADER_ELECTION = ARTIST_PatternCatalogue.getInstance().LEADER_ELECTION.getUri();
		final String PIPES_AND_FILTERS = ARTIST_PatternCatalogue.getInstance().PIPES_AND_FILTERS.getUri();
		final String VALET_KEY_PATTERN = ARTIST_PatternCatalogue.getInstance().VALET_KEY_PATTERN.getUri();
		final String GATE_KEEPER = ARTIST_PatternCatalogue.getInstance().GATE_KEEPER.getUri();
		final String FEDERATED_IDENTITY = ARTIST_PatternCatalogue.getInstance().FEDERATED_IDENTITY.getUri();
	}

	private static ARTIST_PatternCatalogue instance;
		
	public static ARTIST_PatternCatalogue getInstance() {
		if(instance == null)
			instance = new ARTIST_PatternCatalogue();
		return instance;
	}
		
	public final MigrationModelElement<Pattern> HORIZONTALLY_SCALING_COMPUTE_PATTERN;
	public final MigrationModelElement<Pattern> AUTO_SCALING_PATTERN;
	public final MigrationModelElement<Pattern> THROTTLING_PATTERN;
	public final MigrationModelElement<Pattern> MULTITENANCY_PATTERN;
	public final MigrationModelElement<Pattern> MAP_REDUCE_PATTERN;
	public final MigrationModelElement<Pattern> DATABASE_SHARDING_PATTERN;
	public final MigrationModelElement<Pattern> CQRS_PATTERN;
	public final MigrationModelElement<Pattern> EVENT_SOURCING_PATTERN;
	public final MigrationModelElement<Pattern> RELATIONAL_DATABASE_PATTERN;
	public final MigrationModelElement<Pattern> KEY_VALUE_STORAGE_PATTERN;
	public final MigrationModelElement<Pattern> INDEX_TABLE_PATTERN;
	public final MigrationModelElement<Pattern> MATERIALIZED_VIEW;
	public final MigrationModelElement<Pattern> EXTERNAL_CONFIGURATION_STORE_PATTERN;
	public final MigrationModelElement<Pattern> RUNTIME_RECONFIGURATION_PATTERN;
	public final MigrationModelElement<Pattern> CACHING_PATTERN;
	public final MigrationModelElement<Pattern> CONTENT_DELIVERY_PATTERN;
	public final MigrationModelElement<Pattern> COLOCATE_PATTERN;
	public final MigrationModelElement<Pattern> AFFINITY_GROUPS_PATTERN;
	public final MigrationModelElement<Pattern> MULTISITE_DEPLOYMENT_PATTERN;
	public final MigrationModelElement<Pattern> BUSY_SIGNAL_PATTERN;
	public final MigrationModelElement<Pattern> CIRCUIT_BREAKER_PATTERN;
	public final MigrationModelElement<Pattern> NODE_FAILURE_PATTERN;
	public final MigrationModelElement<Pattern> HEALTH_ENDPOINT_MONITORING;
	public final MigrationModelElement<Pattern> SCHEDULER_AGENT_SUPERVISOR_PATTERN;
	public final MigrationModelElement<Pattern> QUEUE_BASED_LOAD_LEVELING_PATTERN;
	public final MigrationModelElement<Pattern> PRIORITY_QUEUE_PATTERN;
	public final MigrationModelElement<Pattern> LEADER_ELECTION;
	public final MigrationModelElement<Pattern> PIPES_AND_FILTERS;
	public final MigrationModelElement<Pattern> VALET_KEY_PATTERN;
	public final MigrationModelElement<Pattern> GATE_KEEPER;
	public final MigrationModelElement<Pattern> FEDERATED_IDENTITY;
	
	protected ARTIST_PatternCatalogue() {
		super(CATALOGUE_URI_STRING);
				
		HORIZONTALLY_SCALING_COMPUTE_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("HorizontallyScalingComputePattern"));
		AUTO_SCALING_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("AutoScalingPattern"));
		THROTTLING_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("ThrottlingPattern"));
		MULTITENANCY_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("MultitenancyPattern"));
		MAP_REDUCE_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("MapReducePattern"));
		DATABASE_SHARDING_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("DatabaseShardingPattern"));
		CQRS_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("CQRSPattern"));
		EVENT_SOURCING_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("EventSourcingPattern"));
		RELATIONAL_DATABASE_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("RelationalDatabasePattern"));
		KEY_VALUE_STORAGE_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("KeyValueStoragePattern"));
		INDEX_TABLE_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("IndexTablePattern"));
		MATERIALIZED_VIEW = new MigrationModelElement<Pattern>(getPatternByName("MaterializedView"));
		EXTERNAL_CONFIGURATION_STORE_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("ExternalConfigurationStorePattern"));
		RUNTIME_RECONFIGURATION_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("RuntimeReconfigurationPattern"));
		CACHING_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("CachingPattern"));
		CONTENT_DELIVERY_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("ContentDeliveryPattern"));
		COLOCATE_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("ColocatePattern"));
		AFFINITY_GROUPS_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("AffinityGroupsPattern"));
		MULTISITE_DEPLOYMENT_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("MultisiteDeploymentPattern"));
		BUSY_SIGNAL_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("BusySignalPattern"));
		CIRCUIT_BREAKER_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("CircuitBreakerPattern"));
		NODE_FAILURE_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("NodeFailurePattern"));
		HEALTH_ENDPOINT_MONITORING = new MigrationModelElement<Pattern>(getPatternByName("HealthEndpointMonitoring"));
		SCHEDULER_AGENT_SUPERVISOR_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("SchedulerAgentSupervisorPattern"));
		QUEUE_BASED_LOAD_LEVELING_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("QueueBasedLoadLevelingPattern"));
		PRIORITY_QUEUE_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("PriorityQueuePattern"));
		LEADER_ELECTION = new MigrationModelElement<Pattern>(getPatternByName("LeaderElection"));
		PIPES_AND_FILTERS = new MigrationModelElement<Pattern>(getPatternByName("PipesAndFilters"));
		VALET_KEY_PATTERN = new MigrationModelElement<Pattern>(getPatternByName("ValetKeyPattern"));
		GATE_KEEPER = new MigrationModelElement<Pattern>(getPatternByName("GateKeeper"));
		FEDERATED_IDENTITY = new MigrationModelElement<Pattern>(getPatternByName("FederatedIdentity"));
	}
}

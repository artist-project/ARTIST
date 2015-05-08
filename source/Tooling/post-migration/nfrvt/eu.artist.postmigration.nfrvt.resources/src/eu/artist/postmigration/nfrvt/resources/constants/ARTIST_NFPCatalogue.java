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

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.resources.MigrationLibraryResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * The ARTIST NFP Catalogue contains a set of non-functional properties (NFPs)
 * collected during the ARTIST project. This convenience class provides access to
 * all elements of that catalogue through constants. The library itself is 
 * located at {@link ARTIST_NFPCatalogue#CATALOGUE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class ARTIST_NFPCatalogue extends AbstractPropertyCatalogue {
	public static final String CATALOGUE_URI_STRING = MigrationLibraryResourcesUtil.BASE_PATHMAP + "ARTIST_NFPCatalogue.prop";

	public static final URI CATALOGUE_URI = URI.createURI(CATALOGUE_URI_STRING);
	
	public interface Element {
		final PropertyCatalogue CATALOGUE = ARTIST_NFPCatalogue.getInstance().CATALOGUE.getElement();
		
		final QualitativeProperty SECURITY = ARTIST_NFPCatalogue.getInstance().SECURITY.getElement();
		final QualitativeProperty CONFIDENTIALITY = ARTIST_NFPCatalogue.getInstance().CONFIDENTIALITY.getElement();
		final QualitativeProperty INTEGRITY = ARTIST_NFPCatalogue.getInstance().INTEGRITY.getElement();
		final QualitativeProperty AVAILABILITY = ARTIST_NFPCatalogue.getInstance().AVAILABILITY.getElement();
		final QualitativeProperty SCALABILITY = ARTIST_NFPCatalogue.getInstance().SCALABILITY.getElement();
		final QualitativeProperty ELASTICITY = ARTIST_NFPCatalogue.getInstance().ELASTICITY.getElement();
		final QualitativeProperty COST = ARTIST_NFPCatalogue.getInstance().COST.getElement();
		final QualitativeProperty PERFORMANCE_EFFICIENCY = ARTIST_NFPCatalogue.getInstance().PERFORMANCE_EFFICIENCY.getElement();
		final QualitativeProperty TIME_BEHAVIOR = ARTIST_NFPCatalogue.getInstance().TIME_BEHAVIOR.getElement();
		final QualitativeProperty MAINTAINABILITY = ARTIST_NFPCatalogue.getInstance().MAINTAINABILITY.getElement();
		final QualitativeProperty MODULARITY = ARTIST_NFPCatalogue.getInstance().MODULARITY.getElement();
		final DerivedQuantitativeProperty MAINTAINABILITY_INDEX_MICROSOFT = ARTIST_NFPCatalogue.getInstance().MAINTAINABILITY_INDEX_MICROSOFT.getElement();
		final QualitativeProperty MODIFIABILITY = ARTIST_NFPCatalogue.getInstance().MODIFIABILITY.getElement();
		final QualitativeProperty USABILITY = ARTIST_NFPCatalogue.getInstance().USABILITY.getElement();
		final QualitativeProperty LEARNABILITY = ARTIST_NFPCatalogue.getInstance().LEARNABILITY.getElement();
		final QualitativeProperty RESOURCE_UTILIZATION = ARTIST_NFPCatalogue.getInstance().RESOURCE_UTILIZATION.getElement();
		final BaseQuantitativeProperty SLA_COMPLIANCE = ARTIST_NFPCatalogue.getInstance().SLA_COMPLIANCE.getElement();
		final BaseQuantitativeProperty MUTLITENANCY = ARTIST_NFPCatalogue.getInstance().MUTLITENANCY.getElement();
		final QualitativeProperty RELIABILITY = ARTIST_NFPCatalogue.getInstance().RELIABILITY.getElement();
		final QualitativeProperty LEGAL_COMPLIANCE = ARTIST_NFPCatalogue.getInstance().LEGAL_COMPLIANCE.getElement();
		final QualitativeProperty COMPATIBILITY = ARTIST_NFPCatalogue.getInstance().COMPATIBILITY.getElement();
		final QualitativeProperty MATURITY = ARTIST_NFPCatalogue.getInstance().MATURITY.getElement();
		final QualitativeProperty FAULT_TOLERANCE = ARTIST_NFPCatalogue.getInstance().FAULT_TOLERANCE.getElement();
		final QualitativeProperty RECOVERABILITY = ARTIST_NFPCatalogue.getInstance().RECOVERABILITY.getElement();
		final QualitativeProperty CO_EXISTENCE = ARTIST_NFPCatalogue.getInstance().CO_EXISTENCE.getElement();
		final QualitativeProperty INTEROPERABILITY = ARTIST_NFPCatalogue.getInstance().INTEROPERABILITY.getElement();
		final BaseQuantitativeProperty DOWN_TIME_IN_PERCENT = ARTIST_NFPCatalogue.getInstance().DOWN_TIME_IN_PERCENT.getElement();
		final BaseQuantitativeProperty MEAN_TIME_TO_RESTORE_SERVICE = ARTIST_NFPCatalogue.getInstance().MEAN_TIME_TO_RESTORE_SERVICE.getElement();
		final BaseQuantitativeProperty MEAN_TIME_BETWEEN_FAILURES = ARTIST_NFPCatalogue.getInstance().MEAN_TIME_BETWEEN_FAILURES.getElement();
		final BaseQuantitativeProperty MEAN_TIME_TO_FAILURE = ARTIST_NFPCatalogue.getInstance().MEAN_TIME_TO_FAILURE.getElement();
		final BaseQuantitativeProperty FAILURE_RATE = ARTIST_NFPCatalogue.getInstance().FAILURE_RATE.getElement();
		final BaseQuantitativeProperty RESPONSE_TIME = ARTIST_NFPCatalogue.getInstance().RESPONSE_TIME.getElement();
		final BaseQuantitativeProperty THROUGHPUT = ARTIST_NFPCatalogue.getInstance().THROUGHPUT.getElement();
		final BaseQuantitativeProperty AVERAGE_SYSTEM_LOGIN_TIME = ARTIST_NFPCatalogue.getInstance().AVERAGE_SYSTEM_LOGIN_TIME.getElement();
		final BaseQuantitativeProperty AVERAGE_RESPONSE_TIME = ARTIST_NFPCatalogue.getInstance().AVERAGE_RESPONSE_TIME.getElement();
		final BaseQuantitativeProperty UTILIZATION = ARTIST_NFPCatalogue.getInstance().UTILIZATION.getElement();
		final BaseQuantitativeProperty REQUEST_WAITING_TIME = ARTIST_NFPCatalogue.getInstance().REQUEST_WAITING_TIME.getElement();
		final BaseQuantitativeProperty REQUEST_SERVICE_TIME = ARTIST_NFPCatalogue.getInstance().REQUEST_SERVICE_TIME.getElement();
		final BaseQuantitativeProperty CPU_USAGE = ARTIST_NFPCatalogue.getInstance().CPU_USAGE.getElement();
		final BaseQuantitativeProperty MEMORY_USAGE = ARTIST_NFPCatalogue.getInstance().MEMORY_USAGE.getElement();
		final BaseQuantitativeProperty COST_STORAGE = ARTIST_NFPCatalogue.getInstance().COST_STORAGE.getElement();
		final BaseQuantitativeProperty COST_HARDWARE = ARTIST_NFPCatalogue.getInstance().COST_HARDWARE.getElement();
		final BaseQuantitativeProperty COST_PER_REQUEST = ARTIST_NFPCatalogue.getInstance().COST_PER_REQUEST.getElement();
		final BaseQuantitativeProperty CYCLOMATIC_COMPLEXITY = ARTIST_NFPCatalogue.getInstance().CYCLOMATIC_COMPLEXITY.getElement();
		final BaseQuantitativeProperty HALSTEAD_VOLUME = ARTIST_NFPCatalogue.getInstance().HALSTEAD_VOLUME.getElement();
		final BaseQuantitativeProperty COHESION = ARTIST_NFPCatalogue.getInstance().COHESION.getElement();
		final BaseQuantitativeProperty COUPLING = ARTIST_NFPCatalogue.getInstance().COUPLING.getElement();
		final BaseQuantitativeProperty TIME_TO_LEARN = ARTIST_NFPCatalogue.getInstance().TIME_TO_LEARN.getElement();
		final BaseQuantitativeProperty TIME_PER_TASK = ARTIST_NFPCatalogue.getInstance().TIME_PER_TASK.getElement();
		final BaseQuantitativeProperty TIME_SPENT_ON_ERRORS = ARTIST_NFPCatalogue.getInstance().TIME_SPENT_ON_ERRORS.getElement();
		final BaseQuantitativeProperty SINGLE_USABILITY_RATE = ARTIST_NFPCatalogue.getInstance().SINGLE_USABILITY_RATE.getElement();
		final QualitativeProperty AUDITABILITY = ARTIST_NFPCatalogue.getInstance().AUDITABILITY.getElement();
		final QualitativeProperty NON_REPUDATION = ARTIST_NFPCatalogue.getInstance().NON_REPUDATION.getElement();
		final QualitativeProperty ACCOUNTABILITY = ARTIST_NFPCatalogue.getInstance().ACCOUNTABILITY.getElement();
		final QualitativeProperty AUTHENTICITY = ARTIST_NFPCatalogue.getInstance().AUTHENTICITY.getElement();
		final QualitativeProperty CAPACITY = ARTIST_NFPCatalogue.getInstance().CAPACITY.getElement();
		final QualitativeProperty REUSABILITY = ARTIST_NFPCatalogue.getInstance().REUSABILITY.getElement();
		final QualitativeProperty ANALYZABILITY = ARTIST_NFPCatalogue.getInstance().ANALYZABILITY.getElement();
		final QualitativeProperty TESTABILITY = ARTIST_NFPCatalogue.getInstance().TESTABILITY.getElement();
		final QualitativeProperty OPERABILITY = ARTIST_NFPCatalogue.getInstance().OPERABILITY.getElement();
		final QualitativeProperty USER_ERROR_PROTECTION = ARTIST_NFPCatalogue.getInstance().USER_ERROR_PROTECTION.getElement();
		final QualitativeProperty USER_INTERFACE_AESTHETICS = ARTIST_NFPCatalogue.getInstance().USER_INTERFACE_AESTHETICS.getElement();
		final QualitativeProperty DEPENDABILITY = ARTIST_NFPCatalogue.getInstance().DEPENDABILITY.getElement();
		final BaseQuantitativeProperty BUSY_TIME = ARTIST_NFPCatalogue.getInstance().BUSY_TIME.getElement();
		final BaseQuantitativeProperty AVERAGE_QUEUE_LENGTH = ARTIST_NFPCatalogue.getInstance().AVERAGE_QUEUE_LENGTH.getElement();
	}
	
	public interface FQN {
		final String CATALOGUE = ARTIST_NFPCatalogue.getInstance().CATALOGUE.getFullyQualifiedName();
		
		final String SECURITY = ARTIST_NFPCatalogue.getInstance().SECURITY.getFullyQualifiedName();
		final String CONFIDENTIALITY = ARTIST_NFPCatalogue.getInstance().CONFIDENTIALITY.getFullyQualifiedName();
		final String INTEGRITY = ARTIST_NFPCatalogue.getInstance().INTEGRITY.getFullyQualifiedName();
		final String AVAILABILITY = ARTIST_NFPCatalogue.getInstance().AVAILABILITY.getFullyQualifiedName();
		final String SCALABILITY = ARTIST_NFPCatalogue.getInstance().SCALABILITY.getFullyQualifiedName();
		final String ELASTICITY = ARTIST_NFPCatalogue.getInstance().ELASTICITY.getFullyQualifiedName();
		final String COST = ARTIST_NFPCatalogue.getInstance().COST.getFullyQualifiedName();
		final String PERFORMANCE_EFFICIENCY = ARTIST_NFPCatalogue.getInstance().PERFORMANCE_EFFICIENCY.getFullyQualifiedName();
		final String TIME_BEHAVIOR = ARTIST_NFPCatalogue.getInstance().TIME_BEHAVIOR.getFullyQualifiedName();
		final String MAINTAINABILITY = ARTIST_NFPCatalogue.getInstance().MAINTAINABILITY.getFullyQualifiedName();
		final String MODULARITY = ARTIST_NFPCatalogue.getInstance().MODULARITY.getFullyQualifiedName();
		final String MAINTAINABILITY_INDEX_MICROSOFT = ARTIST_NFPCatalogue.getInstance().MAINTAINABILITY_INDEX_MICROSOFT.getFullyQualifiedName();
		final String MODIFIABILITY = ARTIST_NFPCatalogue.getInstance().MODIFIABILITY.getFullyQualifiedName();
		final String USABILITY = ARTIST_NFPCatalogue.getInstance().USABILITY.getFullyQualifiedName();
		final String LEARNABILITY = ARTIST_NFPCatalogue.getInstance().LEARNABILITY.getFullyQualifiedName();
		final String RESOURCE_UTILIZATION = ARTIST_NFPCatalogue.getInstance().RESOURCE_UTILIZATION.getFullyQualifiedName();
		final String SLA_COMPLIANCE = ARTIST_NFPCatalogue.getInstance().SLA_COMPLIANCE.getFullyQualifiedName();
		final String MUTLITENANCY = ARTIST_NFPCatalogue.getInstance().MUTLITENANCY.getFullyQualifiedName();
		final String RELIABILITY = ARTIST_NFPCatalogue.getInstance().RELIABILITY.getFullyQualifiedName();
		final String LEGAL_COMPLIANCE = ARTIST_NFPCatalogue.getInstance().LEGAL_COMPLIANCE.getFullyQualifiedName();
		final String COMPATIBILITY = ARTIST_NFPCatalogue.getInstance().COMPATIBILITY.getFullyQualifiedName();
		final String MATURITY = ARTIST_NFPCatalogue.getInstance().MATURITY.getFullyQualifiedName();
		final String FAULT_TOLERANCE = ARTIST_NFPCatalogue.getInstance().FAULT_TOLERANCE.getFullyQualifiedName();
		final String RECOVERABILITY = ARTIST_NFPCatalogue.getInstance().RECOVERABILITY.getFullyQualifiedName();
		final String CO_EXISTENCE = ARTIST_NFPCatalogue.getInstance().CO_EXISTENCE.getFullyQualifiedName();
		final String INTEROPERABILITY = ARTIST_NFPCatalogue.getInstance().INTEROPERABILITY.getFullyQualifiedName();
		final String DOWN_TIME_IN_PERCENT = ARTIST_NFPCatalogue.getInstance().DOWN_TIME_IN_PERCENT.getFullyQualifiedName();
		final String MEAN_TIME_TO_RESTORE_SERVICE = ARTIST_NFPCatalogue.getInstance().MEAN_TIME_TO_RESTORE_SERVICE.getFullyQualifiedName();
		final String MEAN_TIME_BETWEEN_FAILURES = ARTIST_NFPCatalogue.getInstance().MEAN_TIME_BETWEEN_FAILURES.getFullyQualifiedName();
		final String MEAN_TIME_TO_FAILURE = ARTIST_NFPCatalogue.getInstance().MEAN_TIME_TO_FAILURE.getFullyQualifiedName();
		final String FAILURE_RATE = ARTIST_NFPCatalogue.getInstance().FAILURE_RATE.getFullyQualifiedName();
		final String RESPONSE_TIME = ARTIST_NFPCatalogue.getInstance().RESPONSE_TIME.getFullyQualifiedName();
		final String THROUGHPUT = ARTIST_NFPCatalogue.getInstance().THROUGHPUT.getFullyQualifiedName();
		final String AVERAGE_SYSTEM_LOGIN_TIME = ARTIST_NFPCatalogue.getInstance().AVERAGE_SYSTEM_LOGIN_TIME.getFullyQualifiedName();
		final String AVERAGE_RESPONSE_TIME = ARTIST_NFPCatalogue.getInstance().AVERAGE_RESPONSE_TIME.getFullyQualifiedName();
		final String UTILIZATION = ARTIST_NFPCatalogue.getInstance().UTILIZATION.getFullyQualifiedName();
		final String REQUEST_WAITING_TIME = ARTIST_NFPCatalogue.getInstance().REQUEST_WAITING_TIME.getFullyQualifiedName();
		final String REQUEST_SERVICE_TIME = ARTIST_NFPCatalogue.getInstance().REQUEST_SERVICE_TIME.getFullyQualifiedName();
		final String CPU_USAGE = ARTIST_NFPCatalogue.getInstance().CPU_USAGE.getFullyQualifiedName();
		final String MEMORY_USAGE = ARTIST_NFPCatalogue.getInstance().MEMORY_USAGE.getFullyQualifiedName();
		final String COST_STORAGE = ARTIST_NFPCatalogue.getInstance().COST_STORAGE.getFullyQualifiedName();
		final String COST_HARDWARE = ARTIST_NFPCatalogue.getInstance().COST_HARDWARE.getFullyQualifiedName();
		final String COST_PER_REQUEST = ARTIST_NFPCatalogue.getInstance().COST_PER_REQUEST.getFullyQualifiedName();
		final String CYCLOMATIC_COMPLEXITY = ARTIST_NFPCatalogue.getInstance().CYCLOMATIC_COMPLEXITY.getFullyQualifiedName();
		final String HALSTEAD_VOLUME = ARTIST_NFPCatalogue.getInstance().HALSTEAD_VOLUME.getFullyQualifiedName();
		final String COHESION = ARTIST_NFPCatalogue.getInstance().COHESION.getFullyQualifiedName();
		final String COUPLING = ARTIST_NFPCatalogue.getInstance().COUPLING.getFullyQualifiedName();
		final String TIME_TO_LEARN = ARTIST_NFPCatalogue.getInstance().TIME_TO_LEARN.getFullyQualifiedName();
		final String TIME_PER_TASK = ARTIST_NFPCatalogue.getInstance().TIME_PER_TASK.getFullyQualifiedName();
		final String TIME_SPENT_ON_ERRORS = ARTIST_NFPCatalogue.getInstance().TIME_SPENT_ON_ERRORS.getFullyQualifiedName();
		final String SINGLE_USABILITY_RATE = ARTIST_NFPCatalogue.getInstance().SINGLE_USABILITY_RATE.getFullyQualifiedName();
		final String AUDITABILITY = ARTIST_NFPCatalogue.getInstance().AUDITABILITY.getFullyQualifiedName();
		final String NON_REPUDATION = ARTIST_NFPCatalogue.getInstance().NON_REPUDATION.getFullyQualifiedName();
		final String ACCOUNTABILITY = ARTIST_NFPCatalogue.getInstance().ACCOUNTABILITY.getFullyQualifiedName();
		final String AUTHENTICITY = ARTIST_NFPCatalogue.getInstance().AUTHENTICITY.getFullyQualifiedName();
		final String CAPACITY = ARTIST_NFPCatalogue.getInstance().CAPACITY.getFullyQualifiedName();
		final String REUSABILITY = ARTIST_NFPCatalogue.getInstance().REUSABILITY.getFullyQualifiedName();
		final String ANALYZABILITY = ARTIST_NFPCatalogue.getInstance().ANALYZABILITY.getFullyQualifiedName();
		final String TESTABILITY = ARTIST_NFPCatalogue.getInstance().TESTABILITY.getFullyQualifiedName();
		final String OPERABILITY = ARTIST_NFPCatalogue.getInstance().OPERABILITY.getFullyQualifiedName();
		final String USER_ERROR_PROTECTION = ARTIST_NFPCatalogue.getInstance().USER_ERROR_PROTECTION.getFullyQualifiedName();
		final String USER_INTERFACE_AESTHETICS = ARTIST_NFPCatalogue.getInstance().USER_INTERFACE_AESTHETICS.getFullyQualifiedName();
		final String DEPENDABILITY = ARTIST_NFPCatalogue.getInstance().DEPENDABILITY.getFullyQualifiedName();
		final String BUSY_TIME = ARTIST_NFPCatalogue.getInstance().BUSY_TIME.getFullyQualifiedName();
		final String AVERAGE_QUEUE_LENGTH = ARTIST_NFPCatalogue.getInstance().AVERAGE_QUEUE_LENGTH.getFullyQualifiedName();
	}
	
	public interface Uri {
		final String CATALOGUE = ARTIST_NFPCatalogue.getInstance().CATALOGUE.getUri();
		
		final String SECURITY = ARTIST_NFPCatalogue.getInstance().SECURITY.getUri();
		final String CONFIDENTIALITY = ARTIST_NFPCatalogue.getInstance().CONFIDENTIALITY.getUri();
		final String INTEGRITY = ARTIST_NFPCatalogue.getInstance().INTEGRITY.getUri();
		final String AVAILABILITY = ARTIST_NFPCatalogue.getInstance().AVAILABILITY.getUri();
		final String SCALABILITY = ARTIST_NFPCatalogue.getInstance().SCALABILITY.getUri();
		final String ELASTICITY = ARTIST_NFPCatalogue.getInstance().ELASTICITY.getUri();
		final String COST = ARTIST_NFPCatalogue.getInstance().COST.getUri();
		final String PERFORMANCE_EFFICIENCY = ARTIST_NFPCatalogue.getInstance().PERFORMANCE_EFFICIENCY.getUri();
		final String TIME_BEHAVIOR = ARTIST_NFPCatalogue.getInstance().TIME_BEHAVIOR.getUri();
		final String MAINTAINABILITY = ARTIST_NFPCatalogue.getInstance().MAINTAINABILITY.getUri();
		final String MODULARITY = ARTIST_NFPCatalogue.getInstance().MODULARITY.getUri();
		final String MAINTAINABILITY_INDEX_MICROSOFT = ARTIST_NFPCatalogue.getInstance().MAINTAINABILITY_INDEX_MICROSOFT.getUri();
		final String MODIFIABILITY = ARTIST_NFPCatalogue.getInstance().MODIFIABILITY.getUri();
		final String USABILITY = ARTIST_NFPCatalogue.getInstance().USABILITY.getUri();
		final String LEARNABILITY = ARTIST_NFPCatalogue.getInstance().LEARNABILITY.getUri();
		final String RESOURCE_UTILIZATION = ARTIST_NFPCatalogue.getInstance().RESOURCE_UTILIZATION.getUri();
		final String SLA_COMPLIANCE = ARTIST_NFPCatalogue.getInstance().SLA_COMPLIANCE.getUri();
		final String MUTLITENANCY = ARTIST_NFPCatalogue.getInstance().MUTLITENANCY.getUri();
		final String RELIABILITY = ARTIST_NFPCatalogue.getInstance().RELIABILITY.getUri();
		final String LEGAL_COMPLIANCE = ARTIST_NFPCatalogue.getInstance().LEGAL_COMPLIANCE.getUri();
		final String COMPATIBILITY = ARTIST_NFPCatalogue.getInstance().COMPATIBILITY.getUri();
		final String MATURITY = ARTIST_NFPCatalogue.getInstance().MATURITY.getUri();
		final String FAULT_TOLERANCE = ARTIST_NFPCatalogue.getInstance().FAULT_TOLERANCE.getUri();
		final String RECOVERABILITY = ARTIST_NFPCatalogue.getInstance().RECOVERABILITY.getUri();
		final String CO_EXISTENCE = ARTIST_NFPCatalogue.getInstance().CO_EXISTENCE.getUri();
		final String INTEROPERABILITY = ARTIST_NFPCatalogue.getInstance().INTEROPERABILITY.getUri();
		final String DOWN_TIME_IN_PERCENT = ARTIST_NFPCatalogue.getInstance().DOWN_TIME_IN_PERCENT.getUri();
		final String MEAN_TIME_TO_RESTORE_SERVICE = ARTIST_NFPCatalogue.getInstance().MEAN_TIME_TO_RESTORE_SERVICE.getUri();
		final String MEAN_TIME_BETWEEN_FAILURES = ARTIST_NFPCatalogue.getInstance().MEAN_TIME_BETWEEN_FAILURES.getUri();
		final String MEAN_TIME_TO_FAILURE = ARTIST_NFPCatalogue.getInstance().MEAN_TIME_TO_FAILURE.getUri();
		final String FAILURE_RATE = ARTIST_NFPCatalogue.getInstance().FAILURE_RATE.getUri();
		final String RESPONSE_TIME = ARTIST_NFPCatalogue.getInstance().RESPONSE_TIME.getUri();
		final String THROUGHPUT = ARTIST_NFPCatalogue.getInstance().THROUGHPUT.getUri();
		final String AVERAGE_SYSTEM_LOGIN_TIME = ARTIST_NFPCatalogue.getInstance().AVERAGE_SYSTEM_LOGIN_TIME.getUri();
		final String AVERAGE_RESPONSE_TIME = ARTIST_NFPCatalogue.getInstance().AVERAGE_RESPONSE_TIME.getUri();
		final String UTILIZATION = ARTIST_NFPCatalogue.getInstance().UTILIZATION.getUri();
		final String REQUEST_WAITING_TIME = ARTIST_NFPCatalogue.getInstance().REQUEST_WAITING_TIME.getUri();
		final String REQUEST_SERVICE_TIME = ARTIST_NFPCatalogue.getInstance().REQUEST_SERVICE_TIME.getUri();
		final String CPU_USAGE = ARTIST_NFPCatalogue.getInstance().CPU_USAGE.getUri();
		final String MEMORY_USAGE = ARTIST_NFPCatalogue.getInstance().MEMORY_USAGE.getUri();
		final String COST_STORAGE = ARTIST_NFPCatalogue.getInstance().COST_STORAGE.getUri();
		final String COST_HARDWARE = ARTIST_NFPCatalogue.getInstance().COST_HARDWARE.getUri();
		final String COST_PER_REQUEST = ARTIST_NFPCatalogue.getInstance().COST_PER_REQUEST.getUri();
		final String CYCLOMATIC_COMPLEXITY = ARTIST_NFPCatalogue.getInstance().CYCLOMATIC_COMPLEXITY.getUri();
		final String HALSTEAD_VOLUME = ARTIST_NFPCatalogue.getInstance().HALSTEAD_VOLUME.getUri();
		final String COHESION = ARTIST_NFPCatalogue.getInstance().COHESION.getUri();
		final String COUPLING = ARTIST_NFPCatalogue.getInstance().COUPLING.getUri();
		final String TIME_TO_LEARN = ARTIST_NFPCatalogue.getInstance().TIME_TO_LEARN.getUri();
		final String TIME_PER_TASK = ARTIST_NFPCatalogue.getInstance().TIME_PER_TASK.getUri();
		final String TIME_SPENT_ON_ERRORS = ARTIST_NFPCatalogue.getInstance().TIME_SPENT_ON_ERRORS.getUri();
		final String SINGLE_USABILITY_RATE = ARTIST_NFPCatalogue.getInstance().SINGLE_USABILITY_RATE.getUri();
		final String AUDITABILITY = ARTIST_NFPCatalogue.getInstance().AUDITABILITY.getUri();
		final String NON_REPUDATION = ARTIST_NFPCatalogue.getInstance().NON_REPUDATION.getUri();
		final String ACCOUNTABILITY = ARTIST_NFPCatalogue.getInstance().ACCOUNTABILITY.getUri();
		final String AUTHENTICITY = ARTIST_NFPCatalogue.getInstance().AUTHENTICITY.getUri();
		final String CAPACITY = ARTIST_NFPCatalogue.getInstance().CAPACITY.getUri();
		final String REUSABILITY = ARTIST_NFPCatalogue.getInstance().REUSABILITY.getUri();
		final String ANALYZABILITY = ARTIST_NFPCatalogue.getInstance().ANALYZABILITY.getUri();
		final String TESTABILITY = ARTIST_NFPCatalogue.getInstance().TESTABILITY.getUri();
		final String OPERABILITY = ARTIST_NFPCatalogue.getInstance().OPERABILITY.getUri();
		final String USER_ERROR_PROTECTION = ARTIST_NFPCatalogue.getInstance().USER_ERROR_PROTECTION.getUri();
		final String USER_INTERFACE_AESTHETICS = ARTIST_NFPCatalogue.getInstance().USER_INTERFACE_AESTHETICS.getUri();
		final String DEPENDABILITY = ARTIST_NFPCatalogue.getInstance().DEPENDABILITY.getUri();
		final String BUSY_TIME = ARTIST_NFPCatalogue.getInstance().BUSY_TIME.getUri();
		final String AVERAGE_QUEUE_LENGTH = ARTIST_NFPCatalogue.getInstance().AVERAGE_QUEUE_LENGTH.getUri();
	}
	
	private static ARTIST_NFPCatalogue instance;
	
	public static ARTIST_NFPCatalogue getInstance() {
		if(instance == null)
			instance = new ARTIST_NFPCatalogue();
		return instance;
	}
	
	public final MigrationModelElement<QualitativeProperty> SECURITY;
	public final MigrationModelElement<QualitativeProperty> CONFIDENTIALITY;
	public final MigrationModelElement<QualitativeProperty> INTEGRITY;
	public final MigrationModelElement<QualitativeProperty> AVAILABILITY;
	public final MigrationModelElement<QualitativeProperty> SCALABILITY;
	public final MigrationModelElement<QualitativeProperty> ELASTICITY;
	public final MigrationModelElement<QualitativeProperty> COST;
	public final MigrationModelElement<QualitativeProperty> PERFORMANCE_EFFICIENCY;
	public final MigrationModelElement<QualitativeProperty> TIME_BEHAVIOR;
	public final MigrationModelElement<QualitativeProperty> MAINTAINABILITY;
	public final MigrationModelElement<QualitativeProperty> MODULARITY;
	public final MigrationModelElement<DerivedQuantitativeProperty> MAINTAINABILITY_INDEX_MICROSOFT;
	public final MigrationModelElement<QualitativeProperty> MODIFIABILITY;
	public final MigrationModelElement<QualitativeProperty> USABILITY;
	public final MigrationModelElement<QualitativeProperty> LEARNABILITY;
	public final MigrationModelElement<QualitativeProperty> RESOURCE_UTILIZATION;
	public final MigrationModelElement<BaseQuantitativeProperty> SLA_COMPLIANCE;
	public final MigrationModelElement<BaseQuantitativeProperty> MUTLITENANCY;
	public final MigrationModelElement<QualitativeProperty> RELIABILITY;
	public final MigrationModelElement<QualitativeProperty> LEGAL_COMPLIANCE;
	public final MigrationModelElement<QualitativeProperty> COMPATIBILITY;
	public final MigrationModelElement<QualitativeProperty> MATURITY;
	public final MigrationModelElement<QualitativeProperty> FAULT_TOLERANCE;
	public final MigrationModelElement<QualitativeProperty> RECOVERABILITY;
	public final MigrationModelElement<QualitativeProperty> CO_EXISTENCE;
	public final MigrationModelElement<QualitativeProperty> INTEROPERABILITY;
	public final MigrationModelElement<BaseQuantitativeProperty> DOWN_TIME_IN_PERCENT;
	public final MigrationModelElement<BaseQuantitativeProperty> MEAN_TIME_TO_RESTORE_SERVICE;
	public final MigrationModelElement<BaseQuantitativeProperty> MEAN_TIME_BETWEEN_FAILURES;
	public final MigrationModelElement<BaseQuantitativeProperty> MEAN_TIME_TO_FAILURE;
	public final MigrationModelElement<BaseQuantitativeProperty> FAILURE_RATE;
	public final MigrationModelElement<BaseQuantitativeProperty> RESPONSE_TIME;
	public final MigrationModelElement<BaseQuantitativeProperty> THROUGHPUT;
	public final MigrationModelElement<BaseQuantitativeProperty> AVERAGE_SYSTEM_LOGIN_TIME;
	public final MigrationModelElement<BaseQuantitativeProperty> AVERAGE_RESPONSE_TIME;
	public final MigrationModelElement<BaseQuantitativeProperty> UTILIZATION;
	public final MigrationModelElement<BaseQuantitativeProperty> REQUEST_WAITING_TIME;
	public final MigrationModelElement<BaseQuantitativeProperty> REQUEST_SERVICE_TIME;
	public final MigrationModelElement<BaseQuantitativeProperty> CPU_USAGE;
	public final MigrationModelElement<BaseQuantitativeProperty> MEMORY_USAGE;
	public final MigrationModelElement<BaseQuantitativeProperty> COST_STORAGE;
	public final MigrationModelElement<BaseQuantitativeProperty> COST_HARDWARE;
	public final MigrationModelElement<BaseQuantitativeProperty> COST_PER_REQUEST;
	public final MigrationModelElement<BaseQuantitativeProperty> CYCLOMATIC_COMPLEXITY;
	public final MigrationModelElement<BaseQuantitativeProperty> HALSTEAD_VOLUME;
	public final MigrationModelElement<BaseQuantitativeProperty> COHESION;
	public final MigrationModelElement<BaseQuantitativeProperty> COUPLING;
	public final MigrationModelElement<BaseQuantitativeProperty> TIME_TO_LEARN;
	public final MigrationModelElement<BaseQuantitativeProperty> TIME_PER_TASK;
	public final MigrationModelElement<BaseQuantitativeProperty> TIME_SPENT_ON_ERRORS;
	public final MigrationModelElement<BaseQuantitativeProperty> SINGLE_USABILITY_RATE;
	public final MigrationModelElement<QualitativeProperty> AUDITABILITY;
	public final MigrationModelElement<QualitativeProperty> NON_REPUDATION;
	public final MigrationModelElement<QualitativeProperty> ACCOUNTABILITY;
	public final MigrationModelElement<QualitativeProperty> AUTHENTICITY;
	public final MigrationModelElement<QualitativeProperty> CAPACITY;
	public final MigrationModelElement<QualitativeProperty> REUSABILITY;
	public final MigrationModelElement<QualitativeProperty> ANALYZABILITY;
	public final MigrationModelElement<QualitativeProperty> TESTABILITY;
	public final MigrationModelElement<QualitativeProperty> OPERABILITY;
	public final MigrationModelElement<QualitativeProperty> USER_ERROR_PROTECTION;
	public final MigrationModelElement<QualitativeProperty> USER_INTERFACE_AESTHETICS;
	public final MigrationModelElement<QualitativeProperty> DEPENDABILITY;
	public final MigrationModelElement<BaseQuantitativeProperty> BUSY_TIME;
	public final MigrationModelElement<BaseQuantitativeProperty> AVERAGE_QUEUE_LENGTH;
	
	protected ARTIST_NFPCatalogue() {
		super(CATALOGUE_URI_STRING);
		
		SECURITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Security"));
		CONFIDENTIALITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Confidentiality"));
		INTEGRITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Integrity"));
		AVAILABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Availability"));
		SCALABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Scalability"));
		ELASTICITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Elasticity"));
		COST = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Cost"));
		PERFORMANCE_EFFICIENCY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("PerformanceEfficiency"));
		TIME_BEHAVIOR = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("TimeBehavior"));
		MAINTAINABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Maintainability"));
		MODULARITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Modularity"));
		MAINTAINABILITY_INDEX_MICROSOFT = new MigrationModelElement<DerivedQuantitativeProperty>(getDerivedQuantitativePropertyByName("MaintainabilityIndexMicrosoft"));
		MODIFIABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Modifiability"));
		USABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Usability"));
		LEARNABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Learnability"));
		RESOURCE_UTILIZATION = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("ResourceUtilization"));
		SLA_COMPLIANCE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("SLACompliance"));
		MUTLITENANCY = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("MutliTenancy"));
		RELIABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Reliability"));
		LEGAL_COMPLIANCE = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("LegalCompliance"));
		COMPATIBILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Compatibility"));
		MATURITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Maturity"));
		FAULT_TOLERANCE = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("FaultTolerance"));
		RECOVERABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Recoverability"));
		CO_EXISTENCE = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("CoExistence"));
		INTEROPERABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Interoperability"));
		DOWN_TIME_IN_PERCENT = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("DownTimeInPercent"));
		MEAN_TIME_TO_RESTORE_SERVICE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("MeanTimeToRestoreService"));
		MEAN_TIME_BETWEEN_FAILURES = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("MeanTimeBetweenFailures"));
		MEAN_TIME_TO_FAILURE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("MeanTimeToFailure"));
		FAILURE_RATE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("FailureRate"));
		RESPONSE_TIME = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("ResponseTime"));
		THROUGHPUT = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("Throughput"));
		AVERAGE_SYSTEM_LOGIN_TIME = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("AverageSystemLoginTime"));
		AVERAGE_RESPONSE_TIME = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("AverageResponseTime"));
		UTILIZATION = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("Utilization"));
		REQUEST_WAITING_TIME = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("RequestWaitingTime"));
		REQUEST_SERVICE_TIME = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("RequestServiceTime"));
		CPU_USAGE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("CPUUsage"));
		MEMORY_USAGE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("MemoryUsage"));
		COST_STORAGE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("CostStorage"));
		COST_HARDWARE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("CostHardware"));
		COST_PER_REQUEST = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("CostPerRequest"));
		CYCLOMATIC_COMPLEXITY = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("CyclomaticComplexity"));
		HALSTEAD_VOLUME = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("HalsteadVolume"));
		COHESION = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("Cohesion"));
		COUPLING = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("Coupling"));
		TIME_TO_LEARN = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("TimeToLearn"));
		TIME_PER_TASK = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("TimePerTask"));
		TIME_SPENT_ON_ERRORS = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("TimeSpentOnErrors"));
		SINGLE_USABILITY_RATE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("SingleUsabilityRate"));
		AUDITABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Auditability"));
		NON_REPUDATION = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("NonRepudation"));
		ACCOUNTABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Accountability"));
		AUTHENTICITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Authenticity"));
		CAPACITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Capacity"));
		REUSABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Reusability"));
		ANALYZABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Analyzability"));
		TESTABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Testability"));
		OPERABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Operability"));
		USER_ERROR_PROTECTION = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("UserErrorProtection"));
		USER_INTERFACE_AESTHETICS = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("UserInterfaceAesthetics"));
		DEPENDABILITY = new MigrationModelElement<QualitativeProperty>(getQualitativePropertyByName("Dependability"));
		BUSY_TIME = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("BusyTime"));
		AVERAGE_QUEUE_LENGTH = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("AverageQueueLength"));
	}
	
}

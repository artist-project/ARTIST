/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.model.migrationstrategy;

import java.util.Arrays;
import java.util.List;

/**
 * Enumeration mapping all migration strategy categories with possible stereotypes belonging to each category
 * 
 * @author Burak Karaboga
 *
 */
public enum Category {

	APPLICATION,
	DEPLOYMENT,
	CONFIGURATION,
	JAVARUNTIME,
	SECURITY ("Controller", "WCFService", "Service", "Security"),
	//TODO: Added "ManagedBean" and "Stateless" to Network category until component model is adjusted to group these as services
	NETWORK ("Controller", "WCFService", "Service", "ManagedBean", "EnterpriseBean", "CDIBean", "ServiceHost", "Servlet"),
	DATA("DataSource", "Model", "Data", "DataModel", "DataStore", "ListStore", "BLOB", "ObjectModel", "Entity", "Embeddable", "EntityManager", "RemoteObject"),
	FRAMEWORK("ManagedBean", "Controller", "CDIManagedBean", "CDIBean", "EJB", "WCFService", "Service"),
	VIEW("View", "Perspective", "SWT"),
	WEB_SERVICE("RESTService", "WebService", "WCFService"),
	APPLICATION_SERVICE("Service"),
	//TODO: Added "SessionScoped","ConversationScoped" and "RequestScoped" to Queue category until component model is adjusted to group these as controllers
	QUEUE("JMS", "Controller", "ManagedBean", "EnterpriseBean", "CDIBean"),
	WORKFLOW("Workflow"),
	PERFORMANCE("Cache"),
	REALTIMEMSG("Real time Messaging"),
	VISUALIZATION("Visio", "VisioObjectModel"),
	LOGGING("Logging");

	private List<String> possibleStereotypes;

	private Category (String ... possibleStereotypes) {
		this.possibleStereotypes = Arrays.asList(possibleStereotypes);
	}

	public List<String> getPossibleStereotypes() {
		return possibleStereotypes;
	}
}

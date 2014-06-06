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
	DATA("DataSource", "Model", "Data", "DataModel", "DataStore", "ListStore", "BLOB"),
	FRAMEWORK("ManagedBean", "Controller", "CDIManagedBean", "CDIBean", "EJB", "WCFService", "Service"),
	VIEW("View", "Perspective"),
	WEB_SERVICE("RESTService", "WebService"),
	QUEUE("JMS"),
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

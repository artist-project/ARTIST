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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Java model of Migration Strategies xml type.
 * 
 * @author Burak Karaboga
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="MigrationStrategies")
public class MigrationStrategies {

	@XmlElement(name="MigrationStrategy", type=MigrationStrategy.class)
	private List<MigrationStrategy> migrationStrategies;

	/**
	 * Returns the list of migration strategies
	 * 
	 * @return A {@link List} of {@link MigrationStrategy} 
	 */
	public List<MigrationStrategy> getMigrationStrategies() {
		return migrationStrategies;
	}

	/**
	 * Sets the list of migration strategies
	 * 
	 * @param migrationStrategies A {@link List} of {@link MigrationStrategy}
	 */
	public void setMigrationStrategies(List<MigrationStrategy> migrationStrategies) {
		this.migrationStrategies = migrationStrategies;
	}
}

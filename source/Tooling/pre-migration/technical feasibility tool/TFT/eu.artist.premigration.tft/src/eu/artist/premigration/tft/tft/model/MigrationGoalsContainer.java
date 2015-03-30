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
package eu.artist.premigration.tft.tft.model;

/**
 * Singleton containing the migration goals
 * @author Burak Karaboga
 *
 */
public enum MigrationGoalsContainer {

	INSTANCE;
	
	private MigrationGoals migrationGoals;
	
	public void setMigrationGoals(MigrationGoals migrationGoals) {
		this.migrationGoals = migrationGoals;
	}
	
	public MigrationGoals getMigrationGoals(){
		return migrationGoals;
	}
}

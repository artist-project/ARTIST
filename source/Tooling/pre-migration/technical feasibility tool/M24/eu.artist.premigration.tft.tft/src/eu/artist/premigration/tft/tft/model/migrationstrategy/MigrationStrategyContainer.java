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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Singleton containing all defined migration strategies in the context of TFT
 *  
 * @author Burak Karaboga
 *
 */
public enum MigrationStrategyContainer {

	INSTANCE;

	private List <MigrationStrategy> migrationStrategies;
	private Map <Category, List<MigrationStrategy>> categoryLookup;
	private Map <String, MigrationStrategy> idLookup;

	public List<MigrationStrategy> getMigrationStrategies() {
		return migrationStrategies;
	}

	//Setter for the list of all defined migration strategies
	public void setMigrationStrategies(MigrationStrategies migrationStrategies) {
		this.migrationStrategies = migrationStrategies.getMigrationStrategies();
		
		categoryLookup = new HashMap<Category, List<MigrationStrategy>>();
		idLookup = new HashMap<String, MigrationStrategy>();
		
		//Initializing the category and id lookup tables
		for (MigrationStrategy migrationStrategy : this.migrationStrategies) {
			
			if (categoryLookup.containsKey(migrationStrategy.getCategory())){
				categoryLookup.get(migrationStrategy.getCategory()).add(migrationStrategy);
			}
			else {
				categoryLookup.put(migrationStrategy.getCategory(), new ArrayList<MigrationStrategy>(Arrays.asList(migrationStrategy)));
			}
			
			idLookup.put(migrationStrategy.getId(), migrationStrategy);
		}
	}
	
	/**
	 * Returns the migration strategy of the passed ID
	 * 
	 * @param id A {@link String} of migration strategy id 
	 * @return A {@link MigrationStrategy}
	 */
	public MigrationStrategy getMigrationStrategy(String id){
		MigrationStrategy seed = idLookup.get(id);
		return new MigrationStrategy(seed.getId(), seed.getText(), seed.getDescription(), seed.getCategory(), seed.isSuggested(), seed.getComplexity(), seed.getTargetPlatforms());
	}
	
	/**
	 * Returns migration strategies belonging to the passed category
	 * 
	 * @param category A migration strategy {@link Category} 
	 * @return A {@link List} of {@link MigrationStrategy} of the passed categoy
	 */
	public List<MigrationStrategy> getMigrationStrategiesByCategory(Category category) {
		return categoryLookup.get(category);
	}
}

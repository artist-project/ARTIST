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
package eu.artist.premigration.tft.tft.effort;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

import eu.artist.premigration.tft.tft.model.Component;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;

/**
 * Singleton providing methods for calculating the effort needed to migrate a certain component to the cloud
 * according to the migration strategies 
 * 
 * @author Burak Karaboga
 *
 */
public enum EffortCalculator {
	
	INSTANCE;
	
	//Loading the effort weights for each strategy category
	private static Properties effortProperties;

	static {
		try {
			effortProperties = new Properties();
			effortProperties.load(EffortCalculator.class.getResourceAsStream("effort_weight.properties"));
			
		} catch (IOException e) {
    		e.printStackTrace();
        }
	}
	
	/**
	 * Returns effort weight for given strategy
	 * 
	 * @param migrationStrategy {@link} MigrationStrategy for which the effort will be calculated
	 * @return Effort weight value for given strategy
	 */
	public int getEffortWeightForStrategy (MigrationStrategy migrationStrategy){
				
		String weight = (String) effortProperties.get(migrationStrategy.getCategory().name()+ "." + migrationStrategy.getComplexity().name());
		if (weight != null) {
			return  Integer.valueOf(weight);
		}
		return -1;
	}
	
	/**
	 * Calculates the effort needed for migration for a specific component
	 * @param component {@link} Component for which the effort will be calculated
	 * @return Effort weight value for given component
	 */
	public BigDecimal calculateEffortForComponent (Component component){
		
		float effort = 0;
		for(MigrationStrategy strategy : component.getMigrationStrategies()){
			effort += calculateEffortForStrategy(component, strategy);			
		}
		
		BigDecimal bdEffort = BigDecimal.valueOf(effort);
		
		return bdEffort.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	public float calculateEffortForStrategy (Component component, MigrationStrategy strategy){
		
		return getEffortWeightForStrategy(strategy)*component.getComplexity();
	}
}

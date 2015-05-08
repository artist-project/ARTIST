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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Java model of MigrationGoals xml type
 * @author Burak Karaboga
 *
 */
@XmlRootElement(name="MigrationGoals")
public class MigrationGoals {

	private TechnicalGoals technicalGoals;
	private BusinessGoals businessGoals;
	
	@XmlElement(name="TechnicalGoals")
	public TechnicalGoals getTechnicalGoals() {
		return technicalGoals;
	}
	public void setTechnicalGoals(TechnicalGoals technicalGoals) {
		this.technicalGoals = technicalGoals;
	}
	@XmlElement(name="BusinessGoals")
	public BusinessGoals getBusinessGoals() {
		return businessGoals;
	}
	public void setBusinessGoals(BusinessGoals businessGoals) {
		this.businessGoals = businessGoals;
	}
}

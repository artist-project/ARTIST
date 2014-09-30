/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 * 
 *******************************************************************************/
package eu.artist.methodology.mpt.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * Java model of xml type BusinessGoals
 *
 */
public class BusinessGoals {
	
	private Monitoring mon;
	private UserInterface use;
	private Billing bil;
	private Provisioning pro;
	
	@XmlElement
	public Monitoring getMon() {
		return mon;
	}

	public void setMon(Monitoring mon) {
		this.mon = mon;
	}

	@XmlElement
	public UserInterface getUse() {
		return use;
	}

	public void setUse(UserInterface use) {
		this.use = use;
	}

	@XmlElement
	public Billing getBil() {
		return bil;
	}

	public void setBil(Billing bil) {
		this.bil = bil;
	}

	@XmlElement
	public Provisioning getPro() {
		return pro;
	}

	public void setPro(Provisioning pro) {
		this.pro = pro;
	}

	public static class Monitoring {
		
		private String measuredElements;

		@XmlElement(name="measur_elem")
		public String getMeasuredElements() {
			return measuredElements;
		}

		public void setMeasuredElements(String measuredElements) {
			this.measuredElements = measuredElements;
		}
	}
	
	public static class UserInterface {
		
		private String waiCompilant;

		@XmlElement(name="wai")
		public String getWaiCompilant() {
			return waiCompilant;
		}

		public void setWaiCompilant(String waiCompilant) {
			this.waiCompilant = waiCompilant;
		}
	}
	
	public static class Billing {
		
		private String rule;

		@XmlElement
		public String getRule() {
			return rule;
		}

		public void setRule(String rule) {
			this.rule = rule;
		}
	}
	
	public static class Provisioning {
		
		private String licenseModel;

		@XmlElement(name="license_mod")
		public String getLicenseModel() {
			return licenseModel;
		}

		public void setLicenseModel(String licenseModel) {
			this.licenseModel = licenseModel;
		}
	}
}

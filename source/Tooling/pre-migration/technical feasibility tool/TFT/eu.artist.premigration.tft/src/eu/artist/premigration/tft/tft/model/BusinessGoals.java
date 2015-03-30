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

/**
 * Java model of xml type BusinessGoals
 * @author Burak Karaboga
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
		private boolean measuredElementsChecked;
		
		@XmlElement(name="measur_elem")
		public String getMeasuredElements() {
			return measuredElements;
		}

		public void setMeasuredElements(String measuredElements) {
			this.measuredElements = measuredElements;
		}

		public boolean isMeasuredElementsChecked() {
			return measuredElementsChecked;
		}

		public void setMeasuredElementsChecked(boolean measuredElementsChecked) {
			this.measuredElementsChecked = measuredElementsChecked;
		}
		
	}
	
	public static class UserInterface {
		
		private String waiCompilant;
		private boolean waiCompilantChecked;

		@XmlElement(name="wai")
		public String getWaiCompilant() {
			return waiCompilant;
		}

		public void setWaiCompilant(String waiCompilant) {
			this.waiCompilant = waiCompilant;
		}

		public boolean isWaiCompilantChecked() {
			return waiCompilantChecked;
		}

		public void setWaiCompilantChecked(boolean waiCompilantChecked) {
			this.waiCompilantChecked = waiCompilantChecked;
		}
	}
	
	public static class Billing {
		
		private String rule;
		private boolean ruleChecked;

		@XmlElement
		public String getRule() {
			return rule;
		}

		public void setRule(String rule) {
			this.rule = rule;
		}

		public boolean isRuleChecked() {
			return ruleChecked;
		}

		public void setRuleChecked(boolean ruleChecked) {
			this.ruleChecked = ruleChecked;
		}
	}
	
	public static class Provisioning {
		
		private String licenseModel;
		private boolean licenseModelChecked;

		@XmlElement(name="license_mod")
		public String getLicenseModel() {
			return licenseModel;
		}

		public void setLicenseModel(String licenseModel) {
			this.licenseModel = licenseModel;
		}

		public boolean isLicenseModelChecked() {
			return licenseModelChecked;
		}

		public void setLicenseModelChecked(boolean licenseModelChecked) {
			this.licenseModelChecked = licenseModelChecked;
		}
	}
}

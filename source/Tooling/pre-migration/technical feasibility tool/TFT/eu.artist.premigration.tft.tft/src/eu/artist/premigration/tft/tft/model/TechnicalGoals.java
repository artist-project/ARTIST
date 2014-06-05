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
 * Java model of xml type Technical Goals
 * @author Burak Karaboga
 *
 */
public class TechnicalGoals {

	
	private ArchitectureAndProgramming a_p;
	private SLA sla;
	private UserControlAndSecurity u_c;
	private IAAS iaas;
	private Interoperability interop;

	@XmlElement
	public ArchitectureAndProgramming getA_p() {
		return a_p;
	}

	public void setA_p(ArchitectureAndProgramming a_p) {
		this.a_p = a_p;
	}

	@XmlElement(name="SLA")
	public SLA getSla() {
		return sla;
	}

	public void setSla(SLA sla) {
		this.sla = sla;
	}

	@XmlElement
	public UserControlAndSecurity getU_c() {
		return u_c;
	}

	public void setU_c(UserControlAndSecurity u_c) {
		this.u_c = u_c;
	}

	@XmlElement
	public IAAS getIaas() {
		return iaas;
	}

	public void setIaas(IAAS iaas) {
		this.iaas = iaas;
	}

	@XmlElement
	public Interoperability getInterop() {
		return interop;
	}

	public void setInterop(Interoperability interop) {
		this.interop = interop;
	}

	public static class ArchitectureAndProgramming {

		private String migratedProgrammingLanguage;
		private String multitenancy;
		private String databaseScalabilityRequirements;

		@XmlElement(name="migratedpl")
		public String getMigratedProgrammingLanguage() {
			return migratedProgrammingLanguage;
		}
		public void setMigratedProgrammingLanguage(String migratedProgrammingLanguage) {
			this.migratedProgrammingLanguage = migratedProgrammingLanguage;
		}
		@XmlElement
		public String getMultitenancy() {
			return multitenancy;
		}
		public void setMultitenancy(String multitenancy) {
			this.multitenancy = multitenancy;
		}
		@XmlElement(name="tdatabasereq")
		public String getDatabaseScalabilityRequirements() {
			return databaseScalabilityRequirements;
		}
		public void setDatabaseScalabilityRequirements(
				String databaseScalabilityRequirements) {
			this.databaseScalabilityRequirements = databaseScalabilityRequirements;
		}
	}

	public static class SLA {
		private Integer reliability;
		private String dataLocation;
		private Float responseSet;
		
		@XmlElement
		public Integer getReliability() {
			return reliability;
		}
		public void setReliability(Integer reliability) {
			this.reliability = reliability;
		}
		@XmlElement(name="datalocation")
		public String getDataLocation() {
			return dataLocation;
		}
		public void setDataLocation(String dataLocation) {
			this.dataLocation = dataLocation;
		}
		@XmlElement(name="responset")
		public Float getResponseSet() {
			return responseSet;
		}
		public void setResponseSet(Float responseSet) {
			this.responseSet = responseSet;
		}
	}

	public static class UserControlAndSecurity {

		private String configurationRequirements;
		private String authorisationRequirements;
		
		@XmlElement(name="configreq")
		public String getConfigurationRequirements() {
			return configurationRequirements;
		}
		public void setConfigurationRequirements(String configurationRequirements) {
			this.configurationRequirements = configurationRequirements;
		}
		@XmlElement(name="authorreq")
		public String getAuthorisationRequirements() {
			return authorisationRequirements;
		}
		public void setAuthorisationRequirements(String authorisationRequirements) {
			this.authorisationRequirements = authorisationRequirements;
		}
	}

	public static class IAAS {
		private String targetPlatform;
		private String selectedTargetPlatform;

		@XmlElement(name="targetplat")
		public String getTargetPlatform() {
			return targetPlatform;
		}
		public void setTargetPlatform(String targetPlatform) {
			this.targetPlatform = targetPlatform;
		}
		public String getSelectedTargetPlatform() {
			return selectedTargetPlatform;
		}
		public void setSelectedTargetPlatform(String selectedTargetPlatform) {
			this.selectedTargetPlatform = selectedTargetPlatform;
		}
	}

	public static class Interoperability {
		
		private String InteroperabilityRequirements;

		@XmlElement(name="interopreq")
		public String getInteroperabilityRequirements() {
			return InteroperabilityRequirements;
		}

		public void setInteroperabilityRequirements(String interoperabilityRequirements) {
			InteroperabilityRequirements = interoperabilityRequirements;
		}
	}
}

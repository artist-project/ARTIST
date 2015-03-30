/*
* Copyright (c) 2014 Tecnalia.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*
*Zurik Corera (Tecnalia)-SCC component implementation
*
*
*
*
*Initially developed in the context of ARTIST EU project www.artist-project.eu
*/ 

package eu.artist.premigration.tft.scc.structures;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Component")
public class Component {
	
	
	
	private String name="";

	private int generalizations=0;
	private int hierarchies=0;
	private int aggregations=0;

	private int classNumber=0;
	private int afferentCoupling=0;
	private int efferentCoupling=0;
	private float cyclomaticComplexity=0;
	private float nestedBlockDepth=0;

	private float modifiability=0;
	private float scalability=0;
	private float understandability=0;
	private float levelOfComplexity=0;
	private float maintenance=0;

	private float reusability=0;
	private float reusabilityLines=0;

	
	private int maxDIT=0;
	private float percentageCoverage=0;
	private float DMS=0;
	private float cohesion=0;
	
	@XmlElement(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@XmlElement(name="classNumber")
	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	@XmlElement(name="afferentCoupling")
	public int getAfferentCoupling() {
		return afferentCoupling;
	}

	public void setAfferentCoupling(int afferentCoupling) {
		this.afferentCoupling = afferentCoupling;
	}

	@XmlElement(name="efferentCoupling")
	public int getEfferentCoupling() {
		return efferentCoupling;
	}

	public void setEfferentCoupling(int efferentCoupling) {
		this.efferentCoupling = efferentCoupling;
	}

	@XmlElement(name="cyclomaticComplexity")
	public float getCyclomaticComplexity() {
		return cyclomaticComplexity;
	}

	public void setCyclomaticComplexity(float cyclomaticComplexity) {
		this.cyclomaticComplexity = cyclomaticComplexity;
	}

	@XmlElement(name="nestedBlockDepth")
	public float getNestedBlockDepth() {
		return nestedBlockDepth;
	}

	public void setNestedBlockDepth(float nestedBlockDepth) {
		this.nestedBlockDepth = nestedBlockDepth;
	}

	@XmlElement(name="generalizations")
	public int getGeneralizations() {
		return generalizations;
	}

	public void setGeneralizations(int generalizations) {
		this.generalizations = generalizations;
	}

	@XmlElement(name="hierarchies")
	public int getHierarchies() {
		return hierarchies;
	}

	public void setHierarchies(int hierarchies) {
		this.hierarchies = hierarchies;
	}

	@XmlElement(name="aggregations")
	public int getAggregations() {
		return aggregations;
	}

	public void setAggregations(int aggregations) {
		this.aggregations = aggregations;
	}

	@XmlElement(name="modifiability")
	public float getModifiability() {
		return modifiability;
	}

	public void setModifiability(float modifiability) {
		this.modifiability = modifiability;
	}

	@XmlElement(name="scalability")
	public float getScalability() {
		return scalability;
	}

	public void setScalability(float scalability) {
		this.scalability = scalability;
	}

	@XmlElement(name="understandability")
	public float getUnderstandability() {
		return understandability;
	}

	public void setUnderstandability(float understandability) {
		this.understandability = understandability;
	}

	@XmlElement(name="levelOfComplexity")
	public float getLevelOfComplexity() {
		return levelOfComplexity;
	}

	public void setLevelOfComplexity(float levelOfComplexity) {
		this.levelOfComplexity = levelOfComplexity;
	}

	@XmlElement(name="maintenance")
	public float getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(float maintenance) {
		this.maintenance = maintenance;
	}

	@XmlElement(name="maxDIT")
	public int getMaxDIT() {
		return maxDIT;
	}

	public void setMaxDIT(int maxDIT) {
		this.maxDIT = maxDIT;
	}

	@XmlElement(name="percentageCoverage")
	public float getPercentageCoverage() {
		return percentageCoverage;
	}

	public void setPercentageCoverage(float percentageCoverage) {
		this.percentageCoverage = percentageCoverage;
	}

	@XmlElement(name="DMS")
	public float getDMS() {
		return DMS;
	}

	public void setDMS(float dMS) {
		DMS = dMS;
	}

	@XmlElement(name="cohesion")
	public float getCohesion() {
		return cohesion;
	}

	public void setCohesion(float cohesion) {
		this.cohesion = cohesion;
	}

	@XmlElement(name="reusability")
	public float getReusability() {
		return reusability;
	}

	public void setReusability(float reusability) {
		this.reusability = reusability;
	}

	@XmlElement(name="reusabilityLines")
	public float getReusabilityLines() {
		return reusabilityLines;
	}

	public void setReusabilityLines(float reusabilityLines) {
		this.reusabilityLines = reusabilityLines;
	}


}

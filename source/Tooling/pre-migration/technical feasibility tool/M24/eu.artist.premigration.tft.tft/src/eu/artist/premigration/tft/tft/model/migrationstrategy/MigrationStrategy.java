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
 * Java model of XML type, MigrationStrategy
 * @author Burak Karaboga
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="MigrationStrategy")
public class MigrationStrategy {

	private String id;
	private String text;
	private String description;
	private Category category;
	private boolean suggested;
	private Complexity complexity;
	@XmlElement(name="targetPlatform", type=TargetPlatform.class)
	private List<TargetPlatform> targetPlatforms;
	
	public MigrationStrategy() {
	}
	
	public MigrationStrategy(String id, String text, String description, Category category, boolean suggested, Complexity complexity, List<TargetPlatform> targetPlatforms){//TargetPlatforms targetPlatforms) {
		this.id = id;
		this.text = text;
		this.description = description;
		this.category = category;
		this.suggested = suggested;
		this.complexity = complexity;
		this.targetPlatforms = targetPlatforms;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public boolean isSuggested() {
		return suggested;
	}
	public void setSuggested(boolean suggested) {
		this.suggested = suggested;
	}
	public Complexity getComplexity() {
		return complexity;
	}
	public void setComplexity(Complexity complexity) {
		this.complexity = complexity;
	}

	public List<TargetPlatform> getTargetPlatforms() {
		return targetPlatforms;
	}

	public void setTargetPlatforms(List<TargetPlatform> targetPlatforms) {
		this.targetPlatforms = targetPlatforms;
	}
	
}

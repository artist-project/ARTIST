/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.eval.util;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResourceSet;

import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue;

public class MigrationResourceSet {
	
	private XtextResourceSet resourceSet;
	
	public MigrationResourceSet() {
		resourceSet = new XtextResourceSet();
		UMLResourcesUtil.init(resourceSet);
		MigrationResourceUtil.init(resourceSet);
	}
	
	public XtextResourceSet getResourceSet() {
		return resourceSet;
	}

	protected void setResourceSet(XtextResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	public org.eclipse.uml2.uml.Package loadUMLPackage(String uriString) {
		return loadUMLPackage(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	public org.eclipse.uml2.uml.Package loadUMLPackage(URI uri) {
		return loadModel(uri, org.eclipse.uml2.uml.Package.class);
	}
	
	public Profile loadUMLProfile(String uriString) {
		return loadUMLProfile(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	public Profile loadUMLProfile(URI uri) {
		return loadModel(uri, Profile.class);
	}
	
	public Model loadUMLModel(String uriString) {
		return loadUMLModel(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	public Model loadUMLModel(URI uri) {
		return loadModel(uri, Model.class);
	}
	
	public PropertyCatalogue loadPropertyCatalogue(String uriString) {
		return loadPropertyCatalogue(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	public PropertyCatalogue loadPropertyCatalogue(URI uri) {
		return loadModel(uri, PropertyCatalogue.class);
	}
	
	public PatternCatalogue loadPatternCatalogue(String uriString) {
		return loadPatternCatalogue(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	public PatternCatalogue loadPatternCatalogue(URI uri) {
		return loadModel(uri, PatternCatalogue.class);
	}
	
	public EvaluationStrategyCatalogue loadEvaluationStrategyCatalogue(String uriString) {
		return loadEvaluationStrategyCatalogue(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	public EvaluationStrategyCatalogue loadEvaluationStrategyCatalogue(URI uri) {
		return loadModel(uri, EvaluationStrategyCatalogue.class);
	}	
	
	public GoalModel loadGoalModel(String uriString) {
		return loadGoalModel(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	public GoalModel loadGoalModel(URI uri) {
		return loadModel(uri, GoalModel.class);
	}
	
	public MigrationEvaluation loadMigrationEvaluation(String uriString) {
		return loadMigrationEvaluation(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	public MigrationEvaluation loadMigrationEvaluation(URI uri) {
		return loadModel(uri, MigrationEvaluation.class);
	}
	
	public Resource loadModel(URI uri) {
		Resource resource = getResourceSet().getResource(uri, true);		
		EcoreUtil.resolveAll(getResourceSet());
		return resource;
	}
	
	public <T extends EObject> T loadModel(URI uri, Class<T> clazz) {
		Resource resource = loadModel(uri);
		if(resource == null)
			return null;
		
		EObject root = resource.getContents().get(0);
		try {
			return clazz.cast(root);
		} catch(ClassCastException e) {
			return null;
		}
	}
	
	public Resource saveModel(EObject root, URI uri) {
		if(root == null)
			return null;
//		if(root.eResource() != null && root.eResource().getResourceSet() != null && !root.eResource().getResourceSet().getResources().isEmpty())
//			getResourceSet().getResources().addAll(root.eResource().getResourceSet().getResources());
		
		Resource resource = getResourceSet().createResource(uri);
		if(resource == null)
			return null;
		
		resource.getContents().add(root);
		EcoreUtil.resolveAll(resource);
		EcoreUtil.resolveAll(getResourceSet());
	
        SaveOptions saveOptions = SaveOptions.newBuilder().format().getOptions();
        
        try {
			resource.save(saveOptions.toOptionsMap());
			return resource;
		} catch(IOWrappedException io) {
			// sometimes 'object is not contained in a resource' is thrown, but no problems in the output can be found
			System.err.println(io.getLocalizedMessage());
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
        return null;
	}
}

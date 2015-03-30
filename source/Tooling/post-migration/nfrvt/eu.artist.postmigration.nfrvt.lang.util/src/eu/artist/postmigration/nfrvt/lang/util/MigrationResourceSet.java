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
package eu.artist.postmigration.nfrvt.lang.util;

import java.io.IOException;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResourceSet;

import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue;

/**
 * A MigrationResourceSet is a small wrapper around an 
 * {@link XtextResourceSet}, which registers the necessary {@link EPackage}s,
 * {@link IResourceFactory}s, and {@link IResourceServiceProvider}s to 
 * load and save UML and ARTIST migration models, e.g., property catalogues or
 * goal models.
 * <p/>
 * Note: To refer from one model to another, both must be contained in
 * the same resource set.
 * <p/>
 * Info: Helper methods to find elements in the different models are 
 * provided by {@link MigrationResourceUtil} class, model elements can be
 * created using the dedicated language factories or the 
 * {@link MigrationFactory}.
 * 
 * @author Martin Fleck
 * @see MigrationResourceUtil
 * @see MigrationFactory 
 *
 */
public class MigrationResourceSet {
	
	private XtextResourceSet resourceSet; // internal resource set
	
	/**
	 * Creates a new MigrationResourceSet, that can load and save UML and 
	 * ARTIST migration models.
	 * <p/>
	 * Note: To refer from one model to another, both must be contained in
	 * the same resource set.
	 * <p/>
	 * Info: Helper methods to find elements in the different models are 
	 * provided by {@link MigrationResourceUtil} class, model elements can be
	 * created using the dedicated language factories or the 
	 * {@link MigrationFactory}.
	 * 
	 * @see MigrationResourceUtil
	 * @see MigrationFactory
	 */
	public MigrationResourceSet() {
		this(new XtextResourceSet());
	}
	
	/**
	 * Creates a new MigrationResourceSet, that can load and save UML and 
	 * ARTIST migration models.
	 * <p/>
	 * Note: To refer from one model to another, both must be contained in
	 * the same resource set.
	 * <p/>
	 * Info: Helper methods to find elements in the different models are 
	 * provided by {@link MigrationResourceUtil} class, model elements can be
	 * created using the dedicated language factories or the 
	 * {@link MigrationFactory}.
	 * 
	 * @see MigrationResourceUtil
	 * @see MigrationFactory
	 */
	public MigrationResourceSet(XtextResourceSet resourceSet) {
		setResourceSet(resourceSet);
	}
	
	/**
	 * Initializes the resource set with all necessary {@link EPackage}s,
	 * {@link IResourceFactory}s, and {@link IResourceServiceProvider}s to 
	 * load and save UML and ARTIST migration models.
	 */
	private void initResourceSet() {
		UMLResourcesUtil.init(getResourceSet());
		MARTEResourcesUtil.init(getResourceSet());
		MigrationResourceUtil.init(getResourceSet());
	}
	
	/**
	 * Returns the internally used resource set.
	 * 
	 * @return Internal resource set
	 */
	public XtextResourceSet getResourceSet() {
		return resourceSet;
	}

	/**
	 * Sets and initializes the internally used resource set.
	 */
	protected void setResourceSet(XtextResourceSet resourceSet) {
		this.resourceSet = resourceSet;
		initResourceSet();
	}
	
	/**
	 * Loads the UML Package with the given platform resource uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link Package}, null is returned.
	 * 
	 * @param uriString uri of the UML package
	 * @return the referenced UML package or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public org.eclipse.uml2.uml.Package loadUMLPackage(String uriString) {
		return loadUMLPackage(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	/**
	 * Loads the UML Package with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link Package}, null is returned.
	 * 
	 * @param uri uri of the UML package
	 * @return the referenced UML package or null
	 */
	public org.eclipse.uml2.uml.Package loadUMLPackage(URI uri) {
		return loadModel(uri, org.eclipse.uml2.uml.Package.class);
	}
	
	/**
	 * Loads the UML Profile with the given platform resource uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link Profile}, null is returned.
	 * 
	 * @param uriString uri of the UML profile
	 * @return the referenced UML profile or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public Profile loadUMLProfile(String uriString) {
		return loadUMLProfile(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	/**
	 * Loads the UML Profile with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link Profile}, null is returned.
	 * 
	 * @param uri uri of the UML profile
	 * @return the referenced UML profile or null
	 */
	public Profile loadUMLProfile(URI uri) {
		return loadModel(uri, Profile.class);
	}
	
	/**
	 * Loads the UML Model with the given platform resource uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link Model}, null is returned.
	 * 
	 * @param uriString uri of the UML model
	 * @return the referenced UML model or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public Model loadUMLModel(String uriString) {
		return loadUMLModel(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	/**
	 * Loads the UML Model with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link Model}, null is returned.
	 * 
	 * @param uri uri of the UML model
	 * @return the referenced UML model or null
	 */
	public Model loadUMLModel(URI uri) {
		return loadModel(uri, Model.class);
	}
	
	/**
	 * Loads the Property Catalogue with the given platform resource uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link PropertyCatalogue}, null is returned.
	 * 
	 * @param uriString uri of the property catalogue
	 * @return the referenced property catalogue or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public PropertyCatalogue loadPropertyCatalogue(String uriString) {
		return loadPropertyCatalogue(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	/**
	 * Loads the Property Catalogue with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link PropertyCatalogue}, null is returned.
	 * 
	 * @param uri uri of the property catalogue
	 * @return the referenced property catalogue or null
	 */
	public PropertyCatalogue loadPropertyCatalogue(URI uri) {
		return loadModel(uri, PropertyCatalogue.class);
	}
	
	/**
	 * Creates a new property catalogue. Please note, that the name of the
	 * newly created catalogue is empty and needs to be set by the caller
	 * of this method.
	 * 
	 * @param uri uri of the property catalogue to be created
	 * @param override if true, the property catalogue previously stored at
	 * the given uri will be overriden
	 * @return newly created property catalogue
	 */
	public PropertyCatalogue createPropertyCatalogue(URI uri, boolean override)  {
		Resource resource = createModelResource(uri, PropertyCatalogue.class, override);
		PropertyCatalogue root = MigrationFactory.createPropertyCatalogue("");
		resource.getContents().add(root);
		return root;
	}
	
	/**
	 * Loads the property catalogue with the given uri. 
	 * 
	 * @param uriString uri of the property catalogue to be loaded/created
	 * @param createIfNecessary if true, the property catalogue will be created
	 * if one is not stored at the given uri
	 * @return loaded or newly created property catalogue
	 */
	public PropertyCatalogue loadPropertyCatalogue(String uriString, boolean createIfNecessary) {
		return loadPropertyCatalogue(MigrationResourceUtil.getPlatformResourceURI(uriString), createIfNecessary);
	}
	
	/**
	 * Loads the property catalogue with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link PropertyCatalogue}, null is returned.
	 * 
	 * @param uri uri of the property catalogue
	 * @return the referenced property catalogue or null
	 */
	public PropertyCatalogue loadPropertyCatalogue(URI uri, boolean createIfNecessary) {
		PropertyCatalogue propertyCatalogue = null;
		try {
			propertyCatalogue = loadModel(uri, PropertyCatalogue.class);
		} catch(Exception e) {
			if(!createIfNecessary) 
				throw e;
		}
		
		if(propertyCatalogue == null && createIfNecessary) 
			return createPropertyCatalogue(uri, true);
		
		return propertyCatalogue;
	}
	
	/**
	 * Loads the Pattern Catalogue with the given platform resource uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link PatternCatalogue}, null is returned.
	 * 
	 * @param uriString uri of the pattern catalogue
	 * @return the referenced pattern catalogue or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public PatternCatalogue loadPatternCatalogue(String uriString) {
		return loadPatternCatalogue(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	/**
	 * Loads the Pattern Catalogue with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link PatternCatalogue}, null is returned.
	 * 
	 * @param uri uri of the pattern catalogue
	 * @return the referenced pattern catalogue or null
	 */
	public PatternCatalogue loadPatternCatalogue(URI uri) {
		return loadModel(uri, PatternCatalogue.class);
	}
	
	/**
	 * Creates a new pattern catalogue. Please note, that the name of the
	 * newly created catalogue is empty and needs to be set by the caller
	 * of this method.
	 * 
	 * @param uri uri of the pattern catalogue to be created
	 * @param override if true, the pattern catalogue previously stored at
	 * the given uri will be overriden
	 * @return newly created pattern catalogue
	 */
	public PatternCatalogue createPatternCatalogue(URI uri, boolean override)  {
		Resource resource = createModelResource(uri, PatternCatalogue.class, override);
		PatternCatalogue root = MigrationFactory.createPatternCatalogue("");
		resource.getContents().add(root);
		return root;
	}
	
	/**
	 * Loads the pattern catalogue with the given uri. 
	 * 
	 * @param uriString uri of the pattern catalogue to be loaded/created
	 * @param createIfNecessary if true, the pattern catalogue will be created
	 * if one is not stored at the given uri
	 * @return loaded or newly created pattern catalogue
	 */
	public PatternCatalogue loadPatternCatalogue(String uriString, boolean createIfNecessary) {
		return loadPatternCatalogue(MigrationResourceUtil.getPlatformResourceURI(uriString), createIfNecessary);
	}
	
	/**
	 * Loads the pattern catalogue with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link PatternCatalogue}, null is returned.
	 * 
	 * @param uri uri of the pattern catalogue
	 * @return the referenced pattern catalogue or null
	 */
	public PatternCatalogue loadPatternCatalogue(URI uri, boolean createIfNecessary) {
		PatternCatalogue patternCatalogue = null;
		try {
			patternCatalogue = loadModel(uri, PatternCatalogue.class);
		} catch(Exception e) {
			if(!createIfNecessary) 
				throw e;
		}
		
		if(patternCatalogue == null && createIfNecessary) 
			return createPatternCatalogue(uri, true);
		
		return patternCatalogue;
	}
	
	/**
	 * Loads the measurement model with the given platform resource
	 * uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link MeasurementModel}, null is returned.
	 * 
	 * @param uriString uri of the measurement model 
	 * @return the referenced measurement model or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public MeasurementModel loadMeasurementModel(String uriString) {
		return loadMeasurementModel(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	/**
	 * Loads the measurement model with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link MeasurementModel}, null is returned.
	 * 
	 * @param uri uri of the measurement model
	 * @return the referenced measurement model or null
	 */
	public MeasurementModel loadMeasurementModel(URI uri) {
		return loadModel(uri, MeasurementModel.class);
	}
	
	/**
	 * Loads the measurement model with the given platform resource
	 * uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link MeasurementModel}, null is returned.
	 * 
	 * @param uriString uri of the measurement model
	 * @return the referenced measurement model or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public MeasurementModel loadMeasurementModel(String uriString, boolean createIfNecessary) {
		return loadMeasurementModel(MigrationResourceUtil.getPlatformResourceURI(uriString), createIfNecessary);
	}
	
	/**
	 * Loads the measurement model with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link MeasurementModel}, null is returned.
	 * 
	 * @param uri uri of the measurement model 
	 * @return the referenced measurement model or null
	 */
	public MeasurementModel loadMeasurementModel(URI uri, boolean createIfNecessary) {
		MeasurementModel measurementModel = null;
		try {
			measurementModel = loadModel(uri, MeasurementModel.class);
		} catch(Exception e) {
			if(!createIfNecessary) 
				throw e;
		}
		
		if(measurementModel == null && createIfNecessary) 
			return createMeasurementModel(uri, true);
		
		return measurementModel;
	}
	
	/**
	 * Creates a new model under the given uri, if such a model does not 
	 * already exist. 
	 * 
	 * @param uri uri of the model resource to be created
	 * @param expectedRoot expected root node in case the resource already
	 * exists and needs to be overriden
	 * @param override
	 * @return newly created model or null if the model already exists and 
	 * should not be overriden
	 */
	protected Resource createModelResource(URI uri, Class<?> expectedRoot, boolean override) {
		Resource resource;
		if(getResourceSet().getURIResourceMap().containsKey(uri)) {
			if(!override)
				return null;
			resource = getResourceSet().getResource(uri, false);
			if(!resource.getContents().isEmpty())
				if(!(expectedRoot.isInstance(resource.getContents().get(0))))
					throw new IllegalArgumentException("Resource '" + uri + "' already exists, but does not contain a MeasurementModel.");
				else
					resource.getContents().clear();				
		} else {
			resource = getResourceSet().createResource(uri);
			if(resource == null)
				throw new IllegalArgumentException("Resource '" + uri + "' can not be created.");
		}
		return resource;
	}
	
	/**
	 * Creates a new measurement model. Please note, that the name of the
	 * newly created model is empty and needs to be set by the caller
	 * of this method.
	 * 
	 * @param uri uri of the measurement model to be created
	 * @param override if true, the measurement model previously stored at
	 * the given uri will be overriden
	 * @return newly created measurement model
	 */
	public MeasurementModel createMeasurementModel(URI uri, boolean override)  {
		Resource resource = createModelResource(uri, MeasurementModel.class, override);
		MeasurementModel measurementModel = MigrationFactory.createMeasurementModel();
		resource.getContents().add(measurementModel);
		return measurementModel;
	}
	
	/**
	 * Loads the Goal Model with the given platform resource uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link GoalModel}, null is returned.
	 * 
	 * @param uriString uri of the goal model
	 * @return the referenced goal model or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public GoalModel loadGoalModel(String uriString) {
		return loadGoalModel(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	/**
	 * Loads the Goal Model with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link GoalModel}, null is returned.
	 * 
	 * @param uri uri of the goal model
	 * @return the referenced goal model or null
	 */
	public GoalModel loadGoalModel(URI uri) {
		return loadModel(uri, GoalModel.class);
	}
	
	/**
	 * Creates a new goal model. Please note, that the name of the
	 * newly created model is empty and needs to be set by the caller
	 * of this method.
	 * 
	 * @param uri uri of the goal model to be created
	 * @param override if true, the goal model previously stored at
	 * the given uri will be overriden
	 * @return newly created goal model
	 */
	public GoalModel createGoalModel(URI uri, boolean override)  {
		Resource resource = createModelResource(uri, GoalModel.class, override);
		GoalModel root = MigrationFactory.createGoalModel("");
		resource.getContents().add(root);
		return root;
	}
	
	/**
	 * Loads the goal model with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link EvaluationStrategyCatalogue}, null is returned.
	 * 
	 * @param uri uri of the evaluation strategy catalogue
	 * @return the referenced evaluation strategy catalogue or null
	 */
	public GoalModel loadGoalModel(String uriString, boolean createIfNecessary) {
		return loadGoalModel(MigrationResourceUtil.getPlatformResourceURI(uriString), createIfNecessary);
	}
	
	/**
	 * Loads the Evaluation Strategy Catalogue with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link EvaluationStrategyCatalogue}, null is returned.
	 * 
	 * @param uri uri of the evaluation strategy catalogue
	 * @return the referenced evaluation strategy catalogue or null
	 */
	public GoalModel loadGoalModel(URI uri, boolean createIfNecessary) {
		GoalModel goalModel = null;
		try {
			goalModel = loadModel(uri, GoalModel.class);
		} catch(Exception e) {
			if(!createIfNecessary) 
				throw e;
		}
		
		if(goalModel == null && createIfNecessary) 
			return createGoalModel(uri, true);
		
		return goalModel;
	}
	
	/**
	 * Loads the Migration Evaluation with the given platform resource uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link MigrationEvaluation}, null is returned.
	 * 
	 * @param uriString uri of the migration evaluation
	 * @return the referenced migration evaluation or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public MigrationEvaluation loadMigrationEvaluation(String uriString) {
		return loadMigrationEvaluation(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	/**
	 * Loads the Migration Evaluation with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link MigrationEvaluation}, null is returned.
	 * 
	 * @param uri uri of the migration evaluation
	 * @return the referenced migration evaluation or null
	 */
	public MigrationEvaluation loadMigrationEvaluation(URI uri) {
		return loadModel(uri, MigrationEvaluation.class);
	}
	
	/**
	 * Loads the migration evaluation with the given platform resource
	 * uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link MigrationEvaluation}, null is returned.
	 * 
	 * @param uriString uri of the migration evaluation
	 * @return the referenced migration evaluation or null
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public MigrationEvaluation loadMigrationEvaluation(String uriString, boolean createIfNecessary) {
		return loadMigrationEvaluation(MigrationResourceUtil.getPlatformResourceURI(uriString), createIfNecessary);
	}
	
	/**
	 * Loads the migration evaluation with the given uri. 
	 * If the specified resource can not be found or its root is not an 
	 * instance of {@link MigrationEvaluation}, null is returned.
	 * 
	 * @param uri uri of the migration evaluation
	 * @return the referenced migration evaluation or null
	 */
	public MigrationEvaluation loadMigrationEvaluation(URI uri, boolean createIfNecessary) {
		MigrationEvaluation measurementModel = null;
		try {
			measurementModel = loadModel(uri, MigrationEvaluation.class);
		} catch(Exception e) {
			if(!createIfNecessary) 
				throw e;
		}
		
		if(measurementModel == null && createIfNecessary) 
			return createMigrationEvaluation(uri, true);
		
		return measurementModel;
	}
	
	/**
	 * Creates a new migration evaluation. Please note, that the name of the
	 * newly created migration evaluation is empty and needs to be set by the 
	 * caller of this method.
	 * 
	 * @param uri uri of the migration evaluation to be created
	 * @param override if true, the migration evaluation previously stored at
	 * the given uri will be overriden
	 * @return newly created migration evaluation
	 */	
	public MigrationEvaluation createMigrationEvaluation(URI uri, boolean override)  {
		Resource resource = createModelResource(uri, PropertyCatalogue.class, override);
		MigrationEvaluation root = MigrationFactory.createMigrationEvaluation("", new Date());
		resource.getContents().add(root);
		return root;
	}
	
	/**
	 * Loads the model with the given platform resource
	 * uriString.
	 * If the uri is not in the platform resource format, it will be converted
	 * using {@link MigrationResourceUtil#getPlatformResourceURI(String)}.
	 * If the specified resource can not be found, null is returned.
	 * 
	 * @param uriString uri of the migration evaluation
	 * @return the referenced model
	 * 
	 * @see MigrationResourceUtil#getPlatformResourceURI(String)
	 */
	public Resource loadModel(String uriString) {
		return loadModel(MigrationResourceUtil.getPlatformResourceURI(uriString));
	}
	
	/**
	 * Loads the model resource with the given uri into this resource set. If
	 * no such resource is found, null is returned.
	 * 
	 * @param uri uri of the model to be loaded
	 * @return model resource with the given uri or null.
	 */
	public Resource loadModel(URI uri) {
		Resource resource;
		try {
			resource = getResourceSet().getResource(uri, true);
		} catch(Exception e) {
			resource = getResourceSet().getResource(uri, true);
		}
		if(resource != null)
			EcoreUtil.resolveAll(getResourceSet());
		return resource;
	}

	/**
	 * Loads the model resource with the given uri into this resource set. If
	 * no such resource is found or the root object is not an instance of the
	 * given class, null is returned.
	 * 
	 * @param uri uri of the model to be loaded
	 * @param clazz class the model resource should have
	 * @return model resource with the given uri or null.
	 */
	public <T extends EObject> T loadModel(URI uri, Class<T> clazz) {
		Resource resource = null;
		try {
			resource = loadModel(uri);
			if(resource == null)
				return null;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
			
		if(resource == null || resource.getContents().isEmpty())
			return null;
	
		EObject root = resource.getContents().get(0);
		try {
			return clazz.cast(root);
		} catch(ClassCastException e) {
			return null;
		}
	}
	
	/**
	 * Saves the given object under the given uri. 
	 * The given uriString will be converted into an uri using
	 * {@link URI#createURI(String)}.
	 * Any resource produced and any exception thrown during this 
	 * operation is recorded into the returned {@link SaveResult}.
	 * 
	 * @param root object to be saved
	 * @param uriString uri under which the object should be saved
	 * @return SaveResult containing any created resources or exceptions thrown
	 * 
	 * @see ResourceSet#createResource(URI)
	 * @see Resource#save(java.util.Map)
	 */
	public SaveResult saveModel(EObject root, String uriString) {
		return saveModel(root, URI.createURI(uriString));
	}
	
	/**
	 * Saves the given object under the given uri considering the specified 
	 * options. The given uriString will be converted into an uri using
	 * {@link URI#createURI(String)}.
	 * Any resource produced and any exception thrown during this 
	 * operation is recorded into the returned {@link SaveResult}.
	 * <p/>
	 * Note: {@link SaveOptions#newBuilder()} provides a convenient way to
	 * create {@link SaveOptions}.
	 * 
	 * @param root object to be saved
	 * @param uriString uri under which the object should be saved
	 * @param saveOptions options to be considered
	 * @return SaveResult containing any created resources or exceptions thrown
	 * 
	 * @see ResourceSet#createResource(URI)
	 * @see Resource#save(java.util.Map)
	 */
	public SaveResult saveModel(EObject root, String uriString, SaveOptions saveOptions) {
		return saveModel(root, URI.createURI(uriString), saveOptions);
	}
	
	/**
	 * Saves the given object under the given uri. 
	 * Any resource produced and any exception thrown during this 
	 * operation is recorded into the returned {@link SaveResult}.
	 * 
	 * @param root object to be saved
	 * @param uri uri under which the object should be saved
	 * @return SaveResult containing any created resources or exceptions thrown
	 * 
	 * @see ResourceSet#createResource(URI)
	 * @see Resource#save(java.util.Map)
	 */
	public SaveResult saveModel(EObject root, URI uri) {
		return saveModel(root, uri, SaveOptions.newBuilder().format().getOptions());
	}
	
	/**
	 * Saves the given object under the given uri considering the specified 
	 * options. Any resource produced and any exception thrown during this 
	 * operation is recorded into the returned {@link SaveResult}.
	 * <p/>
	 * Note: {@link SaveOptions#newBuilder()} provides a convenient way to
	 * create {@link SaveOptions}.
	 * 
	 * @param root object to be saved
	 * @param uri uri under which the object should be saved
	 * @param saveOptions options to be considered
	 * @return SaveResult containing any created resources or exceptions thrown
	 * 
	 * @see ResourceSet#createResource(URI)
	 * @see Resource#save(java.util.Map)
	 */
	public SaveResult saveModel(EObject root, URI uri, SaveOptions saveOptions) {
		Resource resource = null;
		Exception exception = null;		
        try {
        	if(root == null)
    			throw new IllegalArgumentException("No root element specified.");
    		
    		// no need to create a new resource, if uri is the same
    		if(root.eResource() != null && root.eResource().getURI().equals(uri))
    			try {
    				root.eResource().save(saveOptions.toOptionsMap());
    				return new SaveResult(root.eResource(), null);
    			} catch (IOException e) {
    				return new SaveResult(root.eResource(), e);
    			}
    		
    		EcoreUtil.resolveAll(root);
    		
    		try {
    			resource = getResourceSet().getResource(uri, false);
    		} catch(Exception e) {
    			System.err.println(e.getMessage()); // resource does not exist
    		}
    		if(resource == null)
    			resource = getResourceSet().createResource(uri);
    		
    		if(resource == null)
    			return null;
    		
    		resource.getContents().add(root);
    		EcoreUtil.resolveAll(resource);
    		
    		EcoreUtil.resolveAll(getResourceSet());
            
			resource.save(saveOptions.toOptionsMap());
		} catch (Exception e) {
			exception = e; 
			System.err.println(e);
		}
        return new SaveResult(resource, exception);
	}
	
	
	/**
	 * A SaveResult contains the information produced when saving a 
	 * {@link Resource} into a {@link ResourceSet}. If the saving was
	 * successful, a resource should have been produced. Any exception
	 * thrown during the save operation is also recorded.
	 * 
	 * @author Martin Fleck
	 *
	 */
	public class SaveResult {
		private Resource resource;
		private Exception exception;

		public SaveResult(Resource resource, Exception exception) {
			this.resource = resource;
			this.exception = exception;
		}

		/**
		 * {@link Resource} produced by the save operation.
		 * @return resource produced by the save operation
		 */
		public Resource getResource() {
			return resource;
		}

		/**
		 * {@link Exception} thrown by the save operation.
		 * @return exception thrown by the save operation
		 */
		public Exception getException() {
			return exception;
		}
		
		/**
		 * True if an exception has been thrown during the save operation,
		 * false otherwise.
		 * 
		 * @return true if an exception has been thrown during the save 
		 * operation, false otherwise
		 */
		public boolean hasException() {
			return exception != null;
		}
		
		/**
		 * True if a resource has been produced during the save operation,
		 * false otherwise.
		 * 
		 * @return true if a resource has been produced during the save 
		 * operation, false otherwise.
		 */
		public boolean hasResource() {
			return resource != null;
		}
		
		/**
		 * If no exception has been thrown, the save operation is considered
		 * successful.
		 * 
		 * @return true if no exception has been thrown, false otherwise
		 */
		public boolean isSuccess() {
			return !hasException();
		}
		
		/**
		 * Throws the recorded exception if there is one.
		 * 
		 * @return this {@link SaveResult}
		 * @throws Exception recorded exception
		 */
		public SaveResult throwException() throws Exception {
			if(hasException())
				throw exception;
			return this;
		}
		
		/**
		 * Prints the stack trace of the recorded exception if there is one.
		 * 
		 * @return this {@link SaveResult}
		 */
		public SaveResult printStackTrace() {
			if(hasException())
				exception.printStackTrace();
			return this;
		}
		
		/**
		 * Returns the message of the recorded exception if there is one, 
		 * otherwise an empty string is returned.
		 * 
		 * @return message of the exception or empty string
		 */
		public String getExceptionMessage() {
			if(hasException())
				return exception.getMessage();
			return "";
		}
		
		/**
		 * Returns the path to the locally accessible file of the produced 
		 * resource if there is one, otherwise an empty string is returned.
		 * 
		 * @return path to locally accessible resource file or empty string
		 */
		public String getResourceFileString() {
			if(hasResource())
				return getResource().getURI().toFileString();
			return "";
		}
		
		/**
		 * Validates the semantic of the produced resource. This method calls
		 * {@link MigrationResourceUtil#validateSemantic(Resource)}.
		 * 
		 * @return information about the validation
		 */
		public DiagnosticInfo validateSemantic() {
			return MigrationResourceUtil.validateSemantic(getResource());
		}
		
		@Override
		public String toString() {
			String txt = "";
			if(hasResource()) 
				txt += "Resource '" + getResourceFileString() + "' has been saved. ";
			if(hasException()) {
				txt += "While saving '" + getResourceFileString() + "' the following exception occured:\n";
				txt += getExceptionMessage();
			}
			if(!hasResource() && !hasException())
				txt += "No resource and no exception specified in SaveResult.";
			return txt;
		}
	}
}

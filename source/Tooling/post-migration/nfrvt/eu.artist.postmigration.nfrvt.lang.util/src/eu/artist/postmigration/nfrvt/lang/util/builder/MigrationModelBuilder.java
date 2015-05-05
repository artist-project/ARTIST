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
package eu.artist.postmigration.nfrvt.lang.util.builder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Property;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;

import com.google.common.collect.Lists;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.util.AbstractMigrationModelHandler;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet.SaveResult;
import eu.artist.postmigration.nfrvt.lang.util.selector.MigrationModelSelector;

/**
 * This builder class helps to create or adapt one migration model.
 * 
 * @author Martin Fleck
 * @see MigrationModelSelector
 * @see ARTISTModel
 */
public abstract class MigrationModelBuilder<A extends ARTISTModel> extends AbstractMigrationModelHandler<A> {	
	protected MigrationResourceSet resourceSet;
	protected MigrationModelSelector<A> selector;
	
	protected XtextResource resource;
	protected ILinker linker;
	protected IParser parser;
	protected ISerializer serializer;
	protected Set<String> keywords;
		
	public MigrationModelBuilder(MigrationResourceSet resourceSet, A model) {
		super(model);
		this.resourceSet = resourceSet;
	}
	
	public MigrationResourceSet getResourceSet() {
		return resourceSet;
	}
	
	public MigrationModelSelector<A> getSelector() {
		if(selector == null)
			selector = createSelector();
		return selector;
	}
	
	protected MigrationModelSelector<A> createSelector() {
		return new MigrationModelSelector<A>(getModel());
	}
	
	protected XtextResource getResource() {
		if(resource == null) {
			if(getModel() == null)
				throw new IllegalArgumentException("No resource can be obtained. No model has been created yet.");
			Resource modelResource = getModel().eResource();
			if(!(modelResource instanceof XtextResource))
				throw new IllegalArgumentException("Model is not stored in an XtextResource.");
			resource = (XtextResource) modelResource;
		}
		return resource;
	}
	
	protected ILinker getLinker() {
		if(linker == null)
			linker = getResource().getLinker();
		return linker;
	}
	
	protected IParser getParser() {
		if(parser == null) 
			parser = getResource().getParser();
		return parser;
	}
	
	protected ISerializer getSerializer() {
		if(serializer == null) 
			serializer = getResource().getSerializer();
		return serializer;
	}
	
	protected Set<String> getKeywords() {
		if(keywords == null) {
			if(getGrammar() != null) 
				keywords = GrammarUtil.getAllKeywords(getGrammar());
		}
		return keywords;
	}
	
	protected abstract Grammar getGrammar();
	
	protected String escape(String string) {
		Set<String> keywords = getKeywords();
		if(keywords == null)
			return string;
		
		String escaped = string;
		for(String keyword : keywords)
			if(!"^".equals(keyword))
				escaped = escaped.replace("." + keyword, ".^" + keyword);
		return escaped;
	}
	
	/**
	 * Adds a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUris uris to the new resources
	 * @return the loaded resource
	 */
	public List<Resource> loadModels(String... modelUris) {
		return loadModels(false, modelUris);
	}
	
	/**
	 * Adds a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUris uris to the new resources
	 * @return the loaded resource
	 */
	public List<Resource> loadModels(boolean addImports, String... modelUris) {
		List<Resource> resources = new ArrayList<>();
		for(String modelUri : modelUris)
			resources.add(loadModel(addImports, modelUri));
		return resources;
	}
	
	/**
	 * Adds a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUris uris to the new resources
	 * @return the loaded resource
	 */
	public List<Resource> loadModels(URI... modelUris) {
		return loadModels(false, modelUris);
	}
	
	/**
	 * Adds a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUris uris to the new resources
	 * @return the loaded resource
	 */
	public List<Resource> loadModels(boolean addImports, URI... modelUris) {
		List<Resource> resources = new ArrayList<>();
		for(URI modelUri : modelUris)
			resources.add(loadModel(addImports, modelUri));
		return resources;
	}
	
	/**
	 * Adds a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUri uri to the new resource
	 * @return the loaded resource
	 */
	public Resource loadModel(String modelUri) {
		return loadModel(false, modelUri);
	}
	
	/**
	 * Adds a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUri uri to the new resource
	 * @param addImport if true, an import statement for this resource
	 * will be created in the goal model
	 * @return the loaded resource
	 */
	public Resource loadModel(boolean addImport, String modelUri) {
		return loadModel(addImport, URI.createURI(modelUri));
	}
	
	/**
	 * Add a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUri uri to the new resource
	 * @return the loaded resource
	 */
	public Resource loadModel(URI modelUri) {
		return loadModel(false, modelUri);
	}
	
	/**
	 * Add a new model resource, which contains elements that might be 
	 * referenced by the goal model.
	 * 
	 * @param modelUri uri to the new resource
	 * @param addImport if true, an import statement for this resource
	 * will be created in the model
	 * @return the loaded resource
	 */
	public Resource loadModel(boolean addImport, URI modelUri) {
		Resource resource = getResourceSet().loadModel(modelUri);
		if(addImport)
			getModel().getImports().add(MigrationFactory.createImportNamespace(resource.getContents().get(0)));
		return resource;
	}
	
	/**
	 * Adds a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUri uri to the new resource
	 * @return the loaded resource
	 */
	public <M extends ARTISTModel> M loadModel(String modelUri, Class<M> modelClass) {
		return loadModel(false, modelUri, modelClass);
	}
	
	/**
	 * Adds a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUri uri to the new resource
	 * @param addImport if true, an import statement for this resource
	 * will be created in the goal model
	 * @return the loaded resource
	 */
	public <M extends ARTISTModel> M loadModel(boolean addImport, String modelUri, Class<M> modelClass) {
		return loadModel(addImport, URI.createURI(modelUri), modelClass);
	}
	
	/**
	 * Add a new model resource, which contains elements that might be 
	 * referenced by the model.
	 * 
	 * @param modelUri uri to the new resource
	 * @return the loaded resource
	 */
	public <M extends ARTISTModel> M loadModel(URI modelUri, Class<M> modelClass) {
		return loadModel(false, modelUri, modelClass);
	}
	
	/**
	 * Add a new model resource, which contains elements that might be 
	 * referenced by the goal model.
	 * 
	 * @param modelUri uri to the new resource
	 * @param addImport if true, an import statement for this resource
	 * will be created in the model
	 * @return the loaded resource
	 */
	public <M extends ARTISTModel> M loadModel(boolean addImport, URI modelUri, Class<M> modelClass) {
		M model = getResourceSet().loadModel(modelUri, modelClass);
		if(model != null && addImport)
			getModel().getImports().add(MigrationFactory.createImportNamespace(model));
		return model;
	}
	
	/**
	 * Saves the model that has been produced so far under the given
	 * uri.
	 * 
	 * @param uri uri to the file in which the model should be persisted
	 * @return result of the save operation
	 */
	public SaveResult save(String uri) {
		return getResourceSet().saveModel(getModel(), uri);
	}

	/**
	 * Saves the model that has been produced so far under the given
	 * uri.
	 * 
	 * @param uri uri to the file in which the model should be persisted
	 * @return result of the save operation
	 */
	public SaveResult save(URI uri) {
		return getResourceSet().saveModel(getModel(), uri);
	}
	
	/**
	 * Saves the model that has been produced so far under models uri, if the
	 * model has been created via uri or has been loaded through a uri.
	 * If the model has no uri, an exception will be thrown.
	 * 
	 * @return the result of saving the model
	 * @see #save(URI)
	 */
	public SaveResult save() {
		if(getModel().eResource() == null)
			throw new UnsupportedOperationException("Model can not be saved without specifying an URI.");
		return save(getModel().eResource().getURI());
	}
	
	/**
	 * Imports the given namespace for this model.
	 * 
	 * @param importNamespace import namespace object
	 * @return the given namespace object
	 */
	public ImportNamespace addImportNamespace(ImportNamespace importNamespace) {
		model.getImports().add(importNamespace);
		return importNamespace;
	}
	
	/**
	 * Imports the given namespace for this model.
	 * 
	 * @param namespace namespace to be imported
	 * @return the newly created and added namespace object
	 */
	public ImportNamespace addImportNamespace(String namespace) {
		return addImportNamespace(MigrationFactory.createImportNamespace(namespace));
	}
	
	/**
	 * Imports the namespace given by this object for this model.
	 * 
	 * @param object object from which the namespace should be derived
	 * @return the newly created and added namespace object
	 */
	public ImportNamespace addImportNamespace(EObject object) {
		return addImportNamespace(MigrationFactory.createImportNamespace(object));
	}
	
	/**
	 * Converts the given name to a qualified name by removing disallowed
	 * characters.
	 * 
	 * @param name name to be converted
	 * @return qualified name equivalent of the given name
	 */
	public String toQualifiedName(String name) {
		return MigrationFactory.toQualifiedName(name);
	}
	
	/**
	 * Creates a new value specification object for the given primitive value.
	 * @param value primitive value
	 * @return value specification object to be used in migration models
	 */
	public NumberLiteral createValue(double value) {
		return MigrationFactory.createNumberLiteral(value);
	}
	
	/**
	 * Creates a new value specification object for the given primitive value.
	 * @param value primitive value
	 * @return value specification object to be used in migration models
	 */
	public NumberLiteral createValue(int value) {
		return MigrationFactory.createNumberLiteral(value);
	}
	
	/**
	 * Creates a new value specification object for the given primitive value.
	 * @param value primitive value
	 * @return value specification object to be used in migration models
	 */
	public StringLiteral createValue(String value) {
		return MigrationFactory.createStringLiteral(value);
	}
	
	/**
	 * Creates a new value specification object for the given primitive value.
	 * @param value primitive value
	 * @return value specification object to be used in migration models
	 */
	public BooleanLiteral createValue(boolean value) {
		return MigrationFactory.createBooleanLiteral(value);
	}
	
	/**
	 * Creates a new unlimited value specification object.
	 * @return value specification object to be used in migration models
	 */
	public UnlimitedLiteral createUnlimitedValue() {
		return MigrationFactory.createUnlimitedLiteral();
	}
	
	/**
	 * Creates a new null value specification object.
	 * @return value specification object to be used in migration models
	 */
	public NullLiteral createNullValue() {
		return MigrationFactory.createNullLiteral();
	}
	
	/**
	 * Creates a new value specification object for the given instance value.
	 * @param value instance value
	 * @return value specification object to be used in migration models
	 */
	public InstanceSpecificationExpression createValue(InstanceSpecification value) {
		return MigrationFactory.createInstanceSpecificationExpression(value);
	}
	
	/**
	 * Creates a new value specification object for the given primitive value.
	 * @param value primitive value
	 * @return value specification object to be used in migration models
	 */
	public InstanceSpecificationExpression createValue(EnumerationLiteral value) {
		return MigrationFactory.createInstanceSpecificationExpression(value);
	}
	
	/**
	 * Creates a new object specification for the given data type.
	 * Please note that this produces an incomplete specification and values
	 * must be added either with {@link #addObjectPropertyValue(ObjectSpecificationExpression, Property, ValueSpecification)} or
	 * {@link #addObjectValues(ObjectSpecificationExpression, ValueSpecification...)}
	 * 
	 * @param type data type for which to create an object specification
	 * @return newly created object specification
	 */
	public ObjectSpecificationExpression createValue(DataType type) {
		return MigrationFactory.createTupleObjectExpression(type, (Tuple)null);
	}
	
	/**
	 * Adds the given value for the specified property to the given object 
	 * specification. Note that the property should be part of the given
	 * objects data type.
	 * 
	 * @param object existing object
	 * @param property property for which the value should be set
	 * @param value property value
	 * @return newly created property value pair
	 */
	public PropertyValuePair addObjectPropertyValue(ObjectSpecificationExpression object, Property property, ValueSpecification value) {
		if(object == null || property == null || value == null)
			throw new IllegalArgumentException("Object, property or value can not be null.");
		
		PropertyValuePair valuePair = MigrationFactory.createPropertyValuePair(property, value);
		if(object.getValue() == null)
			object.setValue(MigrationFactory.createTuple(valuePair));
		else if(object.getValue() instanceof Tuple) 
			((Tuple)object.getValue()).getTuples().add(valuePair);
		else if(object.getValue() instanceof Collection)
			throw new IllegalArgumentException("Can not mix collections and property-value pairs in object specification");
		else
			throw new IllegalArgumentException("ObjectSpecificationExpression has unknown content.");
		return valuePair;
	}
	
	/**
	 * Adds the given value for the specified property to the given object 
	 * specification. Note that the property should be part of the given
	 * objects data type.
	 * 
	 * @param object existing object
	 * @param propertyName name of property for which the value should be set
	 * @param value property value
	 * @return newly created property value pair
	 */
	public PropertyValuePair addObjectPropertyValue(ObjectSpecificationExpression object, String propertyName, ValueSpecification value) {
		return addObjectPropertyValue(object, getProperty(object.getType(), propertyName), value);
	}
	
	protected static Property getProperty(DataType type, String name) {
		for(Property p : type.getAllAttributes())
			if(p.getName().equals(name))
				return p;
		return null;
	}
	
	/**
	 * Adds the given values to the given object specification. This assumes 
	 * that the given object is a collection object.
	 * 
	 * @param object existing collection object
	 * @param values values to be added to the collection object
	 * @return collection of values for the given object
	 */
	public Collection addObjectValues(ObjectSpecificationExpression object, ValueSpecification... values) {
		if(object == null || values == null)
			throw new IllegalArgumentException("Object or values can not be null.");
		Collection collection = null;
		if(object.getValue() == null) 
			collection = MigrationFactory.createCollection(Lists.newArrayList(values));
		else if(object.getValue() instanceof Collection) {
			collection = (Collection) object.getValue();
			collection.getValues().addAll(Lists.newArrayList(values));
		} else if(object.getValue() instanceof Tuple)
			throw new IllegalArgumentException("Can not mix collections and property-value pairs in object specification");
		else 
			throw new IllegalArgumentException("ObjectSpecificationExpression has unknown content.");

		return collection;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	/**
	 * Serializes the model into the textual notation document string.
	 * @return textual notation document string
	 */
	public String toDocumentString() {
		return getSerializer().serialize(getModel(), SaveOptions.newBuilder().noValidation().getOptions());
	}
	
	protected XtextResource createSyntheticResource(String name, String extension) {
		 return (XtextResource) getResourceSet().getResourceSet().createResource(
				URI.createURI("synthetic:/" + name + "." + extension));
	}
	
	protected XtextResource createSyntheticResource(String name, String extension, String content) throws IOException, IllegalArgumentException {
		 XtextResource resource = (XtextResource) getResourceSet().getResourceSet().createResource(
				URI.createURI("synthetic:/" + name + "." + extension));
		 resource.reparse(content);
		 if(resource.getErrors().size() > 0)
			throw new IllegalArgumentException(resource.getErrors().get(0).getMessage());
		 return resource;
	}
	
	protected boolean removeResource(Resource resource) {
		return getResourceSet().getResourceSet().getResources().remove(resource);
	}
	
	/**
	 * Creates a new date time helper object.
	 * 
	 * @return new date time helper object
	 */
	public DateTimeHelper createDateTimeHelper() {
		return new DateTimeHelper();
	}
	
	/**
	 * Creates a new date time helper object with the given
	 * date/time set.
	 * 
	 * @return new date time helper object
	 */
	public DateTimeHelper createDateTimeHelper(Date date) {
		return new DateTimeHelper(date);
	}
}

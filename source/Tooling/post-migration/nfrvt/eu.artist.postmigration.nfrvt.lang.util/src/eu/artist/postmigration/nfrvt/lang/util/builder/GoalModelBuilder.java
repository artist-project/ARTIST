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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.resource.XtextResource;

import com.google.common.collect.Lists;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact;
import eu.artist.postmigration.nfrvt.lang.gml.parser.antlr.GMLParser;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.ObjectUtil;
import eu.artist.postmigration.nfrvt.lang.util.selector.GoalModelSelector;
import eu.artist.postmigration.nfrvt.lang.util.selector.MigrationModelSelector;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.FQNQuery;

/**
 * This builder class helps to create or adapt one goal model instance.
 * 
 * @author Martin Fleck
 * @see GoalModelSelector
 * @see GoalModel
 */
public class GoalModelBuilder extends MigrationModelBuilder<GoalModel> {	
	private GoalModel goalModel;
	
	/**
	 * Creates a new goal model builder with a default migration resource set
	 * and a default goal model. Make sure that the given goal model fulfills
	 * all constraints before saving it.
	 * 
	 * @see MigrationResourceSet
	 * @see GoalModel
	 */
	public GoalModelBuilder() {
		this(new MigrationResourceSet());
	}
	
	/**
	 * Creates a new goal model builder with a default migration resource set
	 * and a default goal model with the given name. Make sure that the given 
	 * goal model fulfills all constraints before saving it.
	 * 
	 * @param goalModelName name of the goal model
	 * @see MigrationResourceSet
	 * @see GoalModel
	 */
	public GoalModelBuilder(String goalModelName) {
		this(new MigrationResourceSet(), MigrationFactory.createGoalModel(goalModelName));
	}
	
	/**
	 * Creates a new goal model builder with the given migration resource set
	 * and a default goal model. Make sure that the given goal model fulfills
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @see MigrationResourceSet
	 * @see GoalModel
	 */
	public GoalModelBuilder(MigrationResourceSet resourceSet) {
		this(resourceSet, MigrationFactory.createGoalModel(""));
	}
	
	/**
	 * Creates a new goal model builder with the given migration resource set
	 * and the given goal model. Make sure that the given goal model fulfills
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param goalModel goal model
	 * @see MigrationResourceSet
	 * @see GoalModel
	 */
	public GoalModelBuilder(MigrationResourceSet resourceSet, GoalModel goalModel) {
		super(resourceSet, goalModel);
		this.goalModel = goalModel;
	}
	
	/**
	 * Creates a new goal model builder with the given migration resource set
	 * for the given uri. If override is set to true, the goal model that is
	 * previously stored at the given uri will be replaced. Make sure that the 
	 * given goal model fulfills all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param goalModelUri goal model uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see GoalModel
	 */
	public GoalModelBuilder(MigrationResourceSet resourceSet, String goalModelUri, boolean override) {
		this(resourceSet, URI.createURI(adaptUri(goalModelUri)), override);
	}
	
	/**
	 * Creates a new goal model builder with the given migration resource set
	 * for the given uri. If override is set to true, the goal model that is
	 * previously stored at the given uri will be replaced. Make sure that the 
	 * given goal model fulfills all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param goalModelUri goal model uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see GoalModel
	 */
	public GoalModelBuilder(MigrationResourceSet resourceSet, URI goalModelUri, boolean override) {
		super(resourceSet, null);
		if(override) 
			this.goalModel = getResourceSet().createGoalModel(goalModelUri, override);
		else
			this.goalModel = getResourceSet().loadGoalModel(goalModelUri, true);
		if(this.goalModel == null)
			throw new IllegalArgumentException("No goal model could be obtained for uri '" + goalModelUri + "'.");
		this.model = goalModel;
	}
	
	@Override
	protected GMLParser getParser() {
		return (GMLParser) super.getParser();
	}

	@Override
	protected Grammar getGrammar() {
		return getParser().getGrammarAccess().getGrammar();
	}
	
	@Override
	protected GoalModelSelector createSelector() {
		return new GoalModelSelector(getGoalModel());
	}
	
	@Override
	public GoalModelSelector getSelector() {
		return ObjectUtil.asClass(super.getSelector(), GoalModelSelector.class);
	}
	
	/**
	 * Returns the goal model produced so far.
	 * 
	 * @return goal model
	 */
	public GoalModel getGoalModel() {
		return goalModel;
	}
	
	protected void setGoalModel(GoalModel goalModel) {
		getResource().getContents().clear();
		getResource().getContents().add(goalModel);
		this.goalModel = goalModel;
		this.model = goalModel;
	}
	
	/**
	 * Sets the name of the goal model.
	 * 
	 * @param name new name of the goal model
	 * @return this builder instance
	 */
	public GoalModelBuilder setName(String name) {
		getGoalModel().setName(toQualifiedName(name));
		return this;
	}
	
	/**
	 * Returns the name of the goal model.
	 * 
	 * @return goal model name
	 */
	public String getName() {
		return getGoalModel().getName();
	}

	/**
	 * Adds the given workload to the goal model managed by this builder.
	 * If the workload was previously stored in another goal model,
	 * it will be removed from that goal model.
	 * 
	 * @param workload workload to be added
	 * @return added workload 
	 */
	public Workload addWorkload(Workload workload) {
		getGoalModel().getWorkloads().add(workload);
		return workload;
	}
	
	/**
	 * Adds a new workload with the given data to the goal model managed by 
	 * this builder.
	 * 
	 * @param name workload name, must be unique
	 * @param activity workload activity
	 * @param pattern workload request arrival pattern
	 * @return created workload instance
	 */
	public Workload addWorkload(String name, Activity activity, String pattern) {
		return addWorkload(MigrationFactory.createWorkload(name, activity, pattern));
	}
	
	/**
	 * Adds the given applied property to the goal model managed by this 
	 * builder. If the applied property was previously stored in another 
	 * goal model, it will be removed from that goal model.
	 * 
	 * @param appliedProperty property to be added
	 * @return added property
	 */
	public AppliedQuantitativeProperty addAppliedQuantitativeProperty(AppliedQuantitativeProperty appliedProperty) {
		getGoalModel().getAppliedProperties().add(appliedProperty);
		return appliedProperty;
	}

	/**
	 * Adds a new applied property with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the applied property, should be unique
	 * @param property property
	 * @return newly created applied property instance
	 */
	public AppliedQuantitativeProperty addAppliedQuantitativeProperty(String name, QuantitativeProperty property) {
		return addAppliedQuantitativeProperty(MigrationFactory.createAppliedQuantitativeProperty(
				name, 
				property));
	}
	
	/**
	 * Adds a new applied property with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the applied property, should be unique
	 * @param property property
	 * @param context software context in which the property is applied
	 * @return newly created applied property instance
	 */
	public AppliedQuantitativeProperty addAppliedQuantitativeProperty(String name, QuantitativeProperty property, List<NamedElement> context) {
		return addAppliedQuantitativeProperty(MigrationFactory.createAppliedQuantitativeProperty(
				name, 
				property,
				context));
	}
	
	/**
	 * Adds a new applied property with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the applied property, should be unique
	 * @param property property
	 * @param context software context in which the property is applied
	 * @param workload workload under which the property is of interest
	 * @return newly created applied property instance
	 */
	public AppliedQuantitativeProperty addAppliedQuantitativeProperty(String name, QuantitativeProperty property, List<NamedElement> context, Workload workload) {
		return addAppliedQuantitativeProperty(MigrationFactory.createAppliedQuantitativeProperty(
				name, 
				property,
				context,
				workload));
	}

	/**
	 * Adds a new applied property with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the applied property, should be unique
	 * @param property property
	 * @param function function to be applied for the measurements taken for 
	 * this property
	 * @param context software context in which the property is applied
	 * @return newly created applied property instance
	 */
	public AppliedQuantitativeProperty addAppliedQuantitativeProperty(String name, QuantitativeProperty property, Operator function, List<NamedElement> context) {
		return addAppliedQuantitativeProperty(MigrationFactory.createAppliedQuantitativeProperty(
				name, 
				property,
				function,
				context));
	}
	
	/**
	 * Adds a new applied property with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the applied property, should be unique
	 * @param property property
	 * @param function function to be applied for the measurements taken for 
	 * this property
	 * @param context software context in which the property is applied
	 * @param workload workload under which the property is of interest
	 * @return newly created applied property instance
	 */
	public AppliedQuantitativeProperty addAppliedQuantitativeProperty(String name, QuantitativeProperty property, Operator function, List<NamedElement> context, Workload workload) {
		return addAppliedQuantitativeProperty(MigrationFactory.createAppliedQuantitativeProperty(
				name, 
				property,
				function,
				context,
				workload));
	}

	/**
	 * Adds the given applied property to the goal model managed by this 
	 * builder. If the applied property was previously stored in another 
	 * goal model, it will be removed from that goal model.
	 * 
	 * @param appliedProperty property to be added
	 * @return added property
	 */
	public AppliedQualitativeProperty addAppliedQualitativeProperty(AppliedQualitativeProperty appliedProperty) {
		getGoalModel().getAppliedProperties().add(appliedProperty);
		return appliedProperty;
	}

	/**
	 * Adds a new applied property with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the applied property, should be unique
	 * @param property property
	 * @return newly created applied property instance
	 */
	public AppliedQualitativeProperty addAppliedQualitativeProperty(String name, QualitativeProperty property) {
		return addAppliedQualitativeProperty(MigrationFactory.createAppliedQualitativeProperty(
				name, 
				property));
	}
	
	/**
	 * Adds a new applied property with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the applied property, should be unique
	 * @param property property
	 * @param context software context in which the property is applied
	 * @return newly created applied property instance
	 */
	public AppliedQualitativeProperty addAppliedQualitativeProperty(String name, QualitativeProperty property, List<NamedElement> context) {
		return addAppliedQualitativeProperty(MigrationFactory.createAppliedQualitativeProperty(
				name, 
				property,
				context));
	}
	
	/**
	 * Adds a new applied property with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the applied property, should be unique
	 * @param property property
	 * @param context software context in which the property is applied
	 * @return newly created applied property instance
	 */
	public AppliedQualitativeProperty addAppliedQualitativeProperty(String name, QualitativeProperty property, NamedElement... context) {
		return addAppliedQualitativeProperty(name, property, Lists.newArrayList(context));
	}
	
	/**
	 * Adds the given soft goal to the goal model managed by this 
	 * builder. If the soft goal was previously stored in another 
	 * goal model, it will be removed from that goal model.
	 *
	 * @param goal goal to be added
	 * @return added goal
	 */
	public SoftGoal addSoftGoal(SoftGoal goal) {
		getGoalModel().getGoals().add(goal);
		return goal;
	}
	
	/**
	 * Adds a new soft goal with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind goal kind
	 * @param priority goal priority (lower means higher priority)
	 * @param property qualitative property
	 * @param threshold threshold to be met for the goal to be fulfilled
	 * @return newly created and added goal
	 */
	public SoftGoal addSoftGoal(String name, GoalKind kind, int priority, AppliedQualitativeProperty property, double threshold) {
		return addSoftGoal(MigrationFactory.createSoftGoal(
				name, kind, priority, property, threshold));
	}
	
	/**
	 * Adds a soft goal impact from the given source to the given target
	 * with the specified impact.
	 * 
	 * @param source source goal
	 * @param target target goal
	 * @param impact goal impact
	 * @return newly created soft goal impact
	 */
	public SoftGoalImpact addSoftGoalImpact(SoftGoal source, SoftGoal target, double impact) {
		SoftGoalImpact goalImpact = MigrationFactory.createSoftGoalImpact(target, impact);
		source.getImpacts().add(goalImpact);
		return goalImpact;
	}
	
	/**
	 * Adds the given hard goal to the goal model managed by this 
	 * builder. If the hard goal was previously stored in another 
	 * goal model, it will be removed from that goal model.
	 *
	 * @param goal goal to be added
	 * @return added goal
	 */
	public HardGoal addHardGoal(HardGoal goal) {
		getGoalModel().getGoals().add(goal);
		return goal;
	}
	
	/**
	 * Adds a new hard goal with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind goal kind
	 * @param priority goal priority (lower means higher priority)
	 * @param condition goal condition to be met for the goal to be fulfilled 
	 * @return newly created and added goal
	 */
	public HardGoal addHardGoal(String name, GoalKind kind, int priority, Expression condition) {
		return addHardGoal(MigrationFactory.createHardGoal(name, kind, priority, condition));
	}
	
	/**
	 * Adds a new hard goal with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind goal kind
	 * @param priority goal priority (lower means higher priority)
	 * @param condition goal condition to be met for the goal to be fulfilled 
	 * @param successRate the success rate, if there are multiple results for 
	 * this goal
	 * @return newly created and added goal
	 */
	public HardGoal addHardGoal(String name, GoalKind kind, int priority, Expression condition, Double successRate) {
		return addHardGoal(MigrationFactory.createHardGoal(name, kind, priority, condition, successRate));
	}

	/**
	 * Adds a new hard goal with the given data to the goal model 
	 * managed by this builder.
	 * The given condition string will be parsed into the respective objects.
	 * Therefore the condition string must conform to the textual notation as
	 * it is shown in the xtext editors.
	 * If the condition string can not be parsed and the goal can not be 
	 * created, null will be returned.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind goal kind
	 * @param priority goal priority (lower means higher priority)
	 * @param conditionString goal condition to be met for the goal to be fulfilled 
	 * @return newly created and added goal or null
	 */
	public HardGoal addHardGoal(String name, GoalKind kind, int priority, String conditionString) {
		return addHardGoal(name, kind, priority, conditionString, null);
	}
	
	/**
	 * Adds a new hard goal with the given data to the goal model 
	 * managed by this builder.
	 * The given condition string will be parsed into the respective objects.
	 * Therefore the condition string must conform to the textual notation as
	 * it is shown in the xtext editors.
	 * If the condition string can not be parsed and the goal can not be 
	 * created, null will be returned.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind goal kind
	 * @param priority goal priority (lower means higher priority)
	 * @param conditionString goal condition to be met for the goal to be fulfilled 
	 * @param successRate the success rate, if there are multiple results for 
	 * this goal
	 * @return newly created and added goal or null
	 */
	public HardGoal addHardGoal(String name, GoalKind kind, int priority, String conditionString, Double successRate) {
		// to handle the serialized form of a model element, we need to transform the whole document
		// to its serialized form (which creates the node model) and then pick out the respective 
		// eobject (semantic element) and integrate it into the goal model
				
		String temporaryID = "ID" + Long.toString(System.currentTimeMillis());
				
		// use a temporary expression as a placeholder until we get the correct condition
		StringLiteral tempExpression = MigrationFactory.createStringLiteral("String" + temporaryID);
		HardGoal goal = addHardGoal(
				temporaryID, 
				kind, 
				priority, 
				tempExpression,
				successRate);
				
		XtextResource tempResource = null;
		HardGoal tempGoal = null;
		try {
			// serialize complete temporary document string and replace temporary id with given conditionString
			String tempDocumentString = toDocumentString()
					.replace("\"" + tempExpression.getValue() + "\"", escape(conditionString));	
			
			// parse temporary document back into the semantic domain (eobjects)
			tempResource = createSyntheticResource(
					temporaryID, 
					FileExtensions.getGoalModelExtension(),
					tempDocumentString);
			
			tempGoal = MigrationModelSelector.selectFirst(
						tempResource, new FQNQuery<>(HardGoal.class, toFQN(temporaryID)));
			
			// replace the temporary condition with the correct condition and correct references to document 
			// elements (i.e., AppliedQuantitativePropertyExpressions) if necessary
			goal.setCondition(EcoreUtil2.copy(tempGoal.getCondition()));
			for(Iterator<EObject> it = goal.getCondition().eAllContents(); it.hasNext();) {
				EObject object = it.next();
				if(object instanceof AppliedQuantitativePropertyExpression) {
					AppliedQuantitativePropertyExpression e = (AppliedQuantitativePropertyExpression) object;
					if(e.getValue().getName() == null)
						throw new IllegalArgumentException("Could not find AppliedQuantitativeProperty with the specified name.");
					AppliedQuantitativeProperty property = getSelector().selectAppliedQuantitativeProperty(e.getValue().getName());
					e.setValue(property);
				}
			}
			goal.setName(name);
		} catch (Exception e) {
			System.err.println("Goal '" + name + "' not created: " + e.getMessage());
			// clean up temporary content
			if(tempResource != null) {
				removeResource(tempResource);
				tempResource.getContents().clear();
			}			
					
			// remove already created goal with wrong condition
			getGoalModel().getGoals().remove(goal);
			goal = null;
		}
			
		return goal;
	}

	/**
	 * Adds the given composite goal to the goal model managed by this 
	 * builder. If the composite goal was previously stored in another 
	 * goal model, it will be removed from that goal model.
	 *
	 * @param goal goal to be added
	 * @return added goal
	 */
	public CompositeGoal addCompositeGoal(CompositeGoal goal) {
		getGoalModel().getGoals().add(goal);
		return goal;
	}
	
	/**
	 * Adds a new composite goal with the given data to the goal model 
	 * managed by this builder.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind goal kind
	 * @param priority goal priority (lower means higher priority)
	 * @param condition goal condition to be met for the goal to be fulfilled 
	 * @return newly created and added goal
	 */
	public CompositeGoal addCompositeGoal(String name, GoalKind kind, int priority, GoalExpression condition) {
		return addCompositeGoal(MigrationFactory.createCompositeGoal(name, kind, priority, condition));
	}

	/**
	 * Adds a new composite goal with the given data to the goal model 
	 * managed by this builder.
	 * The given condition string will be parsed into the respective objects.
	 * Therefore the condition string must conform to the textual notation as
	 * it is shown in the xtext editors.
	 * If the condition string can not be parsed and the goal can not be 
	 * created, null will be returned.
	 * 
	 * @param name name of the goal, should be unique
	 * @param kind goal kind
	 * @param priority goal priority (lower means higher priority)
	 * @param conditionString goal condition to be met for the goal to be fulfilled 
	 * @return newly created and added goal or null
	 */
	public CompositeGoal addCompositeGoal(String name, GoalKind kind, int priority, String conditionString) {
		// to handle the serialized form of a model element, we need to transform the whole document
		// to its serialized form (which creates the node model) and then pick out the respective 
		// eobject (semantic element) and integrate it into the goal model
						
		String temporaryID = "ID" + Long.toString(System.currentTimeMillis());
						
		// use a temporary expression as a placeholder until we get the correct condition
		GoalBooleanLiteral tempExpression = MigrationFactory.createGoalBooleanLiteral(true);
		CompositeGoal goal = addCompositeGoal(
				temporaryID, 
				kind, 
				priority, 
				tempExpression);
						
		XtextResource tempResource = null;
		CompositeGoal tempGoal = null;
		try {
			// serialize complete temporary document string and replace temporary id with given conditionString
			String tempDocumentString = toDocumentString();
			int tempConditionIndex = tempDocumentString.lastIndexOf(tempExpression.getValue().toString());
			if(tempConditionIndex == -1)
				throw new IllegalArgumentException("Something went wrong.");
			String beforeTempExpression = tempDocumentString.substring(0, tempConditionIndex);
			String afterTempExpression = tempDocumentString.substring(tempConditionIndex + tempExpression.getValue().toString().length());
			tempDocumentString = beforeTempExpression + escape(conditionString) + afterTempExpression;
					
			// parse temporary document back into the semantic domain (eobjects)
			tempResource = createSyntheticResource(
					temporaryID, 
					FileExtensions.getGoalModelExtension(),
					tempDocumentString);
					
			tempGoal = MigrationModelSelector.selectFirst(
					tempResource, new FQNQuery<>(CompositeGoal.class, toFQN(temporaryID)));
					
			// replace the temporary condition with the correct condition and correct references to document 
			// elements (i.e., AppliedQuantitativePropertyExpressions) if necessary
			goal.setCondition(EcoreUtil2.copy(tempGoal.getCondition()));
			for(Iterator<EObject> it = goal.getCondition().eAllContents(); it.hasNext();) {
				EObject object = it.next();
				if(object instanceof GoalReference) {
					GoalReference e = (GoalReference) object;
					if(e.getValue().getName() == null)
						throw new IllegalArgumentException("Could not find goal with the specified name.");
					Goal goalRef = getSelector().selectGoal(e.getValue().getName());
					e.setValue(goalRef);
				}
			}
			goal.setName(name);
		} catch (Exception e) {
			System.err.println("Goal '" + name + "' not created: " + e.getMessage());
			// clean up temporary content
			if(tempResource != null) {
				removeResource(tempResource);
				tempResource.getContents().clear();
			}			
					
			// remove already created goal with wrong condition
			getGoalModel().getGoals().remove(goal);
			goal = null;
		}
					
		return goal;
	}
	
	/**
	 * Makes sure that the given uriString corresponds to a goal model uri.
	 * 
	 * @param uriString uri string
	 * @return uri string conforming to goal models
	 */
	protected static String adaptUri(String uriString) {
		if(!FileExtensions.isGoalModel(uriString))
			return uriString + "." + FileExtensions.getGoalModelExtension();
		return uriString;
	}
}

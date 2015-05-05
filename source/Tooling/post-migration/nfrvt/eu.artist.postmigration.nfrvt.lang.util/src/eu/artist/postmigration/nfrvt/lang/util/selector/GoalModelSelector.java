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
package eu.artist.postmigration.nfrvt.lang.util.selector;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.ClassQuery;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.ContainerQuery;

public class GoalModelSelector extends MigrationModelSelector<GoalModel> {

	/**
	 * Creates a new goal model selector providing queries to handle
	 * a goal model.
	 * 
	 * @param model goal model on which queries can be placed
	 * @see GoalModel
	 */
	public GoalModelSelector(GoalModel model) {
		super(model);
	}
	
	/**
	 * Goal model handled by this selector.
	 * @return goal model
	 */
	public GoalModel getGoalModel() {
		return (GoalModel) super.getModel();
	}
	
	/**
	 * Selects all applied quantitative properties from the goal model.
	 * 
	 * @return all applied quantitative properties
	 */
	public List<AppliedQuantitativeProperty> selectAppliedQuantitativeProperties() {
		return selectFrom(getGoalModel().getAppliedProperties(), new ClassQuery<>(AppliedQuantitativeProperty.class));
	}
	
	/**
	 * Selects all applied qualitative properties from the goal model.
	 * 
	 * @return all applied qualitative properties
	 */
	public List<AppliedQualitativeProperty> selectAppliedQualitativeProperties() {
		return selectFrom(getGoalModel().getAppliedProperties(), new ClassQuery<>(AppliedQualitativeProperty.class));
	}
	
	/**
	 * Selects all hard goals from the goal model.
	 * 
	 * @return all hard goals
	 */
	public List<HardGoal> selectHardGoals() {
		return selectFrom(getGoalModel().getGoals(), new ClassQuery<>(HardGoal.class));
	}
	
	/**
	 * Selects all soft goals from the goal model.
	 * 
	 * @return all soft goals
	 */
	public List<SoftGoal> selectSoftGoals() {
		return selectFrom(getGoalModel().getGoals(), new ClassQuery<>(SoftGoal.class));
	}
	
	/**
	 * Selects all composite goals from the goal model.
	 * 
	 * @return all composite goals
	 */
	public List<CompositeGoal> selectCompositeGoals() {
		return selectFrom(getGoalModel().getGoals(), new ClassQuery<>(CompositeGoal.class));
	}
	
	/**
	 * Select the applied property with the given name or null if no such
	 * property can be found.
	 * 
	 * @return selected applied property or null if no such property can be 
	 * found
	 */
	public AppliedProperty selectAppliedProperty(String name) {
		return selectFirstFrom(getGoalModel().getAppliedProperties(), toFQN(name), AppliedProperty.class);
	}

	/**
	 * Select the applied quantitative property with the given name or null if 
	 * no such property can be found.
	 * 
	 * @return selected applied quantitative property or null if no such 
	 * property can be found
	 */
	public AppliedQuantitativeProperty selectAppliedQuantitativeProperty(String name) {
		return selectFirstFrom(getGoalModel().getAppliedProperties(), toFQN(name), AppliedQuantitativeProperty.class);
	}
	
	/**
	 * Select the applied qualitative property with the given name or null if 
	 * no such property can be found.
	 * 
	 * @return selected applied qualitative property or null if no such 
	 * property can be found
	 */
	public AppliedQualitativeProperty selectAppliedQualitativeProperty(String name) {
		return selectFirstFrom(getGoalModel().getAppliedProperties(), toFQN(name), AppliedQualitativeProperty.class);
	}
	
	/**
	 * Select the hard goal with the given name or null if 
	 * no such goal can be found.
	 * 
	 * @return selected hard goal or null if no such goal can be found
	 */
	public HardGoal selectHardGoal(String name) {
		return selectFirstFrom(getGoalModel().getGoals(), toFQN(name), HardGoal.class);
	}
	
	/**
	 * Select the soft goal with the given name or null if 
	 * no such goal can be found.
	 * 
	 * @return selected soft goal or null if no such goal can be found
	 */
	public SoftGoal selectSoftGoal(String name) {
		return selectFirstFrom(getGoalModel().getGoals(), toFQN(name), SoftGoal.class);
	}
	
	/**
	 * Select the composite goal with the given name or null if 
	 * no such goal can be found.
	 * 
	 * @return selected composite goal or null if no such goal can be found
	 */
	public CompositeGoal selectCompositeGoal(String name) {
		return selectFirstFrom(getGoalModel().getGoals(), toFQN(name), CompositeGoal.class);
	}
	
	/**
	 * Select the goal with the given name or null if 
	 * no such goal can be found.
	 * 
	 * @return selected goal or null if no such goal can be found
	 */
	public Goal selectGoal(String name) {
		return selectFirstFrom(getGoalModel().getGoals(), toFQN(name), Goal.class);
	}
	
	/**
	 * Select the workload with the given name or null if 
	 * no such workload can be found.
	 * 
	 * @return selected workload or null if no such goal can be found
	 */
	public Workload selectWorkload(String name) {
		return selectFirstFrom(getGoalModel().getWorkloads(), toFQN(name), Workload.class);
	}	
	
	/**
	 * Selects from within the goals the objects of the selectedType that 
	 * contain the given object.
	 * 
	 * @param selectedType type of objects to be selected
	 * @param containedObject objects that needs to be contained in the 
	 * selected objects
	 * @return all objects of the given type containing the given object
	 */
	public <T extends EObject> List<T> selectFromGoals(Class<T> selectedType, EObject containedObject) {
		return selectFromGoals(selectedType, containedObject, false);
	}
	
	/**
	 * Selects from within the goals the objects of the selectedType that 
	 * contain the given object.
	 * 
	 * @param selectedType type of objects to be selected
	 * @param containedObject objects that needs to be contained in the 
	 * selected objects
	 * @param strictType if true, sub types are not considered, objects must fit 
	 * the given type exactly
	 * @return all objects of the given type containing the given object
	 */
	public <T extends EObject> List<T> selectFromGoals(Class<T> selectedType, EObject containedObject, boolean strictType) {
		return selectFrom(getGoalModel().getGoals(), new ContainerQuery<T>(selectedType, containedObject, strictType));
	}
}

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

import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;

public class MeasurementModelSelector extends MigrationModelSelector<MeasurementModel> {
	
	/**
	 * Creates a new measurement model selector providing queries to handle
	 * a measurement model.
	 * 
	 * @param model measurement model on which queries can be placed
	 * @see MeasurementModel
	 */
	public MeasurementModelSelector(MeasurementModel model) {
		super(model);
	}
	
	/**
	 * Measurement model handled by this selector.
	 * @return measurement model
	 */
	public MeasurementModel getMeasurementModel() {
		return (MeasurementModel) super.getModel();
	}
	
	/**
	 * Select the observation with the given name or null if no such 
	 * observation can be found.
	 * 
	 * @param name observation name
	 * @return selected observation or null if no such observation can be found
	 */
	public Observation selectObservation(String name) {
		return selectFirstFromModel(name, Observation.class);
	}	
	
	/**
	 * Select the measurement with the given name or null if no such 
	 * measurement can be found.
	 * 
	 * @param name measurement name
	 * @return selected measurement or null if no such measurement can be found
	 */
	public Measurement selectMeasurement(String name) {
		return selectFirstFromModel(name, Measurement.class);
	}
}

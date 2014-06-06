/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.test.edit;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;

import eu.artist.premigration.tft.tft.test.model.Person;

public class GenderEditingSupport extends EditingSupport {

	private final TableViewer viewer;

	public GenderEditingSupport(TableViewer viewer) {
		super(viewer);
		this.viewer = viewer;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		String[] gender = new String[2];
		gender[0] = "male";
		gender[1] = "female";

		return new ComboBoxCellEditor(viewer.getTable(), gender);
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		Person person = (Person) element;
		if (person.getGender().equals("male")) {
			return 0;
		}
		return 1;

	}

	@Override
	protected void setValue(Object element, Object value) {
		Person pers = (Person) element;
		if (((Integer) value) == 0) {
			pers.setGender("male");
		} else {
			pers.setGender("female");
		}
		viewer.update(element, null);
	}
}
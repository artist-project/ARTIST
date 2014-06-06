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
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;

import eu.artist.premigration.tft.tft.test.model.Person;

public class MarriedEditingSupport extends EditingSupport {

	  private final TableViewer viewer;

	  public MarriedEditingSupport(TableViewer viewer) {
	    super(viewer);
	    this.viewer = viewer;
	  }

	  @Override
	  protected CellEditor getCellEditor(Object element) {
	    return new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);

	  }

	  @Override
	  protected boolean canEdit(Object element) {
	    return true;
	  }

	  @Override
	  protected Object getValue(Object element) {
	    Person person = (Person) element;
	    return person.isMarried();

	  }

	  @Override
	  protected void setValue(Object element, Object value) {
	    Person pers = (Person) element;
	    pers.setMarried((Boolean) value);
	    viewer.update(element, null);
	  }
	} 

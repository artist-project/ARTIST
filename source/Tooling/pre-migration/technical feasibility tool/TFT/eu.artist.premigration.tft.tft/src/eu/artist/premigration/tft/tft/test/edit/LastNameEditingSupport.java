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

import org.eclipse.jface.viewers.TableViewer;

import eu.artist.premigration.tft.tft.test.model.Person;

public class LastNameEditingSupport extends FirstNameEditingSupport {

	  private final TableViewer viewer;

	  public LastNameEditingSupport(TableViewer viewer) {
	    super(viewer);
	    this.viewer = viewer;
	  }

	  @Override
	  protected Object getValue(Object element) {
	    return ((Person) element).getLastName();
	  }

	  @Override
	  protected void setValue(Object element, Object value) {
	    ((Person) element).setLastName(String.valueOf(value));
	    viewer.update(element, null);
	  }
	} 

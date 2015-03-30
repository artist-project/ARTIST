/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fumldebug.ui.commons.provider;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import fUML.Syntax.Classes.Kernel.Element;

public class ActivityContentProvider implements ITreeContentProvider {

	private boolean activitiesOnly = false;

	public ActivityContentProvider(boolean activitiesOnly) {
		this.activitiesOnly = activitiesOnly;
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection<?>) {
			Collection<?> collection = (Collection<?>) inputElement;
			return collection.toArray();
		} else if (inputElement instanceof Object[]) {
			return (Object[]) inputElement;
		}
		return Collections.emptyList().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (activitiesOnly) {
			return null;
		} else {
			if (parentElement instanceof Element) {
				Element element = (Element) parentElement;
				element.ownedElement.toArray();
			}
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof Element) {
			Element myElement = (Element) element;
			return myElement.owner;
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getElements(element).length > 0;
	}

}

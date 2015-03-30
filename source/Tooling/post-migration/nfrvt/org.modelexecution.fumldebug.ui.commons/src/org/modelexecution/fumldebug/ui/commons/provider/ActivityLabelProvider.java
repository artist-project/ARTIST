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

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.modelexecution.fumldebug.ui.commons.FUMLUICommons;

import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Classes.Kernel.NamedElement;

public class ActivityLabelProvider implements ILabelProvider {

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof Activity) {
			return FUMLUICommons.getImage(FUMLUICommons.IMG_ACTIVITY);
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof NamedElement) {
			NamedElement namedElement = (NamedElement) element;
			return namedElement.name;
		}
		return null;
	}
	
	@Override
	public void addListener(ILabelProviderListener listener) {
	}
	
	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

}

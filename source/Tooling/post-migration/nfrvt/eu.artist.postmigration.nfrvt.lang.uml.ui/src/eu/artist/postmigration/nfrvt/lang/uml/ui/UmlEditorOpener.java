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
package eu.artist.postmigration.nfrvt.lang.uml.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;

public class UmlEditorOpener extends LanguageSpecificURIEditorOpener {

	@Override
	protected void selectAndReveal(IEditorPart openEditor, URI uri,
			EReference crossReference, int indexInList, boolean select) {
		UMLEditor umlEditor = (UMLEditor) openEditor.getAdapter(UMLEditor.class);
		if (umlEditor != null) {
			try {
				EObject eObject = umlEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
				umlEditor.setSelectionToViewer(Collections.singletonList(eObject));
			} catch(Exception e) {
				URI newUri = URI.createURI(uri.toString().replace("platform:/resource/", "platform:/plugin/"));
				EObject eObject = umlEditor.getEditingDomain().getResourceSet().getEObject(newUri, true);
				umlEditor.setSelectionToViewer(Collections.singletonList(eObject));
			}
		}
	}

}
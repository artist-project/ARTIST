/*******************************************************************************
 * Copyright (c) 2010, 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * - Original implementation by Christian Dietrich, retrieved from his blog at 
 *   http://christiandietrich.wordpress.com/2011/07/17/xtext-2-0-and-uml/
 * - Martin Fleck (not itemis): Added try to open platform-plugin path
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.uml.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;

/**
 * Implementation retrieved from Christian Dietrichs blog post.
 * 
 * @see <a href="http://christiandietrich.wordpress.com/2011/07/17/xtext-2-0-and-uml/">
 * Original blog post by Christian Dietrich</a>
 */
public class UmlEditorOpener extends LanguageSpecificURIEditorOpener {

	protected void openSelection(UMLEditor umlEditor, URI uri) {
		EObject eObject = umlEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
		umlEditor.setSelectionToViewer(Collections.singletonList(eObject));
	}
	
	@Override
	protected void selectAndReveal(IEditorPart openEditor, URI uri,
			EReference crossReference, int indexInList, boolean select) {
		UMLEditor umlEditor = (UMLEditor) openEditor.getAdapter(UMLEditor.class);
		if (umlEditor != null) {
			try {
				openSelection(umlEditor, uri);
			} catch(Exception e) {
				// try opening the plugin-specific path
				openSelection(umlEditor, URI.createURI(uri.toString().replace("platform:/resource/", "platform:/plugin/")));
			}
		}
	}

}
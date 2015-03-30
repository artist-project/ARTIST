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

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.ConcurrentModificationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.xtext.ui.editor.XtextReadonlyEditorInput;

/**
 * Base implementation retrieved from Christian Dietrichs blog post.
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
	public IEditorPart open(URI uri, boolean select) {
		return super.open(uri, select);
	}
	
	public IEditorPart openWithUMLEditor(URI uri, EReference crossReference, int indexInList, boolean select) throws PartInitException {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorPart editorPart = null;
		for(IEditorReference part : page.getEditorReferences())
			if(part.getTitleToolTip().equals(uri.trimFragment().toString()))
				editorPart = part.getEditor(false);
		
		if(editorPart == null) {
			IEditorDescriptor editorDesc = IDE.getEditorDescriptor(uri.toPlatformString(true), true);
			editorPart = IDE.openEditor(page, 
					new XtextReadonlyEditorInput(
							new UMLPluginResourceStorage(uri)),
							editorDesc.getId(), 
							true);
			try {
				Method setPartName = EditorPart.class.getDeclaredMethod("setPartName", String.class);
				setPartName.setAccessible(true);
				setPartName.invoke(editorPart, uri.lastSegment());
			} catch (Exception e) {
				;
			}
		} else {
			page.activate(editorPart);
		}
		
		if(editorPart != null) {
			selectAndReveal(editorPart, uri, crossReference, indexInList, select);
			return editorPart;
		}
		return null;
	}
	
	public static IEditorPart openWithReflectiveEcoreEditor(URI uri, EReference crossReference, int indexInList, boolean select) {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorInput editorInput = page.getActiveEditor().getEditorInput();
		if(editorInput instanceof FileEditorInput) {
			IFile file = ((FileEditorInput) editorInput).getFile();
			try {
				IEditorPart newPart = page.openEditor(
						new FileEditorInput(file), 
						"org.eclipse.emf.ecore.presentation.ReflectiveEditorID", 
						true, 
						2);
				EcoreEditor editor = (EcoreEditor) newPart.getAdapter(EcoreEditor.class);
				if(editor != null) {
					try {
						ResourceSet resourceSet = editor.getEditingDomain().getResourceSet();
						resourceSet.getResource(uri.trimFragment(), true);
						EObject eObject = resourceSet.getEObject(uri, true);
						if(eObject != null) {
							editor.setSelectionToViewer(Collections.singletonList(eObject));
							return editor;
						}
					} catch(ConcurrentModificationException e) {
						ResourceSet resourceSet = editor.getEditingDomain().getResourceSet();
						resourceSet.getResource(uri.trimFragment(), true);
						EObject eObject = resourceSet.getEObject(uri, true);
						if(eObject != null) {
							editor.setSelectionToViewer(Collections.singletonList(eObject));
							return editor;
						}
					}
				}
			} catch (Exception e) {
				return null;
			}
		}
		return null;
	}
	
	@Override
	public IEditorPart open(URI uri, EReference crossReference, int indexInList, boolean select) {
		IEditorPart part = super.open(uri, crossReference, indexInList, select);
		if(part != null)
			return part;
		
		if(uri.isPlatformPlugin()) {
			try {
				part = openWithUMLEditor(uri, crossReference, indexInList, select);
			} catch (Exception e) {
				;
			}
			if(part == null)
				part = openWithReflectiveEcoreEditor(uri, crossReference, indexInList, select);
		} else if(uri.isPlatformResource()) {
			;
//			return open(URI.createURI(uri.toString().replace("platform:/resource/", "platform:/plugin/")),
//					crossReference, indexInList, select);
		}
		return part;
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
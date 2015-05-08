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
package eu.artist.postmigration.nfrvt.lang.common.ui;

import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.custom.StyledTextDropTargetEffect;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.uml2.uml.NamedElement;

/**
 * A {@link DropTargetListener} listening for {@link TreeSelection} drops. If 
 * the selection contains a {@link NamedElement}, the qualified name of this
 * element is copied to the position of the caret. The qualified name is in
 * the style of Xtext, i.e., '.' are used as delimiters instead of '::'.
 * 
 * @author Martin Fleck
 */
public class TreeSelectionDropTargetListener extends StyledTextDropTargetEffect {

	private ISourceViewer viewer; // save viewer for easier access

	/**
	 * Constructs a new listener for {@link TreeSelection} drops on the given
	 * viewers text widget.
	 * @param viewer
	 */
	public TreeSelectionDropTargetListener(ISourceViewer viewer) {
		super(viewer.getTextWidget());
		this.viewer = viewer;
	}

	/**
	 * Inserts the given text at the current caret position.
	 * @param text text to be inserted
	 */
	protected void insertTextAtCaret(String text) {
		viewer.getTextWidget().replaceTextRange(
				viewer.getTextWidget().getCaretOffset(), // current position
				0, // insert
				text);
	}
	
	/**
	 * Returns the qualified name of the given element in Xtext notation, i.e.,
	 * using '.' as delimiter and not '::'.
	 * @param element
	 * @return qualified name of the given element
	 */
	protected String getQualifiedName(NamedElement element) {
		return element.getQualifiedName().replace("::", ".");
	}
	
	@Override
	public void drop(DropTargetEvent event) {
		super.drop(event);
		if (LocalSelectionTransfer.getTransfer().isSupportedType(event.currentDataType)) {
			if (event.data instanceof TreeSelection) {
				TreeSelection tree = (TreeSelection) event.data;
				if(tree.getFirstElement() instanceof NamedElement) {
					NamedElement namedElement = (NamedElement) tree.getFirstElement();
					insertTextAtCaret(getQualifiedName(namedElement));
				}								
			}
		}
	}
	
	@Override
	public void dragOperationChanged(DropTargetEvent event) {
		 if (event.detail == DND.DROP_DEFAULT) {
			 if ((event.operations & DND.DROP_COPY) != 0) {
				 event.detail = DND.DROP_COPY;
			 } else {
				 event.detail = DND.DROP_NONE;
			 }
		}
		super.dragOperationChanged(event);
	}
	
	@Override
	public void dragEnter(DropTargetEvent event) {
		for (int i = 0; i < event.dataTypes.length; i++) {
			if (LocalSelectionTransfer.getTransfer().isSupportedType(event.dataTypes[i])){
				event.currentDataType = event.dataTypes[i];
				event.feedback = DND.FEEDBACK_INSERT_AFTER;
				if (event.detail != DND.DROP_COPY) {
					event.detail = DND.DROP_COPY;
				}
				break;
			}
		}
		super.dragEnter(event);
	}
}

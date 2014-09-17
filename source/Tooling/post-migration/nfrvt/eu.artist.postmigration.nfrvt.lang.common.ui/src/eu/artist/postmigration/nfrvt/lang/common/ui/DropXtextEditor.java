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

import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.ui.dnd.IDragAndDropService;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * Extends the {@link XtextEditor} with the 
 * {@link TreeSelectionDropTargetListener} to allow the drag and drop from
 * tree-based editors. A drop from such an editor copies the qualified name
 * of the dragged element into this editor, if the element is a 
 * {@link NamedElement}.
 * <p/>
 * To use this editor instead of the standard XtextEditor, the 
 * ExecutableExtensionFactory in the plugin.xml must be adapted accordingly.
 * 
 * @author Martin Fleck
 *
 */
public class DropXtextEditor extends XtextEditor {
	
	@Override
	protected void initializeDragAndDrop(ISourceViewer viewer) {
		super.initializeDragAndDrop(viewer);
		addTreeSelectionDnD(viewer);
	}
	
	/**
	 * Adds the {@link TreeSelectionDropTargetListener} to this editor.
	 * @param viewer
	 */
	protected void addTreeSelectionDnD(final ISourceViewer viewer) {
		IDragAndDropService dndService= (IDragAndDropService)getSite().getService(IDragAndDropService.class);
		
		// transfers used by the UML editor
		Transfer[] transfers = new Transfer[] {
				LocalTransfer.getInstance(),
				LocalSelectionTransfer.getTransfer()
		};
		
		dndService.addMergedDropTarget(
				viewer.getTextWidget(), 
				DND.DROP_COPY, 
				transfers, 			
				new TreeSelectionDropTargetListener(viewer));		
	}
}

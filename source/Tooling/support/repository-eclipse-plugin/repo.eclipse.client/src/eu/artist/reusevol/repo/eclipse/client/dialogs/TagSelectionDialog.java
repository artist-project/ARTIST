/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.dialogs;


import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;

public class TagSelectionDialog extends ElementTreeSelectionDialog {

	public static final int OPEN = 9999;
	private LocalRepositoryModel model = LocalRepositoryModel.getInstance();

	public TagSelectionDialog(Shell parent, ILabelProvider labelProvider,
			ITreeContentProvider contentProvider) {
		super(parent, labelProvider, contentProvider);

		setTitle("Select tags");
		setMessage("Select tags");
		setInput(model);
	}

	protected void inputChanged(Object input, Object oldInput) {
		if (input != null)
			this.model = (LocalRepositoryModel) input;
	}

	public Object[] getElements(Object inputElement) {
		return model.getTags().toArray();
	}

	public void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "OK", false);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}
}

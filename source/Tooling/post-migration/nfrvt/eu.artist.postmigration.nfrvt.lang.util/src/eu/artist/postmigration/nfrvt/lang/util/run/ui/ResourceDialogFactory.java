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
package eu.artist.postmigration.nfrvt.lang.util.run.ui;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import com.google.common.collect.Lists;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;

public class ResourceDialogFactory {
	
	public static ARTISTWorkspaceResourceDialog createModelResourceDialog(Shell shell, String title, String message, boolean allowMultiple, final List<String> fileExtensions) {
		ViewerFilter extensionFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return !(element instanceof IFile)
						|| fileExtensions.contains(((IFile) element).getFileExtension());
			}
		};
		// new WorkbenchContentProvider();
		ARTISTWorkspaceResourceDialog dialog = new ARTISTWorkspaceResourceDialog(shell, new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		dialog.setAllowMultiple(allowMultiple);
		dialog.setShowFileControl(true);
		dialog.setShowNewFolderControl(true);
		dialog.addFilter(extensionFilter);
		dialog.loadContents();
		dialog.setTitle(title);
		dialog.setMessage(message);
		
		return dialog;
	}
	
	public static ARTISTWorkspaceResourceDialog createModelResourceDialog(Shell shell, String title, String message, boolean allowMultiple, String... fileExtensions) {
		return createModelResourceDialog(shell, title, message, allowMultiple, Lists.newArrayList(fileExtensions));
	}
	
	public static ARTISTWorkspaceResourceDialog createModelResourceDialog(Shell shell, String model, boolean allowMultiple, List<String> fileExtensions) {
		String title = model + " Browser";
		String message = allowMultiple ? "Select one or many " + model + "s." : "Select a " + model + ".";
		return createModelResourceDialog(shell, title, message, allowMultiple, fileExtensions);
	}
	
	public static ARTISTWorkspaceResourceDialog createModelResourceDialog(Shell shell, String model, boolean allowMultiple, String... fileExtensions) {
		return createModelResourceDialog(shell, model, allowMultiple, Lists.newArrayList(fileExtensions));
	}
	
	public static ARTISTWorkspaceResourceDialog createPatternCatalogueResourceDialog(Shell shell, boolean allowMultiple) {
		return createModelResourceDialog(shell, "Pattern Catalogue", allowMultiple, FileExtensions.getPatternCatalogueExtensions());
	}
	
	public static ARTISTWorkspaceResourceDialog createPropertyCatalogueResourceDialog(Shell shell, boolean allowMultiple) {
		return createModelResourceDialog(shell, "Property Catalogue", allowMultiple, FileExtensions.getPropertyCatalogueExtensions());
	}
	
	public static ARTISTWorkspaceResourceDialog createMeasurementModelResourceDialog(Shell shell, boolean allowMultiple) {
		return createModelResourceDialog(shell, "Measurement Model", allowMultiple, FileExtensions.getMeasurementModelExtensions());
	}
	
	public static ARTISTWorkspaceResourceDialog createGoalModelResourceDialog(Shell shell, boolean allowMultiple) {
		return createModelResourceDialog(shell, "Goal Model", allowMultiple, FileExtensions.getGoalModelExtensions());
	}
	
	public static ARTISTWorkspaceResourceDialog createMigrationEvaluationResourceDialog(Shell shell, boolean allowMultiple) {
		return createModelResourceDialog(shell, "Migration Evaluation", allowMultiple, FileExtensions.getMigrationEvaluationExtensions());
	}
}

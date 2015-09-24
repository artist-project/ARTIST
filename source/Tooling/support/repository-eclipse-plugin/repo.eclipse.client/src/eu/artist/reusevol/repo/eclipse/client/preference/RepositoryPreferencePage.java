/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Huzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.preference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.equinox.security.storage.StorageException;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.service.prefs.BackingStoreException;

import com.google.common.collect.Lists;

import eu.artist.reusevol.repo.eclipse.client.Activator;
import eu.artist.reusevol.repo.eclipse.client.core.internal.messages.InternalMessages;
import eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView;

public class RepositoryPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
	
	private final static String TITLE = "Repository Connections";

	TableViewer repositoryConnectionViewer;
	List<RepositoryConfigurationEntry> repoConfigModel;

	RepositoryConfigurationManager repositoryConfigurationManager;

	
	public RepositoryPreferencePage() {
		super(TITLE);
		repositoryConfigurationManager = Activator.getDefault()
				.getRepositoryManager();
		
		try {
			repositoryConfigurationManager.readConfigurations();
			repoConfigModel = Lists.newArrayList(repositoryConfigurationManager.getRepositoryConfigurations());
		} catch (BackingStoreException | StorageException e) {
			repoConfigModel = new ArrayList<RepositoryConfigurationEntry>();
			e.printStackTrace();
		}
	}

	@Override
	public void init(IWorkbench workbench) {
		noDefaultAndApplyButton();
	}

	@Override
	protected void performDefaults() {
		repoConfigModel = Lists.newArrayList(repositoryConfigurationManager.getRepositoryConfigurations());
		repositoryConnectionViewer.setInput(repoConfigModel);
		repositoryConnectionViewer.setSelection(null, true);

		super.performDefaults();
	}

	@Override
	protected Control createContents(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		composite.setLayout(gridLayout);

		repositoryConnectionViewer = new TableViewer(composite, SWT.BORDER
				| SWT.FULL_SELECTION);

		repositoryConnectionViewer
				.setContentProvider(new ArrayContentProvider() {

					public Object[] getElements(Object input) {
						if (input instanceof Collection) {
							return ((Collection<?>) input).toArray();
						}
						return new Object[0];
					}

					public void inputChanged(Viewer viewer, Object oldInput,
							Object newInput) {
					}

					public void dispose() {
					}
				});

		Table table = repositoryConnectionViewer.getTable();
		createColumns(parent, repositoryConnectionViewer);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 4));

		createAddButton(composite);
		final Button editButton = createEditButton(composite);
		final Button removeButton = createRemoveButton(composite);

		repositoryConnectionViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {

						if (repositoryConnectionViewer.getSelection() instanceof IStructuredSelection) {
							RepositoryConfigurationEntry entry = getSelectedRepositoryConfiguration();
							boolean isEnabled = entry != null
									&& entry.isEditable();
							removeButton.setEnabled(isEnabled);
							editButton.setEnabled(isEnabled);
						}

					}
				});

		repoConfigModel = new ArrayList<RepositoryConfigurationEntry>(
				repositoryConfigurationManager.getRepositoryConfigurations());
		repositoryConnectionViewer.setInput(repoConfigModel);
		repositoryConnectionViewer.refresh();

		return composite;
	}

	private Button createAddButton(Composite composite) {
		final Button addLocalButton = new Button(composite, SWT.NONE);
		addLocalButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false,
				false));
		addLocalButton.setText(InternalMessages.LocalAddButtons);
		addLocalButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {

				RepositoryConfigurationDialog dialog = new RepositoryConfigurationDialog(
						getShell(), null);
				dialog.open();
				if (dialog.getConfiguration() != null) {
					RepositoryConfigurationEntry entry = dialog
							.getConfiguration();

					repoConfigModel.add(entry);
					// repositoryViewer.setInput(factory);
					repositoryConnectionViewer.setSelection(
							new StructuredSelection(entry), true);
					repositoryConnectionViewer.refresh();
				}

			}
		});
		return addLocalButton;
	}

	private Button createEditButton(Composite composite) {
		final Button editButton = new Button(composite, SWT.NONE); //
		editButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		editButton.setEnabled(false);
		editButton.setText("Edit");
		editButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {

				RepositoryConfigurationEntry oldEntry = getSelectedRepositoryConfiguration();
				RepositoryConfigurationDialog dialog = new RepositoryConfigurationDialog(
						getShell(), oldEntry);
				dialog.open();
				
				if (dialog.getConfiguration() != null) {
					RepositoryConfigurationEntry newEntry = dialog
							.getConfiguration();
					
					int index = repoConfigModel.indexOf(oldEntry);
					repoConfigModel.set(index, newEntry);
					
					repositoryConnectionViewer.setSelection(
							new StructuredSelection(newEntry), true);
					repositoryConnectionViewer.refresh();
					repositoryConnectionViewer.setSelection(null, true);
				}

			}
		});
		return editButton;
	}

	private Button createRemoveButton(Composite composite) {
		final Button removeButton = new Button(composite, SWT.NONE);
		removeButton
				.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, true));
		removeButton.setText(InternalMessages.LocalRemoveButtons);
		removeButton.setEnabled(false);
		removeButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {

				RepositoryConfigurationEntry entry = getSelectedRepositoryConfiguration();
				repoConfigModel.remove(entry);
				repositoryConnectionViewer.setInput(repoConfigModel);
				repositoryConnectionViewer.setSelection(null, true);

			}
		});
		return removeButton;
	}

	@Override
	public boolean performOk() {
		Collection<RepositoryConfigurationEntry> configurations = repositoryConfigurationManager
				.getRepositoryConfigurations();
		
		// Remove all entries from the list
		for (RepositoryConfigurationEntry entry : configurations) {
			if (entry.isEditable()) {
				repositoryConfigurationManager
						.removeRepositoryConfiguration(entry.getId());
			}
		}
		
		// Add all entries from the table to the list
		for (RepositoryConfigurationEntry entry : repoConfigModel) {
			if (entry.isEditable()) {
				repositoryConfigurationManager
						.addRepositoryConfiguration(entry);
			}
		}

		// Save the list
		try {
			repositoryConfigurationManager.saveConfigurations();
		} catch (Exception ex) {
			setErrorMessage(NLS.bind("Messages", ex.getMessage()));
			ex.printStackTrace();
			return false;
		}

		RepoProjectView view = null;
		try {
			view = (RepoProjectView) PlatformUI
					.getWorkbench()
					.getActiveWorkbenchWindow()
					.getActivePage()
					.showView(
							"eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView");
		} catch (PartInitException e1) {
			e1.printStackTrace();
		}

		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.hideView(view);

		try {
			PlatformUI
					.getWorkbench()
					.getActiveWorkbenchWindow()
					.getActivePage()
					.showView(
							"eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView");
		} catch (PartInitException e1) {
			e1.printStackTrace();
		}
		view.dispose();
		
		return super.performOk();
	}

	private void createColumns(final Composite parent, final TableViewer viewer) {
		String[] titles = { "Name", "URL", "Username" };
		int[] bounds = { 100, 100, 100 };

		// first column is for the first name
		TableViewerColumn nameColumn = createTableViewerColumn(titles[0], bounds[0],
				0);
		nameColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				RepositoryConfigurationEntry entry = (RepositoryConfigurationEntry) element;
				return entry.getName();
			}
		});

		TableViewerColumn urlColumn = createTableViewerColumn(titles[1], bounds[1],
				1);
		urlColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				RepositoryConfigurationEntry entry = (RepositoryConfigurationEntry) element;
				return entry.getUrl();
			}
		});

		TableViewerColumn usernameColumn = createTableViewerColumn(titles[2], bounds[2],
				2);
		usernameColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				RepositoryConfigurationEntry entry = (RepositoryConfigurationEntry) element;
				return entry.getUsername();
			}
		});
}

	private TableViewerColumn createTableViewerColumn(String title, int bound,
			final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(
				repositoryConnectionViewer, SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}

	private RepositoryConfigurationEntry getSelectedRepositoryConfiguration() {
		IStructuredSelection selection = (IStructuredSelection) repositoryConnectionViewer
				.getSelection();
		return (RepositoryConfigurationEntry) selection.getFirstElement();
	}
}

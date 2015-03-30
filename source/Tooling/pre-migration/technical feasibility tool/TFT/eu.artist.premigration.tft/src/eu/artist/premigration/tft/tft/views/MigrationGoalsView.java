/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.views;

import java.math.BigDecimal;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import eu.artist.postmigration.nfrvt.eval.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.premigration.tft.nfrvt.resources.ARTISTResources;
import eu.artist.premigration.tft.nfrvt.resources.types.CloudProvider;
import eu.artist.premigration.tft.tft.edit.MigrationSuggestionEditingSupport;
import eu.artist.premigration.tft.tft.model.MigrationGoals;
import eu.artist.premigration.tft.tft.model.MigrationGoalsContainer;

//TODO: The tableTree widget of swt.custom library is deprecated and table population code is extremely unmaintainable.
//      Should be changed with JFace's TableTreeViewer

/**
 * Migration Goals View analyzes the MAT report and shows the migration goals in a tree structure
 * 
 * @author Burak Karaboga
 *
 */
public class MigrationGoalsView extends ViewPart {

	public static final String ID = "eu.artist.premigration.tft.tft.views.MigrationGoalsView";

	public static IFile gmlFile;
	private TreeViewer viewer;
	private Combo c1;
	
	private static final int[] COLUMN_WIDTH = { 220, 100, 80, 180, 180, 180 };
	private static final String[] COLUMN_TITLES = { "Migration Goal", "Kind", "Priority", "Condition", "Property", "Threshold"};

	/**
	 * Default Constructor
	 */
	public MigrationGoalsView() {
	}

	/**
	 * Creates the combo box for the Migration Target selection
	 * 
	 * @param parent Combobox parent
	 */
	//TODO: Combobox data is hard coded, should be provided from a more appropriate source
	private void createMigrationTargetComboBox (Composite parent) {
		//		Label comboLabel = new Label(parent, SWT.NONE);
		//		comboLabel.setText("Migration Target: ");

		c1 = new Combo(parent, SWT.READ_ONLY);
		c1.setBounds(50, 50, 150, 65);
		String items[] = { "Amazon EC2", "Windows Azure", "Google App Engine"};
		c1.setItems(items);
		c1.select(0);
		c1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (c1.getText().equals("Google App Engine")) {
					MigrationGoalsContainer.INSTANCE.getMigrationGoals().setTargetPlatform(CloudProvider.GOOGLE_APP_ENGINE);
				}
				else if (c1.getText().equals("Windows Azure")){
					MigrationGoalsContainer.INSTANCE.getMigrationGoals().setTargetPlatform(CloudProvider.MICROSOFT_AZURE);
				}
				else if (c1.getText().equals("Amazon EC2")){
					MigrationGoalsContainer.INSTANCE.getMigrationGoals().setTargetPlatform(CloudProvider.AMAZON_EC2);
				}

				InventoryView inventoryView = (InventoryView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(InventoryView.ID);
				MigrationEffortsView migrationEffortsView = (MigrationEffortsView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(MigrationEffortsView.ID);
				if (inventoryView != null) {
					inventoryView.reAssignMigrationStrategiesAndRefreshViewer();
				}
				if (migrationEffortsView != null) {
					migrationEffortsView.recalculateEffortsAndRefreshViewer();
				}
			}
		});
		c1.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
	}

	private MigrationGoals loadGoalModel(IFile goalModelFile){
		MigrationResourceSet set = ARTISTResources.createResourceSet();

		MigrationGoals migrationGoals = new MigrationGoals();

		GoalModel goalModel = set.loadGoalModel(URI.createURI(goalModelFile.getLocationURI().toString()));
		migrationGoals.setGoals(goalModel.getGoals());

		return migrationGoals;
	}

	@Override
	public void createPartControl(Composite parent) {

		if (gmlFile != null) {
			MigrationGoals mGoals = loadGoalModel(gmlFile);
			MigrationGoalsContainer.INSTANCE.setMigrationGoals(mGoals);

			GridLayout layout = new GridLayout(2, false);
			parent.setLayout(layout);
			Label comboLabel = new Label(parent, SWT.NONE);
			comboLabel.setText("Target Platform: ");
			createMigrationTargetComboBox(parent);

			createViewer(parent, mGoals);
			
			if (mGoals.getTargetPlatform().equals(CloudProvider.AMAZON_EC2)){
				c1.select(0);
				MigrationGoalsContainer.INSTANCE.getMigrationGoals().setTargetPlatform(CloudProvider.AMAZON_EC2);
			}
			else if (mGoals.getTargetPlatform().equals(CloudProvider.MICROSOFT_AZURE)){
				c1.select(1);
				MigrationGoalsContainer.INSTANCE.getMigrationGoals().setTargetPlatform(CloudProvider.MICROSOFT_AZURE);
			}
			else if (mGoals.getTargetPlatform().equals(CloudProvider.GOOGLE_APP_ENGINE)){
				c1.select(2);
				MigrationGoalsContainer.INSTANCE.getMigrationGoals().setTargetPlatform(CloudProvider.GOOGLE_APP_ENGINE);
			}
		}
		else {
//			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().hideView(this);
			GridLayout layout = new GridLayout(1, false);
			parent.setLayout(layout);
			
			GridData gridData = new GridData();
			gridData.verticalAlignment = GridData.CENTER;
			gridData.horizontalAlignment = GridData.CENTER;
			gridData.grabExcessHorizontalSpace = true;
			gridData.grabExcessVerticalSpace =  true;
			
			Label warningLabel = new Label(parent, SWT.NONE);
			warningLabel.setText("Migration Goals is not loaded yet!");
			warningLabel.setLayoutData(gridData);
		}
	}

	/**
	 * Creates the {@link TreeViewer} on which the components are shown
	 * 
	 * @param parent Parent composite which contains the tree viewer
	 */
	private void createViewer(Composite parent, final MigrationGoals mGoals) {

		// Define the TreeViewer

		Tree migrationGoalsTree = new Tree(parent, SWT.CHECK | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		migrationGoalsTree.setHeaderVisible(true);

		//Listener for item selection
		migrationGoalsTree.addListener (SWT.Selection, new Listener () {

			private void checkUncheckChildren(TreeItem parentItem, boolean checked) {
				TreeItem[] children = parentItem.getItems();
				for (TreeItem child : children) {
					child.setChecked(checked);
					mGoals.changeItemsCheckStatus(parentItem.getText(0), parentItem.getChecked());
					if (child.getItemCount() != 0) {
						checkUncheckChildren(child, checked);
					}
				}
			}
			//Handler for Check events
			public void handleEvent (Event event) {
				TreeItem parentItem = (TreeItem) event.item;
				boolean checked = parentItem.getChecked();
				//May also be a selection event
				if(event.detail == SWT.CHECK) {
					mGoals.changeItemsCheckStatus(parentItem.getText(0), parentItem.getChecked());
					checkUncheckChildren(parentItem, checked);
					InventoryView inventoryView = (InventoryView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(InventoryView.ID);
					MigrationEffortsView migrationEffortsView = (MigrationEffortsView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(MigrationEffortsView.ID);
					if (inventoryView != null) {
						inventoryView.reAssignMigrationStrategiesAndRefreshViewer();
					}
					if (migrationEffortsView != null) {
						migrationEffortsView.recalculateEffortsAndRefreshViewer();
					}
				}
			}
		});


		viewer = new TreeViewer(migrationGoalsTree);
		viewer.setContentProvider(new MigrationGoalDetailsContentProvider());
		
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;

		viewer.getControl().setLayoutData(gridData);

		// Create the columns
		createColumns(migrationGoalsTree);

		populateViewer();

		handleCheckedStatusOfComponents(migrationGoalsTree.getItems());
	}
	
	public static void handleCheckedStatusOfComponents(TreeItem[] migrationGoalsTreeItems){

		for (TreeItem treeItem : migrationGoalsTreeItems) {
			
			treeItem.setChecked(true);
			if (treeItem.getItemCount() != 0){
				handleCheckedStatusOfComponents(treeItem.getItems());
			}
		}
	}
	
	private void populateViewer(){
		
		viewer.setInput(MigrationGoalsContainer.INSTANCE.getMigrationGoals().getAllGoals());
		viewer.expandAll();
	}

	/**
	 * Creates the columns of the Tree
	 * 
	 * @param migrationGoalsTree The {@link Tree} for which the columns will be created
	 */
	private void createColumns(final Tree migrationGoalsTree) {

		migrationGoalsTree.setLinesVisible(true);

		//Goal name
		TreeViewerColumn column = createTreeViewerColumn(0);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof HardGoal)
					return ((Goal) element).getName();
				else if (element instanceof SoftGoal)
					return ((SoftGoal) element).getProperty().getProperty().getName();
				else if (element instanceof List){
					List<?> listElement = (List<?>) element;
					if (listElement.get(0) instanceof HardGoal){
						return "Hard Goals";
					}
					else {
						return "Soft Goals";
					}
				}
				else {
					return "";
				}
			}
		});

		//Goal Kind
		column = createTreeViewerColumn(1);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Goal)
					return ((Goal) element).getKind().getLiteral();
				else 
					return "";
			}
		});

		//Goal Priority
		column = createTreeViewerColumn(2);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Goal)
					return String.valueOf(((Goal) element).getPriority());
				else 
					return "";
			}
		});

		//Goal Condition
		column = createTreeViewerColumn(3);
		column.setEditingSupport(new MigrationSuggestionEditingSupport(viewer));
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof HardGoal) {
					HardGoal hardGoal = (HardGoal) element;
					return MigrationGoals.findHardGoalLiteral(hardGoal);
				}
				else {
					return "";
				}
			}
		});

		//Goal Property
		column = createTreeViewerColumn(4);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof SoftGoal) {
					SoftGoal softGoal = (SoftGoal) element;
					return softGoal.getProperty().getName();
				}
				else {
					return "";
				}
			}
		});

		//Goal Threshold
		column = createTreeViewerColumn(5);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof SoftGoal) {
					SoftGoal softGoal = (SoftGoal) element;
					BigDecimal threshold = softGoal.getThreshold().setScale(2, BigDecimal.ROUND_HALF_UP);
					return threshold.toString();
				}
				else {
					return "";
				}
			}
		});
	}

	/**
	 * Creates the TreeViewerColumn for the given index
	 * 
	 * @param columnIndex The index number of the column
	 * @return TreeViewerColumn
	 */
	private TreeViewerColumn createTreeViewerColumn(int columnIndex){
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(viewer, SWT.NONE);

		final TreeColumn column = viewerColumn.getColumn();
		column.setText(COLUMN_TITLES[columnIndex]);
		column.setWidth(COLUMN_WIDTH[columnIndex]);
		column.setResizable(true);
		column.setMoveable(true);

		return viewerColumn;
	}

	class MigrationGoalDetailsContentProvider implements ITreeContentProvider{

		public Object[] getChildren(Object parentElement){
			
			if (parentElement instanceof List)
				return ((List<?>) parentElement).toArray();

			return new Object[0];
		}

		public Object getParent(Object element){
			if (element instanceof HardGoal)
				return MigrationGoalsContainer.INSTANCE.getMigrationGoals().getHardGoals();
			else if (element instanceof SoftGoal)
				return MigrationGoalsContainer.INSTANCE.getMigrationGoals().getSoftGoals();
			return null;
		}

		public boolean hasChildren(Object element){

			if (element instanceof List){
				return true;
			}
			return false;

		}

		public Object[] getElements(Object goals){
			return getChildren(goals);
		}

		public void dispose(){
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput){
		}
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}

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

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import eu.artist.premigration.tft.tft.edit.MigrationSuggestionEditingSupport;
import eu.artist.premigration.tft.tft.effort.EffortCalculator;
import eu.artist.premigration.tft.tft.model.Component;
import eu.artist.premigration.tft.tft.model.migrationstrategy.Complexity;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategies;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategyContainer;
import eu.artist.premigration.tft.tft.model.query.ComponentModelQuery;
import eu.artist.premigration.tft.tft.report.ReportFormat;
import eu.artist.premigration.tft.tft.report.ReportGenerator;

/**
 * 
 * Inventory View analyzes the component model of the migration candidate, suggests migration strategies and calculates migration efforts for each component.
 * The results are shown in the Eclipse view; Inventory View
 * 
 * @author Burak Karaboga
 *
 */
public class InventoryView extends ViewPart {

	public static final String ID = "eu.artist.premigration.tft.tft.views.InventoryView";

	public static boolean automaticSuggestionUpdates = true;

	private static final int[] COLUMN_WIDTH = { 180, 180, 180, 180, 180, 180 };
	private static final String[] COLUMN_TITLES = { "Component Name", "Component Stereotypes", "Owned Classes", "Migration Strategy Suggestion", "Migration Complexity", "Estimated Migration Effort"};

	private TreeViewer viewer;
	private IResourceChangeListener resourceChangeListener;
	@SuppressWarnings("unused")
	private Component selectedComponent;

	/**
	 * Resource change listener for the model which is shown in Inventory View
	 */
	public final class ComponentModelResourceChangeListener implements IResourceChangeListener {

		@Override
		public void resourceChanged(IResourceChangeEvent event) {

			//we are only interested in POST_CHANGE events
			if (event.getType() != IResourceChangeEvent.POST_CHANGE)
				return;
			//get the delta
			IResourceDelta rootDelta = event.getDelta();
			IFile file = ComponentModelQuery.INSTANCE.getFile();
			//Check if the model has been loaded.
			if (file != null) {
				IResourceDelta docDelta = rootDelta.findMember(file.getFullPath());
				if (docDelta == null) {
					return;
				}
				else {
					IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
						public boolean visit(IResourceDelta delta) {
							if (delta.getKind() != IResourceDelta.CHANGED)
								return true;
							if ((delta.getFlags() & IResourceDelta.CONTENT) == 0)
								return true;
							IResource resource = delta.getResource();
							//only interested in files with the "uml" extension
							if (resource.getType() == IResource.FILE && "uml".equalsIgnoreCase(resource.getFileExtension())) {
								//Model is reloaded here inorder to reflect the changes to the view
								ComponentModelQuery.INSTANCE.updateModel();
							}
							return true;
						}
					};
					try {
						docDelta.accept(visitor);
					} catch (CoreException e) {
						//open error dialog with syncExec or print to plugin log file
					}
				}
			}
			//post this update to the table
			Display display = viewer.getControl().getDisplay();
			display.asyncExec(new Runnable() {
				public void run() {
					//make sure the table still exists
					if (viewer.getControl().isDisposed())
						return;
					//Viewer input is reset and refreshed
//					viewer.setInput(ComponentModelQuery.INSTANCE.analyzeAllComponents());
					populateViewer();
					viewer.getTree().update();
					viewer.refresh();
				}
			});
		}
	}

	public InventoryView() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		resourceChangeListener = new ComponentModelResourceChangeListener();
		//Registering of the resource change listener
		workspace.addResourceChangeListener(resourceChangeListener);
	}

	/**
	 * Initializes the MigrationStrategyContainer with the MigrationStrategies.xml resource 
	 */
	private void initializeMigrationStrategyContainer(){

		InputStream input;
		try {
			input = MigrationStrategy.class.getResourceAsStream("MigrationStrategies.xml");
			MigrationStrategies strategies = (MigrationStrategies) JAXBContext.newInstance(MigrationStrategies.class).createUnmarshaller().unmarshal(input);
			MigrationStrategyContainer.INSTANCE.setMigrationStrategies(strategies);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates the viewer and its SWT elements
	 */
	@Override
	public void createPartControl(Composite parent) {

		GridLayout layout = new GridLayout(1, false);
		parent.setLayout(layout);

		initializeMigrationStrategyContainer();
		createViewer(parent);

		Button checkBoxButton = new Button(parent, SWT.CHECK);
		checkBoxButton.setSelection(true);
		checkBoxButton.setText("Allow automatic suggestion updates upon strategy changes");

		checkBoxButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);

				automaticSuggestionUpdates = ((Button)e.getSource()).getSelection();
			}
		});

		Button reportButton = new Button(parent, SWT.PUSH);
		reportButton.setText("generateReport");
		reportButton.addSelectionListener(new SelectionAdapter() {
			@Override
			@SuppressWarnings("unchecked")
			public void widgetSelected(SelectionEvent e) {
				ReportGenerator.INSTANCE.setFormat(ReportFormat.CSV);
				ReportGenerator.INSTANCE.setComponents(flattenTreeInput((List<Component>)viewer.getInput()));
				ReportGenerator.INSTANCE.generate();
			}
		});
	}

	//TODO: Same method exists in MigrationSuggestionEditingSupport, a utility class for TFT may be needed
	/**
	 * Traverses all components in the tree input and adds them to a list separately, ignoring parent child relationships
	 * 
	 * @param treeInput A {@link List} of {@link Component}s which is the Inventory View's {@link TreeViewer} input
	 * @return Flattened list of components
	 */
	private List<Component> flattenTreeInput(List<Component> treeInput) {

		List<Component> flattenedTreeInput = new ArrayList<Component>();

		for(Component component : treeInput){
			if (component.getChildren() != null && component.getChildren().size() > 0) {
				flattenedTreeInput.addAll(flattenTreeInput(component.getChildren()));
			}
			flattenedTreeInput.add(component);
		}
		return flattenedTreeInput;
	}

	/**
	 * Creates the {@link TreeViewer} on which the components are shown
	 * 
	 * @param parent Parent composite which contains the tree viewer
	 */
	private void createViewer(Composite parent) {

		// Define the TreeViewer

		Tree componentTree = new Tree(parent, SWT.CHECK | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		componentTree.setHeaderVisible(true);

		//Listener for item selection
		componentTree.addListener (SWT.Selection, new Listener () {

			private void checkUncheckChildren(TreeItem parentItem, boolean checked) {
				TreeItem[] children = parentItem.getItems();
				for (TreeItem child : children) {
					child.setChecked(checked);
					Component childComponent = ((Component) child.getData());
					childComponent.setSelection(checked);
					if (child.getItemCount() != 0) {
						checkUncheckChildren(child, checked);
					}
				}
			}
			//Handler for Check events
			public void handleEvent (Event event) {
				TreeItem parentItem = (TreeItem) event.item;
				boolean checked = parentItem.getChecked();
				((Component) parentItem.getData()).setSelection(checked);
				//May also be a selection event
				if(event.detail == SWT.CHECK) {
					checkUncheckChildren(parentItem, checked);
				}
			}
		});


		viewer = new TreeViewer(componentTree);
		viewer.setContentProvider(new ComponentDetailsContentProvider());

		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 1;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		viewer.getControl().setLayoutData(gridData);

		// Create the columns
		createColumns(componentTree);

		populateViewer();
	}
	
	private void populateViewer(){
		List<Component> componentList = ComponentModelQuery.INSTANCE.analyzeAllComponents();
		List<Component> componentListTree = new ArrayList<Component>();

		//Only add top level components to the tree
		//Children are handled by the content provider
		for (Component component : componentList) {
			if (component.getParent() == null){
				componentListTree.add(component);
			}
		}
		viewer.setInput(componentListTree);

		//		for (TreeItem item : viewer.getTree().getItems()){
		//			Component component = (Component) item.getData();
		//			if (component.getMigrationStrategies().size()  > 0){
		//				item.setChecked(true);
		//			}
		//		}

		viewer.expandAll();
	}

	/**
	 * Creates the columns of the Tree
	 * 
	 * @param componentTree The {@link Tree} for which the columns will be created
	 */
	private void createColumns(final Tree componentTree) {

		componentTree.setLinesVisible(true);

		//Component name
		TreeViewerColumn column = createTreeViewerColumn(0);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((Component) element).getName();
			}
		});

		column = createTreeViewerColumn(1);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Component component = ((Component) element);
				if (component.getChildren().size() > 0){
					return "";
				}
				StringBuffer text = new StringBuffer("");
				List<String> stereotypes= component.getStereotypes();
				for (int i = 0; i < stereotypes.size(); i++) {
					text.append(i != 0 ? " ," : "").append(stereotypes.get(i));
				}
				return text.length() > 0 ? text.toString() : "No Stereotypes";
			}
		});

		column = createTreeViewerColumn(2);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Component component = ((Component) element);
				if (component.getChildren().size() > 0){
					return "";
				}
				return component.getOwnedClasses().toString();
			}
		});

		column = createTreeViewerColumn(3);
		column.setEditingSupport(new MigrationSuggestionEditingSupport(viewer));
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Component component = ((Component) element);
				if (component.getChildren().size() > 0){
					return "";
				}
				StringBuffer text = new StringBuffer("");
				List<MigrationStrategy> strategies = component.getMigrationStrategies();
				for (int i = 0; i < strategies.size(); i++) {
					text.append(i != 0 ? " ," : "").append(strategies.get(i).getText());
				}
				return text.length() > 0 ? text.toString() : "No Suggestion";
			}
		});

		column = createTreeViewerColumn(4);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				Complexity highestComplexity = Complexity.UNKNOWN;

				Component component = ((Component) element);
				if (component.getChildren().size()>0){
					return "";
				}
				else {
					for (MigrationStrategy strategy : component.getMigrationStrategies()){
						if (strategy.getComplexity().getDegree() > highestComplexity.getDegree()){
							highestComplexity = strategy.getComplexity();
						}
					}
				}
				return String.valueOf(highestComplexity);
			}
		});

		column = createTreeViewerColumn(5);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Component component = ((Component) element);
				if (component.getChildren().size()>0){
					return "";
				}
				return component.getMigrationStrategies().size() > 0 ? String.valueOf(EffortCalculator.INSTANCE.calculateEffortForComponent(component)) : "";
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

	/**
	 * Content provider for the Tree
	 *
	 */
	class ComponentDetailsContentProvider implements ITreeContentProvider{

		public Object[] getChildren(Object parentElement){


			if (parentElement instanceof List)
				return ((List<?>) parentElement).toArray();
			if (parentElement instanceof Component){
				Component component = (Component) parentElement;
				if (component.getChildren().size() > 0) {
					return component.getChildren().toArray();
				}
			}

			return new Object[0];
		}

		public Object getParent(Object element){
			if (element instanceof Component)
				return ((Component) element).getParent();
			return null;
		}

		public boolean hasChildren(Object element){

			if (element instanceof Component){
				return ((Component) element).getChildren().size() > 0;
			}
			return false;

		}

		public Object[] getElements(Object components){
			return getChildren(components);
		}

		public void dispose(){
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput){
		}
	}

	public TreeViewer getViewer() {
		return viewer;
	}

	@Override
	public void setFocus() {
	}

	/**
	 * Reanalyzes the components on the viewer and refreshes it
	 */
	public void reAnalyzeComponentsAndRefreshViewer(){
		populateViewer();
		viewer.getTree().update();
		viewer.refresh();
	}

	@Override
	public void dispose() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		//Un-registering the resource change listener
		workspace.removeResourceChangeListener(resourceChangeListener);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().hideView(this);
		super.dispose();
	}
}

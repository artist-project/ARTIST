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
package eu.artist.premigration.tft.tft.dialog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import eu.artist.premigration.tft.tft.model.Component;
import eu.artist.premigration.tft.tft.model.MigrationGoalsContainer;
import eu.artist.premigration.tft.tft.model.migrationstrategy.Category;
import eu.artist.premigration.tft.tft.model.migrationstrategy.Complexity;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategyContainer;

/**
 * A custom dialog providing the user an interface to modify the migration strategies assigned to a certain component
 * 
 * @author Burak Karaboga
 *
 */
public class MigrationStrategySelectionDialog extends Dialog{

	private Component selectedComponent;
	private List<MigrationStrategy> newStrategies;
	Map<Category, MigrationStrategy> previousStrategies;

	private boolean okPressed = false;

	private StatefulKnowledgeSession ksession;
	private KnowledgeBase kbase;
	private static final String RULE_PATH = "eu/artist/premigration/tft/tft/rules/GetStrategiesForTargetPlatform.drl";

	private TreeViewer availableStrategiesTree;
	private TreeViewer selectedStrategiesTree;

	/**
	 * Constructor for the Migration Strategy Selection Dialog
	 * <br>
	 * @param parentShell Parent of the dialog
	 * @param selectedComponent The component for which the migration strategy selection will be made.
	 */
	public MigrationStrategySelectionDialog (Shell parentShell, Component selectedComponent) {
		super(parentShell);
		this.selectedComponent = selectedComponent;
		//Old selections are stored in previousSelections in case user clicks on cancel or closes the dialog by clicking x.
		//CAUTION:	The field previousStrategies is populated with the references to the selected component's migration strategies!
		//			Take caution if modification of migration strategy field values  is necessary.

		previousStrategies = new HashMap<Category, MigrationStrategy>();
		for (MigrationStrategy strategy : selectedComponent.getMigrationStrategies()) {
			previousStrategies.put(strategy.getCategory(), strategy);
		}

		newStrategies = selectedComponent.getMigrationStrategies();
				
		//Drools initialization
		try {
			// load up the knowledge base
			kbase = readKnowledgeBase();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	/**
	 * Creates the dialog area 
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout(3, false);
		container.setLayout(layout);


		Label infoLabel = new Label(container, SWT.NONE);
		infoLabel.setText("Add migration strategies to this component from the leftmost panel or remove already suggested/selected strategies from the");
		infoLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		
		Label infoLabel2 = new Label(container, SWT.NONE);
		infoLabel2.setText("rightmost panel.");
		infoLabel2.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		
		Label emptyLabel = new Label(container, SWT.NONE);
		emptyLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		
		
		//Collect suggested strategy ids
		List<String> suggestedStrategIDs = new ArrayList<String>();
		for (MigrationStrategy strategy : selectedComponent.getMigrationStrategies()) {
			suggestedStrategIDs.add(strategy.getId());
		}
		
		
		
//		infoLabel.setLocation(20, 20);
//		infoLabel.pack();
//		infoLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));

		//Create labels
		Label leftLabel = new Label(container, SWT.NONE);
		leftLabel.setText("Available Migration Strategies");
		leftLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));

		Label rightLabel = new Label(container, SWT.NONE);
		rightLabel.setText("Selected Migration Strategies");
		rightLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		//Creation of the tree viewer for available strategies
		createTreeViewerForAvailableStrategies(container);

		//Creation of Add button
		Composite buttonGroup = new Composite(container, SWT.NONE);
		buttonGroup.setLayout(new GridLayout(1, false));

		final Button addButton = new Button(buttonGroup, SWT.PUSH);
		addButton.setEnabled(false);
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		addButton.setText("Add");

		//Selection changed listener for Available Strategies Tree
		availableStrategiesTree.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection)event.getSelection();
				if (!selection.isEmpty() && selection.getFirstElement() instanceof ChildStrategy){
					ChildStrategy selectedStrategy = (ChildStrategy) selection.getFirstElement();
					//Removing the selection on Selected Strategies Tree
					selectedStrategiesTree.setSelection(StructuredSelection.EMPTY);
					//Selecting the parent category of the selected strategy on the Selected Strategies Tree to know where to add the strategy
					for (TreeItem item : selectedStrategiesTree.getTree().getItems()){
						ParentCategory parent = (ParentCategory) item.getData();
						if(parent.getCategory().equals(selectedStrategy.getParent().getCategory())){
							selectedStrategiesTree.setSelection(new StructuredSelection(parent));
						}
					}
					//Add button is enabled
					addButton.setEnabled(true);
				}
				else {
					//If there is no selection or the selected item is not a strategy (may be a category) the add button is disabled.
					addButton.setEnabled(false);
				}
			}
		});

		//Creation of the remove button
		final Button removeButton = new Button(buttonGroup, SWT.PUSH);
		removeButton.setEnabled(false);
		removeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		removeButton.setText("Remove");

		//Creation of the tree viewer for selected strategies
		createTreeViewerForSelectedStrategies(container);

		//Selection changed listener for Selected Strategies Tree
		selectedStrategiesTree.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection)event.getSelection();
				if (!selection.isEmpty() && selection.getFirstElement() instanceof ChildStrategy){

					ChildStrategy selectedStrategy = (ChildStrategy) selection.getFirstElement();	
					//Removing the selection on Available Strategies Tree
					availableStrategiesTree.setSelection(StructuredSelection.EMPTY);
					//Selecting the parent category of the selected strategy on the Available Strategies Tree to know where to move the removed strategy
					for (TreeItem item : availableStrategiesTree.getTree().getItems()){
						ParentCategory parent = (ParentCategory) item.getData();
						if(parent.getCategory().equals(selectedStrategy.getParent().getCategory())){
							availableStrategiesTree.setSelection(new StructuredSelection(parent));
						}
					}
					//Remove button is enabled
					removeButton.setEnabled(true);
				}
				else {
					//If there is no selection or the selected item is not a strategy (may be a category) the remove button is disabled.
					removeButton.setEnabled(false);
				}
			}
		});

		//Registering the selection listeners
		addButton.addSelectionListener(new SelectionAdapterForTreeModification(availableStrategiesTree, selectedStrategiesTree, false));
		removeButton.addSelectionListener(new SelectionAdapterForTreeModification(selectedStrategiesTree, availableStrategiesTree, true));

		return container;
	}
	
	/**
	 * Selection adapter class for add and remove buttons
	 *
	 */
	private class SelectionAdapterForTreeModification extends SelectionAdapter{
		
		private TreeViewer treeToBeRemovedFrom;
		private TreeViewer treeToBeAddedTo;
		private boolean removeStrategy;
		
		//Constructor
		public SelectionAdapterForTreeModification(TreeViewer treeToBeRemovedFrom, TreeViewer treeToBeAddedTo, boolean removeStrategy) {
			this.treeToBeRemovedFrom = treeToBeRemovedFrom;
			this.treeToBeAddedTo = treeToBeAddedTo;
			this.removeStrategy = removeStrategy;
		}
		
		@Override
		public void widgetSelected(SelectionEvent e) {
			
			//User's selection
			IStructuredSelection selection = (IStructuredSelection) treeToBeRemovedFrom.getSelection();

			//Removing the selection from the tree
			ChildStrategy strategyToBeMoved = (ChildStrategy) selection.getFirstElement();
			strategyToBeMoved.getParent().getChildStrategies().remove(strategyToBeMoved);

			//Creating the parent if there is no associated category on the tree where the selection will be moved to
			ParentCategory newParent = (ParentCategory) ((TreeSelection) treeToBeAddedTo.getSelection()).getFirstElement();
			if (newParent == null){
				newParent = new ParentCategory();
				newParent.setCategory(strategyToBeMoved.getStrategy().getCategory());
				newParent.setChildStrategies(new ArrayList<ChildStrategy>());
				@SuppressWarnings("unchecked")
				List<ParentCategory> treeElements = (List<ParentCategory>) treeToBeAddedTo.getInput();
				treeElements.add(newParent);
			}
			strategyToBeMoved.setParent(newParent);
			newParent.getChildStrategies().add(strategyToBeMoved);

			//Refreshing the viewers
			treeToBeRemovedFrom.refresh();
			treeToBeAddedTo.refresh();
			treeToBeAddedTo.expandAll();
			
			//Refreshing the list of new strategies
			if (removeStrategy) {
				for(MigrationStrategy strategy : newStrategies){
					if (strategy.getId().equals(strategyToBeMoved.getStrategy().getId())){
						newStrategies.remove(strategy);
					}
				}
			}
			else {
				MigrationStrategy newStrategy = MigrationStrategyContainer.INSTANCE.getMigrationStrategy(strategyToBeMoved.getStrategy().getId());
				newStrategy.setComplexity(Complexity.AVERAGE); //Temporary. See TODO #1 in StrategySuggestionUpdate.drl for more info.
				newStrategies.add(newStrategy);
			}
		}
	}

	//Overridden to set dialog title
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Migration Strategy Selection");
	}

	@Override
	protected Point getInitialSize() {
		return new Point(700, 500);
	}

	/**
	 * Creates the {@link TreeViewer} for the available strategies tree
	 * 
	 * @param parent Parent {@link Composite} of available strategies tree viewer
	 */
	private void createTreeViewerForAvailableStrategies (Composite parent){
		availableStrategiesTree = new TreeViewer(new Tree(parent, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION));
		availableStrategiesTree.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		availableStrategiesTree.setContentProvider(new MigrationStrategyTreeContentProvider());
		availableStrategiesTree.setLabelProvider(new LabelProvider() {

			public String getText(Object element) {
				if (element instanceof ParentCategory) {
					return ((ParentCategory) element).getCategory().toString();
				}
				else if (element instanceof ChildStrategy) {
					return ((ChildStrategy) element).getStrategy().getText();
				}
				return "";

				//This approach over-complicates the whole process. Commented out to be considered in the future 
				//return strategy.getText() + (strategy.isSuggested()? " (Suggested)" : "");
			}
		});

		Map<Category, List<MigrationStrategy>> strategiesByCategory = new HashMap<Category, List<MigrationStrategy>>();

		//Collect the suggested strategies' IDs to be inserted into the knowledge session
		List<String> suggestedStrategyIDs = new ArrayList<String>();
		for (MigrationStrategy strategy : selectedComponent.getMigrationStrategies()) {
			suggestedStrategyIDs.add(strategy.getId());
		}
		
		//Setting globals and inserting objects to the rule engine
		ksession = kbase.newStatefulKnowledgeSession();
		ksession.setGlobal("suggestedStrategyIDs", suggestedStrategyIDs);
		ksession.setGlobal("strategiesByCategory", strategiesByCategory);
		
		ksession.insert(selectedComponent);
		ksession.insert(MigrationGoalsContainer.INSTANCE.getMigrationGoals());
		
		//Firing all the rules to collect the available strategies for this component
		ksession.fireAllRules();

		List<ParentCategory> treeInput = new ArrayList<ParentCategory>();

		//Available strategies are set according to the rule results, under their parent categories
		for(Category category : strategiesByCategory.keySet()){

			ParentCategory parentCategory = new ParentCategory();
			parentCategory.setCategory(category);
			parentCategory.setChildStrategies(new ArrayList<ChildStrategy>());

			for(MigrationStrategy strategy : strategiesByCategory.get(category)){
				ChildStrategy childStrategy = new ChildStrategy(strategy, parentCategory);
				parentCategory.getChildStrategies().add(childStrategy);
			}

			treeInput.add(parentCategory);
		}

		availableStrategiesTree.setInput(treeInput);
		availableStrategiesTree.expandAll();
	}

	/**
	 * Creates the {@link TreeViewer} for the selected strategies tree
	 * 
	 * @param parent Parent {@link Composite} of selected strategies tree viewer
	 */
	private void createTreeViewerForSelectedStrategies (Composite parent){
		selectedStrategiesTree = new TreeViewer(new Tree(parent, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION));
		selectedStrategiesTree.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		selectedStrategiesTree.setContentProvider(new MigrationStrategyTreeContentProvider());
		selectedStrategiesTree.setLabelProvider(new LabelProvider() {

			public String getText(Object element) {
				if (element instanceof ParentCategory) {
					return ((ParentCategory) element).getCategory().toString();
				}
				else if (element instanceof ChildStrategy) {
					return ((ChildStrategy) element).getStrategy().getText();
				}
				return "";

				//This approach over-complicates the whole process. Commented out to be considered in the future 
				//return strategy.getText() + (strategy.isSuggested()? " (Suggested)" : "");
			}
		});

		Map<Category, List<MigrationStrategy>> strategiesByCategory = new HashMap<Category, List<MigrationStrategy>>();

		//All assigned strategies of the component are categorized by Strategy category 
		for (MigrationStrategy strategy : selectedComponent.getMigrationStrategies()){

			if (strategiesByCategory.get(strategy.getCategory()) != null) {
				strategiesByCategory.get(strategy.getCategory()).add(strategy);
			}
			else {
				List<MigrationStrategy> strategyList = new ArrayList<MigrationStrategy>();
				strategyList.add(strategy);
				strategiesByCategory.put(strategy.getCategory(), strategyList);
			}
		}

		List<ParentCategory> treeInput = new ArrayList<ParentCategory>();

		//Using the categorized strategy map, the selected strategies tree is initialized.
		for(Category category : strategiesByCategory.keySet()){

			ParentCategory parentCategory = new ParentCategory();
			parentCategory.setCategory(category);
			parentCategory.setChildStrategies(new ArrayList<ChildStrategy>());

			for(MigrationStrategy strategy : strategiesByCategory.get(category)){
				ChildStrategy childStrategy = new ChildStrategy(strategy, parentCategory);
				parentCategory.getChildStrategies().add(childStrategy);
			}

			treeInput.add(parentCategory);
		}

		selectedStrategiesTree.setInput(treeInput);
		selectedStrategiesTree.expandAll();
	}

	@Override
	protected void okPressed() {
		okPressed = true;
		//if category strategy changed insert and fire
		super.okPressed();
	}

	@Override
	public boolean close() {
		if (!okPressed){
			selectedComponent.setMigrationStrategies(new ArrayList<MigrationStrategy>(previousStrategies.values()));
		}
		return super.close();
	}

	/**
	 * Initialization of Drools knowledge base
	 * @return {@link KnowledgeBase} for the rule engine.
	 * @throws IllegalArgumentException
	 */
	private KnowledgeBase readKnowledgeBase() throws IllegalArgumentException {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource(RULE_PATH), ResourceType.DRL);
		KnowledgeBuilderErrors errors = kbuilder.getErrors();
		if (errors.size() > 0) {
			for (KnowledgeBuilderError error: errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Could not parse knowledge.");
		}
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		return kbase;
	}

	/**
	 * Content Provider for tree viewers
	 *
	 */
	class MigrationStrategyTreeContentProvider implements ITreeContentProvider{

		public Object[] getChildren(Object parentElement){


			if (parentElement instanceof List)
				return ((List<?>) parentElement).toArray();
			if (parentElement instanceof ParentCategory){
				ParentCategory parentCategory = (ParentCategory) parentElement;
				if (parentCategory.getChildStrategies().size() > 0) {
					return parentCategory.getChildStrategies().toArray();
				}
			}

			return new Object[0];
		}

		public Object getParent(Object element){
			if (element instanceof ChildStrategy)
				return ((ChildStrategy) element).getParent();
			return null;
		}

		public boolean hasChildren(Object element){

			if (element instanceof ParentCategory){
				return ((ParentCategory) element).getChildStrategies().size() > 0;
			}
			return false;

		}

		public Object[] getElements(Object categories){
			return getChildren(categories);
		}

		public void dispose(){
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput){
		}
	}

	/**
	 * ParentCategory private class, implemented to simulate parent child relationship between categories and strategies
	 * to have a tree visualization.
	 */
	private class ParentCategory {
		private Category category;
		private List<ChildStrategy> childStrategies;
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		public List<ChildStrategy> getChildStrategies() {
			return childStrategies;
		}
		public void setChildStrategies(List<ChildStrategy> childStrategies) {
			this.childStrategies = childStrategies;
		}
	}

	/**
	 * ChildStrategy private class, implemented to simulate parent child relationship between categories and strategies to have a tree visualization.
	 *
	 */
	private class ChildStrategy {

		private MigrationStrategy strategy;
		private ParentCategory parent;

		public ChildStrategy(MigrationStrategy strategy, ParentCategory parent){
			this.strategy = strategy;
			this.parent = parent;
		}

		public MigrationStrategy getStrategy() {
			return strategy;
		}
		@SuppressWarnings("unused")
		public void setStrategy(MigrationStrategy strategy) {
			this.strategy = strategy;
		}
		public ParentCategory getParent() {
			return parent;
		}
		public void setParent(ParentCategory parent) {
			this.parent = parent;
		}
	}
}

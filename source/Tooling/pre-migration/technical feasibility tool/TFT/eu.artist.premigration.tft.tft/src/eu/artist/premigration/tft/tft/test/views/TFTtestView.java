/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.test.views;

import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.part.ViewPart;

import eu.artist.premigration.tft.tft.model.migrationstrategy.Category;

public class TFTtestView extends ViewPart {

	public static final String ID	    = "eu.artist.premigration.tft.tft.test.views.TFTtestView";
	
	private TreeViewer leftTree;
	private TreeViewer rightTree;


	public void createPartControl(Composite parent){

		GridLayout layout = new GridLayout(3, false);
		parent.setLayout(layout);


		Label leftLabel = new Label(parent, SWT.NONE);
		leftLabel.setText("Available Migration Strategies");
		leftLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));

		Label rightLabel = new Label(parent, SWT.NONE);
		rightLabel.setText("Selected Migration Strategies");
		rightLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		Composite buttonGroup = new Composite(parent, SWT.NONE);
		buttonGroup.setLayout(new GridLayout(1, false));
		
		createLeftTree(parent);

		final Button addButton = new Button(buttonGroup, SWT.PUSH);
		addButton.setEnabled(false);
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		addButton.setText("Add");

		leftTree.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection)event.getSelection();
				if (!selection.isEmpty() && selection.getFirstElement() instanceof ChildStrategy){
					
					ChildStrategy selectedStrategy = (ChildStrategy) selection.getFirstElement();
					addButton.setEnabled(true);
					
					for (TreeItem item : rightTree.getTree().getItems()){
						ParentCategory parent = (ParentCategory) item.getData();
						if(parent.getCategory().equals(selectedStrategy.getParent().getCategory())){
							rightTree.setSelection(new StructuredSelection(parent));
						}
					}
				}
				else {
					addButton.setEnabled(false);
				}
			}
		});

		final Button removeButton = new Button(buttonGroup, SWT.PUSH);
		removeButton.setEnabled(false);
		removeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		removeButton.setText("Remove");

		createRightTree(parent);

		rightTree.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection)event.getSelection();
				if (!selection.isEmpty() && selection.getFirstElement() instanceof ChildStrategy){
					removeButton.setEnabled(true);
					leftTree.setSelection(StructuredSelection.EMPTY);
				}
				else {
					removeButton.setEnabled(false);
				}
			}
		});


		addButton.addSelectionListener(new SelectionAdapter() {
			@SuppressWarnings("unchecked")
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) leftTree.getSelection();
				
				ChildStrategy strategyToBeAdded = (ChildStrategy) selection.getFirstElement();
				
				ParentCategory newParent = (ParentCategory) ((TreeSelection) rightTree.getSelection()).getFirstElement();
				strategyToBeAdded.getParent().getChildStrategies().remove(strategyToBeAdded);
				strategyToBeAdded.setParent(newParent);
				newParent.getChildStrategies().add(strategyToBeAdded);
				

				
//				for (ChildStrategy strategy : (List<ChildStrategy>) selection.toList()){
//					rightTree.getTree().getItems()[0].getData();
//					List<ParentCategory> treeItems = (List<ParentCategory>)rightTree.getInput();
//					for (ParentCategory parent : treeItems){
//						if(parent.getCategory().equals(strategy.getParent().getCategory())){
//							strategy.setParent(parent);
//							parent.getChildStrategies().add(strategy);
//
//							//							leftTree.remove(strategy);
//						}
//					}
//				}
//				TreeSelection treeSelection = (TreeSelection) rightTree.getSelection();
//				ParentCategory parent = (ParentCategory) treeSelection.getFirstElement();
//				ChildStrategy strategy = new ChildStrategy("deneme", null);
//				rightTree.add(treeSelection.getPaths()[0], strategy);
				rightTree.refresh();
				leftTree.refresh();
				//availableStrategiesTree.remove(selection.toArray());
				//availableStrategiesTree.refresh();
				//				
				//				//Modify and refresh input model
				//				selectedComponent.getMigrationStrategies().addAll((List<MigrationStrategy>)selection.toList());
				//				selectedStrategiesList.refresh();
				//				
				//				availableStrategiesList.remove(selection.toArray());
			}
		});

		removeButton.addSelectionListener(new SelectionAdapter() {
			@SuppressWarnings("unchecked")
			@Override
			public void widgetSelected(SelectionEvent e) {
//				IStructuredSelection selection = (IStructuredSelection) selectedStrategiesList.getSelection();
//				availableStrategiesList.add(selection.toArray());
//
//				//Modify and refresh input model
//				selectedComponent.getMigrationStrategies().removeAll((List<MigrationStrategy>)selection.toList());
//				selectedStrategiesTree.refresh();
			}
		});
	}

	private void createLeftTree(Composite parent){
		leftTree = new TreeViewer(new Tree(parent, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION));
		leftTree.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		leftTree.setContentProvider(new MigrationStrategyTreeContentProvider());
		leftTree.setLabelProvider(new LabelProvider() {

			public String getText(Object element) {
				if (element instanceof ParentCategory) {
					return ((ParentCategory) element).getCategory().toString();
				}
				else if (element instanceof ChildStrategy) {
					return ((ChildStrategy) element).getStrategy();
				}
				return "";

				//This approach over-complicates the whole process. Commented out to be considered in the future 
				//return strategy.getText() + (strategy.isSuggested()? " (Suggested)" : "");
			}
		});

		ParentCategory cat1 = new ParentCategory();
		cat1.setCategory(Category.DATA);
		ChildStrategy str1 = new ChildStrategy("STR1", cat1);
		ChildStrategy str2 = new ChildStrategy("STR2", cat1);
		List<ChildStrategy> list1 = new ArrayList<ChildStrategy>();
		list1.add(str1);
		list1.add(str2);
		cat1.setChildStrategies(list1);
		
		ParentCategory cat2 = new ParentCategory();
		cat2.setCategory(Category.QUEUE);
		ChildStrategy str3 = new ChildStrategy("STR1", cat2);
		ChildStrategy str4 = new ChildStrategy("STR2", cat2);
		List<ChildStrategy> list2 = new ArrayList<ChildStrategy>();
		list2.add(str3);
		list2.add(str4);
		cat2.setChildStrategies(list2);

		List<ParentCategory> treeInput = new ArrayList<ParentCategory>();
		treeInput.add(cat1);
		treeInput.add(cat2);

		//availableStrategiesTree.setInput(availableStrategies);
		leftTree.setInput(treeInput);
		leftTree.expandAll();
	}
	
	private void createRightTree(Composite parent){
		rightTree = new TreeViewer(new Tree(parent, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION));
		rightTree.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		rightTree.setContentProvider(new MigrationStrategyTreeContentProvider());
		rightTree.setLabelProvider(new LabelProvider() {

			public String getText(Object element) {
				if (element instanceof ParentCategory) {
					return ((ParentCategory) element).getCategory().toString();
				}
				else if (element instanceof ChildStrategy) {
					return ((ChildStrategy) element).getStrategy();
				}
				return "";

				//This approach over-complicates the whole process. Commented out to be considered in the future 
				//return strategy.getText() + (strategy.isSuggested()? " (Suggested)" : "");
			}
		});

		ParentCategory cat1 = new ParentCategory();
		cat1.setCategory(Category.DATA);
		ChildStrategy str5 = new ChildStrategy("STR5", cat1);
		List<ChildStrategy> list1 = new ArrayList<ChildStrategy>();
		list1.add(str5);
		cat1.setChildStrategies(list1);
		
		ParentCategory cat2 = new ParentCategory();
		cat2.setCategory(Category.QUEUE);
		ChildStrategy str6 = new ChildStrategy("STR6", cat2);
		List<ChildStrategy> list2 = new ArrayList<ChildStrategy>();
		cat2.setChildStrategies(list2);

		List<ParentCategory> treeInput = new ArrayList<ParentCategory>();
		treeInput.add(cat1);
		treeInput.add(cat2);

		//availableStrategiesTree.setInput(availableStrategies);
		rightTree.setInput(treeInput);
		rightTree.expandAll();
	}

	public void setFocus(){
	}

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

	private class ChildStrategy {

		private String strategy;
		private ParentCategory parent;

		public ChildStrategy(String strategy, ParentCategory parent){
			this.strategy = strategy;
			this.parent = parent;
		}

		public String getStrategy() {
			return strategy;
		}
		public void setStrategy(String strategy) {
			this.strategy = strategy;
		}
		public ParentCategory getParent() {
			return parent;
		}
		public void setParent(ParentCategory parent) {
			this.parent = parent;
		}
	}
	
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
}
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
package eu.artist.premigration.tft.tft.edit;

import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import eu.artist.premigration.tft.tft.dialog.MigrationStrategySelectionDialog;
import eu.artist.premigration.tft.tft.model.Component;
import eu.artist.premigration.tft.tft.views.InventoryView;

/**
 * Editing support for the Inventory View's tree viewer
 * 
 * @author Burak Karaboga
 *
 */
public class MigrationSuggestionEditingSupport extends EditingSupport {

	private DialogCellEditor cellEditor;

	private static final String RULE_PATH = "eu/artist/premigration/tft/tft/rules/StrategySuggestionUpdate.drl";
	private StatefulKnowledgeSession ksession;
	private KnowledgeBase kbase;

	/**
	 * Editing support for the Inventory View tree viewer
	 * 
	 * @param viewer {@link TreeViewer} to be refreshed once the editing is done. 
	 */
	public MigrationSuggestionEditingSupport(final TreeViewer viewer) {

		super(viewer);

		cellEditor = new DialogCellEditor((Composite) getViewer().getControl()) {

			//This method contains the code to open the Migration Strategy Selection Dialog
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {

				//Get selected compoent
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				Component selectedComponent = ((Component) selection.getFirstElement());

				//Create the dialog and open
				MigrationStrategySelectionDialog dialog = new MigrationStrategySelectionDialog(cellEditorWindow.getShell(), selectedComponent);
				dialog.open();
				//If the dialog is closed by clicking ok
				if (dialog.getReturnCode() == Dialog.OK){

					@SuppressWarnings("unchecked")
					List<Component> treeInput = (List<Component>) viewer.getInput();

					//If automatic suggestion updates checkbox is checked, the migration suggestions of other components are updated 
					if (InventoryView.automaticSuggestionUpdates){
						updateSuggestions(selectedComponent, treeInput);
					}

					viewer.getTree().update();
					viewer.refresh();
				}
				return null;
			}
		};

		//Drools initialization
		try {
			// load up the knowledge base
			kbase = readKnowledgeBase();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	
	/**
	 * Initialization of rule engine knowledge base 
	 * @return An instance of {@link KnowledgeBase}
	 * @throws Exception
	 */
	private static KnowledgeBase readKnowledgeBase() throws Exception {
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
	 * Updates the suggestions of components
	 * 
	 * @param viewer 
	 * @param updatedComponent
	 * @param treeInput
	 */
	private void updateSuggestions(Component updatedComponent, List<Component> treeInput){
		//The inventory view input contains all the components in a parent child relationship
		//In order to feed all the components to the rule engine we need all the components separately as a list
		//Therefore the input is flattened
		List<Component> allComponents = flattenTreeInput(treeInput);
		//Recently updated component (user modification of strategies) is removed to make sure the user selections persist
		allComponents.remove(updatedComponent);
		
		//Firing the rules
		ksession = kbase.newStatefulKnowledgeSession();
		ksession.setGlobal("updatedComponent", updatedComponent);
		for(Component component : allComponents){
			ksession.insert(component);
		}
		
		ksession.fireAllRules();
		
		

	}

	/**
	 * Traverses all components in the tree input and adds them to a list separately, ignoring parent child relationships
	 * 
	 * @param treeInput A {@link List} of {@link Component}s to be flattened.
	 * @return Flattened list of components.
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

	@Override
	protected CellEditor getCellEditor(Object element) {
		return cellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		Component selectedComponent = (Component) element;
		if (selectedComponent.getChildren().size() > 0)
			return false;
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		//Component component = (Component) element;
		return " Edit Migration Strategies";
	}

	@Override
	protected void setValue(Object element, Object value) {
		// TODO Auto-generated method stub
	}
}

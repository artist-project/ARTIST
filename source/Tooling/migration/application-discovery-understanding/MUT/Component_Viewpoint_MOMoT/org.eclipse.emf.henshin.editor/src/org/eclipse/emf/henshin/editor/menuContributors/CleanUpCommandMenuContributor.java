package org.eclipse.emf.henshin.editor.menuContributors;

import java.util.List;

import org.eclipse.emf.henshin.editor.commands.CleanUpCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.jface.action.IMenuManager;

/**
 * 
 * @author Christian Krause
 */
public class CleanUpCommandMenuContributor extends MenuContributor {
	
	public static MenuContributor INSTANCE = new CleanUpCommandMenuContributor();
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.editor.commands.MenuContributor#contributeActions(org.eclipse.jface.action.IMenuManager, java.util.List)
	 */
	@Override
	protected void contributeActions(IMenuManager menuManager, List<?> selection) {
		
		if (selection.isEmpty()) return;
		
		CleanUpCommand cmd = new CleanUpCommand();
		cmd.setElements(selection);
		menuManager.add(createAction(getLabel("CleanUp"), cmd));
		
	}
}

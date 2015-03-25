package org.eclipse.emf.henshin.editor.menuContributors;

import java.util.List;

import org.eclipse.emf.henshin.editor.commands.CompleteMultiRulesCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.jface.action.IMenuManager;

public class CompleteMultiRulesCommandMenuContributor extends MenuContributor {
	
	public static MenuContributor INSTANCE = new CompleteMultiRulesCommandMenuContributor();
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.editor.commands.MenuContributor#contributeActions(org.eclipse.jface.action.IMenuManager, java.util.List)
	 */
	@Override
	protected void contributeActions(IMenuManager menuManager, List<?> selection) {
		
		if (selection.isEmpty()) return;
		
		CompleteMultiRulesCommand cmd = new CompleteMultiRulesCommand();
		cmd.setElements(selection);
		menuManager.add(createAction(getLabel("CompleteMultiRules"), cmd));
		
	}
}

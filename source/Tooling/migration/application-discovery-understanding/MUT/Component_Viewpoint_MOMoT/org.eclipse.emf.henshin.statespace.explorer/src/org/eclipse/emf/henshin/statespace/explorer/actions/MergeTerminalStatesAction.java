package org.eclipse.emf.henshin.statespace.explorer.actions;

import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.explorer.commands.MergeTerminalStatesCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Action for merging terminal states.
 * @author Christian Krause
 */
public class MergeTerminalStatesAction extends AbstractStateSpaceAction {
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		
		// Display a confirmation dialog:
		Shell shell = getExplorer().getSite().getShell();
		boolean confirmed = MessageDialog.openConfirm(shell, "Merge Terminal States", "Really merge all terminal states?");
		if (confirmed) {
			
			// Create and execute Reset command:
			StateSpaceManager manager = getExplorer().getStateSpaceManager();
			MergeTerminalStatesCommand command = new MergeTerminalStatesCommand(manager);
			
			try {
				int stateCount = manager.getStateSpace().getStateCount();
				getExplorer().executeCommand(command);
				int removed = stateCount - manager.getStateSpace().getStateCount();
				MessageDialog.openInformation(shell, "Merge Terminal States", "Removed " + removed + " states.");
			}
			catch (Throwable t) {
				StateSpaceExplorerPlugin.getInstance().logError("Error merging terminal states", t);
				MessageDialog.openError(shell, "Error", "Error merging terminal states. See the error log for more information.");
			}
		}
		
	}
	
}

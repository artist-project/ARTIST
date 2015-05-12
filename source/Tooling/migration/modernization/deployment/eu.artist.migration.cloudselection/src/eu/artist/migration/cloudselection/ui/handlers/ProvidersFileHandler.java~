package eu.artist.migration.cloudselection.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;


public class ProvidersFileHandler extends AbstractHandler{

	@Override

	public Object execute(ExecutionEvent evt) throws ExecutionException{
		IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
				.getActiveWorkbenchWindow(evt);
		if (activeWorkbenchWindow == null) {
			// action has been disposed
			return null;
		}
		try {
			activeWorkbenchWindow.getActivePage().showView("eu.artist.migration.cloudselection.providerselection");
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}

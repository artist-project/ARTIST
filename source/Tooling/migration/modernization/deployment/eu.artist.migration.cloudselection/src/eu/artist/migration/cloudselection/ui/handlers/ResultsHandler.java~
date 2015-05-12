package eu.artist.migration.cloudselection.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.handlers.HandlerUtil;


public class ResultsHandler extends AbstractHandler{

	 public Object execute(ExecutionEvent event) throws ExecutionException {
		    String name = event
		        .getParameter("eu.artist.migration.cloudselection.commandPartrueameter1");
		    MessageDialog.openInformation(HandlerUtil.getActiveShell(event),
		        "Results", name);
		    return null;
		  }
}

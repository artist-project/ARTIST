package ll.mde.anymodel2uml.plugin.handlers;

import java.io.File;

import org.eclipse.ui.dialogs.SaveAsDialog;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.core.resources.ResourcesPlugin;

import ll.mde.anymodel2uml.client.*;
import ll.mde.anymodel2uml.plugin.artistconsole.ArtistConsole;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ArtistImportHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public ArtistImportHandler() {
	}

	
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ArtistConsole.Initialize(window);
		
		String u = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		SaveAsDialog dialog = new SaveAsDialog(window.getShell());
		dialog.setOriginalName("import.uml");
		
		int result = dialog.open();
		
		if(result == 0)
		{
			if (!MessageDialog.openConfirm(window.getShell(), "Artist", "Starting Import. Please make sure you started the EA Plugin."))
				return null;
			
			ArtistConsole.WriteToConsole("Starting Import");			
			String path = new File(u, dialog.getResult().toOSString()).getAbsolutePath();
			if (!path.toLowerCase().endsWith(".uml"))
			{
				path += ".uml";
			}
			
			URI exportPath = URI.createFileURI(path);			
			new Uml2EmfExporter(exportPath).BeginExport();			
		}		
		
		return null;
	}
	
	
	
}

package ll.mde.anymodel2uml.plugin.handlers;

import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;

import ll.mde.anymodel2uml.client.Emf2UmlExporter;
import ll.mde.anymodel2uml.plugin.artistconsole.ArtistConsole;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ArtistExportHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public ArtistExportHandler() {
	}

	
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ArtistConsole.Initialize(window);
		
		FileDialog dialog = new FileDialog(window.getShell());
		dialog.setFileName("import.uml");
		
		String result = dialog.open();
		
		if(result != null) {	
			org.eclipse.uml2.uml.Model rootModel;
			try {
				// Create a resource set to hold the resources.
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
				Resource resource = resourceSet.getResource(URI.createFileURI(result), true);
				EcoreUtil.resolveAll( resource );
				
				rootModel = (org.eclipse.uml2.uml.Model)EcoreUtil.getObjectByType( resource.getContents(), UMLPackage.Literals.MODEL );
			} catch(Exception ex) {
				MessageDialog.openError(window.getShell(), "Artist", "Please select a valid EMF-File.");
				return null;
			}
			
			if(rootModel != null) {
				if (!MessageDialog.openConfirm(window.getShell(), "Artist", "Starting Export. Please make sure you started the EA Plugin."))
					return null;
				
				ArtistConsole.WriteToConsole("Starting Export");
				
				Emf2UmlExporter exporter = new Emf2UmlExporter(((org.eclipse.uml2.uml.Package)((org.eclipse.uml2.uml.Package)rootModel.getPackagedElements().get(1)).getPackagedElements().get(0)).getPackagedElements().get(0));
			} else {
				MessageDialog.openError(window.getShell(), "Artist", "Didn't found a Root-Package in the selected EMF-File.");
			}
		}		
		
		return null;
	}
}

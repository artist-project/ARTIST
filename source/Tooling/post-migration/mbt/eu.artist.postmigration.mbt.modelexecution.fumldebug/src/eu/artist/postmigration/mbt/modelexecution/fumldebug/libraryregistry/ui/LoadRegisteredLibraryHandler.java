package eu.artist.postmigration.mbt.modelexecution.fumldebug.libraryregistry.ui;

import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.artist.postmigration.mbt.modelexecution.fumldebug.libraryregistry.RegisteredLibrary;

public class LoadRegisteredLibraryHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditorChecked(event);
		Shell shell = editor.getEditorSite().getShell();
		if (editor instanceof IEditingDomainProvider) {
			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editor;
			ResourceSet resourceSet = editingDomainProvider.getEditingDomain().getResourceSet();
			
			RegisteredLibrarySelectionDialog dialog = new RegisteredLibrarySelectionDialog(shell);
			dialog.run();
			Collection<RegisteredLibrary> selectedLibraries = dialog.getSelectedLibraries();
			if(selectedLibraries != null) {
				for(RegisteredLibrary selectedLibrary : selectedLibraries) {
					URI libraryPathUri = URI.createURI(selectedLibrary.getPath());
					resourceSet.getResource(libraryPathUri, true);
				}
			}						
		}
		return null;
	}

}

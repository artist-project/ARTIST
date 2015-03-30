package eu.artist.postmigration.nfrvt.lang.common.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import eu.artist.postmigration.nfrvt.lang.uml.ui.UmlEditorOpener;


public class ARTISTCommonLanguageSpecificURIEditorOpener extends LanguageSpecificURIEditorOpener {

	public IEditorPart openWithXtextEditor(URI uri, EReference crossReference, int indexInList, boolean select) throws PartInitException {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorPart editorPart = null;
		for(IEditorReference part : page.getEditorReferences())
			if(part.getTitleToolTip().equals(uri.trimFragment().toString()))
				editorPart = part.getEditor(false);
		
		if(editorPart == null) {
			IEditorDescriptor editorDesc = IDE.getEditorDescriptor(uri.toPlatformString(true), true);
			editorPart = IDE.openEditor(page, 
					new ARTISTCommonPluginResourceEditorInput(
							new ARTISTCommonPluginResourceStorage(uri)),
							editorDesc.getId(), 
							true);
		} else {
			page.activate(editorPart);
		}
		if(editorPart != null) {
			selectAndReveal(editorPart, uri, crossReference, indexInList, select);
			return EditorUtils.getXtextEditor(editorPart);
		}
		return null;
	}
	
	@Override
	public IEditorPart open(URI uri, EReference crossReference,
			int indexInList, boolean select) {
		IEditorPart part = super.open(uri, crossReference, indexInList, select);
		if(part != null)
			return part;
		
		if(uri.isPlatformPlugin()) {
			try {
				return openWithXtextEditor(uri, crossReference, indexInList, select);
			} catch (PartInitException e1) {
				return UmlEditorOpener.openWithReflectiveEcoreEditor(uri, crossReference, indexInList, select);
			}
		} else if(uri.isPlatformResource()) {
			return open(URI.createURI(uri.toString().replace("platform:/resource/", "platform:/plugin/")),
					crossReference, indexInList, select);
		}
		return part;
	}
}

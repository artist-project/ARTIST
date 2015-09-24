package eu.artist.migration.mut.umlprofiler.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.artist.migration.mdt.umlprofilediscovery.code2codemodel.JavaDiscoverer;
import eu.artist.migration.mut.umlprofiler.java2profileduml.ProfiledUMLViewGenerator;
import eu.artist.migration.mut.umlprofiler.ui.util.J2PUMLLaunchUtil;

public class ProfiledUMLModelDiscoveryHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IProject selectedProject = getSelectedProject(event);
		IJavaProject selectedJavaProject = JavaCore.create(selectedProject);
		
		try {
			Resource javaCodeModelResource = JavaDiscoverer.INSTANCE.runDiscovery(selectedJavaProject);
			javaCodeModelResource.setURI(URI.createURI(selectedJavaProject.getElementName().concat(J2PUMLLaunchUtil.CODE_MODEL_PATH)));
			
			// once we have the Java Code Model we can run the transformation that produces the profiled UML Model
			ProfiledUMLViewGenerator.INSTANCE.generateProfiledUMLView(javaCodeModelResource, selectedJavaProject.getElementName(),
					selectedProject.getFullPath().toString());
			
			MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Success", "Profiled UML Class diagram created and saved in the respective project folder.");
			
		} catch (DiscoveryException e) {
			e.printStackTrace();
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Discovery Error", "Profiled UML Class diagram could not be created.");
		} catch (JavaModelException e) {
			e.printStackTrace();
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Java Model Error", "Profiled UML Class diagram could not be created.");
		}		
		
		return null;
	}

	/**
	 * Helper method to obtain the selected input java project from the event triggered by the workbench
	 * @param event Event triggered by the action managed by this handler.
	 * @return The selected project.
	 */
	private IProject getSelectedProject(ExecutionEvent event) {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IProject selectedProject = null;
		
		 IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
	        Object firstElement = selection.getFirstElement();
	        if (firstElement instanceof IAdaptable)
	        {
	        	selectedProject = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
	            
	        }
		
		return selectedProject;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}

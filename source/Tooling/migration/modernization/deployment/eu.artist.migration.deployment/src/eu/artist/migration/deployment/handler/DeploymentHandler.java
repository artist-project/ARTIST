package eu.artist.migration.deployment.handler;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.artist.migration.deployment.helper.EclipseWorkbenchHelper;


public class DeploymentHandler extends AbstractHandler {
	
	public Object execute(Map parameterValuesByName) throws ExecutionException {
		return null;
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		IFile selectedClassModel = EclipseWorkbenchHelper.getSelectedFile(event);
		IProject targetProject = EclipseWorkbenchHelper.getTargetProject(event);

		new DeploymentHelper(window.getShell()).showDeploymentDialog(selectedClassModel, targetProject);
		
		return null;
	}

}

package eu.artist.migration.deployment.handler;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.EnumSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.window.Window;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.swt.widgets.Shell;

import eu.artist.migration.deployment.azure.transformation.files.Caml2azure;
import eu.artist.migration.deployment.dialog.DeploymentDialog;
import eu.artist.migration.deployment.gae.transformation.files.Caml2gaeweb;
import eu.artist.migration.deployment.helper.EclipseWorkbenchHelper;
import eu.artist.migration.deployment.targets.Target;


public class DeploymentHelper{
	private Shell shell;
	private String dialogTitle = "Deployment Tool: Descriptors generator";
	private String dialogMsg = "Generated deployment descriptors placed in location: ";
	private String dialogErrMsg = "Deployment descriptors could not be generated. Check error log in console";
	private String dialogNotSupportedMsg = "Selected deployment target not supported yet";
	
	public DeploymentHelper (Shell shell){
		this.shell = shell;
	}
	
	/**
	 * This method shows a dialog prompting the user information required to generate deployment descriptors
	 * for given input deployment model.
	 * @param selectedClassModel The input deployment model
	 * @param targetProject Project owing the selected input deployment model.
	 * @throws CoreException 
	 */
	public void showDeploymentDialog(IFile selectedModel, IProject targetProject) {
		DeploymentDialog dialog = new DeploymentDialog(shell, targetProject);
		dialog.setInputModel (selectedModel);
	    
	    // get the new values from the dialog
	    if (dialog.open() == Window.OK) {
	    	IPath targetPath = dialog.getTargetPath();
	    	String targetLocation = null;
			try {
				//Default target location based on default target project
				targetLocation = targetProject.getDescription().getLocationURI().getPath();
				if (targetPath != null){ //Setting selected target project and location for placing deployment descriptors
					String targetProjectName = targetPath.segment(0);
					targetProject = EclipseWorkbenchHelper.getWorkspaceProjectByName(targetProjectName);
					if (targetProject.getDescription().getLocationURI() != null){
						targetLocation = targetProject.getDescription().getLocationURI().getPath();
					}else{
						IPath workspaceLocation = EclipseWorkbenchHelper.getWorkspaceRoot().getLocation();
						targetLocation = workspaceLocation.toOSString() + targetPath.toOSString();
					}
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	generateGUICloudifiedModels(selectedModel, targetLocation, targetProject, dialog.getSelectedTargets());
	    }
	}

	private void generateGUICloudifiedModels(final IFile model,
			final String targetLocation, final IProject targetProject,
			final EnumSet<Target> selectedTargets) {
			Job job = new Job("Generating deployment descriptors in progress") {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				URI modelUri = model.getLocationURI();
				
				int numberOfTask = selectedTargets.size();
				boolean supportedGenerator = false;
						
				monitor.beginTask("Generating deployment descriptors", numberOfTask);
				System.out.println ("Number of tasks " + numberOfTask);

				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}

				try {
					int i=0;
					for (Target target: selectedTargets){
						
						switch (target){
						case GAE:
							generateGAEDeploymentModel(modelUri, targetLocation, monitor);
							monitor.worked(1);
							supportedGenerator = true;
							System.out.println ("Completed generation of deployment descriptor for " + target.getLabel());
							break;
						case Azure:
							generateAzureDeploymentModel(modelUri, targetLocation, monitor);
							monitor.worked(1);
							supportedGenerator = true;
							System.out.println ("Completed generation of deployment descriptor for " + target.getLabel());
							break;
						case AWS:
							String message = "Support for Amazon Web Services not available yet";
							EclipseWorkbenchHelper.showDialog(shell, dialogTitle, message, message, Status.CANCEL_STATUS);
							break;
						default:
							//Ignored
							System.out.println ("Ignored target: " + target.getLabel());
						}
					}	
					
					EclipseWorkbenchHelper.refreshTargetProject(targetProject);
				} catch (Exception e) {
					e.printStackTrace();
					EclipseWorkbenchHelper.showDialog(shell, dialogTitle, dialogMsg, dialogErrMsg, Status.CANCEL_STATUS);
					return Status.CANCEL_STATUS;
				}

				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}

				if (supportedGenerator)
					EclipseWorkbenchHelper.showDialog(shell, dialogTitle, dialogMsg + targetLocation, dialogErrMsg, Status.OK_STATUS);
				else
					EclipseWorkbenchHelper.showDialog(shell, dialogTitle, dialogMsg, dialogNotSupportedMsg, Status.CANCEL_STATUS);
				System.out.println ("Completion dialog shown");
				return Status.OK_STATUS;
			}

			private void generateGAEDeploymentModel(URI modelUri, String targetLocation,
					IProgressMonitor monitor) throws IOException, ATLCoreException, CoreException {
				
				Caml2gaeweb runner = new Caml2gaeweb();
				runner.loadModels(modelUri.toString(), 
								  "platform:/plugin/eu.artist.migration.caml/umlprofiles/GoogleAppEngineProfile.profile.uml",
								  "platform:/plugin/eu.artist.migration.caml/umlprofiles/core.profile.uml",
								  "platform:/plugin/eu.artist.migration.caml/umlprofiles/security.profile.uml");
				
				runner.doCaml2gaeweb(monitor);
				runner.saveModels("appengine-web.xml", targetLocation + File.separator + "deployment", Boolean.TRUE);
			}
			
			private void generateAzureDeploymentModel(URI modelUri, String targetLocation,
					IProgressMonitor monitor) throws IOException, ATLCoreException, CoreException {			
				
				Caml2azure runner = new Caml2azure();
				runner.loadModels(modelUri.toString(), 
								  "platform:/plugin/eu.artist.migration.caml/umlprofiles/MicrosoftAzureProfile.profile.uml");
				
				runner.doCaml2azure(monitor);
				runner.saveModels ("serviceDefinition.csdef", "serviceConfiguration.Cloud.cscfg", "serviceDescription.azurePubxml",  targetLocation + File.separator + "deployment", Boolean.TRUE);
			}
		};
		job.setPriority(Job.LONG);
		job.setUser(true);
		job.schedule();
	}

}

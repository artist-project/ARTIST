package eu.artist.migration.cloudselection.ui.handlers;

import java.awt.Frame;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.artist.migration.cloudselection.umlmodelservice.modelparsing.Resources;

public class ProvidersFileHandler extends AbstractHandler{
		
	@Override 
	public Object execute(ExecutionEvent evt) throws ExecutionException{
		IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
				.getActiveWorkbenchWindow(evt);
		if (activeWorkbenchWindow == null) {
			// action has been disposed
			return null;
		}
		Shell shell = activeWorkbenchWindow.getShell();
		Frame frame = SWT_AWT.getFrame(shell);
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileFilter uml = new FileNameExtensionFilter("Uml files", "uml");
		chooser.addChoosableFileFilter(uml);
		chooser.setFileFilter(uml);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.setMultiSelectionEnabled(true);
		int returnVal = chooser.showOpenDialog(frame);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			   File[] fileList = chooser.getSelectedFiles();
			   if (fileList.length!=0) Resources.unloadProviders();
			   for (int j=0; j<fileList.length; j++){
				   Resources.loadProviderPath(fileList[j].getName(), fileList[j].getAbsolutePath());
			   }
		}
			
		return null;
	}


}

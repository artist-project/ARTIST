/*******************************************************************************
 *  Copyright (c) 2014 - 2015 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
 *  
 *  Licensed under the MIT license:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 * Contributors: Kleopatra Konstanteli
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.cheatsheet.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class MATReportSelectionPathHandler extends AbstractHandler {
	String selected_file;
	String is_file_selected = "false";
	
	public MATReportSelectionPathHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
	    Display.getDefault().syncExec( new Runnable() {  
	    	public void run() { 
	    		
	    		//Shell shell = new Shell(display);
	    		Shell shell = new Shell();
		        // File standard dialog
		        FileDialog fileDialog = new FileDialog(shell);
		        // Set the text
		        fileDialog.setText("Select MIG file");
		        // Set filter on .gml files
		        fileDialog.setFilterExtensions(new String[] { "*.gml" });
		        // Put in a readable name for the filter
		        fileDialog.setFilterNames(new String[] { "MIG file(*.gml)" });
		        
		        IWorkspace workspace= ResourcesPlugin.getWorkspace();
		        
		        String workspace_path = workspace.getRoot().getLocation().toString();
		        
		        System.out.println("Workspace path is " + workspace_path);
		       
		        fileDialog.setFilterPath(workspace_path);
		        
		        // Open Dialog and save result of selection
		        selected_file = fileDialog.open();
			       
		        System.out.println("The selected MIG file is " + selected_file);
		        
		        if (selected_file!=null && selected_file!="") {
		        	is_file_selected = "true";
		        	
		        } else {
		        	is_file_selected = "false";
		        }
		        
		        System.out.println("is file selected " + is_file_selected);
		        
	    	} 
	    });
	    
	    return selected_file;
	    
	}
}

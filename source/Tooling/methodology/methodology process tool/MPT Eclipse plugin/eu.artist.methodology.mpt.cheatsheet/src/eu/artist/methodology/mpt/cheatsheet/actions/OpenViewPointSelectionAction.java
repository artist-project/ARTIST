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
package eu.artist.methodology.mpt.cheatsheet.actions;

import java.util.Collection;

import javax.swing.JOptionPane;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.tools.internal.actions.session.OpenViewpointSelectionAction;

public class OpenViewPointSelectionAction extends Action implements ICheatSheetAction{
	
   @Override
   public void run(String[] params, ICheatSheetManager arg1) {
	 try {
		   
		   System.out.println("OpenViewPointSelectionAction activated.");
		    
		   Session session = null;
	    
	       Collection<Session> s = SessionManager.INSTANCE.getSessions();
	       Object[] a = s.toArray();
	       
	       if (a.length > 0) {
	    	   session = (Session) a[0];
	        
	    	   OpenViewpointSelectionAction ovsa = new OpenViewpointSelectionAction(session);
	    	   ovsa.run();
	    	   
	       } else {
	    	   
	    	   JOptionPane.showMessageDialog( null, "Please load a Business Model using the previous steps before selecting the viepoints","Warning",JOptionPane.OK_CANCEL_OPTION);
	       }
		
	   } catch(Exception ex)  {
		   ex.printStackTrace();
	   }	 
   }	 
}


/*******************************************************************************
 *  Copyright (c) 2014 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
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

import java.util.Properties;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.ui.cheatsheets.OpenCheatSheetAction;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;


public class ShowCheatSheetAction extends Action implements IIntroAction, ICheatSheetAction{
	
	@Override
	public void run(String[] params, ICheatSheetManager arg1) {
		String id = params[0];
		//String id = "eu.artist.methodology.mpt.cheatsheet.cheatsheet";
		final Action action = new OpenCheatSheetAction(id);
				
		// Run the appropriate launcher
		Display.getDefault().asyncExec(new Runnable(){
			@Override
			public void run() {
				if (action != null)
					action.run();
				}					
			}
		);
	}
	
	@Override
	public void run(IIntroSite site, Properties params) {
		String id = "eu.artist.methodology.mpt.cheatsheet.premigration";
		final Action action = new OpenCheatSheetAction(id);
		
		// Close the intro part
		// IIntroPart part = PlatformUI.getWorkbench().getIntroManager().getIntro();
		// PlatformUI.getWorkbench().getIntroManager().closeIntro(part);
		
		// Run the appropriate launcher
		Display.getDefault().asyncExec(new Runnable(){
			@Override
			public void run() {
				if (action != null)
					action.run();
				}
			}
		);
	} 
}
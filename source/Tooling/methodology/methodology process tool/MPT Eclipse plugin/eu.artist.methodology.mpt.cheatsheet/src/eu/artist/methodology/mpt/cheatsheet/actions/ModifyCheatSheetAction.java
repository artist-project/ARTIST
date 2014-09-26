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

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.ui.cheatsheets.OpenCheatSheetAction;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import eu.artist.methodology.mpt.cheatsheet.rules.Pair;
import eu.artist.methodology.mpt.cheatsheet.rules.RulesVariable;


public class ModifyCheatSheetAction extends Action implements IIntroAction, ICheatSheetAction{
	static final HashMap<String, String> csMap;
	
	static {
		 csMap = new HashMap<String, String>();	 
		 csMap.put("eu.artist.methodology.mpt.cheatsheet.premigration", "mpt_pre_migration.xml");
		 csMap.put("eu.artist.methodology.mpt.cheatsheet.migration", "mpt_migration.xml");
		 csMap.put("eu.artist.methodology.mpt.cheatsheet.postmigration", "mpt_post_migration.xml");
	}
	
	@Override
	public void run(String[] params, ICheatSheetManager arg1) {
		URL csURL = null;
		String xmlString = null;
		String csId = null;
		String csName;
				
		try {			
			csId = params[0];
			
			if (csId != null) {
				csName = csMap.get(csId);
				if (csName != null) {
					csURL = new URL("platform:/plugin/eu.artist.methodology.mpt.cheatsheet/cheatsheets/" + csMap.get(csId));
				} else {
					//use default generic cheat sheet
					csURL = new URL("platform:/plugin/eu.artist.methodology.mpt.cheatsheet/cheatsheets/mpt.xml");
				}
			}
			
			//FIXME: add more rules and handle them in a generic way
			//ArrayList <String> rules_array = RulesVariable.rules;
			HashMap<Pair<String, String>, String> rules_map = RulesVariable.rules_map;
			
			//if (rules_array.size()!=0) {
			if (rules_map.size()!=0) {
					InputStream inputStream = csURL.openConnection().getInputStream();
				
					DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
							
					Document doc = docBuilder.parse(inputStream);
			    
					// modify cheat sheet content according to rules
					doc = modifyCheatSheet(doc, rules_map);
					
					// write modified cheat sheet content into XML file
					xmlString = storeModifiedCheatSheet(doc, "path");
					System.out.println(xmlString);
				
			} else {
				
				System.out.println("There is no active rule. The default cheat sheet will be loaded.");
			}
					 
		} catch (IOException e) {
		    e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		final Action action;
		try {
			
			if (xmlString!=null) {
				//FIXME: define appropriate name and id for modified cheat sheet
				action = new OpenCheatSheetAction("anid", "aname", xmlString, new URL("platform:/plugin/eu.artist.methodology.mpt.cheatsheet/cheatsheets/"));
			} else {
				action = new OpenCheatSheetAction(csId);
			}
				
			// Run the appropriate launcher
			Display.getDefault().asyncExec(new Runnable(){
					@Override
					public void run() {
						if (action != null)
							action.run();
					}					
			});
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	private Document modifyCheatSheet(Document doc, HashMap<Pair<String, String>, String> rules_map) {	
		
		StringBuilder rules_string_emreq = new StringBuilder();
		StringBuilder rules_string_optappfea = new StringBuilder();
		
		for (Map.Entry<Pair<String, String>, String> entry : rules_map.entrySet()) {
		    Pair<String, String> key = entry.getKey();
		    //FIXME
		    if (key.getElement1()=="EMREQ") {
		    	 String value = entry.getValue();

				    if (rules_string_emreq.length() != 0) {
				    	rules_string_emreq.append(',');
				    }
				    
				    rules_string_emreq.append(value);		    	
		    }
		    //FIXME
		    if (key.getElement1()=="OPTAPPFEA") {
		    	 String value = entry.getValue();

				    if (rules_string_optappfea.length() != 0) {
				    	rules_string_optappfea.append(',');
				    }
				    
				    rules_string_optappfea.append(value);		    	
		    }
		    
		    if (key.getElement0()=="RULE_3") {
				
				System.out.println("RULE_3 is satisfied. Going to remove Target Environment Specification tasks from cheat sheet.");
			
				Node cheatsheet = doc.getFirstChild();
				Node taskgroup = doc.getElementsByTagName("taskGroup").item(0);
		    
				taskgroup = deleteTask(taskgroup, "Benchmark and profile application");
				taskgroup = deleteTask(taskgroup, "View Cloud providers benchmarks");
				
				String vpn_task =  "<task kind=\"cheatsheet\" name=\"Network setup\" skip=\"false\"><intro><b>Introduction</b></intro><onCompletion><b>Conclusion</b></onCompletion><param name=\"path\" value=\"migration/network_setup_simple.xml\"></param></task>";
				
				try {
					addTask(doc, taskgroup, vpn_task);
				} catch (IOException | SAXException
						| ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		       
		}
			
		return doc;
	}
	
	private Node deleteTask(Node taskgroup, String taskName) {
	    Node tempNode = null;
	    NodeList nl = taskgroup.getChildNodes();
	    
	    for (int i = 0; i < nl.getLength(); i++) {
	        tempNode = nl.item(i);
	        
	        if (tempNode.getNodeName().equals("task")) {
	        	NamedNodeMap attr = tempNode.getAttributes();
	        	
	        	if (attr.getNamedItem("name").getTextContent().equals(taskName)) {  
	        		tempNode= taskgroup.removeChild(tempNode);
		        	System.out.println("removed '" + taskName + "' task!");
	        	}
	        }        
	    }
	    
	    return taskgroup;
	}
	
	private static void addTask(Document doc, Node taskgroup, String fragment) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		
		Node fragmentNode = docBuilder.parse(new InputSource(new StringReader(fragment))).getDocumentElement();
		
		fragmentNode = doc.importNode(fragmentNode, true);
		
		taskgroup.insertBefore(fragmentNode, taskgroup.getLastChild());
	}
	
	private static String storeModifiedCheatSheet(Document doc, String path) {
		 String xmlString = null;
	     try {  
	
	        	TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				//FIXME: define appropriate path to store modified cheat sheet
				//File out = new File(path);  
		        //Result result = new StreamResult(out);
				StreamResult result = new StreamResult(new StringWriter());
				transformer.transform(source, result);
				xmlString = result.getWriter().toString();
				
				System.out.println("Cheat sheet has been modified and stored.");
						
	     } catch (TransformerException e) {  
	            e.printStackTrace();  
	     } 
	        
	     return xmlString;
	}  
	
	@Override
	public void run(IIntroSite site, Properties params) {
		String id = "eu.artist.methodology.mpt.cheatsheet.cheatsheet";
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
			
		});
	} 
}
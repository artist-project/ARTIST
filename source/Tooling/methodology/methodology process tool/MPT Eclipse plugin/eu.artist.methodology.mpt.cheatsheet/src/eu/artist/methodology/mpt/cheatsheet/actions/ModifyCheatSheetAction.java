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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.ui.cheatsheets.OpenCheatSheetAction;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import eu.artist.methodology.mpt.cheatsheet.Activator;
import eu.artist.methodology.mpt.cheatsheet.util.MPTConstants;
import eu.artist.methodology.mpt.cheatsheet.util.MPTLogger;
import eu.artist.methodology.mpt.methodology.model.MethodologyTemplateInstantiationDefault;
import eu.artist.premigration.tft.mpt.rules.RulesKey;
import eu.artist.premigration.tft.mpt.rules.RulesVariable;
import eu.artist.suite.ARTISTSuite;
import eu.artist.suite.preferences.PreferenceConstants;

public class ModifyCheatSheetAction extends Action implements ICheatSheetAction {
	static final HashMap<String, String> csMap;
	static final HashMap<String, Document> mod_docs;
	
	static String path = Activator.getDefault().getStateLocation().toString();
	static String fullPath;
	static MPTLogger logger = new MPTLogger();
	
	static {		 
		 csMap = new HashMap<String, String>();	 		 
		 csMap.put(MPTConstants.CHEATSHEET_PRE_MIGRATION.getConstant(), MPTConstants.CHEATSHEET_PRE_MIGRATION.getMessage());
		 csMap.put(MPTConstants.CHEATSHEET_MIGRATION.getConstant(), MPTConstants.CHEATSHEET_MIGRATION.getMessage());
		 csMap.put(MPTConstants.CHEATSHEET_POST_MIGRATION.getConstant(), MPTConstants.CHEATSHEET_POST_MIGRATION.getMessage());
		 
		 mod_docs = new HashMap<String, Document>();	  
	}
	
	@Override
	public void run(String[] params, ICheatSheetManager arg1) {
		URL csURL = null;
		String csId = null;
		String csName = null;
		
		logger.log("ModifyCheatSheet action activated", null);
		try {			
			csId = params[0];
			
			if (csId != null) {
				csName = csMap.get(csId);
				if (csName != null) {
					//retrieve cheat sheet with given id
					csURL = new URL("platform:/plugin/eu.artist.methodology.mpt.cheatsheet/cheatsheets/" + csName);
				} else {
					//use default generic cheat sheet
					csURL = new URL("platform:/plugin/eu.artist.methodology.mpt.cheatsheet/cheatsheets/mpt.xml");
				}
			}
			
			HashMap<RulesKey<Integer, String, String, Integer, Integer>, String> rules_map = RulesVariable.rules_map;
			
			if (rules_map.size()!=0) {
				    logger.log("Retrieved rules hashmap", null);
				    
					//Load default Methodology model in memory
				    //MethodologyTemplateInstantiationDefault mm = new MethodologyTemplateInstantiationDefault();
				   
				    //FIXME: customize in memory methodology model
				    //mm = customizeMethodologyModel(mm, rules_map);
				    
				    //load cheat sheet
			        Document doc = loadDocumentFromURL(csURL);
			        logger.log("Loaded cheatsheet", null);
			        
			        //clear temporary storage between runs
			        mod_docs.clear();
					
					//modify cheat sheet content according to rules
					doc = modifyCheatSheet(csName, doc, rules_map);
					logger.log("Modified cheatsheet", null);
					
					updateLinksToSimpleCheatsheets(doc);
					logger.log("Updated links in cheatsheet", null);
					
					// write modified cheat sheet content into XML file
					// and store it in the plugin's state location
					fullPath = storeModifiedCheatSheet(doc, csId);
					logger.log("Modified composite cheatsheet stored at: " + fullPath, null);
					
			} else {
				logger.log("There is no active rule. The default cheat sheet will be loaded.", null);
			}
			
			openCheatSheetAction(csId);
					 
		} catch (Exception e) {
			logger.log("An exception occured", e);
		    e.printStackTrace();
		} 		
	}
	
	private static void openCheatSheetAction(String csId) throws MalformedURLException{
		final Action action;

		if (fullPath != null) {				
			action = new OpenCheatSheetAction(csId + "_custom", csMap.get(csId) + "_custom", new File(fullPath).toURI().toURL());			
		} else {				
			action = new OpenCheatSheetAction(csId);
		}
				
		Display.getDefault().asyncExec(new Runnable(){
				@Override
				public void run() {
					if (action != null)
						action.run();
			    }					
		});
		
	}
	
	private MethodologyTemplateInstantiationDefault customizeMethodologyModel(MethodologyTemplateInstantiationDefault mm, HashMap<RulesKey<Integer, String, String, Integer, Integer>, String> hm) {
		//FIXME
		//Apply rules on model		
		//Return customized methodology model
		return mm;
	}
	
	private Document modifyCheatSheet(String csId, Document doc, HashMap<RulesKey<Integer, String, String, Integer, Integer>, String> rules_map) throws SAXException, IOException, ParserConfigurationException {			
		NodeList taskgroups = doc.getElementsByTagName("taskGroup");
						
		for (Map.Entry<RulesKey<Integer, String, String, Integer, Integer>, String> entry : rules_map.entrySet()) {
		    
			RulesKey<Integer, String, String, Integer, Integer> key = entry.getKey();
			
			Integer action = key.getAction();
			String task = key.getTask();
			Integer group = key.getGroup();
			String activity = key.getActivity();
			String value = entry.getValue();
			String cs_path = MPTConstants.getByConstant(task).getMessage();
			String activity_label = null;
			
			if (activity != null && activity != "") {
				activity_label = MPTConstants.getByConstant(task + activity).getMessage();
			}
			
			Node taskgroup = getTaskGroupForTask(taskgroups, group);
			 			
		    switch (action) {
		    
		    case 0:
		    	logger.log("Rule for removing task activated.");				
				taskgroup = deleteTask(taskgroup, task);
		    	break;
		    case 1:
		    	logger.log("Going to add task '" + task + "'");
			    String taskXml = MPTConstants.getByConstant(task).getMessage();
			    logger.log("Task's cheatsheet is '" + taskXml + "'");
				addTask(doc, taskgroup, task, taskXml);
		    	break;
		    case 2:
		    	logger.log("Rule for editing task activated.");
		    	taskgroup = editTask(taskgroup, task, value);
		    	break;
		    case 3:
		    	logger.log("Rule for removing activity activated.");		    	
		    	Document document;
		    	
		    	if (mod_docs.containsKey(cs_path)) {
		    		document = mod_docs.get(cs_path);
		    	} else {
		    		document = loadCheatsheet(cs_path);
		    	}
		    	
				NodeList items = document.getElementsByTagName("item");
				deleteActivity(items, activity_label);
				mod_docs.put(cs_path, document);
		    	break;
		    case 4:
		    	logger.log("Rule for adding activity activated.");		
		    	Document document_;
		    	
		    	if (mod_docs.containsKey(cs_path)) {
		    		document_ = mod_docs.get(cs_path);
		    	} else {
		    		document_ = loadCheatsheet(cs_path);
		    	}
				
		    	NodeList items_ = document_.getElementsByTagName("item");
		    	
				document_ = addActivity(document_, items_, task, activity_label);
				mod_docs.put(cs_path, document_);    
		    	break;
		    case 5:
		    	logger.log("Rule for editing activity activated.");
		    		
		    	Document _document_;
		    	
		    	if (mod_docs.containsKey(cs_path)) {
		    		_document_ = mod_docs.get(cs_path);
		    	} else {
		    		_document_ = loadCheatsheet(cs_path);
		    	}
				
		    	NodeList _items_ = _document_.getElementsByTagName("item");
		    	editActivity(_items_, activity_label, value);
		    	mod_docs.put(cs_path, _document_); 
		    	break;
		    case 6:
		    	logger.log("Rule for removing top layer activity activated.");		    	
		    	Document _document__;
		    	
		    	if (mod_docs.containsKey(cs_path)) {
		    		_document__ = mod_docs.get(cs_path);
		    	} else {
		    		_document__ = loadCheatsheet(cs_path);
		    	}
		    	
		    	NodeList activities = _document__.getElementsByTagName("item");
				deleteActivity_(activities, activity_label);
				mod_docs.put(cs_path, _document__);
		    	break;
		    case 7:
		    	logger.log("Rule for adding top layer activity activated.");		
		    	Document __document__;
		    	
		    	if (mod_docs.containsKey(cs_path)) {
		    		__document__ = mod_docs.get(cs_path);
		    	} else {
		    		__document__ = loadCheatsheet(cs_path);
		    	}
				
		    	Node activities_ = __document__.getParentNode();		    	
				document_ = addActivity_(__document__, activities_, activity_label);
				mod_docs.put(cs_path, __document__);    
		    	break;
		    
		    }
		}
		
		//check whether the user selected the business role
		if (csId.equalsIgnoreCase(MPTConstants.CHEATSHEET_MIGRATION.getMessage())) {
			
			String role =  ARTISTSuite.getDefault().getPreferenceStore().getString(PreferenceConstants.MPT_ROLE.getValue());
			
			logger.log("ROLE " + role);
			
			if (role.equals(PreferenceConstants.MPT_DEVELOPER_ROLE.getValue())) {
				
				doc = removeTaskGroup(doc, MPTConstants.BUSINESS_GROUP.getMessage());
				
			} else if (role.equals(PreferenceConstants.MPT_BUSINESS_ROLE.getValue())) {
				
				doc = removeTaskGroup(doc, MPTConstants.TECHNICAL_GROUP.getMessage());
				
			} else {				
				logger.log("GENERIC user role has been selected.");				
			}
		}
				
		//store all modified simple cheat sheets
	    storeModifiedCheatSheets();
			
		return doc;
	}
	
	private Document loadCheatsheet(String cs_path) {
		Document document = null;
		URL cs_url = null;
		
		try {
		
			if (cs_path != null) {										
				cs_url = new URL("platform:/plugin/eu.artist.methodology.mpt.cheatsheet/cheatsheets/" + cs_path);
			    document = loadDocumentFromURL(cs_url);
			}
    	
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return document;
	}
	
	private Document loadDocumentFromURL(URL url) throws SAXException, IOException, ParserConfigurationException {
		Document document = null;
		InputStream inputStream = url.openConnection().getInputStream();
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	    document = docBuilder.parse(inputStream);
	    
	    return document;
	}
	
	private Node getTaskGroupForTask(NodeList taskGroups, Integer group) {
		Node taskGroup = taskGroups.item(group);
		return (taskGroup == null)? taskGroups.item(0) : taskGroup;
	}
	
	private Document removeTaskGroup(Document doc, String taskGroupName) {
	    NodeList taskGroups = doc.getElementsByTagName("taskGroup");
	   
	    Node tn = taskGroups.item(0);
	    Node bn = taskGroups.item(1);
	    Node pn = taskGroups.item(2);
	    		        		
	    if (taskGroupName.equalsIgnoreCase(MPTConstants.TECHNICAL_GROUP.getMessage())) {
	    	logger.log("Remove technical tasks, keep business & process tasks");
	    	doc.getElementsByTagName("compositeCheatsheet").item(0).replaceChild(bn, tn);
	    	bn.appendChild(pn);
	        		
	    } else {
	    	logger.log("Remove business & process tasks, keep technical tasks");
	    	tn.removeChild(bn);
	    	tn.removeChild(pn);
	    }
	        		
	    logger.log("removed '" + taskGroupName + "' group!");
	    
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
	        		taskgroup.removeChild(tempNode);
	        		logger.log("removed '" + taskName + "' task!");
		        	break;
	        	}
	        }        
	    }
	    
	    return taskgroup;
	}
	
	private Node editTask(Node taskgroup, String taskName, String value) {
	    Node tempNode = null;
	    NodeList nl = taskgroup.getChildNodes();
	    
	    logger.log("TASK IS: " + taskName);
	    
	    for (int i = 0; i < nl.getLength(); i++) {
	        tempNode = nl.item(i);
	        
	        if (tempNode.getNodeName().equals("task")) {
	        	NamedNodeMap attr = tempNode.getAttributes();
	        	
	        	if (attr.getNamedItem("name").getTextContent().equals(taskName)) {  
	        		//FIXME
	        		attr.getNamedItem("skip").setTextContent(value);
	        		logger.log("edited '" + taskName + "' task!");
		        	break;
	        	}
	        }        
	    }
	    
	    return taskgroup;
	}
	
	private void addTask(Document doc, Node taskgroup, String name, String fragment) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		logger.log("The fragment to be added is '" + fragment + "'", null);
		
		String task_node_xml = "<task kind=\"cheatsheet\" name=\"" + name + "\" skip=\"false\">" +
		
        "<intro><b> </b></intro>" +
        "<onCompletion><b> </b></onCompletion>" +        
        "<param name=\"path\" value=\"" + fragment + "\"></param>" +
        "</task>";
		
		Node fragmentNode = docBuilder.parse(new InputSource(new StringReader(task_node_xml))).getDocumentElement();		
		fragmentNode = doc.importNode(fragmentNode, true);
		taskgroup.insertBefore(fragmentNode, taskgroup.getLastChild().getPreviousSibling());
	}
	
	private static void editActivity(NodeList items, String activity, String value) throws IOException, SAXException, ParserConfigurationException {
		Node tempNode = null;
		
		logger.log("The activity to be edited is: " + activity);
			    
		for (int i = 0; i < items.getLength(); i++) {
		    tempNode = items.item(i);
		        
		    NamedNodeMap attr = tempNode.getAttributes();
		    
		    if (attr.getNamedItem("title").getTextContent().equals(activity)) {  		    	
		       //FIXME
		       attr.getNamedItem("skip").setTextContent(value);
		       logger.log("edited '" + activity + "' activity!");
		       break;		        	
		    }
       
	    }
		
	}
	
	private static void deleteActivity(NodeList items, String label) {
	    Node item = null;
	    Node subitem = null;
	    
	    for (int i = 0; i < items.getLength(); i++) {
	        item = items.item(i);
	        NodeList subitems = item.getChildNodes();
	        
	        for (int j = 0; j < subitems.getLength(); j++) {
	        	subitem = subitems.item(j);
	        	if (subitem.getNodeName().equals("subitem")) {
	        		NamedNodeMap attr = subitem.getAttributes();
	        	
	        		if (attr.getNamedItem("label").getTextContent().equals(label)) {  	        		
	        			item.removeChild(subitem);
	        			logger.log("removed '" + label + "' activity!");
	        			break;		        	
	        		}
	        	}
	        	
	        }
	    }
	}
	
	private static void deleteActivity_(NodeList items, String activity) {
	    Node item = null; 
	    for (int i = 0; i < items.getLength(); i++) {
	        item = items.item(i);
	        NamedNodeMap attr = item.getAttributes();
		    
		    if (attr.getNamedItem("title").getTextContent().equals(activity)) {  		    	
		       item.getParentNode().removeChild(item);
		       logger.log("deleted '" + activity + "' activity!");
		       break;		        	
		    }
		    
	    }
	}
	
	private static Document addActivity(Document doc, NodeList items, String activity, String fragment) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		
		String subitem_node_xml = "<subitem label=\"" + fragment + "\"></subitem>";
		
		Node fragmentNode = docBuilder.parse(new InputSource(new StringReader(subitem_node_xml))).getDocumentElement();		
		fragmentNode = doc.importNode(fragmentNode, true);
		
		Node tempNode = null;
		
		logger.log("ACTIVITY IS: " + activity);
				    
		for (int i = 0; i < items.getLength(); i++) {
		    tempNode = items.item(i);
		        
		    NamedNodeMap attr = tempNode.getAttributes();
		    
		    logger.log("ITEM FOUND: " + attr.getNamedItem("title").getTextContent());
		    if (attr.getNamedItem("title").getTextContent().equals(activity)) {  
		        		
		       tempNode.appendChild(fragmentNode);
		       //tempNode.insertBefore(fragmentNode, tempNode.getLastChild().getPreviousSibling());
		       logger.log("added '" + activity + "' activity!");
		       break;			        	
		    }       
	    }
		
		return doc;
	}
	
	private static Document addActivity_(Document doc, Node activities, String fragment) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		
		logger.log("The fragment to be tokenized is '" + fragment + "'");
		
		StringTokenizer st = new StringTokenizer(fragment, "|");
		String label = st.nextElement().toString();
		String description = st.nextElement().toString();
		
		String item_node_xml = "<item title=\"" + label + "\">" +
        "<description>" + description +"</description>" +
        "</item>";
				
		Node fragmentNode = docBuilder.parse(new InputSource(new StringReader(item_node_xml))).getDocumentElement();		
		fragmentNode = doc.importNode(fragmentNode, true);
		
		logger.log("Going to add activity '" + label + "'");
		
		activities.insertBefore(fragmentNode, activities.getLastChild());
		
		return doc;
	}
	
	private static void updateLinksToSimpleCheatsheets(Document doc) {
	        NodeList tasks = doc.getElementsByTagName("task");
	        Node task = null;
	        
	        //loop for each task
	        for(int i = 0; i < tasks.getLength(); i++){
	            task = tasks.item(i);
	            String name = task.getAttributes().getNamedItem("name").getNodeValue();
	            
	            //check whether this task maps to a cheat sheet for more than one tools
	            //MPTConstants parent_label = MPTConstants.getByConstant(name + "_parent_label");
	            //name = (parent_label!=null)? parent_label.getMessage():name;
	           
	            //check whether cheat sheet has been modified
	            MPTConstants cs = MPTConstants.getByConstant(name);
	            
	            if (cs != null) {
	            	String csId = cs.getMessage();
	            
	            	if (mod_docs.containsKey(csId)) {	               
	            		logger.log("Updating link in composite cheatsheet at: " + csId);
	            		
	            		Node temp = task.getLastChild().getPreviousSibling();
	            		if(temp.getNodeType() == Node.ELEMENT_NODE){
	            			    Element element = (Element) temp;
	            			    element.setAttribute("value", csId.substring(0, csId.lastIndexOf('.')) + "_custom.xml");
	            		}
	            	}
	            }
	        }
	}
	
	private static void storeModifiedCheatSheets() {
		String temp_path;
		
		for (Entry<String, Document> entry : mod_docs.entrySet()) {
		    String key = entry.getKey();
		    Document doc = entry.getValue();
		   
		    temp_path = storeModifiedCheatSheet(doc, key.substring(0, key.lastIndexOf('.')));
		    logger.log("Modified simple cheatsheet stored at: " + temp_path);
		}
	}
	
	private static String storeModifiedCheatSheet(Document doc, String csId) {
		 String xmlString = null;
		 String fullPath = null;
	     
		 try {  	
	        	TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				
				StreamResult result = new StreamResult(new StringWriter());
				transformer.transform(source, result);
				xmlString = result.getWriter().toString();
				
				//FIXME
				new File(path + File.separator + "migration" + File.separator + "technical").mkdirs();
				
				fullPath = path + File.separator + csId + "_custom.xml";
				 
				FileWriter out = new FileWriter(fullPath);
				out.write(xmlString);
				out.close();				
			
	     } catch (Exception e) {
	    	    logger.log("An exception occurred", e);
	            e.printStackTrace();
	            return null;
	     } 
	        
	     return fullPath;
	}
}
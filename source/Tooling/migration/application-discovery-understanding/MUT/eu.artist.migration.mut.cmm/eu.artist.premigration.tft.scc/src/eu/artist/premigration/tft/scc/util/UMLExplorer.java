package eu.artist.premigration.tft.scc.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import eu.artist.premigration.tft.scc.structures.SearchResult;
import eu.artist.premigration.tft.scc.structures.UmlElement;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class UMLExplorer {
	private int generalizations=0;
	private int hierarchies=0;
	private int aggregation=0;
	
	private void initCounters(){
		generalizations=0;
		hierarchies=0;
		aggregation=0;
	}
	
	
	
	public int getGeneralizationsNumber() {
		return generalizations;
	}



	public int getHierarchiesNumber() {
		return hierarchies;
	}



	public int getAggregationNumber() {
		return aggregation;
	}


	public boolean exploreUML(File file) throws Exception{
		
		initCounters();
		
		boolean retorno=false;
		ArrayList<String> genIds= new ArrayList<String>();
		Scanner scanner = new Scanner(file);
		
		int linNum=0;
		while(scanner.hasNext())
		{
			linNum++;
			String line=scanner.nextLine();
			int linePos=line.indexOf("general=");
			if(linePos>=0)
		    {
				generalizations++;
//		        System.out.println("Generalization "+linNum+":  "+line);
		        String generalId= getGeneral(line);

		        boolean equals=false;
		        for (int i =0; i<genIds.size(); i++){
		        	if (genIds.get(i).equals(generalId)){
		        		equals=true;
		        	}
		        }
		        if (!equals){
			        genIds.add(generalId);
	        		hierarchies++;// this is the counter of the different results
		        }
		    }
			
			linePos=line.indexOf("uml:Aggregation");
			if(linePos>=0)
		    {
				aggregation++;
//		        System.out.println("Aggregation "+linNum+":  "+line);
		    }
		}
			
		return retorno;
	}
	
	public UmlElement exploreComponents(File file) throws Exception{
		
		
		UmlElement retorno= new UmlElement();
		retorno.setName("root");
		retorno.setType("Root");
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
	 
		doc.getDocumentElement().normalize();
	 
		NodeList nList = doc.getElementsByTagName("packagedElement");
		
		for (int i =0; i<nList.getLength(); i++){
			Node nNode = nList.item(i);
			 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	 
				String type= eElement.getAttribute("xmi:type");
				if (type.equals("uml:Component")){
					retorno.addChilds(exploreComponent(eElement));
				}
			}
		}
		
		return retorno;
	}	

	private UmlElement exploreComponent(Element e) throws Exception{
		
		
		UmlElement retorno= new UmlElement();
		retorno.setName(e.getAttribute("name"));
		retorno.setType("Component");
		
		System.out.println("Component: "+e.getAttribute("name"));

		NodeList nList=e.getChildNodes();
		
		for (int i =0; i<nList.getLength(); i++){
			Node nNode = nList.item(i);
			 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				 
				String type= eElement.getAttribute("xmi:type");
				if (type.equals("uml:Component")){
					retorno.addChilds(exploreComponent(eElement));
				}else if(type.equals("uml:Class")) {
					UmlElement ue= new UmlElement();
					ue.setName(eElement.getAttribute("name"));
					ue.setType("Class");
					retorno.addChilds(ue);
					System.out.println("Class: "+eElement.getAttribute("name"));
				}
				
			}
		}
		return retorno;
	}	

	
	public boolean exploreXML(File file) throws Exception{
		
		initCounters();
		
		boolean retorno=false;
		ArrayList<String> genIds= new ArrayList<String>();
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
	 
		doc.getDocumentElement().normalize();
	 
		NodeList nList = doc.getElementsByTagName("generalization");
		
		generalizations=nList.getLength();

		for (int i =0; i<nList.getLength(); i++){
			Node nNode = nList.item(i);
			 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
				Element eElement = (Element) nNode;
	 
				String generalId= eElement.getAttribute("general");
		        boolean equals=false;
		        for (int j =0; j<genIds.size(); j++){
		        	if (genIds.get(j).equals(generalId)){
		        		equals=true;
		        	}
		        }
		        if (!equals){
			        genIds.add(generalId);
		    		hierarchies++;// this is the counter of the different results
		        }
			}
		}

		
		nList = doc.getElementsByTagName("aggregation");
		
		aggregation=nList.getLength();
		
		return retorno;
	}	

	public boolean exploreComponent(File file, ArrayList<UmlElement> childs) throws Exception{
		
		initCounters();
		
		boolean retorno=false;
		ArrayList<String> genIds= new ArrayList<String>();
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
	 
		doc.getDocumentElement().normalize();
	 
		NodeList nList = doc.getElementsByTagName("generalization");
	
		for (int i =0; i<nList.getLength(); i++){
			Node nNode = nList.item(i);
			 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				Element parent = (Element) nNode.getParentNode();
				if (findComponetClass(parent.getAttribute("name"),childs)){
					generalizations++;
					String generalId= eElement.getAttribute("general");
			        boolean equals=false;
			        for (int j =0; j<genIds.size(); j++){
			        	if (genIds.get(j).equals(generalId)){
			        		equals=true;
			        	}
			        }
			        if (!equals){
				        genIds.add(generalId);
			    		hierarchies++;// this is the counter of the different results
			        }
				}
			}

		}

		
		nList = doc.getElementsByTagName("aggregation");
		
		for (int i =0; i<nList.getLength(); i++){
			Node nNode = nList.item(i);
			 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element parent = (Element) nNode.getParentNode();
				if (findComponetClass(parent.getAttribute("name"),childs)){
					aggregation++;
				}
			}
		}
		return retorno;
	}	
	
	private boolean findComponetClass(String className ,ArrayList<UmlElement> childs){
		boolean retorno=false;
		
		for (UmlElement e : childs){
			if(e.getName().equals(className)){
				retorno=true;
				break;
			}
		}
		
		return retorno;
	}

	private String getGeneral(String line) throws Exception{
		String retorno="";
		int linePos=line.indexOf("general=");
		retorno=line.substring(linePos+9);
		linePos=retorno.indexOf("\"");
		retorno=retorno.substring(0, linePos);
		
		return retorno;
	}	
	
}

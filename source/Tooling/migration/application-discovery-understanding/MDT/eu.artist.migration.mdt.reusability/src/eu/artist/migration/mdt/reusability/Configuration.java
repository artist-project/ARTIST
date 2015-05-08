package eu.artist.migration.mdt.reusability;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.tecnalia.structures.Project;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import eu.artist.migration.mdt.reusability.beans.DataStorage;
import eu.artist.migration.mdt.reusability.beans.DataStorageFramework;
import eu.artist.migration.mdt.reusability.beans.DataStorageProduct;
import eu.artist.migration.mdt.reusability.beans.ProgrammingLanguage;

public class Configuration {	
	private static ProgrammingLanguage programmingLanguage;
	private static DataStorageFramework dataStorageFramework;
	//protected static String uriMAT = "http://172.25.30.136:8089/ArtistEva/webresources/question/getrtt";
	protected static String uriMAT = "http://54.196.142.179:8080/ArtistEva/webresources/question/getrtt";
	
	//values comming from MAT (two possible values yes or no)
	public static String sameProgramingLanguageMAT ="";
	public static String sameDataStorageProductMAT ="";
	public static String sameDataStorageFrameworkMAT ="";
	public static String sameDataStorageTypeMAT ="";
	public static String dataStorageStoredProcedures ="";
	public static String dataStorageSpecificfunctions ="";
	
	private static DataStorage dataStorage;
	private static String programmingLang = "";
	private static String dataStorageName = "";
	private static String dataStorageFrameworkName = "";
	private static String reusabilityLevel = "";
	static HashMap<String, ProgrammingLanguage> mapProgrammingLanguages = null;
	static HashMap<String, DataStorage> mapDataStorage = null;
	private static DataStorageProduct dataStorageProduct;
	private static String dataStorageProductName;
	static HashMap<String, DataStorageProduct> mapdataStorageProducts = null;
	static HashMap<String, DataStorageFramework> mapDatastorageFrameworks = null;
	static Project projectWithReusabilityConditions;
	
	public static void main (String[] args){
		String strConfigurationFilePath = "D:/Projects/ARTIST/RTT/config.xml";
		setConfigurationFromConfigFile(strConfigurationFilePath);
		
	}

	public static void setConfigurationFromConfigFile(String strConfigurationFilePath){
		
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = null;
            NodeList keywordsChildNodesList = null;
            ArrayList<String> keywordsList = null;
            ArrayList<String> datastorageFrameworkKeywordsList = null;
                     
			try {
				db = dbf.newDocumentBuilder();
			} catch (ParserConfigurationException e) {				
				e.printStackTrace();
			}
            File file = new File(strConfigurationFilePath);
            if (file.exists()) {
                Document doc = null;
				try {
					doc = db.parse(file);
				} catch (SAXException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Element docEle = doc.getDocumentElement();
                Node node = null;
                NodeList programmingLanguagesPropertiesNodeList = null;
                int i = 0;
                int j = 0;
                int k = 0;
                NodeList elementsByTagName = docEle.getElementsByTagName("programming_languages");
                if (elementsByTagName!=null){
                	mapProgrammingLanguages = new HashMap<String,ProgrammingLanguage>(); 
                	Node programmingLanguagesNode = elementsByTagName.item(0);                	                
                	
                	NodeList programmingLanguagesNodeList = programmingLanguagesNode.getChildNodes();
                	
                	while (i < programmingLanguagesNodeList.getLength()){
                		
                		node = programmingLanguagesNodeList.item(i);                		
                		if (node.getNodeName().equalsIgnoreCase("element")){
                			
                			programmingLanguagesPropertiesNodeList = node.getChildNodes();
                			j = 0;
                			
                			while (j < programmingLanguagesPropertiesNodeList.getLength()){
                				
                				Node item = programmingLanguagesPropertiesNodeList.item(j);                				
                				if (item.getNodeName().equalsIgnoreCase("name")){    
                					programmingLanguage = new ProgrammingLanguage();
                					programmingLang = item.getTextContent();                					
                					programmingLanguage.setName(programmingLang);                					                					
                				}
                				if (item.getNodeName().equalsIgnoreCase("source_code-file_ext")){
                					programmingLanguage.setFileExt(item.getTextContent());
                					mapProgrammingLanguages.put(programmingLang, programmingLanguage);
                				}                				                					
                				j++;
                				
                			}//end while
                			
                		}//end if
                		
                		
                		i++;
                	}//end while
                	}//end if
                	i=0;
                	
                	NodeList datastorageNodePropertiesNodeList = null;
                	elementsByTagName = docEle.getElementsByTagName("data_storage");
                    if (elementsByTagName!=null){                    	
                    	mapDataStorage = new HashMap<String,DataStorage>(); 
                    	Node datastorageNode = elementsByTagName.item(0);
                    	reusabilityLevel = datastorageNode.getAttributes().getNamedItem("reusability_level").getNodeValue();
                    	
                    	NodeList datastorageNodeNodeList = datastorageNode.getChildNodes();
                    	
                    	
                    	while (i < datastorageNodeNodeList.getLength()){
                    		
                    		node = datastorageNodeNodeList.item(i);                		
                    		if (node.getNodeName().equalsIgnoreCase("element")){
                    			
                    			datastorageNodePropertiesNodeList = node.getChildNodes();
                    			j = 0;
                    			
                    			while (j < datastorageNodePropertiesNodeList.getLength()){
                    				
                    				Node item = datastorageNodePropertiesNodeList.item(j);    
                    				dataStorage = new DataStorage();
                    				if (item.getNodeName().equalsIgnoreCase("name")){                     					                    					
                    					dataStorageName=item.getTextContent();                    					                    					
                    				}
                    				if (item.getNodeName().equalsIgnoreCase("keywords")){ 
                    					keywordsChildNodesList = item.getChildNodes();
                    					k=0;
                    					keywordsList = new ArrayList<String>();
                    					while (k < keywordsChildNodesList.getLength()){
                    						Node item2 = keywordsChildNodesList.item(k);
                    						if (item2.getNodeName().equalsIgnoreCase("element")){
                    							keywordsList.add(item2.getTextContent());
                    							
                    						}
                    						k++;
                    					}
                    				}
                    				dataStorage.setName(dataStorageName);
                    				dataStorage.setReusabilityLevel(reusabilityLevel);
                    				dataStorage.setKeywords(keywordsList);
                    				mapDataStorage.put(dataStorageName, dataStorage);
                    				j++;                    				
                    			}//end while                    			
                    		}//end if                    		                    		
                    		i++;
                    	}//end while
                    }//end if	
                    i=0;
                    	
                	NodeList dataStorageProductsNodeList = null;
                	elementsByTagName = docEle.getElementsByTagName("data_storage_products");
                    if (elementsByTagName!=null){                    	
                    	mapdataStorageProducts = new HashMap<String,DataStorageProduct>(); 
                    	Node dataStorageProductNode = elementsByTagName.item(0);                	                
                    	
                    	NodeList dataStorageProductNodeNodeList = dataStorageProductNode.getChildNodes();
                    	
                    	
                    	while (i < dataStorageProductNodeNodeList.getLength()){
                    		
                    		node = dataStorageProductNodeNodeList.item(i);                		
                    		if (node.getNodeName().equalsIgnoreCase("element")){
                    			
                    			dataStorageProductsNodeList = node.getChildNodes();
                    			j = 0;
                    			
                    			while (j < dataStorageProductsNodeList.getLength()){
                    				
                    				Node item = dataStorageProductsNodeList.item(j);                				
                    				if (item.getNodeName().equalsIgnoreCase("name")){                         					
                    					dataStorageProduct = new DataStorageProduct();
                    					dataStorageProductName=item.getTextContent();
                    					dataStorageProduct.setName(dataStorageProductName);
                    					mapdataStorageProducts.put(dataStorageProductName, dataStorageProduct);
                    				}                    				              				                					
                    				j++;                    				
                    			}//end while                    			
                    		}//end if                    		                    		
                    		i++;
                    	}//end while
                    }//end if
                        i=0;                        
                    	NodeList datastorageFrameworksNodePropertiesNodeList = null;
                    	elementsByTagName = docEle.getElementsByTagName("data_storage_frameworks");
                        if (elementsByTagName!=null){                    	
                        	mapDatastorageFrameworks = new HashMap<String,DataStorageFramework>(); 
                        	Node datastorageFrameworkNode = elementsByTagName.item(0);
                        	
                        	reusabilityLevel = datastorageFrameworkNode.getAttributes().getNamedItem("reusability_level").getNodeValue();
                        	
                        	NodeList datastorageFrameworkNodeNodeList = datastorageFrameworkNode.getChildNodes();
                        	
                        	
                        	while (i < datastorageFrameworkNodeNodeList.getLength()){
                        		
                        		node = datastorageFrameworkNodeNodeList.item(i);                		
                        		if (node.getNodeName().equalsIgnoreCase("element")){
                        			dataStorageFramework = new DataStorageFramework();
                        			dataStorageFramework.setReusabilityLevel(reusabilityLevel);
                        			datastorageFrameworksNodePropertiesNodeList = node.getChildNodes();
                        			j = 0;
                        			
                        			while (j < datastorageFrameworksNodePropertiesNodeList.getLength()){
                        				
                        				Node item = datastorageFrameworksNodePropertiesNodeList.item(j);    
                        				
                        				if (item.getNodeName().equalsIgnoreCase("name")){                     					                    					
                        					dataStorageFrameworkName=item.getTextContent();
                        					dataStorageFramework.setName(dataStorageFrameworkName);
                        				}
                        				else{
	                        				if (item.getNodeName().equalsIgnoreCase("keywords")){ 
	                        					keywordsChildNodesList = item.getChildNodes();
	                        					k=0;
	                        					datastorageFrameworkKeywordsList = new ArrayList<String>();
	                        					while (k < keywordsChildNodesList.getLength()){
	                        						Node item2 = keywordsChildNodesList.item(k);
	                        						if (item2.getNodeName().equalsIgnoreCase("element")){
	                        							datastorageFrameworkKeywordsList.add(item2.getTextContent());
	                        							
	                        						}//end if
	                        						k++;
	                        					}//end while
	                        					dataStorageFramework.setKeywords(datastorageFrameworkKeywordsList);
	                        					
	                        					
	                        				}//end if
	                        				else{
	                        					j++;
	                        					continue;
	                        				}
                        				}                        				                        				                        				                        			
                        				j++;                    				
                        			}//end while
                        			mapDatastorageFrameworks.put(dataStorageFrameworkName, dataStorageFramework);
                        		}//end if                    		                    		
                        		i++;
                        	}//end while                           	                                        	
                    }//end if
            }                              
	}//end method


	public static Project getProjectWithReusabilityConditions() {
		return projectWithReusabilityConditions;
	}

	public static void setProjectWithReusabilityConditions(
			Project projectWithReusabilityConditions) {
		Configuration.projectWithReusabilityConditions = projectWithReusabilityConditions;
	}

}

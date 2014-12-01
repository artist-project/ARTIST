package ll.mde.anymodel2uml.client;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import ll.mde.anymodel2uml.client.GenericElementMessage.Property;

public class IntermediateObject implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private HashMap<String,String> properties = new HashMap<String,String>();
    private HashSet<String> ownedElements = new HashSet<String>();
    private HashSet<String> ownedAttributes = new HashSet<String>();
    private HashSet<String> ownedOperations = new HashSet<String>();
    private HashSet<String> ownedTaggedValues = new HashSet<String>();
    private HashSet<String> relatedElements = new HashSet<String>();
    private String guid;
    private String parentGuid;
    private String umlType;

    private IntermediateObject(GenericElementMessage elementIn, String parentGuidIn)
    {
        
        parentGuid = parentGuidIn;
        
        for (Property elementProperty: elementIn.Properties)
        {
          
            if(elementProperty != null && elementProperty.Name != null)
            {
                if(elementProperty.Value != null && elementProperty.Value.length == 1 && elementProperty.Value[0]!=null)
                {
                    properties.put(elementProperty.Name, elementProperty.Value[0].toString());
                }
                
                if(elementProperty.Name.compareTo("OwnedElements") == 0)
                {
                    for(Object ownedElementGuid: elementProperty.Value)
                    {
                        ownedElements.add(ownedElementGuid.toString());
                    }
                }
                
                if(elementProperty.Name.compareTo("OwnedAttributes")==0)
                {
                    for(Object ownedAttributesGuid: elementProperty.Value)
                    {
                        ownedAttributes.add(ownedAttributesGuid.toString());
                    }
                }
                
                if(elementProperty.Name.compareTo("OwnedOperations")==0)
                {
                    for(Object ownedPropertyGuid: elementProperty.Value)
                    {
                        ownedOperations.add(ownedPropertyGuid.toString());
                    }
                }
                
                if(elementProperty.Name.compareTo("OwnedTaggedValues") == 0)
                {
                    for(Object ownedTaggedValueGuid: elementProperty.Value)
                    {
                        ownedTaggedValues.add(ownedTaggedValueGuid.toString());
                    }
                }
                
                if(elementProperty.Name.compareTo("RelatedElements")==0)
                {
                    for(Object relatedElement: elementProperty.Value)
                    {
                        relatedElements.add(relatedElement.toString());
                    }
                }
            }

        }
        
        guid = properties.get("Guid");
        umlType = properties.get("UmlType");

    }
    
    public static IntermediateObject createIntermediateObject(GenericElementMessage elementIn, String parentGuidIn)
    {
        return new IntermediateObject(elementIn, parentGuidIn);

    }
    
    public boolean isNull(String name)
    {
        return properties.get(name) == null;
    }
    
    public boolean isNullOrEmpty(String name)
    {
        return properties.get(name) == null || properties.get(name).compareTo("") == 0;
    }
    
    public boolean hasValue(String name, String compareTo)
    {
        return hasValue(name, compareTo, false);
    }
    
    public boolean hasValue(String name, String compareTo, boolean ignorecase)
    {
        String propVal =  properties.get(name);
        if (propVal != null)
        {
            if (ignorecase)
            {
                return propVal.compareToIgnoreCase(compareTo) == 0;
            }
            return propVal.compareTo(compareTo) == 0;
        }
        return false;
    }
        
    public int getIntValue(String name, int defaultValue)
    {
        String propVal =  properties.get(name);
        if (propVal != null)
        {           
            try  
            {  
                return Integer.parseInt(propVal);                 
            } catch(NumberFormatException nfe)  
            {  
                return defaultValue;
            }  
        }
        return defaultValue;
    }
    
    public String getValue(String name, String defaultValue)
    {
        String propVal =  properties.get(name);
        if (propVal != null)
        {
            return propVal;                             
        }
        return defaultValue;
    }
    
    public String getProperty(String nameIn)
    {
        return properties.get(nameIn);
    }
    
    public String getGuid()
    {
        return guid;
    }
    
    public HashSet<String> getOwnedElementGuids()
    {
        return ownedElements;
    }
    
    public HashSet<String> getOwnedOperationGuids()
    {
        return ownedOperations;
    }
    
    public HashSet<String> getOwnedAttributeGuids()
    {
        return ownedAttributes;
    }
    
    public HashSet<String> getOwnedTaggedValueGuids()
    {
        return ownedTaggedValues;
    }
    
    public HashSet<String> getRelatedElements()
    {
        return relatedElements;
    }
    
    public String getParentGuid()
    {
        return parentGuid;
    }
    
    public String getUmlType()
    {
        return umlType;
    }

    public TreeSet<String> getOrderedTaggedValueNames()
    {
    	TreeSet<String> taggedValues = new TreeSet<String>();
	    for (String ownedTaggedValueGuid: getOwnedTaggedValueGuids())
	    {
	        IntermediateObject intermediateObj = ModelData.elements.get(ownedTaggedValueGuid);
	        if (intermediateObj != null && intermediateObj.getProperty("Name") != null)
	        {
	        	taggedValues.add(intermediateObj.getProperty("Name"));
	        }
	    }
	    return taggedValues;
    }

    public String getStereotypeKey(TreeSet<String> orderedTaggedValueNames)
    {
    	String stereotypeKey = getUmlType() + "_";
    	for (String taggedValueName: orderedTaggedValueNames)
	    {
    		stereotypeKey += taggedValueName;
	    }
	    
	    return stereotypeKey;
    }

    public String getStereotypeKey()
    {
	    return getStereotypeKey(getOrderedTaggedValueNames());
    }
}

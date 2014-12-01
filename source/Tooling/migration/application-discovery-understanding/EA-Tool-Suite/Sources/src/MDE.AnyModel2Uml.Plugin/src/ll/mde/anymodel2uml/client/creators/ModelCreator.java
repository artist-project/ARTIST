package ll.mde.anymodel2uml.client.creators;

import java.util.HashMap;

import ll.mde.anymodel2uml.client.IntermediateObject;
import ll.mde.anymodel2uml.client.ModelData;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.VisibilityKind;

public class ModelCreator
{
    public HashMap<String,IUmlElementCreator> elementCreators = new HashMap<String,IUmlElementCreator>();
    
    public void buildUmlModelRecursive(String objectGuidIn)
    {
        IntermediateObject intermediateObject = ModelData.elements.get(objectGuidIn);
        if(intermediateObject == null)
        {
            return;
        }   
        
        addUml2Element(objectGuidIn);
        
        for (String ownedElementGuid: intermediateObject.getOwnedElementGuids())
        {
            buildUmlModelRecursive(ownedElementGuid);
        }

    }
    
    public static boolean isPartialClass(IntermediateObject objectToCreate)
    {
        for (String ownedTaggedValueGuid: objectToCreate.getOwnedTaggedValueGuids())
        {
            IntermediateObject intermediateObj = ModelData.elements.get(ownedTaggedValueGuid);
            if (intermediateObj != null && intermediateObj.hasValue("Name", "partial"))
            {
                return true;
            }
        }
        return false;
    }
    
    private void addUml2Element(String intermediateObjectGuidIn)
    {
        IntermediateObject objectToCreate = ModelData.elements.get(intermediateObjectGuidIn);
        if(objectToCreate == null)
        {
            return;
        }
        Element newUmlElement = null;
        
        String umlType = objectToCreate.getUmlType();
        
        if (elementCreators.containsKey(umlType))
        {
            // Get Parent
            Element parentUmlElement = null;
            String parentGuid = objectToCreate.getParentGuid();
            if(parentGuid != null)
            {
                parentUmlElement = ModelData.uml2Elements.get(parentGuid);          
            }
            
            if(parentUmlElement == null)
            {
                parentUmlElement = ModelData.uml2Root;
            }
            
            // Get Creator for UmlType
            IUmlElementCreator creator = elementCreators.get(umlType);
            
            newUmlElement = creator.create(parentUmlElement, objectToCreate);
            
            // Save Element Data
            ModelData.uml2Elements.put(objectToCreate.getGuid(), newUmlElement); 
            
            // Do additional Manipulation
            if(newUmlElement instanceof NamedElement)
            {
                ((NamedElement)newUmlElement).setVisibility(VisibilityKind.get(objectToCreate.getProperty("Visibility").toLowerCase()));
                if (!objectToCreate.isNullOrEmpty("Documentation"))
                {
                    Comment elementComment = ((NamedElement)newUmlElement).createOwnedComment();
                    elementComment.setBody(objectToCreate.getProperty("Documentation"));
                }

                if(!objectToCreate.getOwnedTaggedValueGuids().isEmpty())
                {
                	Stereotype stereotype = ModelData.stereotype_Extenders.get(objectToCreate.getStereotypeKey());
                	if(((NamedElement)newUmlElement).isStereotypeApplicable(stereotype) && !((NamedElement)newUmlElement).isStereotypeApplied(stereotype))
                	{
	                	((NamedElement)newUmlElement).applyStereotype(stereotype);
	                	
		                for (String ownedTaggedValueGuid: objectToCreate.getOwnedTaggedValueGuids())
		                {
		                    IntermediateObject intermediateObj = ModelData.elements.get(ownedTaggedValueGuid);
		                    if (intermediateObj != null && intermediateObj.getProperty("Name") != null)
		                    {
		                    	((NamedElement)newUmlElement).setValue(stereotype, intermediateObj.getProperty("Name"), intermediateObj.getValue("Value", ""));
		                    	
		                        //Comment elementComment = ((NamedElement)newUmlElement).createOwnedComment();
		                        //elementComment.setBody("TaggedValue - Name: " + intermediateObj.getValue("Name", "") + "; Value: " + intermediateObj.getValue("Value", ""));
		                    }
		                }
                	}
                }
            }
            
            if(newUmlElement instanceof Classifier)
            {
                if(objectToCreate.hasValue("IsAbstract", "true", true))
                {
                    ((Classifier)newUmlElement).setIsAbstract(true);
                }
                else
                {
                    ((Classifier)newUmlElement).setIsAbstract(false);
                }
            }
            
            if(newUmlElement instanceof RedefinableElement)   
            {    
                if(objectToCreate.hasValue("IsLeaf", "true", true))
                {
                	((RedefinableElement)newUmlElement).setIsLeaf(true);
                }
                else
                {
                	((RedefinableElement)newUmlElement).setIsLeaf(false);
                }
            }
            
            if(newUmlElement instanceof Class)
            {
                if(objectToCreate.hasValue("IsActive", "true", true))
                {
                    ((Class)newUmlElement).setIsActive(true);
                }
                else
                {
                    ((Class)newUmlElement).setIsActive(false);
                }
            }
            
            if(newUmlElement instanceof MultiplicityElement)
            {
                try
                {
                    int lowerBound = objectToCreate.getIntValue("LowerBound", 0);                    
                    ((MultiplicityElement)newUmlElement).setLower(lowerBound);
                    
                    String upper = objectToCreate.getValue("UpperBound", "0");
                    
                    if (upper.equals("*"))
                    {                    
                        ((MultiplicityElement)newUmlElement).setUpper(Integer.MAX_VALUE);
                    } else 
                    {
                        ((MultiplicityElement)newUmlElement).setUpper(Integer.parseInt(upper));
                    }
                }
                catch(NumberFormatException numberExcp){}
            }
        }      
    
    }
}

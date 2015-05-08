package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;
import ll.mde.anymodel2uml.client.ModelData;

import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;

public class RealizationCreator implements IUmlElementCreator
{

    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
    	Classifier target = null;
        Classifier source = null;
        
        if(objectToCreate.getRelatedElements().toArray().length > 1)
        {
            if(objectToCreate.getProperty("Target").equals(objectToCreate.getRelatedElements().toArray() [0]))
            { 
          	  target = (Classifier) ModelData.uml2Elements.get(objectToCreate.getRelatedElements().toArray()[0]);
          	  source = (Classifier) ModelData.uml2Elements.get(objectToCreate.getRelatedElements().toArray()[1]);
            }
            else
            {    
          	  target = (Classifier) ModelData.uml2Elements.get(objectToCreate.getRelatedElements().toArray()[1]);
          	  source = (Classifier) ModelData.uml2Elements.get(objectToCreate.getRelatedElements().toArray()[0]);
            }
        }    
        
        if(target==null || source==null)
        {
            return null;
        }
        
        try
        {
	        Realization realize;
	        
	        if(target instanceof ClassImpl)
	        {
	      	  realize = ((BehavioredClassifier)target).createInterfaceRealization(objectToCreate.getValue("Name", ""), (Interface)source);
	        }
	        else
	        {
	      	  realize = ((BehavioredClassifier)source).createInterfaceRealization(objectToCreate.getValue("Name", ""), (Interface)target);
	        }
	        
	        return realize;
        }
        catch(Exception e)
        {
        	return null;
        }
    }

}

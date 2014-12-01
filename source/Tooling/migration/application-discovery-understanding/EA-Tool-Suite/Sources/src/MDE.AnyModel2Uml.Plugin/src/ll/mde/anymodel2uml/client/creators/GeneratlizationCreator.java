package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;
import ll.mde.anymodel2uml.client.ModelData;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;

public class GeneratlizationCreator implements IUmlElementCreator
{

    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
      Classifier target = null;
      Classifier source = null;
      
      if(objectToCreate.getRelatedElements().toArray().length > 1)
      {
          if(objectToCreate.getProperty("Target").equals(objectToCreate.getRelatedElements().toArray() [0]))
          { target = (Classifier) ModelData.uml2Elements.get(objectToCreate.getRelatedElements().toArray()[0]);
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
      
      Generalization generalization = source.createGeneralization(target );
      
      return generalization;
    }

}

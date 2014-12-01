package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;
import ll.mde.anymodel2uml.client.ModelData;

import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Package;

public class PackageImportCreator implements IUmlElementCreator {

    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
    	Package target = null;
        Classifier source = null;
        
        if(objectToCreate.getRelatedElements().toArray().length > 1)
        {
            if(objectToCreate.getProperty("Target").equals(objectToCreate.getRelatedElements().toArray() [0]))
            { 
          	  target = (Package) ModelData.uml2Elements.get(objectToCreate.getRelatedElements().toArray()[0]);
          	  source = (Classifier) ModelData.uml2Elements.get(objectToCreate.getRelatedElements().toArray()[1]);
            }
            else
            {    
          	  target = (Package) ModelData.uml2Elements.get(objectToCreate.getRelatedElements().toArray()[1]);
          	  source = (Classifier) ModelData.uml2Elements.get(objectToCreate.getRelatedElements().toArray()[0]);
            }
        }
        
        return source.createPackageImport(target);
    }

}

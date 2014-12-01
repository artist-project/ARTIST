package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;

import org.eclipse.uml2.uml.Element;

public class PackageCreator implements IUmlElementCreator
{
    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
        org.eclipse.uml2.uml.Package newPackage = ((org.eclipse.uml2.uml.Package)parent).createNestedPackage(objectToCreate.getProperty("Name")); 
    	return newPackage;
    }

}

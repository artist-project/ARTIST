package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.VisibilityKind;

public class EnumerationCreator implements IUmlElementCreator
{

    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
        //((org.eclipse.uml2.uml.Package)parent)
        org.eclipse.uml2.uml.Enumeration newEnumeration = null;
        if (parent instanceof org.eclipse.uml2.uml.Package)
        {
            newEnumeration = ((org.eclipse.uml2.uml.Package)parent).createOwnedEnumeration(objectToCreate.getProperty("Name"));
        } else 
        {
            newEnumeration = (parent.getNearestPackage()).createOwnedEnumeration(objectToCreate.getProperty("Name"));
        }
        
        newEnumeration.setVisibility(VisibilityKind.get(objectToCreate.getProperty("Visibility")));
        
        return newEnumeration;
    }

}

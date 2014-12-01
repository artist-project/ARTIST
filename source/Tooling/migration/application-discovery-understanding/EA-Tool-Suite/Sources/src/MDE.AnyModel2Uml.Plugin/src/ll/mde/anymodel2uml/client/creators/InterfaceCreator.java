package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.VisibilityKind;

public class InterfaceCreator implements IUmlElementCreator
{

    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
        org.eclipse.uml2.uml.Interface newInterface = ((org.eclipse.uml2.uml.Package)parent).createOwnedInterface(objectToCreate.getProperty("Name"));
        
        if (!objectToCreate.isNull("NamespaceString"))
        {
            Comment namespace =  newInterface.createOwnedComment();
            namespace.setBody("Namespace: " +objectToCreate.getProperty("NamespaceString"));
        }
        
        newInterface.setVisibility(VisibilityKind.get(objectToCreate.getProperty("Visibility")));
        
        return newInterface;
    }

}

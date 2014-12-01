package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;

import org.eclipse.uml2.uml.Element;

public interface IUmlElementCreator
{
    public Element create(Element parent, IntermediateObject objectToCreate);
    
}

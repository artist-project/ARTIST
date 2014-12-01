package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;
import ll.mde.anymodel2uml.client.ModelData;

import org.eclipse.uml2.uml.*;

public class ClassCreator implements IUmlElementCreator
{
    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
        String className = objectToCreate.getProperty("Name");
        boolean isAbstract = false;
        org.eclipse.uml2.uml.Class newClass = null;
        if (ModelCreator.isPartialClass(objectToCreate))
        {
            newClass = (org.eclipse.uml2.uml.Class)ModelData.partials.get(className);
        }
                
        if (newClass == null)
        {
            if (parent instanceof org.eclipse.uml2.uml.Package)
            {
                newClass = ((org.eclipse.uml2.uml.Package)parent).createOwnedClass(className, isAbstract);
            } else 
            {
                newClass = (parent.getNearestPackage()).createOwnedClass(className, isAbstract);
            }
            ModelData.partials.put(className, newClass);            
            if (!objectToCreate.isNull("NamespaceString"))
            {
                Comment namespace =  newClass.createOwnedComment();
                namespace.setBody("Namespace: " +objectToCreate.getProperty("NamespaceString"));
            }
            
        }
        newClass.setIsActive(objectToCreate.hasValue("IsActive", "true"));
        return newClass;
    }
}

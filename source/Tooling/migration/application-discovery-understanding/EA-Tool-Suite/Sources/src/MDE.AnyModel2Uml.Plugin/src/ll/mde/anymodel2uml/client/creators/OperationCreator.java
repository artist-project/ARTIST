package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;
import ll.mde.anymodel2uml.client.ModelData;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.*;

public class OperationCreator implements IUmlElementCreator
{

    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {

        String stereotype = objectToCreate.getProperty("Stereotype");
    
        //check whether the operation is a C# property
        if(stereotype != null && stereotype.compareTo("property")==0)
        {
            org.eclipse.uml2.uml.Property attribute = null;
            Type attType = ModelData.getType(objectToCreate);
            
            if (parent instanceof StructuredClassifier)
            {
                StructuredClassifier parentClassifier = (StructuredClassifier) parent;
                attribute = parentClassifier.createOwnedAttribute(objectToCreate.getProperty("Name"),attType);
            }
            
            return attribute;

        }
        
        //otherwise create operation
        else
        {
            org.eclipse.uml2.uml.Operation newOperation = null;
            
            EList<String> parameterNames = new BasicEList<String>();
            EList<Type> parameterTypes = new BasicEList<Type>();
            
            Type returnType = null;
            
            for(String ownedElementGuid: objectToCreate.getOwnedElementGuids())
            {
                IntermediateObject ownedElement = ModelData.elements.get(ownedElementGuid);
                
                if(ownedElement.getProperty("UmlType").compareTo("Parameter")==0)
                {
                    if(ownedElement.getProperty("Name").compareTo("return")==0)
                    {
                        returnType = ModelData.getType(ownedElement);
                    }
                    else
                    {
                        parameterNames.add(ownedElement.getProperty("Name"));
                        parameterTypes.add(ModelData.getType(ownedElement));
                    }                
                }
                
            }
            
         
            if(parent instanceof org.eclipse.uml2.uml.Class)
            {
                newOperation = ((org.eclipse.uml2.uml.Class)parent).createOwnedOperation(objectToCreate.getProperty("Name"),parameterNames,parameterTypes,returnType);
            }
            else if(parent instanceof Interface)
            {
                newOperation = ((org.eclipse.uml2.uml.Interface)parent).createOwnedOperation(objectToCreate.getProperty("Name"),parameterNames,parameterTypes,returnType);
            }
            
            if (!objectToCreate.isNull("Code"))
            {                
                Comment operationComment = newOperation.createOwnedComment();
                operationComment.setBody(objectToCreate.getProperty("Code"));
            }
            
            
            return newOperation;
        }

    }
   
}

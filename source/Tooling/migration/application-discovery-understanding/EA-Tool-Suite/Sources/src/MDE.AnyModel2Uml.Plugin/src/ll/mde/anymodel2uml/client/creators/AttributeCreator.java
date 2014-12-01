package ll.mde.anymodel2uml.client.creators;

import ll.mde.anymodel2uml.client.IntermediateObject;
import ll.mde.anymodel2uml.client.ModelData;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;

public class AttributeCreator implements IUmlElementCreator
{

    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
        Type attType = ModelData.getType(objectToCreate);
      if (parent instanceof StructuredClassifier)
      {
          StructuredClassifier parentClassifier = (StructuredClassifier) parent;
         
          org.eclipse.uml2.uml.Property attribute = parentClassifier.createOwnedAttribute(objectToCreate.getProperty("Name"),attType);
          attribute.setAggregation(AggregationKind.get(objectToCreate.getProperty("AggregationKind").toLowerCase()));
          attribute.setDefault(objectToCreate.getProperty("Default"));
          
          return attribute;
          
      } else if (parent instanceof Enumeration)
      {
          Enumeration parentEnum = (Enumeration) parent;
          org.eclipse.uml2.uml.Property attribute = parentEnum.createOwnedAttribute(objectToCreate.getProperty("Name"),attType);
          
          attribute.setAggregation(AggregationKind.get(objectToCreate.getProperty("AggregationKind").toLowerCase()));
          attribute.setDefault(objectToCreate.getProperty("Default"));
          
          return attribute;
      } else if (parent instanceof org.eclipse.uml2.uml.Class)
      {
    	  org.eclipse.uml2.uml.Class parentClass = (org.eclipse.uml2.uml.Class) parent;
          org.eclipse.uml2.uml.Property attribute = parentClass.createOwnedAttribute(objectToCreate.getProperty("Name"),attType);
          
          attribute.setAggregation(AggregationKind.get(objectToCreate.getProperty("AggregationKind").toLowerCase()));
          attribute.setDefault(objectToCreate.getProperty("Default"));
      }
      return null;
    }

}

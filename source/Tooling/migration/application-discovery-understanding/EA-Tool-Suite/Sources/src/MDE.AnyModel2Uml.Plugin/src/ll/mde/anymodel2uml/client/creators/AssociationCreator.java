package ll.mde.anymodel2uml.client.creators;

import java.util.HashSet;

import ll.mde.anymodel2uml.client.IntermediateObject;
import ll.mde.anymodel2uml.client.ModelData;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Type;

public class AssociationCreator implements IUmlElementCreator
{

    @Override
    public Element create(Element parent, IntermediateObject objectToCreate)
    {
        
      
      HashSet<String> ownedElementGuids = objectToCreate.getOwnedElementGuids();
      
      
      IntermediateObject sourceEnd = null;
      IntermediateObject destinationEnd = null;
      
      Type destinationType = null;
      
      
      
      //Find Connector Ends
      for(String guid: ownedElementGuids)
      {
          IntermediateObject testObject = ModelData.elements.get(guid);
          if(testObject.hasValue("PropertyKind", "AssociationEnd"))
          { 
              //Test if it is a source or destination end
              if(testObject.getGuid().contains("src"))
              {
                  sourceEnd = testObject;
              }
              else if(testObject.getGuid().contains("dst"))
              {
                  destinationEnd = testObject;                    
                  destinationType = getDestType(guid, objectToCreate);
              }
          }
      }
      
      if(sourceEnd == null || destinationEnd == null)
      {
          return null;
      }

      boolean end1IsNavigable = (sourceEnd.hasValue("IsNavigable", "true"));

      AggregationKind end1Aggregation = AggregationKind.get(sourceEnd.getProperty("AggregationKind").toLowerCase());
      String end1Name = sourceEnd.getProperty("Name");
      
      int end1LowerBound;
      try
      {
          end1LowerBound = Integer.parseInt(sourceEnd.getProperty("LowerBound"));
      }
      catch(NumberFormatException e)
      {
          end1LowerBound = 0;
      }
      
      if(end1LowerBound < 0)
      {
          end1LowerBound = 0;
      }
      
      int end1UpperBound;
      try
      {
          end1UpperBound = Integer.parseInt(sourceEnd.getProperty("UpperBound"));
      }
      catch(NumberFormatException e)
      {
          end1UpperBound = -1;
      }

      boolean end2IsNavigable = (destinationEnd.hasValue("IsNavigable", "true")); 
      AggregationKind end2Aggregation = AggregationKind.get(destinationEnd.getProperty("AggregationKind").toLowerCase());
      String end2Name = destinationEnd.getProperty("Name");

      int end2LowerBound;
      try
      {
          end2LowerBound = Integer.parseInt(destinationEnd.getProperty("LowerBound"));
      }
      catch(NumberFormatException e)
      {
          end2LowerBound = 0;
      }
      
      if(end2LowerBound < 0)
      {
          end2LowerBound = 0;
      }
      
      int end2UpperBound;
      try
      {
          end2UpperBound =  Integer.parseInt(destinationEnd.getProperty("UpperBound"));
      }
      catch(NumberFormatException e)
      {
          end2UpperBound = -1;
      }
      
      //creation:
      Association association = ((Type)parent).createAssociation(end1IsNavigable, end1Aggregation, end1Name, end1LowerBound, end1UpperBound,
              destinationType, end2IsNavigable, end2Aggregation, end2Name, end2LowerBound, end2UpperBound);
      
      
      return association;
    }
    
  private static Type getDestType(String guid, IntermediateObject intermediateObjectIn)
  {
      String typeName = ModelData.elements.get(guid).getProperty("TypeString");
      //Find Connector Ends
      for(String relatedGuid: intermediateObjectIn.getRelatedElements())
      {
          IntermediateObject element =  ModelData.elements.get(relatedGuid);
          if (element.getProperty("Name").equals(typeName))
          {
              return (Type)ModelData.uml2Elements.get(relatedGuid);
              //return getPrimitiveType(element.getUmlType());    
          }            
      }
      return ModelData.getPrimitiveType(typeName);
  }

}

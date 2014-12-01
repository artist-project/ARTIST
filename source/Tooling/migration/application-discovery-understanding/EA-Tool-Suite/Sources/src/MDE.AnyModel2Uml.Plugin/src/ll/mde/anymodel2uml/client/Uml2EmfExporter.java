package ll.mde.anymodel2uml.client;

import java.io.IOException;
import java.util.Map;
import java.util.TreeSet;

import ll.mde.anymodel2uml.client.creators.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import ll.mde.anymodel2uml.plugin.artistconsole.ArtistConsole;
import eneter.messaging.diagnostic.EneterTrace;


public class Uml2EmfExporter implements Runnable
{
    private AnyModel2UmlBridge bridge;
    private String rootGuid;
    private ModelCreator creator = new ModelCreator();
    public int count = 0;
    
    private Thread t;
    private URI targetUri;
    
    public Uml2EmfExporter(URI target)
    {
    	targetUri = target;
    }
    
    
    public void BeginExport()
    {   
        if(t == null)
        {
        	t = new Thread(this);
        	t.start();        	
        }        
    }
    
    private Model createModel(String nameIn) {
        
        Model model = UMLFactory.eINSTANCE.createModel();

        return model;
    }
    
    private Profile createProfile(String nameIn) {
        
    	Profile profile = UMLFactory.eINSTANCE.createProfile();
    	profile.setName(nameIn);

        return profile;
    }

    private org.eclipse.uml2.uml.Package loadPackage( final String uri )
    {
       ResourceSet resourceSet = new ResourceSetImpl();
       UMLResourcesUtil.init(resourceSet);
      final Resource resource = resourceSet.getResource( URI.createURI( uri ), true );
      EcoreUtil.resolveAll( resource );
      return (org.eclipse.uml2.uml.Package) EcoreUtil.getObjectByType( resource.getContents(), UMLPackage.Literals.PACKAGE );
    }
    
	@Override
	public void run() {
        ModelData.reset();
        
		// TODO Auto-generated method stub
		try
        {        	
        	bridge = AnyModel2UmlBridge.getInstance("127.0.0.1", 8932, 10000*100);
        	
            ArtistConsole.WriteToConsole("== Loading Elements ==");
            
            GenericElementMessage rootElement = bridge.getElementByGuid("");
            
            IntermediateObject rootIntermediateObject = IntermediateObject.createIntermediateObject(rootElement,null);
            getElementsRecursive(rootIntermediateObject.getGuid(),"");
            
            bridge.detach();            
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            ArtistConsole.WriteToConsole(e.toString());
            EneterTrace.error("Client failed.", e);
        }
            
//        ========= Code to load Elements to a file for faster debugging with big models ==========
//        =========================================================================================
//        System.out.println("== Elements loaded ==");
//        
//        File file = new File("out\\bigModel");  
//        FileOutputStream f;
//        try
//        {
//            f = new FileOutputStream(file);
//            ObjectOutputStream s = new ObjectOutputStream(f);          
//            s.writeObject(elements);
//            s.close();
//        }
//        catch (FileNotFoundException e)
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        catch (IOException e)
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }  
//
//        System.out.println("== Elements saved ==");
        
        
//        File file = new File("out\\bigModel");
//        FileInputStream f;
//        try
//        {
//            f = new FileInputStream(file);
//            ObjectInputStream s = new ObjectInputStream(f);
//            elements = (HashMap<String, IntermediateObject>) s.readObject();
//            s.close();
//        }
//        catch (FileNotFoundException e)
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        catch (IOException e)
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        catch (ClassNotFoundException e)
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        ArtistConsole.WriteToConsole("== Elements loaded ==");
        
        ArtistConsole.WriteToConsole("== start building UML model ==");
        
        ResourceSet resourceSet = new ResourceSetImpl();
        UMLResourcesUtil.init(resourceSet);
        Resource resource = resourceSet.createResource(targetUri);
        
    	ModelData.setMetaModel(loadPackage(UMLResource.UML_METAMODEL_URI));
    	
        ModelData.uml2Root = createModel("EA_Model");        
        resource.getContents().add(ModelData.uml2Root);
        
        
        //Start Creating Stereotypes - current for Classes - and add all their TaggedValues
        ModelData.eaExportHelper = createProfile("EA_Export_Helper");
        resource.getContents().add(ModelData.eaExportHelper);
        ModelData.eaExportHelper.createMetamodelReference(ModelData.umlMetamodel);
         
    	for (Map.Entry<String, IntermediateObject> entry : ModelData.elements.entrySet()) {
    	    IntermediateObject objectToCreate = entry.getValue();
    	    String umlType = objectToCreate.getUmlType();
    	    
    	    if(umlType != null)
    	    {
    	    	if(!objectToCreate.getOwnedTaggedValueGuids().isEmpty())
    	    	{
    	    		TreeSet<String> orderedTaggedValueNames = objectToCreate.getOrderedTaggedValueNames();
    	    		String stereotypeKey = objectToCreate.getStereotypeKey(orderedTaggedValueNames);
		            
		            if(!ModelData.stereotype_Extenders.containsKey(stereotypeKey))
		            {
	    	    		Stereotype stereotype = ModelData.eaExportHelper.createOwnedStereotype(stereotypeKey, false);
			            for (String taggedValue: orderedTaggedValueNames)
			            {
		                	stereotype.createOwnedAttribute(taggedValue, ModelData.getPrimitiveType("String"));
			            }
	    	            ModelData.stereotype_Extenders.put(stereotypeKey, stereotype);
		            }
		        	ModelData.extendMetaclass( umlType, ModelData.stereotype_Extenders.get(stereotypeKey) );
    	    	}
    	    }
    	}    	
        
    	ModelData.eaExportHelper.define();
    	ModelData.uml2Root.applyProfile(ModelData.eaExportHelper);
    	//End Creating Stereotypes
    	
        
        // Buidling Structure
        creator.elementCreators.put("Package", new PackageCreator());
        creator.elementCreators.put("Class", new ClassCreator());
        creator.elementCreators.put("Interface", new InterfaceCreator());
        creator.elementCreators.put("Enumeration", new EnumerationCreator());
        
        creator.buildUmlModelRecursive(rootGuid);
        
        
        // Buidling Members
        creator.elementCreators.clear();
        creator.elementCreators.put("Property", new AttributeCreator());
        creator.elementCreators.put("Operation", new OperationCreator());
        creator.elementCreators.put("Comment", new CommentCreator());
        creator.buildUmlModelRecursive(rootGuid);
        
        // Building Connectors
        creator.elementCreators.clear();
        creator.elementCreators.put("Generalization", new GeneratlizationCreator());
        creator.elementCreators.put("Association", new AssociationCreator());
        creator.elementCreators.put("Realization", new RealizationCreator());
        creator.elementCreators.put("PackageImport", new PackageImportCreator());
        
        creator.buildUmlModelRecursive(rootGuid);
        
        //buildUmlModelRecursive(rootGuid);
        
//        ============== FOR DEBUGGING ================
//        buildUmlModelRecursive("{25CB1803-12A5-47b7-BF59-0C80F57AA528}");
//        =============================================

        //connectUml2Elements();

        //URI fileUri = URI.createFileURI("out").appendSegment("export").appendFileExtension(UMLResource.FILE_EXTENSION);

        try {
            resource.save(null);
            ArtistConsole.WriteToConsole("== saved ==");
        } catch (IOException ioe) {
            ArtistConsole.WriteToConsole(ioe.getMessage());
        }
    }
    
    private IntermediateObject getElementsRecursive(String guid, String parentGuid)
    {
        ArtistConsole.WriteToConsole("--- Requesting Element: "+ guid);
        
        IntermediateObject newIntermediateObject = null;
        
        try
        {
            GenericElementMessage newElement = bridge.getElementByGuid(guid);
            
            newIntermediateObject = IntermediateObject.createIntermediateObject(newElement, parentGuid);
            ModelData.elements.put(guid, newIntermediateObject);
            
            //addUml2Element(newIntermediateObject);
            
            for (String ownedElementGuid: newIntermediateObject.getOwnedElementGuids())
            {
                getElementsRecursive(ownedElementGuid,guid);
            }
            
        }
        catch (Exception e)
        {   
            e.printStackTrace();
        }
        
        return newIntermediateObject;
	}
    


}

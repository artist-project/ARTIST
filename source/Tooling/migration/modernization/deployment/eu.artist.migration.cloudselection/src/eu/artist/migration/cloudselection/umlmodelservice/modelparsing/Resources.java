package eu.artist.migration.cloudselection.umlmodelservice.modelparsing;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.uml2.uml.Profile;

import eu.artist.migration.cloudselection.viewdatamodel.EnumerationProperty;
import eu.artist.migration.cloudselection.viewdatamodel.HelperElement;
import eu.artist.migration.cloudselection.viewdatamodel.LeafEnumValue;
import eu.artist.migration.cloudselection.viewdatamodel.LeafHLEvaluationProperty;
import eu.artist.migration.cloudselection.viewdatamodel.LeafProperty;
import eu.artist.migration.cloudselection.viewdatamodel.ServiceElement;

public abstract class Resources {


	//public Map<String,Resource> providersResources = new HashMap<String, Resource>();
	public static Map<String,String> namesAndPaths = new HashMap<String, String>();
	
	public static HelperElement serviceGroups;
	public static HelperElement commonFeatures;
	private static boolean loadedCoreres = false;
	
	
	public static void loadProviderPath(String targetName, String targetPath){
		namesAndPaths.put(targetName, targetPath);
	}
	
	public void unloadTargets(){
		namesAndPaths = new HashMap<String, String>();
	}
	
	public static void loadCoreResource(String pathToModelFile){
		String path = pathToModelFile;
		commonFeatures = new HelperElement();
		serviceGroups = new HelperElement();
		try{
			if (!loadedCoreres) {
				Resource res = loadResource(path);
				Profile profile = (Profile)res.getContents().get(0);
				EList<NamedElement> elements = profile.getOwnedMembers();
				int count = elements.size();
				for (int i=0; i<count; i++){
					if (elements.get(i) instanceof Profile){
						populateServiceGroup((Profile)elements.get(i));
					}
					else if (elements.get(i).getName().equals("CommonFeatures")){
						populateComonFeatures(elements.get(i));
					}
					}
				loadedCoreres = true;
				for (Resource r : res.getResourceSet().getResources()){
					r.unload();
				}
					
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}		
			
	public static void unloadProviders(){
		namesAndPaths = new HashMap<String, String>();
	}
	
	public static void populateComonFeatures(NamedElement commonFeaturesStereo){
		HelperElement generals = new HelperElement("GeneralFeatures");
		commonFeatures.addChild(generals);
		HelperElement hlEvaluation = new HelperElement("Advanced service level in");
		commonFeatures.addChild(hlEvaluation);
		EList<Element> elements2 = commonFeaturesStereo.allOwnedElements();
		int count2 = elements2.size();
		for (int j=0; j<count2; j++){
			Element aCommonFeature = elements2.get(j);
			if (aCommonFeature instanceof Property){
				Property curProp = (Property)aCommonFeature;
				Type curType = curProp.getType();
				if (curType instanceof Enumeration){	
					if (curType.getName().equals("HighLevelEvaluation")){
						LeafHLEvaluationProperty s = new LeafHLEvaluationProperty(false, curProp.getName(), commonFeaturesStereo.getName()); 
						hlEvaluation.addChild(s);
					}
					else{
						EnumerationProperty curList = new EnumerationProperty(curProp.getName(), commonFeaturesStereo.getName());
						EList<Element> elements3 = curType.allOwnedElements();
						int count3 = elements3.size();
						for (int l=0; l<count3; l++){
							Element curEl = elements3.get(l);
							if (curEl instanceof EnumerationLiteral){
								curList.addChild(new LeafEnumValue(((EnumerationLiteral)curEl).getName(), false));
							}
						}
						commonFeatures.addChild(curList);
					}
				}else if (curType instanceof PrimitiveType){
					if (curType.getName().equals("Boolean")){
						LeafProperty s = new LeafProperty(false, ((Property)curProp).getName(), commonFeaturesStereo.getName()); 
						generals.addChild(s);
					}
				}					
			}
		}

	}

	private static void populateServiceGroup(Profile curProf){
		HelperElement serviceGroup = new HelperElement(curProf.getName());
		serviceGroups.addChild(serviceGroup);
		EList<NamedElement> profElements = curProf.getOwnedMembers();
		int count2 = profElements.size();
		for (int j=0; j<count2; j++){
			NamedElement curEl = profElements.get(j);
			if (curEl instanceof Stereotype){
				EList<Classifier> types = ((Stereotype) curEl).getGenerals();
				int count3 = types.size();
				for (int l=0; l<count3; l++){
					if (types.get(l).getName().equals("Service")){	
						ServiceElement se = new ServiceElement(((Stereotype)curEl).getName());
						processInfoForService((Stereotype)curEl, se);
						serviceGroup.addChild(se);
					}
				}
			}
		}
	}
	
	private static void processInfoForService(NamedElement service, ServiceElement se){
		EList<Element> serviceElements = service.getOwnedElements();
		int count = serviceElements.size();
		for (int m=0; m<count; m++){
			if (serviceElements.get(m) instanceof Property){
				Property curProp = (Property)serviceElements.get(m);
				Type type = curProp.getType();
				if (type instanceof Enumeration){
					EnumerationProperty enP = new EnumerationProperty(curProp.getName(), service.getName());
					se.addChild(enP);
					EList<Element> enumerations = type.getOwnedElements();
					int count2 = enumerations.size();
					for (int l=0; l<count2; l++){
						if (enumerations.get(l) instanceof EnumerationLiteral){
							EnumerationLiteral enumeration = (EnumerationLiteral)enumerations.get(l);
							enP.addChild(new LeafEnumValue(enumeration.getName(), false));
						}
					}
				}
			}
		}
	}
	
	public static Resource loadResource(String profileString) throws IOException {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		UMLResourcesUtil.init(resourceSet);
		
		File f = new File(profileString);
		URI uri = URI.createFileURI(f.getAbsolutePath());
		
		Resource resource = resourceSet.createResource(uri);
		resource.load(null);
		
		return resource;
	}
	
	public static boolean isCoreLoaded(){
		return loadedCoreres;
	}

}

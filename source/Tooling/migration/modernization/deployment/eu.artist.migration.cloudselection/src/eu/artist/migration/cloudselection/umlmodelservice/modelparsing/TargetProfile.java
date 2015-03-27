package eu.artist.migration.cloudselection.umlmodelservice.modelparsing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

import eu.artist.migration.cloudselection.umlmodelservice.validation.Score;
import eu.artist.migration.cloudselection.umlmodelservice.validation.Validator.CompositeRequest;


public class TargetProfile{
	
	public class CompositeResponse{
		
		protected int found;
		protected int requested;
		
		public CompositeResponse(int found, int requested) {
			this.requested = requested;
			this.found = found;
		}

		public int getRequested() {
			return requested;
		}
		
		public int getFound() {
			return found;
		}		
		
	}
	
	public class ElementAndAppliedStereo{
		protected Element element;
		protected Stereotype stereo;
		
		public ElementAndAppliedStereo(Element element, Stereotype stereo) {
			this.element = element;
			this.stereo = stereo;
		}
		
		public Element getElement() {
			return element;
		}
		
		public void setElement(Element element) {
			this.element = element;
		}
		
		public Stereotype getStereo() {
			return stereo;
		}
		
		public void setStereo(Stereotype stereo) {
			this.stereo = stereo;
		}
	}
	
	protected ArrayList<ElementAndAppliedStereo> eAndSt;
	protected ElementAndAppliedStereo eAndStC;
	protected Resource resource;
	protected String name;
	public Score score;
	
	public TargetProfile(String name){
		this.name = name;
		score = new Score();
		//this.resource = Utils.resources.providersResources.get(name);
		try {
			this.resource = Resources.loadResource(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eAndStC = findAppliedStereotypeForCommonFeatures();
	}
	
	public void unload(){
		ResourceSet rs = this.resource.getResourceSet();
		for (Resource singlers : rs.getResources()){
			singlers.unload();
		}
		System.gc();
	}
	
	public String getProvider(){
		return name;
	};
	
	public CompositeResponse handleRequest(CompositeRequest request, String aCase){
		String propertyToCheck = request.getProperty();
		String stereotypeToCheck = request.getStereotype();
		Set<String> requestedValues = new HashSet<String>(Arrays.asList(request.getEnumValues()));
		Set<String> actualValues = new HashSet<String>();
		
		//CommonValidation
		if (aCase == "common"){
			Object obj = eAndStC.getElement().getValue(eAndStC.getStereo(),propertyToCheck);
			if (obj instanceof EcoreEList<?>){
				int count = ((EcoreEList<?>)obj).size();
				for (int i=0; i<count; i++){
					EEnumLiteral lit = (EEnumLiteral)((EcoreEList<?>)obj).get(i);
					actualValues.add(lit.getName());
				}
			}
			actualValues.retainAll(requestedValues);
			
			return new CompositeResponse(actualValues.size(), requestedValues.size());
		}
		//ServiceValidation
		if (aCase == "service"){
			eAndSt = findAppliedStereotype(stereotypeToCheck);
			if (eAndSt == null) return(new CompositeResponse(0, 0));
			else{
				int count = eAndSt.size();
				for(int i=0; i<count; i++){ 
					ElementAndAppliedStereo curEAndSt = eAndSt.get(i);
					Object obj = curEAndSt.getElement().getValue(curEAndSt.getStereo(),propertyToCheck);
					if (obj instanceof EcoreEList<?>){
						int count2 = ((EcoreEList<?>)obj).size();
						for (int j =0; j<count2; j++){
							EEnumLiteral lit = (EEnumLiteral)((EcoreEList<?>)obj).get(j);
							actualValues.add(lit.getName());
						}
					}
					else if (obj instanceof EnumerationLiteral){
						actualValues.add(((EnumerationLiteral)obj).getName());
					}
					actualValues.retainAll(requestedValues);
				}
				return new CompositeResponse(actualValues.size(), requestedValues.size());
			}
		}
		else return null;
	}
	
	
	
	public ArrayList<ElementAndAppliedStereo> findAppliedStereotype (String service){
		Profile prof = (Profile)resource.getContents().get(0);
		EList<NamedElement> elements = prof.getOwnedMembers();
		ArrayList<ElementAndAppliedStereo> resultList = new ArrayList<ElementAndAppliedStereo>();
		for (NamedElement el : elements){
			if (el instanceof Stereotype){
				Stereotype curStereo = (Stereotype)el;
				EList<Stereotype> applied = curStereo.getAppliedStereotypes();
				for(Stereotype curApplied : applied){
					if (curApplied.getName().equals(service)){
						resultList.add(new ElementAndAppliedStereo(curStereo, curApplied)); 
					}
				}
			}
		}
		return resultList;
	}

	public ElementAndAppliedStereo findAppliedStereotypeForCommonFeatures(){
		Profile prof = (Profile)resource.getContents().get(0);
		EList<NamedElement> elements = prof.getOwnedMembers();
		for (NamedElement el : elements){
			if (el instanceof Stereotype){
				Stereotype curStereo = (Stereotype)el;
				EList<Stereotype> applied = curStereo.getAppliedStereotypes();
				for (Stereotype curApplied : applied){
					EList<Classifier> gens = curApplied.getGenerals();
					for (Classifier curClass : gens){
						if (curClass.getName().equals("CommonFeatures")){
							return (new ElementAndAppliedStereo(curStereo, curApplied)); 
						}
					}
				}
			}
		}
		return null;
	}
	
	
	public float handleHLRequest(String toCheck){
		Object object = eAndStC.getElement().getValue(eAndStC.getStereo(), toCheck);
		if (object instanceof EnumerationLiteral){
			String value = ((EnumerationLiteral)object).getName();
			if (value.equals("extensive")) return 1;
			else if (value.equals("average")) return 0.5f;
			else return 0;
		}
		return 0;
	}
	
	public  boolean handleRequest(String toCheck){
		boolean found = false;
		Object obj = eAndStC.getElement().getValue(eAndStC.getStereo(),toCheck);
		if (obj instanceof Boolean){
			found = (Boolean)obj;
		}
		return found;
	} 
	

}

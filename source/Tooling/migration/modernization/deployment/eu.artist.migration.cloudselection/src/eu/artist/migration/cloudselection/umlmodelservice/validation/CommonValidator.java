package eu.artist.migration.cloudselection.umlmodelservice.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import eu.artist.migration.cloudselection.umlmodelservice.modelparsing.TargetProfile;
import eu.artist.migration.cloudselection.umlmodelservice.modelparsing.TargetProfile.CompositeResponse;
import eu.artist.migration.cloudselection.viewdatamodel.EnumerationProperty;
import eu.artist.migration.cloudselection.viewdatamodel.LeafElement;
import eu.artist.migration.cloudselection.viewdatamodel.LeafEnumValue;
import eu.artist.migration.cloudselection.viewdatamodel.LeafHLEvaluationProperty;
import eu.artist.migration.cloudselection.viewdatamodel.LeafProperty;

public class CommonValidator extends Validator{
	
	public static String validate(Set<LeafElement> checked, List<String> providerNames){
		TargetProfile provider = null;
		
		//String1: property, String2: values
		HashMap<String, String> compositeRequests = new HashMap<String, String>();
		
		//String: property
		HashSet<String> leafPropertyRequests = new HashSet<String>();
		HashSet<String> leafHLEvaluationRequests = new HashSet<String>();
		
		for (LeafElement request : checked){
			if (request instanceof LeafProperty){
				if (request instanceof LeafHLEvaluationProperty)
				{
					leafHLEvaluationRequests.add(((LeafHLEvaluationProperty) request).getReferencedProperty());
				}
				else{
					leafPropertyRequests.add(((LeafProperty) request).getReferencedProperty());
				}
			}
			else if (request instanceof LeafEnumValue){
				String curProperty = ((EnumerationProperty)request.getParent()).getReferencedProperty();
				String str = "";
				if (compositeRequests.keySet().contains(curProperty))
					str = compositeRequests.get(curProperty) + request.getName() + "@";
				else
					str = request.getName() + "@";
				compositeRequests.put(curProperty, str);
			}
		}
		
		String totalRes = "Results: ";
		for(String p : providerNames){
			provider = new TargetProfile(p);
			Iterator<String> it = leafPropertyRequests.iterator();
			while (it.hasNext()){
				provider.score.increaseMaxScore();
				provider.score.increaseActualScore(leafPropertyValidation(it.next(), (TargetProfile)provider) );
			}
			it = leafHLEvaluationRequests.iterator();
			while(it.hasNext()){
				provider.score.increaseMaxScore();
				provider.score.increaseActualScore(leafHLEvaluationValidation(it.next(), (TargetProfile)provider) );
			}
			for (String prop: compositeRequests.keySet()){
				provider.score.increaseMaxScore();
				provider.score.increaseActualScore(compositeRequestValidation(prop, compositeRequests.get(prop), (TargetProfile)provider));
			}
			totalRes = totalRes + "\n" + provider.getProvider() + " " + provider.score.actualScore + "/" + provider.score.maxScore; 
			provider.unload();
		}
		return totalRes;
	}
	
	public static float leafPropertyValidation(String prop, TargetProfile provider){
		Boolean response = provider.handleRequest(prop);
		if (response) return 1;
		else return 0;
	}
	
	public static float leafHLEvaluationValidation(String prop, TargetProfile provider){
		return provider.handleHLRequest(prop);
	}
	
	public static float compositeRequestValidation(String prop, String values, TargetProfile provider){
		CompositeRequest request = new CompositeRequest("commonFeatures", prop, values.split("@"));
		CompositeResponse res = provider.handleRequest(request, "common");
		int requested = res.getRequested();
		int found = res.getFound();
		if (requested == 0) return 0;
		return ((float)found)/requested;
	}
		
}

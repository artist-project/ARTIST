package eu.artist.migration.cloudselection.umlmodelservice.validation;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import eu.artist.migration.cloudselection.umlmodelservice.modelparsing.TargetProfile;
import eu.artist.migration.cloudselection.umlmodelservice.modelparsing.TargetProfile.CompositeResponse;
import eu.artist.migration.cloudselection.viewdatamodel.EnumerationProperty;
import eu.artist.migration.cloudselection.viewdatamodel.LeafElement;
import eu.artist.migration.cloudselection.viewdatamodel.LeafEnumValue;

public class ServiceValidator extends Validator{

	public static String validate(Set<LeafElement> checked, List<String> providerNames){
		
		TargetProfile provider = null;
		
		HashMap<String, String> compositeRequests = new HashMap<String, String>();
		
		for(LeafElement request : checked){
			if (request instanceof LeafEnumValue){
				String curStereotype = (((EnumerationProperty)request.getParent()).getParentStereotype());
				String curProperty = ((EnumerationProperty)request.getParent()).getReferencedProperty();
				String stereoProp = curStereotype + "@" + curProperty;
				String str = "";
				if (compositeRequests.keySet().contains(stereoProp))
					str = compositeRequests.get(stereoProp) + request.getName() + "@";
				else
					str = request.getName() + "@";
				compositeRequests.put(stereoProp, str);
			}
		}
		String totalRes = "Results : " ;
		for (String p : providerNames){
			provider = new TargetProfile(p);
			for (String prop: compositeRequests.keySet()){
				provider.score.increaseMaxScore();
				provider.score.increaseActualScore(compositeRequestValidation(prop, compositeRequests.get(prop), (TargetProfile)provider));
			}
			totalRes = totalRes + "\n" + provider.getProvider() + " " + provider.score.actualScore + "/" + provider.score.maxScore;
			provider.unload();
		}
		return totalRes;	
		
	}

	public static float compositeRequestValidation(String stereoProp, String values, TargetProfile provider){
		String stereo = stereoProp.split("@")[0];
		String prop = stereoProp.split("@")[1];
		CompositeRequest request = new CompositeRequest(stereo,prop, values.split("@"));
		CompositeResponse res = provider.handleRequest(request, "service");
		int requested = res.getRequested();
		int found = res.getFound();
		if (requested == 0) return 0;
		return ((float)found)/requested;
	
	}
}

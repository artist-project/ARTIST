

modelTypes {
	UML4 "http://www.eclipse.org/uml2/4.0.0/UML"
	Java "platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/objectify_profile.profile.uml"
}


model ( name: "projProfile", conformsTo: UML4 ) {
	path = "platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/objectify_profile.profile.uml"
}


models {
	projProfile {
		conformsTo UML4
		path "platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/objectify_profile.profile.uml"
	}
}



trafo ( name: "loadModel", of: "Loader" ) {
	spec {
		outputs UML4: "objModel"
	}
	path = "platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/objectify_profile.profile.uml"
}



trafo ( name: "testEmftvm", of: "ATL/EMFTVM" ) {
	spec {
		inputs OBJECTIFY: "objProfile"
		inputs UMLM: "objModel"
		outputs UMLM: "objModel"
	}

	path = "test/resources/artist/trafo/"
	module = "DomainModelObjectificationDAO"
	
	objProfile = projProfile | modisco.output
	objModel = "test/resources/artist/model/petstore_domain_objectified.uml"
}

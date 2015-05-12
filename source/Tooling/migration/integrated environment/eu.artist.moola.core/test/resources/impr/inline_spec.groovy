
modelTypes {
	UML4 "http://www.eclipse.org/uml2/4.0.0/UML"
	Java "platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/objectify_profile.profile.uml"
}


trafo ( name: "testMoDisco", of: "MoDisco" ) {
	spec {
		outputs UML4: "objProfile"
	}

	project = "eu.artist.moola.core"
}

/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/


modelTypes {
	UML4 "http://www.eclipse.org/uml2/4.0.0/UML"
	Java "platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/objectify_profile.profile.uml"
}


/****************************************
 * Models
 ****************************************/

model projProfile ( conformsTo: UML4 ) {
	path = "platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/objectify_profile.profile.uml"
}

model domainObj ( conformsTo: UML4 ) {
	path = "test/resources/artist/model/petstore_domain_objectified.uml"
	source = daoEval.objProfile
}


/****************************************
 * Trafo Specs
 ****************************************/

trafo ( name: "projDisc" ) {
	project = "eu.artist.moola.core"
}


trafo ( name: "objTrafo" ) {
	path = "test/resources/artist/trafo/"
	module = "DomainModelObjectificationDAO"
}


/****************************************
 * Exec
 ****************************************/

run {
	projDisc
	objTrafo projDisc.result, projProfile
	
	parallel {
		projDisc
		projDisc
	}
	
	loop ({ projProfile != null }) {
		objTrafo
		projDisc objTrafo.result
	}
	
	choice {
		on({ projProfile != null }){
			
		}
		on({ projProfile != null }){
			
		}
		on({ projProfile != null }){
			
		}
	}
}



run {
	projDisc ()
	objTrafo ( projDisc.result, projProfile )
	
	parallel {
		projDisc ()
	}, {
		projDisc ()
	}
	
	while (projProfile != null) {
		objTrafo ()
		projDisc ( objTrafo.result )
	}
	
	if( projProfile != null ) {
		
	} else {
		
	}
	
}


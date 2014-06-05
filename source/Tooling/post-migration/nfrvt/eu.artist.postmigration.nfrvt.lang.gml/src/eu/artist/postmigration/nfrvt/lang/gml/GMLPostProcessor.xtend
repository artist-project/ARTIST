package eu.artist.postmigration.nfrvt.lang.gml

import org.eclipse.xtext.GeneratedMetamodel

class GMLPostProcessor {
     
    def static void augment(GeneratedMetamodel metamodel) {
    	new GMLPostProcessor().process(metamodel)
	}
     
    def void process(GeneratedMetamodel metamodel) {
//        metamodel.getEPackage.process
    }
     
//    def process(EPackage p) {
//        for (c : p.getEClassifiers.filter(typeof(EClass))) {
//            if (c.name == "GoalExpression") {
//            	c.EAllSuperTypes += ArtistCommonPackage::eINSTANCE.expression
//            }
//        }
//    }
//     
//    def handle (EClass c) {
//    	
//    	c.EAllSuperTypes.add()
//        val op = EcoreFactory::eINSTANCE.createEOperation
//        op.name = "getFullName"
//        op.eType = EcorePackage::eINSTANCE.getEString
//        val body = EcoreFactory::eINSTANCE.createEAnnotation
//        body.source = GenModelPackage::eNS_URI
//        val map = EcoreFactory::eINSTANCE.create(EcorePackage::eINSTANCE.getEStringToStringMapEntry()) as BasicEMap$Entry<String,String>
//        map.key = "body"
//        map.value = "return getFirstname() + \" \" + getLastname();"
//        body.details.add(map)
//        op.getEAnnotations += body
//        c.getEOperations += op
//    }
     
}
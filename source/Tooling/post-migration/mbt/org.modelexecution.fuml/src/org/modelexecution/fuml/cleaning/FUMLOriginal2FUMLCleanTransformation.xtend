package org.modelexecution.fuml.cleaning

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.util.EcoreUtil

class FUMLOriginal2FUMLCleanTransformation implements IWorkflowComponent {
	
	val BASE_URI = "http://www.modelexecution.org"
	
	IWorkflowContext context

	override invoke(IWorkflowContext ctx) {
		this.context = ctx
		var inputPackage = ctx.get("inputModel") as EPackage
		transform(inputPackage)
	}
	
	override postInvoke() {	}
	
	override preInvoke() { }
	
	def transform(EPackage ePackage) {
		ePackage.name = "fuml"
		ePackage.nsPrefix = "fuml"
		ePackage.nsURI = BASE_URI + "/fuml"
		for (child : ePackage.eContents) child.clean
		context.put("outputModel", ePackage)
	}
	
	def clean(EObject object) {
		switch (object) {
			EPackage : object.clean
			EClass : object.clean
		}
	}
	
	def clean(EPackage ePackage) {
		ePackage.nsURI = BASE_URI + ePackage.computePackageName.toLowerCase
		for (child : ePackage.eContents) child.clean
	}
	
	def String computePackageName(EPackage ePackage) {
		if (ePackage.ESuperPackage != null) {
			return ePackage.ESuperPackage.computePackageName + "/" + ePackage.name
		} else {
			return "/" + ePackage.name
		}
	}

	
	def clean(EClass eClass) {
		// remove all operations
		eClass.EOperations.clear
		val features = new BasicEList<EStructuralFeature> (eClass.EStructuralFeatures)
		for (feature : features) {
			// unset defaultValueLiteral
			feature.removeDefaultLiteralValue
			// remove duplicate features if inherited
			if (feature.isInhertiedDuplicate) {
			 	EcoreUtil::delete(feature)
			}
			// rename is* to *
			feature.clean
		}
	}
	
	def removeDefaultLiteralValue(EStructuralFeature feature) {
		feature.defaultValueLiteral = null
	}
	
	def boolean isInhertiedDuplicate(EStructuralFeature feature) {
		var count = 0
		for (oneOfAllFeatures : feature.EContainingClass.EAllStructuralFeatures) {
			if (feature.name.equals(oneOfAllFeatures.name)) {
				count = count + 1
			}
		}
		return count > 1;
	}
	
	def clean(EStructuralFeature feature) {
		feature.name = feature.cleanName
		feature.changeable = true
		feature.transient = false
		feature.volatile = false
		feature.derived = false
	}
	
	def String cleanName(EStructuralFeature feature) {
		if (feature.name.startsWith("is")) {
			return feature.name.substring(2).toFirstLower
		} else {
			return feature.name
		}
	}
	
}
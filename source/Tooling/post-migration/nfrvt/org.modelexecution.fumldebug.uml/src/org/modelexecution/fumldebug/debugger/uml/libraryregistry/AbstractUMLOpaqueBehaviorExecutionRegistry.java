/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fumldebug.debugger.uml.libraryregistry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelexecution.fuml.convert.ConverterRegistry;
import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fuml.convert.IConverter;
import org.modelexecution.fumldebug.libraryregistry.AbstractOpaqueBehaviorExecutionRegistry;

import fUML.Syntax.Classes.Kernel.Element;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public abstract class AbstractUMLOpaqueBehaviorExecutionRegistry extends AbstractOpaqueBehaviorExecutionRegistry {
	
	protected void loadOpaqueBehaviors(String libraryname) {
		String libraryPath = getLibraryPath(libraryname);
		EList<org.eclipse.uml2.uml.OpaqueBehavior> umlOpaqueBehaviors = getUMLOpaqueBehaviors(libraryPath);
		Collection<OpaqueBehavior> fUMLOpaqueBehaviors = convertOpaqueBehaviors(umlOpaqueBehaviors);		
		createOpaqueBehaviorsMap(fUMLOpaqueBehaviors);
	}

	private Collection<OpaqueBehavior> convertOpaqueBehaviors(
			EList<org.eclipse.uml2.uml.OpaqueBehavior> umlOpaqueBehaviors) {
		List<OpaqueBehavior> convertedOpaqueBehaviors = new ArrayList<OpaqueBehavior>();
		if(umlOpaqueBehaviors.size() > 0) {
			IConverter converter = ConverterRegistry.getInstance().getConverter(umlOpaqueBehaviors.get(0));
			for(org.eclipse.uml2.uml.OpaqueBehavior xMOFOpaqueBehavior : umlOpaqueBehaviors) {
				IConversionResult conversionResult = converter.convert(xMOFOpaqueBehavior);
				Element convertedElement = conversionResult.getFUMLElement(xMOFOpaqueBehavior);
				if(convertedElement instanceof OpaqueBehavior) 
					convertedOpaqueBehaviors.add((OpaqueBehavior)convertedElement); 
			}
		}
		return convertedOpaqueBehaviors;
	}

	private EList<org.eclipse.uml2.uml.OpaqueBehavior> getUMLOpaqueBehaviors(
			String libraryPath) {
		EList<org.eclipse.uml2.uml.OpaqueBehavior> opaqueBehaviors = new BasicEList<org.eclipse.uml2.uml.OpaqueBehavior>();
		if (libraryPath != null) {
			URI libraryPathUri = URI.createURI(libraryPath);
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(libraryPathUri, true);
			for (Iterator<EObject> contentIterator = resource.getAllContents(); contentIterator
					.hasNext();) {
				EObject eObject = contentIterator.next();
				if (eObject instanceof org.eclipse.uml2.uml.OpaqueBehavior) {
					org.eclipse.uml2.uml.OpaqueBehavior opaqueBehavior = (org.eclipse.uml2.uml.OpaqueBehavior) eObject;
					opaqueBehaviors.add(opaqueBehavior);
				}
			}
		}
		return opaqueBehaviors;
	}
	
}

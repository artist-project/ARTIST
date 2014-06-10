/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.eval;

import java.math.BigDecimal;
import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

import com.google.inject.Inject;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;

public class RandomRealizationStrategy {
	private static Random random = new Random();
	
	public static String ALPHABET_ALPHA        = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String ALPHABET_NUMERIC      = "1234567890";
	public static String ALPHABET_ALPHANUMERIC = ALPHABET_ALPHA + ALPHABET_NUMERIC;
	
	public static QuantitativePropertyRealization createRandomRealization(AppliedQuantitativeProperty p) {
		return createRandomRealization(p, 1, 2);
	}
	
	public static QuantitativePropertyRealization createRandomRealization(AppliedQuantitativeProperty p, int min, int max) {
		// if(random.nextBoolean())
		//	return null;

		int nrValues = min + random.nextInt(max - min + 1);
		if(!canHandle(p.getProperty()) || nrValues <= 0)
			return null;
		
		QuantitativePropertyRealization realization = GelFactory.eINSTANCE.createQuantitativePropertyRealization();
		
		realization.setLevel(RealizationLevelKind.CODE);
		realization.setType(RealizationTypeKind.ESTIMATED);
		realization.setName(p.getProperty().getName() + "_RandomValues");
		
		for(int i = 0; i < nrValues; i++) {
			ValueSpecification value = createRandomValue(p.getProperty().getType());
			if(value != null)
				realization.getValues().add(value);
		}
		if(realization.getValues().isEmpty())
			return null;
		return realization;
	}
	
	public static boolean canHandle(QuantitativeProperty property) {
		return canHandle(property.getType());
	}
	
	public static boolean canHandle(DataType type) {
		return (type instanceof Enumeration || type instanceof PrimitiveType);
	}
	
	public static ValueSpecification createRandomValue(DataType type) {
		if(type instanceof Enumeration)
			return createRandomValue((Enumeration)type);
		if(type instanceof PrimitiveType)
			return createRandomValue((PrimitiveType)type);
		
		// default 
		return ValueUtil.createNumberLiteral(new BigDecimal(random.nextDouble()));
	}
	
	public static String createRandomString(int length) {
		return createRandomString(ALPHABET_ALPHANUMERIC, length);
	}
	
	public static String createRandomString(String alphabet, int length) {
		StringBuffer buffer = new StringBuffer();
		int charactersLength = alphabet.length();

		for (int i = 0; i < length; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(alphabet.charAt((int) index));
		}
		return buffer.toString();
	}
	
	public static ValueSpecification createRandomValue(Enumeration type) {
//		if(type.eIsProxy()) {
//			InternalEObject obj = (InternalEObject) type;
//			URI proxyURI = obj.eProxyURI();
//			boolean isResource = proxyURI.isPlatformResource();
//			EcoreUtil.resolveAll(obj);
//			if(obj.eIsProxy()) {
//				obj.eSetProxyURI(URI.createURI(proxyURI.toString().replace("platform:/resource", "platform:/plugin")));
//				EcoreUtil.resolveAll(obj);
//				boolean stillProxy = obj.eIsProxy();
//				EList<EnumerationLiteral> ownedLiterals = ((Enumeration)obj).getOwnedLiterals();
//				System.out.println("A");
//			}
//		}
		if(type.getOwnedLiterals().isEmpty())
			return null;
		return ValueUtil.createInstanceSpecificationExpression(type.getOwnedLiterals().get(random.nextInt(type.getOwnedLiterals().size())));
	}
	
	@Inject
	static IContainer.Manager manager;
	
	public static void listVisibleResources(Resource myResource, IResourceDescriptions index) {
		IResourceDescription descr = index.getResourceDescription(myResource.getURI());
		for(IContainer visibleContainer : manager.getVisibleContainers(descr, index)) {
			for(IResourceDescription visibleResourceDescription : visibleContainer.getResourceDescriptions()) {
				for(IEObjectDescription var : visibleResourceDescription.getExportedObjects())
					System.out.println(var);
				System.out.println(visibleResourceDescription);
			}
		}
	}
	
	public static ValueSpecification createRandomValue(PrimitiveType type) {
		if(UMLUtil.isBoolean(type))
			return ValueUtil.createBooleanLiteral(random.nextBoolean());
		if(UMLUtil.isInteger(type))
			return ValueUtil.createNumberLiteral(random.nextInt());
		if(UMLUtil.isReal(type))
			return ValueUtil.createNumberLiteral(random.nextDouble());
		if(UMLUtil.isString(type))
			return ValueUtil.createStringLiteral(createRandomString(10));
		if(UMLUtil.isUnlimitedNatural(type))
			return ValueUtil.createUnlimitedLiteral();
			
		return ValueUtil.createNullLiteral();
	}
}

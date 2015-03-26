//////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2015 Vienna University of Technology.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// Contributors:
// Tanja Mayerhofer (Vienna University of Technology) - initial API and implementation
// Javier Troya (Vienna University of Technology) - adaptions for the model-based_tester
// developed in the context of ARTIST EU project www.artist-project.eu
//
//////////////////////////////////////////////////////////////////////////////

package eu.artist.postmigration.mbt.modelexecution.fumldebug.eval.extensions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.modelexecution.fumldebug.core.ExecutionContext;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import eu.artist.postmigration.mbt.modelexecution.fumldebug.eval.extensions.internal.ModelExecutor;
import fUML.Semantics.Classes.Kernel.FeatureValue;
import fUML.Semantics.Classes.Kernel.FeatureValueList;
//import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Classes.Kernel.Reference;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;

public class FUMLBehavioralTesting {
	
	ResourceSet resSet = null;
	Resource inModel = null;
	
	private static String MODEL_PATH_AGL;
	private static String MODEL_PATH_AGM;	
	private static String MODEL_PATH_CORRESP;
	
	@BeforeClass
	public static void setupBeforeClass() {
		BufferedReader br = null;
		try {			 
			String sCurrentLine; 
			br = new BufferedReader(new FileReader("config.properties"));
 
			if ((sCurrentLine = br.readLine()) != null) {
				MODEL_PATH_AGL = sCurrentLine;
			}
			if ((sCurrentLine = br.readLine()) != null) {
				MODEL_PATH_AGM = sCurrentLine;
			}
			if ((sCurrentLine = br.readLine()) != null) {
				MODEL_PATH_CORRESP = sCurrentLine;
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		turnOffLogging();
	}

	private static String turnOffLogging() {
		return System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");
	}

	@Before
	public void setupBeforeTest() {
		getExecutionContext().reset();
	}
	
	@Test 
	public void testCases_Type1() throws IOException {
		applyAssertions("TestCase1", 1);
	}
	
	@Test 
	public void testCases_Type2() throws IOException {
		applyAssertions("TestCase2", 2);
	}
	
	@Test 
	public void testCases_Type3() throws IOException {
		applyAssertions("TestCase3", 3);
	}
	
	@SuppressWarnings("unchecked")
	public void applyAssertions(String testCaseType, int testCaseNumber) throws IOException{
		int testCaseQuantity = 0;
		//**Code to read in the Correspondences Model to later iterate over the Test Cases**//
		List<DynamicEObjectImpl> tc = new ArrayList<DynamicEObjectImpl>();;
		
		resSet = createResourceSet();
		inModel = loadModel(MODEL_PATH_CORRESP, 				
							"model/CorrespondencesMM.ecore");
		EObject root = inModel.getContents().get(0); //Object containing the CorrespondencesModel
				
		tc = (List<DynamicEObjectImpl>) root.eGet(root.eClass().getEStructuralFeature("testCases"));
		String testCaseName;
		
		ParameterValueList outputLeg = null;
		ParameterValueList outputMig = null;
		
		for(DynamicEObjectImpl d : tc){
			testCaseName = (String) d.eGet(d.eClass().getEStructuralFeature("name"));
			if(testCaseName.substring(0, 9).equals(testCaseType)){
				testCaseQuantity++;
				System.out.println("\n\n**********  " + testCaseName + " **********" + "\n");					
			
				//**Code to iterate over the Test Cases**//
				ModelExecutor executorLeg = new ModelExecutor(MODEL_PATH_AGL, testCaseName); //Executor for the legacy app
				if (executorLeg.getActivityPublic() != null){
					ModelExecutor executorMig = new ModelExecutor(MODEL_PATH_AGM, testCaseName); //Executor for the migrated app
					if (executorMig.getActivityPublic() != null){
						int rootExecutionID = executorLeg.executeStepwise();
						outputLeg = getExecutionContext().getActivityOutput(
								rootExecutionID);
						
						rootExecutionID = executorMig.executeStepwise();
						outputMig = getExecutionContext().getActivityOutput(
								rootExecutionID);
						
						//************************AssertNotNull***********************//
						System.out.print("Result of test in Legacy Application not null..........");
						Assert.assertNotNull(outputLeg.get(0).values.get(0));
						System.out.println(".............OK");
						System.out.print("Result of test in Migrated Application not null..........");
						Assert.assertNotNull(outputMig.get(0).values.get(0));
						System.out.println(".............OK");
						
						//***********************Size of Result*********************//
						System.out.println("\nSize of result of test in Legacy Application: " + outputLeg.get(0).values.size());
						System.out.println("Size of result of test in Migrated Application: " + outputMig.get(0).values.size());
						System.out.print("Equality.................");
						Assert.assertEquals(testCaseName, outputLeg.get(0).values.size(), outputMig.get(0).values.size());
						System.out.println("............OK");
						
						//********************Type of Result*******************//
						String objectClassNameLeg = outputLeg.get(0).values.get(0).getClass().getSimpleName(); //Type of returned object legacy
						String objectClassNameMig = outputMig.get(0).values.get(0).getClass().getSimpleName(); //Type of returned object migrated
						System.out.println("\nType of the result of test in Legacy Application: " + objectClassNameLeg);
						System.out.println("Type of the result of test in Legacy Application: " + objectClassNameMig);
						System.out.print("Equality.................");
						Assert.assertEquals(testCaseName, objectClassNameLeg, objectClassNameMig);
						System.out.println("............OK");
						
						//********************Content of Result*******************//
						//If the object returned is of a simple type, then we simply use Assert.asserEquals
						if (objectClassNameLeg.equals("BooleanValue") || objectClassNameLeg.equals("IntegerValue") || objectClassNameLeg.equals("StringValue")){
							System.out.println("\nContent of result in Legacy Application: " + outputLeg.get(0).values.get(0).toString());
							System.out.println("Content of result in Migrated Application: " + outputMig.get(0).values.get(0).toString());
							System.out.print("Equality.................");
							Assert.assertEquals(testCaseName, outputLeg.get(0).values.get(0).toString(), outputMig.get(0).values.get(0).toString());
							System.out.println("............OK");
						} else { //We assume that the object is of type Reference
							Reference refLeg = (Reference) outputLeg.get(0).values.get(0);
							Reference refMig = (Reference) outputMig.get(0).values.get(0);
							
							System.out.println("\n**Since the resulting object of the test is not of a simple type, we compare the features of the object returned**");
							int i = 0;
							FeatureValueList fvMigList = refMig.getFeatureValues();
							for (FeatureValue fvLeg : refLeg.getFeatureValues()){;
								System.out.println("\nFeature in Legacy application: " + fvLeg.feature.name + 
										": " + fvLeg.values.toString());
								System.out.println("Feature in Migrated application: " + fvMigList.get(i).feature.name + 
										": " + fvMigList.get(i).values.toString());
								System.out.print("Equality.................");
								Assert.assertEquals(fvLeg.values.toString(),fvMigList.get(i).values.toString());
								System.out.println("............OK");
								i++;
							}
						}
					}else{	
						System.out.println("The " + testCaseName + " test case is not available in the Migrated Application.");
					}
				}else{
					System.out.println("The " + testCaseName + " test case is not available in the Legacy Application.");
				}
			}
		}
		if (testCaseQuantity==0)
			System.out.println("\n\n****There were not Test Cases of type " +  testCaseNumber + " defined****");
		
	}
	
	public ExecutionContext getExecutionContext() {
		return ExecutionContext.getInstance();
	}	
	
	/***Methods for loading a metamodel and an XMI model***/
	
	private ResourceSet createResourceSet() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());

	    ResourceSet resSet = new ResourceSetImpl();
		return resSet;
	}
	
	/*
	 *  This method is a helper method to prepare the loading of a model from XMI
	 * 
	 */
	private ResourceSet createResourceSet(String pathEcoreMMFile) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new EcoreResourceFactoryImpl());
		
		Resource metamodel = resSet.getResource(URI.createURI(pathEcoreMMFile), true);
		
		EPackage ep0 = (EPackage) metamodel.getContents().get(0); 
		resSet.getPackageRegistry().put(ep0.getNsURI(), ep0);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
		("xmi", new XMIResourceFactoryImpl(){ public Resource createResource(URI uri)
		{   XMIResource xmiResource = new XMIResourceImpl(uri);
			return xmiResource;
		} });
		return resSet;
	}
	
	/*
	 *  Load a model based on its metamodel
	 * 
	 */
	private Resource loadModel(String model, String metamodel) throws IOException{
		ResourceSet resSet = this.createResourceSet(metamodel);
		Resource resource = resSet.getResource(
				URI.createFileURI(new File(model).getAbsolutePath()), true);
		
		return resource;	
	}
}

package eu.artist.postmigration.mbt.modelexecution.fumldebug.eval;

import java.util.Set;

import org.junit.Assert;
import org.modelexecution.fumldebug.core.ExecutionContext;

import java.lang.Boolean;

import fUML.Semantics.Classes.Kernel.IntegerValue;
import fUML.Semantics.Classes.Kernel.BooleanValue;
import fUML.Semantics.Classes.Kernel.Link;
import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Classes.Kernel.Reference;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Semantics.Loci.LociL1.Locus;

public class TestLoginAssert extends PetstoreAssert {

	private ParameterValueList output;
	
	public TestLoginAssert(Locus locus, String scenario, String app, ParameterValueList output) {
		super(locus, scenario, app);
		this.output = output;
	}
	
	public void doAssert() {
		
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------TESTING SCENARIO -" + scenario + "- IN -" + app + "---------------------------------------------------------------------");
		Assert.assertEquals(1, output.size());
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(1, output.size()) | " + " PASSED");
		Assert.assertEquals(1, output.get(0).values.size());
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(1, output.get(0).values.size()) | " + " PASSED");
		Assert.assertEquals("true",
				output.get(0).values.get(0).toString());
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(\"true\", output.get(0).values.get(0).toString()) | " + " PASSED");
				Set<Object_> objects = getObjects("ApplicationController");
		Assert.assertEquals(1, objects.size());
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Set<Object_> objects = getObjects(\"ApplicationController\") -- Assert.assertEquals(1, objects.size()) | " + " PASSED");
		Object_ applicationController = objects.iterator().next();
		objects = getObjects("Session");
		Assert.assertEquals(1, objects.size());
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Object_ applicationController = objects.iterator().next() -- objects = getObjects(\"Session\") -- Assert.assertEquals(1, objects.size()) | " + " PASSED");
		Object_ session = objects.iterator().next();
		Set<Link> links = getLinks("applicationController_session_1");
		Assert.assertEquals(1, links.size());
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Object_ session = objects.iterator().next() -- Set<Link> links = getLinks(\"applicationController_session_1\") -- Assert.assertEquals(1, links.size()) | " + " PASSED");
		Link sessionlink = links.iterator().next();
		Assert.assertEquals(1, getFeatureValue(sessionlink, "sessions").size());
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Link sessionlink = links.iterator().next() -- Assert.assertEquals(1, getFeatureValue(sessionlink, \"sessions\").size()) | " + " PASSED");
		Assert.assertEquals(
				session,
				((Reference) getFeatureValue(sessionlink, "sessions").get(0)).referent);
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(session,	((Reference) getFeatureValue(sessionlink, \"sessions\").get(0)).referent) | " + " PASSED");
		Assert.assertEquals(1,
				getFeatureValue(sessionlink, "applicationController").size());
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(1, getFeatureValue(sessionlink, \"applicationController\").size()) | " + " PASSED");
		Assert.assertEquals(
				applicationController,
				((Reference) getFeatureValue(sessionlink,
						"applicationController").get(0)).referent);
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(applicationController, ((Reference) getFeatureValue(sessionlink,	\"applicationController\").get(0)).referent) | " + " PASSED");
		Assert.assertEquals(0,
				getFeatureValue(applicationController, "foundCustomer").size()); 	
		System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(0, getFeatureValue(applicationController, \"foundCustomer\").size()) | " + " PASSED");
		System.out.println("-------------------------------------ALL TEST FOR SCENARIO -" + scenario + "- IN -" + app + "- PASSED-------------------------------------------------------------------------");
	}
}

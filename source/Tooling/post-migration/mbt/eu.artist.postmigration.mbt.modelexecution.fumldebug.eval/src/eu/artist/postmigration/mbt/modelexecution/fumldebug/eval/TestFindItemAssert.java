package eu.artist.postmigration.mbt.modelexecution.fumldebug.eval;

import java.util.Set;

import org.junit.Assert;

import java.lang.Boolean;

import fUML.Semantics.Classes.Kernel.IntegerValue;
import fUML.Semantics.Classes.Kernel.BooleanValue;
import fUML.Semantics.Classes.Kernel.Link;
import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Classes.Kernel.Reference;
import fUML.Semantics.Classes.Kernel.StringValue;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Semantics.Loci.LociL1.Locus;

public class TestFindItemAssert extends PetstoreAssert {

	private ParameterValueList output;
	
	public TestFindItemAssert(Locus locus, String scenario, String app, ParameterValueList output) {
		super(locus, scenario, app);
		this.output = output;
	}
	
	public void doAssert() {
			System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("-------------------------------------TESTING SCENARIO -" + scenario + "- IN -" + app + "---------------------------------------------------------------------");
			try{
				Assert.assertEquals(1, output.size());
				System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(1, output.size()) | " + " PASSED");
				Assert.assertEquals(1, output.get(0).values.size());
				System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(1, output.get(0).values.size()) | " + " PASSED");
				Assert.assertTrue(output.get(0).values.get(0) instanceof Reference);
				System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertTrue(output.get(0).values.get(0) instanceof Reference) | " + " PASSED");
				Object_ item_poodle = ((Reference) output.get(0).values.get(0)).referent;
				Assert.assertEquals("Item", item_poodle.types.get(0).name);
				System.out.println("Scenario: " + scenario + " | " + app + " | Test: Object_ item_poodle = ((Reference) output.get(0).values.get(0)).referent -- Assert.assertEquals(\"Item\", item_poodle.types.get(0).name) | " + " PASSED");
				Assert.assertEquals(1, getFeatureValue(item_poodle, "name").size());
				System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(1, getFeatureValue(item_poodle, \"name\").size()) | " + " PASSED");
				Assert.assertEquals(
						"Poodle",
						((StringValue) getFeatureValue(item_poodle, "name").get(0)).value);
				System.out.println("Scenario: " + scenario + " | " + app + " | Test: Assert.assertEquals(\"Poodle\", ((StringValue) getFeatureValue(item_poodle, \"name\").get(0)).value) | " + " PASSED");
				System.out.println("-------------------------------------ALL TEST FOR SCENARIO -" + scenario + "- IN -" + app + "- PASSED-------------------------------------------------------------------------");
			}catch(AssertionError e){}
	}
}

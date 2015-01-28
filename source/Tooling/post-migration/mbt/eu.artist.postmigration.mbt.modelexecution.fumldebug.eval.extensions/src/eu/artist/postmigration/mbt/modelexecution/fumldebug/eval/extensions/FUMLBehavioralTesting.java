package eu.artist.postmigration.mbt.modelexecution.fumldebug.eval.extensions;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelexecution.fumldebug.core.ExecutionContext;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.InputParameterSetting;
import org.modelexecution.fumldebug.core.trace.tracemodel.InputParameterValue;
import org.modelexecution.fumldebug.core.trace.tracemodel.OutputParameterSetting;
import org.modelexecution.fumldebug.core.trace.tracemodel.OutputParameterValue;
import org.modelexecution.fumldebug.core.trace.tracemodel.Trace;
import org.modelexecution.fumldebug.core.trace.tracemodel.Trace;






import eu.artist.postmigration.mbt.modelexecution.fumldebug.eval.*;
import eu.artist.postmigration.mbt.modelexecution.fumldebug.eval.extensions.internal.ModelExecutor;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Semantics.Activities.IntermediateActivities.ActivityExecution;
import fUML.Syntax.Classes.Kernel.Parameter;

public class FUMLBehavioralTesting {

	private static final String PETSTORE_MODEL_PATH_L = "platform:/plugin/eu.artist.postmigration.mbt.modelexecution.fumldebug.eval/model/petstore.uml";
	private static final String TEST_LOGIN_L = "TestLogin";
	private static final String TEST_FIND_ITEM_L = "TestFindItem";
	
	private static final String PETSTORE_MODEL_PATH_M = "platform:/plugin/eu.artist.postmigration.mbt.modelexecution.fumldebug.eval/modelMigrated/petstore.uml";
	private static final String TEST_LOGIN_M = "TestLogin";
	private static final String TEST_FIND_ITEM_M = "TestFindItem";
	
	@BeforeClass
	public static void setupBeforeClass() {
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
	public void testLoginLeg() {
		ModelExecutor executor = new ModelExecutor(PETSTORE_MODEL_PATH_L, TEST_LOGIN_L);
		int rootExecutionID = executor.executeStepwise();
		ParameterValueList output = getExecutionContext().getActivityOutput(
				rootExecutionID);
				TestLoginAssert confirmTestLogin = new TestLoginAssert(getExecutionContext().getLocus(), "Test Login", "Legacy app", output);
		confirmTestLogin.doAssert();
	}
	
	@Test
	public void testLoginMig() {
		ModelExecutor executor = new ModelExecutor(PETSTORE_MODEL_PATH_M, TEST_LOGIN_M);
		int rootExecutionID = executor.executeStepwise();
		ParameterValueList output = getExecutionContext().getActivityOutput(
				rootExecutionID);
		TestLoginAssert confirmTestLogin = new TestLoginAssert(getExecutionContext().getLocus(), "Test Login", "Migrated app", output);
		confirmTestLogin.doAssert();
	}
	
	@Test
	public void testFindItemLeg() {
		ModelExecutor executor = new ModelExecutor(PETSTORE_MODEL_PATH_L, TEST_FIND_ITEM_L);
		int rootExecutionID = executor.executeStepwise();
		ParameterValueList output = getExecutionContext().getActivityOutput(
				rootExecutionID);
		TestFindItemAssert confirmTestFindItem = new TestFindItemAssert(getExecutionContext().getLocus(), "Test Find Item", "Legacy app", output);
		confirmTestFindItem.doAssert();
	}
	
	@Test
	public void testFindItemMig() {
		ModelExecutor executor = new ModelExecutor(PETSTORE_MODEL_PATH_M, TEST_FIND_ITEM_M);
		int rootExecutionID = executor.executeStepwise();
		ParameterValueList output = getExecutionContext().getActivityOutput(
				rootExecutionID);
		TestFindItemAssert confirmTestFindItem = new TestFindItemAssert(getExecutionContext().getLocus(), "Test Find Item", "Migrated app", output);
		confirmTestFindItem.doAssert();
	}
	
	public ExecutionContext getExecutionContext() {
		return ExecutionContext.getInstance();
	}
}

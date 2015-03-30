package org.modelexecution.fumldebug.standardlibrary;

import org.modelexecution.fumldebug.core.ExecutionContext;
import org.modelexecution.fumldebug.core.behaviorlibrary.IntegerGreaterThanOrEqualsFunctionBehaviorExecution;
import org.modelexecution.fumldebug.core.behaviorlibrary.IntegerLessThanFunctionBehaviorExecution;
import org.modelexecution.fumldebug.core.behaviorlibrary.IntegerLessThanOrEqualsFunctionBehaviorExecution;
import org.modelexecution.fumldebug.core.behaviorlibrary.ListGetFunctionBehaviorExecution;
import org.modelexecution.fumldebug.core.behaviorlibrary.ListIndexOfFunctionBehaviorExecution;
import org.modelexecution.fumldebug.core.behaviorlibrary.ListSizeFunctionBehaviorExecution;
import org.modelexecution.fumldebug.debugger.uml.libraryregistry.AbstractUMLOpaqueBehaviorExecutionRegistry;

import fUML.Library.IntegerFunctionImplementation.IntegerDivideFunctionBehaviorExecution;
import fUML.Library.IntegerFunctionImplementation.IntegerGreaterFunctionBehaviorExecution;
import fUML.Library.IntegerFunctionImplementation.IntegerMinusFunctionBehaviorExecution;
import fUML.Library.IntegerFunctionImplementation.IntegerPlusFunctionBehaviorExecution;
import fUML.Library.IntegerFunctionImplementation.IntegerTimesFunctionBehaviorExecution;

public class StandardLibraryRegistry extends AbstractUMLOpaqueBehaviorExecutionRegistry {

	protected final static String UML_STANDARD_LIBRARY_NAME = "UML Primitive Behaviors Library";
	
	@Override
	public void registerOpaqueBehaviorExecutions(
			ExecutionContext executionContext) {
		loadOpaqueBehaviors(UML_STANDARD_LIBRARY_NAME);

		registerOpaqueBehaviorExecution(new IntegerPlusFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::IntegerFunctions::IntegerPlus", executionContext);
		registerOpaqueBehaviorExecution(new IntegerMinusFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::IntegerFunctions::IntegerMinus", executionContext);
		registerOpaqueBehaviorExecution(new IntegerTimesFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::IntegerFunctions::IntegerTimes", executionContext);
		registerOpaqueBehaviorExecution(new IntegerDivideFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::IntegerFunctions::IntegerDivide", executionContext);
		registerOpaqueBehaviorExecution(new IntegerLessThanFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::IntegerFunctions::IntegerLess", executionContext);
		registerOpaqueBehaviorExecution(new IntegerGreaterFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::IntegerFunctions::IntegerGreater", executionContext);				
		registerOpaqueBehaviorExecution(new IntegerLessThanOrEqualsFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::IntegerFunctions::IntegerLessOrEquals", executionContext);
		registerOpaqueBehaviorExecution(new IntegerGreaterThanOrEqualsFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::IntegerFunctions::IntegerGreaterOrEquals", executionContext);
		
		registerOpaqueBehaviorExecution(new ListGetFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::ListFunctions::ListGet", executionContext);
		registerOpaqueBehaviorExecution(new ListSizeFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::ListFunctions::ListSize", executionContext);
		registerOpaqueBehaviorExecution(new ListIndexOfFunctionBehaviorExecution(), "UML::PrimitiveBehaviors::ListFunctions::ListIndexOf", executionContext);		
	}

}

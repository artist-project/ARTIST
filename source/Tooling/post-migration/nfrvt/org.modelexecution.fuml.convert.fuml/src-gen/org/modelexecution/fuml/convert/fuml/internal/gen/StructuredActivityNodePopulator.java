/*
* Copyright (c) 2013 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
* Tanja Mayerhofer - generator
*/
package org.modelexecution.fuml.convert.fuml.internal.gen;
    	
import javax.annotation.Generated;

import org.modelexecution.fuml.convert.fuml.internal.IElementPopulator;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;

@Generated(value="Generated by org.modelexecution.fuml.convert.fuml.gen.ElementPopulatorGenerator.xtend")
public class StructuredActivityNodePopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.modelexecution.fuml.Syntax.Classes.Kernel.Element fumlElement_, 
		ConversionResultImpl result
		) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode) ||
			!(fumlElement instanceof fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode)) {
			return;
		}
		
		fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode fumlNamedElement = (fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode) fumlElement;
		
		org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode) fumlElement_;
		
		
		for (org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode value : fumlNamedElement_.getNode()) {
					fumlNamedElement.node.add((fUML.Syntax.Activities.IntermediateActivities.ActivityNode) result.getFUMLElement(value));
		}
		
		fumlNamedElement.mustIsolate = fumlNamedElement_.isMustIsolate();
		
		for (org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge value : fumlNamedElement_.getEdge()) {
					fumlNamedElement.edge.add((fUML.Syntax.Activities.IntermediateActivities.ActivityEdge) result.getFUMLElement(value));
		}
		
		
		for (org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin value : fumlNamedElement_.getStructuredNodeOutput()) {
					fumlNamedElement.structuredNodeOutput.add((fUML.Syntax.Actions.BasicActions.OutputPin) result.getFUMLElement(value));
		}
		
		
		for (org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin value : fumlNamedElement_.getStructuredNodeInput()) {
					fumlNamedElement.structuredNodeInput.add((fUML.Syntax.Actions.BasicActions.InputPin) result.getFUMLElement(value));
		}
		
							
	}
	
}

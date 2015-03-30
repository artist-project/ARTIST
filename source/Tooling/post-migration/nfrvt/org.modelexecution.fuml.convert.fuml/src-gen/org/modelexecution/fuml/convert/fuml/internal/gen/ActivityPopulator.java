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
public class ActivityPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.modelexecution.fuml.Syntax.Classes.Kernel.Element fumlElement_, 
		ConversionResultImpl result
		) {
			
		if (!(fumlElement_ instanceof org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity) ||
			!(fumlElement instanceof fUML.Syntax.Activities.IntermediateActivities.Activity)) {
			return;
		}
		
		fUML.Syntax.Activities.IntermediateActivities.Activity fumlNamedElement = (fUML.Syntax.Activities.IntermediateActivities.Activity) fumlElement;
		
		org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity fumlNamedElement_ = (org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity) fumlElement_;
		
		
		for (org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode value : fumlNamedElement_.getNode()) {
					fumlNamedElement.node.add((fUML.Syntax.Activities.IntermediateActivities.ActivityNode) result.getFUMLElement(value));
		}
		
		fumlNamedElement.isReadOnly = fumlNamedElement_.isReadOnly();
		
		for (org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge value : fumlNamedElement_.getEdge()) {
					fumlNamedElement.edge.add((fUML.Syntax.Activities.IntermediateActivities.ActivityEdge) result.getFUMLElement(value));
		}
		
							
	}
	
}

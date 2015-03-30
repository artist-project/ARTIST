/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.nfr;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;

public class ResourceUsageCSVPrinter {

	private static final String NL = "\n";

	private ResourceUsageAnalysis analysis;
	private String sep = ",";

	public ResourceUsageCSVPrinter(ResourceUsageAnalysis analysis) {
		super();
		this.analysis = analysis;
	}

	public String getSeparator() {
		return sep;
	}

	public void setSeparator(String separator) {
		this.sep = separator;
	}

	public void printTo(OutputStream out) throws IOException {
		StringBuffer buffer = new StringBuffer();
		printTo(buffer);
		out.write(buffer.toString().getBytes());
		out.flush();
	}

	public void printTo(StringBuffer buffer) {
		printHeading(buffer);
		for (IResourceUsage ru : analysis.getResourceUsages()) {
			printResourceUsage(buffer, ru);
		}
	}

	private void printResourceUsage(StringBuffer buffer, IResourceUsage ru) {
		printLinePerResource(ru, buffer);
		if (ru.getUsedResources().size() > 1) {
			printSumLine(ru, buffer);
		}
		if (ru instanceof CompoundResourceUsage) {
			CompoundResourceUsage compoundResourceUsage = (CompoundResourceUsage) ru;
			for (IResourceUsage subResourceUsage : compoundResourceUsage
					.getSubUsages()) {
				printEmptyLine(buffer);
				printResourceUsage(buffer, subResourceUsage);
			}
		}
	}

	private void printEmptyLine(StringBuffer buffer) {
		if (!(String.valueOf(buffer.charAt(buffer.length() - 1)).equals(NL) && String
				.valueOf(buffer.charAt(buffer.length() - 2)).equals(NL)))
			buffer.append(NL);
	}

	private void printHeading(StringBuffer buffer) {
		buffer.append("Behavioral Unit" + sep + "Model Element Type" + sep
				+ "Resource" + sep + "Execution Time" + NL);
	}

	private void printLinePerResource(IResourceUsage ru, StringBuffer buffer) {
		for (Resource resource : ru.getUsedResources()) {
			buffer.append(ru.getElement().getName() + sep);
			buffer.append(ru.getElement().eClass().getName() + sep);
			buffer.append(resource.getBase_Property().getName() + sep);
			buffer.append(ru.getExecTime(resource) + NL);
		}
	}

	private void printSumLine(IResourceUsage ru, StringBuffer buffer) {
		float sum = getExecutionTimeSum(ru);
		buffer.append(sep + sep + sep + sum + NL);
	}

	private float getExecutionTimeSum(IResourceUsage ru) {
		float sum = 0f;
		for (Resource resource : ru.getUsedResources()) {
			sum += Float.valueOf(ru.getExecTime(resource));
		}
		return sum;
	}

}

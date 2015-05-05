/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result;

public abstract class AbstractPrinter {

	private static final String NEWLINE = "\n";
	
	private char separator;
	
	public AbstractPrinter() { }
	
	public AbstractPrinter(char separator) {
		setSeparator(separator);
	}
	
	public char getSeparator() {
		return separator;
	}
	
	public AbstractPrinter setSeparator(char separator) {
		this.separator = separator;
		return this;
	}
	
	protected void printLine(StringBuilder buffer, Object text) {
		buffer.append(text.toString() + NEWLINE);
	}
	
	protected void printWithSeparator(StringBuilder buffer, Object text) {
		buffer.append(text.toString() + getSeparator());
	}
	
	protected void printNewLine(StringBuilder buffer) {
		// don't allow empty values, all separator at the end get removed
		while(getSeparator() == buffer.charAt(buffer.length() - 1))
			buffer.deleteCharAt(buffer.length() - 1);
		buffer.append(NEWLINE);
	}

}

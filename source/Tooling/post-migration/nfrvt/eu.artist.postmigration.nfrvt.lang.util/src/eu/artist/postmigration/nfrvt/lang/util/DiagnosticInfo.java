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
package eu.artist.postmigration.nfrvt.lang.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;

/**
 * DiagnosticInfo is a convenience wrapper over the {@link Diagnostic}
 * produced through validation, that provides methods to access
 * all contained diagnostics based on their severity (OK, INFO, WARNING, 
 * ERROR).
 * 
 * @author Martin Fleck
 *
 * @see Diagnostic
 * @see Diagnostician
 * @see EValidator
 */
public class DiagnosticInfo {
	private Diagnostic rootDiagnostic;
	private List<Diagnostic> oks = new ArrayList<>();
	private List<Diagnostic> infos = new ArrayList<>();
	private List<Diagnostic> warnings = new ArrayList<>();
	private List<Diagnostic> errors = new ArrayList<>();
	
	/**
	 * DiagnosticInfo is a wrapper over the given {@link Diagnostic}
	 * to provide access to all in rootDiagnostic contained diagnostics
	 * based on their severity (OK, INFO, WARNING, ERROR).
	 *
	 * @param rootDiagnostic root diagnostic
	 */
	public DiagnosticInfo(Diagnostic rootDiagnostic) {
		this.rootDiagnostic = rootDiagnostic;
		if(rootDiagnostic != null)
			for(Diagnostic child : rootDiagnostic.getChildren())
				sortDiagnostic(child);
	}
	
	/**
	 * Sorts the given diagnostic and its children based on the diagnostics
	 * severity into this diagnostic info.
	 * 
	 * @param diagnostic root diagnostic
	 */
	protected void sortDiagnostic(Diagnostic diagnostic) {
		switch(diagnostic.getSeverity()) {
			case Diagnostic.OK:
				oks.add(diagnostic);
				break;
			case Diagnostic.INFO:
				infos.add(diagnostic);
				break;
			case Diagnostic.WARNING:
				warnings.add(diagnostic);
				break;
			case Diagnostic.ERROR:
				errors.add(diagnostic);
				break;
		}
		for (Diagnostic child : diagnostic.getChildren())
			sortDiagnostic(child);
	}
	
	/**
	 * True if there are neither errors nor warnings, false otherwise.
	 * 
	 * @return true if there are neither errors nor warnings, false otherwise
	 */
	public boolean isSuccess() {
		return !hasErrors() && !hasWarnings();
	}

	/**
	 * True if there are diagnostics with OK severity, false otherwise.
	 * 
	 * @return true if there are diagnostics with OK severity, false otherwise
	 * @see Diagnostic#OK
	 */
	public boolean hasOks() {
		return !oks.isEmpty();
	}
	
	/**
	 * True if there are diagnostics with INFO severity, false otherwise.
	 * 
	 * @return true if there are diagnostics with INFO severity, false 
	 * otherwise
	 * @see Diagnostic#INFO
	 */
	public boolean hasInfos() {
		return !infos.isEmpty();
	}
	
	/**
	 * True if there are diagnostics with WARNING severity, false otherwise.
	 * 
	 * @return true if there are diagnostics with WARNING severity, false 
	 * otherwise
	 * @see Diagnostic#WARNING
	 */
	public boolean hasWarnings() {
		return !warnings.isEmpty();
	}
	
	/**
	 * True if there are diagnostics with ERROR severity, false otherwise.
	 * 
	 * @return true if there are diagnostics with ERROR severity, false 
	 * otherwise
	 * @see Diagnostic#ERROR
	 */
	public boolean hasErrors() {
		return !errors.isEmpty();
	}
	
	/**
	 * Returns the root diagnostic containing all other diagnostics.
	 * @return root diagnostic
	 */
	public Diagnostic getRootDiagnostic() {
		return rootDiagnostic;
	}

	/**
	 * Returns all diagnostics with OK severity. 
	 * The returned list may be empty.
	 * 
	 * @return list of all diagnostics with OK severity, may be empty
	 * @see Diagnostic#OK
	 */
	public List<Diagnostic> getOks() {
		return oks;
	}

	/**
	 * Returns all diagnostics with INFO severity. 
	 * The returned list may be empty.
	 * 
	 * @return list of all diagnostics with INFO severity, may be empty
	 * @see Diagnostic#INFO
	 */
	public List<Diagnostic> getInfos() {
		return infos;
	}

	/**
	 * Returns all diagnostics with WARNING severity.
	 * The returned list may be empty.
	 * 
	 * @return list of all diagnostics with WARNING severity, may be empty
	 * @see Diagnostic#WARNING
	 */
	public List<Diagnostic> getWarnings() {
		return warnings;
	}

	/**
	 * Returns all diagnostics with ERROR severity. 
	 * The returned list may be empty.
	 * 
	 * @return list of all diagnostics with ERROR severity, may be empty
	 * @see Diagnostic#ERROR
	 */
	public List<Diagnostic> getErrors() {
		return errors;
	}
	
	/**
	 * Returns a list of all messages of the given diagnostics.
	 * @param diagnostics diagnostics from which to get the messages
	 * @return list of messages, may be empty
	 */
	protected List<String> collectMessages(List<Diagnostic> diagnostics) {
		List<String> messages = new ArrayList<>();
		for(Diagnostic diagnostic : diagnostics)
			messages.add(diagnostic.getMessage());
		return messages;
	}
	
	/**
	 * Returns all messages from diagnostics with OK severity. 
	 * The returned list may be empty.
	 * 
	 * @return list of all messages with OK severity, may be empty
	 * @see Diagnostic#OK
	 */
	public List<String> getOkMessages() {
		return collectMessages(oks);
	}
	
	/**
	 * Returns all messages from diagnostics with INFO severity. 
	 * The returned list may be empty.
	 * 
	 * @return list of all messages with INFO severity, may be empty
	 * @see Diagnostic#INFO
	 */
	public List<String> getInfoMessages() {
		return collectMessages(infos);
	}
	
	/**
	 * Returns all messages from diagnostics with WARNING severity. 
	 * The returned list may be empty.
	 * 
	 * @return list of all messages with WARNING severity, may be empty
	 * @see Diagnostic#WARNING
	 */
	public List<String> getWarningMessages() {
		return collectMessages(warnings);
	}
	
	/**
	 * Returns all messages from diagnostics with ERROR severity. 
	 * The returned list may be empty.
	 * 
	 * @return list of all messages with ERROR severity, may be empty
	 * @see Diagnostic#ERROR
	 */
	public List<String> getErrorMessages() {
		return collectMessages(errors);
	}
	
	/**
	 * Returns all messages from diagnostics, independent from their severity. 
	 * The returned list may be empty.
	 * 
	 * @return list of all messages, may be empty
	 * @see Diagnostic
	 */
	public List<String> getMessages() {
		List<String> messages = new ArrayList<>(getOkMessages());
		messages.addAll(getInfoMessages());
		messages.addAll(getWarningMessages());
		messages.addAll(getErrorMessages());
		return messages;
	}
	
	@Override
	public String toString() {
		if(getRootDiagnostic() == null)
			return "";
		String txt = getRootDiagnostic().getMessage() + ":";
		if(hasOks())
			txt += "\nOK: " + getOkMessages();
		if(hasInfos())
			txt += "\nInfos: " + getInfoMessages();
		if(hasWarnings())
			txt += "\nWarnings: " + getWarningMessages();
		if(hasErrors())
			txt += "\nErrors: " + getErrorMessages();
		if(!hasOks() && !hasInfos() && !hasWarnings() && !hasErrors())
			txt += "\nNo issues could be found.";
		return txt;
	}
	
	/**
	 * Returns the string representation for the given diagnostic.
	 * This is equal to creating an instance of {@link DiagnosticInfo}
	 * based on the given diagnostic an calling the {@link #toString()} method.
	 * 
	 * @param diagnostic diagnostic for which a string representation should be
	 * created
	 * @return string representation of diagnostic
	 */
	public static String toString(Diagnostic diagnostic) {
		return new DiagnosticInfo(diagnostic).toString();
	}
}
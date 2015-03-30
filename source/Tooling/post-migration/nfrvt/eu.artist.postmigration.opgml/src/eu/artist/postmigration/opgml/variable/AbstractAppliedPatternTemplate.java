/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
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
package eu.artist.postmigration.opgml.variable;

import at.ac.tuwien.big.moea.variable.RandomIntegerVariable;
import eu.artist.postmigration.opgml.gml.uml.UMLElement;


public abstract class AbstractAppliedPatternTemplate extends AbstractPatternTemplate implements IPatternTemplateVariable {

	private static final long serialVersionUID = -3044814714748139628L;
	
	protected static String getApplicationParameter() {
		return "applicationElementIndex";
	}
	
	public UMLElement[] possibleApplications;
	
	public AbstractAppliedPatternTemplate(UMLElement[] possibleApplications) {
		setPossibleApplications(possibleApplications);
	}
	
	public AbstractAppliedPatternTemplate(String name, UMLElement[] possibleApplications) {
		super(name);
		setPossibleApplications(possibleApplications);
	}
	
	public AbstractAppliedPatternTemplate(String name, String[] uniquenessParameters, UMLElement[] possibleApplications) {		
		super(name, uniquenessParameters);
		setPossibleApplications(possibleApplications);
	}
	
	private void setPossibleApplications(UMLElement[] possibleApplications) {
		if(possibleApplications == null)
			return;
		this.possibleApplications = possibleApplications;
		setParameter(getApplicationParameter(), new RandomIntegerVariable(0, possibleApplications.length - 1));
	}

	protected UMLElement[] getPossibleApplications() {
		return possibleApplications;
	}
	
	protected RandomIntegerVariable getApplicationIndexVariable() {
		return (RandomIntegerVariable) getParameterValue(getApplicationParameter());
	}
	
	protected int getApplicationIndex() {
		return getApplicationIndexVariable().getValue();
	}
	
	@Override
	public UMLElement getApplication() {
		return getPossibleApplications()[getApplicationIndex()];
	}
	
	@Override
	public IPatternTemplateVariable setApplication(UMLElement element) {
		int i = 0;
		int found = -1;
		for(UMLElement e : getPossibleApplications()) {
			if(e.equals(element)) {
				found = i;
				break;
			} else
				i++;
		}
		if(found > -1)
			getApplicationIndexVariable().setValue(found);
		return this;
	}
		
	@Override
	public IPatternTemplateVariable randomize() {
		getApplicationIndexVariable().randomize();
		return this;
	}
}

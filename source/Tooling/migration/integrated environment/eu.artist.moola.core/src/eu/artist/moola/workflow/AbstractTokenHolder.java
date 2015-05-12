/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.moola.workflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbstractTokenHolder implements ITokenHolder {

	protected List<Arc> inputs;
	protected List<Arc> outputs;
	protected Map<String, Token> tokens;
	protected String name;
	
	public AbstractTokenHolder(String name) {
		this.name = name;
		this.inputs = new ArrayList<>();
		this.outputs = new ArrayList<>();
		this.tokens = new HashMap<>();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void addToken(Token token) {
		this.tokens.put(token.getName(), token);
	}

	@Override
	public Token takeToken(String name) {
		return this.tokens.get(name);
	}

	@Override
	public boolean hasToken(String name) {
		return this.tokens.containsKey(name);
	}

	@Override
	public boolean hasTokens() {
		return this.tokens.size() > 0;
	}

	@Override
	public int tokenCount() {
		return this.tokens.size();
	}

	@Override
	public Collection<Token> takeAllTokens() {
		Collection<Token> ret = new ArrayList<>(this.tokens.values());
		this.tokens.clear();
		return ret;
	}

	@Override
	public void addInput(Arc arc) {
		this.inputs.add(arc);
	}

	@Override
	public void addOutput(Arc arc) {
		this.outputs.add(arc);
	}

	@Override
	public boolean hasOutput() {
		return this.outputs.size() > 0;
	}

}

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
package eu.artist.postmigration.nfrvt.lang.util.mwe.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

public abstract class ARTISTDeclarativeFormatter extends AbstractDeclarativeFormatter {

	protected void configureParenthesisStyle(FormattingConfig c, String leftParenthesis, String rightParenthesis) {
		for (Pair<Keyword, Keyword> pair : getGrammarAccess().findKeywordPairs(leftParenthesis , rightParenthesis)) {
			c.setSpace(" ").before(pair.getFirst());
			c.setLinewrap().after(pair.getFirst());
			c.setLinewrap().before(pair.getSecond());
			c.setIndentationIncrement().after(pair.getFirst());
			c.setIndentationDecrement().before(pair.getSecond());
			c.setLinewrap().after(pair.getSecond());
		}
	}
	
	protected void configureCommaStyle(FormattingConfig c, String comma) {
		for (Keyword kw : getGrammarAccess().findKeywords(comma)) {
			 c.setNoLinewrap().before(kw);
			 c.setNoSpace().before(kw);
			 c.setLinewrap().after(kw);
		 }
	}
	
	protected void preserveNewLinesAroundComments(FormattingConfig c, TerminalRule SLcommentRule, TerminalRule MLcommentRule) {
		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(SLcommentRule);
		c.setLinewrap(0, 1, 2).before(MLcommentRule);
		c.setLinewrap(0, 1, 1).after(MLcommentRule);
	}
	
	protected void preserveVariableNames(FormattingConfig c, String...prefix) {
		for(Keyword kw : getGrammarAccess().findKeywords(prefix)) {
			c.setSpace(" ").before(kw);
			c.setNoSpace().after(kw);
		}
	}
	
	protected void formatImports(FormattingConfig c, ParserRule importRule) {
		c.setLinewrap(0, 1, 2).before(importRule);
		c.setLinewrap(1, 1, 2).after(importRule);
	}
}

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

/**
 * Common super class of ARTIST language formatters.
 * @author Martin Fleck
 *
 */
public abstract class ARTISTDeclarativeFormatter extends AbstractDeclarativeFormatter {

	/**
	 * Configures c to have a space before the leftParenthesis and a line wrap 
	 * after and to have a line wrap before and after the rightParenthesis. The
	 * lines between the two are indented. 
	 * 
	 * @param c the configuration to be adapted
	 * @param leftParenthesis the string symbol for left parenthesis, e.g., '('
	 * @param rightParenthesis the string symbol for right parenthesis, e.g., 
	 * ')'
	 */
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
	
	/**
	 * Configures c to have no line wrap or space before the comma, but a line wrap
	 * after.
	 * @param c the configuration to be adapted
	 * @param comma the string for comma, e.g., ',' or ';'
	 */
	protected void configureCommaStyle(FormattingConfig c, String comma) {
		for (Keyword kw : getGrammarAccess().findKeywords(comma)) {
			 c.setNoLinewrap().before(kw);
			 c.setNoSpace().before(kw);
			 c.setLinewrap().after(kw);
		 }
	}
	
	/**
	 * Preserve new lines around single-line comments and multi-line comments.
	 * @param c the configuration to be adapted
	 * @param SLcommentRule rule for single-line comment
	 * @param MLcommentRule rule for multi-line comment
	 */
	protected void preserveNewLinesAroundComments(FormattingConfig c, TerminalRule SLcommentRule, TerminalRule MLcommentRule) {
		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(SLcommentRule);
		c.setLinewrap(0, 1, 2).before(MLcommentRule);
		c.setLinewrap(0, 1, 1).after(MLcommentRule);
	}
	
	/**
	 * Makes sure that a space is before the prefix, but not after.
	 * @param c the configuration to be adapted
	 * @param prefix list of considered prefix characters, e.g., '$'
	 */
	protected void preserveVariableNames(FormattingConfig c, String...prefix) {
		for(Keyword kw : getGrammarAccess().findKeywords(prefix)) {
			c.setSpace(" ").before(kw);
			c.setNoSpace().after(kw);
		}
	}
	
	/**
	 * Formats the imports so that within a block of imports there is no empty
	 * line in between, but there is an empty line after the block.
	 * @param c the configuration to be adapted
	 * @param importRule the rule used for imports
	 */
	protected void formatImports(FormattingConfig c, ParserRule importRule) {
		c.setLinewrap(0, 1, 2).before(importRule);
		c.setLinewrap(1, 1, 2).after(importRule);
	}
}

/*******************************************************************************
 * Copyright (c) 2010, 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * - Original implementation by Christian Dietrich, retrieved from his blog at 
 *   http://christiandietrich.wordpress.com/2011/07/17/xtext-2-0-and-uml/
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.uml.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

/**
 * Implementation retrieved from Christian Dietrichs blog post.
 * 
 * @see <a href="http://christiandietrich.wordpress.com/2011/07/17/xtext-2-0-and-uml/">
 * Original blog post by Christian Dietrich</a>
 */
public class UmlUiModule extends EmfUiModule {

	public UmlUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
		binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(UmlEditorOpener.class);
	}

}
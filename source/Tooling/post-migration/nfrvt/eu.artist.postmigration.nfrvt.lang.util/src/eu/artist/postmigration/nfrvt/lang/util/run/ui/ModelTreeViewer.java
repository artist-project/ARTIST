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
package eu.artist.postmigration.nfrvt.lang.util.run.ui;

import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

import eu.artist.postmigration.nfrvt.lang.gel.gel.util.GelAdapterFactory;
import eu.artist.postmigration.nfrvt.lang.gml.gml.util.GmlAdapterFactory;
import eu.artist.postmigration.nfrvt.lang.pml.pml.util.PmlAdapterFactory;

public class ModelTreeViewer extends TreeViewer {

	public ModelTreeViewer(Composite parent) {
		super(parent);
		init();
	}
	
	public ModelTreeViewer(Composite parent, int style) {
		super(parent, style);
		init();
	}

	public ModelTreeViewer(Tree tree) {
		super(tree);
		init();
	}

	protected void init() {
		/**
		 * Creates the adapter factories containing the necessary item providers.
		 * All factories are collected into a single {@link ComposedAdapterFactory}.
		 */
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new GmlAdapterFactory());
		adapterFactory.addAdapterFactory(new GelAdapterFactory());
		adapterFactory.addAdapterFactory(new PmlAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new UMLItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		
		setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		new AdapterFactoryTreeEditor(getTree(), adapterFactory);
	}

}

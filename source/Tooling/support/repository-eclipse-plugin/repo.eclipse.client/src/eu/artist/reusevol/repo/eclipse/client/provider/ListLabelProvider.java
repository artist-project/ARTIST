/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Huzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.provider;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.model.RepoServer;

/**
 * TreeLabelProvider :Label provider for the treeviewer of repository
 * 
 * **/
public class ListLabelProvider extends LabelProvider {

	private static final Image REPOSITORY = getImage("book.png");
	private static final Image FILE = getImage("file.png");
	private static final Image PACKAGE = getImage("package_obj.png");
	private static final Image CATEGORY = getImage("book.png");
	private static final Image SERVER = getImage("server.png");
	@SuppressWarnings("deprecation")
	private static final Image TAG = getdefaultImage(ISharedImages.IMG_OBJS_TASK_TSK);
	@Override
	public String getText(Object element) {
		LocalRepositoryModel model = LocalRepositoryModel.getInstance();

		if (element instanceof RepoServer) {
			RepoServer server = (RepoServer) element;
			return server.getName();
		} else if (element instanceof RepoProject) {
			RepoProject repository = (RepoProject) element;
			return repository.getLabel();
		} else if (element instanceof RepoPackage) {
			RepoPackage packages = (RepoPackage) element;
			int count = packages.getArtefacts().size();
			String members = (count > 0) ? " (" + count + ")" : "";
			return packages.getLabel() + members;
		} else if (element instanceof RepoCategory) {
			RepoCategory repocat = (RepoCategory) element;
			int count = model.getArtefactsForCategory(repocat.getId()).size();
			String members = (count > 0) ? " (" + count + ")" : "";
			return repocat.getLabel() + members;
		}else if (element instanceof String) {
			String tag =  (String) element;
			int count = model.getArtefactsForTag(tag).size();
			String members = (count > 0) ? " (" + count + ")" : "";
			return tag + members;
		}

		return ((RepoArtefact) element).getName();
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof RepoServer) {
			return SERVER;
		} else if (element instanceof RepoProject) {
			return REPOSITORY;
		} else if (element instanceof RepoPackage) {
			return PACKAGE;
		} else if (element instanceof RepoCategory) {
			return CATEGORY;
		} else if (element instanceof String) {
				return TAG;
		}
		return FILE;
	}

	// Helper Method to load the images
	private static Image getImage(String file) {
		Bundle bundle = FrameworkUtil.getBundle(ListLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path("icons/" + file), null);
		ImageDescriptor image = ImageDescriptor.createFromURL(url);
		return image.createImage();

	}
	
	// Helper Method to load the images
		private static Image getdefaultImage(String name) {
		
			return PlatformUI.getWorkbench().getSharedImages().getImage(name);

		}
}

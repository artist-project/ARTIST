/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
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
package eu.artist.reusevol.repo.eclipse.client.api;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;

import com.google.common.base.Optional;
import com.google.common.base.Strings;

import eu.artist.reusevol.repo.client.ArtefactManager;
import eu.artist.reusevol.repo.client.CategoryManager;
import eu.artist.reusevol.repo.client.ProjectManager;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.model.RepoServer;
import eu.artist.reusevol.repo.eclipse.client.util.ContentTypeHelper;

/**
 * This class bundles all operations performed on the remote repositories. It
 * updates the local model as well. Updates of the GUI elements are out of scope
 * of this class and must be handled in the calling methods.
 * 
 * @author strauss
 */
public class RepositoryClientApi {
	private static RepositoryClientApi INSTANCE;
	private LocalRepositoryModel model;

	private RepositoryClientApi() {
		model = LocalRepositoryModel.getInstance();
	}

	/**
	 * Get the Singleton instance of this class.
	 * 
	 * @return the Singleton instance of the RepositoryClientApi
	 */
	public static RepositoryClientApi getInstance() {
		if (INSTANCE == null)
			INSTANCE = new RepositoryClientApi();
		return INSTANCE;
	}

	/**
	 * Deletes a project. If the project is not empty an exception is thrown.
	 * 
	 * @param toDelete
	 *            the project to delete
	 * @throws RepoClientException
	 *             if the project is not empty or another error occured
	 */
	public void deleteProject(RepoProject toDelete) throws RepoClientException {
		RepoServer server = model.getServerForElement(toDelete);
		if (server != null) {
			ProjectManager service = server.getClient().getProjectManager();

			try {
				service.delete(toDelete);
				server.getProjects().remove(toDelete);
			} catch (Exception ex) {
				throw new RepoClientException(ex);
			}
		}

	}

	/**
	 * Deleted projects even if they are non empty.
	 * 
	 * @param toDelete
	 *            the project to delete
	 * @throws RepoClientException
	 */
	public void forceDeleteProject(RepoProject toDelete)
			throws RepoClientException {
		RepoServer server = model.getServerForElement(toDelete);
		if (server != null) {
			ProjectManager service = server.getClient().getProjectManager();

			try {
				service.delete(toDelete);
				server.getProjects().remove(toDelete);
			} catch (Exception ex) {
				throw new RepoClientException(ex);
			}
		}
	}

	/**
	 * Updates a project.
	 * 
	 * @param toUpdate
	 *            the project to update
	 * @throws RepoClientException
	 */
	public void updateProject(RepoProject toUpdate) throws RepoClientException {
		RepoServer server = model.getServerForElement(toUpdate);
		if (server != null) {
			ProjectManager service = server.getClient().getProjectManager();

			try {
				service.update(toUpdate);
				// Under the assumption that toUpdate is part of the local
				// model, no additional update of the model is necessary
			} catch (Exception ex) {
				throw new RepoClientException(ex);
			}
		}
	}

	/**
	 * Creates a project on the specified server.
	 * 
	 * @param server
	 *            the server used in this operation
	 * @param name
	 *            the logical project name
	 * @param label
	 *            the label
	 * @param description
	 *            the description
	 * @return the created RepoProject
	 * @throws RepoClientException
	 */
	public RepoProject createProject(RepoServer server, String name,
			String label, String description) throws RepoClientException {
		if (server != null) {
			ProjectManager service = server.getClient().getProjectManager();

			try {
				label = (!Strings.isNullOrEmpty(label)) ? label : name;

				RepoProject created = service.create(new RepoProject(name,
						label, description));
				server.getProjects().add(created);
				return created;
			} catch (Exception ex) {
				throw new RepoClientException(ex);
			}
		}
		return null;
	}

	/**
	 * Creates a category on the specified server.
	 * 
	 * @param server
	 *            the server used in this operation
	 * @param parent
	 *            the parent category or null for top level categories
	 * @param name
	 *            the logical name of the category
	 * @param label
	 *            the label
	 * @param description
	 *            the description
	 * @return the created RepoCategory
	 * @throws RepoClientException
	 */
	public RepoCategory createCategory(RepoServer server, RepoCategory parent,
			String name, String label, String description)
			throws RepoClientException {

		if (server == null)
			return null;

		// RepoCategory parent = server.getParentCategory(toDelete);

		String id = (parent != null) ? parent.getId() + "." + name : name;
		label = (!Strings.isNullOrEmpty(label)) ? label : name;

		CategoryManager service = server.getClient().getCategoryManager();
		try {
			RepoCategory created = service.create(new RepoCategory(id, label,
					description));

			if (parent != null) {
				parent.getCategories().add(created);
			} else {
				server.getCategories().add(created);
			}

			return created;
		} catch (Exception ex) {
			throw new RepoClientException(ex);
		}
	}

	/**
	 * Deletes an empty category. Throws an RepoClientException if the category
	 * has sub-categories.
	 * 
	 * @param server
	 *            the server to use
	 * @param toDelete
	 *            the category to delete
	 * @throws RepoClientException
	 */
	public void deleteCategory(RepoServer server, RepoCategory toDelete)
			throws RepoClientException {

		if (server == null)
			return;

		CategoryManager service = server.getClient().getCategoryManager();

		try {
			service.delete(toDelete);

			RepoCategory parent = server.getParentCategory(toDelete);
			if (parent != null) {
				parent.getCategories().remove(toDelete);
			} else {
				server.getCategories().remove(toDelete);
			}
		} catch (Exception ex) {
			throw new RepoClientException(ex);
		}
	}

	/**
	 * Deletes a category.
	 * 
	 * @param server
	 *            the server to use
	 * @param toDelete
	 *            the category to delete
	 * @throws RepoClientException
	 */
	public void forceDeleteCategory(RepoServer server, RepoCategory toDelete)
			throws RepoClientException {

		if (server == null)
			return;

		CategoryManager service = server.getClient().getCategoryManager();

		try {
			service.delete(toDelete);

			RepoCategory parent = server.getParentCategory(toDelete);
			if (parent != null) {
				parent.getCategories().remove(toDelete);
			} else {
				server.getCategories().remove(toDelete);
			}
		} catch (Exception ex) {
			throw new RepoClientException(ex);
		}
	}

	/**
	 * Updates a category.
	 * 
	 * @param toUpdate
	 *            the category to update
	 * @throws RepoClientException
	 */
	public void updateCategory(RepoCategory toUpdate)
			throws RepoClientException {

		Collection<RepoServer> servers = model.getServersWithCategory(toUpdate);

		for (RepoServer server : servers) {
			if (server != null) {
				CategoryManager service = server.getClient()
						.getCategoryManager();

				try {
					service.update(toUpdate);
					// Under the assumption that toUpdate is part of the local
					// model, no additional update of the model is necessary
				} catch (Exception ex) {
					throw new RepoClientException(ex);
				}
			}

		}
	}

	/**
	 * Deletes an artefact.
	 * 
	 * @param toDelete
	 *            the RepoArtefact to delete
	 * @throws RepoClientException
	 */
	public void deleteArtefact(RepoArtefact toDelete)
			throws RepoClientException {

		RepoServer server = model.getServerForElement(toDelete);
		RepoPackage pkg = model.getPackagefromSelectedArtifact(toDelete);

		LocalRepositoryModel model = LocalRepositoryModel.getInstance();
		if (server != null) {
			RepoProject project = model
					.getProjectfromSelectedArtifact(toDelete);
			ArtefactManager service = server.getClient().getArtefactManager(
					project.getId());

			try {
				// removing from server
				service.delete(toDelete);
				// removing from local model
				removeArtefactfromLocalModel(toDelete, server);
				// removing from categoryMap
				removeArtifactsfromCategoryMap(toDelete);
				removeArtifactsfromTagMap(toDelete);
				// remove empty package after deletion if artifact is empty
				deleteEmptyPackage(pkg);
			} catch (Exception ex) {
				throw new RepoClientException(ex);
			}

		}
	}

	private RepoProject removeArtefactfromLocalModel(RepoArtefact toremove,
			RepoServer server) {

		for (RepoProject project : server.getProjects()) {
			for (RepoPackage pkg : project.getPackages()) {
				for (RepoArtefact current : pkg.getArtefacts()) {
					if (current.equals(toremove)) {
						pkg.getArtefacts().remove(current);
						break;

					}
				}
			}
		}

		return null;
	}

	private void deleteEmptyPackage(RepoPackage pkg) {
		if (!pkg.getArtefacts().isEmpty())
			return;

		model.getProjectfromSelectedPackage(pkg).getPackages().remove(pkg);
	}

	private void removeArtifactsfromCategoryMap(RepoArtefact toDelete) {
		LocalRepositoryModel model = LocalRepositoryModel.getInstance();

		List<String> categories = toDelete.getCategories();
		for (String currentCategory : categories) {
			List<RepoArtefact> artifactsforCategory = model
					.getArtefactsForCategory(currentCategory);
			if (artifactsforCategory != null
					&& artifactsforCategory.contains(toDelete)) {
				artifactsforCategory.remove(toDelete);
				System.out.println(" Artefact removed from category map ");
			}
		}

	}

	private void removeArtifactsfromTagMap(RepoArtefact toDelete) {
		LocalRepositoryModel model = LocalRepositoryModel.getInstance();

		List<String> tags = toDelete.getTags();
		for (String currentTag : tags) {
			List<RepoArtefact> artifactsforTag = model
					.getArtefactsForTag(currentTag);
			if (artifactsforTag != null && artifactsforTag.contains(toDelete)) {
				artifactsforTag.remove(toDelete);
				System.out.println(" Artefact removed from tagmap ");
			}
		}
	}

	/**
	 * Creates an artefact.
	 * 
	 * @param toCreate
	 *            the RepoArtefact to create
	 * @throws RepoClientException
	 */
	public void createArtefact(RepoProject targetProject, RepoArtefact toCreate)
			throws RepoClientException {
		RepoServer server = model.getServerForElement(targetProject);
		// RepoProject project = model.getProjectfromSelectedArtifact(toCreate);

		if ((server != null) && (targetProject != null)) {
			ArtefactManager service = server.getClient().getArtefactManager(
					targetProject.getId());

			try {
				service.create(toCreate);
				updateLocalModelWithNewArtefact(toCreate, targetProject);
			} catch (Exception ex) {
				throw new RepoClientException(ex);
			}
		}
	}

	private void updateLocalModelWithNewArtefact(RepoArtefact toCreate,
			RepoProject project) {
		String packageName = toCreate.getPackageId();
		boolean packageExists = false;
		for (RepoPackage pkg : project.getPackages()) {
			if (pkg.getName().equals(packageName)) {
				pkg.getArtefacts().add(toCreate);
				packageExists = true;
				break;
			}
		}
		if (!packageExists) {
			RepoPackage newPackage = new RepoPackage(packageName);
			newPackage.getArtefacts().add(toCreate);
			project.getPackages().add(newPackage);
		}
		model.updateCategoriesForNewArtefact(toCreate);
	}

	/**
	 * Updates an existing artefact.
	 * 
	 * @param toUpdate
	 *            the artefact to update
	 * @throws RepoClientException
	 */
	public void updateArtefact(RepoArtefact toUpdate)
			throws RepoClientException {

		try {
			getService(toUpdate).update(toUpdate);
			// Under the assumption that toUpdate is part of the local
			// model, no additional update of the model is necessary
		} catch (Exception ex) {
			throw new RepoClientException(ex);
		}
	}

	/**
	 * Download an artefact without its content.
	 * 
	 * @param toDownload
	 *            the RepoArtefact to download
	 * @return the retrieved RepoArtefact
	 * @throws RepoClientException
	 */
	public RepoArtefact getArtefact(RepoArtefact toDownload)
			throws RepoClientException {

		Optional<RepoArtefact> result = null;
		try {
			result = getService(toDownload).get(toDownload);
		} catch (Exception ex) {
			throw new RepoClientException(ex);
		}

		if (!result.isPresent())
			throw new RepoClientException("Artefact not found: " + toDownload);

		return result.get();
	}

	/**
	 * Download the content of an artefact.
	 * 
	 * @param toDownload
	 *            the RepoArtefact to download
	 * @return the retrieved content as InputStream
	 * @throws RepoClientException
	 */
	public InputStream getArtefactContent(RepoArtefact toDownload)
			throws RepoClientException {
		try {
			return getService(toDownload).getContent(toDownload);
		} catch (Exception ex) {
			throw new RepoClientException(
					"Content of artefact could not be downloaded: "
							+ toDownload, ex);
		}
	}

	/**
	 * Download the content of an artefact.
	 * 
	 * @param toDownload
	 *            the RepoArtefact to download
	 * @return the retrieved content as InputStream
	 * @throws RepoClientException
	 */
	public void setArtefactContent(RepoArtefact toUpload, InputStream content,
			String name, String mimetype, String encoding)
			throws RepoClientException {
		try {
			getService(toUpload).setContent(toUpload, content, name, mimetype,
					encoding);
		} catch (Exception ex) {
			throw new RepoClientException(
					"Content of artefact could not be uploaded: " + toUpload,
					ex);
		}
	}

	/**
	 * Upload the content of an artefact.
	 * 
	 * @param toUpload
	 *          the target RepoArtefact
	 * @param content
	 * 			the file to upload and attach to the artefact
	 * @throws RepoClientException
	 */
	public void setArtefactContent(RepoArtefact toUpload, IFile content)
			throws RepoClientException {
		try {
			getService(toUpload).setContent(
					toUpload,
					content.getContents(),
					content.getName(),
					ContentTypeHelper.mimeTypeFromContentType(content
							.getContentDescription().getContentType()),
					content.getCharset());
		} catch (Exception ex) {
			throw new RepoClientException(
					"Content of artefact could not be uploaded: " + toUpload,
					ex);
		}
	}

	/**
	 * Check, if an artefact exists.
	 * @param the artefact to check 
	 * @return true, if the artefact exists, false otherwise.
	 */
	public boolean exists(RepoArtefact entity) {
		ArtefactManager service = getService(entity);
		if (service == null) {
			return false;
		} else {
			return service.exists(entity);
		}
	}

	/**
	 * Check, if a project exists.
	 * @param the project to check 
	 * @return true, if the project exists, false otherwise.
	 */
	public boolean exists(RepoProject entity) {
		RepoServer server = model.getServerForElement(entity);
		if (server != null) {
			ProjectManager service = server.getClient().getProjectManager();
			return service.exists(entity);
		} else {
			return false;
		}
	}

	/**
	 * Check, if a category exists.
	 * @param the category to check 
	 * @return true, if the category exists, false otherwise.
	 */
	public boolean exists(RepoCategory entity) {
		Collection<RepoServer> servers = model.getServersWithCategory(entity);

		for (RepoServer server : servers) {
			if (server != null) {
				CategoryManager service = server.getClient()
						.getCategoryManager();
				return service.exists(entity);
			}
		}
		return false;
	}

	private ArtefactManager getService(RepoArtefact artefact) {
		RepoServer server = model.getServerForElement(artefact);
		if (server == null) return null;
		RepoProject project = model.getProjectfromSelectedArtifact(artefact);
		if (project == null) return null;
		return server.getClient().getArtefactManager(project.getId());
	}
}

/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.common.model;

import java.io.InputStream;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.jcrom.annotations.JcrNode;

import eu.artist.reusevol.repo.common.util.jaxb.AnyTypeAdapter;

/**
 * Interface that represents the artefact content. Instances can e.g. represent
 * content in the database or content referenced in external data stores or the
 * web.
 * 
 * @author strauss
 * 
 */
@XmlJavaTypeAdapter(AnyTypeAdapter.class)
@JcrNode(classNameProperty = "classname")
public interface RepoContent {
	/**
	 * Get the InputStream representing the artefact content. The user is
	 * reponsible for closing the Stream.
	 * 
	 * @return the content as Stream
	 */
	public InputStream getContent();

	/**
	 * Indicates of this content is read only or not.
	 * 
	 * @return flag if this is a read only content type.
	 */
	public boolean isWritable();
}

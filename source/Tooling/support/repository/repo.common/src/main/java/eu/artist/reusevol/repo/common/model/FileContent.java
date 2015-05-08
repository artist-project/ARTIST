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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.jcrom.AbstractJcrEntity;
import org.jcrom.JcrDataProvider;
import org.jcrom.JcrDataProviderImpl;
import org.jcrom.JcrFile;
import org.jcrom.annotations.JcrFileNode;

/**
 * Content type for artefacts that are stored in the database on the server.
 * 
 * @author strauss
 * 
 */
@XmlRootElement(name = "file-content")
@XmlAccessorType(XmlAccessType.NONE)
public class FileContent extends AbstractJcrEntity implements RepoContent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7653164919827696801L;

	@JcrFileNode
	private JcrFile content;

	/**
	 * 
	 */
	public FileContent() {
		content = new JcrFile();
		this.setFileName("unnamed");
	}

	public FileContent(JcrFile file) {
		content = file;
		this.setFileName(file.getName());
	}

	public static FileContent of(String name, String mimeType, InputStream in) {
		FileContent result = new FileContent();
		result.setFileName(name);
		result.setMimeType(mimeType);
		result.setContent(in);
		return result;
	}

	public static FileContent of(File file, String mimeType) {
		FileContent result = new FileContent();
		result.setFileName(file.getName());
		result.setMimeType(mimeType);
		try {
			result.setContent(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static FileContent of(JcrFile file) {
		return new FileContent(file);
	}

	@Override
	public InputStream getContent() {
		if (content.getDataProvider() == null)
			return null;
		return content.getDataProvider().getInputStream();
	}

	public void setContent(InputStream input) {
		this.content.setDataProvider(new JcrDataProviderImpl(input));
	}

	@Override
	public boolean isWritable() {
		return true;
	}

	/**
	 * @return
	 * @see org.jcrom.JcrFile#getName()
	 */
	@XmlAttribute
	public String getFileName() {
		return content.getName();
	}

	/**
	 * @param name
	 * @see org.jcrom.JcrFile#setName(java.lang.String)
	 */
	public void setFileName(String name) {
		setName(name);
		content.setName(name);
	}

	/**
	 * @return
	 * @see org.jcrom.JcrFile#getPath()
	 */
	public String getPath() {
		return content.getPath();
	}

	/**
	 * @param path
	 * @see org.jcrom.JcrFile#setPath(java.lang.String)
	 */
	public void setPath(String path) {
		content.setPath(path);
	}

	/**
	 * @return
	 * @see org.jcrom.JcrFile#getLastModified()
	 */
	@XmlElement
	public Calendar getLastModified() {
		return content.getLastModified();
	}

	/**
	 * @param lastModified
	 * @see org.jcrom.JcrFile#setLastModified(java.util.Calendar)
	 */
	public void setLastModified(Calendar lastModified) {
		content.setLastModified(lastModified);
	}

	/**
	 * @return
	 * @see org.jcrom.JcrFile#getMimeType()
	 */
	@XmlAttribute
	public String getMimeType() {
		return content.getMimeType();
	}

	/**
	 * @param mimeType
	 * @see org.jcrom.JcrFile#setMimeType(java.lang.String)
	 */
	public void setMimeType(String mimeType) {
		content.setMimeType(mimeType);
	}

	/**
	 * @return
	 * @see org.jcrom.JcrFile#getEncoding()
	 */
	@XmlAttribute
	public String getEncoding() {
		return content.getEncoding();
	}

	/**
	 * @param encoding
	 * @see org.jcrom.JcrFile#setEncoding(java.lang.String)
	 */
	public void setEncoding(String encoding) {
		content.setEncoding(encoding);
	}

	/**
	 * @return
	 * @see org.jcrom.JcrFile#getDataProvider()
	 */
	public JcrDataProvider getDataProvider() {
		return content.getDataProvider();
	}

	/**
	 * @param dataProvider
	 * @see org.jcrom.JcrFile#setDataProvider(org.jcrom.JcrDataProvider)
	 */
	public void setDataProvider(JcrDataProvider dataProvider) {
		content.setDataProvider(dataProvider);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileContent [getName()=").append(getName())
				.append(", getPath()=").append(getPath())
				.append(", getLastModified()=").append(getLastModified())
				.append(", getMimeType()=").append(getMimeType())
				.append(", getEncoding()=").append(getEncoding())
				.append(", getContentAsStream()=").append(getContent())
				.append(", isWritable()=").append(isWritable()).append("]");
		return builder.toString();
	}
}

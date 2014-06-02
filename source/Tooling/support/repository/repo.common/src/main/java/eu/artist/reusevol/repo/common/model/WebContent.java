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

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.jcrom.AbstractJcrEntity;
import org.jcrom.annotations.JcrProperty;

/**
 * Content type that represents an artefact stored on an external web site.
 * 
 * @author strauss
 * 
 */
@XmlRootElement(name = "web-content")
@XmlAccessorType(XmlAccessType.NONE)
public class WebContent extends AbstractJcrEntity implements RepoContent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6400211655471109133L;

	@JcrProperty
	private String url;

	/**
	 * 
	 */
	public WebContent() {
		this.url = null;
		this.setName("unnamed");
	}

	/**
	 * @param url
	 * @throws MalformedURLException
	 */
	public WebContent(String url) {
		setUrl(url);
	}

	public static WebContent of(String url) {
		return new WebContent(url);
	}

	@Override
	public InputStream getContent() {
		try {
			URLConnection con = new URL(url).openConnection();
			return con.getInputStream();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * The URL pointing to the actual location of the artefact content.
	 * 
	 * @return the url
	 */
	@XmlAttribute
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		try {
			URL address = new URL(url);
			setName(address.getHost());
		} catch (MalformedURLException e) {
			setName(url);
		}
		this.url = url;
	}

	@Override
	public boolean isWritable() {
		return false;
	}
}

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
package eu.artist.reusevol.repo.eclipse.client.preference;

import eu.artist.reusevol.repo.client.RepositoryClient;

public class RepositoryConfigurationEntry {

	private String name;
	private String url;
	private String username;
	private String password;
	private boolean savePassowrd;
	
	private String oAuth2ClientId;
	private String oAuth2ClientSecret;
	
	private RepositoryClient repositoryClient;

	public RepositoryConfigurationEntry(String name, String url,
			String username, String password) {
		this.name = name;
		this.url = url;
		this.username = username;
		this.password = password;
		this.oAuth2ClientId = null;
		this.oAuth2ClientSecret = null;
		this.repositoryClient = null;
	}

	public RepositoryConfigurationEntry(String name, String url, String username) {
		this(name, url, username, null);
	}

	public RepositoryConfigurationEntry(String name, String url) {
		this(name, url, null, null);
	}

	public boolean isEditable() {
		return true;
	}

	public String getId() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSavePassowrd() {
		return savePassowrd;
	}

	public void setSavePassowrd(boolean savePassowrd) {
		this.savePassowrd = savePassowrd;
	}

	public RepositoryClient getRepositoryClient() {
		return repositoryClient;
	}

	public void setRepositoryClient(RepositoryClient repositoryClient) {
		this.repositoryClient = repositoryClient;
	}

	public String getOAuth2ClientId() {
		return oAuth2ClientId;
	}

	public void setOAuth2ClientId(String oAuthClientId) {
		this.oAuth2ClientId = oAuthClientId;
	}

	public String getOAuth2ClientSecret() {
		return oAuth2ClientSecret;
	}

	public void setOAuth2ClientSecret(String oAuth2ClientSecret) {
		this.oAuth2ClientSecret = oAuth2ClientSecret;
	}

	@Override
	public String toString() {
		return "RepositoryConfigurationEntry [name=" + name + ", url=" + url
				+ ", username=" + username + ", savePassowrd=" + savePassowrd
				+ ", wso2ClientId=" + oAuth2ClientId + ", wso2ClientSecret="
				+ oAuth2ClientSecret + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + (savePassowrd ? 1231 : 1237);
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		result = prime * result
				+ ((oAuth2ClientId == null) ? 0 : oAuth2ClientId.hashCode());
		result = prime
				* result
				+ ((oAuth2ClientSecret == null) ? 0 : oAuth2ClientSecret.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RepositoryConfigurationEntry other = (RepositoryConfigurationEntry) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (savePassowrd != other.savePassowrd)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (oAuth2ClientId == null) {
			if (other.oAuth2ClientId != null)
				return false;
		} else if (!oAuth2ClientId.equals(other.oAuth2ClientId))
			return false;
		if (oAuth2ClientSecret == null) {
			if (other.oAuth2ClientSecret != null)
				return false;
		} else if (!oAuth2ClientSecret.equals(other.oAuth2ClientSecret))
			return false;
		return true;
	}

}

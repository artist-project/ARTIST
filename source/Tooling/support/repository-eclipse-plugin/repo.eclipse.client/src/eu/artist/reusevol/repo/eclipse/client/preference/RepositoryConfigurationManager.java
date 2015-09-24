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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import eu.artist.reusevol.repo.client.RepositoryClient;
import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig;
import eu.artist.reusevol.repo.eclipse.client.Activator;

public class RepositoryConfigurationManager {

	private static final String PREFERENCES_HOME_KEY = Activator.PLUGIN_ID
			+ ".connections";

	private static final String KEY_NAME = "name";
	private static final String KEY_URL = "url";
	private static final String KEY_USERNAME = "username";
	private static final String KEY_PASSWORD = "password";
	private static final String KEY_CLIENT_ID = "client-id";
	private static final String KEY_CLIENT_SECRET = "client-secret";
	private static final String KEY_SAVE_PASSWORD = "save-password";

	private final Map<String, RepositoryConfigurationEntry> configEntryMap;
	private IEclipsePreferences preferenceStore;
	private ISecurePreferences secureStore;

	public RepositoryConfigurationManager(File configFile) {
		configEntryMap = new LinkedHashMap<String, RepositoryConfigurationEntry>();
		preferenceStore = InstanceScope.INSTANCE.getNode(PREFERENCES_HOME_KEY);
		secureStore = SecurePreferencesFactory.getDefault();
	}

	public Collection<RepositoryConfigurationEntry> getRepositoryConfigurations() {
		return new ArrayList<RepositoryConfigurationEntry>(
				configEntryMap.values());
	}

	public void addRepositoryConfiguration(RepositoryConfigurationEntry entry) {
		if (entry != null) {
			RepositoryClient client = buildRepositoryClient(entry);
			entry.setRepositoryClient(client);
			configEntryMap.put(entry.getName(), entry);
		}
	}

	public void removeRepositoryConfiguration(String entryId) {
		configEntryMap.remove(entryId);
	}

	public RepositoryConfigurationEntry getRepositoryConfiguration(
			String entryId) {
		return configEntryMap.get(entryId);
	}

	public void readConfigurations() throws BackingStoreException, StorageException  {
		configEntryMap.clear();

		for (String nodeId : preferenceStore.childrenNames()) {
			Preferences node = preferenceStore.node(nodeId);
			String name = node.get(KEY_NAME, "");
			String url = node.get(KEY_URL, "");
			String username = node.get(KEY_USERNAME, "");
			boolean savePassword = node.getBoolean(KEY_SAVE_PASSWORD, true);
			String clientId = node.get(KEY_CLIENT_ID, "");
			String clientSecret = secureStore.get(getSecretKey(nodeId),	"");

			String key = getPasswordKey(nodeId);
			String password = secureStore.get(key, "");
			
			RepositoryConfigurationEntry entry = new RepositoryConfigurationEntry(name, url, username, password);
			entry.setSavePassowrd(savePassword);
			entry.setOAuth2ClientId(clientId);
			entry.setOAuth2ClientSecret(clientSecret);
			
			addRepositoryConfiguration(entry);
		}
	}

	public void saveConfigurations() throws BackingStoreException, StorageException, IOException {
		// Remove previous entries
		for (String nodeId : preferenceStore.childrenNames()) {
			preferenceStore.node(nodeId).removeNode();
		}

		for (RepositoryConfigurationEntry entry : configEntryMap.values()) {
			Preferences node = preferenceStore.node(entry.getName());
			node.put(KEY_NAME, entry.getName());
			node.put(KEY_URL, entry.getUrl());
			node.put(KEY_USERNAME, entry.getUsername());
			node.putBoolean(KEY_SAVE_PASSWORD, entry.isSavePassowrd());
			node.put(KEY_CLIENT_ID, entry.getOAuth2ClientId());
			secureStore.put(getSecretKey(entry.getName()), entry.getOAuth2ClientSecret(), true);

			if (entry.isSavePassowrd()) {
				secureStore.put(getPasswordKey(entry.getName()), entry.getPassword(), true);
			}
		}

		// forces the application to save the preferences
		preferenceStore.flush();
		secureStore.flush();
	}
	
	private RepositoryClient buildRepositoryClient(RepositoryConfigurationEntry entry) {
		RepositoryClientConfig configuration = new RepositoryClientConfig();
		configuration.setUsername(entry.getUsername());
		configuration.setPassword(entry.getPassword());
		configuration.setBaseRepositoryUri(entry.getUrl());

		configuration.getWso2Config().setOAuthClientId(entry.getOAuth2ClientId());
		configuration.getWso2Config().setOAuthClientSecret(entry.getOAuth2ClientSecret());

		configuration.setLogMessagesForDebugging(false);
		configuration.getWso2Config().setLogMessagesForDebugging(true);

		// Set this to dummy values (only needed for remote user management)
		configuration.getWso2Config().setAdminUsername("dummy");
		configuration.getWso2Config().setAdminPassword("dummy");
		
		return new RepositoryClient(configuration);
	}
	
	private String getPasswordKey(String name) {
		return PREFERENCES_HOME_KEY + "." + name + "." + KEY_PASSWORD;
	}

	private String getSecretKey(String name) {
		return PREFERENCES_HOME_KEY + "." + name + "." + KEY_CLIENT_SECRET;
	}
}

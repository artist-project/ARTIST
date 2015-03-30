package eu.artist.postmigration.nfrvt.lang.common.ui;

import org.eclipse.emf.common.util.URI;

import eu.artist.postmigration.nfrvt.lang.uml.ui.UMLPluginResourceStorage;

public class ARTISTCommonPluginResourceStorage extends UMLPluginResourceStorage {

	public ARTISTCommonPluginResourceStorage(URI uri) {
		super(uri);
	}
	
	@Override
	public String getName() {
		return uri.lastSegment();
	}
}

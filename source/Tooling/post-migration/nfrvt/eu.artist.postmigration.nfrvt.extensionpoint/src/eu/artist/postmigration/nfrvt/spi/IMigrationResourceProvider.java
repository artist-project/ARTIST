package eu.artist.postmigration.nfrvt.spi;

import java.util.List;

import org.eclipse.emf.common.util.URI;

public interface IMigrationResourceProvider {
	List<URI> getResourceURIs();
}

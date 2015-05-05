package eu.artist.postmigration.nfrvt.spi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

import org.eclipse.emf.common.util.URI;

public class MigrationResourceService {
	private static MigrationResourceService service;
	private ServiceLoader<IMigrationResourceProvider> loader;
	
	private MigrationResourceService() {
		loader = ServiceLoader.load(IMigrationResourceProvider.class);
	}
	
	public static synchronized MigrationResourceService getInstance() {
		if(service == null)
			service = new MigrationResourceService();
		return service;
	}
	
	public List<URI> getMigrationResourceURIs() {
		List<URI> uris = new ArrayList<>();
		try {
			Iterator<IMigrationResourceProvider> providers = loader.iterator();
			while(providers.hasNext()) 
				uris.addAll(providers.next().getResourceURIs());
		} catch(ServiceConfigurationError serviceError) {
			;
		}
		return uris;
	}
}

package eu.artist.postmigration.nfrvt.search.run;

import java.util.Map;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.IProcessFactory;
import org.eclipse.debug.core.model.IProcess;

public class MigrationExplorerProcessFactory implements IProcessFactory {

	@Override
	public IProcess newProcess(ILaunch launch, Process process, String label,
			@SuppressWarnings("rawtypes") Map attributes) {
		return new MigrationExplorerProcess(launch, process, label, attributes);
	}

}

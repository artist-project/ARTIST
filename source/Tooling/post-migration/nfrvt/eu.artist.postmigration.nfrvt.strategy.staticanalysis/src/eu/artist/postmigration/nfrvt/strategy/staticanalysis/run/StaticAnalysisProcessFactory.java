package eu.artist.postmigration.nfrvt.strategy.staticanalysis.run;

import java.util.Map;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.IProcessFactory;
import org.eclipse.debug.core.model.IProcess;

public class StaticAnalysisProcessFactory implements IProcessFactory {

	@Override
	public IProcess newProcess(ILaunch launch, Process process, String label,
			@SuppressWarnings("rawtypes") Map attributes) {
		return new StaticAnalysisProcess(launch, process, label, attributes);
	}

}

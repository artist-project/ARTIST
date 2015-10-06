package eu.artist.migration.modernization.uml2java.gwt.files;

import org.eclipse.core.runtime.Status;

import eu.artist.migration.modernization.uml2java.gwt.Activator;

public class ConsoleUtils {
	public void PrintWarning(String msg)
	{
		Activator plugin = Activator.getDefault();
		plugin.getLog().log(new Status(Status.WARNING, plugin.getBundle().getSymbolicName(), Status.OK, msg, null));
	}
}
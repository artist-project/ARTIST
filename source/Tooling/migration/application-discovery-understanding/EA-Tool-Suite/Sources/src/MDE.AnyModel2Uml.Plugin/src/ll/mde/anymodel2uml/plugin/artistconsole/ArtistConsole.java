package ll.mde.anymodel2uml.plugin.artistconsole;

import java.io.IOException;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ArtistConsole {

	private static IWorkbenchWindow window;
	//private static String messageToDisplay;
	private static MessageConsole console;
	

	public static void Initialize(IWorkbenchWindow window) {
		ArtistConsole.window = window;
	}

	public static void WriteToConsole(String message) {
		final String messageToDisplay = message;
		Display.getDefault().asyncExec(new Runnable() {
						
			
			@Override
			public void run() {
				MessageConsole myConsole = findConsole();
				MessageConsoleStream out = myConsole.newMessageStream();
				out.setColor(null);
				out.println(messageToDisplay);
				try {
					out.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	private static MessageConsole findConsole() {
		if (console != null)
			return console;

		String name = "Artist Output";
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				console = (MessageConsole) existing[i];

				return console;
			}
		}
		console = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { console });
		IWorkbenchPage page = window.getActivePage();

		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view;
		try {
			view = (IConsoleView) page.showView(id);
			view.display(console);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		console.activate();
		return console;
	}
}

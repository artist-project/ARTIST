package eu.artist.migration.cloudselection.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;

import eu.artist.migration.cloudselection.ui.views.CommonFeaturesView;
import eu.artist.migration.cloudselection.umlmodelservice.validation.CommonValidator;

public class ValidateCommonsHandler extends AbstractHandler {
	public ValidateCommonsHandler(){
	}
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IViewReference[] refs = window.getPages()[0].getViewReferences();
		IWorkbenchPart  part = null;
		String value = "a";
		for (int i=0; i<refs.length; i++){
			if (refs[i].getPartName().equals("General Features")){
				part = refs[i].getPart(false);
				if (part instanceof eu.artist.migration.cloudselection.ui.views.CommonFeaturesView){
					CommonFeaturesView curView = (CommonFeaturesView)part;
					
					value = CommonValidator.validate(curView.findCheckedRoot());
					IParameter iparam;
					
					//get the command from plugin.xml
					ICommandService cmdService = (ICommandService)window.getService(ICommandService.class);
					Command cmd = cmdService.getCommand("eu.artist.migration.cloudselection.commands.showresults");
 
					//get the parameter
					try {
						iparam = cmd.getParameter("eu.artist.migration.cloudselection.commandPartrueameter1");
					
						Parameterization params = new Parameterization(iparam, value);
 						Parameterization[] parameters = new Parameterization[1];
 						parameters[0] = params;
						//build the parameterized command
						ParameterizedCommand pc = new ParameterizedCommand(cmd, parameters);
 	
						//execute the command
						IHandlerService handlerService = (IHandlerService)window.getService(IHandlerService.class);
						handlerService.executeCommand(pc, null);
					} catch (NotDefinedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NotEnabledException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NotHandledException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				break;
			}
		}
		return null;
	}

}

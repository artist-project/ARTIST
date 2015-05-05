package org.eclipse.emf.henshin.editor.commands;

import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.util.HenshinModelCleaner;

/**
 * @author Christian Krause
 */
public class CleanUpCommand extends AbstractCommand {
	
	private List<?> elements;
	
	public void setElements(List<?> elements) {
		this.elements = elements;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return !elements.isEmpty();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		
		for (Object element : elements) {
			
			if (element instanceof Module) {
				HenshinModelCleaner.cleanModule((Module) element);
			}
			if (element instanceof Unit) {
				HenshinModelCleaner.cleanUnit((Unit) element);
			}
			if (element instanceof Rule) {
				HenshinModelCleaner.cleanRule((Rule) element);
			}
			if (element instanceof Graph) {
				HenshinModelCleaner.cleanGraph((Graph) element);
			}
			if (element instanceof Formula) {
				HenshinModelCleaner.cleanFormula((Formula) element);
			}
			if (element instanceof NestedCondition) {
				HenshinModelCleaner.cleanNestedCondition((NestedCondition) element);
			}
			
		}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
	}
	
}

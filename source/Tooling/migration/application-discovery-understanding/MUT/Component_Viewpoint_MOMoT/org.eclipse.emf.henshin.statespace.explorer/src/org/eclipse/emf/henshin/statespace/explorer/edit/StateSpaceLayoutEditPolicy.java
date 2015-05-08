/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.edit;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.explorer.commands.MoveStateCommand;
import org.eclipse.emf.henshin.statespace.explorer.jobs.LayoutStateSpaceJob;
import org.eclipse.emf.henshin.statespace.explorer.parts.StateSpaceExplorer;
import org.eclipse.emf.henshin.statespace.layout.StateSpaceSpringLayouter;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

/**
 * State space layout edit policy.
 * @author Christian Krause
 */
public class StateSpaceLayoutEditPolicy extends XYLayoutEditPolicy {
	
	// Cached state space layouter:
	private StateSpaceSpringLayouter layouter;
	
	/* 
	 * (non-Javadoc)
	 * @see ConstrainedLayoutEditPolicy#createChangeConstraintCommand(ChangeBoundsRequest, EditPart, Object)
	 */
	@Override
	protected Command createChangeConstraintCommand(ChangeBoundsRequest request, EditPart child, Object constraint) {
		
		// Create a move command:
		if (child instanceof StateEditPart && constraint instanceof Rectangle) {
			State state = ((StateEditPart) child).getState();
			Rectangle bounds = (Rectangle) constraint;
			MoveStateCommand command = new MoveStateCommand(state, request, bounds);
			command.setLayouter(getLayouter());
			return command;
		} else {
			return super.createChangeConstraintCommand(request, child, constraint);
		}
		
	}

	/* 
	 * (non-Javadoc)
	 * @see ConstrainedLayoutEditPolicy#createChangeConstraintCommand(EditPart, Object)
	 */
	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
		return null;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see LayoutEditPolicy#getCreateCommand(CreateRequest)
	 */
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createChildEditPolicy(org.eclipse.gef.EditPart)
	 */
	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) {
		
		if (child instanceof StateEditPart) {
			
			return new NonResizableEditPolicy() {
				
				@Override
				protected IFigure createDragSourceFeedbackFigure() {
					// Use a ghost ellipse for feedback:
					Ellipse ghost = new Ellipse();
					ghost.setAntialias(SWT.ON);				
					FigureUtilities.makeGhostShape(ghost);
					ghost.setLineStyle(Graphics.LINE_DOT);
					ghost.setForegroundColor(ColorConstants.white);
					ghost.setBounds(getInitialFeedbackBounds());
					addFeedback(ghost);
					return ghost;
				}

			};
		} else {
			return super.createChildEditPolicy(child);
		}
		
	}
	
	/*
	 * Get the currently used springlayouter.
	 */
	private StateSpaceSpringLayouter getLayouter() {
		if (layouter==null) {
			// Try to get the spring layouter:
			try {
				IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				LayoutStateSpaceJob job = ((StateSpaceExplorer) editor).getJobManager().getLayoutJob();
				layouter = job.getLayouter();
			} catch (Throwable t) {
				// Don't report exception.
			}
		}
		return layouter;
	}
}

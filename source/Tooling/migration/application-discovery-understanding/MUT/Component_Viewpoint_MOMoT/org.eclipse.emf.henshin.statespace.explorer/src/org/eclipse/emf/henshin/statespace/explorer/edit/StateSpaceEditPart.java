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

import java.util.List;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.StateSpacePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;
import org.eclipse.swt.SWT;

/**
 * State space diagram edit part.
 * @author Christian Krause
 */
public class StateSpaceEditPart extends AbstractGraphicalEditPart implements Adapter {
	
	// State space manager to be used:
	private StateSpaceManager manager;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#activate()
	 */
	@Override
	public void activate() {
		if (!isActive()) {
			super.activate();
			getStateSpace().eAdapters().add(this);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate()
	 */
	@Override
	public void deactivate() {
		if (isActive()) {
			getStateSpace().eAdapters().remove(this);
			super.deactivate();
		}
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new RootComponentEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,  new StateSpaceLayoutEditPolicy());
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		Figure layer = new FreeformLayer();
		layer.setBorder(new MarginBorder(3));
		layer.setLayoutManager(new FreeformLayout());
		ConnectionLayer connections = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);
		connections.setAntialias(SWT.ON);
		return layer;
	}
	
	public void refreshLabels() {
		boolean hideIndizes = getStateSpace().isLayoutHideIndizes();
		boolean hideLabels = getStateSpace().isLayoutHideLabels();
		for (Object child : getChildren()) {
			if (child instanceof StateEditPart) {
				((StateEditPart) child).refreshLabelAndLocation(hideIndizes, hideLabels);
			}
		}
	}
	
	/**
	 * Get the state space corresponding to this edit part.
	 * @return State space.
	 */
	public StateSpace getStateSpace() {
		return (StateSpace) getModel();
	}
	
	public StateSpaceManager getStateSpaceManager() {
		return manager;
	}
	
	public void setStateSpaceManager(StateSpaceManager manager) {
		this.manager = manager;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	@Override
	protected List<?> getModelChildren() {
		return getStateSpace().getStates();
	}
	
	/*
	 * A slightly more efficient way of removing a child.
	 */
	protected void removeChild(int index) {
		EditPart child = (EditPart) getChildren().get(index);
		fireRemovingChild(child, index);
		if (isActive()) child.deactivate();
		child.removeNotify();
		removeChildVisual(child);
		child.setParent(null);
		getChildren().remove(index);
	}
	
	/* -------------------- *
	 * --- Notification --- *
	 * -------------------- */
	
	private Notifier target;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#getTarget()
	 */
	public Notifier getTarget() {
		return target;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
	 */
	public boolean isAdapterForType(Object type) {
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification event) {
		switch (event.getFeatureID(StateSpace.class)) {
		case StateSpacePackage.STATE_SPACE__STATES:
			int type = event.getEventType();
			if (type==Notification.ADD) {
				EditPart editpart = createChild(event.getNewValue());
				addChild(editpart, event.getPosition());
			} else if (type==Notification.REMOVE) {
				EditPart editpart = (EditPart) getChildren().get(event.getPosition());
				removeChild(editpart);
			} else {
				refreshChildren();
			}
			break;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	public void setTarget(Notifier target) {
		this.target = target;
	}

}
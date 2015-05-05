/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.util;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.forms.widgets.FormText;

/**
 * Provides ToolTip support to TreeViewers whose LabelProvider implements
 * {@link IToolTipProvider}.
 * 
 * @author Gregor Bonifer
 * 
 */
public class HtmlTipSupport {
	
	// private String text;
	
	private TreeViewer viewer;
	
	private IToolTipProvider tipProvider;
	
	private boolean infoVisible = false;
	
	private TreeItem currentItem = null;
	
	Shell tipShell;
	
	// Browser browser;
	FormText formText;
	
	private boolean hideOnMouseExitEnabled = true;
	
	private boolean shellManagesHiding = false;
	
	private static Point shift = new Point(10, 0);
	
	protected HtmlTipSupport(TreeViewer viewer) {
		this.viewer = viewer;
		tipProvider = (IToolTipProvider) viewer.getLabelProvider();
		viewer.getControl().setToolTipText(""); //$NON-NLS-1$
		this.viewer.getTree().addMouseTrackListener(new MouseTrackAdapter() {
			public void mouseHover(MouseEvent e) {
				showInfo(e);
			}
		});
		
		this.viewer.getTree().addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent e) {
				if (!infoVisible || !hideOnMouseExitEnabled)
					return;
				if (getItem(e) == currentItem)
					return;
				Rectangle bounds = tipShell.getBounds();
				bounds.x -= 5;
				bounds.y -= 5;
				bounds.width += 10;
				bounds.height += 10;
				Point position = toDisplay(new Point(e.x, e.y));
				if (bounds.contains(position))
					return;
				//System.out.println("mouse move on tree");
				hideInfo();
			}
		});
		
		this.viewer.getTree().addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if (shellManagesHiding) {
					hideInfo();
				}
				
				// Shell fShell = e.display.getActiveShell();
				// if (fShell == tipShell) {
				// setHideOnMouseExit(false);
				// return;
				// }
				// hideInfo();
			}
		});
	}
	
	public static void enableFor(TreeViewer viewer) {
		if (!(viewer.getLabelProvider() instanceof IToolTipProvider))
			return;
		new HtmlTipSupport(viewer);
	}
	
	/**
	 * This method must be called after the viewer's {@link LabelProvider} is
	 * set.
	 * 
	 * @param viewer
	 */
	
	protected TreeItem getItem(MouseEvent e) {
		return viewer.getTree().getItem(new Point(e.x, e.y));
	}
	
	// protected TreeItem getToolTipArea(Event event) {
	// return viewer.getTree().getItem(new Point(event.x, event.y));
	// }
	
	// protected Composite createToolTipContentArea(Event event, Composite
	// parent) {
	// // return super.createToolTipContentArea(event, parent);
	//
	// Browser browser = new Browser(parent, SWT.NONE);
	// browser.setJavascriptEnabled(false);
	// browser.setText(getText(event));
	// // browser.setBackground(getBackgroundColor(event));
	// browser.setSize(200, SWT.DEFAULT);
	// return browser;
	// }
	
	// protected boolean shouldCreateToolTip(Event event) {
	// // if (!super.shouldCreateToolTip(event))
	// // return false;
	//
	// Object element = getToolTipArea(event).getData();
	//
	// Object tipText = tipProvider.getToolTip(element);
	// if (tipText == null)
	// return false;
	//
	// setText(tipText.toString());
	//
	// return true;
	// }
	
	// protected void afterHideToolTip(Event event) {
	// // super.afterHideToolTip(event);
	// if (event != null && event.widget != viewer.getControl()) {
	// viewer.getControl().setFocus();
	// }
	// }
	
	// protected String getText(Event event) {
	// return text;
	// }
	//
	// public void setText(String text) {
	// this.text = text;
	// }
	
	protected void showInfo(MouseEvent e) {
		Point position = new Point(e.x, e.y);
		TreeItem item = viewer.getTree().getItem(position);
		if (item == null)
			return;
		if (infoVisible && item == currentItem)
			return;
		if (infoVisible)
			hideInfo();
		createInfo(position, item);
	}
	
	protected void hideInfo() {
		if (tipShell != null && !tipShell.isDisposed()) {
			tipShell.setVisible(false);
			currentItem = null;
			infoVisible = false;
		}
	}
	
	protected void createInfo(Point position, TreeItem item) {
		String tipText = getTipText(item);
		if (tipText == null) {
			return;
		}
		
		currentItem = item;
		infoVisible = true;
		setHideOnMouseExit(true);
		shellManagesHiding = false;
		if (tipShell == null || tipShell.isDisposed())
			createNewTipShell();
		
		try {
			formText.setText("<form>" + tipText + "</form>", true, false);
		} catch (Exception e) {
			//System.out.println("An error occured in formtext: " + e);
			return;
		}
		tipShell.pack();
		tipShell.setLocation(addPoints(viewer.getTree().toDisplay(position), shift));
		tipShell.setVisible(true);
	}
	
	protected void createNewTipShell() {
		tipShell = new Shell(viewer.getTree().getShell(), SWT.ON_TOP | SWT.TOOL | SWT.RESIZE);
		tipShell.setLayout(new FillLayout());
		formText = new FormText(tipShell, SWT.NONE);
		
		formText.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		formText.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				hideInfo();
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				setHideOnMouseExit(false);
			}
		});
	}
	
	protected String getTipText(TreeItem item) {
		Object tip = tipProvider.getToolTip(item.getData());
		return tip == null ? null : tip.toString();
	}
	
	private Point addPoints(Point p, Point q) {
		return new Point(p.x + q.x, p.y + q.y);
	}
	
	private Point toDisplay(Point p) {
		return viewer.getTree().toDisplay(p);
	}
	
	protected void setHideOnMouseExit(boolean enabled) {
		//System.out.println("setHideOnMouseExit: " + enabled);
		hideOnMouseExitEnabled = enabled;
	}
}

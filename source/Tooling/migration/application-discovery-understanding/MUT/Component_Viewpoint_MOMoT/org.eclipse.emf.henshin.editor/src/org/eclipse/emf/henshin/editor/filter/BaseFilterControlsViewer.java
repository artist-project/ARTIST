/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.filter;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.henshin.presentation.HenshinEditorPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

/**
 * @author Gregor Bonifer
 * @author Stefan Jurack
 */
public abstract class BaseFilterControlsViewer {
	
	protected Collection<Image> images = new ArrayList<Image>();
	
	protected static abstract class ButtonState {
		
		protected String toolTip;
		
		protected Image image;
		
		public ButtonState(String tooltip, Image image) {
			this.toolTip = tooltip;
			this.image = image;
		}
		
		abstract void initState();
		
		final void setStateUI(ToolItem item) {
			item.setToolTipText(toolTip);
			item.setImage(image);
		}
		
	}
	
	public void buildControls(ToolBar tb) {
		addControls(tb);
		tb.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				// System.out.println("disposing");
				for (Image img : images)
					img.dispose();
			}
		});
	}
	
	protected abstract void addControls(ToolBar tb);
	
	protected Image getImage(String path) {
		URL imgUrl = (URL) HenshinEditorPlugin.INSTANCE.getImage(path);
		Image img = ImageDescriptor.createFromURL(imgUrl).createImage();
		images.add(img);
		return img;
	}
	
	protected String getString(String key) {
		return HenshinEditorPlugin.getPlugin().getString(key);
	}
	
	protected static class ButtonController extends SelectionAdapter {
		
		protected ToolItem item;
		
		protected boolean pressed = false;
		
		protected ButtonState inactive;
		protected ButtonState active;
		
		public ButtonController(ButtonState active, ButtonState inactive, boolean pressed) {
			this.active = active;
			this.inactive = inactive;
			this.pressed = pressed;
		}
		
		ButtonState getState() {
			return pressed ? active : inactive;
		}
		
		protected void setStateUI(ButtonState state) {
			state.setStateUI(item);
			state.initState();
		}
		
		public void widgetSelected(SelectionEvent e) {
			pressed = !pressed;
			getState().setStateUI(item);
			getState().initState();
		}
		
		void init(ToolBar tb) {
			item = new ToolItem(tb, SWT.CHECK);
			if (pressed) item.setSelection(pressed);
			getState().setStateUI(item);
			item.addSelectionListener(this);
		}
	}
	
	/**
	 * 
	 */
	public BaseFilterControlsViewer() {
		super();
	}
	
}
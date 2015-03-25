/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.parts;

import java.text.NumberFormat;
import java.util.Locale;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.henshin.statespace.util.StateSpaceXYPlot;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;

/**
 * A dialog for displaying plots.
 * @author Christian Krause
 */
public class StateSpaceXYPlotDialog extends Dialog implements ControlListener {
	
	// The plot to be displayed:
	private StateSpaceXYPlot plot;
	
	// The dots:
	private Dot[][] dots;

	// The lines between the dots:
	private Line[][] lines;
	
	// The legend:
	private Legend[] legend;
	
	// Bars:
	private Bar xBar,yBar;
	
	// The panel:
	private Panel panel;
	
	// Figure canvas:
	private FigureCanvas canvas;
	
	// Title:
	private String title;
	
	/**
	 * Default constructor.
	 * @param shell The shell.
	 * @param plot The plot.
	 */
	public StateSpaceXYPlotDialog(Shell shell, StateSpaceXYPlot plot, String title){
		super(shell);
		this.plot = plot;
		this.title = (title!=null) ? title : "Plot";
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
    protected void configureShell(Shell shell) {
		
        super.configureShell(shell);
        shell.setText(title);
        
        // Center the dialog on the screen:
    	Monitor primary = shell.getDisplay().getPrimaryMonitor ();
    	org.eclipse.swt.graphics.Rectangle b = primary.getBounds();
    	int w = b.width/2;
    	int h = b.height/2;
        shell.setBounds(w/2,h/2,w,h);
        
    }

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {

		// Create container composite:
		Composite main = (Composite) super.createDialogArea(parent);
		Composite composite = new Composite(main, SWT.BORDER);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new FillLayout());

		// Create the panel:
		panel = new Panel();
		panel.setLayoutManager(new XYLayout());

		// Draw the figures:
		drawFigures(panel);

		// Create the canvas:
		canvas = new FigureCanvas(composite);
		canvas.setScrollBarVisibility(FigureCanvas.NEVER);
		canvas.setBackground(ColorConstants.white);
		canvas.setContents(panel);
		canvas.addControlListener(this);

		return composite;

	}
	
	/*
	 * Draw all figures.
	 */
	private void drawFigures(IFigure parent) {
	    
		// Create the bars...
		int xSegs = Math.max(3,Math.min(plot.getXMaxSegments(),11));
		int ySegs = Math.max(3,Math.min(plot.getYMaxSegments(),11));		
		xBar = new Bar(parent, plot.getXName(), plot.getXMax(), xSegs, false);
		yBar = new Bar(parent, plot.getYName(), plot.getYMax(), ySegs, true);
		
		// Create the dots...
		dots = new Dot[plot.getSeriesCount()][];
		for (int i=0; i<dots.length; i++) {
			dots[i] = new Dot[plot.getSeriesLength(i)];
			for(int j=0; j<dots[i].length; j++) {
				String label = plot.getXName() + "=" + plot.getX(i,j) + "," +
								plot.getYName() + "=" + plot.getY(i, j);
				dots[i][j] = new Dot(parent,getPlotColor(i), label);
			}
		}
		
		// Create the lines...
		lines = new Line[dots.length][];
		for(int i=0; i<lines.length; i++){
			lines[i] = new Line[dots[i].length-1];
			for (int j=0; j<lines[i].length; j++) {
				Dot left = dots[i][j];
				Dot right = dots[i][j+1];
				lines[i][j] = new Line(parent,left,right,getPlotColor(i));
			}
		}
		
		// Create the legend:
		legend = new Legend[plot.getSeriesCount()];
		for (int i=0; i<legend.length; i++){
			String label = plot.getLegend(i);
			if (label!=null) {
				legend[i] = new Legend(parent,label,getPlotColor(i));
			}
		}
		
	}
	
	
	private void updatePositions() {
				
		// Offsets:
		int top = 35;
		int left = 50;
		int right = 40;
		int bottom = 40;
		
		// Get the new size:
		Viewport port = canvas.getViewport();
		int width = port.getHorizontalRangeModel().getExtent() - left - right;
		int height = port.getVerticalRangeModel().getExtent() - bottom - top;
		
		// Update the bar positions:
		yBar.setStart(	new Point(left, top+height)			);
		yBar.setEnd(	new Point(left, top)				);
		xBar.setStart(	new Point(left, top+height)			);
		xBar.setEnd(	new Point(left+width, top+height)	);		
		
		// Update node positions:
		for (int i=0; i<dots.length; i++){
			for(int j=0; j<dots[i].length; j++) {
				int x = plot.getXScaled(i,j,width) + left;
				int y = height - plot.getYScaled(i,j,height) + top;
				dots[i][j].setPosition(x,y);
			}
		}
		
		// Update the legend positions:
		for (int i=0; i<legend.length; i++) {
			if (legend[i]!=null) {
				Dimension size = legend[i].getMinimumSize();
				int more = (int) (Bar.ARROW*1.25);
				legend[i].setPosition(left+width+more-size.width, top-more+(i*size.height));
			}
		}
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		/*Button showButton = createButton(parent, 23, "Show Data", true);
		showButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showData();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		*/
		createButton(parent, IDialogConstants.OK_ID, "Close", true);
	}

	protected void showData() {
		
	}

	/*
	 * Get a color for a plot.
	 */
    private static Color getPlotColor(int index) {
        switch (index % 9){
	        case 0:  return ColorConstants.red;
	        case 1:  return ColorConstants.blue;
	        case 2:  return ColorConstants.green;
	        case 3:  return ColorConstants.cyan;
	        case 4:  return ColorConstants.darkBlue;
	        case 5:  return ColorConstants.darkGreen;
	        case 6:  return ColorConstants.yellow;
	        case 7:  return ColorConstants.darkGray;
	        case 8:  return ColorConstants.gray;
	        default: return ColorConstants.gray;
        }
    }
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.swt.events.ControlListener#controlResized(org.eclipse.swt.events.ControlEvent)
	 */
	@Override
	public void controlResized(ControlEvent e) {
		updatePositions();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.swt.events.ControlListener#controlMoved(org.eclipse.swt.events.ControlEvent)
	 */
	@Override
	public void controlMoved(ControlEvent e) {
		// Not relevant.
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#isResizable()
	 */
	@Override
	protected boolean isResizable() {
		return true;
	}
	
	
		
	/**
	 * Figure for the dots in plots.
	 */
	class Dot extends Ellipse {
		
		Dot(IFigure parent, Color color, String tooltip) {
			setSize(new Dimension(5,5));
			setForegroundColor(ColorConstants.gray);
			setBackgroundColor(color);
			setOpaque(true);
			parent.add(this);
			if (tooltip!=null) {
				setToolTip(new Label(tooltip));
			}
		}
		
		void setPosition(int x, int y) {
			getParent().setConstraint(this, new Rectangle(x-2,y-2,-1,-1));
		}
		
	}

	/**
	 * Figure for edges in plots.
	 */
	class Line extends PolylineConnection {
		
		Line(IFigure parent, Dot source, Dot target, Color color) {
		    setSourceAnchor(new CenterAnchor(source));
		    setTargetAnchor(new CenterAnchor(target));
		   	setAntialias(SWT.ON);
		    setForegroundColor(color);
			parent.add(this);
		}
		
	}

	class CenterAnchor extends ChopboxAnchor {

		CenterAnchor(IFigure owner) {
			super(owner);
		}
		
		@Override
		protected Rectangle getBox() {
			Rectangle bounds = getOwner().getBounds().getCopy();
			bounds.x = bounds.x + (bounds.width/2);
			bounds.y = bounds.y + (bounds.width/2);
			bounds.width = 0;
			bounds.height = 0;
			return bounds;
		}
	}

	/**
	 * Figure for the bars.
	 */
	class Bar extends Polyline {
		
		final static int WIDTH = 3;
		final static int ARROW = 20;
		
		String name;
		double maximum;
		int segments;
		boolean vertical;
		
		Bar(IFigure parent, String name, double maximum, int segments, boolean vertical) {
			this.name = name;
			this.vertical = vertical;
			this.maximum = maximum;
			this.segments = segments;
		   	setAntialias(SWT.ON);
		    setForegroundColor(ColorConstants.black);
			parent.add(this);
		}
		
		@Override
		public void setEnd(Point end) {
			if (vertical) {
				super.setEnd(end.getTranslated(0,-ARROW));
			} else {
				super.setEnd(end.getTranslated(ARROW,0));				
			}
		}
		
		@Override
		public Rectangle getBounds() {
			if (bounds == null) {
				if (vertical) {
					bounds = getPoints().getBounds().getExpanded(40+WIDTH,10);
				} else {
					bounds = getPoints().getBounds().getExpanded(10,WIDTH+40);
				}
			}
			return bounds;
		}
		
		@Override
		protected void outlineShape(Graphics g) {
			super.outlineShape(g);
			
			// Draw the markers and the labels:
			int length = (vertical ? getStart().y - getEnd().y : getEnd().x - getStart().x) - ARROW;
			for (int i=0; i<segments; i++) {
				int position = i * length / (segments-1);
				double value = i * maximum / (segments-1);
				
				// The marker:
				PointList marker = new PointList();
				if (vertical) {
					marker.addPoint(getStart().x - WIDTH, getStart().y - position);
					marker.addPoint(getStart().x + WIDTH, getStart().y - position);
				} else {
					marker.addPoint(getStart().x + position, getStart().y - WIDTH);
					marker.addPoint(getStart().x + position, getStart().y + WIDTH);
				}
				g.drawPolyline(marker);
				
				// Compute the label:
				NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);
				format.setMinimumFractionDigits(2);
				format.setMaximumFractionDigits(2);
				String text = format.format(value);
				if (text.indexOf('.')>=0 && text.length()>4) {
					text = text.substring(0,text.indexOf('.'));
				}
				
				// Draw the label:
				int h = g.getFontMetrics().getHeight();
				int w = text.length() * g.getFontMetrics().getAverageCharWidth();
				if (vertical) {
					g.drawString(text, getStart().x - w - h/4 - WIDTH, getStart().y - position - h/2);					
				} else {
					g.drawString(text, getStart().x + position - h/4, getStart().y + WIDTH + h/4);
				}
				
			}
			
			// Draw the arrow tip:
			PointList arrow = new PointList();
			if (vertical) {
				arrow.addPoint(getEnd().x-WIDTH, getEnd().y+WIDTH);
				arrow.addPoint(getEnd().x, getEnd().y);
				arrow.addPoint(getEnd().x+WIDTH, getEnd().y+WIDTH);
			} else {
				arrow.addPoint(getEnd().x-WIDTH, getEnd().y-WIDTH);
				arrow.addPoint(getEnd().x, getEnd().y);
				arrow.addPoint(getEnd().x-WIDTH, getEnd().y+WIDTH);				
			}
			g.drawPolyline(arrow);
			
			// Draw the name label:
			if (name!=null) {
				int h = g.getFontMetrics().getHeight();
				int w = name.length() * g.getFontMetrics().getAverageCharWidth();
				if (vertical) {
					g.drawString(name, getEnd().x - w - WIDTH - h/4, getEnd().y - h/4);
				} else {
					g.drawString(name, getEnd().x - w + h/4, getEnd().y + h + h/4 + WIDTH);					
				}
			}
			
		}

	}

	class Legend extends RectangleFigure {
		
		Dot dot1, dot2;
		Line line;
		Label label;
		
		Legend(IFigure parent, String name, Color color) {
			setLayoutManager(new XYLayout());
			add(dot1 = new Dot(this, color, null));
			add(dot2 = new Dot(this, color, null));
			add(line = new Line(this, dot1, dot2, color));
			add(label = new Label(name));
			setConstraint(dot1, new Rectangle(0,4,-1,-1));
			setConstraint(dot2, new Rectangle(10,4,-1,-1));
			setConstraint(label, new Rectangle(18,0,-1,-1));
			setOutline(false);
			parent.add(this);
		}

		void setPosition(int x, int y) {
			getParent().setConstraint(this, new Rectangle(x,y,-1,-1));
		}

	}
	
}

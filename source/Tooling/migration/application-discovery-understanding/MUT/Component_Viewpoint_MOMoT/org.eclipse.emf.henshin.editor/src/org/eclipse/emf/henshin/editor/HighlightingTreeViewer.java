/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.ParameterMapping;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.UnaryFormula;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;

/**
 * @author Gregor Bonifer
 * @author Stefan Jurack
 */
public class HighlightingTreeViewer extends TreeViewer {
	
	protected boolean colorAssociated = true;
	protected boolean expandAssociated = false;
	protected List<TreeItem> associated = new ArrayList<TreeItem>();
	protected Color defaultColor;
	protected Color defaultMarkColor;
	
	public HighlightingTreeViewer(Tree tree) {
		super(tree);
		defaultColor = getColor(SWT.COLOR_WHITE);
		defaultMarkColor = getColor(0xFF, 0xE0, 0xE0);
		
		addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				colorSelection(event.getSelection());
			}
		});
	}
	
	protected void colorSelection(ISelection sel) {
		clearAssociated();
		if (colorAssociated && sel instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) sel;
			Iterator<?> it = selection.iterator();
			while (it.hasNext())
				markAssociated(it.next());
		}
	}
	
	public void setColorAssociated(boolean colorAssociated) {
		this.colorAssociated = colorAssociated;
		colorSelection(getSelection());
	}
	
	public void setExpandAssociated(boolean expandAssociated) {
		this.expandAssociated = expandAssociated;
		colorSelection(getSelection());
	}
	
	protected void markAssociated(Object o) {
		if (o instanceof IWrapperItemProvider) {
			o = ((IWrapperItemProvider) o).getValue();			
		}
		
		if (o instanceof Mapping) {
			Mapping m = (Mapping) o;
			mark(m.getOrigin(), getBLUE());
			mark(m.getImage(), getYELLOW());
			
		} else if (o instanceof ParameterMapping) {
			ParameterMapping pm = (ParameterMapping) o;
			mark(pm.getSource(), getRED());
			mark(pm.getTarget(), getGREEN());
			
		} else if (o instanceof Edge) {
			Edge e = (Edge) o;
			mark(e.getSource(), getRED());
			mark(e.getTarget(), getGREEN());
			
		} else if (o instanceof Node) {
			Node n = (Node) o;
			for (Edge e : n.getIncoming())
				mark(e, getGREEN());
			for (Edge e : n.getOutgoing())
				mark(e, getRED());
			
			Graph graph = n.getGraph();
			
			if (graph.isLhs()) {
				Rule rule = n.getGraph().getRule();
				if (rule != null) {
					for (Mapping m : rule.getMappings()) {
						if (m.getOrigin() == n) {							
							mark(m, getYELLOW());
							if (m.getImage() != null) {
								mark(m.getImage(), getBLUE());
							}
						}
					}
				}
				colorNodeAssociatesInFormula(n, graph.getFormula());
				
			} else if (graph.isRhs()) {
				Rule rule = n.getGraph().getRule();
				if (rule != null) {
					for (Mapping m : rule.getMappings()) {
						if (m.getImage() == n) {
							mark(m, getYELLOW());
							if (m.getOrigin() != null) {
								mark(m.getOrigin(), getBLUE());
							}
						}
					}
				}
			} else if (graph.isNestedCondition()) {
				
			}
		}
		
	}
	
	protected void colorNodeAssociatesInFormula(Node node, Formula formula) {
		if (formula == null)
			return;
		if (formula instanceof UnaryFormula) {
			colorNodeAssociatesInFormula(node, ((UnaryFormula) formula).getChild());
			return;
		} else if (formula instanceof BinaryFormula) {
			colorNodeAssociatesInFormula(node, ((BinaryFormula) formula).getLeft());
			colorNodeAssociatesInFormula(node, ((BinaryFormula) formula).getRight());
			return;
		} else if (formula instanceof NestedCondition) {
			NestedCondition nc = (NestedCondition) formula;
			for (Mapping m : nc.getMappings()) {
				if (m.getOrigin() == node) {
					mark(m, getYELLOW());
					if (m.getImage() != null) {
						mark(m.getImage(), getBLUE());
						if (nc.getConclusion() != null)
							colorNodeAssociatesInFormula(m.getImage(), nc.getConclusion()
									.getFormula());
					}
					
				}
			}
			
		}
		
	}
	
	protected void mark(Object o) {
		mark(o, defaultMarkColor);
	}
	
	protected void mark(Object o, Color markColor) {
		if (o == null)
			return;
		
		Widget w = internalExpand(o, expandAssociated);
		
		if (w instanceof TreeItem) {
			TreeItem tItem = (TreeItem) w;
			if (expandAssociated)
				showItem(tItem);
			associated.add(tItem);
			tItem.setBackground(markColor);
		}
	}
	
	protected void clearAssociated() {
		for (TreeItem item : associated) {
			if (!item.isDisposed())
				item.setBackground(defaultColor);
		}
		associated.clear();
	}
	
	protected int SPEC_FULL = 0xFF;
	protected int SPEC_REDUCED = 0xE0;
	
	protected Color getRED() {
		return getColor(SPEC_FULL, SPEC_REDUCED, SPEC_REDUCED);
	}
	
	protected Color getGREEN() {
		return getColor(SPEC_REDUCED, SPEC_FULL, SPEC_REDUCED);
	}
	
	protected Color getBLUE() {
		return getColor(SPEC_REDUCED, SPEC_REDUCED, SPEC_FULL);
	}
	
	protected Color getYELLOW() {
		return getColor(SPEC_FULL, SPEC_FULL, 0xC0);
	}
	
	protected Color getColor(int r, int g, int b) {
		return new Color(getTree().getDisplay(), r, g, b);
	}
	
	protected Color getColor(int color) {
		return getTree().getDisplay().getSystemColor(color);
	}
	
}

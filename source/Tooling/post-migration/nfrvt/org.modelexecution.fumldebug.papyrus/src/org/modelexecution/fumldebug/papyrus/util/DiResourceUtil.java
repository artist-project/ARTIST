/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fumldebug.papyrus.util;

import java.util.Collection;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageList;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageRef;
import org.eclipse.papyrus.infra.core.sashwindows.di.SashWindowsMngr;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Utility functions for DI resources.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public class DiResourceUtil {

	public static boolean isDiResource(Resource resource) {
		return obtainSashWindowMngr(resource) != null;
	}

	public static SashWindowsMngr obtainSashWindowMngr(Resource diResource) {
		for (EObject object : diResource.getContents()) {
			if (object instanceof SashWindowsMngr)
				return (SashWindowsMngr) object;
		}
		return null;
	}

	public static NamedElement obtainFirstNamedElement(PageList pageList) {
		for (PageRef pageRef : pageList.getAvailablePage()) {
			EObject identifier = pageRef.getEmfPageIdentifier();
			if (identifier instanceof Diagram) {
				Diagram diagram = (Diagram) identifier;
				if (diagram.getElement() instanceof NamedElement) {
					return (NamedElement) diagram.getElement();
				}
			}
		}
		return null;
	}

	public static Collection<PageRef> getPageRefs(Resource diResource) {
		return obtainSashWindowMngr(diResource).getPageList()
				.getAvailablePage();
	}

	public static View getNotationElement(NamedElement namedElement,
			Resource diResource) {
		for (PageRef pageRef : getPageRefs(diResource)) {
			View notationElement = getNotationElement(namedElement, pageRef);
			if (notationElement != null)
				return notationElement;
		}
		return null;
	}

	public static View getNotationElement(NamedElement namedElement,
			PageRef pageRef) {
		EObject identifier = pageRef.getEmfPageIdentifier();
		if (identifier instanceof View) {
			return getNotationElement(namedElement, (View) identifier);
		}
		return null;
	}

	public static View getNotationElement(NamedElement namedElement, View view) {
		if (equals(namedElement, view.getElement())) {
			return view;
		} else {
			return findNotationInChildren(namedElement, view);
		}
	}

	private static View findNotationInChildren(NamedElement namedElement,
			View view) {
		TreeIterator<EObject> iterator = view.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof View) {
				View childView = (View) eObject;
				if (equals(namedElement, childView.getElement())) {
					return childView;
				}
			}
		}
		return null;
	}

	private static boolean equals(EObject eObject1, EObject eObject2) {
		return eObject1.equals(eObject2);
	}

	public static View getNotationElement(String qName, Resource diResource) {
		for (PageRef pageRef : getPageRefs(diResource)) {
			View notationElement = getNotationElement(qName, pageRef);
			if (notationElement != null)
				return notationElement;
		}
		return null;
	}

	public static View getNotationElement(String qName, PageRef pageRef) {
		EObject identifier = pageRef.getEmfPageIdentifier();
		if (identifier instanceof View) {
			return getNotationElement(qName, (View) identifier);
		}
		return null;
	}

	public static View getNotationElement(String qName, View view) {
		EObject element = view.getElement();
		if (element instanceof NamedElement) {
			NamedElement namedElement = (NamedElement) element;
			if (qName.equals(namedElement.getQualifiedName())) {
				return view;
			} else {
				return findNotationInChildren(qName, view);
			}
		}
		return null;
	}

	private static View findNotationInChildren(String qName, View view) {
		TreeIterator<EObject> iterator = view.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof View) {
				View childView = (View) eObject;
				EObject element = childView.getElement();
				if (element instanceof NamedElement) {
					NamedElement namedElement = (NamedElement) element;
					if (qName.equals(namedElement.getQualifiedName())) {
						return childView;
					}
				}
			}
		}
		return null;
	}

	public static PageRef getContainingPageRef(View view, Resource diResource) {
		Diagram diagram = view.getDiagram();
		for (PageRef pageRef : getPageRefs(diResource)) {
			if (diagram.equals(pageRef.getEmfPageIdentifier())) {
				return pageRef;
			}
		}
		return null;
	}

}

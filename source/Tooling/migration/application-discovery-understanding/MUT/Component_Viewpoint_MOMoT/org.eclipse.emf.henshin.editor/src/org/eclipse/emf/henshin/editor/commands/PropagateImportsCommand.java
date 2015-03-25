/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.commands;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Module;

/**
 * This command adds missing imports used by model elements that are pasted from
 * other models. Only for use in combination with
 * {@link PasteFromClipboardCommand}!
 * 
 * @author Gregor Bonifer(gbonifer)
 */
public class PropagateImportsCommand extends AbstractCommand implements Command {

	protected CommandParameter commandParameter;
	protected EditingDomain domain;
	protected Module module;
	protected Set<EPackage> missingPackages = new TreeSet<EPackage>(
			new Comparator<EPackage>() {
				public int compare(EPackage o1, EPackage o2) {
					return o1.getNsURI().compareTo(o2.getNsURI());
				}
			});
	protected Set<EPackage> requiredPackages = new TreeSet<EPackage>(
			new Comparator<EPackage>() {
				public int compare(EPackage o1, EPackage o2) {
					return o1.getNsURI().compareTo(o2.getNsURI());
				}
			});

	public PropagateImportsCommand(EditingDomain domain,
			CommandParameter commandParameter) {
		this.domain = domain;
		this.commandParameter = commandParameter;
	}

	@Override
	protected boolean prepare() {
		/*
		 * Determine required EPackages used by clipboard elements
		 */
		for (Object clipboardObject : domain.getClipboard()) {
			if (clipboardObject instanceof EObject) {
				checkElement((EObject) clipboardObject);
				for (TreeIterator<EObject> iter = ((EObject) clipboardObject)
						.eAllContents(); iter.hasNext();)
					checkElement(iter.next());
			}
		}

		/*
		 * Determine which of the required EPackages are missing.
		 */
		module = getTransformationSystem(commandParameter.getOwner());
		if (module != null) {
			reqLoop: for (EPackage reqPack : requiredPackages) {
				for (EPackage existingPack : module.getImports())
					if (reqPack.getNsURI().equals(existingPack.getNsURI()))
						continue reqLoop;

				missingPackages.add(reqPack);
			}
		}
		return true;
	}

	private Module getTransformationSystem(Object owner) {
		if (owner instanceof EObject) {
			EObject eo = (EObject) owner;
			while (!(eo instanceof Module)
					&& eo.eContainer() != null)
				eo = eo.eContainer();
			if (eo instanceof Module)
				return (Module) eo;
		}
		return null;
	}

	protected void checkElement(EObject containedEObject) {
		if (containedEObject instanceof Node) {
			EObject type = ((Node) containedEObject).getType();
			if (type != null)
				addRootIfPackage(type);
		} else if (containedEObject instanceof Edge) {
			EReference type = ((Edge) containedEObject).getType();
			if (type != null)
				addRootIfPackage(type);
		} else if (containedEObject instanceof Attribute) {
			EAttribute type = ((Attribute) containedEObject).getType();
			if (type != null)
				addRootIfPackage(type);
		}
	}

	protected void addRootIfPackage(EObject eo) {
		EObject pack = getRootObject(eo);
		if (pack instanceof EPackage)
			requiredPackages.add((EPackage) pack);
	}

	protected EObject getRootObject(EObject pack) {
		EObject p = pack;
		while (p.eContainer() != null)
			p = p.eContainer();
		return p;
	}

	@Override
	public void execute() {
		redo();
	}

	@Override
	public void redo() {
		if (module != null)
			for (EPackage pack : missingPackages)
				module.getImports().add(pack);
	}

	@Override
	public boolean canUndo() {
		return true;
	}

	@Override
	public void undo() {
		if (module != null)
			for (EPackage pack : missingPackages)
				module.getImports().remove(pack);
	}

}

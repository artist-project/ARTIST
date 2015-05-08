/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.commands.dnd;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;

/**
 * <p>
 * This DnD command deals with a case for which the generated EMF.Edit code
 * provides insufficient support, i.e. if you have more than one non-containment
 * references between two classes. Here, the generated editor does not know, in
 * which reference to place the dropped elements.
 * </p>
 * <p>
 * An obvious solution is to use non-model items in the model representing each
 * feature and provide a grouping at the same time. While the visualization
 * works fine, the default editing behavior does not. Default actions for a
 * given <code>owner</code> and <code>child</code> (or collection of children)
 * in most cases behave such that the outgoing {@link EReference} features of
 * <code>owner</code> are inspected for the <i>first occurrence</i> of a target
 * type ( {@link EReference#getEType()}) equal to the type of <code>child</code>
 * . As we do have more than one, this will mostly lead to a wrong automatic
 * choice.
 * </p>
 * <p>
 * To solve this problem, we combine the usage of
 * {@link DelegatingWrapperItemProvider} and <code>this</code> class. Within the
 * wrapper the feature is stored thus can be retrieved and being passed to this
 * DnD command.
 * </p>
 * 
 * @author Stefan Jurack (sjurack)
 * 
 */
public class DelegatingWrapperFeatureDragAndDropCommand extends AbstractCommand implements
		DragAndDropFeedback {
	
	protected EditingDomain domain;
	protected Object owner;
	protected float location;
	protected Command dragCommand;
	protected Command dropCommand;
	protected Collection<?> collection;
	protected int feedback;
	
	/**
	 * @param domain
	 * @param owner
	 * @param feature
	 * @param collection
	 */
	public DelegatingWrapperFeatureDragAndDropCommand(EditingDomain domain, Object owner,
			float location, Collection<?> collection) {
		this.domain = domain;
		this.owner = owner;
		this.location = location;
		this.collection = collection;
		this.dragCommand = UnexecutableCommand.INSTANCE;
		this.dropCommand = UnexecutableCommand.INSTANCE;
	}// constructor
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		
		dragCommand = IdentityCommand.INSTANCE;
		dropCommand = UnexecutableCommand.INSTANCE;
		
		if (checkValidInstanceVariables() && checkNoSelfInsertion()) {
			
			IWrapperItemProvider wrapper = (IWrapperItemProvider) this.owner;
			
			EReference feature_ = (EReference) wrapper.getFeature();
			EObject owner_ = (EObject) wrapper.getOwner();
			// EObject value_ = (EObject) wrapper.getValue();
			int index = wrapper.getIndex();
			
			// calculate the visual feedback and concurrently the index new
			// element shall be moved to
			int targetIndex = index;
			if (location < 0.5) {
				feedback = FEEDBACK_INSERT_BEFORE;
			} else {
				feedback = FEEDBACK_INSERT_AFTER;
				targetIndex++;
			}// if else
			
			CompoundCommand dragCompoundCommand = new CompoundCommand();
			CompoundCommand dropCompoundCommand = new CompoundCommand();
			
			/*
			 * Iterate through all elements in the collection a create all
			 * appropriate commands.
			 */
			for (Object o : collection) {
				if (o instanceof IWrapperItemProvider) {
					IWrapperItemProvider w = (IWrapperItemProvider) o;
					/*
					 * If o is a wrapped element, let's look if it is referred
					 * to by the same owner and the targeted feature already.
					 * Then we have to perform a "move". Otherwise we have to
					 * delete the old reference as DragCommand and perform the
					 * Add as DropCommand.
					 */
					if (w.getOwner().equals(owner_) && w.getFeature().equals(feature_)) {
						// Dragee is already referred to.
						
						/*
						 * If the targeted feature is a list, we have to adjust
						 * the index to move the dragee to depending on whether
						 * the moved element is before or after the targeted
						 * index. TODO: This algorithm may be improved
						 */
						if (feature_.isMany()) {
							// fetch the current index of the dragee...
							int drageeIndex = ((List<?>) owner_.eGet(feature_)).indexOf(w
									.getValue());
							// ..and adjust it if it is located before the
							// target index
							drageeIndex = (drageeIndex < index) ? targetIndex - 1 : targetIndex;
							dropCompoundCommand.append(MoveCommand.create(domain, owner_,
									w.getFeature(), w.getValue(), drageeIndex));
						} else {
							// ..otherwise the target index does not matter
							dropCompoundCommand.append(MoveCommand.create(domain, owner_,
									w.getFeature(), w.getValue(), 0));
						}// if else
						
					} else {
						dragCompoundCommand.append(RemoveCommand.create(domain, w.getOwner(),
								w.getFeature(), w.getValue()));
						dropCompoundCommand.append(AddCommand.create(domain, owner_, feature_,
								w.getValue(), targetIndex));
					}// if else
				} else {
					/*
					 * If o is not wrapped, o is no "referred" element since
					 * they are all wrapped. So we can create the Add command
					 * instantly.
					 */
					dropCompoundCommand.append(AddCommand.create(domain, owner_, feature_, o,
							targetIndex));
					
				}// if else
			}// for
			
			// drag command might be empty, so we set the identity if necessary
			dragCommand = (dragCompoundCommand.isEmpty()) ? IdentityCommand.INSTANCE
					: dragCompoundCommand;
			// drop command shall be non-empty
			dropCommand = dropCompoundCommand;
		}// if
		
		return dragCommand.canExecute() && dropCommand.canExecute();
	}// prepare
	
	/**
	 * Checks that all variables are set appropriately, e.g. not null and of a
	 * specific type.
	 * 
	 * @return
	 */
	private boolean checkValidInstanceVariables() {
		// check for not being null and appropriate types
		boolean result = ((domain != null) //
				&& (owner != null) && (owner instanceof IWrapperItemProvider) //
				&& (collection != null) && (!collection.isEmpty()));
		return result;
	}// validInstanceVariables
	
	/**
	 * Checks if an object is to be inserted after/before itself, i.e. checks <br>
	 * a) if one of the items to be inserted (<code>collection</code>) is the
	 * owner of this DnD command itself.
	 * 
	 * @return true, if this is not the case, otherwise false
	 */
	private boolean checkNoSelfInsertion() {
		boolean result = true;
		
		Iterator<?> it = collection.iterator();
		while (result && it.hasNext()) {
			result = !(it.next().equals(this.owner));
		}// while
			// location checks shall prevent unintended drag'n'drops
		result = result && (location > 0.7 || location < 0.3);
		
		return result;
	}// checkNoSelfInsertion
	
	protected int calculateIndex() {
		// Iterate over the children to find the owner.
		//
		// Collection<?> children = getChildren((EObject) parent);
		// int i = 0;
		// for (Object child : children) {
		// // When we match the owner, we're done.
		// //
		// if (child == owner) {
		// break;
		// }
		// ++i;
		// }
		//
		// // If the location indicates after, add one more.
		// //
		// if (location >= 0.5) {
		// ++i;
		// }
		return 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		dragCommand.execute();
		dropCommand.execute();
	}// execute
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#undo()
	 */
	@Override
	public void undo() {
		dropCommand.undo();
		dragCommand.undo();
	}// undo
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		execute();
	}// redo
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#getResult()
	 */
	@Override
	public Collection<?> getResult() {
		return dropCommand != null ? dropCommand.getResult() : super.getResult();
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.edit.command.DragAndDropFeedback#validate(java.lang.Object
	 * , float, int, int, java.util.Collection)
	 */
	@Override
	public boolean validate(Object owner, float location, int operations, int operation,
			Collection<?> collection) {
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.DragAndDropFeedback#getFeedback()
	 */
	@Override
	public int getFeedback() {
		// Only return the feedback for an executable command.
		return isExecutable ? feedback : FEEDBACK_NONE;
	}// getFeedback
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.DragAndDropFeedback#getOperation()
	 */
	@Override
	public int getOperation() {
		// Only return the operation for an executable command.
		//
		return isExecutable ? DROP_LINK : DROP_NONE;
	}// getOperation
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#getAffectedObjects()
	 */
	@Override
	public Collection<?> getAffectedObjects() {
		return dropCommand != null ? dropCommand.getAffectedObjects() : super.getAffectedObjects();
	}// getAffectedObjects
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#dispose()
	 */
	@Override
	public void dispose() {
		if (dragCommand != null) {
			dragCommand.dispose();
		}// if
		if (dropCommand != null) {
			dropCommand.dispose();
		}// if
	}// dispose
	
}// class

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.RegisteredPackageDialog;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.presentation.HenshinEditorPlugin;
import org.eclipse.emf.henshin.presentation.HenshinIcons;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.IWorkbenchAdapter;

/**
 * @generated NOT
 * @author Christian Krause
 */
public class EcoreSelectionDialogUtil {
	
	/**
	 * Open a dialog for loading a package from an Ecore file.
	 * 
	 * @param shell
	 *            Shell to be used.
	 * @param resourceSet
	 *            Resource set.
	 * @return The loaded package or <code>null</code>.
	 */
	public static EPackage selectEcoreFilePackage(Shell shell, ResourceSet resourceSet) {
		
		// Create the dialog:
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell,
				new EcoreLabelProvider(), new EcoreContentProvider(resourceSet));
		dialog.setTitle("Select EPackage");
		dialog.setMessage("Please select the EPackage to import:");
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.addFilter(new EPackageViewFilter());
		dialog.setValidator(new EcoreSelectionValidator());
		dialog.setAllowMultiple(false);
		dialog.open();
		
		final Object[] result = dialog.getResult();
		if (result != null && result.length > 0) {
			if (result[0] instanceof EPackage) {
				return (EPackage) result[0];
			}
		}
		return null;
		
	}
	
	/**
	 * Open a dialog that lets the user choose a registered package.
	 * 
	 * @param shell
	 *            Shell to be used.
	 * @param resourceSet
	 *            Resource set.
	 * @return The selected package.
	 */
	@SuppressWarnings("deprecation")
	public static EPackage selectRegisteredPackage(Shell shell, ResourceSet resourceSet) {
		
		CustomRegisteredPackageDialog dialog = new CustomRegisteredPackageDialog(shell);
		dialog.setMultipleSelection(false);
		dialog.open();
		EPackage epackage = null;
		
		Object[] result = dialog.getResult();
		if (result != null) {
			List<?> nsURIs = Arrays.asList(result);
			if (dialog.isDevelopmentTimeVersion()) {
				resourceSet.getURIConverter().getURIMap()
						.putAll(EcorePlugin.computePlatformURIMap());
				Map<String, URI> locationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
				if (result.length > 0) {
					URI location = locationMap.get(result[0]);
					Resource resource = resourceSet.getResource(location, true);
					EcoreUtil.resolveAll(resource);
				}
				for (Resource resource : resourceSet.getResources()) {
					for (EPackage current : EcoreSelectionDialogUtil.getAllPackages(resource)) {
						if (nsURIs.contains(current.getNsURI())) {
							epackage = current;
							break;
						}
					}
				}
			} else {
				if (result.length > 0) {
					String uri = result[0].toString();
					return EPackage.Registry.INSTANCE.getEPackage(uri);
				}
			}
		}
		
		return epackage;
		
	}

	protected static class CustomRegisteredPackageDialog extends RegisteredPackageDialog {

		public CustomRegisteredPackageDialog(Shell shell) {
			super(shell);
			setMessage("Select the package to import. In most cases you need the runtime version.");
			super.isDevelopmentTimeVersion = false; // we want the runtime version
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			Control result = super.createDialogArea(parent);
			updateButtons(result);
			return result;
		}
		
		private void updateButtons(Control control) {
			if (control instanceof Button) {
				Button button = (Button) control;
				// button.setEnabled(false);
				String text = button.getText().toLowerCase();
				if (text.indexOf("runtime")>=0) {
					button.setSelection(true);
				} else {
					button.setSelection(false);
				}
			}
			if (control instanceof Composite) {
				for (Control child : ((Composite) control).getChildren()) {
					updateButtons(child);
				}
			}
		}

	}

	
	/*
	 * Find all packages in a resource.
	 */
	protected static Collection<EPackage> getAllPackages(Resource resource) {
		
		// List of all packages:
		List<EPackage> result = new ArrayList<EPackage>();
		
		// Create a tree editor for packages:
		TreeIterator<?> iterator = new EcoreUtil.ContentTreeIterator<Object>(resource.getContents()) {
			private static final long serialVersionUID = 1L;
			
			@Override
			protected Iterator<? extends EObject> getEObjectChildren(EObject eObject) {
				if (eObject instanceof EPackage) {
					return ((EPackage) eObject).getESubpackages().iterator();
				} else {
					return Collections.<EObject> emptyList().iterator();
				}
			}
		};
		
		// Collect all packages:
		while (iterator.hasNext()) {
			Object current = iterator.next();
			if (current instanceof EPackage) {
				result.add((EPackage) current);
			}
		}
		return result;
		
	}
	
	/*
	 * A view filter for Ecore packages.
	 */
	static class EPackageViewFilter extends ViewerFilter {
		
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof IAdaptable) {
				IAdaptable adapter = (IAdaptable) element;
				Object adaptedResource = adapter.getAdapter(IResource.class);
				if (adaptedResource != null) {
					IResource res = (IResource) adaptedResource;
					if ("ecore".equals(res.getFileExtension()) || IResource.FILE != res.getType()) {
						return true;
					}
				}
			}
			return (element instanceof EPackage);
		}
		
	}
	
	/*
	 * Internal label provider class.
	 */
	static class EcoreLabelProvider extends LabelProvider implements ILabelProvider {
		
		/*
		 * (non-Javadoc)
		 * @see
		 * org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
		 */
		@Override
		public Image getImage(Object element) {
			if (element instanceof IAdaptable) {
				final IAdaptable adaptable = (IAdaptable) element;
				final Object adapter = adaptable.getAdapter(IWorkbenchAdapter.class);
				if (adapter != null) {
					final IWorkbenchAdapter res = (IWorkbenchAdapter) adapter;
					return res.getImageDescriptor(element).createImage();
				}
			}
			if (element instanceof EPackage) {
				return HenshinIcons.EPACKAGE;
			}
			return null;
		}
		
		/*
		 * (non-Javadoc)
		 * @see
		 * org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
		 */
		@Override
		public String getText(Object element) {
			if (element instanceof IAdaptable) {
				final IAdaptable adaptable = (IAdaptable) element;
				final Object adapter = adaptable.getAdapter(IWorkbenchAdapter.class);
				if (adapter != null) {
					final IWorkbenchAdapter res = (IWorkbenchAdapter) adapter;
					return res.getLabel(element);
				}
			}
			if (element instanceof ENamedElement) {
				final ENamedElement namedElem = (ENamedElement) element;
				return namedElem.getName();
			}
			return element.toString();
		}
		
	}
	
	/*
	 * Ecore content provider.
	 */
	static class EcoreContentProvider extends BaseWorkbenchContentProvider {
		
		// Resource set:
		private ResourceSet resourceSet;
		
		/*
		 * Default constructor.
		 */
		public EcoreContentProvider(ResourceSet resourceSet) {
			this.resourceSet = resourceSet;
		}
		
		/*
		 * (non-Javadoc)
		 * @see
		 * org.eclipse.ui.model.BaseWorkbenchContentProvider#getChildren(java
		 * .lang.Object)
		 */
		@Override
		public Object[] getChildren(Object element) {
			if (element instanceof IAdaptable) {
				final IAdaptable adapter = (IAdaptable) element;
				final Object adaptedResource = adapter.getAdapter(IResource.class);
				if (adaptedResource != null) {
					final IResource res = (IResource) adaptedResource;
					if ("ecore".equals(res.getFileExtension())) {
						return resourceSet
								.getResource(
										URI.createPlatformResourceURI(res.getFullPath().toString(),
												true), true).getContents().toArray();
					}
				}
			}
			if (element instanceof EObject) {
				final EObject eObject = (EObject) element;
				return eObject.eContents().toArray();
			}
			return super.getChildren(element);
		}
	}
	
	/*
	 * Ecore selection validator.
	 */
	static class EcoreSelectionValidator implements ISelectionStatusValidator {
		
		/*
		 * (non-Javadoc)
		 * @see
		 * org.eclipse.ui.dialogs.ISelectionStatusValidator#validate(java.lang
		 * .Object[])
		 */
		public IStatus validate(Object[] selection) {
			if (selection.length > 0) {
				final Object obj = selection[0];
				if (obj instanceof EPackage) {
					return new Status(IStatus.OK, HenshinEditorPlugin.ID, "EPackage selected");
				}
			}
			return new Status(IStatus.ERROR, HenshinEditorPlugin.ID, "No valid EPackage selected");
		}
	};
	
}

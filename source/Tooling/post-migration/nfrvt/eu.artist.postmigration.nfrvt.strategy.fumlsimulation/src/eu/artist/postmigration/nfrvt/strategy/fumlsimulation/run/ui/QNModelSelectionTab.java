/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package eu.artist.postmigration.nfrvt.strategy.fumlsimulation.run.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.modelexecution.fuml.nfr.MarteUtil;

import eu.artist.postmigration.nfrvt.strategy.fumlsimulation.FUMLSimulationActivator;

public class QNModelSelectionTab extends UMLModelSelectionTab {

	/* (non-Javadoc)
	 * @see org.modelexecution.fuml.nfr.debug.ui.launch.UMLModelSelectionTab#obtainSelectableModelElements(org.eclipse.emf.ecore.resource.Resource)
	 */
	@Override
	protected List<EObject> obtainSelectableModelElements(Resource umlResource) {
		List<EObject> analysisContextInstances = new ArrayList<EObject>();
		TreeIterator<EObject> allContents = umlResource.getAllContents();
		while(allContents.hasNext()) {
			EObject eObject = allContents.next();
			if(eObject instanceof Element) {
				Element element = (Element)eObject;
				if(isAnalysisContext(element)) {
					analysisContextInstances.add(eObject);
				}
			}
		}
		return analysisContextInstances;
	}
	
	private boolean isAnalysisContext(Element element) {
		return MarteUtil.getExactStereotype(element, GaAnalysisContext.class) != null;
	}

	/* (non-Javadoc)
	 * @see org.modelexecution.fuml.nfr.debug.ui.launch.UMLModelSelectionTab#loadModelElementFromSelection(org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	protected EObject loadModelElementFromSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			structuredSelection.size();
			for (Iterator<?> iter = structuredSelection.iterator(); iter
					.hasNext();) {
				Object next = iter.next();
				if (next instanceof Element) {						
					Element element = (Element) next;
					if(isAnalysisContext(element)) {
						return element;
					}
				}
			}
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.modelexecution.fuml.nfr.debug.ui.launch.UMLModelSelectionTab#initializeSelectedModelElement(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	protected NamedElement initializeSelectedModelElement(
			ILaunchConfiguration configuration) {
		String analysisContextQN = "";
		try {
			analysisContextQN = configuration.getAttribute(
					FUMLSimulationActivator.ATT_QN_ANALYIS_CONTEXT, "");
		} catch (CoreException e) {
		}
		
		for (EObject eObject : getSelectableModelElements()) {
			if (eObject instanceof NamedElement) {
				NamedElement element = (NamedElement) eObject;
				if(isAnalysisContext(element) && element.getQualifiedName().equals(analysisContextQN)) {
					return element;
				}
				
			}
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DebugPlugin.ATTR_PROCESS_FACTORY_ID,
				FUMLSimulationActivator.PROCESS_FACTORY_ID);
		configuration.setAttribute(FUMLSimulationActivator.ATT_MODEL_PATH, uriText
				.getText().trim());
		configuration.setAttribute(FUMLSimulationActivator.ATT_QN_ANALYIS_CONTEXT,
				getAnalysisContextString());		
	}

	private String getAnalysisContextString() {
		EObject selectedModelElement = getSelectedModelElement();
		if (selectedModelElement instanceof NamedElement) {
			return ((NamedElement) selectedModelElement).getQualifiedName();
		}
		return "";
	}

	@Override
	protected String getModelElementLabelText() {
		return "Select analysis context with resources and workload";
	}
	
}

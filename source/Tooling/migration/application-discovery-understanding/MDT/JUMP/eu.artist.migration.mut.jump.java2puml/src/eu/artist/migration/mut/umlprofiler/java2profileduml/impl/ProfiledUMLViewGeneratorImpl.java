/*******************************************************************************
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mut.umlprofiler.java2profileduml.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import eu.artist.migration.mdt.umlprofilediscovery.codemodel2umlprofile.files.CodeModel2UMLProfileWithResourceInjection;
import eu.artist.migration.mut.umlprofiler.codemodel2umlclassesdiagram.files.CodeModel2UMLClassesDiagramWithResourceInjection;
import eu.artist.migration.mut.umlprofiler.java2profileduml.ProfiledUMLViewGenerator;
import eu.artist.migration.mut.umlprofiler.uml2profileduml.UMLProfiler;

/**
 * @author Alexander Bergmayr
 * 
 */
public class ProfiledUMLViewGeneratorImpl implements ProfiledUMLViewGenerator {

	/**
	 * 
	 */
	private static boolean IS_INTIALIZED = false;

	/** default input for the UML profile discovery transformation */
	public final String jpModelPath = "pathmap://JAVA_PROFILE/javaProfile.uml";
	public final String jptModelPath = "pathmap://UML_LIBRARIES/JavaPrimitiveTypes.library.uml";
	public final String ejtModelPath = "pathmap://JAVA_LIBRARY/ExtendedJavaTypes.library.uml";
	public final String mcModelPath = "pathmap://UML_METAMODELS/UML.metamodel.uml";
	public final String uptModelPath = "pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml";
	public final String eptModelPath = "pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml";

	/**
	 * 
	 */
	private ProfiledUMLViewGeneratorImpl() {
	}

	/**
	 * 
	 * @return the {@link JavaDiscoverer}
	 */
	public static ProfiledUMLViewGenerator init() {
		if (!IS_INTIALIZED) {
			IS_INTIALIZED = true;
			return new ProfiledUMLViewGeneratorImpl();
		}
		return ProfiledUMLViewGenerator.INSTANCE;
	}

	@Override
	public void generateProfiledUMLView(Resource codeModel, String projectName,
			String path) {
		String umlProfilePath = projectName.concat("_profile.profile.uml");
		String umlProfileTraceModelPath = projectName
				.concat("_profile_trace.xmi");

		String umlCdPath = projectName.concat("_class_diagram.uml");
		String umlCdTraceModelPath = projectName
				.concat("_class_diagram_trace.xmi");

		Collection<Resource> umlProfiles = new ArrayList<Resource>();

		// create a UML Profile if the Java application contains
		// non-proxy AnnotationTypeDeclarations
		CodeModel2UMLProfileWithResourceInjection umlProfileRunner = null;
		if (nonProxyAnnotationTypeDeclarationsCovered(codeModel)) {
			// run the profile discovery
			try {
				umlProfileRunner = new CodeModel2UMLProfileWithResourceInjection();
				umlProfileRunner.setUmlProfilePath(umlProfilePath);
				umlProfileRunner.setTraceModelPath(umlProfileTraceModelPath);
				umlProfileRunner.loadModels(codeModel, jpModelPath,
						jptModelPath, mcModelPath, uptModelPath, eptModelPath);
				umlProfileRunner
						.doCodeModel2UMLProfile(new NullProgressMonitor());
				umlProfileRunner.saveUMLProfileModel();

				umlProfiles.add(((EMFModel) umlProfileRunner.getUpModel())
						.getResource());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ATLCoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			UMLProfiler.INSTANCE.runProfileApplication(codeModel,
					((EMFModel) umlProfileRunner.getTmModel()).getResource(),
					((EMFModel) umlProfileRunner.getUpModel()).getResource(),
					umlProfiles);
		}

		// create the UML Class Diagram from the Java application
		CodeModel2UMLClassesDiagramWithResourceInjection umlCdrunner = null;
		try {
			umlCdrunner = new CodeModel2UMLClassesDiagramWithResourceInjection();
			umlCdrunner.loadModels(codeModel, jpModelPath, jptModelPath,
					ejtModelPath, mcModelPath, uptModelPath);
			umlCdrunner.setUmlCdPath(umlCdPath);
			umlCdrunner.setTraceModelPath(umlCdTraceModelPath);
			umlCdrunner
					.doCodeModel2UMLClassesDiagram(new NullProgressMonitor());
			umlCdrunner.saveUMLModel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// apply UML Profiles as required
		UMLProfiler.INSTANCE.runProfileApplication(codeModel,
				((EMFModel) umlCdrunner.getTmModel()).getResource(),
				((EMFModel) umlCdrunner.getUcdModel()).getResource(),
				umlProfiles);

		try {
			File location = new File(path);

			// store the generated profile if required
			if (umlProfileRunner != null) {
				((EMFModel) umlProfileRunner.getUpModel()).getResource()
						.setURI(URI.createPlatformResourceURI(
								location.getAbsolutePath(), true)
								.appendSegment(umlProfilePath));
				((EMFModel) umlProfileRunner.getUpModel()).getResource().save(
						null);
			}

			// store the generated profiled class diagram
			((EMFModel) umlCdrunner.getUcdModel()).getResource().setURI(
					URI.createPlatformResourceURI(location.getAbsolutePath(),
							true).appendSegment(umlCdPath));
			((EMFModel) umlCdrunner.getUcdModel()).getResource().save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean nonProxyAnnotationTypeDeclarationsCovered(Resource codeModel) {
		TreeIterator<EObject> contentsIter = codeModel.getAllContents();
		while (contentsIter.hasNext()) {
			EObject eObj = contentsIter.next();

			if (eObj.eClass().getClassifierID() == JavaPackage.ANNOTATION_TYPE_DECLARATION) {
				AnnotationTypeDeclaration aTD = (AnnotationTypeDeclaration) eObj;
				if (!aTD.isProxy())
					return true;
			}
		}

		return false;
	}

}

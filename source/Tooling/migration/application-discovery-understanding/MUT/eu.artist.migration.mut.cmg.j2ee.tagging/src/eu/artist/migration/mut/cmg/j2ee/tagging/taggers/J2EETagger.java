package eu.artist.migration.mut.cmg.j2ee.tagging.taggers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import eu.artist.migration.mut.cmg.j2ee.tagging.queries.SecurityMatch;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.SecurityMatcher;
import eu.artist.migration.mut.cmg.j2ee.tagging.queries.util.SecurityProcessor;

public class J2EETagger {

	private IFile selectedFile;
	private Profile j2eeProfile;
	private Package rootPackage;
	
	private static ResourceSet RESOURCE_SET = new ResourceSetImpl();
	private static final String OUTPUT_FILE_SUFFIX = "_tagged.uml";
	
	private static final String J2EE6_PROFILE = "platform:/plugin/eu.artist.repository.artefacts/profiles/j2ee.profile.uml";
	
	/**
	 * Loads the resource from the passed file and returns this Resource object.
	 * 
	 * @param file IFile object to be loaded as the resource
	 * @return Resource object loaded from the passed file
	 */
	protected Resource loadResource(IFile file) {
		return RESOURCE_SET.getResource(URI.createURI(file.getLocationURI().toString()), true);
	}
	
	/**
	 * Loads the profile of the given name and returns this Profile object.
	 * 
	 * @param profileFileName Name of the file to be loaded as a profile
	 * @return Profie loaded from the file
	 */
	private Profile loadProfile(String profilePath){
		
		Resource resource = RESOURCE_SET.getResource(URI.createURI(profilePath), true);
		return (Profile) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PROFILE);
	}
	
	/**
	 * This method matches all the classes that should be tagged with Security stereotype
	 * 
	 * @param engine IncQueryEngine obtained on the resource
	 * @param results A StringBuilder object collecting the results
	 * @throws IncQueryException
	 */
	private void tagSecurityEntities (IncQueryEngine engine, final StringBuilder results) throws IncQueryException{
		SecurityMatcher matcher = SecurityMatcher.on(engine);
		// get all matches of the pattern
		Collection<SecurityMatch> matches = matcher.getAllMatches();
		prettyPrintMatches(results, matches);
		// using a match processor
		matcher.forEachMatch(new SecurityProcessor() {
			
			@Override
			public void process(Class pSub) {
				results.append("\tEObject: " + pSub.toString() + "\n");
				//TODO: Stereotype not yet supported in j2ee.profile.uml in repository artefacts
//				if ( rootPackage.getAppliedProfile(j2eeProfile.getQualifiedName()) == null) {
//					rootPackage.applyProfile(j2eeProfile);
//				}
//				Stereotype securityStereotype = j2eeProfile.getOwnedStereotype("Security");
//				if (pSub.getAppliedStereotype(securityStereotype.getQualifiedName()) == null){
//					pSub.applyStereotype(securityStereotype);
//				}
			}
		});
	}

	/**
	 * Starts tagging the classes on the model 
	 * 
	 * @param resource The loaded Resource which contains the model to be tagged
	 * @return
	 */
	private Resource tagModel(Resource resource){
		final StringBuilder results = new StringBuilder();
		
		if (resource != null) {
			try {
				// get all matches of the pattern
				// initialization
				// phase 1: (managed) IncQueryEngine
				IncQueryEngine engine = IncQueryEngine.on(resource);
				
				// phase 2: the matcher itself
				tagSecurityEntities(engine, results);
				
			} catch (IncQueryException e) {
				e.printStackTrace();
				results.append(e.getMessage());
			}
			System.out.println(results);
		} else {
			results.append("Resource not found");
		}
		return resource;
	}
	
	/**
	 * This method creates a file in the same folder as the input model file to store the tagged model. The generated file's name is the same as the input filename followed by
	 * a suffix defined in the static field {@code OUTPUT_FILE_SUFFIX}
	 * 
	 * @return Returns an instance of {@link File} to be used to save the results.
	 * @throws IOException
	 */
	private File createOutputFile () throws IOException{
		
		
		String inputFileName = selectedFile.getName();
		String inputFilePath = selectedFile.getLocation().toString();
		//Find output directory
		String outputDirectory = inputFilePath.substring(0, (inputFilePath.lastIndexOf('/')+1));
		//Create the output filename
		String outputFileName = inputFileName.substring(0, inputFileName.lastIndexOf('.')) + OUTPUT_FILE_SUFFIX;
		
		File outputFile = new File(outputDirectory + outputFileName); 
		
		if (!outputFile.exists()){
			outputFile.createNewFile();
		}
		
		return outputFile;
	}

	/**
	 * 
	 * @param results StringBuilder object containing the results
	 * @param matches Collection of pattern matches
	 */
	protected void prettyPrintMatches(StringBuilder results, Collection<? extends IPatternMatch> matches) {
		for (IPatternMatch match : matches) {
			results.append(match.prettyPrint()+"; ");
		}
		if(matches.size() == 0) {
			results.append("Empty match set");
		}
		results.append("\n");
	}
	
	/**
	 * This method executes the defined queries on the passed class model and tags every element with the appropriate stereotype that is matched with the query results
	 * 
	 * @param classModel {@link File} to be tagged.
	 * @throws Exception 
	 */
	public URI tagModel (IFile classModel) throws Exception{
		
		j2eeProfile = loadProfile(J2EE6_PROFILE);
		
		selectedFile = classModel;
		//Get the root package
		Resource modelResource = loadResource(selectedFile);
		Model model = (Model) modelResource.getContents().get(0);
		rootPackage = (org.eclipse.uml2.uml.Package) model.getPackagedElements().get(0);
		
		//Tag the model
		modelResource = tagModel(modelResource);
		FileOutputStream foStream = null;
		
		//If the resulting resource is not null - The operation is successful
		if (modelResource != null){
			try {
				
				File outputFile = createOutputFile();
				foStream = new FileOutputStream(outputFile);
				modelResource.save(foStream, null);
				//Refresh the folder the selected file is in to reflect the changes
				selectedFile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
				
				return URI.createURI(outputFile.toURI().toString());
				
			} catch (IOException e) {
				e.printStackTrace();
				
			} catch (CoreException e) {
				e.printStackTrace();
			} finally {
				
				if (foStream != null) {
					try {
						foStream.flush();
						foStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		else {
			Exception e = new Exception("Model could not be tagged");
			throw e;
		}
		return URI.createURI("NULL_MODEL_RESOURCE");
	}
}

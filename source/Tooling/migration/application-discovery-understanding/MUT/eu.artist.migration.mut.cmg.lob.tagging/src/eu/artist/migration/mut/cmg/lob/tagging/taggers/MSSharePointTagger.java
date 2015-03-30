package eu.artist.migration.mut.cmg.lob.tagging.taggers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplicationMatch;
import eu.artist.migration.mut.cmg.lob.tagging.queries.ServiceApplicationMatcher;
import eu.artist.migration.mut.cmg.lob.tagging.queries.UIMatch;
import eu.artist.migration.mut.cmg.lob.tagging.queries.UIMatcher;
import eu.artist.migration.mut.cmg.lob.tagging.queries.WCFServiceMatch;
import eu.artist.migration.mut.cmg.lob.tagging.queries.WCFServiceMatcher;
import eu.artist.migration.mut.cmg.lob.tagging.queries.util.ServiceApplicationProcessor;
import eu.artist.migration.mut.cmg.lob.tagging.queries.util.UIProcessor;
import eu.artist.migration.mut.cmg.lob.tagging.queries.util.WCFServiceProcessor;


public class MSSharePointTagger {

	private IFile selectedFile;
	private Profile genericProfile;
	private Profile msSharePointProfile;
	private Package rootPackage;
	
	private static ResourceSet RESOURCE_SET = new ResourceSetImpl();
	private static final String OUTPUT_FILE_SUFFIX = "_tagged.uml";
	
	private static final String GENERIC_PROFILE = "platform:/plugin/eu.artist.repository.artefacts/profiles/Generic.profile.uml";
	private static final String MS_SHAREPOINT_PROFILE = "platform:/plugin/eu.artist.repository.artefacts/profiles/MicrosoftSharePoint.profile.uml";
	
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
	 * This method matches all the classes that should be tagged with ServiceApplication stereotype
	 * 
	 * @param engine IncQueryEngine obtained on the resource
	 * @param results A StringBuilder object collecting the results
	 * @throws IncQueryException
	 */
	private void tagServiceApplications (IncQueryEngine engine, final StringBuilder results) throws IncQueryException{
		ServiceApplicationMatcher matcher = ServiceApplicationMatcher.on(engine);
		// get all matches of the pattern
		Collection<ServiceApplicationMatch> matches = matcher.getAllMatches();
		prettyPrintMatches(results, matches);
		// using a match processor
		matcher.forEachMatch(new ServiceApplicationProcessor() {
			
			@Override
			public void process(Class pSub, Class pSup) {
				results.append("\tEObject: " + pSub.toString() + "\n");
				if ( rootPackage.getAppliedProfile(msSharePointProfile.getQualifiedName()) == null) {
					rootPackage.applyProfile(msSharePointProfile);
				}
				Stereotype serviceApplicationStereotype = msSharePointProfile.getOwnedStereotype("ServiceApplication");
				if (pSub.getAppliedStereotype(serviceApplicationStereotype.getQualifiedName()) == null){
					pSub.applyStereotype(serviceApplicationStereotype);
				}
			}
		});
	}
	
	/**
	 * This method matches all the classes that should be tagged with View stereotype
	 * 
	 * @param engine IncQueryEngine obtained on the resource
	 * @param results A StringBuilder object collecting the results
	 * @throws IncQueryException
	 */
	//TODO: might be further specialized as a UI stereotype
	private void tagUIClasses (IncQueryEngine engine, final StringBuilder results) throws IncQueryException{
		UIMatcher matcher = UIMatcher.on(engine);
		// get all matches of the pattern
		Collection<UIMatch> matches = matcher.getAllMatches();
		prettyPrintMatches(results, matches);
		// using a match processor
		matcher.forEachMatch(new UIProcessor() {
			
			@Override
			public void process(Class pSub) {
				results.append("\tEObject: " + pSub.toString() + "\n");
				
				if ( rootPackage.getAppliedProfile(genericProfile.getQualifiedName()) == null) {
					rootPackage.applyProfile(genericProfile);
				}
				Stereotype viewStereotype = genericProfile.getOwnedStereotype("View");
				if (pSub.getAppliedStereotype(viewStereotype.getQualifiedName()) == null){
					pSub.applyStereotype(viewStereotype);
				}
			}
		});
	}
	
	/**
	 * This method matches all the classes that should be tagged with WCFService stereotype
	 * 
	 * @param engine IncQueryEngine obtained on the resource
	 * @param results A StringBuilder object collecting the results
	 * @throws IncQueryException
	 */
	//TODO: might be further specialized as a UI stereotype
	private void tagWCFServices (IncQueryEngine engine, final StringBuilder results) throws IncQueryException{
		WCFServiceMatcher matcher = WCFServiceMatcher.on(engine);
		// get all matches of the pattern
		Collection<WCFServiceMatch> matches = matcher.getAllMatches();
		prettyPrintMatches(results, matches);
		// using a match processor
		matcher.forEachMatch(new WCFServiceProcessor() {
			
			@Override
			public void process(Class pSub) {
				results.append("\tEObject: " + pSub.toString() + "\n");
				
				if ( rootPackage.getAppliedProfile(genericProfile.getQualifiedName()) == null) {
					rootPackage.applyProfile(genericProfile);
				}
				Stereotype wcfServiceStereotype = genericProfile.getOwnedStereotype("WCFService");
				if (pSub.getAppliedStereotype(wcfServiceStereotype.getQualifiedName()) == null){
					pSub.applyStereotype(wcfServiceStereotype);
				}
			}
		});
	}
	
//	/**
//	 * This method matches all the classes that should be tagged with View stereotype
//	 * 
//	 * @param engine IncQueryEngine obtained on the resource
//	 * @param results A StringBuilder object collecting the results
//	 * @throws IncQueryException
//	 */
//	//TODO: might be further specialized as a ASPNETControl stereotype
//	private void tagASPNETControls (IncQueryEngine engine, final StringBuilder results) throws IncQueryException{
//		ASPNETControlMatcher matcher = ASPNETControlMatcher.on(engine);
//		// get all matches of the pattern
//		Collection<ASPNETControlMatch> matches = matcher.getAllMatches();
//		prettyPrintMatches(results, matches);
//		// using a match processor
//		matcher.forEachMatch(new ASPNETControlProcessor() {
//			
//			@Override
//			public void process(Class pSub) {
//				results.append("\tEObject: " + pSub.toString() + "\n");
//				
//				if ( rootPackage.getAppliedProfile(genericProfile.getQualifiedName()) == null) {
//					rootPackage.applyProfile(genericProfile);
//				}
//				Stereotype viewStereotype = genericProfile.getOwnedStereotype("View");
//				if (pSub.getAppliedStereotype(viewStereotype.getQualifiedName()) == null){
//					pSub.applyStereotype(viewStereotype);
//				}
//			}
//		});
//	}
//	
//	/**
//	 * This method matches all the classes that should be tagged with View stereotype
//	 * 
//	 * @param engine IncQueryEngine obtained on the resource
//	 * @param results A StringBuilder object collecting the results
//	 * @throws IncQueryException
//	 */
//	//TODO: might be further specialized as a WebPart stereotype
//	private void tagWebParts (IncQueryEngine engine, final StringBuilder results) throws IncQueryException{
//		WebPartMatcher matcher = WebPartMatcher.on(engine);
//		// get all matches of the pattern
//		Collection<WebPartMatch> matches = matcher.getAllMatches();
//		prettyPrintMatches(results, matches);
//		// using a match processor
//		matcher.forEachMatch(new WebPartProcessor() {
//			
//			@Override
//			public void process(Class pSub) {
//				results.append("\tEObject: " + pSub.toString() + "\n");
//				
//				if ( rootPackage.getAppliedProfile(genericProfile.getQualifiedName()) == null) {
//					rootPackage.applyProfile(genericProfile);
//				}
//				Stereotype viewStereotype = genericProfile.getOwnedStereotype("View");
//				if (pSub.getAppliedStereotype(viewStereotype.getQualifiedName()) == null){
//					pSub.applyStereotype(viewStereotype);
//				}
//			}
//		});
//	}

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
				tagServiceApplications(engine, results);
				tagUIClasses(engine, results);
				tagWCFServices(engine, results);
//				tagASPNETControls(engine, results);
//				tagWebParts(engine, results);
				
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
		
		genericProfile = loadProfile(GENERIC_PROFILE);
		msSharePointProfile = loadProfile(MS_SHAREPOINT_PROFILE);
		
		selectedFile = classModel;
		//Get the root package
		Resource modelResource = loadResource(selectedFile);
		Model model = (Model) modelResource.getContents().get(0);
		
		EList<PackageableElement> packagedElements = model.getPackagedElements();
		for(int i = 0; i < packagedElements.size(); i++){
			
			if (packagedElements.get(i) instanceof org.eclipse.uml2.uml.Package){
				rootPackage = (org.eclipse.uml2.uml.Package) packagedElements.get(i);
				break;
			}
		}
		
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

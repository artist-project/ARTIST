package eu.artist.postmigration.nfrvt.search;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Model;
import org.modelexecution.fuml.nfr.simulation.workload.ServiceCenter;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadExtractor;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet.SaveResult;
import eu.artist.postmigration.nfrvt.lang.util.builder.MeasurementModelBuilder;
import eu.artist.postmigration.nfrvt.resources.MigrationLibraryResourcesUtil;
import eu.artist.postmigration.nfrvt.strategy.staticanalysis.StaticAnalysis;

public class MigrationExplorer {
	protected MigrationResourceSet set;
	
	public MigrationExplorer(MigrationResourceSet set) {
		this.set = set;
	}
	
	public MigrationExplorer() {
		this(new MigrationResourceSet());
	}
	
	public MigrationSearchResult search(GoalModel goalModel, Model softwareModel) {
		MigrationSearchResult result = new MigrationSearchResult();	
		
		MeasurementModelBuilder analysisBuilder = new MeasurementModelBuilder(set, 
				goalModel.eResource().getURI().trimSegments(goalModel.eResource().getURI().segmentCount() - 1).appendSegment("analysis").appendFileExtension(FileExtensions.getMeasurementModelExtension()), 
				false);
		
		StaticAnalysis analysis = new StaticAnalysis(set);
		analysis.measure(softwareModel, analysisBuilder);
		SaveResult saveModel = analysisBuilder.save();
		if(saveModel.getException() != null) {
			System.err.println("Can not read or create '" + analysisBuilder.getMeasurementModel().eResource().getURI() + "': " + saveModel.getExceptionMessage());
		}
		
//		MeasurementModelBuilder builder = new MeasurementModelBuilder(set, goalModel.eResource().getURI().appendSegment("fUML").appendFileExtension(FileExtensions.getMeasurementModelExtension()), false);
//		Observation observation = builder.addObservation("fUML Simulation", ObservationLevel.Model, MeasurementType.Simulated);
				
		WorkloadExtractor workloadExtractor = new WorkloadExtractor(softwareModel);
		workloadExtractor.setAnalysisContext("petstore::AnalysisContext");
		
		org.modelexecution.fuml.nfr.simulation.workload.Workload fUMLWorkload = workloadExtractor.extractWorkload();
		for(ServiceCenter center : fUMLWorkload.getServiceCenters())
			System.out.println(center.getUmlElement().getQualifiedName());
		
		return result;
	}
	
	public static void main(String[] args) {
		MigrationResourceSet set = new MigrationResourceSet();
		MigrationLibraryResourcesUtil.init(set, true);
		
		Model model = set.loadUMLModel(URI.createFileURI("model/petstore.uml"));
		GoalModel goals = set.loadGoalModel(URI.createFileURI("model/getgmlpetstore.refined.goal"));
		System.out.println("Model: " + model);
		System.out.println("Goals: " + goals);
		
		MigrationExplorer explorer = new MigrationExplorer(set);
		explorer.search(goals, model);
	}
}

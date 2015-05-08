package eu.artist.postmigration.nfrvt.search;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Model;

import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;

public class MigrationSearchResult {
	private GoalModel goalModel;
	private Model inputUMLModel;
	
	private List<MeasurementModel> measurementModels;
	private Model outputUMLModel;
	private MigrationEvaluation migrationEvaluation;	
	
	public GoalModel getGoalModel() {
		return goalModel;
	}
	public void setGoalModel(GoalModel goalModel) {
		this.goalModel = goalModel;
	}
	
	public Model getInputUMLModel() {
		return inputUMLModel;
	}
	public void setInputUMLModel(Model inputUMLModel) {
		this.inputUMLModel = inputUMLModel;
	}
	
	public List<MeasurementModel> getMeasurementModels() {
		return measurementModels;
	}
	public void setMeasurementModels(List<MeasurementModel> measurementModels) {
		this.measurementModels = measurementModels;
	}
	public void addMeasurementModel(MeasurementModel measurementModel) {
		if(this.measurementModels == null)
			this.measurementModels = new ArrayList<>();
		this.measurementModels.add(measurementModel);
	}
	
	public Model getOutputUMLModel() {
		return outputUMLModel;
	}
	public void setOutputUMLModel(Model outputUMLModel) {
		this.outputUMLModel = outputUMLModel;
	}
	
	public MigrationEvaluation getMigrationEvaluation() {
		return migrationEvaluation;
	}
	public void setMigrationEvaluation(MigrationEvaluation migrationEvaluation) {
		this.migrationEvaluation = migrationEvaluation;
	}
}

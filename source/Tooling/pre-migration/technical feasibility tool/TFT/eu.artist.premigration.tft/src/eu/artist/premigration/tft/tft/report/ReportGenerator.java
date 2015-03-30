/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import eu.artist.premigration.tft.tft.effort.EffortCalculator;
import eu.artist.premigration.tft.tft.model.Component;
import eu.artist.premigration.tft.tft.model.migrationstrategy.Complexity;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;
import eu.artist.suite.ARTISTSuite;
import eu.artist.suite.preferences.PreferenceConstants;

/**
 * Singleton handling the generation of TFT reports
 * @author Burak Karaboga
 *
 */
public enum ReportGenerator {

	INSTANCE;

	private ReportFormat format; 
	private List<Component> components;
	private IProject project;

	/**
	 * 
	 * @param reportFormat File format of the report. See {@link ReportFormat} 
	 */
	public void setFormat(ReportFormat reportFormat){
		this.format = reportFormat;
	}

	/**
	 * 
	 * @param componentList List of components of which the report will be produced
	 */
	public void setComponents (List<Component> componentList){
		this.components = componentList;
	}

	/**
	 * 
	 * @param project IProject object of the Eclipse project where the report will be created
	 */
	public void setProject(IProject project){
		this.project = project;
	}

	/**
	 * Generates TFT report in the selected file format.
	 * If the report format is not set, a CSV report is created.
	 */
	public void generate(){

		switch (format) {
		case XML:
			generateXMLReport();
			break;
		case JSON:
			generateJSONReport();
			break;
		default:
			generateCSVReport();
			break;
		}
	}

	/**
	 * Generates TFT report in CSV format
	 */
	private void generateCSVReport(){
		try {
			
			IPreferenceStore store = ARTISTSuite.getDefault().getPreferenceStore();
	        String reportPath = store.getString(PreferenceConstants.TFT_REPORT_PATH.getValue());
			
	        DirectoryDialog dirDialog = new DirectoryDialog(new Shell());
		    dirDialog.setText("Please select the desired folder where the report will be created.");
		    if (!reportPath.trim().equals("")){
		    	dirDialog.setFilterPath(reportPath);
		    }
		    String selectedDir = dirDialog.open();
		    System.out.println(selectedDir);
			
			IFolder reportFolder = project.getFolder("report");

			if (!reportFolder.exists()) {
				reportFolder.create(IResource.NONE, true, null);
			}

			File reportFile = new File(selectedDir.concat("/TFT_report.csv"));


			if (!reportFile.exists()){
				reportFile.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(reportFile.getAbsoluteFile());
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			StringBuilder report = new StringBuilder("");
			report.append("Component Name;");
			report.append("Migration Strategies;");
			report.append("Strategy Descriptions;");
			report.append("Migration Complexity;");
			report.append("Migration Effort");
			bufferedWriter.write(report.toString());
			bufferedWriter.newLine();

			//For all the components
			for (Component component : components) {
				
				if (component.getChildren().size() <= 0 && component.isSelected()){
					//Clear the string buffer
					report.setLength(0);
	
					report.append(component.getName());
					report.append(";");
	
					Complexity highestComplexity = Complexity.UNKNOWN;
	
					//Get the highest complexity
					for (int i = 0; i<component.getMigrationStrategies().size(); i++){
						MigrationStrategy strategy = component.getMigrationStrategies().get(i);
						report.append(strategy.getText());
						if (i+1 < component.getMigrationStrategies().size()){
							report.append("|");
						}
						if (strategy.getComplexity().getDegree() > highestComplexity.getDegree()){
							highestComplexity = strategy.getComplexity();
						}
					}
					
					report.append(";");
					
					for (int i = 0; i<component.getMigrationStrategies().size(); i++){
						MigrationStrategy strategy = component.getMigrationStrategies().get(i);
						report.append(strategy.getDescription().replace(";", ""));
						if (i+1 < component.getMigrationStrategies().size()){
							report.append("|");
						}
					}
					
					report.append(";");
					report.append(highestComplexity.getValue());
					
					report.append(";");
					report.append(EffortCalculator.INSTANCE.calculateEffortForComponent(component));
	
					bufferedWriter.write(report.toString());
					bufferedWriter.newLine();
				}
			}

			bufferedWriter.flush();
			bufferedWriter.close();

			reportFolder.refreshLocal(IResource.DEPTH_ONE, null);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException ce) {
			ce.printStackTrace();
		}
	}
	
	/**
	 * Generates TFT report in XML format
	 */
	private void generateXMLReport(){
		System.out.println("Not yet implemented");
	}

	/**
	 * Generates TFT report in JSON format
	 */
	private void generateJSONReport(){
		System.out.println("Not yet implemented");
	}
}

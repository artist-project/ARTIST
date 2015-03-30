/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.result.FileHandler;
import org.modelexecution.fuml.nfr.simulation.result.ServiceCenterResult;

import at.ac.tuwien.big.simpleqn.Service;

public class SimulationCSVFileWriter extends SimulationCSVPrinter {

	private class NameHandler {
		private static final String INFO_FILE_EXT = ".txt";
		private static final String INFO_FILE = "_overview";
		
		private static final String FILE_EXT = ".csv";
		private static final String WORKLOAD_FILE = "_workload";
		private static final String SERVICE_FILE = "_service";
		
		private String defaultBaseName = getSimulation().getModelName();		
		private String baseName;
		
		public NameHandler() {
			setBaseName(getDefaultBaseName());
		}
		
		public NameHandler setBaseName(String baseName) {
			if(baseName != null && !baseName.trim().isEmpty())
				this.baseName = baseName;
			return this;
		}
		
		public String getDefaultBaseName() {
			return this.defaultBaseName;
		}
		
		public String getBaseName() {
			return this.baseName;
		}
		
		public String getStaticFileName() {
			return baseName + INFO_FILE + INFO_FILE_EXT;
		}
		
		public String getWorkloadFileName() {
			return baseName + WORKLOAD_FILE + FILE_EXT;
		}
		
		public String getServiceCenterFileName(Service service) {
			return baseName + SERVICE_FILE + "_" + getSimulation().getServiceName(service) + FILE_EXT;
		}
		
		public String getServiceCenterPropertyFileName(ServiceCenterResult property) {
			return baseName + SERVICE_FILE + "s_" + property + FILE_EXT;
		}
	}

	private FileHandler fileHandler;
	private NameHandler nameHandler;
		
	public SimulationCSVFileWriter(WorkloadSimulation simulation) {
		super(simulation);
		fileHandler = new FileHandler();
	}
	
	public SimulationCSVFileWriter setOutputDirectory(String fileDirectory) {
		getFileHandler().setFileDirectory(fileDirectory);
		return this;
	}
	
	private FileHandler getFileHandler() {
		return fileHandler;
	}
	
	public SimulationCSVFileWriter setBaseName(String baseName) {
		getNameHandler().setBaseName(baseName);
		return this;
	}
	
	private NameHandler getNameHandler() {
		if(nameHandler == null)
			nameHandler = new NameHandler();
		return nameHandler;
	}
	
	/*********** Printing All  ***********/
	
	public List<File> printAll() throws IOException {
		return printAll(getNameHandler());
	}
	
	public List<File> printAll(String baseName) throws IOException {
		return printAll(getNameHandler().setBaseName(baseName));
	}
	
	private List<File> printAll(NameHandler nameHandler) throws IOException {
		List<File> files = new ArrayList<File>();
		files.add(printStaticInformation(nameHandler.getStaticFileName()));
		files.add(printNetEvolution(nameHandler.getWorkloadFileName()));
		files.addAll(printAllServicesEvolution(nameHandler.getBaseName()));
		files.addAll(printAllServicePropertiesEvolution(nameHandler.getBaseName()));
		return files;
	}	
	
	/*********** Static Printing ***********/
	
	public File printStaticInformation() throws IOException {
		return printStaticInformation(getNameHandler().getStaticFileName());
	}
	
	public File printStaticInformation(String fileName) throws IOException {
		FileOutputStream stream = getFileHandler().getFileOutputStream(fileName);
		printStaticInformation(stream);
		stream.close();
		return getFileHandler().getFile(fileName);
	}
	
	public File printNetEvolution() throws IOException {
		return printNetEvolution(getNameHandler().getWorkloadFileName());
	}
	
	public File printNetEvolution(String fileName) throws IOException {
		FileOutputStream stream = getFileHandler().getFileOutputStream(fileName);
		printNetEvolution(stream);
		stream.close();
		return getFileHandler().getFile(fileName);
	}
	
	public List<File> printAllServicesEvolution() throws IOException {
		return printAllServicesEvolution(getNameHandler().getBaseName());
	}
	
	public List<File> printAllServicesEvolution(String baseName) throws IOException {
		List<File> fileList = new ArrayList<File>();
		for(Service service : getSimulation().getAllServices())	
			fileList.add(printServiceEvolution(getNameHandler().getServiceCenterFileName(service), service));
		return fileList;
	}
	
	public File printServiceEvolution(String fileName, Service service) throws IOException {
		FileOutputStream stream = getFileHandler().getFileOutputStream(fileName);
		printServiceEvolution(stream, service);
		stream.close();
		return getFileHandler().getFile(fileName);
	}
	
	public List<File> printAllServicePropertiesEvolution() throws IOException {
		return printAllServicePropertiesEvolution(getNameHandler().getBaseName());
	}
	
	public List<File> printAllServicePropertiesEvolution(String baseName) throws IOException {
		List<File> fileList = new ArrayList<File>();
		fileList.add(printAllServicesPropertyEvolution(ServiceCenterResult.Utilization));
		fileList.add(printAllServicesPropertyEvolution(ServiceCenterResult.Throughput));
		fileList.add(printAllServicesPropertyEvolution(ServiceCenterResult.IdleTime));
		fileList.add(printAllServicesPropertyEvolution(ServiceCenterResult.BusyTime));
		fileList.add(printAllServicesPropertyEvolution(ServiceCenterResult.AvgDemandPerRequest));
		fileList.add(printAllServicesPropertyEvolution(ServiceCenterResult.AvgQueueLength));
		fileList.add(printAllServicesPropertyEvolution(ServiceCenterResult.MaxQueueLength));
		return fileList;
	}
	
	public File printAllServicesPropertyEvolution(ServiceCenterResult property) throws FileNotFoundException, IOException {
		return printAllServicesPropertyEvolution(getNameHandler().getServiceCenterPropertyFileName(property), property);
	}
	
	public File printAllServicesPropertyEvolution(String fileName, ServiceCenterResult property) throws FileNotFoundException, IOException {
		FileOutputStream stream = getFileHandler().getFileOutputStream(fileName);
		printServicesPropertyEvolution(stream, property);
		stream.close();
		return getFileHandler().getFile(fileName);
	}
}

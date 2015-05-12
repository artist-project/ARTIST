/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/

package eu.artist.moola;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.codehaus.groovy.control.CompilationFailedException;
import org.codehaus.groovy.control.CompilerConfiguration;

import eu.artist.moola.dsl.core.Project;
import eu.artist.moola.dsl.workflow.MoolaProcess;
import eu.artist.moola.dsl.workflow.ProcessFactory;
import eu.artist.moola.exec.ExecutionContext;
import eu.artist.moola.exec.ExecutionContextFactory;
import eu.artist.moola.logging.Log;
import eu.artist.moola.logging.LogLevel;
import eu.artist.moola.logging.impl.StreamLogger;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.util.DelegatingScript;

/*
 * This class launches a Moola script
 */
public class Launcher {

	public static void main(String[] args) {
		try {

			if (args.length < 1) {
				System.out.println("Please specify a path to the Moola script");
			}

			String path = args[0];
			// LauncherCongif conifg = ... parse args[1-*]
			Launcher launcher = new Launcher(path);
			launcher.run();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	
	private StreamLogger logger;
	private Log log;
	private OutputStream output;

	private String path;
	private String projectName;
	private String projectPath;
	
	public Launcher(String path) {
		this.path = path;
	}
	
	public void run() {
		try {
			if(this.output == null){
				this.setOutputStream(System.out);
			}
			log.info("Starting Moola process on " + this.path);
			
			Project project = this.createProject();
			parseScript(this.path, project);
			
			// apply settings from project to launcher
			applyProjectRuntimeSettings(project);
			
			// script is parsed, launcher is configured -> run workflow engine
			//MoolaProcess process = ProcessFactory.generateProcess(project, log);
			//process.run();
			ExecutionContext context = ExecutionContextFactory.create(project);
			context.run();
			
			log.info("Finished Moola process successfully");
		} catch(Exception ex) {
			log.error("Error occured in Moola process", ex);
		}
	}
	
	private Project createProject() {
		Project project = new Project();
		project.getProj().setPath(this.projectPath);
		project.getProj().setTitle(this.projectName);
		project.getProj().setMoolaFile(this.path);
		return project;
	}
	
	private void applyProjectRuntimeSettings(Project project) {
		String desiredLogLvl = project.getProj().getLogLevel().toLowerCase();
		for(LogLevel lvl : LogLevel.values()) {
			String lvlName = lvl.name().toLowerCase();
			if(lvlName.equals(desiredLogLvl)){
				this.log.setLogLevel(lvl);
			}
		}
	}
	
	private void parseScript(String path, Project project) throws CompilationFailedException, IOException {
		Binding binding = new Binding();
		if(this.logger != null) {
			//binding.setProperty("out", this.logger.getStream());	
		}
		
		CompilerConfiguration cc = new CompilerConfiguration();
		cc.setScriptBaseClass("groovy.util.DelegatingScript");
		GroovyShell sh = new GroovyShell(Launcher.class.getClassLoader(), binding, cc);

		DelegatingScript script = (DelegatingScript) sh.parse(new File(path));
		script.setDelegate(project);
		script.run();
	}
	
	public void setOutputStream(OutputStream output){
		this.output = output;
		this.logger = new StreamLogger(output); 
		this.log = new Log(this.logger);
		System.setOut(this.logger.getStream());
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectPath() {
		return projectPath;
	}

	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}

}

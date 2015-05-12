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
package eu.artist.moola.eclipse;

import java.io.OutputStream;

import eu.artist.moola.Launcher;

public class MoolaRunner implements Runnable {

	private OutputStream outStream;
	private String moolaPath;
	private String projectName;
	private String projectPath;

	public MoolaRunner(String moolaPath, String projectPath, String projectName, OutputStream outStream) {
		this.moolaPath = moolaPath;
		this.projectPath = projectPath;
		this.projectName = projectName;
		this.outStream = outStream;
	}

	@Override
	public void run() {
		try {

			Launcher launcher = new Launcher(moolaPath);
			launcher.setOutputStream(outStream);
			launcher.setProjectName(projectName);
			launcher.setProjectPath(projectPath);
			launcher.run();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

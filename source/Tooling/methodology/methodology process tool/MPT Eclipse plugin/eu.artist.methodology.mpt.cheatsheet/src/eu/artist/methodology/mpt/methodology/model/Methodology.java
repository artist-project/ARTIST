/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.methodology.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Methodology {
	
	private Set<Task> tasks = new LinkedHashSet<>();

	public Set<Task> getTasks() {
		return tasks;
	}
	
	public Set<Task> getStartTasks(){
		Set<Task> startTasks = new HashSet<>();
		for (Task t: tasks){
			if (t.getPredecessor() == null)
				startTasks.add(t);
		}
		return startTasks;
	}
}

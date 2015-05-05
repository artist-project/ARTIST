/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package at.ac.tuwien.big.moea.run.listener;

import org.moeaframework.util.progress.ProgressEvent;
import org.moeaframework.util.progress.ProgressListener;

public abstract class AbstractProgressListener implements ProgressListener {
	private boolean firstRun = true;
	
	public boolean isSeedFinished(ProgressEvent event) {
		return !isFinished(event) && event.getCurrentNFE() >= event.getMaxNFE();
	}
	
	public boolean isFinished(ProgressEvent event) {
		return event.getCurrentSeed() > event.getTotalSeeds();
	}
	
	public boolean isRunning(ProgressEvent event) {
		return !firstRun && event.getCurrentNFE() > 0;
	}
	
	public boolean isStarted(ProgressEvent event) {
		return firstRun;
	}
	
	public boolean isSeedStarted(ProgressEvent event) {
		return firstRun || (event.getCurrentNFE() == 0 && !isFinished(event));
	}
	
	@Override
	public void progressUpdate(ProgressEvent event) {
		update(event);
		if(firstRun)
			firstRun = false;
		if(isFinished(event))
			firstRun = true;
	}
	
	public abstract void update(ProgressEvent event);
}

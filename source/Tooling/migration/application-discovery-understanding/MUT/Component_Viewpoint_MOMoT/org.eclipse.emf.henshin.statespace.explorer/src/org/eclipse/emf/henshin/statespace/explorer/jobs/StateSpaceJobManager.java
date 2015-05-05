/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.jobs;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.explorer.commands.IrreversibleCommand;
import org.eclipse.gef.EditDomain;

/**
 * Job manager for state explorers.
 * @author Christian Krause
 */
public class StateSpaceJobManager {
	
	/** 
	 * Job for running the spring layouter.
	 */
	private LayoutStateSpaceJob layoutJob;
	
	/** 
	 * Job for exploring the state space.
	 */
	private ExploreStateSpaceJobWithDisplay exploreJob;

	/** 
	 * Job for running the validator.
	 */
	private ValidateStateSpaceJob validateJob;

	/** 
	 * State space manager.
	 */
	private StateSpaceManager stateSpaceManager;
	
	/** 
	 * Edit domain for running commands.
	 */
	private EditDomain editDomain;
	
	/**
	 * Default constructor.
	 * @param stateSpaceManager State space manager.
	 */
	public StateSpaceJobManager(StateSpaceManager stateSpaceManager, EditDomain editDomain) {
		this.stateSpaceManager = stateSpaceManager;
		this.editDomain = editDomain;
		this.layoutJob = new LayoutStateSpaceJob(stateSpaceManager.getStateSpace());
		this.exploreJob = new ExploreStateSpaceJobWithDisplay(stateSpaceManager, editDomain);
		this.validateJob = new ValidateStateSpaceJob(stateSpaceManager);
	}
	
	/**
	 * Start the background spring layouter job.
	 */
	public LayoutStateSpaceJob startLayoutJob() {
		if (isTerminated(layoutJob)) {
			editDomain.getCommandStack().execute(new IrreversibleCommand("start layouter"));
			layoutJob.schedule();
		}
		return layoutJob;
	}
	
	/**
	 * Start the explore job.
	 */
	public ExploreStateSpaceJobWithDisplay startExploreJob() {
		if (isTerminated(exploreJob)) exploreJob.schedule();
		return exploreJob;
	}

	/**
	 * Start the validate job.
	 */
	public ValidateStateSpaceJob startValidateJob() {
		if (isTerminated(validateJob)) validateJob.schedule();
		return validateJob;
	}

	/**
	 * Stop the spring layouter job.
	 */
	public void stopLayoutJob() {
		stop(layoutJob);
	}

	/**
	 * Stop the explore job.
	 */
	public void stopExploreJob() {
		stop(exploreJob);
	}

	/**
	 * Stop the validate job.
	 */
	public void stopValidateJob() {
		stop(validateJob);
	}

	/*
	 * Stop a given job.
	 */
	private void stop(Job job) {
		int waited = 0;
		while (!isTerminated(job) && waited<1000) {
			try {
				job.cancel();
				// We don't want to join, cause we may run into a deadlock then..
				waited += 100;
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
	
	/*
	 * Check if a job is terminated.
	 */
	private boolean isTerminated(Job job) {
		return job.getState()==Job.NONE;
	}
	
	/**
	 * Stop all background jobs.
	 */
	public void stopAllJobs() {
		stopLayoutJob();
		stopExploreJob();
		stopValidateJob();
	}
	
	/**
	 * Get the layout job.
	 * @return layout job.
	 */
	public LayoutStateSpaceJob getLayoutJob() {
		return layoutJob;
	}
	
	/**
	 * Get the explore job.
	 * @return explore job.
	 */
	public ExploreStateSpaceJobWithDisplay getExploreJob() {
		return exploreJob;
	}

	/**
	 * Get the validate job.
	 * @return validate job.
	 */
	public ValidateStateSpaceJob getValidateJob() {
		return validateJob;
	}

	public StateSpaceManager getStateSpaceManager() {
		return stateSpaceManager;
	}

}

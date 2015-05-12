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

package eu.artist.moola.logging;


/**
 * Static wrapper for easy access to a global eu.artist.moola.logging.ILogger instance
 */
public class Log {
	
	private ILogger logger;
	
	public Log(ILogger logger){
		this.logger = logger;
	}
	
	public void setLogLevel(LogLevel level) {
		this.logger.setLogLevel(level);
	}
	
	public void setLogger(ILogger log){
		logger = log;
	}

	public void info(String message){
		logger.log(LogLevel.Info, message);
	}

	public void verbose(String message){
		logger.log(LogLevel.Verbose, message);
	}

	public void error(String message){
		logger.log(LogLevel.Error, message);
	}

	public void error(Exception ex){
		logger.log(LogLevel.Error, ex);
	}

	public void error(String message, Exception ex){
		logger.log(LogLevel.Error, message);
		logger.log(LogLevel.Error, ex);
	}
}

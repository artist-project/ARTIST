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

package eu.artist.moola.logging.impl;

import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import eu.artist.moola.logging.ILogger;
import eu.artist.moola.logging.LogLevel;

public class StreamLogger
	implements ILogger {
	
	protected LogLevel logLevel;
	// PrintStream is synchronized internally
	protected PrintStream writer;

	public StreamLogger(OutputStream stream){
		this.logLevel = LogLevel.Verbose;
		this.writer = new PrintStream(stream);
	}

	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel;
	}
	
	public LogLevel getLogLevel() {
		return this.logLevel;
	}
	
	public PrintStream getStream(){
		return this.writer;
	}
	
	public void log(LogLevel level, String message) {
		try {
			if(!level.isEqualOrWorseThan(this.logLevel)){
				return;
			}
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
			
			String logItem = "";
			logItem += dateFormat.format(new Date());
			logItem += "\t" + String.format("%03d", Thread.currentThread().getId());
			logItem += "\t" + level.toString();
			logItem += "\t" + message;

			this.writer.println(logItem);
			this.writer.flush();
		} catch(Exception ex){
			System.out.println("Logger not available");
			ex.printStackTrace();
		}
	}
	
	public synchronized void log(LogLevel level, Exception ex) {
		try {
			if(!level.isEqualOrWorseThan(this.logLevel)){
				return;
			}
			
			this.log(level, ex.getMessage());
			ex.printStackTrace(this.writer);
		} catch(Exception e){
			System.out.println("Logger not available");
		}
	}
	
}

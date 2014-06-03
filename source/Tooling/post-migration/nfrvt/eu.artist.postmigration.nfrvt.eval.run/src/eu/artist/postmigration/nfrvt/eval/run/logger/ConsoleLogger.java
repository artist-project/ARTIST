package eu.artist.postmigration.nfrvt.eval.run.logger;
/*
 * Copyright (c) 2013, 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.debug.core.IStreamListener;
import org.eclipse.debug.core.model.IStreamMonitor;
import org.eclipse.debug.core.model.IStreamsProxy;

public class ConsoleLogger implements IStreamsProxy {
	
	private StreamMonitor errorMonitor = new StreamMonitor();
	private StreamMonitor standardMonitor = new StreamMonitor();

	@Override
	public IStreamMonitor getErrorStreamMonitor() {
		return errorMonitor;
	}

	@Override
	public IStreamMonitor getOutputStreamMonitor() {
		return standardMonitor;
	}

	@Override
	public void write(String input) throws IOException {
		standardMonitor.write(input);
	}
	
	public void writeLine(String input) throws IOException {
		standardMonitor.write(input + "\n");
	}

	public void writeError(String input) throws IOException {
		errorMonitor.write(input);
	}
	
	public void writeErrorLine(String input) throws IOException {
		errorMonitor.write(input + "\n");
	}

	private class StreamMonitor implements IStreamMonitor {

		private Collection<IStreamListener> listeners = new HashSet<IStreamListener>();
		private String input;

		public void write(String input) {
			this.input = input;
			notifyListeners();
		}

		private void notifyListeners() {
			for (IStreamListener l : new ArrayList<IStreamListener>(listeners)) {
				l.streamAppended(input, this);
			}
		}

		@Override
		public void addListener(IStreamListener listener) {
			listeners.add(listener);
		}

		@Override
		public String getContents() {
			return input;
		}

		@Override
		public void removeListener(IStreamListener listener) {
			listeners.remove(listener);
		}
	}
}
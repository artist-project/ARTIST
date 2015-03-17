//////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2014 Vienna University of Technology.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// Contributors:
// Tanja Mayerhofer (Vienna University of Technology) - initial API and implementation
//
//////////////////////////////////////////////////////////////////////////////

package eu.artist.postmigration.mbt.modelexecution.fumldebug.eval.extensions.internal;

import java.util.ArrayList;
import java.util.List;

import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.Event;

public class EventListener implements ExecutionEventListener {
	private List<Event> events = new ArrayList<Event>();
	
	@Override
	public void notify(Event event) {
		events.add(event);
//		
//		if (event instanceof ActivityNodeEntryEvent) {
//			ActivityNodeEntryEvent activityNodeEntryEvent = (ActivityNodeEntryEvent) event;
//			System.out.println("Node entry: "  + activityNodeEntryEvent.getNode().qualifiedName);
//		}
//		if (event instanceof ActivityEntryEvent) {
//			ActivityEntryEvent activityEntryEvent = (ActivityEntryEvent) event;
//			System.out.println("Activity entry: " + activityEntryEvent.getActivity().name);
//		}
	}
	
	public int getRootExecutionID() {
		for (Event event : events) {
			if (event instanceof ActivityEntryEvent)
				return ((ActivityEntryEvent)event).getActivityExecutionID();
		}
		return -1;
	}
	
	public boolean executionFinished() {
		Event lastEvent = getLastEvent();
		if(lastEvent instanceof ActivityExitEvent) {
			ActivityExitEvent activityExitEvent = (ActivityExitEvent) lastEvent;
			boolean isRootExecutionID = (activityExitEvent.getActivityExecutionID() == getRootExecutionID());
			return isRootExecutionID;
		}
		return false;
	}
	
	private Event getLastEvent() {
		int eventListSize = events.size();
		if (eventListSize > 0) {
			return events.get(events.size() - 1);
		}
		return null;
	}
}

/*
 * Copyright 2014 ICCS/NTUA
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.artist.migration.pt.cotroller;

public abstract class Controller {
	protected PidstatHandler ph; 
	protected TSharkHandler th;
	protected String workspace;
	
	public void startPidstat(){
		ph.commandStarter();
	}
	
	public void startTShark(){
		th.commandStarter();
	}

	public void stopPidstat(){
		ph.commandStopper();
	}
	
	public void stopTShark(){
		th.commandStopper();
	}
		
}

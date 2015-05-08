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
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *
 */

package eu.artist.migration.pt.cotroller;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import eu.artist.migration.pt.executor.*;
import eu.artist.migration.pt.results.*;
import eu.artist.migration.pt.results.AsyncCallback.BoolCallback;


public class PidstatHandler implements MonitoringCommandHandler{
	
	protected UserInfo info;
	protected SystemCommandExecutor commandExecutor;
	protected String whatAmImonitoring;
	
	public PidstatHandler() {
		try{
			info= new UserInfo();
			this.whatAmImonitoring="";
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void setResultHeading(String whatAmImonitoring){
		this.whatAmImonitoring=whatAmImonitoring;
	}
	
	public void commandStarter(){
		commandExecutor=new SystemCommandExecutor(Arrays.asList("sudo", "-S", "pidstat", "-udrw", "-p", info.pid, "1"), info.pass);
		
		commandExecutor.start();
		System.out.println("pidstat executing..");
	}
	
	public void commandStopper(){
		try {
			UnixProcessUtils.killUnixProcess(commandExecutor.getProcess(), info.pass);
			commandExecutor.getProcess().waitFor();
			
			StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
			//StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();
			
			commandExecutor.interrupt();
			commandExecutor.join();
			ReadPidstatOutput out = new ReadPidstatOutput(stdout);
			
			//System.out.println(commandExecutor.commandInformation+": "+stderr.toString());
			new Write(out.getStringBuilderAv(), info.resultFile, info.isOverwrite() , whatAmImonitoring);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/*
	 * pid: process id of process to be monitored
	 * pass: sudo password for physical host
	 * resultFile: file to write the results to (contains path)
	 * overwrite: boolean to show whether to overwrite the output file if exists
	 */
	
	public class UserInfo{
		private String pid;
		private String pass;
		private String resultFile;
		private boolean overwrite;
		private boolean proceed;
		
		public UserInfo(){
		};
		
		public boolean checkWorkspace(String workspace){
			System.out.println("Pidstat: Checking workspace: "+workspace);
			if (new File(workspace).isDirectory()){
				return true;
			}
			else{
				System.out.println("Invalid workspace! Exiting...");
				System.exit(0);
				return false;
			}
		}
		private BoolCallback callback = new BoolCallback(){

	        public void processResult(boolean callBackBool) {
	            proceed=callBackBool;
	        }
	    };
		
		public String getResultFile() {
			return resultFile;
		}

		public boolean isOverwrite() {
			return overwrite;
		}

		public void setOverwrite(boolean overwrite) {
			this.overwrite = overwrite;
		}

		public void setResultFile(String path) {
			if (checkWorkspace(path)) this.resultFile = path+"Pidstat.txt";
		}
		
		public String getPid() {
			return pid;
		}
		
		public void setPid(String pid) {
			try {
				SystemCommandExecutor commandExecutor = new SystemCommandExecutor(Arrays.asList("ps", "aux"), "",this.callback);
				commandExecutor.start();
				while (true){
					if (proceed) break;
					TimeUnit.MILLISECONDS.sleep(100);
				}
				StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
				commandExecutor.join();
				if (!stdout.toString().contains(pid)){
					System.out.println("Wrong Process ID! Exiting...");
					System.exit(0);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (NullPointerException e){
				System.out.println("Wrong Process ID! Exiting...");
				System.exit(0);
			}
			this.pid = pid;
		}
		
		
		public String getPass() {
			return pass;
		}
		
		
		public void setPass(String pass) {
			this.pass = pass;
		}
	}
	
	public void setInfo(String pid, String pass, String path, boolean overwrite){
		info.setOverwrite(overwrite);
		info.setPass(pass);
		info.setResultFile(path);
		info.setPid(pid);
	}
	
}

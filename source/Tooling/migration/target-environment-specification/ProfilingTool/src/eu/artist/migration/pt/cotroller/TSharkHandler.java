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

import java.io.File;
import java.util.Arrays;

import eu.artist.migration.pt.executor.*;



public class TSharkHandler implements MonitoringCommandHandler{
	
	protected UserInfo info;
	protected SystemCommandExecutor commandExecutorSrc;
	protected SystemCommandExecutor commandExecutorDest;
	protected String whatAmImonitoring;
	protected boolean commandExecuting;	
	public TSharkHandler() {
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
		commandExecutorSrc = new SystemCommandExecutor(Arrays.asList("sudo", "-S", "tshark", "-f", "ip and (src net "+info.getIp()+")" ,"-i", info.getEth(), "-w", "/tmp/"+info.getOutFileNameForSource()+whatAmImonitoring+".cap"), info.pass);
		commandExecutorDest = new SystemCommandExecutor(Arrays.asList("sudo", "-S", "tshark", "-f", "ip and (dst net "+info.getIp()+")","-i", info.getEth(), "-w", "/tmp/"+info.getOutFileNameForDest()+whatAmImonitoring+".cap"), info.pass);
		
		commandExecutorSrc.start();
		commandExecutorDest.start();
		System.out.println("tshark executing..");
	}
	
	public void commandStopper(){
		try {
			UnixProcessUtils.killUnixProcess(commandExecutorSrc.getProcess(), info.pass);
			UnixProcessUtils.killUnixProcess(commandExecutorDest.getProcess(), info.pass);
			
			commandExecutorSrc.getProcess().waitFor();
			commandExecutorDest.getProcess().waitFor();
			
			//standard error capturing
			//StringBuilder stderrS = commandExecutorSrc.getStandardErrorFromCommand();
			//StringBuilder stderrD = commandExecutorDest.getStandardErrorFromCommand();
			
			commandExecutorSrc.interrupt();
			commandExecutorDest.interrupt();
			commandExecutorSrc.join();
			commandExecutorDest.join();
			commandExecuting=false;
			
			//standard error printing
			//System.out.println(commandExecutorSrc.commandInformation+": "+stderrS.toString());
			//System.out.println(commandExecutorDest.commandInformation+": "+stderrD.toString());

			commandExecutorSrc=new SystemCommandExecutor(Arrays.asList("sudo", "-S", "cp", "/tmp/"+info.getOutFileNameForSource()+whatAmImonitoring+".cap", info.workspace+"tmp/"+info.getOutFileNameForSource()+whatAmImonitoring+".cap"), info.getPass());
			commandExecutorSrc.start();
			commandExecutorDest= new SystemCommandExecutor(Arrays.asList("sudo", "-S", "cp", "/tmp/"+info.getOutFileNameForDest()+whatAmImonitoring+".cap", info.workspace+"tmp/"+info.getOutFileNameForDest()+whatAmImonitoring+".cap"), info.pass);
			commandExecutorDest.start();
			commandExecutorSrc.join();
			commandExecutorDest.join();
			commandExecutorSrc=new SystemCommandExecutor(Arrays.asList("sudo", "-S", "rm", "/tmp/"+info.getOutFileNameForSource()+whatAmImonitoring+".cap"), info.getPass());
			commandExecutorSrc.start();
			commandExecutorDest= new SystemCommandExecutor(Arrays.asList("sudo", "-S", "rm", "/tmp/"+info.getOutFileNameForDest()+whatAmImonitoring+".cap"), info.pass);
			commandExecutorDest.start();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/*
	 * ip: IP to monitor
	 * eth: ethernet card to capture traffic on
	 * pass: password for sudo commands (for physical  host)
	 * outFileNameForSource: name to write tshark src results (without workload identifier)
	 * outFileNameForDest:  name to write tshark dest results (without workload identifier)
	 * workspace: the tool's  workspace
	 */
	
	public class UserInfo{
		private String ip;
		private String eth;
		private String pass;
		private String outFileNameForSource;
		private String outFileNameForDest;
		private String workspace;
		
		public boolean checkWorkspace(String workspace){
			System.out.println("TShark: Checking workspace: "+workspace);
			if (new File(workspace).isDirectory()){
				return true;
			}
			else{
				System.out.println("Invalid workspace! Exiting...");
				System.exit(0);
				return false;
			}
		}
		
		public String getWorkspace() {
			return workspace;
		}

		public void setWorkspace(String workspace) {
			if (checkWorkspace(workspace)) this.workspace = workspace;
		}

		private boolean overwrite;
		
		public UserInfo(){
		};
		
		public String getOutFileNameForSource() {
			return outFileNameForSource;
		}

		public String getOutFileNameForDest() {
			return outFileNameForDest;
		}
		
		public boolean isOverwrite() {
			return overwrite;
		}

		public void setOverwrite(boolean overwrite) {
			this.overwrite = overwrite;
		}

		public void setOutFileNameForSource(String pathSrc) {
			this.outFileNameForSource = pathSrc;
		}
		
		public void setOutFileNameForDest(String pathDest) {
			this.outFileNameForDest = pathDest;
		}
		
		public String getIp() {
			return ip;
		}
		public void setIp(String ip) {
			this.ip = ip;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		
		public String getEth() {
			return eth;
		}

		public void setEth(String eth) {
			this.eth = eth;
		}
	}
	
	public void setInfo(String workspace, String ip, String eth, String pass, String pathSrc, String pathDest, boolean overwrite){
		info.setWorkspace(workspace);
		info.setOverwrite(overwrite);
		info.setPass(pass);
		info.setOutFileNameForSource(pathSrc);
		info.setOutFileNameForDest(pathDest);
		info.setIp(ip);
		info.setEth(eth);
	}
	
}

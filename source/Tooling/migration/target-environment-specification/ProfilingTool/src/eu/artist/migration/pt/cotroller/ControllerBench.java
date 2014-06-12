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

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;

import eu.artist.migration.pt.executor.SecureSSHCommandExecutor;
import eu.artist.migration.pt.results.TSharkCapFiles;
import eu.artist.migration.pt.user.CompleteInputForm;

public class ControllerBench extends Controller{
	
	/*
	 * command: ssh command
	 * VMip: IP of the VM to connect to 
	 * VMpass: sudo password for the VM to connect to
	 * VMuser: user to get connected
	 * benchmark commands file: the file where benchmark commands are (absolute path)
	 * workloadCount: workload identifier for a specific benchmark
	 */
	private String command;
	private String VMip;
	private String VMpass;
	private String VMuser;
	private String VMpassForSudo;
	private String benchmarkCommandsFile;
	private int workloadCount;
	
	
	public static void main(String args[]){
		new ControllerBench();	
		}
	
	public ControllerBench(String file){
		ph= new PidstatHandler();
		th= new TSharkHandler();
		workloadCount=0;
		getInfoFromUser(file);
		ph.info.setOverwrite(false);
		th.info.setOverwrite(true);
		execute();
	}
	
	public ControllerBench(){
		ph= new PidstatHandler();
		th= new TSharkHandler();
		workloadCount=0;
		getInfoFromUser();
		ph.info.setOverwrite(false);
		th.info.setOverwrite(true);
		execute();		
	}
	
	private void execute(){
		while (true){
			command = getBenchmarkExecutionCommand();
			ph.setResultHeading(Integer.toString(workloadCount));
			th.setResultHeading(Integer.toString(workloadCount));
			if (command.equals("")) break;
			System.out.println("executing command: "+command);
			SecureSSHCommandExecutor benchExec =new SecureSSHCommandExecutor(VMuser, VMip, VMpass, VMpassForSudo, command);
			benchExec.start();
			startPidstat();
			startTShark();
			try{
				benchExec.join();
			}catch (Exception e){
				e.printStackTrace();
			}
			stopPidstat();
			stopTShark();
			workloadCount ++;
		}
		System.out.println("No more workloads to execute");
		new TSharkCapFiles(th.info.getOutFileNameForSource(), th.info.getOutFileNameForDest(), workloadCount, workspace, th.info.getPass());
		/*for (int i=0; i<workloadCount;  i++){
			removeSystemCommandExecutor commandExecutorSrc=new SystemCommandExecutor(Arrays.asList("sudo", "-S", "rm", th.info.getWorkspace()+"tmp/"+th.info.getOutFileNameForSource()+Integer.toString(i)+".cap"), th.info.getPass());
			commandExecutorSrc.start();
			SystemCommandExecutor commandExecutorDest= new SystemCommandExecutor(Arrays.asList("sudo", "-S", "rm", th.info.getWorkspace()+"tmp/"+th.info.getOutFileNameForDest()+Integer.toString(i)+".cap"), th.info.getPass());
			commandExecutorDest.start();

		}*/
	}
	
	private String getBenchmarkExecutionCommand(){
		String line="";	
		try{
			BufferedReader in = new BufferedReader(new FileReader(benchmarkCommandsFile));
			int i;
			for (i=0; i<=workloadCount; i++){
				line = in.readLine();
			}
			in.close(); 
			if (line==null) line="";
				
		}catch (Exception e){
			e.printStackTrace();
		}
			return line;
	}
	
	private void getInfoFromUser(){
		CompleteInputForm cf = new CompleteInputForm();
		cf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		cf.setSize( 380, 700 ); // set frame size
		cf.setMinimumSize(new Dimension(380, 700));
		cf.setMaximumSize(new Dimension(380, 700));
		cf.setVisible( true );
		while(!cf.gotTheResults()){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ArrayList<String> valuesP = cf.getPidstatPanel().getValues();
		ArrayList<String> valuesT = cf.getTsharkPanel().getValues();
		ArrayList<String> valuesB = cf.getBenchmarkPanel().getValues();
		
		workspace= cf.getWorkspace();
		if (!workspace.substring(workspace.length()-1).equals("/")) workspace=workspace+"/";
		ph.setInfo(valuesP.get(0), valuesP.get(1), workspace, false);
		th.setInfo(workspace,valuesT.get(0), valuesT.get(1), valuesT.get(2), "tsharkSrc", "tsharkDst", true);
		
		VMip=valuesB.get(0);
		VMuser = valuesB.get(1);
		benchmarkCommandsFile = valuesB.get(2);
		VMpass=valuesB.get(3);
		VMpassForSudo=valuesB.get(4);
		
		cf.dispose();
	}
	
	private void getInfoFromUser(String file){
		try{
			BufferedReader bufferedReader;
			bufferedReader = new BufferedReader(new FileReader(file));
			
			String line;
			ArrayList<String> valuesP = new ArrayList<String>();
			ArrayList<String> valuesT = new ArrayList<String>();
			ArrayList<String> valuesB = new ArrayList<String>();
			
			if ((line=bufferedReader.readLine())!=null){
				workspace=line;
				if (!workspace.substring(workspace.length()-1).equals("/")) workspace=workspace+"/";
			}
			else {
				bufferedReader.close();
				throw new Exception("Wrong number of arguments in file");
			}
			
			if ((line=bufferedReader.readLine())!=null){
				valuesP=new ArrayList<String>(Arrays.asList(line.split(",")));
				int i=valuesP.size();
				if (i!=2){
					bufferedReader.close();
					throw new Exception("Wrong number of arguments for Pidstat");
				}
			}else {
				bufferedReader.close();
				throw new Exception("Wrong number of arguments in file");
			}
			
			if ((line=bufferedReader.readLine())!=null){
				valuesT=new ArrayList<String>(Arrays.asList(line.split(",")));
				int i=valuesT.size();
				if (i!=3){
					bufferedReader.close();
					throw new Exception("Wrong number of arguments for TShark");
				}
			}else{
				bufferedReader.close();
				throw new Exception("Wrong number of arguments in file");
			}
			
			if ((line=bufferedReader.readLine())!=null){
				valuesB=new ArrayList<String>(Arrays.asList(line.split(",")));
				int i=valuesB.size();
				if (i!=5){
					bufferedReader.close();
					throw new Exception("Wrong number of arguments for Benchmarks");
				}
			}else{
				bufferedReader.close();
				throw new Exception("Wrong number of arguments in file");
			}
			
			ph.setInfo(valuesP.get(0), valuesP.get(1), workspace, false);
			th.setInfo(workspace,valuesT.get(0), valuesT.get(1), valuesT.get(2), "tsharkSrc", "tsharkDst", true);
			VMip=valuesB.get(0);
			VMuser = valuesB.get(1);
			benchmarkCommandsFile = valuesB.get(2);
			VMpass=valuesB.get(3);
			VMpassForSudo=valuesB.get(4);
			bufferedReader.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e){
			System.out.println(e);
			System.exit(0);
		}
	}
	

}

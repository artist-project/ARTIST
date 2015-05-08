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

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;

import eu.artist.migration.pt.results.TSharkCapFiles;
import eu.artist.migration.pt.user.*;

public class ControllerUserApp extends Controller{
	
	private StartStopFrame startStop; 
	
	public static void main(String args[]){
		new ControllerUserApp();
	}
	
	public ControllerUserApp(){
		ph = new PidstatHandler();
		th = new TSharkHandler();

		getInfoFromUser();
		ph.info.setOverwrite(false);
		th.info.setOverwrite(true);
		startStop = new StartStopFrame(this);
		startStop.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		startStop.setSize( 350, 250 ); // set frame size
		startStop.setVisible(true ); 
	}
	
	public ControllerUserApp(String file){
		ph = new PidstatHandler();
		th = new TSharkHandler();
		getInfoFromUser(file);
		ph.info.setOverwrite(false);
		th.info.setOverwrite(true);
		startStop = new StartStopFrame(this);
		startStop.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		startStop.setSize( 350, 250 ); // set frame size
		startStop.setVisible(true ); 
	}
	
	private void getInfoFromUser(){
		MonitorInputForm cf = new MonitorInputForm();
		cf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		cf.setSize( 400, 450 ); // set frame size
		cf.setMinimumSize(new Dimension(400, 450));
		cf.setMaximumSize(new Dimension(400, 450));
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
		workspace=cf.getWorkspace();
		if (!workspace.substring(workspace.length()-1).equals("/")) workspace=workspace+"/";
		ph.setInfo(valuesP.get(0), valuesP.get(1), workspace, false);
		th.setInfo(workspace, valuesT.get(0), valuesT.get(1), valuesT.get(2), "tsharkSrc", "tsharkDst", true);
		cf.dispose();
	}
	
	private void getInfoFromUser(String file){
		try{
			BufferedReader bufferedReader;
			bufferedReader = new BufferedReader(new FileReader(file));
			
			String line;
			ArrayList<String> valuesP = new ArrayList<String>();
			ArrayList<String> valuesT = new ArrayList<String>();
			
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
			
			ph.setInfo(valuesP.get(0), valuesP.get(1), workspace, false);
			th.setInfo(workspace,valuesT.get(0), valuesT.get(1), valuesT.get(2), "tsharkSrc", "tsharkDst", true);
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
	
	public void processCapFiles(){
		new TSharkCapFiles(th.info.getOutFileNameForSource(), th.info.getOutFileNameForDest(), workspace, th.info.getPass());
	//	SystemCommandExecutor commandExecutorSrc=new SystemCommandExecutor(Arrays.asList("sudo", "-S", "rm", th.info.getWorkspace()+"tmp/"+th.info.getOutFileNameForSource()+".cap"), th.info.getPass());
	//	commandExecutorSrc.start();
	//	SystemCommandExecutor commandExecutorDest= new SystemCommandExecutor(Arrays.asList("sudo", "-S", "rm", th.info.getWorkspace()+"tmp/"+th.info.getOutFileNameForDest()+".cap"), th.info.getPass());
	//	commandExecutorDest.start();

	}
	
}

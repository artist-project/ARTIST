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

package eu.artist.migration.pt.user;

import java.awt.Panel;
import java.io.File;

public class CompleteInputForm extends MonitorInputForm{
	
	private static final long serialVersionUID = 1L;

	private BenchmarkPanel benchmarkPanel;

	public static void main(String[] args){
		CompleteInputForm cf =new CompleteInputForm();
		cf.setVisible(true);
	}

	public CompleteInputForm(){
		super();
	}
	
	public void addPanels(){
		super.addPanels();
		benchmarkPanel=new BenchmarkPanel();
		add(benchmarkPanel, Panel.CENTER_ALIGNMENT);
	}
	
	public boolean checkCommandsFile(){
		System.out.println("checking input file");
		if ((new File(benchmarkPanel.inputFile.getText()).exists())){
			return true;
		}
		else{
			System.out.println("Please enter an existing input file!");
			return false;
		}
	}
	
	public void checkValues(){
		if (pidstatPanel.allValuesCompleted() && tsharkPanel.allValuesCompleted() && benchmarkPanel.allValuesCompleted()){
			if (checkWorkspace() && checkCommandsFile()){ gotTheResults=true;}
		}
		else System.out.println("You have to fill all fields");
	}
	
	public BenchmarkPanel getBenchmarkPanel() {
		return benchmarkPanel;
	}
}

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

package eu.artist.migration.pt.user;

import javax.swing.*;

import eu.artist.migration.pt.cotroller.*;

import java.awt.*;
import java.awt.event.*;

public class StartStopFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton startButton;
	private JButton stopButton;
	private ControllerUserApp controller;
	
	/*public static void main(String[] args){
		StartStopFrame sf = new StartStopFrame();
		sf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		sf.setSize( 350, 250 ); // set frame size
		sf.setVisible( true ); 
	}*/
	
	public StartStopFrame(ControllerUserApp controller){
		
		super("Profiling Tool");
		
		this.controller=controller;
		panel= new JPanel();
		GridLayout layout=new GridLayout(2,1);
		layout.setHgap(10);
		panel.setLayout(layout);
		
		startButton = new JButton("Start!");
		stopButton = new JButton("Stop!");
		
		startButton.setSize(new Dimension(50, 30));
		stopButton.setSize(new Dimension(50, 30));
		stopButton.setEnabled(false);
		
		panel.add(startButton);
		panel.add(stopButton);
		
		add(panel);
		
		startButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           start();
	           }          
	      });
		
		stopButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
		            stop();
		         }          
		      });
	}

	public void start(){
		controller.startPidstat();
		controller.startTShark();
		startButton.setEnabled(false);
		stopButton.setEnabled(true);
	}
	
	public void stop(){
		controller.stopPidstat();
		controller.stopTShark();
		this.dispose();
		controller.processCapFiles();
	}
	
}

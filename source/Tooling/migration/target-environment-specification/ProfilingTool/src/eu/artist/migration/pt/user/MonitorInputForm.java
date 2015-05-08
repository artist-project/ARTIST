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

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MonitorInputForm extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	protected PidstatPanel pidstatPanel;
	protected TSharkPanel tsharkPanel;
	protected JTextField workspacePathField;
	protected boolean gotTheResults;
	

	
	public static void main(String[] args){
		MonitorInputForm mi= new MonitorInputForm();
		mi.setVisible(true);
	}
	public MonitorInputForm(){
		super("Artist Profiling Tool");
		gotTheResults = false;
		
		FlowLayout frameLayout = new FlowLayout();
		frameLayout.setVgap(30);
		this.setLayout(frameLayout);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addPanels();
		addButton();
	}
	
	public void addPanels(){
		pidstatPanel = new PidstatPanel();
		tsharkPanel = new TSharkPanel();
		workspacePathField = new JTextField(18);
		workspacePathField.setPreferredSize(new Dimension(80, 20));
		
		JLabel workspaceLabel = new JLabel();
		workspaceLabel.setText("workspacePath");
		JPanel workspacePanel = new JPanel();
		FlowLayout eachRowLayout = new FlowLayout();
		workspacePanel.setLayout(eachRowLayout);
		
		workspacePanel.add(workspaceLabel);
		workspacePanel.add(workspacePathField);

		add(workspacePanel);
		add(pidstatPanel);
		add(tsharkPanel);
	}
	
	public void addButton(){
		JButton button = new JButton("OK");
		JPanel buttonPanel = new JPanel(); 
		buttonPanel.setSize(150, 80);
		buttonPanel.setPreferredSize(new Dimension(150, 80));
		buttonPanel.add(button);
		add(buttonPanel, JPanel.BOTTOM_ALIGNMENT);
		button.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            checkValues(); 
	         }          
	      });
	}
	
	public void checkValues(){
		if (pidstatPanel.allValuesCompleted() && tsharkPanel.allValuesCompleted() && !(workspacePathField.getText().equals(""))){
			if (checkWorkspace()){ gotTheResults=true;}
		}
		else System.out.println("You have to fill all fields");
	}
	
	public boolean gotTheResults(){
		return gotTheResults;
	}
	public PidstatPanel getPidstatPanel() {
		return pidstatPanel;
	}

	public TSharkPanel getTsharkPanel() {
		return tsharkPanel;
	}
	
	public String getWorkspace(){
		return workspacePathField.getText();
	}
	
	public boolean checkWorkspace(){
		System.out.println("checking workspace");
		if (new File(workspacePathField.getText()).isDirectory()){
			return true;
		}
		else{
			System.out.println("Please enter a valid workspace!");
			return false;
		}
	}
	
}


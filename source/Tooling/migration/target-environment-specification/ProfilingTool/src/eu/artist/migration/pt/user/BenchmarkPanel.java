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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BenchmarkPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField vmIPField;
	public JTextField vmUserField;
	public JTextField inputFile;
	public JPasswordField passField;
	public JPasswordField passForSudoField;
	
	BenchmarkPanel(){
		super();
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(1, Color.gray, Color.lightGray), "Benchmark Info"));
		JLabel vmIPLabel;
		JLabel passLabel;
		JLabel passForSudoLabel;
		JLabel vmUserLabel;
		JLabel inputFileLabel;
	
		GridLayout textAreaPanelLayout = new GridLayout(0,1);
		FlowLayout eachRowLayout = new FlowLayout();
		
		//Configuring Layouts
		textAreaPanelLayout.setVgap(10);
		
		//Creation of Panels
		JPanel vmIPPanel = new JPanel();
		JPanel vmUserPanel = new JPanel();
		JPanel inputFilePanel = new JPanel();
		JPanel passPanel = new JPanel();
		JPanel passForSudoPanel = new JPanel();
		
		//Configuring Panels
		setLayout(textAreaPanelLayout);
		vmIPPanel.setLayout(eachRowLayout);
		vmUserPanel.setLayout(eachRowLayout);
		inputFilePanel.setLayout(eachRowLayout);
		passPanel.setLayout(eachRowLayout);
		passForSudoPanel.setLayout(eachRowLayout);
		
		//Creation of individual elements
		vmIPField= new JTextField(15);
		passField = new JPasswordField(15);
		passForSudoField = new JPasswordField(15);
		vmUserField = new JTextField(15);
		inputFile = new JTextField(15);
		vmIPLabel= new JLabel("VM IP", JLabel.CENTER);
		vmUserLabel= new JLabel("VM user", JLabel.CENTER);
		inputFileLabel= new JLabel("Input file", JLabel.CENTER);
		passLabel = new JLabel("password", JLabel.CENTER);
		passForSudoLabel = new JLabel("root password", JLabel.CENTER);
		
		//Configuring individual elements
		vmIPField.setPreferredSize(new Dimension(80, 20));
		vmUserField.setPreferredSize(new Dimension(80, 20));
		inputFile.setPreferredSize(new Dimension(80, 20));
		passField.setPreferredSize(new Dimension(80, 20));
		passForSudoField.setPreferredSize(new Dimension(80, 20));
		
		//Attaching elements  to panels
		vmIPPanel.add(vmIPLabel);
		vmIPPanel.add(vmIPField);
		vmUserPanel.add(vmUserLabel);
		vmUserPanel.add(vmUserField);
		inputFilePanel.add(inputFileLabel);
		inputFilePanel.add(inputFile);
		passPanel.add(passLabel);
		passPanel.add(passField);
		passForSudoPanel.add(passForSudoLabel);
		passForSudoPanel.add(passForSudoField);
		
		add(vmIPPanel);
		add(vmUserPanel);
		add(inputFilePanel);
		add(passPanel);
		add(passForSudoPanel);
	}
	
	public ArrayList<String> getValues(){
		
		String pass="";
		char[] passChars = passField.getPassword();
		for (int i=0; i<passChars.length; i++){
			pass=pass+Character.toString(passChars[i]);
		}
		String passForSudo="";
		char[] passForSudoChars = passForSudoField.getPassword();
		for (int i=0; i<passForSudoChars.length; i++){
			passForSudo=passForSudo+Character.toString(passForSudoChars[i]);
		}
		ArrayList<String> values = new ArrayList<String>();
		values.add(vmIPField.getText());
		values.add(vmUserField.getText());
		values.add(inputFile.getText());
		values.add(pass);
		values.add(passForSudo);
		return values;
	}
	
	public boolean allValuesCompleted(){
		if (!(inputFile.getText().equals("")) && !(vmIPField.getText().equals("")) && !(vmUserField.getText().equals("")) && !(passField.getPassword().length==0) && !(passForSudoField.getPassword().length==0)){
			return true;
		}else return false;
	}


}

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

public class TSharkPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public JTextField IPField;
	public JTextField ethField;
	public JPasswordField passField;
	
	TSharkPanel(){
		super();
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(1, Color.gray, Color.lightGray), "TShark Info"));
		
		JLabel IPLabel;
		JLabel ethLabel;
		JLabel passLabel;
		
		GridLayout textAreaPanelLayout = new GridLayout(0,1);
		FlowLayout eachRowLayout = new FlowLayout();
	
		textAreaPanelLayout.setVgap(10);
		eachRowLayout.setHgap(20);
		
		JPanel IPPanel = new JPanel();
		JPanel ethPanel = new JPanel();
		JPanel passPanel = new JPanel();
		
		//Configuring Panels
		setLayout(textAreaPanelLayout);
		IPPanel.setLayout(eachRowLayout);
		ethPanel.setLayout(eachRowLayout);
		passPanel.setLayout(eachRowLayout);
		
		//Creation of individual elements
		IPField= new JTextField(15);
		ethField= new JTextField(10);
		passField = new JPasswordField(15);
		IPLabel= new JLabel("IP to monitor", JLabel.CENTER);
		ethLabel= new JLabel("Ethernet card to monitor", JLabel.CENTER);
		passLabel = new JLabel("password", JLabel.CENTER);
		
		//Configuring individual elements
		IPField.setPreferredSize(new Dimension(80, 20));
		ethField.setPreferredSize(new Dimension(80, 20));
		passField.setPreferredSize(new Dimension(80, 20));
		
		//Attaching elements  to panels
		IPPanel.add(IPLabel);
		IPPanel.add(IPField);
		ethPanel.add(ethLabel);
		ethPanel.add(ethField);
		passPanel.add(passLabel);
		passPanel.add(passField);
	
		add(IPPanel);
		add(ethPanel);
		add(passPanel);
	}
	
	public ArrayList<String> getValues(){
		
		String pass="";
		char[] passChars = passField.getPassword();
		for (int i=0; i<passChars.length; i++){
			pass=pass+Character.toString(passChars[i]);
		}
		ArrayList<String> values = new ArrayList<String>();
		values.add(IPField.getText());
		values.add(ethField.getText());
		values.add(pass);
		return values;
	}
	
	public boolean allValuesCompleted(){
		if (!(IPField.getText().equals("")) && !(ethField.getText().equals("")) && !(passField.getPassword().length==0)){
			return true;
		}else return false;
	}

}

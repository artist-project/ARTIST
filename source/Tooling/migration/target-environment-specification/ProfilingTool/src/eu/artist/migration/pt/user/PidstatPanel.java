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

public class PidstatPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public JTextField PIDField;
	public JPasswordField passField;
	
	public PidstatPanel(){
		super();
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(1, Color.gray, Color.lightGray), "Pidstat Info"));
		JPanel PIDPanel = new JPanel();
		JPanel passPanel = new JPanel();
		GridLayout textAreaPanelLayout = new GridLayout(0,1);
		FlowLayout eachRowLayout = new FlowLayout();
		//Configuring Layouts
		textAreaPanelLayout.setVgap(10);

		
		setLayout(textAreaPanelLayout);
		PIDPanel.setLayout(eachRowLayout);
		passPanel.setLayout(eachRowLayout);
		
		PIDField= new JTextField(15);
		passField = new JPasswordField(15);
		JLabel PIDLabel= new JLabel("Process ID", JLabel.CENTER);
		JLabel passLabel = new JLabel("password", JLabel.CENTER);
		
		
		//Configuring individual elements
		PIDField.setPreferredSize(new Dimension(80,20));
		passField.setPreferredSize(new Dimension(80, 20));
		
		//Attaching elements  to panels
		PIDPanel.add(PIDLabel);
		PIDPanel.add(PIDField);
		passPanel.add(passLabel);
		passPanel.add(passField);
		
		add(PIDPanel);
		add(passPanel);
	}
	
	public ArrayList<String> getValues(){
		String pass="";
		char[] passChars = passField.getPassword();
		for (int i=0; i<passChars.length; i++){
			pass=pass+Character.toString(passChars[i]);
		}
		ArrayList<String> values = new ArrayList<String>();
		values.add(PIDField.getText());
		values.add(pass);
		return values;
	}
	
	public boolean allValuesCompleted(){
		if (!(PIDField.getText().equals("")) && !(passField.getPassword().length==0)){
			return true;
		}else return false;
	}

}

/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;

import eu.artist.premigration.tft.tft.model.migrationstrategy.Category;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategies;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;

public class MainTest {
	
	

	public static void main(String[] args) {
		
		InputStream input;
		try {
			input = MigrationStrategy.class.getResourceAsStream("MigrationStrategies.xml");
			MigrationStrategies strategies = (MigrationStrategies) JAXBContext.newInstance(MigrationStrategies.class).createUnmarshaller().unmarshal(input);
			System.out.println(strategies.getMigrationStrategies().get(0).getCategory());
			
			List<TestObject> list1 = new ArrayList<TestObject>();
			list1.add(new TestObject("first", "second"));
			list1.add(new TestObject("third", "forth"));
			
			List<TestObject> list2 = new ArrayList<TestObject>(list1);
			
			list1.remove(0);
			
			System.out.println(list1.get(0).getA());
			System.out.println(list2.get(0).getA());
			
			System.out.println(Category.DATA.name());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		
	
	
	}
	
}


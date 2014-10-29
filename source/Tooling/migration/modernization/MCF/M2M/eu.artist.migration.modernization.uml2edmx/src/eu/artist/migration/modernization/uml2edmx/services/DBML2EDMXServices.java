/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 *******************************************************************************/

package eu.artist.migration.modernization.uml2edmx.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

public class DBML2EDMXServices {

	public boolean hasStereotype(Class clazz, String stereotypeName) {
		List<Stereotype> stereotypes = clazz.getAppliedStereotypes();
		for (Stereotype stereotype : stereotypes) {
			if (stereotype.getName().equals(stereotypeName)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isNullable(Property p) {
		Stereotype stereotype = p.getAppliedStereotype("Profile::DBColumn");
		if(stereotype != null) {
			return (Boolean)p.getValue(stereotype, "CanBeNull");
		}
		return true;
	}
	
	public String generateDBType(Property p, String option) {
		
		String DBType = p.getValue(p.getAppliedStereotype("Profile::DBColumn"), "DbType").toString();
		
		Pattern pattern = Pattern.compile("(\\w+)(\\(\\w+\\))?(.*)");
		
		Matcher matcher = pattern.matcher(DBType);
		
		Map<String, String> db2dbMap = new HashMap<String, String>();
		db2dbMap.put("VarChar", "varchar");
		db2dbMap.put("UniqueIdentifier", "uniqueidentifier");
		db2dbMap.put("Xml", "xml");
		db2dbMap.put("NVarChar", "nvarchar");
		db2dbMap.put("DateTime", "datetime");
		db2dbMap.put("Float", "float");
		db2dbMap.put("rowversion", "timestamp");
		db2dbMap.put("BigInt", "bigint");
		db2dbMap.put("VarBinary", "varbinary");
		db2dbMap.put("Bit", "bit");
		
		matcher.matches();
		
		String typeMatch = matcher.group(1);
		String sizeString = matcher.group(2);
		
		String result = "Type=\"" + db2dbMap.get(typeMatch) + "\"";
		if(typeMatch.equals("VarChar")) {
			result += " MaxLength=\"" + sizeString.substring(1, sizeString.length()-1) + "\"";
		}
		else if(typeMatch.equals("NVarChar")) {
			result += " MaxLength=\"" + sizeString.substring(1, sizeString.length()-1) + "\"";
		}
		else if(typeMatch.equals("rowversion")) {
			result += " StoreGeneratedPattern=\"Computed\"";
		}
		else if(typeMatch.equals("VarBinary")) {
			String type = db2dbMap.get(typeMatch) + sizeString;
			result = " Type=\"" + type + "\"";
		}
		else {
			
		}
		
		return result;
	}
	
	public String generateCLRType(Property property, String option) {
		
		String DBType = (String)property.getValue(property.getAppliedStereotype("Profile::DBColumn"), "DbType");
		
		Pattern pattern = Pattern.compile("(\\w+)(\\(\\w+\\))?(.*)");
		
		Matcher matcher = pattern.matcher(DBType);
		
		Map<String, String> db2clrMap = new HashMap<String, String>();
		db2clrMap.put("VarChar", "String");
		db2clrMap.put("UniqueIdentifier", "Guid");
		db2clrMap.put("Xml", "String");
		db2clrMap.put("NVarChar", "String");
		db2clrMap.put("DateTime", "DateTime");
		db2clrMap.put("Float", "Double");
		db2clrMap.put("rowversion", "Binary");
		db2clrMap.put("BigInt", "Int64");
		db2clrMap.put("VarBinary", "Binary");
		db2clrMap.put("Bit", "Boolean");
		
		matcher.matches();
		
		String typeMatch = matcher.group(1);
		String sizeString = matcher.group(2);
		
		String result = "Type=\"" + db2clrMap.get(typeMatch) + "\"";
		if(typeMatch.equals("VarChar")) {
			result += " MaxLength=\"" + sizeString.substring(1, sizeString.length()-1) + "\"";
			result += " FixedLength=\"false\"";
			result += " Unicode=\"false\"";
		}
		else if(typeMatch.equals("Xml")) {
			result += " MaxLength=\"Max\"";
			result += " FixedLength=\"false\"";
			result += " Unicode=\"true\"";
		}
		else if(typeMatch.equals("NVarChar")) {
			result += " MaxLength=\"" + sizeString.substring(1, sizeString.length()-1) + "\"";
			result += " FixedLength=\"false\"";
			result += " Unicode=\"true\"";
		}
		else if(typeMatch.equals("DateTime")) {
			result += " Precision=\"3\"";
		}
		else if(typeMatch.equals("rowversion")) {
			result += " FixedLength=\"true\"";
			result += " annotation:StoreGeneratedPattern=\"Computed\"";
		}
		else {
			
		}
		
		return result;
	}
}

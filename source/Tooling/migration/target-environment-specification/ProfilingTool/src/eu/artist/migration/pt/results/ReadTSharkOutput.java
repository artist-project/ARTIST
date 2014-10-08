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

package eu.artist.migration.pt.results;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class ReadTSharkOutput {
	
	/*
	 * workloadIdentifier: the identifier of a workload for a specific benchmark to be printed above results   
	 * sb: Stringbuilder containing the output of Tshark 
	 * outFile: String containing the name of the file to write the results (containing full path)
	*/
	
	public ReadTSharkOutput(String workloadIdentifier,StringBuilder sb, String outFile){
		BufferedReader bufferedReader =  new BufferedReader ( new StringReader(sb.toString()));
		filterAndPrint(workloadIdentifier, bufferedReader, outFile);
		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * workloadIdentifier: the identifier of a workload for a specific benchmark to be printed above results
	 * file: file containing the output of Tshark (contains the absolute path to file)
	 * outFile: String containing the name of the file to write the results (only the file name-without path)
	*/
	
	public ReadTSharkOutput(String workloadIdentifier, String file, String outFile){
			try {
				BufferedReader bufferedReader;
				bufferedReader = new BufferedReader(new FileReader(file));
				filterAndPrint(workloadIdentifier, bufferedReader, outFile);
				bufferedReader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	
	public void filterAndPrint(String file,BufferedReader bufferedReader, String outFile){
		try{
		String line;
		ArrayList<String> list;
		list=new ArrayList<String>();
		
		while ((line = bufferedReader.readLine()) != null)
		{
			if (line.contains("Number")){
				line=line.substring(21);
				list.add(line);
			}
			else if (line.contains("byte") && line.contains("rate")){
				line=line.substring(21);
				String[] mline=line.split(" ");
				line=mline[0];
				list.add(line);
			}
			else if (line.contains("verage") && line.contains("rate")){
				line=line.substring(21);
				String[] mline=line.split(" ");
				line=mline[0];
				list.add(line);
			}
			else if (line.contains("verage") && line.contains("size")){
				line=line.substring(21);
				String[] mline=line.split(" ");
				line=mline[0];
				list.add(line);
			}
		}
		bufferedReader.close();
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<list.size(); i++){
			sb.append(list.get(i)+"\t");
		}
		String[] listf=file.split("\\.");
		new Write(sb, outFile, false, listf[0]);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
}

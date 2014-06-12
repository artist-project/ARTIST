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

package eu.artist.migration.pt.results;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;


public class ReadPidstatOutput {
	private StringBuilder stbav;
	private StringBuilder stbnorm;
	
	public ReadPidstatOutput(StringBuilder stdout) throws IOException{
		String line = null;
		int countav=0;
		int countnorm=0;
		boolean nextLineIsInteresting=false;
		
		BufferedReader bufferedReader =  new BufferedReader ( new StringReader(stdout.toString()));
		stbav= new StringBuilder();
		stbnorm= new StringBuilder();
		
		while ((line = bufferedReader.readLine()) != null)
		{
			if (line.contains("Average")){
				if (line.contains("PID")){
					nextLineIsInteresting=true;
				}
				else if (nextLineIsInteresting){
					countav++;
					if (countav==1) line=parseFirstLine("<"+line.replaceAll("\\s+", "<"));
					else if (countav==2) line=parseSecondLine("<"+line.replaceAll("\\s+", "<"));
					else if (countav==3) line=parseThirdLine("<"+line.replaceAll("\\s+", "<"));
					else {
						line=parseFourthLine(","+line.replaceAll("\\s+", "<"));
					}
					stbav.append(line);
					if (countav==4){
						stbav.append("\n");
						countav=0;
					}
					nextLineIsInteresting=false;
				}
				else nextLineIsInteresting=false;
			}
			else{
				if (line.contains("PID")) nextLineIsInteresting=true;
				else if (nextLineIsInteresting){
					countnorm++;
					if (countnorm==1) line=parseFirstLine(line.replaceAll("\\s+", "<"));
					else if (countnorm==2) line=parseSecondLine(line.replaceAll("\\s+", "<"));
					else if (countnorm==3) line=parseThirdLine(line.replaceAll("\\s+", "<"));
					else {
						line=parseFourthLine(line.replaceAll("\\s+", "<"));
					}
					stbnorm.append(line);
					if (countnorm==4){
						stbnorm.append("\n");
						countnorm=0;
					}
					nextLineIsInteresting=false;
				}
				else nextLineIsInteresting=false;
			}
		}
	}
	
	private String parseFirstLine(String line){
		List<String> valueList = Arrays.asList(line.split("<"));
		line = valueList.get(4)+"\t"+valueList.get(5)+"\t"+valueList.get(6)+"\t"+valueList.get(7)+"\t"+valueList.get(8);
		return line;
	}
	
	private String parseSecondLine(String line){
		List<String> valueList = Arrays.asList(line.split("<"));
		line = "\t"+valueList.get(4)+"\t"+valueList.get(5)+"\t"+valueList.get(6)+"\t"+valueList.get(7)+"\t"+valueList.get(8);
		return line;
	}

	private String parseThirdLine(String line){
		List<String> valueList = Arrays.asList(line.split("<"));
		line = "\t"+valueList.get(4)+"\t"+valueList.get(5)+"\t"+valueList.get(6);
		return line;
	}

	private String parseFourthLine(String line){
		List<String> valueList = Arrays.asList(line.split("<"));
		line = "\t"+valueList.get(3)+"\t"+valueList.get(4);
		return line;
	}
	
	public StringBuilder getStringBuilderAv(){
		return stbav;
	}
	
	public StringBuilder getStringBuilderNorm(){
		return stbnorm;
	}
}

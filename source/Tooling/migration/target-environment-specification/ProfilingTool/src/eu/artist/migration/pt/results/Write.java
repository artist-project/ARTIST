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

import java.io.*;

public class Write {

	private String fileName = null;
	private StringBuilder result;
	private boolean overwrite;
	private String resultHeading;
	
	/*
	 * result: StringBuilder containing what to write
	 * filename: String containing name of file
	 * overwrite: boolean indicating whether to overwrite an existing file
	 * resutltHeading: String to print above the actual data to be printed
	 */

	public Write(StringBuilder  result, String fileName, boolean overwrite){
		 
		this.overwrite=overwrite;
		this.result=result;
		this.fileName=fileName;
		this.resultHeading = "";
		write();
	}
	
	public Write (StringBuilder result, String fileName, boolean overwrite, String resultHeading){
		this.overwrite=overwrite;
		this.result=result;
		this.fileName=fileName;
		this.resultHeading= resultHeading;
		write();
	}
	
	public void write(){
		try {
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
				FileWriter writer = new FileWriter(fileName);
				BufferedWriter bw = new BufferedWriter(writer);
				if (!resultHeading.equals("")){
					bw.append(resultHeading+"\n");
				}
				bw.append(result);
				bw.append("\n");
				System.out.println("Output file: "+fileName);
				bw.close();
			}
			else {
				menu();
			}
		}
			catch(Exception e){
			e.printStackTrace();
		}
			
	}



	public void overwrite() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,
				false));
		if (!resultHeading.equals("")){
			writer.append(resultHeading+"\n");
		}
		writer.append(result);
		writer.close();
		System.out.println("Output file: "+fileName);
	}

	public void appendUsingFileWriter() throws IOException {
		BufferedWriter writer;
		writer = new BufferedWriter(new FileWriter(fileName, true));
		if (!resultHeading.equals("")){
			writer.append(resultHeading+"\n");
		}
		writer.append(result);
		writer.append("\n");
		writer.close();
		System.out.println("Output file: "+fileName);
	}

	public void menu() throws IOException{
		if (overwrite){
			try {
				overwrite();
			} 
			catch (IOException e) {
			e.printStackTrace();
			}
		} else {
			appendUsingFileWriter();
		}
	}

}



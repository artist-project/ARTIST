/*
 * Copyright 2015 ICCS/NTUA 
 * Licensed under the Eclipse Public License(EPL) version 1.0 License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * https://www.eclipse.org/legal/epl-v10.html
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors: Athanasia Evangelinou
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *
 */

package eu.artist.migration.ct.classifier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import eu.artist.migration.ct.common.Constants;

public class BenchmarkProfileReader extends ProfileResultsReader {
	private String fileName;
	private int vectorSize;
	
	public BenchmarkProfileReader() {
		this.vectorSize = Constants.DEFAULT_TRAINING_VECTOR_SIZE;
	}
	
	public BenchmarkProfileReader(String fileName) {
		this();
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public int getVectorSize() {
		return vectorSize;
	}
	
	public void setVectorSize(int vectorSize) {
		this.vectorSize = vectorSize;
	}
	
	public ArrayList<BenchmarkWorkload> getWorkloadsFromFile() throws Exception {
		Path path;
		try {
			path = FileSystems.getDefault().getPath(fileName);
		}
		catch (InvalidPathException ex) {
			ex.printStackTrace();
			throw new Exception("File " + fileName + " not found!");
		}
		
		List<String> fileLines = null;
		
		try {
			fileLines = Files.readAllLines(path, StandardCharsets.UTF_8);
		}
		catch (IOException ex) {
			ex.printStackTrace();
			throw new Exception("Could not read file " + fileName + ".");
		}
		
		if (fileLines == null) {
			throw new Exception("Could not read file " + fileName + ".");
		}
		
		ArrayList<BenchmarkWorkload> workloads = new ArrayList<BenchmarkWorkload>(); 
		BenchmarkWorkload workload = null;
		boolean isBenchName = true;
		
		for (int i = 0; i < fileLines.size(); i++) {
			String line = fileLines.get(i);
			
			if (line.trim().length() == 0) {
				continue;
			}
			
			if (isBenchName) {
				//Edw diavazoume th grammi me to onoma tou workload
				workload = new BenchmarkWorkload(line);
				isBenchName = !isBenchName;
			}
			else {
				//Edw diavazoume th grammi me tis times tou vector
				try {
					workload.setVector(convertLineToDoubleValues(line, vectorSize));
				}
				catch (ParseException ex) {
					ex.printStackTrace();
					throw new Exception("Wrong line format in file " + fileName + ".");
				}
				workloads.add(workload);
				isBenchName = !isBenchName;
			}	
		}
		
		return workloads;
	}
}

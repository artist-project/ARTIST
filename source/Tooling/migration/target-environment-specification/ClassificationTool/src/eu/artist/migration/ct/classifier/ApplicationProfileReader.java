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
import java.util.List;

import eu.artist.migration.ct.common.Constants;

public class ApplicationProfileReader  extends ProfileResultsReader {
	private String pidstatFileName;
	private String tsharkFileName;
	private int pidstatVectorSize;
	private int tsharkVectorSize;
	
	public ApplicationProfileReader() {
		pidstatVectorSize = Constants.DEFAULT_PIDSTAT_VECTOR_SIZE;
		tsharkVectorSize = Constants.DEFAULT_TSHARK_VECTOR_SIZE;
	}
	
	public ApplicationProfileReader(String pidstatFileName, String tsharkFileName) {
		this();
		this.pidstatFileName = pidstatFileName;
		this.tsharkFileName = tsharkFileName;
	}
	
	public String getPidstatFileName() {
		return pidstatFileName;
	}
	
	public void setPidstatFileName(String pidstatFileName) {
		this.pidstatFileName = pidstatFileName;
	}
	
	public String getTsharkFileName() {
		return tsharkFileName;
	}
	
	public void setTsharkFileName(String tsharkFileName) {
		this.tsharkFileName = tsharkFileName;
	}
	
	public int getPidstatVectorSize() {
		return pidstatVectorSize;
	}
	
	public void setPidstatVectorSize(int pidstatVectorSize) {
		this.pidstatVectorSize = pidstatVectorSize;
	}
	
	public int getTsharkVectorSize() {
		return tsharkVectorSize;
	}
	
	public void setTsharkVectorSize(int tsharkVectorSize) {
		this.tsharkVectorSize = tsharkVectorSize;
	}

	public ApplicationWorkload getWorkloadFromFiles() throws Exception {
		Path pathPidstat = null;
		try {
			pathPidstat = FileSystems.getDefault().getPath(pidstatFileName);
		}
		catch (InvalidPathException ex) {
			ex.printStackTrace();
			throw new Exception("File " + pidstatFileName + " not found!");
		}
		
		List<String> fileLines = null;
		
		try {
			fileLines = Files.readAllLines(pathPidstat, StandardCharsets.UTF_8);
		}
		catch (IOException ex) {
			ex.printStackTrace();
			throw new Exception("Could not read file " + pidstatFileName + ".");
		}
		
		if (fileLines == null) {
			throw new Exception("Could not read file " + pidstatFileName + ".");
		}
		
		ApplicationWorkload workload = new ApplicationWorkload();
		
		String line = fileLines.get(0);
		double[] pidstatVector = null;
		try {
			pidstatVector = convertLineToDoubleValues(line, pidstatVectorSize);
		}
		catch (ParseException ex) {
			ex.printStackTrace();
			throw new Exception("Wrong line format in file " + pidstatFileName + ".");
		}
		
		Path pathTshark = FileSystems.getDefault().getPath(tsharkFileName);
		fileLines = null;
		
		try {
			fileLines = Files.readAllLines(pathTshark, StandardCharsets.UTF_8);
		}
		catch (IOException ex) {
			ex.printStackTrace();
			throw new Exception("Could not read file " + tsharkFileName + ".");
		}
		
		if (fileLines == null) {
			throw new Exception("Could not read file " + tsharkFileName + ".");
		}
		
		line = fileLines.get(1);
		double[] tsharkVector1 = null;
		try {
			tsharkVector1 = convertLineToDoubleValues(line, tsharkVectorSize);
		}
		catch (ParseException ex) {
			ex.printStackTrace();
			throw new Exception("Wrong line format in file " + tsharkFileName + ".");
		}
		
		line = fileLines.get(3);
		double[] tsharkVector2 = null;
		try {
			tsharkVector2 = convertLineToDoubleValues(line, tsharkVectorSize);
		}
		catch (ParseException ex) {
			ex.printStackTrace();
			throw new Exception("Wrong line format in file " + tsharkFileName + ".");
		}
		
		double[] applicationVector = new double[pidstatVector.length + tsharkVector1.length + tsharkVector2.length];
		System.arraycopy(pidstatVector, 0, applicationVector, 0, pidstatVector.length);
		System.arraycopy(tsharkVector1, 0, applicationVector, pidstatVector.length, tsharkVector1.length);
		System.arraycopy(tsharkVector2, 0, applicationVector, pidstatVector.length + tsharkVector1.length, tsharkVector2.length);
		workload.setVector(applicationVector);
		
		return workload;
	}
	
	
}

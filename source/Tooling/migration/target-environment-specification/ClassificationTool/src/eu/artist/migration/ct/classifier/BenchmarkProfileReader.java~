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

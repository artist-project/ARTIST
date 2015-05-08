package org.modelexecution.fuml.nfr.simulation.result;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileHandler {

	private static final String DEFAULT_DIRECTORY = System.getProperty("user.home");
	
	private File fileDirectory;
	
	public FileHandler() {
		setFileDirectory(DEFAULT_DIRECTORY);
	}
	
	public FileHandler(String fileDirectory) {
		setFileDirectory(fileDirectory);
	}
	
	public File getFileDirectory() {
		return fileDirectory;
	}
	
	public FileHandler setFileDirectory(String fileDirectory) {
		File directory = new File(fileDirectory);
		directory.mkdirs();
		if(!directory.isDirectory())
			return this;
		this.fileDirectory = directory;
		return this;
	}
	
	public File getFile(String fileName) throws IOException {
		File file = new File(getFileDirectory(), fileName);
		if(!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
		if(!file.isFile())
			return null;
		return file;
	}

	public FileOutputStream getFileOutputStream(String fileName) throws FileNotFoundException, IOException {
		return new FileOutputStream(getFile(fileName));
	}
	
	public Path getPath(String fileName) throws FileNotFoundException, IOException {
		return FileSystems.getDefault().getPath(fileName);
	}
}

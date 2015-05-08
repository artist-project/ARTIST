/*******************************************************************************
 *  Copyright (c) 2015 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
 *
 *  Licensed under the MIT license:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 * Contributors: Kleopatra Konstanteli
 * 				 Liagouras Georgios Andreas
 *  Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.webapp.config;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

import javax.faces.bean.RequestScoped;
import javax.servlet.http.Part;

import org.apache.log4j.Logger;
import org.primefaces.model.UploadedFile;

import eu.artist.methodology.mpt.webapp.login.CurrentSession;
import eu.artist.methodology.mpt.webapp.login.LoginBean;

@RequestScoped
public class ReportUploadBean extends LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7309003798780804370L;
	private Part part;
	private String statusMessage;
	private String UPLOAD_DIRECTORY;
	private String chosenButton;
	private UploadedFile file;
	private static Logger logger = Logger.getLogger(ReportUploadBean.class);

	public String uploadFile() throws IOException {

		String path_to_mat_reports = getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\mat";
				+ File.separator + "Projects" + File.separator + CurrentSession.getDefaultProject() + File.separator + "mat";
		String path_to_tft_reports = getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\tft";
				+ File.separator + "Projects" + File.separator +  CurrentSession.getDefaultProject() + File.separator + "tft";
		String path_to_bft_reports = getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\bft";
				+ File.separator + "Projects" + File.separator +  CurrentSession.getDefaultProject() + File.separator + "bft";
		String path_to_mig_reports = getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\mig";
				+ File.separator + "Projects" + File.separator + CurrentSession.getDefaultProject() + File.separator + "mig";

		String fileName = file.getFileName();
		chosenButton = CurrentSession.getExternalContext()
				.getRequestParameterMap().get("button");

		if ("mat".equalsIgnoreCase(chosenButton)) {
			logger.info("found mat parameter");
			UPLOAD_DIRECTORY = path_to_mat_reports;
		} else if ("tft".equalsIgnoreCase(chosenButton)) {
			UPLOAD_DIRECTORY = path_to_tft_reports;
		} else if ("bft".equalsIgnoreCase(chosenButton)) {
			UPLOAD_DIRECTORY = path_to_bft_reports;
		}else if ("mig".equalsIgnoreCase(chosenButton)) {
				UPLOAD_DIRECTORY = path_to_mig_reports;
			}

		File checkDir = new File(UPLOAD_DIRECTORY);

		if (!checkDir.exists()) {
			checkDir.mkdirs();
		}

		File outputFilePath = new File(UPLOAD_DIRECTORY + File.separator
				+ fileName);

		// Copy uploaded file to destination path
		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {
			inputStream = file.getInputstream();
			outputStream = new FileOutputStream(outputFilePath);

			int read = 0;
			final byte[] bytes = new byte[1024];

			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}

			statusMessage = "File uploaded successfully.";
		} catch (IOException e) {
			e.printStackTrace();
			statusMessage = "File upload failed." + UPLOAD_DIRECTORY;
		} finally {

			if (outputStream != null) {
				outputStream.close();
			}

			if (inputStream != null) {
				inputStream.close();
			}
		}

		return "/result.xhtml";
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getUPLOAD_DIRECTORY() {
		return UPLOAD_DIRECTORY;
	}

	public void setUPLOAD_DIRECTORY(String uPLOAD_DIRECTORY) {
		UPLOAD_DIRECTORY = uPLOAD_DIRECTORY;
	}

	public String getChosenButton() {
		return chosenButton;
	}

	public void setChosenButton(String chosenButton) {
		this.chosenButton = chosenButton;
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

}

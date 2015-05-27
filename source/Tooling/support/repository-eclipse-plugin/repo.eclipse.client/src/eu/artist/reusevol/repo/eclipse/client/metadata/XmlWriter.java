/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Huzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.metadata;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFile;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class XmlWriter {

	public InputStream writetoXML(String artifactId, String artifactName,
			String absoluteworkspacePath, String repositoryLocation,
			String category, String label, String description,
			Boolean fileNotExists, IFile file)
			throws ParserConfigurationException, TransformerException,
			UnsupportedEncodingException {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = null;
		Element rootElement = null;

		if (fileNotExists == true) {
			doc = docBuilder.newDocument();
			rootElement = doc.createElement("Artifacts");
			doc.appendChild(rootElement);
		} else {
			// File fXmlFile = new File("/Users/mkyong/staff.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			try {
				// File fileobject = file.getLocationURI().toFile();
				File fileobject = file.getRawLocation().makeAbsolute().toFile();
				if (fileobject.exists())
					doc = dBuilder.parse(fileobject);

			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			rootElement = doc.getDocumentElement();
		}

		// staff elements
		Element staff = doc.createElement("Artifact");
		rootElement.appendChild(staff);

		// set attribute to staff element
		Attr attr = doc.createAttribute("id");
		attr.setValue(artifactId);
		staff.setAttributeNode(attr);

		// elements
		Element name = doc.createElement("Name");
		name.appendChild(doc.createTextNode(artifactName));
		staff.appendChild(name);

		// elements
		Element location = doc.createElement("LocalPath");
		location.appendChild(doc.createTextNode(absoluteworkspacePath));
		staff.appendChild(location);

		// elements
		Element repolocation = doc.createElement("RepositoryPath");
		repolocation.appendChild(doc.createTextNode(repositoryLocation));
		staff.appendChild(repolocation);

		// elements
		Element artifactCategory = doc.createElement("Category");
		artifactCategory.appendChild(doc.createTextNode(category));
		staff.appendChild(artifactCategory);

		// elements
		Element labelArtifact = doc.createElement("Label");
		labelArtifact.appendChild(doc.createTextNode(label));
		staff.appendChild(labelArtifact);

		// elements
		Element descriptionArtifact = doc.createElement("Description");
		descriptionArtifact.appendChild(doc.createTextNode(description));
		staff.appendChild(descriptionArtifact);

		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);

		StringWriter xmlAsWriter = new StringWriter();

		StreamResult result = new StreamResult(xmlAsWriter);

		TransformerFactory.newInstance().newTransformer()
				.transform(source, result);

		// write changes
		ByteArrayInputStream inputStream = new ByteArrayInputStream(xmlAsWriter
				.toString().getBytes("UTF-8"));

		// StreamResult result = new StreamResult(new File("C:\\file.xml"));

		// Output to console for testing
		// StreamResult result = new StreamResult(System.out);

		// transformer.transform(source, result);

		System.out.println("File saved!");

		return inputStream;

	}

}

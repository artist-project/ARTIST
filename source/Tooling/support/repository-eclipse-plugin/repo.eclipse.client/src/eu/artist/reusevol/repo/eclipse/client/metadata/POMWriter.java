/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
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


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.osgi.util.NLS;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLFilterImpl;


public class POMWriter {

	private static final String ELEMENT_CATALOGS = "ArtefactsCatalogs"; //$NON-NLS-1$

	private static final String ELEMENT_CATALOG = "Catalog"; //$NON-NLS-1$

	private static final String CATALOG_NAME = " Artefactname"; //$NON-NLS-1$

	public static final String CATALOG_LOCATION = "Location"; //$NON-NLS-1$

	public Collection<ArtefactFactory> readCatalogs(
			InputStream is) throws IOException {
		Collection<ArtefactFactory> catalogs = new ArrayList<ArtefactFactory>();
		try {
			SAXParserFactory parserFactory = SAXParserFactory.newInstance();
			SAXParser parser = parserFactory.newSAXParser();
			parser.parse(is, new CatalogsContentHandler(catalogs));
		} catch (SAXException ex) {
			// String msg = Messages.ArchetypeCatalogsWriter_error_parse;
			// log.error(msg, ex);
			throw new IOException(NLS.bind("msg", ex.getMessage()));
		} catch (ParserConfigurationException ex) {
			// String msg = Messages.ArchetypeCatalogsWriter_error_parse;
			// log.error(msg, ex);
			throw new IOException(NLS.bind("msg", ex.getMessage()));
		}
		return catalogs;
	}

	public void writeRepositoryCatalogs(
			final Collection<ArtefactFactory> catalogs, OutputStream os)
			throws IOException {
		try {
			Transformer transformer = TransformerFactory.newInstance()
					.newTransformer();
			transformer.transform(new SAXSource(
					new XMLCatalogsWriter(catalogs),
					new InputSource()), new StreamResult(os));

		} catch (TransformerFactoryConfigurationError ex) {
			throw new IOException(NLS.bind("Messages", ex.getMessage()));

		} catch (TransformerException ex) {
			throw new IOException(NLS.bind("Messages", ex.getMessage()));

		}
	}

	static class XMLCatalogsWriter extends XMLFilterImpl {

		private final Collection<ArtefactFactory> catalogs;

		public XMLCatalogsWriter(
				Collection<ArtefactFactory> catalogs) {
			this.catalogs = catalogs;
		}

		public void parse(InputSource input) throws SAXException {
			ContentHandler handler = getContentHandler();
			handler.startDocument();
			handler.startElement(null, ELEMENT_CATALOGS, ELEMENT_CATALOGS,
					new AttributesImpl());

			for (ArtefactFactory factory : this.catalogs) {
				if (factory.isEditable()) {
					if (factory instanceof ArtefactFactory) { // MUZAHID
						AttributesImpl attrs = new AttributesImpl();

						attrs.addAttribute(null, CATALOG_NAME,
								CATALOG_NAME, null,
								factory.getArtefactName());
						attrs.addAttribute(null, CATALOG_LOCATION,
								CATALOG_LOCATION, null,
								factory.getLocation());
						handler.startElement(null, ELEMENT_CATALOG,
								ELEMENT_CATALOG, attrs);
						handler.endElement(null, ELEMENT_CATALOG,
								ELEMENT_CATALOG);
					}
				}
			}

			handler.endElement(null, ELEMENT_CATALOGS, ELEMENT_CATALOGS);
			handler.endDocument();
		}
	}
 // redundant for downlaoding
	static class CatalogsContentHandler extends DefaultHandler {

		private Collection<ArtefactFactory> catalogs;

		public CatalogsContentHandler(
				Collection<ArtefactFactory> catalogs) {
			this.catalogs = catalogs;
		}

		public void startElement(String uri, String localName, String qName,
				Attributes attributes) {
			if (ELEMENT_CATALOG.equals(qName) && attributes != null) {

				String name = attributes.getValue(CATALOG_NAME);
				if (name != null) {
					String description = attributes
							.getValue(CATALOG_LOCATION);		
					//catalogs.add(new RepositoryConfigurationEntry(name, artefactDescription,new RepositoryClient(new ConnectionInfo(artefactDescription, null,null))));
				}
			}

		}
	}

}

/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.webservices;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class WebservicesServer1 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2526789193215779264L;
	static MessageFactory messageFactory;
	static SoapHandler soapHandler;
	
	//init
	static {
		try {
			messageFactory = MessageFactory.newInstance();
			soapHandler = new SoapHandler();			
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}				
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			MimeHeaders headers = getHeaders(request);
			
			InputStream inputStream = request.getInputStream();
			SOAPMessage soapRequest = messageFactory.createMessage(headers, inputStream);
			
			SOAPMessage soapResponse = soapHandler.handleSOAPRequest(soapRequest);
			
			response.setStatus(HttpServletResponse.SC_OK);
			response.setContentType("text/xml;charset=\"utf-8\"");
			OutputStream outputStream = response.getOutputStream();
			soapResponse.writeTo(outputStream);
			outputStream.flush();
		} catch (SOAPException e) {
			throw new IOException("Exception while creating SOAP message.", e);
		}		
	}// doPost
	
	static MimeHeaders getHeaders(HttpServletRequest request) {
		Enumeration<?> headerNames = request.getHeaderNames();
		MimeHeaders headers = new MimeHeaders();
		
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			StringTokenizer values = new StringTokenizer(headerValue, ",");
			while (values.hasMoreTokens()) {
				headers.addHeader(headerName, values.nextToken().trim());
			}
		}
		return headers;
	}// getHeaders

}

/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.server.service;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Properties;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.modeshape.jcr.api.JcrTools;

public class BaseServiceTest {
	protected static final Logger LOGGER = Logger
			.getLogger(ProjectServiceTest.class);

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	protected JcrTools tools = new JcrTools(true);

	private static EJBContainer container;
	private Context ctxt;

	@BeforeClass
	public static void startContainer() throws Exception {
		Context ctxt = null;
		if (ctxt == null) {
			try {
				Properties p = new Properties();
				p.put(Context.INITIAL_CONTEXT_FACTORY,
						"org.apache.openejb.client.LocalInitialContextFactory");
				p.put("openejb.deployments.classpath.include", ".*eu/artist.*");
				// p.put(OpenEjbContainer.Provider.OPENEJB_ADDITIONNAL_CALLERS_KEY,
				// getClass().getName());
				// p.put("log4j.category.OpenEJB", "debug");
				// p.put("log4j.category.OpenEJB.startup", "debug");
				// p.put("log4j.category.OpenEJB.startup.config", "debug");
				p.put("jcr",
						"new://Resource?class-name=eu.artist.reusevol.repo.server.tomee.JcrServerResourceAdapter&factory-name=getRepository");
				p.put("jcr.repositoryURL", "file:///modeshape-config.json");
				container = EJBContainer.createEJBContainer(p);
			} catch (Exception ignored) {
				ignored.printStackTrace();
			}
		}
	}

	@AfterClass
	public static void closeContainer() throws Exception {
		container.close();
	}

	@Before
	public void setupContext() {
		try {
			ctxt = container.getContext();
			if (ctxt != null)
				ctxt.bind("inject", this);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(System.out);
		System.setErr(System.err);
		if (outContent.size() > 0)
			LOGGER.debug("OUT: \n" + outContent.toString());
		if (errContent.size() > 0)
			LOGGER.debug("ERR: \n" + errContent.toString());
	}
}

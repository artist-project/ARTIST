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
package eu.artist.reusevol.repo.server.jcr;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.modeshape.jcr.api.JcrTools;

public class JcrUtils {

	public static String printTree(Node root) {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream oldOut = System.out;
		PrintStream oldErr = System.err;

		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));

		JcrTools tools = new JcrTools(true);
		try {
			tools.printSubgraph(root);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.setOut(oldOut);
		System.setErr(oldErr);

		String result = "";
		if (outContent.size() > 0)
			result += outContent.toString();
		if (errContent.size() > 0)
			result += errContent.toString();

		return result;
	}

	public static String printTree(Session session, String absolutePath) {
		try {
			return printTree(session.getNode(absolutePath));
		} catch (RepositoryException e) {
			e.printStackTrace();
		}
		return "";
	}

}

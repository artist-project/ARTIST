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

import static org.junit.Assert.*;

import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;
import javax.jcr.Session;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JcrRepositoryProviderJunitTest {
    private EJBContainer container;

    @Before
    public void startContainer() throws Exception {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
    }
    
    @Inject private Session session;    
	
    @Test
    public void testDefaultWorkspaceName(){
        assertNotNull(session);
        assertEquals("default", session.getWorkspace().getName());
    }
	
    @After
    public void closeContainer() throws Exception {
        container.close();
    }	
}

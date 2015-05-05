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
package eu.artist.reusevol.repo.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import eu.artist.reusevol.repo.client.AllClientTests;
import eu.artist.reusevol.repo.server.jcr.AllJcrTests;
import eu.artist.reusevol.repo.server.service.AllServiceTests;

@RunWith(Suite.class)
@SuiteClasses({ AllServiceTests.class, AllClientTests.class, AllJcrTests.class })
public class AllTests {

}

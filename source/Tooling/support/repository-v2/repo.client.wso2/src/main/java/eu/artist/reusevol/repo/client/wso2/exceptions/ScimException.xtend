/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
 
package eu.artist.reusevol.repo.client.wso2.exceptions

import eu.artist.reusevol.repo.client.wso2.dto.ScimError

class ScimException extends Exception {
	
	val int code
	
	new(String message, int code) {
		super(message)
		this.code = code
	}
	
	new(ScimError error) {
		super(error.errors.head.message)
		this.code = error.errors.head.code
	}
	
	new(Exception ex) {
		super(ex.message, ex)
		this.code = 0
	}
	
	def getCode() {
		code
	}
}
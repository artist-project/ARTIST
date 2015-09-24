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
 
package eu.artist.reusevol.mp.views

import javax.ws.rs.core.MultivaluedMap
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.hibernate.validator.constraints.NotBlank

@Accessors @ToString @EqualsHashCode
public class LoginView extends BaseView {

	@NotBlank
	var String username
	@NotBlank
	var String password

	public new() {
		super("login.ftl")
		super.title = "Log In"
	}

	public new(MultivaluedMap<String, String> values) {
		this()
		this.username = values.getFirst("username")
		this.password = values.getFirst("password")
	}
}

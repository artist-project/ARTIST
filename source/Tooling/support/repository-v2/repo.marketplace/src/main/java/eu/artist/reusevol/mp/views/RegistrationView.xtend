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

import io.dropwizard.validation.ValidationMethod
import javax.ws.rs.core.MultivaluedMap
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.hibernate.validator.constraints.Email
import org.hibernate.validator.constraints.NotBlank
import org.hibernate.validator.constraints.NotEmpty

@Accessors @ToString @EqualsHashCode
class RegistrationView extends BaseView {

	public static val KEY_USERNAME = "username"
	public static val KEY_REALNAME = "realname"
	public static val KEY_EMAIL = "email"
	public static val KEY_TERMS = "termsAccepted"
	public static val KEY_PASSWORD = "password"
	public static val KEY_PASSWORD2 = "password2"

	@NotBlank
	var String username
	@NotBlank
	var String realname
	@NotBlank @Email
	var String email
	@NotEmpty
	var String termsAccepted
	@NotBlank
	var String password
	@NotBlank
	var String password2

	new() {
		super("registration.ftl")
		super.title = "User registration"
	}

	new(MultivaluedMap<String, String> values) {
		this()
		logger.debug("Initializing view with " + values.toString)

		this.username = values.getFirst(KEY_USERNAME)
		this.realname = values.getFirst(KEY_REALNAME)
		this.email = values.getFirst(KEY_EMAIL)
		this.termsAccepted = values.getFirst(KEY_TERMS)
		this.password = values.getFirst(KEY_PASSWORD)
		this.password2 = values.getFirst(KEY_PASSWORD2)
	}

	@ValidationMethod(message = "Passwords are not the same")
	def isValidPassword() {
		password.equals(password2)
	}

}

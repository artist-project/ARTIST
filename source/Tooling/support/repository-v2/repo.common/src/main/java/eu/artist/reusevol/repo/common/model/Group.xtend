package eu.artist.reusevol.repo.common.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.JsonProperty
import java.security.Principal
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.jcrom.annotations.JcrName
import org.jcrom.annotations.JcrNode
import org.jcrom.annotations.JcrPath
import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.validator.constraints.NotBlank

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
@JcrNode(classNameProperty="classname", nodeType="ar:group")
@Accessors @ToString @EqualsHashCode
class Group implements Principal, JcrStorable {

	@JsonIgnore
	@JcrPath
	var String jcrPath

	@NotBlank
	@JsonProperty
	@JcrName
	var String name

	new() {
		this(null)
	}

	new(String name) {
		this.name = name
		this.jcrPath = null
	}

	override setJcrName(String name) {
		this.name = name
	}

	@JsonIgnore
	override getJcrName() {
		name
	}

	override setId(String id) {
		this.name = id
	}

	@JsonIgnore
	override getId() {
		name
	}

}

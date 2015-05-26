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

import eu.artist.reusevol.mp.MarketplaceBundle
import eu.artist.reusevol.mp.model.Message
import eu.artist.reusevol.mp.model.WebLink
import io.dropwizard.views.View
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.util.List
import java.util.Set
import javax.validation.Validation
import javax.ws.rs.core.UriInfo
import org.eclipse.xtend.lib.annotations.Accessors
import org.slf4j.LoggerFactory

@Accessors
public class BaseView extends View {
    
    protected static val logger = LoggerFactory.getLogger(BaseView)

    // Page links for use code
    public static val LOGIN_PAGE = MarketplaceBundle.WEB_BASE + "/user/login.html"
    public static val PROFILE = MarketplaceBundle.WEB_BASE + "/user/profile.html"
    public static val REGISTRATION = MarketplaceBundle.WEB_BASE + "/user/register.html"
    public static val JUMBOTRON = MarketplaceBundle.WEB_BASE + "/static/index.html"
    public static val HOME = MarketplaceBundle.WEB_BASE + "/home.html"
    public static val PROJECT_BROWSER = MarketplaceBundle.WEB_BASE + "/package-browser.html"
    public static val CATEGORY_BROWSER = MarketplaceBundle.WEB_BASE + "/category-browser.html"
    public static val TABLE_BROWSER = MarketplaceBundle.WEB_BASE + "/table-browser.html"
    public static val MY_ARTEFACTS = MarketplaceBundle.WEB_BASE + "/my-artefacts.html"
    public static val TERMS = MarketplaceBundle.WEB_BASE + "/static/terms.html"

    public static val LOGIN_ACTION = MarketplaceBundle.WEB_BASE + "/user/login"

	var String mpBaseUri = ""
	var String apiBaseUri = ""

    // Page links for use in templates
    val homePage = HOME
    val projectBrowserPage = PROJECT_BROWSER
    val categoryBrowserPage = CATEGORY_BROWSER
    val tableBrowserPage = TABLE_BROWSER
    val myArtefactsPage = MY_ARTEFACTS
    val loginPage = LOGIN_PAGE
    val registrationPage = REGISTRATION
    val jumboPage = JUMBOTRON
    val profilePage = PROFILE
    val termsPage = TERMS

    // Action links for use in templates
    val loginAction = LOGIN_ACTION
    val logoutAction = MarketplaceBundle.WEB_BASE + "/user/logout"
    val registerAction = MarketplaceBundle.WEB_BASE + "/user/register"

    val Set<String> errors
    val String ctx
    var String title

    var String pageHeading
    var String pageDescription

    val List<WebLink> breadCrumps
    val List<Message> messages
    val List<String> notifications
    
	var String accessToken

    new(String templateName) {
        this(templateName, StandardCharsets.UTF_8)
    }

    new(String templateName, Charset charset) {
        super(templateName, charset)
        this.errors = newHashSet()
        this.breadCrumps = newArrayList()
        this.ctx = MarketplaceBundle.WEB_BASE
        this.title = "Home"
        this.pageHeading = title
        this.pageDescription = null
        this.messages = newArrayList()
        this.notifications = newArrayList()
    }

    def validate() {
        val factory = Validation.buildDefaultValidatorFactory
        val validator = factory.validator
        errors.addAll(validator.validate(this).map[ '''«propertyPath» «message»''' ])
        errors.forEach[ logger.debug(it) ]
    }

	def setUriInfo(UriInfo info) {
    	if (info != null) {
    		mpBaseUri = info.baseUriBuilder.build.toASCIIString
    		apiBaseUri = mpBaseUri + "api"
    	}
	}    
    
}

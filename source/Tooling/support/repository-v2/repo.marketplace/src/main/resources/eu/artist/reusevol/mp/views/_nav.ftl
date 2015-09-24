<#--
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
-->

<#macro breadcrumb links>
<ol class="breadcrumb">
  <li><a href="${homePage}"><i class="fa fa-dashboard"></i> Home</a></li>
  <#list links as link>
  <li><a href="${link.url}"<#if !link_has_next> class="active"</#if>>${link.text}</a></li>
  </#list>
</ol>
</#macro>

<#macro mainNavBar>
<ul class="nav navbar-nav">
  <li class="dropdown">
    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Explore artefacts <span class="caret"></span></a>
    <ul class="dropdown-menu" role="menu">
      <li><a href="${tableBrowserPage}">Table of artefacts</a></li>
      <li><a href="${projectBrowserPage}">Browse by project and package</a></li>
      <li><a href="${categoryBrowserPage}">Browse by category</a></li>
    </ul>
  </li>
  <#if accessToken??>
  <li class="active"><a href="${myArtefactsPage}">My artefacts <span class="sr-only">(current)</span></a></li>
  </#if>
</ul><!-- /.navbar-nav -->
</#macro>
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

<#-- @ftlvariable name="" type="eu.artist.reusevol.mp.views.LoginView" -->
<#include "_headers.ftl" />
<#include "_footers.ftl" />
<!DOCTYPE html>
<html>
  <@simpleHead />
  <body class="login-page">
    <div class="login-box">
      <div class="login-logo">
      	<a href="http://www.artist-project.eu/" alt="ARTIST Website" target="_blank">
      		<img src="${ctx}/dist/img/logo/logo.png" alt="The ARTIST Project">
      	</a><br/>
        <a href="${ctx}/static/index2.html"><b>ARTIST</b> Marketplace</a>
      </div><!-- /.login-logo -->
      <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>
        <#if errors?has_content>
        <p>
        <div class="alert alert-warning">
	        <h4><i class="icon fa fa-info"></i> Login failed.</h4>
            Please check your credentials.
        </div>
        </p>
        </#if>
        <form action="${loginAction}" method="post">
          <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="Username" name="username" value="${username!""}"/>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="password" class="form-control" placeholder="Password" name="password"/>
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
          </div>
          <div class="row">
            <div class="col-xs-8">
            </div><!-- /.col -->
            <div class="col-xs-4">
              <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
            </div><!-- /.col -->
          </div>
        </form>
		<!--
        <a href="#">I forgot my password</a><br>
        <a href="register.html" class="text-center">Register a new membership</a>
		-->
      </div><!-- /.login-box-body -->
    </div><!-- /.login-box -->

    <@simpleScriptFooter />
  </body>
</html>
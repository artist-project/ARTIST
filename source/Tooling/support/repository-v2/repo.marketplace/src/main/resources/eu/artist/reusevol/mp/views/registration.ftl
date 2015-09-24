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

<#-- @ftlvariable name="" type="eu.artist.reusevol.mp.views.RegistrationView" -->
<#include "_headers.ftl" />
<#include "_footers.ftl" />
<!DOCTYPE html>
<html>
  <@simpleHead />
  <body class="register-page">
    <div class="register-box">
      <div class="register-logo">
      	<a href="http://www.artist-project.eu/" alt="ARTIST Website" target="_blank">
      		<img src="${ctx}/dist/img/logo/logo.png" alt="The ARTIST Project">
      	</a><br/>
        <a href="${homePage}"><b>ARTIST</b> Marketplace</a>
      </div><!-- /.login-logo -->
      
      <div class="register-box-body">
        <p class="login-box-msg">Register a new membership.<br/>All fields are required.</p>
        <#if errors?has_content >
        <p>
        <div class="alert alert-warning">
            <h4><i class="icon fa fa-info"></i> Please correct the following fields:</h4>
            <ul>
              <#list errors as error>
                  <li>${error}</li>
              </#list>
            </ul>
        </div>
        </p>
        </#if>
        <form action="${registerAction}" method="post">
          <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="Username" name="username" value="${username!""}"/>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="Full name" name="realname" value="${realname!""}"/>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="Email" name="email" value="${email!""}"/>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="password" class="form-control" placeholder="Password" name="password"/>
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="password" class="form-control" placeholder="Retype password" name="password2"/>
            <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
          </div>
          <div class="row">
            <div class="col-xs-8">    
              <div class="checkbox icheck">
                <label>
                  <input type="checkbox" name="termsAccepted"> I agree to the <a href="${termsPage}">terms</a>
                </label>
              </div>                        
            </div><!-- /.col -->
            <div class="col-xs-4">
              <button type="submit" class="btn btn-primary btn-block btn-flat">Register</button>
            </div><!-- /.col -->
          </div>
        </form>        

        <a href="${loginPage}" class="text-center">I already have a membership</a>
      </div><!-- /.form-box -->
    </div><!-- /.register-box -->

    <@simpleScriptFooter />
  </body>
</html>
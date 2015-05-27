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

<#macro messageMenu messages>
<#if messages??>
<!-- Messages: style can be found in dropdown.less-->
<li class="dropdown messages-menu">
  <!-- Menu toggle button -->
  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
    <i class="fa fa-envelope-o"></i>
    <span class="label label-success">${messages?size}</span>
  </a>
  <ul class="dropdown-menu">
    <li class="header">You have ${messages?size} messages</li>
    <li>
      <!-- inner menu: contains the messages -->
      <ul class="menu">
        <#list messages as message>
        <li><!-- start message -->
          <a href="#">
            <div class="pull-left">
              <!-- User Image -->
              <img src="${ctx}/dist/img/avatar04.png" class="img-circle" alt="User Image"/>
            </div>
            <!-- Message title and timestamp -->
            <h4>                            
              ${message.sender}
              <#if message.ago??>
              <small><i class="fa fa-clock-o"></i> ${message.ago}</small>
              </#if>
            </h4>
            <!-- The message -->
            <p>${message.text}</p>
          </a>
        </li><!-- end message -->
        </#list>                      
      </ul><!-- /.menu -->
    </li>
    <li class="footer"><a href="#">See All Messages</a></li>
  </ul>
</li><!-- /.messages-menu -->
</#if>
</#macro>

<#macro notificationMenu notifications>
<#if notifications??>
<!-- Notifications Menu -->
<li class="dropdown notifications-menu">
  <!-- Menu toggle button -->
  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
    <i class="fa fa-bell-o"></i>
    <span class="label label-warning">${notifications?size}</span>
  </a>
  <ul class="dropdown-menu">
    <li class="header">You have ${notifications?size} notifications</li>
    <li>
      <!-- Inner Menu: contains the notifications -->
      <ul class="menu">
        <#list notifications as note>
        <li><!-- start notification -->
          <a href="#">
            <i class="fa fa-users text-aqua"></i> ${note}
          </a>
        </li><!-- end notification -->
        </#list>                      
      </ul>
    </li>
    <li class="footer"><a href="#">View all</a></li>
  </ul>
</li>
</#if>
</#macro>

<#macro userAccountMenu>
<#if user??>
<!-- User Account Menu -->
<li class="dropdown user user-menu">
  <!-- Menu Toggle Button -->
  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
    <!-- The user image in the navbar-->
    <img src="${ctx}/dist/img/avatar04.png" class="user-image" alt="User Image"/>
    <!-- hidden-xs hides the username on small devices so only the image appears. -->
    <span class="hidden-xs">${user.realname}</span>
  </a>
  <ul class="dropdown-menu">
    <!-- The user image in the menu -->
    <li class="user-header">
      <img src="${ctx}/dist/img/avatar04.png" class="img-circle" alt="User Image" />
      <p>
        ${user.realname}
        <small>Username: ${user.username}</small>
      </p>
    </li>
    <!-- Menu Footer-->
    <li class="user-footer">
      <#-- 
      <div class="pull-left">
        <a href="${profilePage}" class="btn btn-default btn-flat">Profile</a>
      </div>
      -->
      <div class="pull-right">
        <a href="${logoutAction}" class="btn btn-default btn-flat">Sign out</a>
      </div>
    </li>
  </ul>
</li>
<#else>
<div class="btn-group dropdown" style="margin-top:0.5em;">
  <a class="btn btn-default" href="${registrationPage}"><i class="fa fa-edit"></i> Register</a>
  <a class="btn btn-default" href="${loginPage}"><i class="fa fa-lock"></i> Log In</a>
</div>
</#if>
</#macro>

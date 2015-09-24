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

<#-- @ftlvariable name="" type="eu.artist.reusevol.mp.views.BaseView" -->
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="ARTIST Marketplace, MDA, models, artefacts">
    <meta name="author" content="ARTIST Project">

    <title>${title}</title>

    <!-- Bootstrap core CSS -->
    <link href="${ctx}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Skin CSS -->
    <link href="${ctx}/dist/css/skins/skin-artist.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body class="skin-artist">

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="http://www.artist-project.eu/"><img src="${ctx}/dist/img/logo/logo.png" class="logo" style="margin-top:-14px;" /></a>
        </div>
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>ARTIST Marketplace</h1>
        <p>
        The ARTIST Marketplace has the purpose to support the ARTIST migration process and in general developers of MDA applications
        by offering a platform to share and reuse MDA models, meta-models, transformations and other artefacts.
        </p>
        <p><a class="btn btn-primary btn-lg" href="${homePage}" role="button">Enter &raquo;</a></p>
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <h2>Reuse</h2>
          <p>
          Artefacts in the ARTIST Marketplace can be described in various ways to make identifying of relevant artefacts as easy as possible.
          Artefacts can be tagged, classified and organized in a clear structure.
		  </p>
          <p><a class="btn btn-default" href="${homePage}" role="button">Enter &raquo;</a></p>
        </div>
        <div class="col-md-4">
          <h2>Share</h2>
          <p>
          Use the ARTIST Marketplace to share your artefacts with others, and get feedback from the community. Your artefacts can
          be commented and rated by other users giving you the opportunity to improve your artefacts.
          </p>
          <p><a class="btn btn-default" href="${loginPage}" role="button">Login &raquo;</a></p>
       </div>
        <div class="col-md-4">
          <h2>Get involved</h2>
          <p>
          The the time and register as a Marketplace user. In addition to viewing the artefacts, you will be able 
          to publish your own artefacts and comment and rate others. Come on in!
		  </p>
          <p><a class="btn btn-default" href="${registrationPage}" role="button">Register &raquo;</a></p>
        </div>
      </div>

      <hr>

      <footer>
        <p>&copy; ARTIST Project 2015</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${ctx}/bootstrap/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${ctx}/bootstrap/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>

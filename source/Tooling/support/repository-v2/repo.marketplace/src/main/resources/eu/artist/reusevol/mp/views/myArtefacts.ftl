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

<#-- @ftlvariable name="" type="eu.artist.reusevol.mp.views.MyArtefactsView" -->
<#include "_headers.ftl" />
<#include "_footers.ftl" />
<#include "_nav.ftl" />
<#include "_menus.ftl" />
<#include "_apps.ftl" />
<#include "_widgets.ftl" />
<!DOCTYPE html>
<html>
  <@fullHead />
  <body class="skin-artist layout-top-nav layout-boxed">
    <div class="wrapper">

      <!-- Main Header -->
      <header class="main-header">
        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
          <div class="container-fluid">
          
            <div class="navbar-header" style="background-image: url(${ctx}/dist/img/logo/logo.png); background-repeat: no-repeat; background-size: 146px auto;">
              <a href="${homePage}" class="navbar-brand" style="padding-left: 180px;"><b>ARTIST </b>Marketplace</a>
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
                <i class="fa fa-bars"></i>
              </button>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="navbar-collapse">

			  <@mainNavBar />

              <ul class="nav navbar-nav navbar-right">
              	<@userAccountMenu />
              </ul>
              
            </div><!-- /.navbar-collapse -->
          </div><!-- /.container-fluid -->
        </nav>
      </header>     

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            ${pageHeading}
            <#if pageDescription??>
            <small>${pageDescription}</small>
            </#if>
          </h1>
          <@breadcrumb links=breadCrumps />
        </section>

        <!-- Main content -->
        <section class="content">

          <div class="row">
            <div class="col-md-4">
              <div id="art-list" class="box box-default box-solid">
                <div class="box-header with-border">
                  <h3 class="box-title" id="info-header">Managed Artefacts</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <div id="info-msg">The following artefacts are managed by you.</div>
                  <div id="art-actions">
                    <button id="btn-new" class="btn btn-block btn-primary" onclick="createArtefact();" style="margin-top:1em;margin-bottom:1em;">Create New Artefact</button>
                  </div>
                  <table class="table table-striped">
                    <thead>
                    </thead>
                    <tbody id="my-artefacts">
                    </tbody>
                  </table>
                </div>
                <div class="overlay" style="display:none;>
                  <i class="fa fa-refresh fa-spin"></i>
                </div>              
              </div>
            </div>
            
            <div class="col-md-8">
              <div id="art-box" class="box box-default box-solid" style="display:none;"">
                <div class="box-header with-border">
                  <h3 id="art-box-title" class="box-title"><span>Edit Artefact 'Test'</span></h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <form class="form-horizontal" role="form">
                  
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="projectSelection">Project:</label>
                      <div class="help-block col-sm-10">
                        Select the project/collection from the dropdown list that you want to artefact to be stored in.
                        You can either select an existing project or choose 'Create new Project'. In this case, enter 
                        the ID and human readable label of the new project in the text fields on the right. Note that 
                        project IDs can only contain alphanumeric characters and '-' or '_'.
                      </div>
                    </div>
                    <div class="form-group">
                      <div class="help-block col-sm-2"></div>
                      <div class="col-sm-4">
                        <select id="projectSelection" class="form-control">
                          <option value="NEW">Create new Project</option>
                          <option>---</option>
                        </select>
                      </div>
                      <div class="col-sm-3">
                        <input type="text" class="form-control art-project" id="projectId" placeholder="Enter project id" disabled="">
                        <label class="control-label" for="projectId"></label>
                      </div>
                      <div class="col-sm-3">
                        <input type="text" class="form-control art-project" id="projectLabel" placeholder="Enter project name" disabled="">
                        <label class="control-label" for="projectLabel"></label>
                      </div>
                    </div>
                    
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="packageSelection">Package:</label>
                      <div class="help-block col-sm-10">
                        Select the package for the artefact. You can either select an existing package or choose 'Create new Package'. 
                        Note that package IDs can only contain alphanumeric characters and '.', '-' or '_'.
                      </div>
                    </div>
                    <div class="form-group">
                      <div class="help-block col-sm-2"></div>
                      <div class="col-sm-4">
                        <select id="packageSelection" class="form-control">
                        </select>
                      </div>
                      <div class="col-sm-6">
                        <input type="text" class="form-control" id="packageId" placeholder="Enter package id">
                        <label class="control-label" for="packageId"></label>
                      </div>
                    </div>
                    <hr />
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="artefactId">Artefact ID:</label>
                      <div class="col-sm-4">
                        <input type="text" class="form-control" id="artefactId" placeholder="Enter artefact id">
                        <label class="control-label" for="artefactId"></label>
                      </div>
                      <label class="control-label col-sm-2" for="artefactLabel">Artefact Label:</label>
                      <div class="col-sm-4">
                        <input type="text" class="form-control" id="artefactLabel" placeholder="Enter artefact label">
                        <label class="control-label" for="artefactLabel"></label>
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="artefactType">Type:</label>
                      <div class="col-sm-10">
                        <select id="typeSelection" class="form-control">
                        </select>
                      </div>
                    </div>
                    <hr />
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="artefactTags">Tags:</label>
                      <div class="col-sm-10">
                        <input type="text" placeholder="Enter tags (separated by comma)" id="artefactTags" class="form-control">
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="artefactCategories">Categories:</label>
                      <div class="col-sm-10">
                        <select id="categorySelection" class="form-control" multiple="" size="10">
                        </select>
                      </div>
                    </div>
                    <hr />
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="wmd-input">Description:</label>
                      <div class="col-sm-10">
                        <div id="wmd-button-bar"></div>
                        <textarea id="wmd-input" class="form-control" placeholder="Enter description ..." rows="10"></textarea>
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="wmd-preview">Preview:</label>
                      <div class="col-sm-10">
                        <div id="wmd-preview" style="background-color:#eee;"></div>
                      </div>
                    </div>
                  </form>
                  <form id="contentForm" enctype="multipart/form-data" class="form-horizontal" role="form">
                    <hr />
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="artefactContent">Art. Content:</label>
                      <div class="col-sm-10">
                        <input name="file" type="file" id="artefactContent" />
                      </div>
                    </div>
                    <div class="form-group">
                      <div class="col-sm-2"></div>
                      <div class="col-sm-1">
                        <div>Filename:</div>
                      </div>
                      <div class="col-sm-4">
                        <div id="contentFilename">---</div>
                      </div>
                      <div class="col-sm-1">
                        <div>Size:</div>
                      </div>
                      <div class="col-sm-4">
                        <div id="contentSize">---</div>
                      </div>
                    </div>
                  </form>
                  <form id="imageForm" enctype="multipart/form-data" class="form-horizontal" role="form">
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="artefactImage">Image/Diagram:</label>
                      <div class="col-sm-10">
                        <input name="file" type="file" id="artefactImage" />
                      </div>
                    </div>
                    <div class="form-group">
                      <div class="col-sm-2"></div>
                      <div id="show-image" class="col-sm-10">
                      </div>
                    </div>
                  </form>
                  <form id="versioningForm" class="form-horizontal" role="form">
                    <div class="form-group">
                      <label class="control-label col-sm-2" for="newVersion">Versioning:</label>
                      <div class="checkbox col-sm-3">
                        <label>
                          <input id="newVersion" type="checkbox"> Create new Version
                        </label>
                      </div>
                      <div class="col-sm-7">
                        <input type="text" class="form-control" id="commitMessage" placeholder="Enter short version comment ...">
                      </div>
	                </div>
	              </form>
                </div><!-- /.box-body -->
                <div class="box-footer">
                  <button id="btn-submit" class="btn btn-primary btn-block" type="submit">Publish Artefact</button>
                </div>
              </div>            
            </div>
          </div>          
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->

      <@mainFooter />

    </div><!-- ./wrapper -->

    <@fullScriptFooter />
    
	<script type="text/javascript">    
      <@myArtefactsApp />
    </script>
  </body>
</html>
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

<#-- @ftlvariable name="" type="eu.artist.reusevol.mp.views.DetailsView" -->
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
            <div class="col-md-8">
			  <@artefactDetails />            
            </div>


            <div class="col-md-4">
			  <@artefactInfo false/>            
            </div>

            <div class="col-md-4">
              <div class="box box-default box-solid">
                <div class="box-header with-border">
                  <h3 class="box-title">Categories</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <ul id="categories">
                  </ul>
                </div>
              </div>
            </div>
            
            <div class="col-md-4">
              <div class="box box-default box-solid">
                <div class="box-header with-border">
                  <h3 class="box-title">Tags</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <ul id="tags">
                  </ul>
                </div>
              </div>
            </div>
            
            <!--
            <div class="col-md-4">
              <div class="small-box bg-green">
                <div class="inner">
                  <h3 id="downloads">1</h3>
                  <p>Downloads</p>
                </div>
                <div class="icon">
                  <i class="ion ion-stats-bars"></i>
                </div>
              </div>
            </div>
            -->

            <div class="col-md-4">
              <div class="info-box bg-green">
                <span class="info-box-icon">
                  <i class="fa fa-thumbs-o-up"></i>
                </span>
                <div class="info-box-content">
                  <span class="info-box-text">Average Rating</span>
                  <span id="rating-avg" class="info-box-number">4.5</span>                
                <div class="progress">
                </div>
                  <span id="rating-size" class="progress-description"> 4 Ratings submitted </span>                  
                </div>
              </div>
            </div>
            
<#if accessToken??>
            <div id="slider" class="col-md-4">
              <div class="box box-default box-solid">
                <div class="box-header with-border bg-green">
                  <h3 class="box-title">Your rating</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <input id="rating-slider" name="rating" type="text" value="1" class="slider" data-slider-min="0" data-slider-max="5" data-slider-step="1" data-slider-value="1" data-slider-orientation="horizontal" data-slider-selection="before" data-slider-tooltip="show" data-slider-id="green" />
                  <a id="rating-btn" class="btn btn-success" style="margin-top:1em;">Submit Rating</a>
                </div>
              </div>
            </div>
</#if>
            
          </div><!-- row -->
          
          <div class="row">
            <div class="col-md-12">
            
              <div class="nav-tabs-custom">
                <ul class="nav nav-tabs">
                  <li class="active">
                    <a data-toggle="tab" href="#tab_1" aria-expanded="true">Timeline / Comments</a>
                  </li>
                  <li class="">
                    <a data-toggle="tab" href="#tab_2" aria-expanded="false">Versions</a>
                  </li>
                </ul>
                
                <div class="tab-content">
                  <div id="tab_1" class="tab-pane active">
                    <ul id="comments" class="timeline">
                    </ul>

<#if accessToken??>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="box box-primary">
                          <div class="box-header">
                            <h3 class="box-title">Post a comment</h3>
                          </div><!-- /.box-header -->
                          <!-- form start -->
                          <div class="box-body">
                            <div class="form-group">
                              <label for="comment-title">Subject</label>
                              <input id="comment-title" class="form-control" type="text" placeholder="Enter title ...">
                            </div>
                            <div class="form-group">
                              <label for="wmd-button-bar">Comment</label><small> (You can use Markdown syntax to format your comment)</small></label>
                              <div id="wmd-button-bar"></div>
                              <textarea id="wmd-input" class="form-control" placeholder="Enter comment ..." rows="5"></textarea>
                            </div>
                          </div><!-- /.box-body -->
                          <div class="box-footer">
                            <a id="post-comment-btn" class="btn btn-primary">Post Comment</a>
                          </div>
                        </div> <!-- box -->
                      </div>
                      
                      <div class="col-md-6">
                        <div class="box box-primary">
                          <div class="box-header">
                            <h3 class="box-title">Preview</h3>
                          </div><!-- /.box-header -->
                          <!-- form start -->
                          <div class="box-body">
                            <div id="wmd-preview" style="background-color:#eee;">sdfsd</div>
                          </div><!-- /.box-body -->
                        </div>
                      </div>
                    </div>
</#if>
                  </div><!-- /.tab-pane -->
                  
                  <div id="tab_2" class="tab-pane">
                    <table id="versions" class="table table-striped">
                      <tbody>
                      <tr>
                        <th>Version</th>
                        <th>Message</th>
                        <th>Submitted by</th>
                        <th>Date</th>
                        <th>Actions</th>
                      </tr>
                      </tbody>
                    </table>
                  </div><!-- /.tab-pane -->
                </div><!-- /.tab-content -->
              </div>
            
            </div>
          </div><!-- row -->

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->

      <@mainFooter />

    </div><!-- ./wrapper -->

    <@fullScriptFooter />
    
	<script type="text/javascript">    
      <@detailsApp />
    </script>
  </body>
</html>
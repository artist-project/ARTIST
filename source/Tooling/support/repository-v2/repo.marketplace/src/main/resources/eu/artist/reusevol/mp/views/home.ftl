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

<#-- @ftlvariable name="" type="eu.artist.reusevol.mp.views.HomeView" -->
<#include "_headers.ftl" />
<#include "_footers.ftl" />
<#include "_nav.ftl" />
<#include "_menus.ftl" />
<#include "_apps.ftl" />
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
          
            <div class="navbar-header" style="background-image: url(dist/img/logo/logo.png); background-repeat: no-repeat; background-size: 146px auto;">
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
          <#list breadCrumps as b>
          ${b}
          </#list>
          
          <div class="row">
            <div class="col-md-8">
              <div class="box">
                <div class="box-header with-border">
                  <h3 class="box-title">Welcome</h3>
                  <div class="box-tools pull-right">
                    <button data-widget="collapse" class="btn btn-box-tool"><i class="fa fa-minus"></i></button>
                    <button data-widget="remove" class="btn btn-box-tool"><i class="fa fa-times"></i></button>
                  </div>
                </div><!-- /.box-header -->
                <div class="box-body">
                <p>
                Welcome to the ARTIST Marketplace. Its purpose is to offer developers the opportunity to
                share reusable MDA models, meta-models, transformations or other useful artefacts.
                </p><p>
                This page offers some statistics about the current content available in the Marketplace.
                </p><p>
                Your other options are:
                <ul>
                <li>
                On the <a href="${tableBrowserPage}">Table of Artefacts</a> page, you can navigate through the
                offered artefacts in table form. You can also search artefacts by their tags, categories or sort them by
                their average rating. 
                </li><li>
                On the <a href="${projectBrowserPage}">Browse by project and package</a> page, you can navigate through the
                offered artefacts following the structure of the repository. 
                </li><li>
                Finally on the <a href="${categoryBrowserPage}">Browse by category</a> page, you can navigate the
                artefacts according to their assigned tags. 
                </li><li>
                Registered users can publish new artefacts or manage their previously published artefacts on the
                <a href="${myArtefactsPage}">My Artefacts</a> page. 
                </li>
                </ul>
                </div><!-- ./box-body -->
                <div class="box-footer">
                </div><!-- /.box-footer -->
              </div>
            </div>
            <div class="col-md-4">
              <div class="box">
                <div class="box-header with-border">
                  <h3 class="box-title">Statistics</h3>
                  <div class="box-tools pull-right">
                    <button data-widget="collapse" class="btn btn-box-tool"><i class="fa fa-minus"></i></button>
                    <button data-widget="remove" class="btn btn-box-tool"><i class="fa fa-times"></i></button>
                  </div>
                </div><!-- /.box-header -->
                <div class="box-body">
			      <div class="info-box">
                	  <span class="info-box-icon bg-navy"><i class="fa fa-book"></i></span>
		              <div class="info-box-content">
		                <span class="info-box-text">Artefacts</span>
		                <span id="artefactsCount" class="info-box-number"></span>
		              </div><!-- /.info-box-content -->
	              </div>
			      <div class="info-box">
                	  <span class="info-box-icon bg-black"><i class="fa fa-download"></i></span>
		              <div class="info-box-content">
		                <span class="info-box-text">Downloads</span>
		                <span id="downloadCount" class="info-box-number"></span>
		              </div><!-- /.info-box-content -->
	              </div>
			      <div class="info-box">
                	  <span class="info-box-icon bg-yellow"><i class="fa fa-comments"></i></span>
		              <div class="info-box-content">
		                <span class="info-box-text">Comments</span>
		                <span id="commentCount" class="info-box-number"></span>
		              </div><!-- /.info-box-content -->
	              </div>
			      <div class="info-box">
                	  <span class="info-box-icon bg-maroon"><i class="fa fa-star"></i></span>
		              <div class="info-box-content">
		                <span class="info-box-text">Ratings</span>
		                <span id="ratingsCount" class="info-box-number"></span>
		              </div><!-- /.info-box-content -->
	              </div>
                </div><!-- ./box-body -->
              </div>            
            </div>
          </div><!-- row -->

          <div class="row">
          
            <div class="col-md-4">
              <div class="box box-default">
                <div class="box-header with-border">
                  <h3 class="box-title">Popular Categories</h3>
                  <div class="box-tools pull-right">
                    <button data-widget="collapse" class="btn btn-box-tool"><i class="fa fa-minus"></i></button>
                    <button data-widget="remove" class="btn btn-box-tool"><i class="fa fa-times"></i></button>
                  </div>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <div class="row">
                    <div class="col-md-6">
                      <div class="chart-responsive">
                        <canvas height="160" id="pieChart1" style="width: 193px; height: 160px;" width="193"></canvas>
                      </div><!-- ./chart-responsive -->
                    </div><!-- /.col -->
                    <div class="col-md-6">
                      <ul id="pieChartLegend1" class="chart-legend clearfix">
                      </ul>
                    </div><!-- /.col -->
                  </div><!-- /.row -->
                </div><!-- /.box-body -->
              </div>                
            </div>                

            <div class="col-md-4">
              <div class="box box-default">
                <div class="box-header with-border">
                  <h3 class="box-title">Popular Tags</h3>
                  <div class="box-tools pull-right">
                    <button data-widget="collapse" class="btn btn-box-tool"><i class="fa fa-minus"></i></button>
                    <button data-widget="remove" class="btn btn-box-tool"><i class="fa fa-times"></i></button>
                  </div>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <div class="row">
                    <div class="col-md-6">
                      <div class="chart-responsive">
                        <canvas height="160" id="pieChart2" style="width: 193px; height: 160px;" width="193"></canvas>
                      </div><!-- ./chart-responsive -->
                    </div><!-- /.col -->
                    <div class="col-md-6">
                      <ul id="pieChartLegend2" class="chart-legend clearfix">
                      </ul>
                    </div><!-- /.col -->
                  </div><!-- /.row -->
                </div><!-- /.box-body -->
              </div>                
            </div>                

            <div class="col-md-4">
              <div class="box box-default">
                <div class="box-header with-border">
                  <h3 class="box-title">Rating distribution</h3>
                  <div class="box-tools pull-right">
                    <button data-widget="collapse" class="btn btn-box-tool"><i class="fa fa-minus"></i></button>
                    <button data-widget="remove" class="btn btn-box-tool"><i class="fa fa-times"></i></button>
                  </div>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <div class="row">
                    <div class="col-md-6">
                      <div class="chart-responsive">
                        <canvas height="160" id="pieChart3" style="width: 193px; height: 160px;" width="193"></canvas>
                      </div><!-- ./chart-responsive -->
                    </div><!-- /.col -->
                    <div class="col-md-6">
                      <ul id="pieChartLegend3" class="chart-legend clearfix">
                      </ul>
                    </div><!-- /.col -->
                  </div><!-- /.row -->
                </div><!-- /.box-body -->
              </div>                
            </div>
          </div><!-- row -->

          <!-- Your Page Content Here -->

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->

      <@mainFooter />

    </div><!-- ./wrapper -->

    <@fullScriptFooter />
    
	<script type="text/javascript">    
      <@homeApp />
    </script>
  </body>
</html>
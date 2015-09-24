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

<#macro artefactDetails>
<div class="box box-default box-solid">
  <div class="box-header with-border">
     <h3 class="box-title"><span id="art-label">Artefact Description</span></h3>
  </div><!-- /.box-header -->
  <div class="box-body">
    <div id="art-description">No artefact selected.</div>
    <img id="art-image" width="100%" style="display:none;"/>
  </div><!-- /.box-body -->
</div>            
</#macro>

<#macro artefactInfo detailsButton=true>
  <div class="box box-default box-solid">
    <div class="box-header with-border">
      <h3 class="box-title" id="info-header">Artefact Info</h3>
    </div><!-- /.box-header -->
    <div class="box-body">
      <div id="info-msg">No item selected</div>
      <table class="table table-striped" id="info-table" style="display:none;">
        <tbody>
        <tr>
          <td>Published by</td><td id="publisher"></td>
        </tr><tr>
          <td>Published on</td><td id="published-on"></td>
        </tr><tr>
          <td>Last modified on</td><td id="last-modified"></td>
        </tr><tr>
          <td>File name</td><td id="filename"></td>
        </tr><tr>
          <td>File size</td><td id="filesize"></td>
        </tr><tr>
          <td>Type</td><td id="type"></td>
        </tr>
        </tbody>
      </table>
      <div id="art-actions" style="display:none;">
        <p>
          <#if detailsButton>
          <a id="btn-details" class="btn btn-primary" style="margin-top:1em;" href="#">Show Artefact Details</a>
          <a id="btn-download" class="btn btn-primary pull-right" style="margin-top:1em;" href="#">Download Artefact</a>
          <#else>
          <a id="btn-download" class="btn btn-primary" style="margin-top:1em;" href="#">Download Artefact</a>
          </#if>
        </p>
      </div>
    </div>
  </div>
</#macro>
              
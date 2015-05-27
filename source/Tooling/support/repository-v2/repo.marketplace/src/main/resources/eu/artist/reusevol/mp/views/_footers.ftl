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

<#macro simpleScriptFooter>
<!-- jQuery 2.1.3 -->
<script src="${ctx}/plugins/jQuery/jQuery-2.1.3.min.js"></script>
<!-- Bootstrap 3.3.2 JS -->
<script src="${ctx}/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<!-- iCheck -->
<script src="${ctx}/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
<script>
$(function () {
  $('input').iCheck({
    checkboxClass: 'icheckbox_square-blue',
    radioClass: 'iradio_square-blue',
    increaseArea: '20%' // optional
  });
});
</script>
</#macro>

<#macro fullScriptFooter>
<!-- REQUIRED JS SCRIPTS -->
<!-- jQuery 2.1.3 -->
<script src="${ctx}/plugins/jQuery/jQuery-2.1.3.min.js"></script>
<script src="${ctx}/plugins/jQueryUI/jquery-ui-1.10.3.min.js"></script>
<!-- Bootstrap 3.3.2 JS -->
<script src="${ctx}/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<!-- Bootstrap Slider -->
<script src="${ctx}/plugins/bootstrap-slider/bootstrap-slider.js" type="text/javascript"></script>
<!-- iCheck -->
<script src="${ctx}/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
<!-- AdminLTE App -->
<script src="${ctx}/dist/js/app.min.js" type="text/javascript"></script>
<!-- FancyTree -->
<script src="${ctx}/plugins/fancytree/src/jquery.fancytree.js" type="text/javascript"></script>
<script src="${ctx}/plugins/fancytree/src/jquery.fancytree.columnview.js" type="text/javascript"></script>
<script src="${ctx}/plugins/fancytree/src/jquery.fancytree.filter.js" type="text/javascript"></script>
<!-- PageDown / Markdown -->
<script src="${ctx}/plugins/pagedown/Markdown.Converter.js" type="text/javascript" ></script>
<script src="${ctx}/plugins/pagedown/Markdown.Sanitizer.js" type="text/javascript" ></script>
<script src="${ctx}/plugins/pagedown/Markdown.Editor.js" type="text/javascript" ></script>
<!-- DATA TABES SCRIPT -->
<script src="${ctx}/plugins/datatables/jquery.dataTables.js" type="text/javascript"></script>
<script src="${ctx}/plugins/datatables/dataTables.bootstrap.js" type="text/javascript"></script>
<!-- ChartJS 1.0.1 -->
<script src="${ctx}/plugins/chartjs/Chart.min.js" type="text/javascript"></script>    

<!-- Optionally, you can add Slimscroll and FastClick plugins. 
      Both of these plugins are recommended to enhance the 
      user experience -->
</#macro>

<#macro mainFooter>
<!-- Main Footer -->
<footer class="main-footer">
  <!-- To the right -->
  <div class="pull-right hidden-xs">
    Funded by the European Union
  </div>
  <!-- Default to the left --> 
  <strong>Copyright &copy; 2015 <a href="http://www.artist-project.eu/" target="_blank">ARTIST Project</a>.</strong> All rights reserved.
</footer>
</#macro>

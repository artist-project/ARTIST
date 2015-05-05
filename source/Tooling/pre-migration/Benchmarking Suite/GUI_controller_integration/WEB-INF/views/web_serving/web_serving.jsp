<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>
    
    <head>
        <title>DB Benchmarking</title>
         
          <!-- Bootstrap -->
        <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.min.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/assets/styles.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/vendors/datepicker.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/vendors/uniform.default.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/vendors/chosen.min.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/vendors/wysiwyg/bootstrap-wysihtml5.css" />" rel="stylesheet" media="screen">
        <style type="text/css">
       		.wait {
       		    text-align: center;
       		    position: fixed;
				left: 550px;
				top: 300px;
				width: 100%;
				height: 100%;
				z-index: 9999;
				background:url('${pageContext.request.contextPath}/resources/images/loading.gif') 50% 50% no-repeat rgb(249, 249, 249);
						}
		</style>
    </head>
    
    <body>
<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="#">Cloud-Bench Panel</a>
				<div class="nav-collapse collapse">

					<ul class="nav">
						<li class="active"><a href="#">Dashboard</a></li>
						<li class="dropdown"><a href="#" data-toggle="dropdown"
							class="dropdown-toggle">Settings <b class="caret"></b>

						</a>
							<ul class="dropdown-menu" id="menu1">
								<li><a href="#">Reports</a></li>
								<li><a href="#">Logs</a></li>
								<li><a href="#">Errors</a></li>

							</ul></li>

					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row-fluid">

			<!--/span-->
			<div class="span3" id="sidebar">
				<ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
					<li><a href="index"><i class="icon-chevron-right"></i>
							Dashboard</a></li>
					<li><a href="db"><i class="icon-chevron-right"></i>DB </a></li>
					<li><a href="scientific"><i class="icon-chevron-right"></i>Scientific</a></li>
					<li><a href="graphics"><i class="icon-chevron-right"></i>Graphics</a></li>
					<li><a href="map_reduce"><i class="icon-chevron-right"></i>Map-Reduce</a></li>
					<li><a href="data_streaming"><i class="icon-chevron-right"></i>Data
							Streaming</a></li>
					<li><a href="media_streaming"><i
							class="icon-chevron-right"></i>Media Streaming</a></li>
					<li><a href="software_testing"><i
							class="icon-chevron-right"></i>Software Testing</a></li>
					<li><a href="web_search"><i class="icon-chevron-right"></i>Web
							Search</a></li>
					<li class="active"><a href="web_serving"><i
							class="icon-chevron-right"></i>Web Serving</a></li>

				</ul>
			</div>




			<div class="span9" id="content">
				<!-- morris stacked chart -->




				<jsp:include page="../common/nav.jsp" />


				<!-- wizard -->
				<div class="row-fluid section">

					<!-- block -->
					<div class="block">

						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">WebServing Benchmarking</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<div id="rootwizard">
									<div class="navbar">
										<div class="navbar-inner">
											<div class="container">
												<ul>
													<li><a href="#tab1" data-toggle="tab">Benchmark
															Parameters</a></li>
													<li><a href="#tab2" data-toggle="tab">Measurement
															Parameters</a></li>
													<li><a href="#tab3" data-toggle="tab">Target Cloud
															Provider</a></li>


												</ul>
											</div>
										</div>
									</div>
									<div id="bar" class="progress progress-striped active">
										<div class="bar"></div>
									</div>
									<span id="hidewait" style="visibility: hidden;"> 
                                        <div class="wait" id="wait">Take your time ,drink a coffee. The good stuff needs its time<br>The results will be ready soon</div>
                                        </span> 
										<form:form commandName="webserving" id="form2" enctype="multipart/form-data" name="myForm" cssClass="form-horizontal">
                                         <div class="tab-content">


											<jsp:include page="web_servingform.jsp" />
											<jsp:include page="../common/time.jsp" />
											<jsp:include page="../common/providers.jsp" />


											<ul class="pager wizard">
												<li class="previous first" style="display: none;"><a
													href="javascript:void(0);">First</a></li>
												<li class="previous"><a href="javascript:void(0);">Previous</a></li>
												<li class="next last" style="display: none;"><a
													href="javascript:void(0);">Last</a></li>
												<li class="next"><a href="javascript:void(0);">Next</a></li>
												<li class="next finish" style="display: none;"><a
													href="javascript:;" onmouseover="isEmpty();">Finish</a></li>
											</ul>

										</div>
									</form:form>
								</div>

							</div>
						</div>
					</div>
					<!-- /block -->
				</div>

			</div>
		</div>
		<hr>
		<footer>
			<p>&copy; Cloud-Bench 2013</p>
		</footer>
	</div>
	<!--/.fluid-container-->
	<script src="<c:url value="/resources/vendors/modernizr-2.6.2-respond-1.1.0.min.js" />"></script>
        <script src="<c:url value="/resources/vendors/jquery-1.9.1.js" />"></script>
        <script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
        <script src="<c:url value="/resources/vendors/jquery.uniform.min.js" />"></script>
        <script src="<c:url value="/resources/vendors/chosen.jquery.min.js" />"></script>
        <script src="<c:url value="/resources/vendors/bootstrap-datepicker.js" />"></script>
        <script src="<c:url value="/resources/vendors/wizard/jquery.bootstrap.wizard.min.js" />"></script>
        <script src="<c:url value="/resources/assets/scripts.js" />"></script>
        <script src="<c:url value="/resources/vendors/wysiwyg/wysihtml5-0.3.0.js" />"></script>
        <script src="<c:url value="/resources/vendors/wysiwyg/bootstrap-wysihtml5.js" />"></script>
        <script src="<c:url value="/resources/vendors/Validation.js" />"></script>
	<script>
		$(function() {
			$(".datepicker").datepicker();
			$(".uniform_on").uniform();
			$(".chzn-select").chosen();
			$('.textarea').wysihtml5();

			$('#rootwizard').bootstrapWizard(
					{
						onTabShow : function(tab, navigation, index) {
							var $total = navigation.find('li').length;
							var $current = index + 1;
							var $percent = ($current / $total) * 100;
							$('#rootwizard').find('.bar').css({
								width : $percent + '%'
							});
							// If it's the last tab then hide the last button and show the finish instead
							if ($current >= $total) {
								$('#rootwizard').find('.pager .next').hide();
								$('#rootwizard').find('.pager .finish').show();
								$('#rootwizard').find('.pager .finish')
										.removeClass('disabled');
							} else {
								$('#rootwizard').find('.pager .next').show();
								$('#rootwizard').find('.pager .finish').hide();
							}
						}
					});
			$('#rootwizard .finish').click(function() {
				//alert('Finished!, Starting over!');
				 document.myForm.submit();
                document.getElementById('form2').style.visibility = 'hidden';
                document.getElementById('wait').style.position = 'static';
                document.getElementById('hidewait').style.visibility = 'visible';
				//$('#rootwizard').find("a[href*='tab1']").trigger('click');
			});
		});
	</script>




	<script type="text/javascript">
		$("#myForm").submit(
				function(e) {
					e.preventDefault();
					$(":input").not("[type=submit]").removeClass('error').each(
							function() {
								if ($.trim($(this).val()).length == 0)
									$(this).addClass('error');
							});
				});
	</script>

    </body>

</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>

<title>Cloud-Bench TEST Home Page</title>
<!-- Bootstrap -->
        <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.min.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/assets/styles.css" />" rel="stylesheet" media="screen">
       <link href="<c:url value="/resources/vendors/easypiechart/jquery.easy-pie-chart.css" />" rel="stylesheet" media="screen">
        
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
								<li><a href="reports">Reports</a></li>
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
			<div class="span3" id="sidebar">
				<ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
					<li class="active"><a href="index"><i
							class="icon-chevron-right"></i> Dashboard</a></li>
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
					<li><a href="web_serving"><i class="icon-chevron-right"></i>Web
							Serving</a></li>
					<li><a href="Filesystem"><i class="icon-chevron-right"></i>Filesytem</a></li>
					<li><a href="Java_Applications"><i class="icon-chevron-right"></i>Java Applications</a></li>
					<li><a href="YCSB"><i class="icon-chevron-right"></i>YCSB</a></li>

				</ul>
			</div>

			<!--/span-->
			<div class="span9" id="content">
				<div class="row-fluid">
					
					
				</div>
				<div class="row-fluid">
					<!-- block -->
					
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">WELCOME</div>


						</div>
					</div>
					<div class="block-content collapse in" style="font-size: 18px;">
						Welcome to the integrated Cloud Benchmarking Solution for Cloud Providers!<br/>
						<br/>
						You can start using the existing Framework by Selecting one of the available test from the
						column to the right. Only in three simple steps you can execute the test of your choise.<br/>
						<br/>
						Be sure to take advantage the reports section of our suit , by selecting Settings -> Reports from
						the top of your screen.<br/>
						<br/>
						We sincerely hope you enjoy it!
						<br/>
						<br/>
						<br/>
						<br/>
						We feel oblidged tou inform you, that up until now , you execute only the DB , Web Serving and Map Reduce
						Tests. 
						<br/>
						Again Thank you,
						<br/>
						<br/>
						The creative team
						<br/>
						<br/>
						Qevani Elton<br/><br/>
						Stampoltas Christoforos 
				<!-- /block -->
			</div>

		</div>
		<hr>
		<footer>
			<p>&copy; Cloud-Bench 2013</p>
		</footer>
	</div>
	<!--/.fluid-container-->
	<script src="<c:url value="/resources/vendors/jquery-1.9.1.js" />"></script>
	 <script src="<c:url value="/resources/vendors/easypiechart/jquery.easy-pie-chart.js" />"></script>
	  <script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/assets/scripts.js" />"></script>
	   
      	
	<script>
		$(function() {
			// Easy pie charts
			$('.chart').easyPieChart({
				animate : 1000
			});
		});
	</script>





</body>

</html>
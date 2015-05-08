
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%
	
%>
<html>

<head>
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
					<li><a href="index"><i class="icon-chevron-right"></i>
							Dashboard</a></li>
					<li><a href="db"><i
							class="icon-chevron-right"></i>DB </a></li>
					<li><a href="scientific"><i class="icon-chevron-right"></i>Scientific</a></li>
					<li><a href="graphics"><i class="icon-chevron-right"></i>Graphics</a></li>
					<li><a href="map_reduce"><i class="icon-chevron-right"></i>Map
							Reduce</a></li>
					<li><a href="data_streaming"><i class="icon-chevron-right"></i>Data
							Streaming</a></li>
					<li><a href="media_streaming"><i
							class="icon-chevron-right"></i>Media Streaming</a></li>
					<li><a href="software_testing"><i
							class="icon-chevron-right"></i>Software Testing</a></li>
					<li><a href="web_search"><i class="icon-chevron-right"></i>Web
							Search</a></li>
					<li class="active"><a href="web_serving"><i class="icon-chevron-right"></i>Web
							Serving</a></li>

				</ul>
			</div>

			<!--/span-->
			<div class="span9" id="content">
				<div class="row-fluid">
					<div class="alert alert-success">
						<button type="button" class="close" data-dismiss="alert">&times;</button>

						The operation completed successfully!!!
					</div>
					<div class="navbar">
						<div class="navbar-inner">
							<ul class="breadcrumb">
								<li class="icon-chevron-left hide-sidebar"><a href='#'
									title="Hide Sidebar" rel='tooltip'>&nbsp;</a></li>
								<li class="icon-chevron-right show-sidebar"
									style="display: none;"><a href='#' title="Show Sidebar"
									rel='tooltip'>&nbsp;</a></li>
								<li><a href="index">Dashboard</a> <span class="divider">/</span>
								</li>


							</ul>
						</div>
					</div>
				</div>
				
				
				

				<div class="row-fluid">
					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Statistics for Time</div>


						</div>
					</div>
					<div class="block-content collapse in">
						<div class="span3">
							<div class="chart" data-percent="${total_sec}">
								<font size="1">  ${total_sec} millisec
									 </font>
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Overall Run Time</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${kbpersec}">${kbpersec}</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Throughput</span>

							</div>
						</div>
					</div>

					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Statistics for Requests</div>


						</div>
					</div>


				</div>
				
				
				<div class="block-content collapse in">
					<div class="span3">
						<div class="chart" data-percent="${totalreq}">${totalreq}</div>
						<div class="chart-bottom-heading">
							<span class="label label-info"> Total Requests </span>

						</div>
					</div>
					<div class="span3">
						<div class="chart" data-percent="${failedreq}">	${failedreq}</div>
					
						<div class="chart-bottom-heading">
							<span class="label label-info"> Failed Requests </span>

						</div>
					</div>
					<div class="span3">
						<div class="chart" data-percent="${success}">${success}%</div>
						<div class="chart-bottom-heading">
							<span class="label label-info">Success </span>

						</div>
					</div>
				</div>
				<div class="block">
					<div class="navbar navbar-inner block-header">
						<div class="muted pull-left">Statistics for Traffic</div>


					</div>
				</div>
				<div class="block-content collapse in">
					<div class="span3">
						<div class="chart" data-percent="${traffictotal}">${traffictotal}</div>
						<div class="chart-bottom-heading">
							<span class="label label-info">Total Bytes</span>

						</div>
					</div>
					<div class="span3">
						<div class="chart" data-percent="${traffichttp}">${traffichttp}</div>
						<div class="chart-bottom-heading">
							<span class="label label-info">Http Bytes</span>

						</div>
					</div>
					<div class="span3">
						<div class="chart" data-percent="${trafficdata}">${trafficdata}</div>
						<div class="chart-bottom-heading">
							<span class="label label-info">Data Bytes</span>

						</div>
					</div>

				</div>


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
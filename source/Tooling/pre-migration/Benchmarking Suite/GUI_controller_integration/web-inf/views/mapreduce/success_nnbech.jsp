
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%

%>
<html>

<head>
<title>NNBench</title>
<!-- Bootstrap -->
 <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.min.css" />" rel="stylesheet" media="screen">
        <link href="<c:url value="/resources/assets/styles.css" />" rel="stylesheet" media="screen">
       <link href="<c:url value="/resources/vendors/easypiechart/jquery.easy-pie-chart.css" />" rel="stylesheet" media="screen">




<script type="text/javascript"
	src="<c:url value="/resources/vendors/modernizr-2.6.2-respond-1.1.0.min.js" />"></script>
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
					<li class="active"><a href="map_reduce"><i class="icon-chevron-right"></i>Map
							Reduce</a></li>
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
							<div class="muted pull-left">Statistics for NNBench Write</div>


						</div>
					</div>

					<div class="block-content collapse in">
						<div class="span3">
							<div class="chart"
								data-percent="${tps_write}">
								${tps_write}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">TPS </span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${Avg_Exec_time_write}">
								${Avg_Exec_time_write}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Avg exec time (ms)
								</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${Avg_Lat_write}">
								${Avg_Lat_write}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info"> Avg Lat (ms)
									</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart"
								 data-percent="${Longest_Map_Time_write}">
								${Longest_Map_Time_write}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Longest Map Time (ms)</span>

							</div>
						</div>
					</div>
				</div>
				
				<div class="row-fluid">
					<!-- block -->

					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Statistics for NNBench Read</div>


						</div>
					</div>

					<div class="block-content collapse in">
						<div class="span3">
							<div class="chart"
								data-percent="${tps_read}">
								${tps_read}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">TPS </span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${Avg_Exec_time_read}">
								${Avg_Exec_time_read}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Avg exec time (ms)
								</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${Avg_Lat_read}">
								${Avg_Lat_read}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info"> Avg Lat (ms)
									</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart"
								 data-percent="${Longest_Map_Time_read}">
								${Longest_Map_Time_read}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Longest Map Time (ms)</span>

							</div>
						</div>
					</div>
				</div>
				
				<div class="row-fluid">
					<!-- block -->

					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Statistics for NNBench Delete</div>


						</div>
					</div>

					<div class="block-content collapse in">
						<div class="span3">
							<div class="chart"
								data-percent="${tps_delete}">
								${tps_delete}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">TPS </span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${Avg_Exec_time_delete}">
								${Avg_Exec_time_delete}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Avg exec time (ms)
								</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${Avg_Lat_delete}">
								${Avg_Lat_delete}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info"> Avg Lat (ms)
									</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart"
								 data-percent="${Longest_Map_Time_delete}">
								${Longest_Map_Time_delete}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Longest Map Time (ms)</span>

							</div>
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
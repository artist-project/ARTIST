
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%

%>
<html>

<head>
<title>DFSIO</title>
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
					<li><a href="Filesystem"><i class="icon-chevron-right"></i>Filesytem</a></li>
					<li><a href="Java_Applications"><i class="icon-chevron-right"></i>Java Applications</a></li>
					<li><a href="YCSB"><i class="icon-chevron-right"></i>YCSB</a></li>
							

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
							<div class="muted pull-left">Statistics for DFSIO Write</div>


						</div>
					</div>
 

					<div class="block-content collapse in">
						<div class="span3">
							<div class="chart"
								data-percent="${write_throughput}">
								${write_throughput}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Throughput (mb/sec)</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${write_average_io}">
								${write_average_io}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Average I/O (mb/sec)
								</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${write_io_rate_std}">
								${write_io_rate_std}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">I/O Rate std deviation
									</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart"
								 data-percent="${write_test_exec_time}">
								${write_test_exec_time}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Total Execution time (sec)</span>

							</div>
						</div>
					</div>
				</div>

				<!-- /block -->
			
			<div class="row-fluid">
					<!-- block -->

					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Statistics for DFSIO Write 2</div>


						</div>
					</div>


					<div class="block-content collapse in">
						<div class="span3">
							<div class="chart"
								data-percent="${write_total_mb_processed}">
								${write_total_mb_processed}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Total Mb Processed</span>

							</div>
						</div>
						
						
						
					</div>
				</div>
				<div class="row-fluid">
					<!-- block -->

					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Statistics for DFSIO Read</div>


						</div>
					</div>
 

					<div class="block-content collapse in">
						<div class="span3">
							<div class="chart"
								data-percent="${throughput}">
								${throughput}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Throughput (mb/sec)</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${average_io}">
								${average_io}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Average I/O (mb/sec)
								</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart" data-percent="${io_rate_std}">
								${io_rate_std}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">I/O Rate std deviation
									</span>

							</div>
						</div>
						<div class="span3">
							<div class="chart"
								 data-percent="${test_exec_time}">
								${test_exec_time}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Total Execution time (sec)</span>

							</div>
						</div>
					</div>
				</div>

				<!-- /block -->
			
			<div class="row-fluid">
					<!-- block -->

					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Statistics for DFSIO Read 2</div>


						</div>
					</div>


					<div class="block-content collapse in">
						<div class="span3">
							<div class="chart"
								data-percent="${total_mb_processed}">
								${total_mb_processed}
							</div>
							<div class="chart-bottom-heading">
								<span class="label label-info">Total Mb Processed</span>

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
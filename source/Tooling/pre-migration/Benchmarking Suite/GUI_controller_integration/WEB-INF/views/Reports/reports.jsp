<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>

<head>
<title>Reports</title>

<!-- Bootstrap -->
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet" media="screen">
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.min.css" />"
	rel="stylesheet" media="screen">
<link href="<c:url value="/resources/assets/styles.css" />"
	rel="stylesheet" media="screen">
<link href="<c:url value="/resources/vendors/datepicker.css" />"
	rel="stylesheet" media="screen">
<link href="<c:url value="/resources/vendors/uniform.default.css" />"
	rel="stylesheet" media="screen">
<link href="<c:url value="/resources/vendors/chosen.min.css" />"
	rel="stylesheet" media="screen">
<link
	href="<c:url value="/resources/vendors/wysiwyg/bootstrap-wysihtml5.css" />"
	rel="stylesheet" media="screen">
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
					<li><a href="web_serving"><i class="icon-chevron-right"></i>Web
							Serving</a></li>
					<li><a href="Filesystem"><i class="icon-chevron-right"></i>Filesytem</a></li>
					<li><a href="Java_Applications"><i class="icon-chevron-right"></i>Java Applications</a></li>
					<li><a href="YCSB"><i class="icon-chevron-right"></i>YCSB</a></li>
				</ul>
			</div>




			<div class="span9" id="content">
				<!-- morris stacked chart -->







				<!-- wizard -->
				<div class="row-fluid section">

					<!-- block -->
					<div class="block">

						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Reports</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<div id="rootwizard">
									<div class="navbar">
										<div class="navbar-inner">
											<div class="container">
												<ul>
													<li><a href="#tab1" data-toggle="tab">Report
															Creator</a></li>



												</ul>
											</div>
										</div>
									</div>
									<div id="bar" class="progress progress-striped active">
										<div class="bar"></div>
									</div>
									<form:form commandName="report" enctype="multipart/form-data"
										name="myForm" cssClass="form-horizontal">
										<div class="tab-content">



											<fieldset>

												<div class="control-group">
												
												
												
												<div class="control-group">

														<label class="control-label" for="focusedInput">Input Weights for Average</label>

														<div class="controls">
															<form:input class="input-xlarge focused"
																
																onkeypress="return isNumeric(event)" id="focusedInput"
																type="text" value="" path="avg_weight" name="avg_weight" />
														</div>
														<table class="ds_box controls" cellpadding="0"
															cellspacing="0" id="ds_conclass" style="display: none;">
															<tr>
																<td id="ds_calclass"></td>
															</tr>
														</table>
													</div>
													
													<div class="control-group">

														<label class="control-label" for="focusedInput">Input Weights for Cost</label>

														<div class="controls">
															<form:input class="input-xlarge focused"
																
																onkeypress="return isNumeric(event)" id="focusedInput"
																type="text" value="" path="cost_weight" name="cost_weight" />
														</div>
														<table class="ds_box controls" cellpadding="0"
															cellspacing="0" id="ds_conclass" style="display: none;">
															<tr>
																<td id="ds_calclass"></td>
															</tr>
														</table>
													</div>
												
												
												
												
												

													<div class="control-group">




														<label class="control-label" for="focusedInput">Start
															Date</label>

														<div class="controls">
															<form:input class="input-xlarge focused"
																onclick="ds_sh(this);"
																onkeypress="return isNumeric(event)" id="focusedInput"
																type="text" value="" path="sdate" name="centenary" />
														</div>
														<table class="ds_box controls" cellpadding="0"
															cellspacing="0" id="ds_conclass" style="display: none;">
															<tr>
																<td id="ds_calclass"></td>
															</tr>
														</table>
													</div>

													<div class="control-group">




														<label class="control-label" for="focusedInput">End
															Date Date</label>

														<div class="controls">
															<form:input class="input-xlarge focused"
																onclick="ds_sh(this);"
																onkeypress="return isNumeric(event)" id="focusedInput"
																type="text" value="" path="edate" name="centenary" />
														</div>
														<table class="ds_box controls" cellpadding="0"
															cellspacing="0" id="ds_conclass" style="display: none;">
															<tr>
																<td id="ds_calclass"></td>
															</tr>
														</table>
													</div>
													
													<div class="control-group">
														<label class="control-label" for="select01">Select
															VM Instance</label>
														<div class="controls">
															<form:select name="vm_type" id="vm_type" class=""
																path="vm_type" >
																<option>--</option>
																<option value="0">t1.micro</option>
																<option value="1">m1.tiny</option>
																<option value="2">m1.small</option>
																<option value="3">m1.medium</option>
																<option value="4">m1.large</option>
																<option value="5">m1.xlarge</option>
																<option value="6">default_azure</option>
																<option value="7">1Gb-1CPU_flexiant</option>
																<option value="8">2Gb-2CPU_flexiant</option>
																<option value="9">4Gb-2CPU_flexiant</option>
																<option value="10">4Gb-3CPU_flexiant</option>
																<option value="11">4Gb-4CPU_flexiant</option>
															</form:select>

														</div>

													</div>

													<div class="control-group">
														<label class="control-label" for="select01">Select
															Cloud Test</label>
														<div class="controls">
															<form:select name="test" id="database" class=""
																path="test" onchange="addFields();">
																<option>--</option>
																<option>Database</option>
																<option>Web Serving</option>
																<option>Map Reduce</option>
																<option>Filesystem</option>
																<option>Java Applications</option>
																<option>YCSB</option>
															</form:select>

														</div>

													</div>

													<div class="control-group">
														<label id="new2" class="control-label" for="select01"></label>
														<div id="new" class="controls"></div>
														<div id="new3" class="controls"></div>

													</div>
											</fieldset>



											<ul class="pager wizard">
												<li class="previous first" style="display: none;"><a
													href="javascript:void(0);">First</a></li>
												<li class="previous"><a href="javascript:void(0);">Previous</a></li>
												<li class="next last" style="display: none;"><a
													href="javascript:void(0);">Last</a></li>
												<li class="next"><a href="javascript:void(0);">Next</a></li>
												<li class="next finish" style="display: none;"><a
													href="javascript:;" onmouseover="percent();">Finish</a></li>
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
	<script
		src="<c:url value="/resources/vendors/modernizr-2.6.2-respond-1.1.0.min.js" />"></script>
	<script src="<c:url value="/resources/vendors/jquery-1.9.1.js" />"></script>
	<script
		src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
	<script
		src="<c:url value="/resources/vendors/jquery.uniform.min.js" />"></script>
	<script src="<c:url value="/resources/vendors/chosen.jquery.min.js" />"></script>
	<script
		src="<c:url value="/resources/vendors/bootstrap-datepicker.js" />"></script>
	<script
		src="<c:url value="/resources/vendors/wizard/jquery.bootstrap.wizard.min.js" />"></script>
	<script src="<c:url value="/resources/assets/scripts.js" />"></script>
	<script
		src="<c:url value="/resources/vendors/wysiwyg/wysihtml5-0.3.0.js" />"></script>
	<script
		src="<c:url value="/resources/vendors/wysiwyg/bootstrap-wysihtml5.js" />"></script>
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

	<script type="text/javascript">
		// Project: Dynamic Date Selector (DtTvB) - 2006-03-16
		// Script featured on JavaScript Kit- http://www.javascriptkit.com
		// Code begin...
		// Set the initial date.
		var ds_i_date = new Date();
		ds_c_month = ds_i_date.getMonth() + 1;
		ds_c_year = ds_i_date.getFullYear();

		// Get Element By Id
		function ds_getel(id) {
			return document.getElementById(id);
		}

		// Get the left and the top of the element.
		function ds_getleft(el) {
			var tmp = el.offsetLeft;
			el = el.offsetParent
			while (el) {
				tmp += el.offsetLeft;
				el = el.offsetParent;
			}
			return tmp;
		}
		function ds_gettop(el) {
			var tmp = el.offsetTop;
			el = el.offsetParent
			while (el) {
				tmp += el.offsetTop;
				el = el.offsetParent;
			}
			return tmp;
		}

		// Output Element
		var ds_oe = ds_getel('ds_calclass');
		// Container
		var ds_ce = ds_getel('ds_conclass');

		// Output Buffering
		var ds_ob = '';
		function ds_ob_clean() {
			ds_ob = '';
		}
		function ds_ob_flush() {
			ds_oe.innerHTML = ds_ob;
			ds_ob_clean();
		}
		function ds_echo(t) {
			ds_ob += t;
		}

		var ds_element; // Text Element...

		var ds_monthnames = [ 'January', 'February', 'March', 'April', 'May',
				'June', 'July', 'August', 'September', 'October', 'November',
				'December' ]; // You can translate it for your language.

		var ds_daynames = [ 'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat' ]; // You can translate it for your language.

		// Calendar template
		function ds_template_main_above(t) {
			return '<table cellpadding="3" cellspacing="1" class="ds_tbl">'
					+ '<tr>'
					+ '<td class="ds_head" style="cursor: pointer" onclick="ds_py();"><<</td>'
					+ '<td class="ds_head" style="cursor: pointer" onclick="ds_pm();"><</td>'
					+ '<td class="ds_head" style="cursor: pointer" onclick="ds_hi();" colspan="3">[Close]</td>'
					+ '<td class="ds_head" style="cursor: pointer" onclick="ds_nm();">></td>'
					+ '<td class="ds_head" style="cursor: pointer" onclick="ds_ny();">>></td>'
					+ '</tr>' + '<tr>' + '<td colspan="7" class="ds_head">' + t
					+ '</td>' + '</tr>' + '<tr>';
		}

		function ds_template_day_row(t) {
			return '<td class="ds_subhead">' + t + '</td>';
			// Define width in CSS, XHTML 1.0 Strict doesn't have width property for it.
		}

		function ds_template_new_week() {
			return '</tr><tr>';
		}

		function ds_template_blank_cell(colspan) {
			return '<td colspan="' + colspan + '"></td>'
		}

		function ds_template_day(d, m, y) {
			return '<td class="ds_cell" onclick="ds_onclick(' + d + ',' + m
					+ ',' + y + ')">' + d + '</td>';
			// Define width the day row.
		}

		function ds_template_main_below() {
			return '</tr>' + '</table>';
		}

		// This one draws calendar...
		function ds_draw_calendar(m, y) {
			// First clean the output buffer.
			ds_ob_clean();
			// Here we go, do the header
			ds_echo(ds_template_main_above(ds_monthnames[m - 1] + ' ' + y));
			for (i = 0; i < 7; i++) {
				ds_echo(ds_template_day_row(ds_daynames[i]));
			}
			// Make a date object.
			var ds_dc_date = new Date();
			ds_dc_date.setMonth(m - 1);
			ds_dc_date.setFullYear(y);
			ds_dc_date.setDate(1);
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10
					|| m == 12) {
				days = 31;
			} else if (m == 4 || m == 6 || m == 9 || m == 11) {
				days = 30;
			} else {
				days = (y % 4 == 0) ? 29 : 28;
			}
			var first_day = ds_dc_date.getDay();
			var first_loop = 1;
			// Start the first week
			ds_echo(ds_template_new_week());
			// If sunday is not the first day of the month, make a blank cell...
			if (first_day != 0) {
				ds_echo(ds_template_blank_cell(first_day));
			}
			var j = first_day;
			for (i = 0; i < days; i++) {
				// Today is sunday, make a new week.
				// If this sunday is the first day of the month,
				// we've made a new row for you already.
				if (j == 0 && !first_loop) {
					// New week!!
					ds_echo(ds_template_new_week());
				}
				// Make a row of that day!
				ds_echo(ds_template_day(i + 1, m, y));
				// This is not first loop anymore...
				first_loop = 0;
				// What is the next day?
				j++;
				j %= 7;
			}
			// Do the footer
			ds_echo(ds_template_main_below());
			// And let's display..
			ds_ob_flush();
			// Scroll it into view.
			ds_ce.scrollIntoView();
		}

		// A function to show the calendar.
		// When user click on the date, it will set the content of t.
		function ds_sh(t) {
			// Set the element to set...
			ds_element = t;
			// Make a new date, and set the current month and year.
			var ds_sh_date = new Date();
			ds_c_month = ds_sh_date.getMonth() + 1;
			ds_c_year = ds_sh_date.getFullYear();
			// Draw the calendar
			ds_draw_calendar(ds_c_month, ds_c_year);
			// To change the position properly, we must show it first.
			ds_ce.style.display = '';
			// Move the calendar container!
			the_left = ds_getleft(t);
			the_top = ds_gettop(t) + t.offsetHeight;
			ds_ce.style.left = the_left + 'px';
			ds_ce.style.top = the_top + 'px';
			// Scroll it into view.
			ds_ce.scrollIntoView();
		}

		// Hide the calendar.
		function ds_hi() {
			ds_ce.style.display = 'none';
		}

		// Moves to the next month...
		function ds_nm() {
			// Increase the current month.
			ds_c_month++;
			// We have passed December, let's go to the next year.
			// Increase the current year, and set the current month to January.
			if (ds_c_month > 12) {
				ds_c_month = 1;
				ds_c_year++;
			}
			// Redraw the calendar.
			ds_draw_calendar(ds_c_month, ds_c_year);
		}

		// Moves to the previous month...
		function ds_pm() {
			ds_c_month = ds_c_month - 1; // Can't use dash-dash here, it will make the page invalid.
			// We have passed January, let's go back to the previous year.
			// Decrease the current year, and set the current month to December.
			if (ds_c_month < 1) {
				ds_c_month = 12;
				ds_c_year = ds_c_year - 1; // Can't use dash-dash here, it will make the page invalid.
			}
			// Redraw the calendar.
			ds_draw_calendar(ds_c_month, ds_c_year);
		}

		// Moves to the next year...
		function ds_ny() {
			// Increase the current year.
			ds_c_year++;
			// Redraw the calendar.
			ds_draw_calendar(ds_c_month, ds_c_year);
		}

		// Moves to the previous year...
		function ds_py() {
			// Decrease the current year.
			ds_c_year = ds_c_year - 1; // Can't use dash-dash here, it will make the page invalid.
			// Redraw the calendar.
			ds_draw_calendar(ds_c_month, ds_c_year);
		}

		// Format the date to output.
		function ds_format_date(d, m, y) {
			// 2 digits month.
			m2 = '00' + m;
			m2 = m2.substr(m2.length - 2);
			// 2 digits day.
			d2 = '00' + d;
			d2 = d2.substr(d2.length - 2);
			// YYYY-MM-DD
			return y + '-' + m2 + '-' + d2;
		}

		// When the user clicks the day.
		function ds_onclick(d, m, y) {
			// Hide the calendar.
			ds_hi();
			// Set the value of it, if we can.
			if (typeof (ds_element.value) != 'undefined') {
				ds_element.value = ds_format_date(d, m, y);
				// Maybe we want to set the HTML in it.
			} else if (typeof (ds_element.innerHTML) != 'undefined') {
				ds_element.innerHTML = ds_format_date(d, m, y);
				// I don't know how should we display it, just alert it to user.
			} else {
				alert(ds_format_date(d, m, y));
			}
		}

		// And here is the end.
	// ]]> -->
	</script>
	
	<script language="javascript" type="text/javascript">
	function percent(){
		 weight_cost = document.myForm.cost_weight.value;
		 weight_average = document.myForm.avg_weight.value;
		 sum =parseFloat(weight_cost)+parseFloat(weight_average);
		if(sum != 1){
			alert("the sum of the weights must be 1.0! Please make neccessary corrections!!")
		}
	}
	</script>

	<script language="javascript" type="text/javascript">
		function addFields() {

			var firstDD = document.myForm.test.value;

			switch (firstDD) {
			case 'Map Reduce':

				var container = document.getElementById("new");
				var container2 = document.getElementById("new2");
				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				while (container2.hasChildNodes()) {
					container2.removeChild(container2.lastChild);
				}

				container2.appendChild(document
						.createTextNode("Map Reduce Test Type "));

				var input = document.createElement("select");
				input.type = "select";
				input.name = "mr_type";
				input.id = "mr_type";
				input.setAttribute('path', 'mr_type');
				container.appendChild(input);

				var container3 = document.getElementById("mr_type");

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}
				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				opt1.value = "dfsio";
				opt1.innerHTML = "dfsio";
				container3.appendChild(opt1);
				opt2.value = "nn";
				opt2.innerHTML = "nn";
				container3.appendChild(opt2);
				opt3.value = "teragen";
				opt3.innerHTML = "teragen";
				container3.appendChild(opt3);
				opt4.value = "mrbench";
				opt4.innerHTML = "mrbench";
				container3.appendChild(opt4);
				break;

				//
			case 'Filesystem':
				var container = document.getElementById("new");
				var container2 = document.getElementById("new2");

				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				while (container2.hasChildNodes()) {
					container2.removeChild(container2.lastChild);
				}
				container2.appendChild(document
						.createTextNode("Select tool "));
				container2.appendChild(document.createElement("br"));
				container2.appendChild(document.createElement("br"));
				var input = document.createElement("select");
				input.type = "select";
				input.name = "tool";
				input.id = "tool";
				input.setAttribute('path', 'tool');
				container.appendChild(input);
				container2.appendChild(document
						.createTextNode("Select workload "));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));

				var input = document.createElement("select");
				input.type = "select";
				input.name = "workload";
				input.id = "workload";
				input.setAttribute('path', 'workload');

				container.appendChild(input);

				var container3 = document.getElementById("tool");

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}

				var opt1 = document.createElement('option');
				opt1.value = "filebench";
				opt1.innerHTML = "Filebench";
				container3.appendChild(opt1);
				
				var container3 = document.getElementById("workload");

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}

				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				var opt5 = document.createElement('option');
				var opt6 = document.createElement('option');
				var opt7 = document.createElement('option');
				var opt8 = document.createElement('option');
				var opt9 = document.createElement('option');
				var opt10 = document.createElement('option');
				var opt11 = document.createElement('option');
				var opt12 = document.createElement('option');
				var opt13 = document.createElement('option');
				var opt14 = document.createElement('option');
				var opt15 = document.createElement('option');
				var opt16 = document.createElement('option');
				var opt17 = document.createElement('option');
				var opt18 = document.createElement('option');
				var opt19 = document.createElement('option');
				opt1.value = "singlestreamread";
				opt1.innerHTML = "singlestreamread";
				container3.appendChild(opt1);
				
				opt2.value = "singlestreamreaddirect";
				opt2.innerHTML = "singlestreamreaddirect";
				container3.appendChild(opt2);
				
				opt3.value = "fivestreamread";
				opt3.innerHTML = "fivestreamread";
				container3.appendChild(opt3);
				
				opt4.value = "fivestreamreaddirect";
				opt4.innerHTML = "fivestreamreaddirect";
				container3.appendChild(opt4);
				
				opt5.value = "singlestreamwrite";
				opt5.innerHTML = "singlestreamwrite";
				container3.appendChild(opt5);
				
				opt6.value = "singlestreamwritedirect";
				opt6.innerHTML = "singlestreamwritedirect";
				container3.appendChild(opt6);
				
				opt7.value = "fivestreamwrite";
				opt7.innerHTML = "fivestreamwrite";
				container3.appendChild(opt7);
				
				opt8.value = "fivestreamwritedirect";
				opt8.innerHTML = "fivestreamwritedirect";
				container3.appendChild(opt8);
				
				opt9.value = "randomread";
				opt9.innerHTML = "randomread";
				container3.appendChild(opt9);
				
				opt10.value = "randomwrite";
				opt10.innerHTML = "randomwrite";
				container3.appendChild(opt10);
				
				opt11.value = "randomrw";
				opt11.innerHTML = "randomrw";
				container3.appendChild(opt11);
				
				opt12.value = "createfiles";
				opt12.innerHTML = "createfiles";
				container3.appendChild(opt12);
				
				opt13.value = "copyfiles";
				opt13.innerHTML = "copyfiles";
				container3.appendChild(opt13);
				
				opt14.value = "webserver";
				opt14.innerHTML = "webserver";
				container3.appendChild(opt14);
				
				opt15.value = "fileserver";
				opt15.innerHTML = "fileserver";
				container3.appendChild(opt15);
				
				opt16.value = "varmail";
				opt16.innerHTML = "varmail";
				container3.appendChild(opt16);
				
				opt17.value = "oltp";
				opt17.innerHTML = "oltp";
				container3.appendChild(opt17);
				
				opt18.value = "webproxy";
				opt18.innerHTML = "webproxy";
				container3.appendChild(opt18);
				
				opt19.value = "videoserver";
				opt19.innerHTML = "videoserver";
				container3.appendChild(opt19);
				break;
				//
				
			case 'Java Applications':
				var container = document.getElementById("new");
				var container2 = document.getElementById("new2");

				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				while (container2.hasChildNodes()) {
					container2.removeChild(container2.lastChild);
				}
				container2.appendChild(document
						.createTextNode("Select tool "));
				container2.appendChild(document.createElement("br"));
				container2.appendChild(document.createElement("br"));
				var input = document.createElement("select");
				input.type = "select";
				input.name = "tool";
				input.id = "tool";
				input.setAttribute('path', 'tool');
				container.appendChild(input);
				container2.appendChild(document
						.createTextNode("Select workload "));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));

				var input = document.createElement("select");
				input.type = "select";
				input.name = "workload";
				input.id = "workload";
				input.setAttribute('path', 'workload');

				container.appendChild(input);

				var container3 = document.getElementById("tool");

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}

				var opt1 = document.createElement('option');
				opt1.value = "filebench";
				opt1.innerHTML = "DaCapo Suite";
				container3.appendChild(opt1);
				
				var container3 = document.getElementById("workload");

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}

				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				var opt5 = document.createElement('option');
				var opt6 = document.createElement('option');
				var opt7 = document.createElement('option');
				var opt8 = document.createElement('option');
				var opt9 = document.createElement('option');
				var opt10 = document.createElement('option');
				var opt11 = document.createElement('option');
				var opt12 = document.createElement('option');
				var opt13 = document.createElement('option');
				var opt14 = document.createElement('option');

				opt1.value = "avrora";
				opt1.innerHTML = "avrora";
				container3.appendChild(opt1);
				
				opt2.value = "batik";
				opt2.innerHTML = "batik";
				container3.appendChild(opt2);
				
				opt3.value = "eclipse";
				opt3.innerHTML = "eclipse";
				container3.appendChild(opt3);
				
				opt4.value = "fop";
				opt4.innerHTML = "fop";
				container3.appendChild(opt4);
				
				opt5.value = "h2";
				opt5.innerHTML = "h2";
				container3.appendChild(opt5);
				
				opt6.value = "jython";
				opt6.innerHTML = "jython";
				container3.appendChild(opt6);
				
				opt7.value = "luindex";
				opt7.innerHTML = "luindex";
				container3.appendChild(opt7);
				
				opt8.value = "lusearch";
				opt8.innerHTML = "lusearch";
				container3.appendChild(opt8);
				
				opt9.value = "pmd";
				opt9.innerHTML = "pmd";
				container3.appendChild(opt9);
				
				opt10.value = "sunflow";
				opt10.innerHTML = "sunflow";
				container3.appendChild(opt10);
				
				opt11.value = "tomcat";
				opt11.innerHTML = "tomcat";
				container3.appendChild(opt11);
				
				opt12.value = "tradebeans";
				opt12.innerHTML = "tradebeans";
				container3.appendChild(opt12);
				
				opt13.value = "tradesoap";
				opt13.innerHTML = "tradesoap";
				container3.appendChild(opt13);
				
				opt14.value = "xalan";
				opt14.innerHTML = "xalan";
				container3.appendChild(opt14);
				
				break;
				
			case 'Database':
				var container = document.getElementById("new");
				var container2 = document.getElementById("new2");

				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				while (container2.hasChildNodes()) {
					container2.removeChild(container2.lastChild);
				}
				container2.appendChild(document
						.createTextNode("Select Database "));
				container2.appendChild(document.createElement("br"));
				container2.appendChild(document.createElement("br"));

				var input = document.createElement("select");
				input.type = "select";
				input.name = "database2";
				input.id = "database2";
				input.setAttribute('path', 'database2');
				container.appendChild(input);

				container2.appendChild(document
						.createTextNode("Select Workload "));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));

				var input = document.createElement("select");
				input.type = "select";
				input.name = "workload";
				input.id = "workload";
				input.setAttribute('path', 'workload');

				container.appendChild(input);

				var container3 = document.getElementById("database2");

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}

				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				opt1.value = "mongodb";
				opt1.innerHTML = "MongoDB";
				container3.appendChild(opt1);
				opt2.value = "mysql";
				opt2.innerHTML = "Mysql";
				container3.appendChild(opt2);
				opt3.value = "posrgre";
				opt3.innerHTML = "Postgre";
				container3.appendChild(opt3);
				opt4.value = "cassandra";
				opt4.innerHTML = "Cassandra";
				container3.appendChild(opt4);

				var container3 = document.getElementById("workload");

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}

				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				opt1.value = "workloada";
				opt1.innerHTML = "Workload A";
				container3.appendChild(opt1);
				opt2.value = "workloadb";
				opt2.innerHTML = "Workload B";
				container3.appendChild(opt2);
				opt3.value = "workloadc";
				opt3.innerHTML = "Workload C";
				container3.appendChild(opt3);
				opt4.value = "workloadd";
				opt4.innerHTML = "Workload D";
				container3.appendChild(opt4);
				opt5.value = "workloade";
				opt5.innerHTML = "Workload E";
				container3.appendChild(opt5);

				break;
			case 'YCSB':
				var container = document.getElementById("new");
				var container2 = document.getElementById("new2");

				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				while (container2.hasChildNodes()) {
					container2.removeChild(container2.lastChild);
				}
				container2.appendChild(document
						.createTextNode("Select Database "));
				container2.appendChild(document.createElement("br"));
				container2.appendChild(document.createElement("br"));

				var input = document.createElement("select");
				input.type = "select";
				input.name = "database2";
				input.id = "database2";
				input.setAttribute('path', 'database2');
				container.appendChild(input);

				container2.appendChild(document
						.createTextNode("Select Workload "));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));

				var input = document.createElement("select");
				input.type = "select";
				input.name = "workload";
				input.id = "workload";
				input.setAttribute('path', 'workload');

				container.appendChild(input);

				var container3 = document.getElementById("database2");

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}

				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				var opt5 = document.createElement('option');
				opt1.value = "mongodb";
				opt1.innerHTML = "MongoDB";
				container3.appendChild(opt1);
				opt2.value = "mysql_jdbc";
				opt2.innerHTML = "Mysql_jdbc";
				container3.appendChild(opt2);
				opt3.value = "postgres";
				opt3.innerHTML = "Postgres";
				container3.appendChild(opt3);
				opt4.value = "cassandra";
				opt4.innerHTML = "Cassandra";
				container3.appendChild(opt4);
				opt5.value = "basic";
				opt5.innerHTML = "Basic";
				container3.appendChild(opt5);
				var container3 = document.getElementById("workload");

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}

				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				var opt5 = document.createElement('option');
				var opt6 = document.createElement('option');

				opt1.value = "workloada";
				opt1.innerHTML = "Workload A";
				container3.appendChild(opt1);
				opt2.value = "workloadb";
				opt2.innerHTML = "Workload B";
				container3.appendChild(opt2);
				opt3.value = "workloadc";
				opt3.innerHTML = "Workload C";
				container3.appendChild(opt3);
				opt4.value = "workloadd";
				opt4.innerHTML = "Workload D";
				container3.appendChild(opt4);
				opt5.value = "workloade";
				opt5.innerHTML = "Workload E";
				container3.appendChild(opt5);
				opt6.value = "workloadf";
				opt6.innerHTML = "Workload F";
				container3.appendChild(opt6);

				break;

			case 'Web Serving':
				var container = document.getElementById("new");
				var container2 = document.getElementById("new2");
				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				while (container2.hasChildNodes()) {
					container2.removeChild(container2.lastChild);
				}
				container2.appendChild(document
						.createTextNode("Select Web Server "));
				container2.appendChild(document.createElement("br"));
				container2.appendChild(document.createElement("br"));

				var input = document.createElement("select");
				input.type = "select";
				input.name = "webserver";
				input.id = "webserver";
				input.setAttribute('path', 'webserver');
				container.appendChild(input);
				
				var container3 = document.getElementById("webserver");
				

				var length = container3.options.length;
				for (i = container3.options.length - 1; i >= 0; i--) {
					container3.remove(i);
				}

				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				opt1.value = "apache2.2";
				opt1.innerHTML = "Apache 2.2";
				container3.appendChild(opt1);
				opt2.value = "nginx";
				opt2.innerHTML = "Nginx";
				container3.appendChild(opt2);
				opt3.value = "apache2.4";
				opt3.innerHTML = "Apache 2.4";
				container3.appendChild(opt3);
				opt4.value = "lighttpd";
				opt4.innerHTML = "Lighttpd";
				container3.appendChild(opt4);

				

				
				break;
			case '--':
				var container = document.getElementById("new");
				var container2 = document.getElementById("new2");
				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				while (container2.hasChildNodes()) {
					container2.removeChild(container2.lastChild);
				}
				
				
				break;
			}
		}
	</script>
</body>

</html>
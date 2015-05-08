<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>

<head>
<title>DB Benchmarking</title>


<!-- Bootstrap -->
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet" media="screen">
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.min.css" />"
	rel="stylesheet" media="screen">
<link href="<c:url value="/resources/assets/styles.css" />"
	rel="stylesheet" media="screen">


</head>
<body>
	<div class="tab-pane" id="tab1">

		<fieldset>
			<div class="control-group">
				<label class="control-label" for="select01">Select Database</label>
				<div class="controls">
					<form:select name="database" id="database" class="" path="database">
						<option value="mongodb">MongoDB</option>
						<option value="mysql">Mysql</option>
						<option value="postgre">Postgre</option>
						<option value="cassandra">Cassandra</option>
					</form:select>
				</div>
			</div>

			<div class="control-group">

				<div class="controls">
					<button class="btn btn-primary" type="button"
						onclick="TurntoDefaults();">Load Defaults</button>
				</div>
			</div>



			<div class="control-group">
				<label class="control-label" for="focusedInput">Threads</label>
				<div class="controls">
					<form:input class="input-xlarge focused"
						onkeypress="return isNumeric(event)" id="focusedInput" type="text"
						path="threads" name="threads" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="focusedInput">Target</label>
				<div class="controls">
					<form:input class="input-xlarge focused"
						onkeypress="return isNumeric(event)" id="focusedInput" type="text"
						value="" path="target" />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="select01">WorkLoad </label>
				<div class="controls">
					<form:select id="select01" name="workload" path="workload" class=""
						onChange="toggleT3();">
                        <option>--</option>
						<option value='workloada'>Light WorkLoad</option>
						<option value='workloadb'>Medium WorkLoad</option>
						<option value='workloadc'>Heavy WorkLoad</option>
						<option value='workloadd'>Very Heavy WorkLoad</option>
						<option value='5'>Manual Insertion</option>
					</form:select>
					<div id="selection" /></div>
				</div>
			</div>

			<span id="hide3" style="visibility: hidden;">
				<div class="control-group">
					<label class="control-label" for="focusedInput"
						id="recordcountlabel">RecordCounts (Manual Insertion)</label>
					<div class="controls">
						<form:input class="input-xlarge focused"
							onkeypress="return isNumeric(event)" id="recordcount" type="text"
							path="recordcount" />

					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="focusedInput"
						id="operationcountslabel"> OperationCounts (Manual
						Insertion)</label>
					<div class="controls">
						<form:input class="input-xlarge focused"
							onkeypress="return isNumeric(event)" id="operationcounts"
							type="text" path="operationcounts" />
					</div>

				</div>
			</span>
		</fieldset>
	</div>



	<script language="javascript" type="text/javascript">
		function toggleT3() {
			var _h = document.getElementById('select01').value;

			if (_h == 'workloada') {
				document.getElementById('operationcounts').value = "100";
				document.getElementById('recordcount').value = "100";

			}
			if (_h == 'workloadb') {
				document.getElementById('operationcounts').value = "10000";
				document.getElementById('recordcount').value = "10000";
			}
			if (_h == 'workloadc') {
				document.getElementById('operationcounts').value = "100000";
				document.getElementById('recordcount').value = "100000";
			}
			if (_h == 'workloadd') {
				document.getElementById('operationcounts').value = "1000000";
				document.getElementById('recordcount').value = "1000000";
			}
			if (_h == '5') {
				document.getElementById('hide3').style.visibility = 'visible';

			}
		}
	</script>

	<script language="javascript" type="text/javascript">
		function TurntoDefaults() {

			document.myForm.threads.value = 10;
			document.myForm.target.value = 100;

		}
	</script>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>

<head>
<title>Web-Serving Benchmarking</title>


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
				<label class="control-label" for="select01">Select Server</label>
				<div class="controls">
					<form:select name="server" id="server" class="" path="server">
						<option>- -</option>
						<option value="apache2.2">Apache 2.2</option>
						<option value="nginx">Nginx</option>
						<option value="apache2.4">Apache 2.4</option>
						<option value="lighttpd">Lighthttpd</option>
					</form:select>
				</div>
			</div>

			<div class="control-group"></div>



			<div class="control-group">
				<label class="control-label" for="focusedInput">Threads</label>
				<div class="controls">
					<form:input class="input-xlarge focused"
						onkeypress="return isNumeric(event)" id="focusedInput" type="text"
						path="threads" name="threads" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="focusedInput">Requests</label>
				<div class="controls">
					<form:input class="input-xlarge focused"
						onkeypress="return isNumeric(event)" name="requests"
						id="focusedInput" type="text" value="" path="requests" />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="select01">Concurrent
					Requests </label>
				<div class="controls">
					<form:input class="input-xlarge focused"
						onkeypress="return isNumeric(event)" name="concurent"
						id="focusedInput" type="text" value="" path="concurent" />

					<div id="selection" /></div>
				</div>
			</div>
		</fieldset>
	</div>

	
</body>
</html>
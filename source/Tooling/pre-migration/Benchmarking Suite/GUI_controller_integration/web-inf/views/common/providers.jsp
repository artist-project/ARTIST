<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>

<head>
<title>DB Benchmarking</title>
<style type="text/css">
.fileUpload {
	position: relative;
	overflow: hidden;
	margin: 10px;
	margin-top: auto;
}

.fileUpload input.upload {
	position: absolute;
	top: 0;
	right: 0;
	margin: 0;
	padding: 0;
	font-size: 20px;
	cursor: pointer;
	opacity: 0;
	filter: alpha(opacity =   0);
}

</style>
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


	<div class="tab-pane" id="tab3">
		<fieldset>
			<div class="control-group">

				<label class="control-label" for="select01">Provider</label>
				<div class="controls">

					<form:select class="" path="provider" name="provider"
						onchange="addFields();">
						<option>--</option>
						<option value="openstack-nova">Openstack</option>
						<option>RackSpace</option>
						<option>Amazon WS</option>
						<option>Vcloud</option>
					</form:select>
					<span id="container" /></span>
				</div>


			</div>

			<div class="control-group">
				<label class="control-label" for="focusedInput">Public URL</label>
				<div class="controls">
					<form:input class="input-xlarge focused" id="focusedInput"
						type="text" value="" path="url" name="url" />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="focusedInput">VM Type</label>
				<div class="controls">
					<form:select class="input-xlarge focused" id="vmtype" type="text"
						value="" path="vmtype" name="vmtype" onchange="selectinstance();" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="focusedInput">Image Name</label>
				<div class="controls">
					<form:input class="input-xlarge focused" id="focusedInput"
						type="text" value="" path="imagename" name="imagename" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="focusedInput">Minimum
					Required Ram</label>
				<div class="controls">
					<form:input type="text" class="" path="ram" name="ram" id="ram"
						onkeypress="return isNumeric(event)" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="focusedInput">Minimum
					Required Disk Space</label>
				<div class="controls">
					<form:input class="" path="minDisk" id="mindisk" name="mindisk"
						onkeypress="return isNumeric(event)" type="text" />

				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="focusedInput">KeyPair</label>
				<div class="controls">
					<select id="key2" onChange="toggleT2()">
					<option>--</option>
						<option value='h'>Create new</option>
						<option value='s'>Use your keypairs</option>
					</select>

				</div>

			</div>
			

			<div class="control-group">
				<div class="controls">
					<span id="hide" style="visibility: hidden;"> <input
						id="uploadFile" placeholder="Choose File" disabled="disabled" />
						<div class="fileUpload btn btn-primary">
							<span>Upload</span> <input id="uploadBtn" type="file"
								class="upload" path="keypair" name="keypair" />
						</div>
					</span>
				</div>
			</div>
			
			<div class="control-group">
				<span id="hide2" style="visibility: hidden;"> 
				<div class="controls">
					<form:input class="" path="novakeys" id="novakeys" name="novakeys"
						type="text" />

				</div>
				</span>
				
			</div>


			<input type="submit"  value="Load" style="display: none;" />
	</div>
	</fieldset>
	</div>
    
	<script language="javascript" type="text/javascript">
		function toggleT2() {
			var _h = document.getElementById('key2').value;

			if (_h == 's')
				document.getElementById('hide').style.visibility = 'visible';
			    document.getElementById('novakeys').value = '';
			if (_h == 'h'){
				document.getElementById('novakeys').value = 'nova';
				document.getElementById('hide').style.visibility = 'hidden';
			}
		}
	</script>

	<script language="javascript" type="text/javascript">
		function selectinstance() {

			var sel = document.getElementById('vmtype');
			var firstDD = document.myForm.provider.value;
			if (firstDD == 'openstack-nova') {
				switch (sel.options[sel.selectedIndex].value) {
				case '1':
					document.getElementById('ram').value = "512";
					document.getElementById('mindisk').value = "0";
					break;
				case '2':
					document.getElementById('ram').value = "2048";
					document.getElementById('mindisk').value = "10";
					break;
				case '3':
					document.getElementById('ram').value = "4096";
					document.getElementById('mindisk').value = "40";
					break;
				case '4':
					document.getElementById('ram').value = "8192";
					document.getElementById('mindisk').value = "80";
					break;
				case '5':
					document.getElementById('ram').value = "16384";
					document.getElementById('mindisk').value = "160";
					break;
				}
			}

			if (firstDD == 'Amazon WS') {
				switch (sel.options[sel.selectedIndex].value) {
				case '1':
					document.getElementById('ram').value = "1700";
					document.getElementById('mindisk').value = "160";
					break;
				case '2':
					document.getElementById('ram').value = "3750";
					document.getElementById('mindisk').value = "410";
					break;
				case '3':
					document.getElementById('ram').value = "7500";
					document.getElementById('mindisk').value = "840";
					break;
				case '4':
					document.getElementById('ram').value = "15000";
					document.getElementById('mindisk').value = "1680";
					break;
				case '5':
					document.getElementById('ram').value = "3750";
					document.getElementById('mindisk').value = "24";
					break;
				case '6':
					document.getElementById('ram').value = "7500";
					document.getElementById('mindisk').value = "192";
					break;
				case '7':
					document.getElementById('ram').value = "15000";
					document.getElementById('mindisk').value = "480";
					break;
				case '8':
					document.getElementById('ram').value = "30000";
					document.getElementById('mindisk').value = "960";
					break;
				}
			}

		}
	</script>

	<script language="javascript" type="text/javascript">
		function addFields() {

			var firstDD = document.myForm.provider.value;

			switch (firstDD) {
			case 'openstack-nova':
				document.getElementById('ram').value = "512";
				document.getElementById('mindisk').value = "0";

				var container = document.getElementById("container");
				var container2 = document.getElementById("vmtype");
				var length = container2.options.length;
				for (i = container2.options.length - 1; i >= 0; i--) {
					container2.remove(i);
				}
				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				var opt5 = document.createElement('option');
				opt1.value = "1";
				opt1.innerHTML = "m1.tiny";
				container2.appendChild(opt1);
				opt2.value = "2";
				opt2.innerHTML = "m1.small";
				container2.appendChild(opt2);
				opt3.value = "3";
				opt3.innerHTML = "m1.medium";
				container2.appendChild(opt3);
				opt4.value = "4";
				opt4.innerHTML = "m1.large";
				container2.appendChild(opt4);
				opt5.value = "5";
				opt5.innerHTML = "m1.xlarge";
				container2.appendChild(opt5);
				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createTextNode("Username "));
				var input = document.createElement("input");
				input.type = "text";
				input.name = "Username";
				input.setAttribute('path', 'username');
				container.appendChild(input);
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createTextNode("Password   "));
				var input2 = document.createElement("input");
				input2.type = "text";
				input2.name = "Password";
				input2.setAttribute('path', 'password');
				container.appendChild(input2);
				break;

			case 'RackSpace':

				var container = document.getElementById("container");
				var container2 = document.getElementById("vmtype");
				var length = container2.options.length;
				for (i = container2.options.length - 1; i >= 0; i--) {
					container2.remove(i);
				}
				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				var opt5 = document.createElement('option');
				opt1.value = "1";
				opt1.innerHTML = "instance1";
				container2.appendChild(opt1);
				opt2.value = "2";
				opt2.innerHTML = "instance2";
				container2.appendChild(opt2);
				opt3.value = "3";
				opt3.innerHTML = "instance3";
				container2.appendChild(opt3);
				opt4.value = "4";
				opt4.innerHTML = "instance4";
				container2.appendChild(opt4);
				opt5.value = "5";
				opt5.innerHTML = "instance5";
				container2.appendChild(opt5);
				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createTextNode("Identity"));
				var input = document.createElement("input");
				input.type = "text";
				input.name = "Identity";
				container.appendChild(input);
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createTextNode("ApiKey"));
				var input = document.createElement("input");
				input.type = "text";
				input.name = "Identity";
				container.appendChild(input);
				
				break;

			case 'Amazon WS':
				document.getElementById('ram').value = "1700";
				document.getElementById('mindisk').value = "160";
				var container = document.getElementById("container");
				var container2 = document.getElementById("vmtype");
				var length = container2.options.length;
				for (i = container2.options.length - 1; i >= 0; i--) {
					container2.remove(i);
				}
				var opt1 = document.createElement('option');
				var opt2 = document.createElement('option');
				var opt3 = document.createElement('option');
				var opt4 = document.createElement('option');
				var opt5 = document.createElement('option');
				var opt6 = document.createElement('option');
				var opt7 = document.createElement('option');
				var opt8 = document.createElement('option');
				opt1.value = "1";
				opt1.innerHTML = "m1.small";
				container2.appendChild(opt1);
				opt2.value = "2";
				opt2.innerHTML = "m1.medium";
				container2.appendChild(opt2);
				opt3.value = "3";
				opt3.innerHTML = "m1.large";
				container2.appendChild(opt3);
				opt4.value = "4";
				opt4.innerHTML = "m1.xlarge";
				container2.appendChild(opt4);
				opt5.value = "5";
				opt5.innerHTML = "m3.medium";
				container2.appendChild(opt5);
				opt6.value = "6";
				opt6.innerHTML = "m3.large";
				container2.appendChild(opt6);
				opt7.value = "7";
				opt7.innerHTML = "m3.xlarge";
				container2.appendChild(opt7);
				opt8.value = "8";
				opt8.innerHTML = "m3.2xlarge";
				container2.appendChild(opt8);

				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createTextNode("AccessKeyId"));
				var input = document.createElement("input");
				input.type = "text";
				input.name = "Identity"
				container.appendChild(input);
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createTextNode("SecretKey"));
				var input = document.createElement("input");
				input.type = "text";
				input.name = "Identity";
				container.appendChild(input);
				
				break;

			case 'Vcloud':

				var container = document.getElementById("container");
				while (container.hasChildNodes()) {
					container.removeChild(container.lastChild);
				}
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createTextNode("Email"));
				var input = document.createElement("input");
				input.type = "text";
				input.name = "Identity";
				container.appendChild(input);
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createElement("br"));
				container.appendChild(document.createTextNode("Password"));
				var input = document.createElement("input");
				input.type = "text";
				input.name = "Identity";
				container.appendChild(input);
				break;
			}

		}
	</script>


	<script>
		document.getElementById("uploadBtn").onchange = function() {
			document.getElementById("uploadFile").value = this.value;
		}
	</script>

</body>
</html>
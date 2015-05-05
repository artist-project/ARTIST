<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>

<head>
<title>Map-Reduce Benchmarking</title>


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
				<label class="control-label" for="select01">Select Hadoop Benchmark</label>
				<div class="controls">
					<form:select name="test" id="test" class="" path="test"
						onchange="aaa();">
						<option>--</option>
						<option value="TestDFSIO">TestDFSIO</option>
						<option value="mrbench">MrBench</option>
						<option value="nnbench">NNBench</option>
						<option value="teragen">Teragen</option>
					</form:select>
					<div class="control-group">
					
					<span  id="container2" ></span>
					</div>
				</div>
			</div>

			




		</fieldset>
	</div>

<script language="javascript" type="text/javascript">
	function aaa() {
		var firstDD = document.myForm.test.value;
		switch (firstDD) {
		case '--':
			var container = document.getElementById("container2");
			while (container.hasChildNodes()) {
				container.removeChild(container.lastChild);
			}
			break;
		case 'TestDFSIO':
			var container = document.getElementById("container2");
			while (container.hasChildNodes()) {
				container.removeChild(container.lastChild);
			}
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Number of Files ";
			container.appendChild(newlabel);
			
			var input = document.createElement("input");
			input.type = "text";
			input.name = "nrFiles";
			input.setAttribute('path', 'nrFiles'); 
			input.className = "input-xlarge focused";
			container.appendChild(input);
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "File Size ";
			container.appendChild(newlabel);
			var input = document.createElement("input");
			input.type = "text";
			input.name = "fileSize";
			input.setAttribute('path', 'fileSize');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			break;

		case 'mrbench':
			var container = document.getElementById("container2");
			while (container.hasChildNodes()) {
				container.removeChild(container.lastChild);
			}
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Maps";
			container.appendChild(newlabel);
			
			var input = document.createElement("input");
			input.type = "text";
			input.name = "mr_maps";
			input.setAttribute('path', 'mr_maps');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			//
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Reduces";
			container.appendChild(newlabel);
			
			var input = document.createElement("input");
			input.type = "text";
			input.name = "mr_reduces";
			input.setAttribute('path', 'mr_reduces');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			//
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "InputLines ";
			container.appendChild(newlabel);
			
			var input = document.createElement("input");
			input.type = "text";
			input.name = "inputLines";
			input.setAttribute('path', 'inputLines');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			//		
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Input Type ";
			container.appendChild(newlabel);
			
			var input = document.createElement("select");
			input.type = "text";
			input.name = "inputType";
			input.setAttribute('path', 'inputType');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			var opt0 = document.createElement('option');
			var opt1 = document.createElement('option');
			var opt2 = document.createElement('option');
			var opt3 = document.createElement('option');

			opt0.value = "0";
			opt0.innerHTML = "--";
			input.appendChild(opt0);

			opt1.value = "ascending";
			opt1.innerHTML = "Ascending";
			input.appendChild(opt1);

			opt2.value = "descending";
			opt2.innerHTML = "Descending";
			input.appendChild(opt2);

			opt3.value = "random";
			opt3.innerHTML = "Random";
			input.appendChild(opt3);

			//

			break;
			
		case 'nnbench':
			var container = document.getElementById("container2");
			while (container.hasChildNodes()) {
				container.removeChild(container.lastChild);
			}
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Maps ";
			container.appendChild(newlabel);
			
			var input = document.createElement("input");
			input.type = "text";
			input.name = "nn_maps";
			input.setAttribute('path', 'nn_maps');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Reduces ";
			
			container.appendChild(newlabel);
			var input = document.createElement("input");
			input.type = "text";
			input.name = "nn_reduces";
			input.setAttribute('path', 'nn_reduces');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Block Size  ";
			container.appendChild(newlabel);
			
			var input = document.createElement("input");
			input.type = "text";
			input.name = "blockSize";
			input.setAttribute('path', 'blockSize');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Bytes to Write ";
			container.appendChild(newlabel);
			
			var input = document.createElement("input");
			input.type = "text";
			input.name = "bytesToWrite";
			input.setAttribute('path', 'bytesToWrite');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Bytes per checksum ";
			container.appendChild(newlabel);
			
			var input = document.createElement("input");
			input.type = "text";
			input.name = "bytesPerChecksum";
			input.setAttribute('path', 'bytesPerChecksum');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Number of Files ";
			container.appendChild(newlabel);

			var input = document.createElement("input");
			input.type = "text";
			input.name = "numberOfFiles";
			input.setAttribute('path', 'numberOfFiles');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Replication Factor per File";
			container.appendChild(newlabel);
			var input = document.createElement("input");
			input.type = "text";
			input.name = "replicationFactorPerFile";
			input.setAttribute('path', 'replicationFactorPerFile');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			break;
		case 'teragen':
			var container = document.getElementById("container2");
			while (container.hasChildNodes()) {
				container.removeChild(container.lastChild);
			}
			container.appendChild(document.createElement("br"));
			container.appendChild(document.createElement("br"));
			
			var newlabel = document.createElement("Label");
			newlabel.className = "control-label";
			newlabel.style.textAlign = 'left';
			newlabel.innerHTML = "Teragen";
			container.appendChild(newlabel);
			var input = document.createElement("input");
			input.type = "text";
			input.name = "teragen";
			input.setAttribute('path', 'teragen');
			input.className = "input-xlarge focused ";
			container.appendChild(input);
			
			break;
		}
	}
</script>

</body>
</html>
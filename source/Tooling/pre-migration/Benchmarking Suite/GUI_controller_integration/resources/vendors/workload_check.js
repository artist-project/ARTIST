function myFunction() {
	var e = document.getElementsByName("list_name")[0];
	if (e.value != "Manual Insertion")
		e.value = "Light WorkLoad";
	alert("Be sure Manual Selection is Selected Above - Turning to Defaults");

}

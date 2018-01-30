function validateForm() {
	var country = document.getElementById("country").value;
	if( country.length==0) {
		alert("Empty field");
		return false;
	}

	else {

		return true;
	}
}
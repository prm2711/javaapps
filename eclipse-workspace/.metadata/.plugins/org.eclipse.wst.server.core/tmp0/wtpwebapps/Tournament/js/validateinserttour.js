function validateForm() {
	var tour = document.getElementById("tourname").value;
	if( tour.length==0) {
		alert("Empty field");
		return false;
	}

	else {

		return true;
	}
}
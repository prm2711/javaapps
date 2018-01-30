function validateForm() {
	var player = document.getElementById("player").value;
	var tour = document.getElementById("tour").value;
	if( player.length==0 || tour.length==0) {
		alert("Empty field");
		return false;
	}

	else {

		return true;
	}
}
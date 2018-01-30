function validateForm() {
	var player = document.getElementById("player").value;
	if( player.length==0) {
		alert("Empty field");
		return false;
	}

	else {

		return true;
	}
}
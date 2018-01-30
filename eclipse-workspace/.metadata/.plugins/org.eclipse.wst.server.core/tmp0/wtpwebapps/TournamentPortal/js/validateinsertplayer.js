function validateForm() {
	var player = document.getElementById("player").value;
	var country = document.getElementById("country").value;
	var origpoints = document.getElementById("origpoints").value;
	var newpoints = document.getElementById("newpoints").value;
	var numbermatch = document.getElementById("numbermatch").value;
	var won= document.getElementById("won").value;
	var lost = document.getElementById("lost").value;
	var draw = document.getElementById("draw").value;
	if( player.length==0 || country.length==0 || origpoints.length==0 || newpoints.length==0 || numbermatch.length==0
			|| won.length==0 || lost.length==0 || draw.length==0) {
		alert("Empty field");
		return false;
	}

	else {

		return true;
	}
}
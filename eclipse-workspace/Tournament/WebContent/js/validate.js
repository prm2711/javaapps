function validateForm() {
	var user = document.getElementById("username").value;
	var password = document.getElementById("password").value;

	if (user.length == 0 || password.length == 0) {
		alert("Empty field");
		return false;
	}

	else {

		return true;
	}
}

function blink() {
	var anim = document.getElementById('para');
	setInterval(function() {
		anim.style.display = (anim.style.display == 'none' ? '' : 'none');
	}, 1000);
}
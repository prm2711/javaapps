function validateForm() {
	var tour = document.getElementById("tourname").value;
	var player1 = document.getElementById("player1").value;
	var player2 = document.getElementById("player2").value;
	var winner = document.getElementById("winner").value;
	var loser = document.getElementById("loser").value;
	var status= document.getElementById("status").value;
	var score = document.getElementById("score").value;
	if( tour.length==0 || player1.length==0 || player2.length==0 || winner.length==0 || loser.length==0
			|| status.length==0 || score.length==0) {
		alert("Empty field");
		return false;
	}

	else {

		return true;
	}
}
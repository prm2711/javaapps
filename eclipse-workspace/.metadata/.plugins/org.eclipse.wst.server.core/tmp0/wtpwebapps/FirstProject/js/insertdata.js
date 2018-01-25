/**
 * 
 */
function validateForm() {
	var rollno = document.getElementById("roll_no").value;
	var student_name = document.getElementById("student_name").value;
	var marks = document.getElementById("marks").value;
	var marksphy = document.getElementById("marksphy").value;
	var markschem = document.getElementById("markschem").value;

	if (isNaN(rollno) == true || isNaN(marks) == true
			|| isNaN(marksphy) == true || isNaN(markschem) == true || rollno.length==0 || student_name.length==0 || marks.length==0 || marksphy.length==0 || markschem.length==0) {
		alert("Enter valid details");
		return false;
	}

	else {

		return true;
	}
}
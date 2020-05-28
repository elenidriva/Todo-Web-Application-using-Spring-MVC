//const addButton = document.querySelector("#addButton");
//const editButton = document.querySelector("#editButton");
const welcomeText = document.querySelector("#welcome");

 function welcome(){
	if (welcomeText.textContent == "Welcome, visitor!"){
		document.querySelector("#logoutButton").style.visibility ="hidden";
		var tobeHidden = document.querySelectorAll(".toHide");
		tobeHidden.forEach(function(classItem) {
			classItem.style.visibility = "hidden";
});
		document.querySelector("#loginButton").style.visibility ="visible";
	} else {
		document.querySelector("#loginButton").style.visibility ="hidden";
		document.querySelector("#logoutButton").style.visibility ="visible";
	}


} 

function confirmation(event){
	
	if (confirm("Are you sure you want to delete this task?")){
	} else {
	event.preventDefault();
	}
	
}

document.addEventListener("DOMContentLoaded", function() {
	welcome();
});


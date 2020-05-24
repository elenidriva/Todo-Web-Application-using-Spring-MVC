var divs = document.querySelectorAll('.textholder'), i;
//const addButton = document.querySelector("#addButton");
//const editButton = document.querySelector("#editButton");
const welcomeText = document.querySelector("#welcome");

console.log(divs);
for (i = 0; i < divs.length; ++i) {
    console.log(divs[i]);     
	if(divs[i].innerHTML == 'HIGH'){
         divs[i].style.color = "#A81B08";
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
/* function hideLogout(){

		document.querySelector("#logoutButton").style.visibility ="hidden";
		document.querySelector("#loginButton").style.visibility ="visible";


} */
/*function add(){
	window.open("/add-todo");
}


 function edit(id,title, description){
	console.log(id);
	window.open("/update-todo?id="+id+"&title="+title+"&description="+description);
}
 */






// Event listeners for keyboard input

//addButton.addEventListener("click", add, false);
//editButton.addEventListener("click", edit, false);
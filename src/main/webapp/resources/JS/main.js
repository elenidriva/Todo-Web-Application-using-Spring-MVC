var divs = document.querySelectorAll('.textholder'), i;
console.log(divs);
for (i = 0; i < divs.length; ++i) {
    console.log(divs[i]);     
if(divs[i].innerHTML == 'HIGH'){

         divs[i].style.color = "#A81B08";
}
}
    
function confirmation(event){
	
	if (confirm("Are you sure you want to delete this task?")){

	}else {
	event.preventDefault();
	}
	
}
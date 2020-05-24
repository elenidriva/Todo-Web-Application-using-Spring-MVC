var divs = document.querySelectorAll('.textholder'), i;
for (i = 0; i < divs.length; ++i) {
    console.log(divs[i]);     
	if(divs[i].innerHTML == 'HIGH'){
         divs[i].style.color = "#A81B08";
	}
}

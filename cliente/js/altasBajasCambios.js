function deleteSensor(sensor){ //delete the sensor from the data base 
  console.log(sensor);
  alert("se borrara el sensor "+sensor.name);  
}
function displayForm (serie) { 
	if (serie) {
		fillForm(serie);
	}      
	console.log("si entro");
	$("#form").slideToggle();
	
}  
//this function fill the form from a serie
function fillForm (serie) {
	
}
function deleteSensor(sensor){ //delete the sensor from the data base 
	
}
function displayForm (serie,node) { 
	if (serie) {
		fillForm(serie,node);
	}  
	$(node).slideToggle();
	
}  
//this function fill the form from a serie
function fillForm (serie,node) {
	if(node[0].id == "form-create"){
	    //fill the form of create a sensor   
	
	}else{//fill the form of modify a sensor
		
	}
}
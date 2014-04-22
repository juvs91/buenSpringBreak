function deleteSensor(sensor){ //delete the sensor from the data base 
  //alert("se borrara el sensor "+sensor.name);   
  requestDeleteSensor(sensor.name);
}
function displayForm (serie) { 
	if (serie) {
		fillForm(serie);
	}     
}                                   
//this function fill the form from a serie
function fillForm (serie) {             
	 $("#sensorList").append("<option value="+serie.options.id.slId+">"+
										serie.options.id.slId+"</option>").val(serie.options.id.slId);
	if (serie.options.id.type != null) {
		$("#sensorTag").val(serie.name); 
		$("#measurementUnits").append("<option value="+serie.options.id.type+">"+
										serie.options.id.type+"</option>").val(serie.options.id.type );  
										
	}     
}        

     
$(document).ready(function () {
  $("#submit").click(function() {
     
  var SensorTagForm = { 
				"sensorTag":$("#sensorTag").val(),"sensorId":$("#sensorList").val()
				,"company":$("#company").val(),"maxValue":$("#max").val(),"minValue":$("#min").val()
				,"active":false,"idSensorCatalog":$("#measurementUnits").val()
				,"idMeasurementUnit":$("#measurementUnits").val(),"commDeviceTag":$("#commDeviceTags").val()
				};

   requestEditCreateSensor(SensorTagForm);

   });

});



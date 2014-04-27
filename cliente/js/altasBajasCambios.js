function deleteSensor(sensor){ //delete the sensor from the data base 
  //alert("se borrara el sensor "+sensor.name);   
  requestDeleteSensor(sensor.name);
}
function displayForm (serie) { 
	if (serie) {
		fillForm(serie);
	}else{
		$("#form").empty();
		$("#form").append(forma); 
	}     
}                                   
//this function fill the form from a serie
function fillForm (serie) {
	if ($("#sensorList option[value='"+serie.options.id.slId+"']").length < 0) {
		$("#sensorList").append("<option value="+serie.options.id.slId+">"+
										serie.options.id.slId+"</option>").val(serie.options.id.slId);
	}else{
		$("#sensorList").val(serie.options.id.slId)
	}          
	if (serie.options.id.tag != null) { 
		sensorIdSelected = serie.name
		$("#sensorTag").val(serie.name);
		if (serie.options.id.type != null) {
			$("#measurementUnits").val(serie.options.id.type);
		}
										
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

   requestEditCreateSensor(SensorTagForm,sensorIdSelected);

   });

});



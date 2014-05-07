
//initial request get all the initial sensors with all their points
function requestSensores() {
	var url = 'http://localhost:8080/factoryEcomation_Services/webresources/sensors';
    var data = {};
    $.support.cors = true;
	$.ajax({    
	    type: 'GET',
	    url: url,
	    async: false,
	    jsonpCallback: 'jsonCallback',
	    contentType: "application/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(json) { 
		   data = json; 		
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	 	onload:function(json){
			//console.log(json);
		}
	});
	return data;   
	
}   

//get the lastest points of the chart
function requestNewPoints () {  
	var url = "http://localhost:8080/factoryEcomation_Services/webresources/sensors";
	var data = {};
    $.support.cors = true;
	$.ajax({    
	    type: 'GET',
	    url: url,
	    async: true,
	    jsonpCallback: 'jsonCallback',
	    contentType: "application/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(json) {
			graphPoints(json);
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	 	onload:function(json){
			console.log();
		}
	});
	
}    

//Carga company, location, measurement y sensorlist cuando se carga la pagina. 

function requestSimple (url,obj, name, idName,serie) {
    var url = 'http://localhost:8080/factoryEcomation_Services/webresources/'+ url;
    var data;
    //console.log(data["idSensor"]);
    $.support.cors = true;
	$.ajax({    
	    type: 'GET',
	    url: url,
	    async: true,
	    jsonpCallback: 'jsonCallback',
	    contentType: "application/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(json) {
		   pushOptions(json,obj,name , idName); 
		   if (serie) {
				fillFormRecivedRequest(serie);		
			}
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	    onload:function(json){
		console.log();
	    }
	});
	return data;   
	
}

//Filtra sensorCatalog por compañia. 

function fillSensorType() {
    var index = document.getElementById("company").selectedIndex;
    var url = 'http://localhost:8080/factoryEcomation_Services/webresources/entities.sensorcatalog/company/'+index;
    var data;
    //console.log(data["idSensor"]);
    $.support.cors = true;
	$.ajax({    
	    type: 'GET',
	    url: url,
	    async: true,
	    jsonpCallback: 'jsonCallback',
	    contentType: "application/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(json) {
		   pushOptionsSensorType(json); 		
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	    onload:function(json){
		console.log();
	    }
	});
	return data;   
	
}



//filtra commDeviceTags por locationId  SELECT * FROM commdevicetags WHERE locationID=index

function fillCommonDeviceTag() {
    var index = document.getElementById("location").selectedIndex;
    var url = 'http://localhost:8080/factoryEcomation_Services/webresources/entities.commdevicetags/location/'+index;
    var data;
    $.support.cors = true;
	$.ajax({    
	    type: 'GET',
	    url: url,
	    async: true,
	    jsonpCallback: 'jsonCallback',
	    contentType: "application/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(json) {
		   pushOptionsCommonDeviceTag(json); 		
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	    onload:function(json){
		console.log();
	    }
	});
	return data;   
	
}

//filtra SensorCatalog por compañia y por SensorType  SELECT * FROM sensorCatalog WHERE idCompany=id AND sensorType=idSensorType

function fillSeveralOptionsCatalog() {
    var idCompany = document.getElementById("company").selectedIndex;
    var idSensorType = document.getElementById("sensorType").selectedIndex;
    var url = 'http://localhost:8080/factoryEcomation_Services/webresources/entities.sensorcatalog/company/'+idCompany+'/sensorType/'+idSensorType;
    var data;
    //console.log(data["idSensor"]);
    $.support.cors = true;
	$.ajax({    
	    type: 'GET',
	    url: url,
	    async: true,
	    jsonpCallback: 'jsonCallback',
	    contentType: "application/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(json) {
		   pushOptionsSeveralCatalog(json); 		
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	    onload:function(json){
		console.log();
	    }
	});
	return data;   
	
}     

function requestEditCreateSensor (jsonin,id,slId) {
	var url;
	var typeRequest = null;
	if (create) {    
		url = 'http://localhost:8080/factoryEcomation_Services/webresources/entities.sensortags/create';  
		typeRequest = 'POST';    
	}else{             
		url = 'http://localhost:8080/factoryEcomation_Services/webresources/entities.sensortags/'+id;  
		typeRequest = 'PUT';
	}   
	console.log(typeRequest,id,create); 
	json = {//checar este pedo por que no jala cuando lo envio por parametro
		  "sensorTag":$("#sensorTag").val(),"sensorId":$("#sensorList").val()
			,"company":$("#company").val(),"maxValue":$("#max").val(),"minValue":$("#min").val()
			,"active":false,"idSensorCatalog":$("#measurementUnits").find(":selected")[0].id
			,"idMeasurementUnit":$("#measurementUnits").find(":selected")[0].id,"commDeviceTag":$("#commDeviceTags").val()
		 };
	$.support.cors = true;
	$.ajax({    
	    type: typeRequest,
	    url: url,
	    async: true,  
		//data : json,
		data :JSON.stringify(json),
	    jsonpCallback: 'jsonCallback',
	    contentType: "application/json; charset=UTF-8",
	    dataType: 'json',
		crossDomain : true, 
	    success: function(json) {
			//crear o editar el sensor
			if (create) {
				if(json.sensorId != null){
					redraw(json.sensorTag,json.sensorId["slId"],create,"potato",slId);
				} else{
					sensorDiscovereds.push(json);
				}
			}else{
				if(json.sensorId != null){
					redraw(id,json.sensorId["slId"],create,"potatoe",slId);
				} else{
					sensorDiscovereds.push(json);
				}
			}
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	    onload:function(json){
		console.log();
	    }
	});
}    
function requestDeleteSensor (id) {
    var url = 'http://localhost:8080/factoryEcomation_Services/webresources/entities.sensortags/'+id;
	$.support.cors = true;
	$.ajax({    
	    type: 'DELETE',
	    url: url,
	    async: true,  
		data : null,
	    jsonpCallback: 'jsonCallback',
	    contentType: "application/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(id) {
            console.log("succes en borrar");
			chart.series[idSeriesMap[id]].remove()  
			
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	    onload:function(json){
		console.log();
	    }
	});
}    

function requestDescubreSensores () {
	var url ='http://localhost:8080/factoryEcomation_Services/webresources/';    
	$.support.cors = true;   
	$.ajax({    
	    type: 'GET',
	    url: url,
	    async: true,  
		data : json,
	    jsonpCallback: 'jsonCallback',
	    contentType: "application/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(json) {
            console.log(json); 
			sensorDiscovereds.push(json); 
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	    onload:function(json){
		console.log();
	    }
	});
}



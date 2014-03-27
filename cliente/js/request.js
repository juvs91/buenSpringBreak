
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

function requestSimple (url,obj, name, idName) {
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
console.log("entroo");
    var index = document.getElementById("location").selectedIndex;
    var url = 'http://localhost:8080/factoryEcomation_Services/webresources/entities.commdevicetags/location/'+index;
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



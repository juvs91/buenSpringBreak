
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
	    contentType: "aplication/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(json) {
		   data = json; 		
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

//get the lastest points of the chart
function requestNewPoints (idLastPoint) {  
	//entities.outputs                  
	console.log(idLastPoint);
	var url = "http://localhost:8080/factoryEcomation_Services/webresources/entities.outputs/"+idLastPoint+"/newOutputs";
	var data = {};
    $.support.cors = true;
	$.ajax({    
	    type: 'GET',
	    url: url,
	    async: true,
	    jsonpCallback: 'jsonCallback',
	    contentType: "aplication/json",
	    dataType: 'json',   
		//crossDomain : true, 
	    success: function(json) {
			pushPoints(json);
	    },
	    error: function(e) { 
	       console.log(e);
	    },
	 	onload:function(json){
			console.log();
		}
	});
	
}









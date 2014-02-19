

function requestCtr () {
	var url = 'http://localhost:8080/factoryEcomation_Services/webresources/sensorgas';
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
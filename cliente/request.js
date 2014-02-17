var url = 'http://localhost:8080/factoryEcomation_Services/webresources/entities.sensortags/outs/GAS01';


function requestCtr () {

    var headerData = {};

	$.ajax({    
	    type: 'GET',
	    url: url,
	    async: true,
	    jsonpCallback: 'jsonCallback',
	    contentType: "aplication/json",
	    //dataType: 'jsonp',   
		crossDomain : true, 
	    success: function(json) {
	       console.log(json);
	    },
	    error: function(e) { 
	       console.log(e);
	    } 
	});   
	
}
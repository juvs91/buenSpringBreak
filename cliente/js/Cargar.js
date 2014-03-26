function onLoad(){
requestSimple('entities.company','company', 'companyName', 'idCompany' );
requestSimple('entities.location','location', 'locationName', 'idLocation' );
requestSimple('entities.measurementunits','measurementUnits', 'unitName', 'idMeasurementUnit' );
requestSimple('entities.sensorlist/noreference','sensorList', 'slName1', 'stId' );  

}

function requestSimple (url,obj, name, idName) {
    var url = 'http://localhost:8080/buenSpringBreak/webresources/'+ url;
    var data;
    //console.log(data["idSensor"]);
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


function pushOptions(json, obj, name , idName){

   //cargar el select
   var select = document.getElementById(obj);
    
    
    //boton de vacio
      var option = document.createElement("option")
      option.text ="";
      option.value = -1;
      select.add(option);

   for (i=0;i<json.length;i++)
      {
      temp_name= json[i][name];
      temp_idName=json[i][idName];
     
   
      var option = document.createElement("option")
      option.text =temp_name;
      option.value = temp_idName;
console.log(temp_name);
  
      select.add(option);
      }
 

}



function fillSensorType() {
    var index = document.getElementById("company").selectedIndex;
    var url = 'http://localhost:8080/buenSpringBreak/webresources/entities.sensorcatalog/company/'+index;
    var data;
    //console.log(data["idSensor"]);
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


function pushOptionsSensorType(json){

   //cargar el select
   var div = document.getElementById("div_sensorType");
  
    var div_sensorType="<label>Sensor Type</label>"; 
    div_sensorType=div_sensorType + "<select class=\"form-control\" id=\"sensorType\" onChange=\"fillSeveralOptionsCatalog()\">";
    
    
    //boton de vacio
    var option = document.createElement("option")
    option.text ="";
    option.value = -1;
    select.add(option);

   for (i=0;i<json.length;i++)
      {

      temp_name= json[i].idSensorType.sensorType;
      temp_idName=json[i].idSensorType.idSensorType;     
   
      var option = document.createElement("option")
      option.text =temp_name;
      option.value = temp_idName;

  
      select.add(option);
      }
  

}




function fillCommonDeviceTag() {
console.log("entroo");
    var index = document.getElementById("location").selectedIndex;
    var url = 'http://localhost:8080/buenSpringBreak/webresources/entities.commdevicetags/location/'+index;
    var data;
    //console.log(data["idSensor"]);
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


function pushOptionsCommonDeviceTag(json){

   //cargar el select
   var select = document.getElementById("commDeviceTags");

   select.innerHTML='';  
    
    //boton de vacio
    var option = document.createElement("option")
    option.text ="";
    option.value = -1;
    select.add(option);
console.log(json);

   for (i=0;i<json.length;i++)
      {

      temp_name= json[i].commDeviceTag;
      temp_idName=json[i].commDeviceTag;     
   
      var option = document.createElement("option")
      option.text =temp_name;
      option.value = temp_idName;

  
      select.add(option);
      }
  

}


function fillSeveralOptionsCatalog() {
    var idCompany = document.getElementById("company").selectedIndex;
    var idSensorType = document.getElementById("sensorType").selectedIndex;
    var url = 'http://localhost:8080/buenSpringBreak/webresources/entities.sensorcatalog/company/'+idCompany+'/sensorType/'+idSensorType;
    var data;
    //console.log(data["idSensor"]);
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

function pushOptionsSeveralCatalog(json){
  
   var table = document.getElementById("table");
   table.innerHTML='';



   for (i=0;i<json.length;i++)
      {

     console.log(json);

    var row = table.insertRow(i);
    var cell1 = row.insertCell(0);
    cell1.innerHTML='<input type="checkbox" id="'+ json.idSensorCatalog +'">';
    var cell2 = row.insertCell(1);
    cell2.innerHTML=json[i].model;
    var cell3 = row.insertCell(2);
    cell3.innerHTML=json[i].reference;
    var cell4 = row.insertCell(3);
    cell4.innerHTML=json[i].idOutputFormat.outputFormat;
    var cell5 = row.insertCell(4);
    cell5.innerHTML=json[i].idOutputType.outputType;

 
      }


}








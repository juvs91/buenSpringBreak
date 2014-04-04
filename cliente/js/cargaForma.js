var forma = ''+	         
    '<div class="container-form">'+
      '<div class="header">'+
        '<ul class="nav nav-pills pull-right">'+
          '<li class="active"><a href="#">Alta</a></li>'+
        '</ul>'+
        '<h3 class="text-muted">Project name</h3>'+
      '</div>'+

      '<div class="jumbotron">'+
            '<form role="form">'+
  				'<div class="form-group">'+
    				'<label >SensorTag</label>'+
    				'<input  class="form-control" placeholder="Enter Name">'+
  				'</div>'+
	                        '<div class="form-group">'+
   					'<label>Sensor ID</label>'+

					'<select class="form-control" id="sensorList" >'+

					'</select>'+
				'</div>'+
  				'<div class="form-group">'+
   					'<label >Company</label> '+
					'<select class="form-control" id="company" onChange="fillSensorType()">'+
					'</select>'+
				'</div>'+

				'<div class="form-group" id="div_sensorType">'+
                                    '<label id=>Sensor Type</label>'+

                                     '<select class="form-control" id="sensorType" onChange="fillSeveralOptionsCatalog()">'+
                                     '</select>'+

				'</div>'+


    '<div data-role="main" class="ui-content" id="div_Catalog">'+
     '<p>Catalog</p>'+ 
	'<div id="container-fluis">'+
		  '<div class="row" id="checkbox">'+
		      '<div class="col-md-2">checkbox</div>'+
			  '<div class="col-md-2">model</div>'+
			  '<div class="col-md-2">reference</div>'+
			  '<div class="col-md-3">output format</div>'+
			  '<div class="col-md-2">output</div>'+      
	    '</div>'+
	'</div>'+
  '</div>'+

   '<div class="form-group">'+
   	'<label  >Location</label>'+
	      '<select class="form-control" id="location"  onChange="fillCommonDeviceTag()" >'+
			'</select>'+

				'</div>'+
				'<div class="form-group" id="div_commDeviceTags">'+
   					'<label >Common device Tag</label>'+
   					'<select class="form-control" id="commDeviceTags" >'+
					'</select>'+
				'</div>'+
				'<div class="form-group">'+
    				'<label >Max Value</label>'+
    				'<input type="number" class="form-control"  placeholder="Enter Max">'+

				'</div>'+
				'<div class="form-group">'+
    				'<label>Min Value</label>'+
    				'<input type="number" class="form-control"  placeholder="Enter Min">'+
  				'</div>'+

				'<div class="form-group">'+
   					'<label >Unit Name</label>'+
					'<select class="form-control" id="measurementUnits">'+
					'</select>'+
				'</div>'+
  				'<button type="submit" >Submit</button>'+
			'</form>'+


      	'</div>'+
    '</div>';
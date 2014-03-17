var Sensores = function Sensores(points,sensorName,tag,type){
	var points = [];
	var tuplePointValueDate = []; 
	var idLastPoint = 0;     
	var sort = null;
	var merge = null;  
	var mergeSort = null;
	var dataStructureGraph = {
		"name" :"",
		"data" : tuplePointValueDate, 
		"visible" : false,
		"id":""
	};
	this.addPoint = function addPoint (value,date,idOutput,unit) { 
		var point  = new Point(value,date,idOutput,unit);
		points.push(point);  
		tuplePointValueDate.push([point.getDate(),point.getValue()]);
	};
	this.addPoints = function addPoints (n_points) {
		
		//n_points = sort(n_points);
		
		for(var i = 0; i < n_points.length; i++) {
			this.addPoint(new Point(n_points[i]["value"],n_points[i]["date"],n_points[i]["unit"],n_points[i]["outputId"]));
		}
		    
	}; 
	
	sort = function sort (points) {
		mergeSort(points,0,points.length);
	} 
	    
	mergeSort = function mergeSort (points,low,high) {
		
		
	}
	
	merge = function merge (points,low,mid,high) {
		
	}
	
	this.deletePoint = function getPoints (index) {
	   
	};
	this.getAllPoints = function getAllPoints () {
		return points;
	}   
	this.getDataStructureGraph = function getDataStructureGraph () {
		
		//implementar merge sort a todos los puntos 
		
		
		return dataStructureGraph;
	}
	            
	this.setSensorName = function setSensorName (sensorNameIn) {
		sensorName = sensorNameIn; 
		dataStructureGraph["name"] = sensorName;
	}; 
	this.getSensorName = function getSensorName () {
		return sensorName;
	}; 
	this.setTag = function setTag (tagIn) {
		tag = tagIn;
	}; 
	this.getTag = function getTag () {
		return tag;
	};  
	this.setType = function setType (typeIn) {
		type = typeIn;
		dataStructureGraph["id"] = type;
	}; 
	this.getTypeg = function getTypeg () {
		return type;
	};
	
}
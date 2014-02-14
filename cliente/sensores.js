var Sensores = function Sensores(points,sensorName,tag){
	var points = [];
	var tuplePointValueDate = [];  
	var dataStructureGraph = {
		"name" :"",
		"data" : tuplePointValueDate
	};
	this.addPoint = function setPoints (point) {
		points.push(point);
		tuplePointValueDate.push([point.getDate(),point.getValue()]);
	}; 
	this.deletePoint = function getPoints (index) {
	   
	};
	this.getAllPoints = function getAllPoints () {
		return points;
	}   
	this.getDataStructureGraph = function getDataStructureGraph () {
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
	
}
var Point = function Point (value,date,idOutput,deviceTag,unit,sensorName) {
	this.setValue = function setValue (valueIn) {
		value = valueIn;
	}; 
	this.getValue = function getValue () {
		return value;
	};
	this.setDate = function setDate (dateIn) {
		date = dateIn;
	}; 
	this.getDate = function getDate () {
		return date;
	};   
	this.setIdOutput = function setIdOutput (idOutputIn) {
		idOutput = idOutputIn;
	}; 
	this.getIdOutput = function getIdOutput () {
		return idOutput;
	}; 
	this.setDeviceTag = function setDeviceTag (deviceTagIn) {
		deviceTag = deviceTagIn;
	}; 
	this.getDeviceTag = function getDeviceTag () {
		return deviceTag;
	};
	this.setDeviceTag = function setDeviceTag (deviceTagIn) {
		deviceTag = deviceTagIn;
	}; 
	this.getDeviceTag = function getDeviceTag () {
		return deviceTag;
	};
	this.setUnit = function setUnit (unitIn) {
		unit = unitIn;
	}; 
	this.getUnit = function getUnit () {
		return unit;
	};      
	this.setSensorName = function setSensorName (sensorNameIn) {
		sensorName = sensorNameIn;
	}; 
	this.getSensorName = function getSensorName () {
		return sensorName;
	}; 
	this.graphic = function graphic () {
		//en este metodo se va a graficar el punto
	}
}       

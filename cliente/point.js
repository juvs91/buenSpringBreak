var Point = function Point (value,date,idOutput,unit) {
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
 
}       

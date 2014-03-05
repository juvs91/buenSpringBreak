/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@XmlRootElement
public class Sensor implements Serializable {
    @Id 
    @GeneratedValue
    private String sensor_ID;

    private String sensorName;
    private String sensorName1;
    private String sensorName2;
    private String sensorName3;
    private String sensorType;
    private String unit;
  
    
    @OneToMany(mappedBy = "sensor_ID")
    private List<DataPoint> points;
    
    public String getSensor_ID() {
        return sensor_ID;
    }

    public void setSensor_ID(String sensorGas_ID) {
        this.sensor_ID = sensorGas_ID;
    }
    
    
    public void setUnit(String unit) {
        this.unit=unit;
    }


    public String getUnit() {
        return this.unit;
    }

 
    public void setSensorName(String SensorName) {
        this.sensorName=SensorName;
    }

 
    public String getSensorName1() {
        return this.sensorName1;
    }
       public void setSensorName1(String SensorName1) {
        this.sensorName1=SensorName1;
    }

 
    public String getSensorName2() {
        return this.sensorName2;
    }
    
       public void setSensorName2(String SensorName2) {
        this.sensorName2=SensorName2;
    }

 
    public String getSensorName3() {
        return this.sensorName3;
    }
       public void setSensorName3(String SensorName3) {
        this.sensorName3=SensorName3;
    }

 
    public String getSensorName() {
        return this.sensorName;
    }
    
    
    public void setPoint(List<DataPoint> points){
            this.points=points;
}
    
  
  public List<DataPoint> getPoint(){
       return this.points;
}
    
      public void setSensorType(String SensorType) {
        this.sensorType=SensorType;
    }

 
    public String getSensorType() {
        return this.sensorType;
    }

    
}

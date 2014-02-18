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
public class SensorGas implements Serializable {
    @Id 
    @GeneratedValue
    private String sensorGas_ID;

    private String sensorName;
    private String unit;
  
    
    @OneToMany(mappedBy = "sensorGas_ID")
    private List<DataPointGas> points;
    
    public String getSensorGas_ID() {
        return sensorGas_ID;
    }

    public void setSensorGas_ID(String sensorGas_ID) {
        this.sensorGas_ID = sensorGas_ID;
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

 
    public String getSensorName() {
        return this.sensorName;
    }
    
    public void setPoint(List<DataPointGas> points){
            this.points=points;
}
    
  
  public List<DataPointGas> getPoint(){
       return this.points;
}
    

    
}

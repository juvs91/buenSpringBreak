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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@XmlRootElement
public class SensorTemp implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sensorTemp_ID;
    private String sensorName;
    private String unit;
    
    @OneToMany(mappedBy = "sensorTemp_ID")
    private List<DataPointTemperature> points;
    
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
    
    public void setPoint(List<DataPointTemperature> points){
            this.points=points;
}
    
  
  public List<DataPointTemperature> getPoint(){
       return this.points;
}
    


  

   

    @Override
    public String toString() {
        return "entities.SensorTemp[ id=" + sensorTemp_ID + " ]";
    }
    
}

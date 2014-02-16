/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph.object;

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
public class SensorTemp implements Serializable {
    @Id 
    @GeneratedValue
    private Long sensorTemp_ID;
    private String sensorName;
    private String unit;
  
    
    @OneToMany(mappedBy = "sensorTemp_ID")
    private List<DataPointTemp> points;
    

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
    
    public void setPoint(List<DataPointTemp> points){
            this.points=points;
}
    
  
  public List<DataPointTemp> getPoint(){
       return this.points;
}
    

    
}

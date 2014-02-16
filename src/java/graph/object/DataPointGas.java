/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph.object;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author usuario
 */
    @Entity
public class DataPointGas implements Serializable,  InterfaceDataPoint{
  
    @Id 
    @GeneratedValue
    private Long dataPointGas_id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date time;
    private float value;
    @ManyToOne
    private SensorGas sensorGas_ID;
    
    public void setId(Long id){
        this.dataPointGas_id=id;
    }

    
    public Long get(){
        return this.dataPointGas_id;
    }

    @Override
    public void setDate(Date date) {
        this.time=date;
    }

  
    @Override
    public Date getDate() {
        return this.time;
    }

    @Override
    public void setValue(float value) {
        this.value=value;
    }

    @Override
    public float getValue() {
        return this.value;
    }

   
    

    
}

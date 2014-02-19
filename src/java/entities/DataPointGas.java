/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author usuario
 */
@Entity
public class DataPointGas implements InterfaceDataPoint{
    
    @Id 
    private int dataPointGas_id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date time;
    private float value;
    @ManyToOne
    private SensorGas sensorGas_ID;
    private int output_id;

    
    public void setId(int id){
        this.dataPointGas_id=id;
    }

    
    public int get(){
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
    
    
    public void setOutputId(int output_id) {
        this.output_id=output_id;
    }

   
    public int getOutputId() {
        return this.output_id;
    }
    
    
 
}

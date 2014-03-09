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
public class DataPoint implements InterfaceDataPoint{
    
    @Id 
    private int dataPoint_id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date time;
    private Double value;
    @ManyToOne
    private Sensor sensor_ID;
    private int output_id;

    
    public void setId(int id){
        this.dataPoint_id=id;
    }

    
    public int get(){
        return this.dataPoint_id;
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
    public void setValue(double value) {
        this.value=value;
    }

    @Override
    public double getValue() {
        return this.value;
    }
    
    
    public void setOutputId(int output_id) {
        this.output_id=output_id;
    }

   
    public int getOutputId() {
        return this.output_id;
    }
    
    
 
}

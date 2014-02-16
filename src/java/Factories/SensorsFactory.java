/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import entities.DataPointGas;
import entities.DataPointTemperature;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author usuario
 */
@Entity
@NamedQueries({})
public class SensorsFactory implements AbstractFactory {
    @Id
    private Integer sensorTag;

    @Override
    public DataPointGas createDataPointGas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DataPointTemperature createDataPointTemperature() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public <Collection>DataPointGas createGasPointsList(){
        
        return null;
    }

    
    public <Collection>DataPointTemperature createTemperaturePointsList(){
        
        return null;
    }

    public Integer getSensorTag() {
        return sensorTag;
    }

    public void setSensorTag(Integer sensorTag) {
        this.sensorTag = sensorTag;
    }
    
    
    
    
    
}

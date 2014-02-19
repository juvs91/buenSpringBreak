/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import entities.DataPointGas;
import entities.Outputs;
import entities.SensorGas;
import entities.SensorTags;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author usuario
 */
@Stateless
public class SensorsFactory  {
    @PersistenceContext
    EntityManager em;    
    public List<SensorGas> createSensors(){
        List<SensorGas> sensores  = new ArrayList<>(); 
        List<SensorTags> sensors = (List<SensorTags>) em.createNamedQuery("SensorTags.findAll").getResultList();

        for (SensorTags sen :  sensors){   
            SensorGas gas  = new SensorGas();
            //metemos el gas y la unidad de medida
            gas.setSensorGas_ID(sen.getSensorTag());
            gas.setSensorName(sen.getIdSensorCatalog().getIdSensorType().getSensorType());      
            gas.setUnit(sen.getIdMeasurementUnit().getUnitName());
            
            List<Outputs> outs = new ArrayList<>(sen.getOutputsCollection());
            
            //sacamos la lista
            List<DataPointGas> points = new ArrayList<>();
            
            for(Outputs out : outs){
                DataPointGas point = new DataPointGas();
                point.setOutputId(out.getIdOutput());
                point.setDate(out.getInsertDate());
                point.setValue(out.getOutputValue());
                points.add(point);
            }
            
            gas.setPoint(points);
            sensores.add(gas);
        }
        
        return sensores;
            
        
    }

  
    

    
    
    
    
    
}

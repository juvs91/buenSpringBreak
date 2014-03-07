/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import entities.DataPoint;
import entities.Outputs;
import entities.Sensor;
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

    public List<Sensor> createSensors(){
        List<Sensor> sensores  = new ArrayList<Sensor>(); 
        List<SensorTags> sensors = (List<SensorTags>) em.createNamedQuery("SensorTags.findAll").getResultList();

        for (SensorTags sen :  sensors){   
            Sensor gas  = new Sensor();
            //metemos el gas y la unidad de medida
            gas.setSensor_ID(sen.getSensorTag());
            gas.setSensorName(sen.getIdSensorCatalog().getIdSensorType().getSensorType());      
            gas.setUnit(sen.getIdMeasurementUnit().getUnitName());
            
            List<Outputs> outs = new ArrayList<>(sen.getOutputsCollection());
            
            //sacamos la lista

            List<DataPoint> points = new ArrayList<DataPoint>();
            int longitud =50;
            
            //points = outs.subList(0, 50);
            
            
            
            for(int i= 0; i < longitud && i < outs.size() ; i++){
                Outputs out = outs.get(i);
                DataPoint point = new DataPoint();
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

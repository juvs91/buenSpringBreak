/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import entities.DataPoint;
import entities.Sensorlist;
import entities.Sensor;
import entities.SensorTags;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
        List<Sensorlist> sensorsList = (List<Sensorlist>) em.createNamedQuery("Sensorlist.findAll").getResultList();

        for (Sensorlist sen :  sensorsList){   
            Sensor se  = new Sensor();
            //metemos el gas y la unidad de medida
            if(!(sen.getSensorTagsCollection().isEmpty())){
                List<SensorTags> sensorTags = new ArrayList<>(sen.getSensorTagsCollection());
                se.setSensorType(sensorTags.get(0).getIdSensorCatalog().getIdSensorType().getSensorType());
                se.setUnit(sensorTags.get(0).getIdMeasurementUnit().getUnitName());
                se.setSensorName(sensorTags.get(0).getSensorTag());
            }
            se.setSensorName1(sen.getSlName1());
            se.setSensorName2(sen.getSlName2());
            se.setSensorName3(sen.getSlName3());
         
            
            //sacamos la lista
            List<DataPoint> points = new ArrayList<DataPoint>();
            
            DataPoint point = new DataPoint();
            point.setDate(sen.getSlActualTimestamp());
            point.setValue(sen.getSlActualValue());
            points.add(point);
          
            
            se.setPoint(points);
            sensores.add(se);
        }
        
        return sensores;
            
        
    }

  
    
    
}

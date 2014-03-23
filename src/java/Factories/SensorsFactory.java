/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;


import entities.Sensor;
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
        String queryString = "select " + 
                "l.slId, l.slName1, l.slName2, l.slName3, " +
                "l.slActualTimestamp, l.slActualValue, t.sensor_tag, " +
                "t.sensor_id, c.id_sensor_catalog, y.sensor_type " +
                "from sensorlist l left join sensor_tags t on l.slId = t.sensor_id " +
                "left join sensor_catalog c on t.id_sensor_catalog = c.id_sensor_catalog " +
                "left join sensor_type y on c.id_sensor_type = y.id_sensor_type;";
        
        return em.createNativeQuery(queryString, entities.Sensor.class).getResultList();      
        //return resultList;
               
    }
    
}
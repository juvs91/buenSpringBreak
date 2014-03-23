/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import entities.Sensorlist;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 *
 * @author ccastillo
 */
@Stateless
public class SensorListFactory {
    @PersistenceContext 
    EntityManager em;
    
    public List<Sensorlist> createSensorList(){
        String query="SELECT sl.slId, sl.slName1, sl.slName2, sl.slName3, "
                + " sl.slInsertTimestamp, sl.slGMTOffset, sl.slActualTimestamp, "
                + "sl.slActualValue,  sl.slActualStatus FROM sensorlist sl"
                + " LEFT JOIN sensor_tags  st ON sl.slId = st.sensor_id "
                + " WHERE  st.sensor_id IS NULL";
          String query2="SELECT sl.slId, sl.slName1, sl.slName2, sl.slName3, "
                + " sl.slInsertTimestamp, sl.slGMTOffset, sl.slActualTimestamp, "
                + "sl.slActualValue,  sl.slActualStatus FROM sensorlist sl"
                + " LEFT JOIN sensor_tags  st ON sl.slId = st.sensor_id ";
          List resultList = em.createNativeQuery(query, entities.Sensorlist.class).getResultList();
        return resultList;
        
        
    }
    
}

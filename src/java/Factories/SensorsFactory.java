/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import entities.DataPoint;
import entities.Sensorlist;
import entities.Sensor;
import entities.SensorCatalog;
import entities.SensorCatalog_;
import entities.SensorTags;
import entities.SensorTags_;
import entities.SensorType;
import entities.Sensorlist_;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Stateless
public class SensorsFactory  {
    @PersistenceContext
    EntityManager em;    

    public List<SensorType> createSensors(){
        CriteriaBuilder builder = em.getCriteriaBuilder();
        List<Predicate> conditions = new ArrayList();
        CriteriaQuery<Object> query = builder.createQuery();
        
        //List<Sensorlist> sensorList = new ArrayList<Sensorlist>();
        //List<Sensorlist> sensorsList = (List<Sensorlist>) em.createNamedQuery("Sensorlist.findAll").getResultList();
        Root<Sensorlist> fromSensors = query.from(Sensorlist.class);
        Join<Sensorlist,SensorTags> joinSensorlistSensorTags = fromSensors.join(Sensorlist_.sensorTagsCollection);
        Join<SensorTags,SensorCatalog> joinSensorTagSensorCatalog = joinSensorlistSensorTags.join(SensorTags_.idSensorCatalog);
        Join<SensorCatalog,SensorType> joinSensorCatalogSensorType = joinSensorTagSensorCatalog.join(SensorCatalog_.idSensorType);
        conditions.add(builder.equal(joinSensorlistSensorTags.get("sensorId"), fromSensors.get("sensorTagsCollection")));
        //conditions.add(builder.equal(joinSensorlistSensorTags.get(""), fromSensors));
        
        
        TypedQuery result = em.createQuery(em.getCriteriaBuilder()
                .createQuery(Sensorlist.class)
                .select(fromSensors)
                .where()
                );
        
        System.out.println(result.getResultList());
        
        //System.out.println(joinSensorlistSensorTags);
        //System.out.println(joinSensorlistSensorTags.getCompoundSelectionItems().get(0));
        //Join<SensorTags,SensorCatalog> joinSensorTagSensorCatalog = joinSensorlistSensorTags.join("");
        
        /*for (Sensorlist sen :  sensorsList){   
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
        }*/
        
        return result.getResultList();
            
        
    }

  
    

    
    
    
    
    
}

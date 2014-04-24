/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataBaseManagers;
import entities.SensorTags;
import entities.SensorTagForm;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author usuario
 */
@Stateless
public class SensorTagFormBl {
    @PersistenceContext
    private EntityManager em;
    private SensorTagForm sensor;
    private SensorTags s;
    
    public SensorTagFormBl(){
    
    }
    
    public Object save(SensorTagForm sensor){
        this.s = new SensorTags();
        this.s = getSensor(sensor);
         try {
            em.persist(this.s);
         } catch (Exception e) {
            e.printStackTrace();
         }        
        return this.s;
    }
    public SensorTags edit(SensorTagForm sensor,String id){
        this.s = getSensor(sensor);
        SensorTags oldSensor = em.find(entities.SensorTags.class, id);
        oldSensor.fillAll(this.s);
         try {
            em.persist(oldSensor);
         } catch (Exception e) {
            e.printStackTrace();
         }    
        return oldSensor;
    }
    
    public SensorTags getSensor(SensorTagForm sensor){
        this.s = new SensorTags();
        s.setActive(true);
        s.setCommDeviceTag(em.find(entities.CommDeviceTags.class, sensor.getCommDeviceTag()));
        s.setIdMeasurementUnit(em.find(entities.MeasurementUnits.class, sensor.getIdMeasurementUnit()));
        s.setIdSensorCatalog(em.find(entities.SensorCatalog.class, sensor.getIdSensorCatalog()));
        s.setInsertDate(new Date());
        s.setLastUpdateDate(new Date());
        s.setMaxValue(sensor.getMaxValue());
        s.setMinValue(sensor.getMinValue());
        s.setSensorId(em.find(entities.Sensorlist.class, sensor.getSensorId()));
        s.setSensorTag(sensor.getSensorTag());
        s.setSensorTagsLogCollection(null);
        return s;
    }

  
    
    
}

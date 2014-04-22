/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataBaseManagers;
import entities.SensorTags;
import entities.SensorTagForm;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;


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
    private UserTransaction ux;
    private Transaction trans;
    
    public SensorTagFormBl(){
    
    }
    
    public Object save(SensorTagForm sensor){
        this.s = new SensorTags();
        this.s = getSensor(sensor);
        trans = new Transaction();
        return trans.save(sensor);
    }
    public void edit(SensorTagForm sensor,String id){
        this.s = getSensor(sensor);
        SensorTags oldSensor = em.find(entities.SensorTags.class, id);
        em.getTransaction().begin();
        oldSensor = this.s;
        em.getTransaction().commit();
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

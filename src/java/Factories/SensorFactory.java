/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import entities.Outputs;
import entities.SensorTags;
import graph.object.DataPointGas;
import graph.object.DataPointTemp;
import graph.object.SensorGas;
import graph.object.SensorTemp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ccastillo
 */
@Stateless
public class SensorFactory  {
        @PersistenceContext
    EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public String entro(){
        return "entro";
    }
       public SensorGas createSensorGas() {
           
             
        List<SensorTags> gases = (List<SensorTags>) em.createNamedQuery("SensorTags.findAll").getResultList();
        SensorTags sensorTags  = gases.get(0);    
        SensorGas gas  = new SensorGas();
        
        
        //metemos el gas y la unidad de medida
        gas.setSensorName(sensorTags.getIdSensorCatalog().getIdSensorType().getSensorType());      
        gas.setUnit(sensorTags.getIdMeasurementUnit().getUnitName());
        
        List<Outputs> outs = new ArrayList<Outputs>(sensorTags.getOutputsCollection());
        
        //sacamos la lista
        List<DataPointGas> points = new ArrayList<DataPointGas>();
        
        for(Outputs out : outs){
            DataPointGas point = new DataPointGas();
            point.setDate(out.getInsertDate());
            point.setValue(out.getOutputValue());
            points.add(point);
        }
        
        gas.setPoint(points);

        
    
        return gas;
     }
        
    

  
    public SensorTemp createSensorTemp() {
              
        List<SensorTags> sensors = (List<SensorTags>) em.createNamedQuery("SensorTags.findAll").getResultList();
        SensorTags sensorTags  = sensors.get(0);    
        SensorTemp temp  = new SensorTemp();
        
        
        //metemos el gas y la unidad de medida
        temp.setSensorName(sensorTags.getIdSensorCatalog().getIdSensorType().getSensorType());      
        temp.setUnit(sensorTags.getIdMeasurementUnit().getUnitName());
        
        List<Outputs> outs = new ArrayList<Outputs>(sensorTags.getOutputsCollection());
        
        //sacamos la lista
        List<DataPointTemp> points = new ArrayList<DataPointTemp>();
        
        for(Outputs out : outs){
            DataPointTemp point = new DataPointTemp();
            point.setDate(out.getInsertDate());
            point.setValue(out.getOutputValue());
            points.add(point);
        }
        
        temp.setPoint(points);

        
    
        return temp;
    }

}

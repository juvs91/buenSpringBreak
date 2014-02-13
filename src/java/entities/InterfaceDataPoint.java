/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.sql.Timestamp;



/**
 *
 * @author usuario
 */
public interface InterfaceDataPoint {
 
    
    public void setTimeStamp(Timestamp time);
    public Timestamp getTimeStamp();
    public void setValue(float value);
    public float getValue();
    public void setIdOutput(int idOutput);
    public int getIdOutput();
    public void setTag(int tag);
    public int getTag();
    public void setUnit(String unit);
    public String getUnit();//unidad de medida
    public void setSensorName(String SensorName);
    public String getSensorName();

  
    
}

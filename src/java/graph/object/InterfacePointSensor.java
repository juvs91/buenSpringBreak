/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph.object;

import java.util.Date;
import java.util.List;

public interface InterfacePointSensor {
 
    
    public void setDateList(List<Date>  dates);
    public List<Date> getDateList();
    public void setValueList(List<Float> values);
    public List<Float> getValueList();
    public void setUnit(String unit);
    public String getUnit();//unidad de medida
    public void setSensorName(String SensorName);
    public String getSensorName();

  
    
}